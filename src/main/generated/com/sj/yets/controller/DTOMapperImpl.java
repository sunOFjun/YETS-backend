package com.sj.yets.controller;

import com.sj.yets.api.model.BasicInfoDTO;
import com.sj.yets.api.model.HumanDeductionDTO;
import com.sj.yets.api.model.IncomeDeductionDTO;
import com.sj.yets.api.model.TaxCreditDTO;
import com.sj.yets.api.model.YetsResultDTO;
import com.sj.yets.service.vo.BasicInfoVO;
import com.sj.yets.service.vo.HumanDeductionVO;
import com.sj.yets.service.vo.IncomeDeductionVO;
import com.sj.yets.service.vo.TaxCreditVO;
import com.sj.yets.service.vo.YetsResultVO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-21T01:04:28+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0-262 (OpenLogic-OpenJDK)"
)
@Component
public class DTOMapperImpl implements DTOMapper {

    @Override
    public BasicInfoDTO toBasicInfoDTO(BasicInfoVO basicInfo) {
        if ( basicInfo == null ) {
            return null;
        }

        BasicInfoDTO basicInfoDTO = new BasicInfoDTO();

        basicInfoDTO.setName( basicInfo.getName() );
        basicInfoDTO.setJumin( basicInfo.getJumin() );
        basicInfoDTO.setTotalIncome( basicInfo.getTotalIncome() );
        basicInfoDTO.setPaidTax( basicInfo.getPaidTax() );
        basicInfoDTO.setLabourIncome( basicInfo.getLabourIncome() );
        basicInfoDTO.setTaxBase( basicInfo.getTaxBase() );
        basicInfoDTO.setCalculatedTax( basicInfo.getCalculatedTax() );
        basicInfoDTO.setDeterminedTax( basicInfo.getDeterminedTax() );
        basicInfoDTO.setTaxPayable( basicInfo.getTaxPayable() );

        return basicInfoDTO;
    }

    @Override
    public HumanDeductionDTO toHumanDeductionDTO(HumanDeductionVO humanDeduction) {
        if ( humanDeduction == null ) {
            return null;
        }

        HumanDeductionDTO humanDeductionDTO = new HumanDeductionDTO();

        humanDeductionDTO.setJumin( humanDeduction.getJumin() );
        humanDeductionDTO.setMyself( humanDeduction.getMyself() );
        humanDeductionDTO.setSpouseYn( humanDeduction.getSpouseYn() );
        humanDeductionDTO.setParents( humanDeduction.getParents() );
        humanDeductionDTO.setChildren( humanDeduction.getChildren() );
        humanDeductionDTO.setExceptChildren( humanDeduction.getExceptChildren() );
        humanDeductionDTO.setSibling( humanDeduction.getSibling() );
        humanDeductionDTO.setSeniority( humanDeduction.getSeniority() );
        humanDeductionDTO.setDisabled( humanDeduction.getDisabled() );
        humanDeductionDTO.setWomen( humanDeduction.getWomen() );

        return humanDeductionDTO;
    }

    @Override
    public IncomeDeductionDTO toIncomeDeductionDTO(IncomeDeductionVO incomeDeduction) {
        if ( incomeDeduction == null ) {
            return null;
        }

        IncomeDeductionDTO incomeDeductionDTO = new IncomeDeductionDTO();

        incomeDeductionDTO.setJumin( incomeDeduction.getJumin() );
        incomeDeductionDTO.setNationalPension( incomeDeduction.getNationalPension() );
        incomeDeductionDTO.setHealthInsurance( incomeDeduction.getHealthInsurance() );
        incomeDeductionDTO.setEmploymentInsurance( incomeDeduction.getEmploymentInsurance() );
        incomeDeductionDTO.setMortgageLoan( incomeDeduction.getMortgageLoan() );
        incomeDeductionDTO.setPrivatePensionSaving( incomeDeduction.getPrivatePensionSaving() );
        incomeDeductionDTO.setHousingSaving( incomeDeduction.getHousingSaving() );
        incomeDeductionDTO.setCreditCard( incomeDeduction.getCreditCard() );
        incomeDeductionDTO.setDebitCard( incomeDeduction.getDebitCard() );
        incomeDeductionDTO.setCash( incomeDeduction.getCash() );
        incomeDeductionDTO.setCreditCardCulture( incomeDeduction.getCreditCardCulture() );
        incomeDeductionDTO.setDebitCardCulture( incomeDeduction.getDebitCardCulture() );
        incomeDeductionDTO.setCashCulture( incomeDeduction.getCashCulture() );
        incomeDeductionDTO.setTraditionalMarket( incomeDeduction.getTraditionalMarket() );
        incomeDeductionDTO.setPublicTransport( incomeDeduction.getPublicTransport() );

        return incomeDeductionDTO;
    }

