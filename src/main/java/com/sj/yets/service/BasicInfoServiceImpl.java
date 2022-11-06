package com.sj.yets.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.sj.yets.api.model.*;
import com.sj.yets.repository.entity.HumanDeductionEntity;
import com.sj.yets.repository.entity.IncomeDeductionEntity;
import com.sj.yets.repository.entity.TaxCreditEntity;
import org.springframework.stereotype.Service;

import com.sj.yets.repository.entity.BasicInfoEntity;
import com.sj.yets.repository.mybatis.*;
import com.sj.yets.service.vo.BasicInfoVO;

import static java.lang.Integer.min;
import static java.lang.Math.max;

@Service
public class BasicInfoServiceImpl implements BasicInfoService{

	private final BasicInfoRepositoryDAO basicInfoDAO;
	private final HumanDeductionRepositoryDAO humanDeductionDAO;
	private final IncomeDeductionRepositoryDAO incomeDeductionDAO;
	private final TaxCreditRepositoryDAO taxCreditDAO;
	private final VOMapper voMapper;

	private final int HOUSING_DEDUCTION_LIMIT = 4000000;
	private final int PRIVATE_PENSION_SAVING_LIMIT = 720000;
	private final int HOUSING_SAVING_LIMIT = 2400000;


	public BasicInfoServiceImpl(BasicInfoRepositoryDAO basicInfoDAO,
								HumanDeductionRepositoryDAO humanDeductionDAO,
								IncomeDeductionRepositoryDAO incomeDeductionDAO,
								TaxCreditRepositoryDAO taxCreditDAO,
								VOMapper voMapper) {
		this.basicInfoDAO = basicInfoDAO;
		this.humanDeductionDAO = humanDeductionDAO;
		this.incomeDeductionDAO = incomeDeductionDAO;
		this.taxCreditDAO = taxCreditDAO;
        this.voMapper = voMapper;
    }
	
	@Override
	public List<BasicInfoVO> getBasicInfo() {
		// TODO Auto-generated method stub
		List<BasicInfoVO> result = new ArrayList<>();
		
		for(BasicInfoEntity basicInfoEntity : basicInfoDAO.getBasicInfo()) {
			System.out.println(basicInfoEntity.getJumin());
			result.add(voMapper.toBasicInfoVO(basicInfoEntity));
			System.out.println(voMapper.toBasicInfoVO(basicInfoEntity).getJumin());
			
			
		}
		
		
		
		// result에 결과 담는 쿼리 실행
		return result;
	}

	@Override
	public void insertBasicInfo(BasicInfoDTO basicInfoDTO) {
		basicInfoDAO.insertBasicInfo(basicInfoDTO);
		// insert query 실행
	}

	@Override
	public void deleteBasicInfo(BasicInfoDTO basicInfoDTO) {
		basicInfoDAO.deleteBasicInfo(basicInfoDTO);
	}

	@Override
	public List<BasicInfoVO> getBasicInfoByParam(String name, String jumin) {
		List<BasicInfoVO> result = new ArrayList<>();
		
		for(BasicInfoEntity basicInfoEntity : basicInfoDAO.getBasicInfoByParam(name, jumin)) {
			System.out.println(basicInfoEntity.getJumin());
			result.add(voMapper.toBasicInfoVO(basicInfoEntity));
			System.out.println(voMapper.toBasicInfoVO(basicInfoEntity).getJumin());
		}
		
		return result;
	}

