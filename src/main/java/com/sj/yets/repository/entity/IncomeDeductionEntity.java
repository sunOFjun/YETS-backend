package com.sj.yets.repository.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IncomeDeductionEntity {
	  private String jumin;

	  private Integer nationalPension;

	  private Integer healthInsurance;

	  private Integer employmentInsurance;

	  private Integer mortgageLoan;

	  private Integer privatePensionSaving;

	  private Integer housingSaving;

	  private Integer creditCard;

	  private Integer debitCard;

	  private Integer cash;

	  private Integer creditCardCulture;

	  private Integer debitCardCulture;

	  private Integer cashCulture;

	  private Integer traditionalMarket;

	  private Integer publicTransport;
}