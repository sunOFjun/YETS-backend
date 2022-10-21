package com.sj.yets.repository.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxCreditEntity {
	private String jumin;

	private Integer childrenTaxCreditNumber;

	private Integer birthFirst;

	private Integer birthSecond;

	private Integer birthThirdUp;

	private Integer lifeInsurance;

	private Integer medicalInfertility;

	private Integer medicalPremie;

	private Integer medicalSpecial;

	private Integer medicalGeneral;

	private Integer actualMedicalExpenses;

	private Integer standardTaxCredit;
}
