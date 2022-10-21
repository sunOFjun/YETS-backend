package com.sj.yets.service;

import com.sj.yets.repository.entity.BasicInfoEntity;
import com.sj.yets.repository.entity.HumanDeductionEntity;
import com.sj.yets.repository.entity.IncomeDeductionEntity;
import com.sj.yets.repository.entity.TaxCreditEntity;
import com.sj.yets.repository.entity.YetsResultEntity;
import com.sj.yets.service.vo.BasicInfoVO;
import com.sj.yets.service.vo.HumanDeductionVO;
import com.sj.yets.service.vo.IncomeDeductionVO;
import com.sj.yets.service.vo.TaxCreditVO;
import com.sj.yets.service.vo.YetsResultVO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-21T01:04:29+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0-262 (OpenLogic-OpenJDK)"
)
@Component
public class VOMapperImpl implements VOMapper {

    @Override
    public BasicInfoVO toBasicInfoVO(BasicInfoEntity entity) {
        if ( entity == null ) {
            return null;
        }

        BasicInfoVO basicInfoVO = new BasicInfoVO();

        basicInfoVO.setName( entity.getName() );
        basicInfoVO.setJumin( entity.getJumin() );
        basicInfoVO.setTotalIncome( entity.getTotalIncome() );
        basicInfoVO.setPaidTax( entity.getPaidTax() );
        basicInfoVO.setLabourIncome( entity.getLabourIncome() );
        basicInfoVO.setTaxBase( entity.getTaxBase() );
        basicInfoVO.setCalculatedTax( entity.getCalculatedTax() );
        basicInfoVO.setDeterminedTax( entity.getDeterminedTax() );
        basicInfoVO.setTaxPayable( entity.getTaxPayable() );
        basicInfoVO.setCode( entity.getCode() );
        basicInfoVO.setCodeName( entity.getCodeName() );
        basicInfoVO.setLeftLimit( entity.getLeftLimit() );
        basicInfoVO.setRightLimit( entity.getRightLimit() );
        basicInfoVO.setSectionRate( entity.getSectionRate() );
        basicInfoVO.setRate( entity.getRate() );
        basicInfoVO.setBaseAmount( entity.getBaseAmount() );
        basicInfoVO.setPriority( entity.getPriority() );

        return basicInfoVO;
    }

    @Override
    public HumanDeductionVO toHumanDeductionVO(HumanDeductionEntity entity) {
        if ( entity == null ) {
            return null;
        }

        HumanDeductionVO humanDeductionVO = new HumanDeductionVO();

        humanDeductionVO.setJumin( entity.getJumin() );
        humanDeductionVO.setMyself( entity.getMyself() );
        humanDeductionVO.setSpouseYn( entity.getSpouseYn() );
        humanDeductionVO.setParents( entity.getParents() );
        humanDeductionVO.setChildren( entity.getChildren() );
        humanDeductionVO.setExceptChildren( entity.getExceptChildren() );
        humanDeductionVO.setSibling( entity.getSibling() );
        humanDeductionVO.setSeniority( entity.getSeniority() );
        humanDeductionVO.setDisabled( entity.getDisabled() );
        humanDeductionVO.setWomen( entity.getWomen() );

        return humanDeductionVO;
    }

    @Override
    public IncomeDeductionVO toIncomeDeductionVO(IncomeDeductionEntity entity) {
        if ( entity == null ) {
            return null;
        }

        IncomeDeductionVO incomeDeductionVO = new IncomeDeductionVO();

        incomeDeductionVO.setJumin( entity.getJumin() );
        incomeDeductionVO.setNationalPension( entity.getNationalPension() );
        incomeDeductionVO.setHealthInsurance( entity.getHealthInsurance() );
        incomeDeductionVO.setEmploymentInsurance( entity.getEmploymentInsurance() );
        incomeDeductionVO.setMortgageLoan( entity.getMortgageLoan() );
        incomeDeductionVO.setPrivatePensionSaving( entity.getPrivatePensionSaving() );
        incomeDeductionVO.setHousingSaving( entity.getHousingSaving() );
        incomeDeductionVO.setCreditCard( entity.getCreditCard() );
        incomeDeductionVO.setDebitCard( entity.getDebitCard() );
        incomeDeductionVO.setCash( entity.getCash() );
        incomeDeductionVO.setCreditCardCulture( entity.getCreditCardCulture() );
        incomeDeductionVO.setDebitCardCulture( entity.getDebitCardCulture() );
        incomeDeductionVO.setCashCulture( entity.getCashCulture() );
        incomeDeductionVO.setTraditionalMarket( entity.getTraditionalMarket() );
        incomeDeductionVO.setPublicTransport( entity.getPublicTransport() );

        return incomeDeductionVO;
    }