	@Override
	public void calculateYets(String name, String jumin) {


		// 0. 입력한 기본정보들 DB조회
		List<BasicInfoEntity> basicInfoEntityList = basicInfoDAO.getBasicInfoByParam(name, jumin);
		List<HumanDeductionEntity> HumanDeductionEntityList = humanDeductionDAO.getHumanDeductionByParam(jumin);
		List<IncomeDeductionEntity> incomeDeductionEntityList = incomeDeductionDAO.getIncomeDeduction(jumin);
		List<TaxCreditEntity> taxCreditEntityList = taxCreditDAO.getTaxCredit(jumin);

		if (basicInfoEntityList.isEmpty() || HumanDeductionEntityList.isEmpty() || incomeDeductionEntityList.isEmpty() || taxCreditEntityList.isEmpty()) {
			System.out.println("기본 정보에 빈값이 있습니다.");
		}


		BasicInfoEntity basicInfoEntity = basicInfoEntityList.get(0);
		HumanDeductionEntity humanDeductionEntity = HumanDeductionEntityList.get(0);
		IncomeDeductionEntity incomeDeductionEntity = incomeDeductionEntityList.get(0);
		TaxCreditEntity taxCreditEntity = taxCreditEntityList.get(0);


		// 데이터 저장용 DTO
		BasicInfoDTO basicInfoDTO = new BasicInfoDTO();
		HumanDeductionDTO humanDeductionDTO = new HumanDeductionDTO();
		IncomeDeductionDTO incomeDeductionDTO = new IncomeDeductionDTO();
		TaxCreditDTO taxCreditDTO = new TaxCreditDTO();
		YetsResultDTO yetsResultDTO = new YetsResultDTO();


		// 1. 총급여 (입력값)
		int totalIncome = basicInfoEntity.getTotalIncome();
		System.out.println("1. 총급여 (입력값) : " + totalIncome);

		// 2. 근로소득금액  (총급여 - 근로소득공제)
		int labourIncome = 0;
		int labourIncomeDeduction = 0;

		List<BasicInfoEntity> taxRateInfoList = basicInfoDAO.getTaxRateInfo("RATE01");
		for (BasicInfoEntity rateInfo : taxRateInfoList) {
			if (totalIncome > rateInfo.getLeftLimit() && totalIncome <= rateInfo.getRightLimit()) {
				BigDecimal diff = new BigDecimal(totalIncome - rateInfo.getLeftLimit());
				labourIncomeDeduction = rateInfo.getBaseAmount() + rateInfo.getSectionRate().multiply(diff).intValue();
				System.out.println("2. baseAmount : " + rateInfo.getBaseAmount());
				System.out.println("2. diff : " + diff);
				System.out.println("2. diff : " + rateInfo.getSectionRate());
				System.out.println("2. diff : " + rateInfo.getSectionRate().multiply(diff).intValue());

				break;
			}
		}
		labourIncome = totalIncome - labourIncomeDeduction;
		System.out.println("2. 근로소득공제금액 : " + labourIncomeDeduction);
		System.out.println("2. 근로소득금액 : " + labourIncome);

		//2.end 결과값 저장
		basicInfoDTO.setLabourIncome(labourIncome);


		// 3. 과세표준 (근로소득금액 - 소득공제 합산)
		int taxBase = 0; //과세표준
		int incomeDeduction = 0; //소득공제합산

		// 3-1. 인적공제
		int humanDeduction = 0;
		int basicHumanDeductionAmount =
				humanDeductionEntity.getMyself() * 1500000
						+ ("Y".equals(humanDeductionEntity.getSpouseYn()) ? 1500000 : 0)
						+ (humanDeductionEntity.getChildren() + humanDeductionEntity.getExceptChildren() + humanDeductionEntity.getParents() + humanDeductionEntity.getSibling()) * 1500000;
		int additionalHumanDeductionAmount =
				humanDeductionEntity.getSeniority() * 1000000
						+ humanDeductionEntity.getDisabled() * 2000000
						+ humanDeductionEntity.getWomen() * 500000;
		;
		humanDeduction = basicHumanDeductionAmount + additionalHumanDeductionAmount;

		// 소득공제에 인적공제 합산
		incomeDeduction += humanDeduction;
		System.out.println("3-1. 기본인적공제 : " + basicHumanDeductionAmount);
		System.out.println("3-1. 추가인적공제 : " + additionalHumanDeductionAmount);
		System.out.println("3-1. 인적공제합 : " + humanDeduction);

		// 3-1.end 결과저장
		yetsResultDTO.setBasicHumanDeductionAmount(basicHumanDeductionAmount);
		yetsResultDTO.setAdditionalHumanDeductionAmount(additionalHumanDeductionAmount);

		// 3-2. 연금보험공제-국민연금
		int nationalPension = incomeDeductionEntity.getNationalPension();

		// 소득공제에 합산
		incomeDeduction += nationalPension;
		System.out.println("3-2. 국민연금 : " + nationalPension);

		//3-2.end 결과저장
		yetsResultDTO.setNationalPensionAmount(nationalPension);


		// 3-3. 건강보험, 고용보험
		int healthInsurance = incomeDeductionEntity.getHealthInsurance();
		int employmentInsurance = incomeDeductionEntity.getEmploymentInsurance();

		// 소득공제에 합산
		incomeDeduction += healthInsurance + employmentInsurance;
		System.out.println("3-3. 건강보험 : " + healthInsurance);
		System.out.println("3-3. 고용보험 : " + employmentInsurance);

		//3-3.end 결과저장
		yetsResultDTO.setHealthInsuranceAmount(healthInsurance);
		yetsResultDTO.setEmploymentInsuranceAmount(employmentInsurance);


		// 3-4. 주택차입금
		int mortgageLoan = incomeDeductionEntity.getMortgageLoan();
		int mortgageLoanAmount = 0;
		int housingDeductionLimit = HOUSING_DEDUCTION_LIMIT;

		mortgageLoanAmount = min((mortgageLoan * 4 / 10), housingDeductionLimit);


		System.out.println("3-4. 주택차임금 : " + mortgageLoan);
		System.out.println("3-4. 주택차임금 공제금액 : " + mortgageLoanAmount);
		System.out.println("3-4. 주택관련공제한도 : " + housingDeductionLimit);
		housingDeductionLimit -= mortgageLoanAmount;
		System.out.println("3-4. 주택관련공제 잔여한도 : " + housingDeductionLimit);

		// 소득공제 합산
		incomeDeduction += mortgageLoanAmount;

		// 3-4.end 결과저장
		yetsResultDTO.setMortgageLoanAmount(mortgageLoanAmount);
		yetsResultDTO.setMortgageLoanLimit(housingDeductionLimit == 0 ? HOUSING_DEDUCTION_LIMIT : 0);

		// 3-5. 개인연금저축
		int privatePensionSaving = incomeDeductionEntity.getPrivatePensionSaving();
		int privatePensionSavingAmount = 0;
		int privatePensionSavingLimit = PRIVATE_PENSION_SAVING_LIMIT;

		privatePensionSavingAmount = min((privatePensionSaving * 4 / 10), privatePensionSavingLimit);


		System.out.println("3-5. 개인염금저축액 : " + privatePensionSaving);
		System.out.println("3-5. 개인염금저축액 공제금액 : " + privatePensionSavingAmount);
		System.out.println("3-5. 개인염금저축액 공제한도 : " + privatePensionSavingLimit);
		privatePensionSavingLimit -= privatePensionSavingAmount;
		System.out.println("3-5. 개인염금저축액 잔여한도 : " + privatePensionSavingLimit);

		// 소득공제 합산
		incomeDeduction += privatePensionSavingAmount;

		// 3-5.end 결과저장
		yetsResultDTO.setPrivatePensionSavingAmount(privatePensionSavingAmount);
		yetsResultDTO.setPrivatePensionSavingLimit(PRIVATE_PENSION_SAVING_LIMIT);


		// 3-6. 주택마련저축(청약저축)
		// 총급여 7천 이하만 적용
		int houseSavingAmount = 0;
		if (totalIncome <= 70000000) {


			int houseSaving = incomeDeductionEntity.getPrivatePensionSaving();
			int houseSavingLimit = HOUSING_SAVING_LIMIT;
			houseSaving = min(houseSaving, houseSavingLimit);
			houseSavingAmount = houseSaving * 4 / 10;

			houseSavingAmount = min(houseSavingAmount, housingDeductionLimit);

			System.out.println("3-6. 주택마련 인정저축액(240한도) : " + houseSaving);
			System.out.println("3-6. 주택관련 잔여 공제한도 : " + housingDeductionLimit);
			System.out.println("3-6. 주택마련 공제금액 : " + houseSavingAmount);

			// 소득공제 합산
			incomeDeduction += houseSavingAmount;

			// 3-6.end 결과저장
			yetsResultDTO.setHousingSavingAmount(houseSavingAmount);
			yetsResultDTO.setHousingSavingLimit(housingDeductionLimit);

		}

		// 3-7. 신용카드 등 사용금액
		int creditCardEtcAmount = 0;
		int creditCardEtcLimit = 0;
		int creditCardEtcAmountPossible = 0;
		int creditCardEtcAmountTotal = 0;
		int creditCardEtcAmountExcept = 0;
		int creditCardEtcLimitExceed = 0;
		int cultureAdditionalAmount = 0;
		int marketAdditionalAmount = 0;
		int transportAdditionalAmount = 0;

		int creditCard = incomeDeductionEntity.getCreditCard();
		int debitCard = incomeDeductionEntity.getDebitCard();
		int cash = incomeDeductionEntity.getCash();
		int creditCardCulture = incomeDeductionEntity.getCreditCardCulture();
		int debitCardCulture = incomeDeductionEntity.getDebitCardCulture();
		int cashCulture = incomeDeductionEntity.getCashCulture();
		int traditionalMarket = incomeDeductionEntity.getTraditionalMarket();
		int publicTransport = incomeDeductionEntity.getPublicTransport();

		int consumptionSum = creditCard + debitCard + cash + creditCardCulture + debitCardCulture + cashCulture + traditionalMarket + publicTransport;
		int minConsumptionAmount = totalIncome >= 15000000 ? totalIncome / 4 : totalIncome / 5;

		if (consumptionSum < minConsumptionAmount) {
			creditCardEtcAmount = 0;
		} else {
			//3.7 신용카드 등 소득공제한도
			taxRateInfoList = basicInfoDAO.getTaxRateInfo("RATE02");
			for (BasicInfoEntity rateInfo : taxRateInfoList) {
				if (totalIncome > rateInfo.getLeftLimit() && totalIncome <= rateInfo.getRightLimit()) {
					creditCardEtcLimit = min(rateInfo.getBaseAmount(), totalIncome * 2 / 10);
					break;
				}
			}
			System.out.println("3-7. 신용카드 등 소득공제한도 : " + creditCardEtcLimit);

			//3.7 공제가능금액 = 공제대상금액 - 공제제외금액
			//공제대상금액
			int sum_15per = creditCard;
			int sum_30per = debitCard + cash + creditCardCulture + debitCardCulture + cashCulture;
			int sum_40per = traditionalMarket + publicTransport;
			creditCardEtcAmountTotal = sum_15per * 15 / 100
					+ sum_30per * 3 / 10
					+ sum_40per * 4 / 10;
			System.out.println("3-7. 공제대상금액 : " + creditCardEtcAmountTotal);

			//공제제외금액
			if (minConsumptionAmount <= sum_15per) {
				creditCardEtcAmountExcept = minConsumptionAmount * 15 / 100;
			} else if (minConsumptionAmount <= sum_30per) {
				creditCardEtcAmountExcept = sum_15per * 15 / 100 + (minConsumptionAmount - sum_15per) * 30 / 100;
			} else {
				creditCardEtcAmountExcept = sum_15per * 15 / 100
						+ sum_30per * 3 / 10
						+ (minConsumptionAmount - sum_15per - sum_30per) * 40 / 100;
			}
			System.out.println("3-7. 공제제외금액 : " + creditCardEtcAmountExcept);


			creditCardEtcAmountPossible = creditCardEtcAmountTotal - creditCardEtcAmountExcept;
			System.out.println("3-7. 공제가능금액 : " + creditCardEtcAmountPossible);
		}

		//공제한도 초과금액
		if (creditCardEtcLimit < creditCardEtcAmountPossible) {
			creditCardEtcLimitExceed = creditCardEtcAmountPossible - creditCardEtcLimit;
			System.out.println("3-7. 한도초과액 : " + creditCardEtcLimitExceed);
			int cultureSum = creditCardCulture + debitCardCulture + cashCulture;
			cultureAdditionalAmount = min(min(creditCardEtcLimitExceed, cultureSum * 3 / 10), 1000000);
			marketAdditionalAmount = min(min(creditCardEtcLimitExceed - cultureAdditionalAmount, traditionalMarket * 4 / 10), 1000000);
			transportAdditionalAmount = min(min(creditCardEtcLimitExceed - cultureAdditionalAmount - marketAdditionalAmount, publicTransport * 4 / 10), 1000000);

			System.out.println("3-7. 추가공제-도서 : " + cultureAdditionalAmount);
			System.out.println("3-7. 추가공제-시장: " + marketAdditionalAmount);
			System.out.println("3-7. 추가공제-교통: " + transportAdditionalAmount);
		} else {
			System.out.println("3-7. 한도초과액 : " + creditCardEtcLimitExceed);
			System.out.println("3-7. 추가공제-없음");
		}

		creditCardEtcAmount = min(creditCardEtcAmountPossible, creditCardEtcLimit)
				+ cultureAdditionalAmount
				+ marketAdditionalAmount
				+ transportAdditionalAmount;

		System.out.println("3-7. 신용카드등 소득공제액 : " + creditCardEtcAmount);

		// 소득공제에 합산
		incomeDeduction += creditCardEtcAmount;

		//3-7.end 결과저장
		yetsResultDTO.setCreditCardEtcAmount(creditCardEtcAmount);
		yetsResultDTO.setCreditCardEtcLimit(creditCardEtcLimit);



		// 4. 과세표준
		int incomeDeductionTotalExceedSum = mortgageLoanAmount + houseSavingAmount + creditCardEtcAmount;
		int incomeDeductionTotalExceed = incomeDeductionTotalExceedSum >= 25000000 ? incomeDeductionTotalExceedSum - 25000000 : 0;
		System.out.println("4. 종합소득 한도초과액 : " + incomeDeductionTotalExceed);

		taxBase = labourIncome - incomeDeduction + incomeDeductionTotalExceed;
		System.out.println("4. 과세표준 : " + taxBase);

		// 4.end 과세표준 저장
		basicInfoDTO.setTaxBase(taxBase);

		// 5. 산출세액 구간세율 계산
		int calculatedTax = 0;
		taxRateInfoList = basicInfoDAO.getTaxRateInfo("RATE03");
		for (BasicInfoEntity rateInfo : taxRateInfoList) {
			if (taxBase > rateInfo.getLeftLimit() && taxBase <= rateInfo.getRightLimit()) {
				BigDecimal diff = new BigDecimal(taxBase - rateInfo.getLeftLimit());
				calculatedTax = rateInfo.getBaseAmount() + rateInfo.getSectionRate().multiply(diff).intValue();
				break;
			}

			//rateInfo.getLeftLimit()의 DB최대 입력값이 20억이라서 임시방편 ^^;
			if(taxBase > 200000000) {
				calculatedTax = 384600000 + (taxBase - 100000000) * 45 / 100;
			}
		}

		//5.end 결과저장
		basicInfoDTO.setCalculatedTax(calculatedTax);
		System.out.println("5. 산출세액 : " + calculatedTax);

		// 6. 결정세액 (산출세액 - 세액공제 합산)
		int taxCreditSum = 0;
		int determinedTax = 0;

		// 6-1. 근로소득세액공제
		int labourIncomeTaxCredit = 0;
		int labourIncomeTaxCreditLimit = 0;

		if(totalIncome <= 33000000) {
			labourIncomeTaxCreditLimit = 740000;
		} else if(totalIncome <= 70000000) {
			labourIncomeTaxCreditLimit = max(740000 - (totalIncome - 33000000) * 8/1000, 660000);
		} else {
			labourIncomeTaxCreditLimit = max(660000 - (totalIncome - 70000000) / 2, 500000);
		}

		if(calculatedTax <= 1300000) {
			labourIncomeTaxCredit = calculatedTax * 55 / 100;
		} else {
			labourIncomeTaxCredit = 715000 + (calculatedTax - 1300000) * 3 / 10;
		}

		labourIncomeTaxCredit = min(labourIncomeTaxCredit, labourIncomeTaxCreditLimit);
		System.out.println("6-1. 근로소득세액한도 : " + labourIncomeTaxCreditLimit);
		System.out.println("6-1. 근로소득세액공제 : " + labourIncomeTaxCredit);

		// 6-1.end 결과저장
		yetsResultDTO.setLabourIncomeTaxCreditAmount(labourIncomeTaxCredit);
		yetsResultDTO.setLabourIncomeTaxCreditLimit(labourIncomeTaxCreditLimit);
		taxCreditSum += labourIncomeTaxCredit;

		// 6-2 자녀세액공제
		int childrenNumber = taxCreditEntity.getChildrenTaxCreditNumber();
		int birthFirst = taxCreditEntity.getBirthFirst();
		int birthSecond = taxCreditEntity.getBirthSecond();
		int birthThirdUp = taxCreditEntity.getBirthThirdUp();

		int basicChildrenTaxCredit = 0;
		int additionalChildrenTaxCredit = 0;
		System.out.println("childrenNumber : " + childrenNumber);
		if(childrenNumber <= 2) {
			basicChildrenTaxCredit = 150000 * childrenNumber;
		}else{
			basicChildrenTaxCredit = 300000 + 300000 * (childrenNumber - 2);
		}

		additionalChildrenTaxCredit = 300000 * birthFirst + 500000 * birthSecond + 700000 * birthThirdUp;

		System.out.println("6-2. 자녀세액공제 기본공제 : " + basicChildrenTaxCredit);
		System.out.println("6-2. 자녀세액공제 추가공제 : " + additionalChildrenTaxCredit);

		//6-2.end 결과저장
		yetsResultDTO.setChildrenTaxCreditAmount(basicChildrenTaxCredit + additionalChildrenTaxCredit);
		taxCreditSum += basicChildrenTaxCredit + additionalChildrenTaxCredit;

		// 6-3. 보장성보험료
		int lifeInsurance = taxCreditEntity.getLifeInsurance();
		lifeInsurance = min(lifeInsurance, 1000000);
		int lifeInsuranceAmount = lifeInsurance * 12 / 100;

		System.out.println("6-3. 보장성보험료 : " + lifeInsuranceAmount);

		// 6-3.end 결과저장
		yetsResultDTO.setLifeInsuranceAmount(lifeInsuranceAmount);
		taxCreditSum += lifeInsuranceAmount;


		// 6-4. 의료비
		int medicalExpensesAmount = 0;

		int medicalInfertility = taxCreditEntity.getMedicalInfertility();
		int medicalPremie = taxCreditEntity.getMedicalPremie();
		int medicalSpecial = taxCreditEntity.getMedicalSpecial();
		int medicalGeneral = taxCreditEntity.getMedicalGeneral();
		int actualMedicalExpenses = taxCreditEntity.getActualMedicalExpenses();

		int minMedicalExpense = totalIncome * 3 / 100 + actualMedicalExpenses;
		System.out.println("6-4. 의료비 최저사용금액 : " + minMedicalExpense);

		int minMedicalExpenseRemain = minMedicalExpense;
		int medicalInfertilityRemain = medicalInfertility;
		int medicalPremieRemain = medicalPremie;
		int medicalSpecialRemain = medicalSpecial;
		int medicalGeneralRemain = medicalGeneral;

		int tmpVal;
		tmpVal = min(minMedicalExpenseRemain, medicalGeneralRemain);
		minMedicalExpenseRemain -= tmpVal;
		medicalGeneralRemain -= tmpVal;
		medicalGeneralRemain = min(medicalGeneralRemain, 7000000); //700만원 한도

		tmpVal= min(minMedicalExpenseRemain, medicalSpecialRemain);
		minMedicalExpenseRemain -= tmpVal;
		medicalSpecialRemain -= tmpVal;

		tmpVal= min(minMedicalExpenseRemain, medicalPremieRemain);
		minMedicalExpenseRemain -= tmpVal;
		medicalPremieRemain -= tmpVal;

		tmpVal= min(minMedicalExpenseRemain, medicalInfertilityRemain);
		minMedicalExpenseRemain -= tmpVal;
		medicalInfertilityRemain -= tmpVal;

		medicalExpensesAmount = (medicalGeneralRemain + medicalSpecialRemain) * 15 / 100 + medicalPremieRemain * 20 / 100 + medicalInfertilityRemain * 30 /100;
		System.out.println("6-4. 의료비 공제대상금액 : " + medicalGeneralRemain + medicalSpecialRemain + medicalPremieRemain + medicalInfertilityRemain);
		System.out.println("6-4. 의료비 세액공제액 : " + medicalExpensesAmount);

		//6-4.end 결과저장
		yetsResultDTO.setMedicalExpensesAmount(medicalExpensesAmount);
		taxCreditSum += medicalExpensesAmount;


		// 7. 결정세액
		determinedTax = calculatedTax - taxCreditSum;
		basicInfoDTO.setDeterminedTax(determinedTax);
		basicInfoDTO.setTaxPayable(determinedTax - basicInfoEntity.getPaidTax());


		// 6. 최종결과 저장
		basicInfoDAO.updateBasicInfo(jumin, basicInfoDTO);

		incomeDeductionDAO.deleteIncomeDeductionAmount(jumin);
		incomeDeductionDAO.insertIncomeDeductionAmount(jumin, yetsResultDTO);

		taxCreditDAO.deleteTaxCreditAmount(jumin);
		taxCreditDAO.insertTaxCreditAmount(jumin, yetsResultDTO);

		incomeDeductionDAO.deleteIncomeDeductionLimit(jumin);
		incomeDeductionDAO.insertIncomeDeductionLimit(jumin, yetsResultDTO);

		taxCreditDAO.deleteTaxCreditLimit(jumin);
		taxCreditDAO.insertTaxCreditLimit(jumin, yetsResultDTO);
	}


}
