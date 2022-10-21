package com.sj.yets.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BasicInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BasicInfoDTO   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("jumin")
  private String jumin = null;

  @JsonProperty("totalIncome")
  private Integer totalIncome;

  @JsonProperty("paidTax")
  private Integer paidTax;

  @JsonProperty("labourIncome")
  private Integer labourIncome;

  @JsonProperty("taxBase")
  private Integer taxBase;

  @JsonProperty("calculatedTax")
  private Integer calculatedTax;

  @JsonProperty("determinedTax")
  private Integer determinedTax;

  @JsonProperty("taxPayable")
  private Integer taxPayable;

  public BasicInfoDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BasicInfoDTO jumin(String jumin) {
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

  public BasicInfoDTO totalIncome(Integer totalIncome) {
    this.totalIncome = totalIncome;
    return this;
  }

  /**
   * Get totalIncome
   * @return totalIncome
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getTotalIncome() {
    return totalIncome;
  }

  public void setTotalIncome(Integer totalIncome) {
    this.totalIncome = totalIncome;
  }

  public BasicInfoDTO paidTax(Integer paidTax) {
    this.paidTax = paidTax;
    return this;
  }

  /**
   * Get paidTax
   * @return paidTax
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getPaidTax() {
    return paidTax;
  }

  public void setPaidTax(Integer paidTax) {
    this.paidTax = paidTax;
  }

  public BasicInfoDTO labourIncome(Integer labourIncome) {
    this.labourIncome = labourIncome;
    return this;
  }

  /**
   * Get labourIncome
   * @return labourIncome
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getLabourIncome() {
    return labourIncome;
  }

  public void setLabourIncome(Integer labourIncome) {
    this.labourIncome = labourIncome;
  }

  public BasicInfoDTO taxBase(Integer taxBase) {
    this.taxBase = taxBase;
    return this;
  }

  /**
   * Get taxBase
   * @return taxBase
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getTaxBase() {
    return taxBase;
  }

  public void setTaxBase(Integer taxBase) {
    this.taxBase = taxBase;
  }

  public BasicInfoDTO calculatedTax(Integer calculatedTax) {
    this.calculatedTax = calculatedTax;
    return this;
  }

  /**
   * Get calculatedTax
   * @return calculatedTax
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getCalculatedTax() {
    return calculatedTax;
  }

  public void setCalculatedTax(Integer calculatedTax) {
    this.calculatedTax = calculatedTax;
  }

  public BasicInfoDTO determinedTax(Integer determinedTax) {
    this.determinedTax = determinedTax;
    return this;
  }

  /**
   * Get determinedTax
   * @return determinedTax
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getDeterminedTax() {
    return determinedTax;
  }

  public void setDeterminedTax(Integer determinedTax) {
    this.determinedTax = determinedTax;
  }

  public BasicInfoDTO taxPayable(Integer taxPayable) {
    this.taxPayable = taxPayable;
    return this;
  }

  /**
   * Get taxPayable
   * @return taxPayable
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getTaxPayable() {
    return taxPayable;
  }

  public void setTaxPayable(Integer taxPayable) {
    this.taxPayable = taxPayable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicInfoDTO basicInfoDTO = (BasicInfoDTO) o;
    return Objects.equals(this.name, basicInfoDTO.name) &&
        Objects.equals(this.jumin, basicInfoDTO.jumin) &&
        Objects.equals(this.totalIncome, basicInfoDTO.totalIncome) &&
        Objects.equals(this.paidTax, basicInfoDTO.paidTax) &&
        Objects.equals(this.labourIncome, basicInfoDTO.labourIncome) &&
        Objects.equals(this.taxBase, basicInfoDTO.taxBase) &&
        Objects.equals(this.calculatedTax, basicInfoDTO.calculatedTax) &&
        Objects.equals(this.determinedTax, basicInfoDTO.determinedTax) &&
        Objects.equals(this.taxPayable, basicInfoDTO.taxPayable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, jumin, totalIncome, paidTax, labourIncome, taxBase, calculatedTax, determinedTax, taxPayable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicInfoDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    jumin: ").append(toIndentedString(jumin)).append("\n");
    sb.append("    totalIncome: ").append(toIndentedString(totalIncome)).append("\n");
    sb.append("    paidTax: ").append(toIndentedString(paidTax)).append("\n");
    sb.append("    labourIncome: ").append(toIndentedString(labourIncome)).append("\n");
    sb.append("    taxBase: ").append(toIndentedString(taxBase)).append("\n");
    sb.append("    calculatedTax: ").append(toIndentedString(calculatedTax)).append("\n");
    sb.append("    determinedTax: ").append(toIndentedString(determinedTax)).append("\n");
    sb.append("    taxPayable: ").append(toIndentedString(taxPayable)).append("\n");
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

