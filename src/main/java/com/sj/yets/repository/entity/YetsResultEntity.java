package com.sj.yets.repository.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class YetsResultEntity {
    private String  jumin;

    private Integer basicHumanDeductionAmount;

    private Integer additionalHumanDeductionAmount;

    private Integer nationalPensionAmount;

    private Integer healthInsuranceAmount;

    private Integer employmentInsuranceAmount;

    private Integer mortgageLoanAmount;

    private Integer privatePensionSavingAmount;

    private Integer housingSavingAmount;

    private Integer creditCardEtcAmount;

    private Integer basicHumanDeductionLimit;

    private Integer additionalHumanDeductionLimit;

    private Integer nationalPensionLimit;

    private Integer healthInsuranceLimit;

    private Integer employmentInsuranceLimit;

    private Integer mortgageLoanLimit;

    private Integer privatePensionSavingLimit;

    private Integer housingSavingLimit;

    private Integer creditCardEtcLimit;

    private Integer labourIncomeTaxCreditAmount;

    private Integer childrenTaxCreditAmount;

    private Integer lifeInsuranceAmount;

    private Integer medicalExpensesAmount;

    private Integer standardTaxCredit;

    private Integer labourIncomeTaxCreditLimit;

    private Integer childrenTaxCreditLimit;

    private Integer lifeInsuranceLimit;

    private Integer medicalExpensesLimit;
}