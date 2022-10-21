package com.sj.yets.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * YetsResultDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class YetsResultDTO   {
  @JsonProperty("jumin")
  private String jumin = null;

  @JsonProperty("basicHumanDeductionAmount")
  private Integer basicHumanDeductionAmount;

  @JsonProperty("additionalHumanDeductionAmount")
  private Integer additionalHumanDeductionAmount;

  @JsonProperty("nationalPensionAmount")
  private Integer nationalPensionAmount;

  @JsonProperty("healthInsuranceAmount")
  private Integer healthInsuranceAmount;

  @JsonProperty("employmentInsuranceAmount")
  private Integer employmentInsuranceAmount;

  @JsonProperty("mortgageLoanAmount")
  private Integer mortgageLoanAmount;

  @JsonProperty("privatePensionSavingAmount")
  private Integer privatePensionSavingAmount;

  @JsonProperty("housingSavingAmount")
  private Integer housingSavingAmount = null;

  @JsonProperty("creditCardEtcAmount")
  private Integer creditCardEtcAmount;

  @JsonProperty("basicHumanDeductionLimit")
  private Integer basicHumanDeductionLimit;

  @JsonProperty("additionalHumanDeductionLimit")
  private Integer additionalHumanDeductionLimit;

  @JsonProperty("nationalPensionLimit")
  private Integer nationalPensionLimit;

  @JsonProperty("healthInsuranceLimit")
  private Integer healthInsuranceLimit;

  @JsonProperty("employmentInsuranceLimit")
  private Integer employmentInsuranceLimit;

  @JsonProperty("mortgageLoanLimit")
  private Integer mortgageLoanLimit;

  @JsonProperty("privatePensionSavingLimit")
  private Integer privatePensionSavingLimit;

  @JsonProperty("housingSavingLimit")
  private Integer housingSavingLimit;

  @JsonProperty("creditCardEtcLimit")
  private Integer creditCardEtcLimit;

  @JsonProperty("labourIncomeTaxCreditAmount")
  private Integer labourIncomeTaxCreditAmount;

  @JsonProperty("childrenTaxCreditAmount")
  private Integer childrenTaxCreditAmount;

  @JsonProperty("lifeInsuranceAmount")
  private Integer lifeInsuranceAmount;

  @JsonProperty("medicalExpensesAmount")
  private Integer medicalExpensesAmount;

  @JsonProperty("standardTaxCredit")
  private Integer standardTaxCredit;

  @JsonProperty("labourIncomeTaxCreditLimit")
  private Integer labourIncomeTaxCreditLimit;

  @JsonProperty("childrenTaxCreditLimit")
  private Integer childrenTaxCreditLimit;

  @JsonProperty("lifeInsuranceLimit")
  private Integer lifeInsuranceLimit;

  @JsonProperty("medicalExpensesLimit")
  private Integer medicalExpensesLimit;

  public YetsResultDTO jumin(String jumin) {
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

  public YetsResultDTO basicHumanDeductionAmount(Integer basicHumanDeductionAmount) {
    this.basicHumanDeductionAmount = basicHumanDeductionAmount;
    return this;
  }

  /**
   * Get basicHumanDeductionAmount
   * @return basicHumanDeductionAmount
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getBasicHumanDeductionAmount() {
    return basicHumanDeductionAmount;
  }

  public void setBasicHumanDeductionAmount(Integer basicHumanDeductionAmount) {
    this.basicHumanDeductionAmount = basicHumanDeductionAmount;
  }

  public YetsResultDTO additionalHumanDeductionAmount(Integer additionalHumanDeductionAmount) {
    this.additionalHumanDeductionAmount = additionalHumanDeductionAmount;
    return this;
  }

  /**
   * Get additionalHumanDeductionAmount
   * @return additionalHumanDeductionAmount
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getAdditionalHumanDeductionAmount() {
    return additionalHumanDeductionAmount;
  }

  public void setAdditionalHumanDeductionAmount(Integer additionalHumanDeductionAmount) {
    this.additionalHumanDeductionAmount = additionalHumanDeductionAmount;
  }

  public YetsResultDTO nationalPensionAmount(Integer nationalPensionAmount) {
    this.nationalPensionAmount = nationalPensionAmount;
    return this;
  }

  /**
   * Get nationalPensionAmount
   * @return nationalPensionAmount
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getNationalPensionAmount() {
    return nationalPensionAmount;
  }

  public void setNationalPensionAmount(Integer nationalPensionAmount) {
    this.nationalPensionAmount = nationalPensionAmount;
  }

  public YetsResultDTO healthInsuranceAmount(Integer healthInsuranceAmount) {
    this.healthInsuranceAmount = healthInsuranceAmount;
    return this;
  }

  /**
   * Get healthInsuranceAmount
   * @return healthInsuranceAmount
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getHealthInsuranceAmount() {
    return healthInsuranceAmount;
  }

  public void setHealthInsuranceAmount(Integer healthInsuranceAmount) {
    this.healthInsuranceAmount = healthInsuranceAmount;
  }

  public YetsResultDTO employmentInsuranceAmount(Integer employmentInsuranceAmount) {
    this.employmentInsuranceAmount = employmentInsuranceAmount;
    return this;
  }

  /**
   * Get employmentInsuranceAmount
   * @return employmentInsuranceAmount
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getEmploymentInsuranceAmount() {
    return employmentInsuranceAmount;
  }

  public void setEmploymentInsuranceAmount(Integer employmentInsuranceAmount) {
    this.employmentInsuranceAmount = employmentInsuranceAmount;
  }

  public YetsResultDTO mortgageLoanAmount(Integer mortgageLoanAmount) {
    this.mortgageLoanAmount = mortgageLoanAmount;
    return this;
  }

  /**
   * Get mortgageLoanAmount
   * @return mortgageLoanAmount
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getMortgageLoanAmount() {
    return mortgageLoanAmount;
  }

  public void setMortgageLoanAmount(Integer mortgageLoanAmount) {
    this.mortgageLoanAmount = mortgageLoanAmount;
  }

  public YetsResultDTO privatePensionSavingAmount(Integer privatePensionSavingAmount) {
    this.privatePensionSavingAmount = privatePensionSavingAmount;
    return this;
  }

  /**
   * Get privatePensionSavingAmount
   * @return privatePensionSavingAmount
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getPrivatePensionSavingAmount() {
    return privatePensionSavingAmount;
  }

  public void setPrivatePensionSavingAmount(Integer privatePensionSavingAmount) {
    this.privatePensionSavingAmount = privatePensionSavingAmount;
  }

  public YetsResultDTO housingSavingAmount(Integer housingSavingAmount) {
    this.housingSavingAmount = housingSavingAmount;
    return this;
  }

  /**
   * Get housingSavingAmount
   * @return housingSavingAmount
  */
  @ApiModelProperty(value = "")


  public Integer getHousingSavingAmount() {
    return housingSavingAmount;
  }

  public void setHousingSavingAmount(Integer housingSavingAmount) {
    this.housingSavingAmount = housingSavingAmount;
  }

  public YetsResultDTO creditCardEtcAmount(Integer creditCardEtcAmount) {
    this.creditCardEtcAmount = creditCardEtcAmount;
    return this;
  }

  /**
   * Get creditCardEtcAmount
   * @return creditCardEtcAmount
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getCreditCardEtcAmount() {
    return creditCardEtcAmount;
  }

  public void setCreditCardEtcAmount(Integer creditCardEtcAmount) {
    this.creditCardEtcAmount = creditCardEtcAmount;
  }

  public YetsResultDTO basicHumanDeductionLimit(Integer basicHumanDeductionLimit) {
    this.basicHumanDeductionLimit = basicHumanDeductionLimit;
    return this;
  }

  /**
   * Get basicHumanDeductionLimit
   * @return basicHumanDeductionLimit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getBasicHumanDeductionLimit() {
    return basicHumanDeductionLimit;
  }

  public void setBasicHumanDeductionLimit(Integer basicHumanDeductionLimit) {
    this.basicHumanDeductionLimit = basicHumanDeductionLimit;
  }

  public YetsResultDTO additionalHumanDeductionLimit(Integer additionalHumanDeductionLimit) {
    this.additionalHumanDeductionLimit = additionalHumanDeductionLimit;
    return this;
  }

  /**
   * Get additionalHumanDeductionLimit
   * @return additionalHumanDeductionLimit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getAdditionalHumanDeductionLimit() {
    return additionalHumanDeductionLimit;
  }

  public void setAdditionalHumanDeductionLimit(Integer additionalHumanDeductionLimit) {
    this.additionalHumanDeductionLimit = additionalHumanDeductionLimit;
  }

  public YetsResultDTO nationalPensionLimit(Integer nationalPensionLimit) {
    this.nationalPensionLimit = nationalPensionLimit;
    return this;
  }

  /**
   * Get nationalPensionLimit
   * @return nationalPensionLimit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getNationalPensionLimit() {
    return nationalPensionLimit;
  }

  public void setNationalPensionLimit(Integer nationalPensionLimit) {
    this.nationalPensionLimit = nationalPensionLimit;
  }

  public YetsResultDTO healthInsuranceLimit(Integer healthInsuranceLimit) {
    this.healthInsuranceLimit = healthInsuranceLimit;
    return this;
  }

  /**
   * Get healthInsuranceLimit
   * @return healthInsuranceLimit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getHealthInsuranceLimit() {
    return healthInsuranceLimit;
  }

  public void setHealthInsuranceLimit(Integer healthInsuranceLimit) {
    this.healthInsuranceLimit = healthInsuranceLimit;
  }

  public YetsResultDTO employmentInsuranceLimit(Integer employmentInsuranceLimit) {
    this.employmentInsuranceLimit = employmentInsuranceLimit;
    return this;
  }

  /**
   * Get employmentInsuranceLimit
   * @return employmentInsuranceLimit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getEmploymentInsuranceLimit() {
    return employmentInsuranceLimit;
  }

  public void setEmploymentInsuranceLimit(Integer employmentInsuranceLimit) {
    this.employmentInsuranceLimit = employmentInsuranceLimit;
  }

  public YetsResultDTO mortgageLoanLimit(Integer mortgageLoanLimit) {
    this.mortgageLoanLimit = mortgageLoanLimit;
    return this;
  }

  /**
   * Get mortgageLoanLimit
   * @return mortgageLoanLimit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getMortgageLoanLimit() {
    return mortgageLoanLimit;
  }

  public void setMortgageLoanLimit(Integer mortgageLoanLimit) {
    this.mortgageLoanLimit = mortgageLoanLimit;
  }

  public YetsResultDTO privatePensionSavingLimit(Integer privatePensionSavingLimit) {
    this.privatePensionSavingLimit = privatePensionSavingLimit;
    return this;
  }

  /**
   * Get privatePensionSavingLimit
   * @return privatePensionSavingLimit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getPrivatePensionSavingLimit() {
    return privatePensionSavingLimit;
  }

  public void setPrivatePensionSavingLimit(Integer privatePensionSavingLimit) {
    this.privatePensionSavingLimit = privatePensionSavingLimit;
  }

  public YetsResultDTO housingSavingLimit(Integer housingSavingLimit) {
    this.housingSavingLimit = housingSavingLimit;
    return this;
  }

  /**
   * Get housingSavingLimit
   * @return housingSavingLimit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getHousingSavingLimit() {
    return housingSavingLimit;
  }

  public void setHousingSavingLimit(Integer housingSavingLimit) {
    this.housingSavingLimit = housingSavingLimit;
  }

  public YetsResultDTO creditCardEtcLimit(Integer creditCardEtcLimit) {
    this.creditCardEtcLimit = creditCardEtcLimit;
    return this;
  }

  /**
   * Get creditCardEtcLimit
   * @return creditCardEtcLimit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getCreditCardEtcLimit() {
    return creditCardEtcLimit;
  }

  public void setCreditCardEtcLimit(Integer creditCardEtcLimit) {
    this.creditCardEtcLimit = creditCardEtcLimit;
  }

  public YetsResultDTO labourIncomeTaxCreditAmount(Integer labourIncomeTaxCreditAmount) {
    this.labourIncomeTaxCreditAmount = labourIncomeTaxCreditAmount;
    return this;
  }

  /**
   * Get labourIncomeTaxCreditAmount
   * @return labourIncomeTaxCreditAmount
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getLabourIncomeTaxCreditAmount() {
    return labourIncomeTaxCreditAmount;
  }

  public void setLabourIncomeTaxCreditAmount(Integer labourIncomeTaxCreditAmount) {
    this.labourIncomeTaxCreditAmount = labourIncomeTaxCreditAmount;
  }

  public YetsResultDTO childrenTaxCreditAmount(Integer childrenTaxCreditAmount) {
    this.childrenTaxCreditAmount = childrenTaxCreditAmount;
    return this;
  }

  /**
   * Get childrenTaxCreditAmount
   * @return childrenTaxCreditAmount
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getChildrenTaxCreditAmount() {
    return childrenTaxCreditAmount;
  }

  public void setChildrenTaxCreditAmount(Integer childrenTaxCreditAmount) {
    this.childrenTaxCreditAmount = childrenTaxCreditAmount;
  }

  public YetsResultDTO lifeInsuranceAmount(Integer lifeInsuranceAmount) {
    this.lifeInsuranceAmount = lifeInsuranceAmount;
    return this;
  }

  /**
   * Get lifeInsuranceAmount
   * @return lifeInsuranceAmount
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getLifeInsuranceAmount() {
    return lifeInsuranceAmount;
  }

  public void setLifeInsuranceAmount(Integer lifeInsuranceAmount) {
    this.lifeInsuranceAmount = lifeInsuranceAmount;
  }

  public YetsResultDTO medicalExpensesAmount(Integer medicalExpensesAmount) {
    this.medicalExpensesAmount = medicalExpensesAmount;
    return this;
  }

  /**
   * Get medicalExpensesAmount
   * @return medicalExpensesAmount
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getMedicalExpensesAmount() {
    return medicalExpensesAmount;
  }

  public void setMedicalExpensesAmount(Integer medicalExpensesAmount) {
    this.medicalExpensesAmount = medicalExpensesAmount;
  }

  public YetsResultDTO standardTaxCredit(Integer standardTaxCredit) {
    this.standardTaxCredit = standardTaxCredit;
    return this;
  }

  /**
   * Get standardTaxCredit
   * @return standardTaxCredit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getStandardTaxCredit() {
    return standardTaxCredit;
  }

  public void setStandardTaxCredit(Integer standardTaxCredit) {
    this.standardTaxCredit = standardTaxCredit;
  }

  public YetsResultDTO labourIncomeTaxCreditLimit(Integer labourIncomeTaxCreditLimit) {
    this.labourIncomeTaxCreditLimit = labourIncomeTaxCreditLimit;
    return this;
  }

  /**
   * Get labourIncomeTaxCreditLimit
   * @return labourIncomeTaxCreditLimit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getLabourIncomeTaxCreditLimit() {
    return labourIncomeTaxCreditLimit;
  }

  public void setLabourIncomeTaxCreditLimit(Integer labourIncomeTaxCreditLimit) {
    this.labourIncomeTaxCreditLimit = labourIncomeTaxCreditLimit;
  }

  public YetsResultDTO childrenTaxCreditLimit(Integer childrenTaxCreditLimit) {
    this.childrenTaxCreditLimit = childrenTaxCreditLimit;
    return this;
  }

  /**
   * Get childrenTaxCreditLimit
   * @return childrenTaxCreditLimit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getChildrenTaxCreditLimit() {
    return childrenTaxCreditLimit;
  }

  public void setChildrenTaxCreditLimit(Integer childrenTaxCreditLimit) {
    this.childrenTaxCreditLimit = childrenTaxCreditLimit;
  }

  public YetsResultDTO lifeInsuranceLimit(Integer lifeInsuranceLimit) {
    this.lifeInsuranceLimit = lifeInsuranceLimit;
    return this;
  }

  /**
   * Get lifeInsuranceLimit
   * @return lifeInsuranceLimit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getLifeInsuranceLimit() {
    return lifeInsuranceLimit;
  }

  public void setLifeInsuranceLimit(Integer lifeInsuranceLimit) {
    this.lifeInsuranceLimit = lifeInsuranceLimit;
  }

  public YetsResultDTO medicalExpensesLimit(Integer medicalExpensesLimit) {
    this.medicalExpensesLimit = medicalExpensesLimit;
    return this;
  }

  /**
   * Get medicalExpensesLimit
   * @return medicalExpensesLimit
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getMedicalExpensesLimit() {
    return medicalExpensesLimit;
  }

  public void setMedicalExpensesLimit(Integer medicalExpensesLimit) {
    this.medicalExpensesLimit = medicalExpensesLimit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YetsResultDTO yetsResultDTO = (YetsResultDTO) o;
    return Objects.equals(this.jumin, yetsResultDTO.jumin) &&
        Objects.equals(this.basicHumanDeductionAmount, yetsResultDTO.basicHumanDeductionAmount) &&
        Objects.equals(this.additionalHumanDeductionAmount, yetsResultDTO.additionalHumanDeductionAmount) &&
        Objects.equals(this.nationalPensionAmount, yetsResultDTO.nationalPensionAmount) &&
        Objects.equals(this.healthInsuranceAmount, yetsResultDTO.healthInsuranceAmount) &&
        Objects.equals(this.employmentInsuranceAmount, yetsResultDTO.employmentInsuranceAmount) &&
        Objects.equals(this.mortgageLoanAmount, yetsResultDTO.mortgageLoanAmount) &&
        Objects.equals(this.privatePensionSavingAmount, yetsResultDTO.privatePensionSavingAmount) &&
        Objects.equals(this.housingSavingAmount, yetsResultDTO.housingSavingAmount) &&
        Objects.equals(this.creditCardEtcAmount, yetsResultDTO.creditCardEtcAmount) &&
        Objects.equals(this.basicHumanDeductionLimit, yetsResultDTO.basicHumanDeductionLimit) &&
        Objects.equals(this.additionalHumanDeductionLimit, yetsResultDTO.additionalHumanDeductionLimit) &&
        Objects.equals(this.nationalPensionLimit, yetsResultDTO.nationalPensionLimit) &&
        Objects.equals(this.healthInsuranceLimit, yetsResultDTO.healthInsuranceLimit) &&
        Objects.equals(this.employmentInsuranceLimit, yetsResultDTO.employmentInsuranceLimit) &&
        Objects.equals(this.mortgageLoanLimit, yetsResultDTO.mortgageLoanLimit) &&
        Objects.equals(this.privatePensionSavingLimit, yetsResultDTO.privatePensionSavingLimit) &&
        Objects.equals(this.housingSavingLimit, yetsResultDTO.housingSavingLimit) &&
        Objects.equals(this.creditCardEtcLimit, yetsResultDTO.creditCardEtcLimit) &&
        Objects.equals(this.labourIncomeTaxCreditAmount, yetsResultDTO.labourIncomeTaxCreditAmount) &&
        Objects.equals(this.childrenTaxCreditAmount, yetsResultDTO.childrenTaxCreditAmount) &&
        Objects.equals(this.lifeInsuranceAmount, yetsResultDTO.lifeInsuranceAmount) &&
        Objects.equals(this.medicalExpensesAmount, yetsResultDTO.medicalExpensesAmount) &&
        Objects.equals(this.standardTaxCredit, yetsResultDTO.standardTaxCredit) &&
        Objects.equals(this.labourIncomeTaxCreditLimit, yetsResultDTO.labourIncomeTaxCreditLimit) &&
        Objects.equals(this.childrenTaxCreditLimit, yetsResultDTO.childrenTaxCreditLimit) &&
        Objects.equals(this.lifeInsuranceLimit, yetsResultDTO.lifeInsuranceLimit) &&
        Objects.equals(this.medicalExpensesLimit, yetsResultDTO.medicalExpensesLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jumin, basicHumanDeductionAmount, additionalHumanDeductionAmount, nationalPensionAmount, healthInsuranceAmount, employmentInsuranceAmount, mortgageLoanAmount, privatePensionSavingAmount, housingSavingAmount, creditCardEtcAmount, basicHumanDeductionLimit, additionalHumanDeductionLimit, nationalPensionLimit, healthInsuranceLimit, employmentInsuranceLimit, mortgageLoanLimit, privatePensionSavingLimit, housingSavingLimit, creditCardEtcLimit, labourIncomeTaxCreditAmount, childrenTaxCreditAmount, lifeInsuranceAmount, medicalExpensesAmount, standardTaxCredit, labourIncomeTaxCreditLimit, childrenTaxCreditLimit, lifeInsuranceLimit, medicalExpensesLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YetsResultDTO {\n");
    
    sb.append("    jumin: ").append(toIndentedString(jumin)).append("\n");
    sb.append("    basicHumanDeductionAmount: ").append(toIndentedString(basicHumanDeductionAmount)).append("\n");
    sb.append("    additionalHumanDeductionAmount: ").append(toIndentedString(additionalHumanDeductionAmount)).append("\n");
    sb.append("    nationalPensionAmount: ").append(toIndentedString(nationalPensionAmount)).append("\n");
    sb.append("    healthInsuranceAmount: ").append(toIndentedString(healthInsuranceAmount)).append("\n");
    sb.append("    employmentInsuranceAmount: ").append(toIndentedString(employmentInsuranceAmount)).append("\n");
    sb.append("    mortgageLoanAmount: ").append(toIndentedString(mortgageLoanAmount)).append("\n");
    sb.append("    privatePensionSavingAmount: ").append(toIndentedString(privatePensionSavingAmount)).append("\n");
    sb.append("    housingSavingAmount: ").append(toIndentedString(housingSavingAmount)).append("\n");
    sb.append("    creditCardEtcAmount: ").append(toIndentedString(creditCardEtcAmount)).append("\n");
    sb.append("    basicHumanDeductionLimit: ").append(toIndentedString(basicHumanDeductionLimit)).append("\n");
    sb.append("    additionalHumanDeductionLimit: ").append(toIndentedString(additionalHumanDeductionLimit)).append("\n");
    sb.append("    nationalPensionLimit: ").append(toIndentedString(nationalPensionLimit)).append("\n");
    sb.append("    healthInsuranceLimit: ").append(toIndentedString(healthInsuranceLimit)).append("\n");
    sb.append("    employmentInsuranceLimit: ").append(toIndentedString(employmentInsuranceLimit)).append("\n");
    sb.append("    mortgageLoanLimit: ").append(toIndentedString(mortgageLoanLimit)).append("\n");
    sb.append("    privatePensionSavingLimit: ").append(toIndentedString(privatePensionSavingLimit)).append("\n");
    sb.append("    housingSavingLimit: ").append(toIndentedString(housingSavingLimit)).append("\n");
    sb.append("    creditCardEtcLimit: ").append(toIndentedString(creditCardEtcLimit)).append("\n");
    sb.append("    labourIncomeTaxCreditAmount: ").append(toIndentedString(labourIncomeTaxCreditAmount)).append("\n");
    sb.append("    childrenTaxCreditAmount: ").append(toIndentedString(childrenTaxCreditAmount)).append("\n");
    sb.append("    lifeInsuranceAmount: ").append(toIndentedString(lifeInsuranceAmount)).append("\n");
    sb.append("    medicalExpensesAmount: ").append(toIndentedString(medicalExpensesAmount)).append("\n");
    sb.append("    standardTaxCredit: ").append(toIndentedString(standardTaxCredit)).append("\n");
    sb.append("    labourIncomeTaxCreditLimit: ").append(toIndentedString(labourIncomeTaxCreditLimit)).append("\n");
    sb.append("    childrenTaxCreditLimit: ").append(toIndentedString(childrenTaxCreditLimit)).append("\n");
    sb.append("    lifeInsuranceLimit: ").append(toIndentedString(lifeInsuranceLimit)).append("\n");
    sb.append("    medicalExpensesLimit: ").append(toIndentedString(medicalExpensesLimit)).append("\n");
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

