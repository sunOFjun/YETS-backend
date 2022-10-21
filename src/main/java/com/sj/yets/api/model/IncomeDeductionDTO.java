package com.sj.yets.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IncomeDeductionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class IncomeDeductionDTO   {
  @JsonProperty("jumin")
  private String jumin = null;

  @JsonProperty("nationalPension")
  private Integer nationalPension;

  @JsonProperty("healthInsurance")
  private Integer healthInsurance;

  @JsonProperty("employmentInsurance")
  private Integer employmentInsurance;

  @JsonProperty("mortgageLoan")
  private Integer mortgageLoan;

  @JsonProperty("privatePensionSaving")
  private Integer privatePensionSaving;

  @JsonProperty("housingSaving")
  private Integer housingSaving;

  @JsonProperty("creditCard")
  private Integer creditCard;

  @JsonProperty("debitCard")
  private Integer debitCard;

  @JsonProperty("cash")
  private Integer cash;

  @JsonProperty("creditCardCulture")
  private Integer creditCardCulture;

  @JsonProperty("debitCardCulture")
  private Integer debitCardCulture;

  @JsonProperty("cashCulture")
  private Integer cashCulture;

  @JsonProperty("traditionalMarket")
  private Integer traditionalMarket;

  @JsonProperty("publicTransport")
  private Integer publicTransport;

  public IncomeDeductionDTO jumin(String jumin) {
    this.jumin = jumin;
    return this;
  }

  /**
   * Get jumin
   * @return jumin
  */
  @ApiModelProperty(value = "")


  public String getJumin() {
    return jumin;
  }

  public void setJumin(String jumin) {
    this.jumin = jumin;
  }

  public IncomeDeductionDTO nationalPension(Integer nationalPension) {
    this.nationalPension = nationalPension;
    return this;
  }

  /**
   * Get nationalPension
   * @return nationalPension
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getNationalPension() {
    return nationalPension;
  }

  public void setNationalPension(Integer nationalPension) {
    this.nationalPension = nationalPension;
  }

  public IncomeDeductionDTO healthInsurance(Integer healthInsurance) {
    this.healthInsurance = healthInsurance;
    return this;
  }

  /**
   * Get healthInsurance
   * @return healthInsurance
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getHealthInsurance() {
    return healthInsurance;
  }

  public void setHealthInsurance(Integer healthInsurance) {
    this.healthInsurance = healthInsurance;
  }

  public IncomeDeductionDTO employmentInsurance(Integer employmentInsurance) {
    this.employmentInsurance = employmentInsurance;
    return this;
  }

  /**
   * Get employmentInsurance
   * @return employmentInsurance
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getEmploymentInsurance() {
    return employmentInsurance;
  }

  public void setEmploymentInsurance(Integer employmentInsurance) {
    this.employmentInsurance = employmentInsurance;
  }

  public IncomeDeductionDTO mortgageLoan(Integer mortgageLoan) {
    this.mortgageLoan = mortgageLoan;
    return this;
  }

  /**
   * Get mortgageLoan
   * @return mortgageLoan
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getMortgageLoan() {
    return mortgageLoan;
  }

  public void setMortgageLoan(Integer mortgageLoan) {
    this.mortgageLoan = mortgageLoan;
  }

  public IncomeDeductionDTO privatePensionSaving(Integer privatePensionSaving) {
    this.privatePensionSaving = privatePensionSaving;
    return this;
  }

  /**
   * Get privatePensionSaving
   * @return privatePensionSaving
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getPrivatePensionSaving() {
    return privatePensionSaving;
  }

  public void setPrivatePensionSaving(Integer privatePensionSaving) {
    this.privatePensionSaving = privatePensionSaving;
  }

  public IncomeDeductionDTO housingSaving(Integer housingSaving) {
    this.housingSaving = housingSaving;
    return this;
  }

  /**
   * Get housingSaving
   * @return housingSaving
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getHousingSaving() {
    return housingSaving;
  }

  public void setHousingSaving(Integer housingSaving) {
    this.housingSaving = housingSaving;
  }

  public IncomeDeductionDTO creditCard(Integer creditCard) {
    this.creditCard = creditCard;
    return this;
  }

  /**
   * Get creditCard
   * @return creditCard
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(Integer creditCard) {
    this.creditCard = creditCard;
  }

  public IncomeDeductionDTO debitCard(Integer debitCard) {
    this.debitCard = debitCard;
    return this;
  }

  /**
   * Get debitCard
   * @return debitCard
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getDebitCard() {
    return debitCard;
  }

  public void setDebitCard(Integer debitCard) {
    this.debitCard = debitCard;
  }

  public IncomeDeductionDTO cash(Integer cash) {
    this.cash = cash;
    return this;
  }

  /**
   * Get cash
   * @return cash
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getCash() {
    return cash;
  }

  public void setCash(Integer cash) {
    this.cash = cash;
  }

  public IncomeDeductionDTO creditCardCulture(Integer creditCardCulture) {
    this.creditCardCulture = creditCardCulture;
    return this;
  }

  /**
   * Get creditCardCulture
   * @return creditCardCulture
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getCreditCardCulture() {
    return creditCardCulture;
  }

  public void setCreditCardCulture(Integer creditCardCulture) {
    this.creditCardCulture = creditCardCulture;
  }

  public IncomeDeductionDTO debitCardCulture(Integer debitCardCulture) {
    this.debitCardCulture = debitCardCulture;
    return this;
  }

  /**
   * Get debitCardCulture
   * @return debitCardCulture
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getDebitCardCulture() {
    return debitCardCulture;
  }

  public void setDebitCardCulture(Integer debitCardCulture) {
    this.debitCardCulture = debitCardCulture;
  }

  public IncomeDeductionDTO cashCulture(Integer cashCulture) {
    this.cashCulture = cashCulture;
    return this;
  }

  /**
   * Get cashCulture
   * @return cashCulture
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getCashCulture() {
    return cashCulture;
  }

  public void setCashCulture(Integer cashCulture) {
    this.cashCulture = cashCulture;
  }

  public IncomeDeductionDTO traditionalMarket(Integer traditionalMarket) {
    this.traditionalMarket = traditionalMarket;
    return this;
  }

  /**
   * Get traditionalMarket
   * @return traditionalMarket
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getTraditionalMarket() {
    return traditionalMarket;
  }

  public void setTraditionalMarket(Integer traditionalMarket) {
    this.traditionalMarket = traditionalMarket;
  }

  public IncomeDeductionDTO publicTransport(Integer publicTransport) {
    this.publicTransport = publicTransport;
    return this;
  }

  /**
   * Get publicTransport
   * @return publicTransport
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getPublicTransport() {
    return publicTransport;
  }

  public void setPublicTransport(Integer publicTransport) {
    this.publicTransport = publicTransport;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeDeductionDTO incomeDeductionDTO = (IncomeDeductionDTO) o;
    return Objects.equals(this.jumin, incomeDeductionDTO.jumin) &&
        Objects.equals(this.nationalPension, incomeDeductionDTO.nationalPension) &&
        Objects.equals(this.healthInsurance, incomeDeductionDTO.healthInsurance) &&
        Objects.equals(this.employmentInsurance, incomeDeductionDTO.employmentInsurance) &&
        Objects.equals(this.mortgageLoan, incomeDeductionDTO.mortgageLoan) &&
        Objects.equals(this.privatePensionSaving, incomeDeductionDTO.privatePensionSaving) &&
        Objects.equals(this.housingSaving, incomeDeductionDTO.housingSaving) &&
        Objects.equals(this.creditCard, incomeDeductionDTO.creditCard) &&
        Objects.equals(this.debitCard, incomeDeductionDTO.debitCard) &&
        Objects.equals(this.cash, incomeDeductionDTO.cash) &&
        Objects.equals(this.creditCardCulture, incomeDeductionDTO.creditCardCulture) &&
        Objects.equals(this.debitCardCulture, incomeDeductionDTO.debitCardCulture) &&
        Objects.equals(this.cashCulture, incomeDeductionDTO.cashCulture) &&
        Objects.equals(this.traditionalMarket, incomeDeductionDTO.traditionalMarket) &&
        Objects.equals(this.publicTransport, incomeDeductionDTO.publicTransport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jumin, nationalPension, healthInsurance, employmentInsurance, mortgageLoan, privatePensionSaving, housingSaving, creditCard, debitCard, cash, creditCardCulture, debitCardCulture, cashCulture, traditionalMarket, publicTransport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeDeductionDTO {\n");
    
    sb.append("    jumin: ").append(toIndentedString(jumin)).append("\n");
    sb.append("    nationalPension: ").append(toIndentedString(nationalPension)).append("\n");
    sb.append("    healthInsurance: ").append(toIndentedString(healthInsurance)).append("\n");
    sb.append("    employmentInsurance: ").append(toIndentedString(employmentInsurance)).append("\n");
    sb.append("    mortgageLoan: ").append(toIndentedString(mortgageLoan)).append("\n");
    sb.append("    privatePensionSaving: ").append(toIndentedString(privatePensionSaving)).append("\n");
    sb.append("    housingSaving: ").append(toIndentedString(housingSaving)).append("\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
    sb.append("    debitCard: ").append(toIndentedString(debitCard)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    creditCardCulture: ").append(toIndentedString(creditCardCulture)).append("\n");
    sb.append("    debitCardCulture: ").append(toIndentedString(debitCardCulture)).append("\n");
    sb.append("    cashCulture: ").append(toIndentedString(cashCulture)).append("\n");
    sb.append("    traditionalMarket: ").append(toIndentedString(traditionalMarket)).append("\n");
    sb.append("    publicTransport: ").append(toIndentedString(publicTransport)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

