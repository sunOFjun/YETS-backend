package com.sj.yets.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaxCreditDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TaxCreditDTO   {
  @JsonProperty("jumin")
  private String jumin = null;

  @JsonProperty("childrenTaxCreditNumber")
  private Integer childrenTaxCreditNumber;

  @JsonProperty("birthFirst")
  private Integer birthFirst;

  @JsonProperty("birthSecond")
  private Integer birthSecond;

  @JsonProperty("birthThirdUp")
  private Integer birthThirdUp;

  @JsonProperty("lifeInsurance")
  private Integer lifeInsurance;

  @JsonProperty("medicalInfertility")
  private Integer medicalInfertility;

  @JsonProperty("medicalPremie")
  private Integer medicalPremie;

  @JsonProperty("medicalSpecial")
  private Integer medicalSpecial;

  @JsonProperty("medicalGeneral")
  private Integer medicalGeneral;

  @JsonProperty("actualMedicalExpenses")
  private Integer actualMedicalExpenses;

  public TaxCreditDTO jumin(String jumin) {
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

  public TaxCreditDTO childrenTaxCreditNumber(Integer childrenTaxCreditNumber) {
    this.childrenTaxCreditNumber = childrenTaxCreditNumber;
    return this;
  }

  /**
   * Get childrenTaxCreditNumber
   * @return childrenTaxCreditNumber
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getChildrenTaxCreditNumber() {
    return childrenTaxCreditNumber;
  }

  public void setChildrenTaxCreditNumber(Integer childrenTaxCreditNumber) {
    this.childrenTaxCreditNumber = childrenTaxCreditNumber;
  }

  public TaxCreditDTO birthFirst(Integer birthFirst) {
    this.birthFirst = birthFirst;
    return this;
  }

  /**
   * Get birthFirst
   * @return birthFirst
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getBirthFirst() {
    return birthFirst;
  }

  public void setBirthFirst(Integer birthFirst) {
    this.birthFirst = birthFirst;
  }

  public TaxCreditDTO birthSecond(Integer birthSecond) {
    this.birthSecond = birthSecond;
    return this;
  }

  /**
   * Get birthSecond
   * @return birthSecond
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getBirthSecond() {
    return birthSecond;
  }

  public void setBirthSecond(Integer birthSecond) {
    this.birthSecond = birthSecond;
  }

  public TaxCreditDTO birthThirdUp(Integer birthThirdUp) {
    this.birthThirdUp = birthThirdUp;
    return this;
  }

  /**
   * Get birthThirdUp
   * @return birthThirdUp
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getBirthThirdUp() {
    return birthThirdUp;
  }

  public void setBirthThirdUp(Integer birthThirdUp) {
    this.birthThirdUp = birthThirdUp;
  }

  public TaxCreditDTO lifeInsurance(Integer lifeInsurance) {
    this.lifeInsurance = lifeInsurance;
    return this;
  }

  /**
   * Get lifeInsurance
   * @return lifeInsurance
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getLifeInsurance() {
    return lifeInsurance;
  }

  public void setLifeInsurance(Integer lifeInsurance) {
    this.lifeInsurance = lifeInsurance;
  }

  public TaxCreditDTO medicalInfertility(Integer medicalInfertility) {
    this.medicalInfertility = medicalInfertility;
    return this;
  }

  /**
   * Get medicalInfertility
   * @return medicalInfertility
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getMedicalInfertility() {
    return medicalInfertility;
  }

  public void setMedicalInfertility(Integer medicalInfertility) {
    this.medicalInfertility = medicalInfertility;
  }

  public TaxCreditDTO medicalPremie(Integer medicalPremie) {
    this.medicalPremie = medicalPremie;
    return this;
  }

  /**
   * Get medicalPremie
   * @return medicalPremie
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getMedicalPremie() {
    return medicalPremie;
  }

  public void setMedicalPremie(Integer medicalPremie) {
    this.medicalPremie = medicalPremie;
  }

  public TaxCreditDTO medicalSpecial(Integer medicalSpecial) {
    this.medicalSpecial = medicalSpecial;
    return this;
  }

  /**
   * Get medicalSpecial
   * @return medicalSpecial
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getMedicalSpecial() {
    return medicalSpecial;
  }

  public void setMedicalSpecial(Integer medicalSpecial) {
    this.medicalSpecial = medicalSpecial;
  }

  public TaxCreditDTO medicalGeneral(Integer medicalGeneral) {
    this.medicalGeneral = medicalGeneral;
    return this;
  }

  /**
   * Get medicalGeneral
   * @return medicalGeneral
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getMedicalGeneral() {
    return medicalGeneral;
  }

  public void setMedicalGeneral(Integer medicalGeneral) {
    this.medicalGeneral = medicalGeneral;
  }

  public TaxCreditDTO actualMedicalExpenses(Integer actualMedicalExpenses) {
    this.actualMedicalExpenses = actualMedicalExpenses;
    return this;
  }

  /**
   * Get actualMedicalExpenses
   * @return actualMedicalExpenses
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getActualMedicalExpenses() {
    return actualMedicalExpenses;
  }

  public void setActualMedicalExpenses(Integer actualMedicalExpenses) {
    this.actualMedicalExpenses = actualMedicalExpenses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxCreditDTO taxCreditDTO = (TaxCreditDTO) o;
    return Objects.equals(this.jumin, taxCreditDTO.jumin) &&
        Objects.equals(this.childrenTaxCreditNumber, taxCreditDTO.childrenTaxCreditNumber) &&
        Objects.equals(this.birthFirst, taxCreditDTO.birthFirst) &&
        Objects.equals(this.birthSecond, taxCreditDTO.birthSecond) &&
        Objects.equals(this.birthThirdUp, taxCreditDTO.birthThirdUp) &&
        Objects.equals(this.lifeInsurance, taxCreditDTO.lifeInsurance) &&
        Objects.equals(this.medicalInfertility, taxCreditDTO.medicalInfertility) &&
        Objects.equals(this.medicalPremie, taxCreditDTO.medicalPremie) &&
        Objects.equals(this.medicalSpecial, taxCreditDTO.medicalSpecial) &&
        Objects.equals(this.medicalGeneral, taxCreditDTO.medicalGeneral) &&
        Objects.equals(this.actualMedicalExpenses, taxCreditDTO.actualMedicalExpenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jumin, childrenTaxCreditNumber, birthFirst, birthSecond, birthThirdUp, lifeInsurance, medicalInfertility, medicalPremie, medicalSpecial, medicalGeneral, actualMedicalExpenses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxCreditDTO {\n");
    
    sb.append("    jumin: ").append(toIndentedString(jumin)).append("\n");
    sb.append("    childrenTaxCreditNumber: ").append(toIndentedString(childrenTaxCreditNumber)).append("\n");
    sb.append("    birthFirst: ").append(toIndentedString(birthFirst)).append("\n");
    sb.append("    birthSecond: ").append(toIndentedString(birthSecond)).append("\n");
    sb.append("    birthThirdUp: ").append(toIndentedString(birthThirdUp)).append("\n");
    sb.append("    lifeInsurance: ").append(toIndentedString(lifeInsurance)).append("\n");
    sb.append("    medicalInfertility: ").append(toIndentedString(medicalInfertility)).append("\n");
    sb.append("    medicalPremie: ").append(toIndentedString(medicalPremie)).append("\n");
    sb.append("    medicalSpecial: ").append(toIndentedString(medicalSpecial)).append("\n");
    sb.append("    medicalGeneral: ").append(toIndentedString(medicalGeneral)).append("\n");
    sb.append("    actualMedicalExpenses: ").append(toIndentedString(actualMedicalExpenses)).append("\n");
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