    @Override
    public YetsResultDTO toYetsResultDTO(YetsResultVO yetsResultVO) {
        if ( yetsResultVO == null ) {
            return null;
        }

        YetsResultDTO yetsResultDTO = new YetsResultDTO();

        yetsResultDTO.setJumin( yetsResultVO.getJumin() );
        yetsResultDTO.setBasicHumanDeductionAmount( yetsResultVO.getBasicHumanDeductionAmount() );
        yetsResultDTO.setAdditionalHumanDeductionAmount( yetsResultVO.getAdditionalHumanDeductionAmount() );
        yetsResultDTO.setNationalPensionAmount( yetsResultVO.getNationalPensionAmount() );
        yetsResultDTO.setHealthInsuranceAmount( yetsResultVO.getHealthInsuranceAmount() );
        yetsResultDTO.setEmploymentInsuranceAmount( yetsResultVO.getEmploymentInsuranceAmount() );
        yetsResultDTO.setMortgageLoanAmount( yetsResultVO.getMortgageLoanAmount() );
        yetsResultDTO.setPrivatePensionSavingAmount( yetsResultVO.getPrivatePensionSavingAmount() );
        yetsResultDTO.setHousingSavingAmount( yetsResultVO.getHousingSavingAmount() );
        yetsResultDTO.setCreditCardEtcAmount( yetsResultVO.getCreditCardEtcAmount() );
        yetsResultDTO.setBasicHumanDeductionLimit( yetsResultVO.getBasicHumanDeductionLimit() );
        yetsResultDTO.setAdditionalHumanDeductionLimit( yetsResultVO.getAdditionalHumanDeductionLimit() );
        yetsResultDTO.setNationalPensionLimit( yetsResultVO.getNationalPensionLimit() );
        yetsResultDTO.setHealthInsuranceLimit( yetsResultVO.getHealthInsuranceLimit() );
        yetsResultDTO.setEmploymentInsuranceLimit( yetsResultVO.getEmploymentInsuranceLimit() );
        yetsResultDTO.setMortgageLoanLimit( yetsResultVO.getMortgageLoanLimit() );
        yetsResultDTO.setPrivatePensionSavingLimit( yetsResultVO.getPrivatePensionSavingLimit() );
        yetsResultDTO.setHousingSavingLimit( yetsResultVO.getHousingSavingLimit() );
        yetsResultDTO.setCreditCardEtcLimit( yetsResultVO.getCreditCardEtcLimit() );
        yetsResultDTO.setLabourIncomeTaxCreditAmount( yetsResultVO.getLabourIncomeTaxCreditAmount() );
        yetsResultDTO.setChildrenTaxCreditAmount( yetsResultVO.getChildrenTaxCreditAmount() );
        yetsResultDTO.setLifeInsuranceAmount( yetsResultVO.getLifeInsuranceAmount() );
        yetsResultDTO.setMedicalExpensesAmount( yetsResultVO.getMedicalExpensesAmount() );
        yetsResultDTO.setStandardTaxCredit( yetsResultVO.getStandardTaxCredit() );
        yetsResultDTO.setLabourIncomeTaxCreditLimit( yetsResultVO.getLabourIncomeTaxCreditLimit() );
        yetsResultDTO.setChildrenTaxCreditLimit( yetsResultVO.getChildrenTaxCreditLimit() );
        yetsResultDTO.setLifeInsuranceLimit( yetsResultVO.getLifeInsuranceLimit() );
        yetsResultDTO.setMedicalExpensesLimit( yetsResultVO.getMedicalExpensesLimit() );

        return yetsResultDTO;
    }

    @Override
    public TaxCreditDTO toTaxCreditDTO(TaxCreditVO taxCredit) {
        if ( taxCredit == null ) {
            return null;
        }

        TaxCreditDTO taxCreditDTO = new TaxCreditDTO();

        taxCreditDTO.setJumin( taxCredit.getJumin() );
        taxCreditDTO.setChildrenTaxCreditNumber( taxCredit.getChildrenTaxCreditNumber() );
        taxCreditDTO.setBirthFirst( taxCredit.getBirthFirst() );
        taxCreditDTO.setBirthSecond( taxCredit.getBirthSecond() );
        taxCreditDTO.setBirthThirdUp( taxCredit.getBirthThirdUp() );
        taxCreditDTO.setLifeInsurance( taxCredit.getLifeInsurance() );
        taxCreditDTO.setMedicalInfertility( taxCredit.getMedicalInfertility() );
        taxCreditDTO.setMedicalPremie( taxCredit.getMedicalPremie() );
        taxCreditDTO.setMedicalSpecial( taxCredit.getMedicalSpecial() );
        taxCreditDTO.setMedicalGeneral( taxCredit.getMedicalGeneral() );
        taxCreditDTO.setActualMedicalExpenses( taxCredit.getActualMedicalExpenses() );

        return taxCreditDTO;
    }
}