    @Override
    public YetsResultVO toYetsResultVO(YetsResultEntity entity) {
        if ( entity == null ) {
            return null;
        }

        YetsResultVO yetsResultVO = new YetsResultVO();

        yetsResultVO.setJumin( entity.getJumin() );
        yetsResultVO.setBasicHumanDeductionAmount( entity.getBasicHumanDeductionAmount() );
        yetsResultVO.setAdditionalHumanDeductionAmount( entity.getAdditionalHumanDeductionAmount() );
        yetsResultVO.setNationalPensionAmount( entity.getNationalPensionAmount() );
        yetsResultVO.setHealthInsuranceAmount( entity.getHealthInsuranceAmount() );
        yetsResultVO.setEmploymentInsuranceAmount( entity.getEmploymentInsuranceAmount() );
        yetsResultVO.setMortgageLoanAmount( entity.getMortgageLoanAmount() );
        yetsResultVO.setPrivatePensionSavingAmount( entity.getPrivatePensionSavingAmount() );
        yetsResultVO.setHousingSavingAmount( entity.getHousingSavingAmount() );
        yetsResultVO.setCreditCardEtcAmount( entity.getCreditCardEtcAmount() );
        yetsResultVO.setBasicHumanDeductionLimit( entity.getBasicHumanDeductionLimit() );
        yetsResultVO.setAdditionalHumanDeductionLimit( entity.getAdditionalHumanDeductionLimit() );
        yetsResultVO.setNationalPensionLimit( entity.getNationalPensionLimit() );
        yetsResultVO.setHealthInsuranceLimit( entity.getHealthInsuranceLimit() );
        yetsResultVO.setEmploymentInsuranceLimit( entity.getEmploymentInsuranceLimit() );
        yetsResultVO.setMortgageLoanLimit( entity.getMortgageLoanLimit() );
        yetsResultVO.setPrivatePensionSavingLimit( entity.getPrivatePensionSavingLimit() );
        yetsResultVO.setHousingSavingLimit( entity.getHousingSavingLimit() );
        yetsResultVO.setCreditCardEtcLimit( entity.getCreditCardEtcLimit() );
        yetsResultVO.setLabourIncomeTaxCreditAmount( entity.getLabourIncomeTaxCreditAmount() );
        yetsResultVO.setChildrenTaxCreditAmount( entity.getChildrenTaxCreditAmount() );
        yetsResultVO.setLifeInsuranceAmount( entity.getLifeInsuranceAmount() );
        yetsResultVO.setMedicalExpensesAmount( entity.getMedicalExpensesAmount() );
        yetsResultVO.setStandardTaxCredit( entity.getStandardTaxCredit() );
        yetsResultVO.setLabourIncomeTaxCreditLimit( entity.getLabourIncomeTaxCreditLimit() );
        yetsResultVO.setChildrenTaxCreditLimit( entity.getChildrenTaxCreditLimit() );
        yetsResultVO.setLifeInsuranceLimit( entity.getLifeInsuranceLimit() );
        yetsResultVO.setMedicalExpensesLimit( entity.getMedicalExpensesLimit() );

        return yetsResultVO;
    }

    @Override
    public TaxCreditVO toTaxCreditVO(TaxCreditEntity entity) {
        if ( entity == null ) {
            return null;
        }

        TaxCreditVO taxCreditVO = new TaxCreditVO();

        taxCreditVO.setJumin( entity.getJumin() );
        taxCreditVO.setChildrenTaxCreditNumber( entity.getChildrenTaxCreditNumber() );
        taxCreditVO.setBirthFirst( entity.getBirthFirst() );
        taxCreditVO.setBirthSecond( entity.getBirthSecond() );
        taxCreditVO.setBirthThirdUp( entity.getBirthThirdUp() );
        taxCreditVO.setLifeInsurance( entity.getLifeInsurance() );
        taxCreditVO.setMedicalInfertility( entity.getMedicalInfertility() );
        taxCreditVO.setMedicalPremie( entity.getMedicalPremie() );
        taxCreditVO.setMedicalSpecial( entity.getMedicalSpecial() );
        taxCreditVO.setMedicalGeneral( entity.getMedicalGeneral() );
        taxCreditVO.setActualMedicalExpenses( entity.getActualMedicalExpenses() );
        taxCreditVO.setStandardTaxCredit( entity.getStandardTaxCredit() );

        return taxCreditVO;
    }
}
