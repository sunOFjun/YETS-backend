package com.sj.yets.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HumanDeductionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class HumanDeductionDTO   {
  @JsonProperty("jumin")
  private String jumin = null;

  @JsonProperty("myself")
  private Integer myself;

  @JsonProperty("spouseYn")
  private String spouseYn;

  @JsonProperty("parents")
  private Integer parents;

  @JsonProperty("children")
  private Integer children;

  @JsonProperty("exceptChildren")
  private Integer exceptChildren;

  @JsonProperty("sibling")
  private Integer sibling;

  @JsonProperty("seniority")
  private Integer seniority;

  @JsonProperty("disabled")
  private Integer disabled;

  @JsonProperty("women")
  private Integer women;

  public HumanDeductionDTO jumin(String jumin) {
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

  public HumanDeductionDTO myself(Integer myself) {
    this.myself = myself;
    return this;
  }

  /**
   * Get myself
   * @return myself
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getMyself() {
    return myself;
  }

  public void setMyself(Integer myself) {
    this.myself = myself;
  }

  public HumanDeductionDTO spouseYn(String spouseYn) {
    this.spouseYn = spouseYn;
    return this;
  }

  /**
   * Get spouseYn
   * @return spouseYn
  */
  @ApiModelProperty(value = "")


  public String getSpouseYn() {
    return spouseYn;
  }

  public void setSpouseYn(String spouseYn) {
    this.spouseYn = spouseYn;
  }

  public HumanDeductionDTO parents(Integer parents) {
    this.parents = parents;
    return this;
  }

  /**
   * Get parents
   * @return parents
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getParents() {
    return parents;
  }

  public void setParents(Integer parents) {
    this.parents = parents;
  }

  public HumanDeductionDTO children(Integer children) {
    this.children = children;
    return this;
  }

  /**
   * Get children
   * @return children
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getChildren() {
    return children;
  }

  public void setChildren(Integer children) {
    this.children = children;
  }

  public HumanDeductionDTO exceptChildren(Integer exceptChildren) {
    this.exceptChildren = exceptChildren;
    return this;
  }

  /**
   * Get exceptChildren
   * @return exceptChildren
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getExceptChildren() {
    return exceptChildren;
  }

  public void setExceptChildren(Integer exceptChildren) {
    this.exceptChildren = exceptChildren;
  }

  public HumanDeductionDTO sibling(Integer sibling) {
    this.sibling = sibling;
    return this;
  }

  /**
   * Get sibling
   * @return sibling
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getSibling() {
    return sibling;
  }

  public void setSibling(Integer sibling) {
    this.sibling = sibling;
  }

  public HumanDeductionDTO seniority(Integer seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * Get seniority
   * @return seniority
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getSeniority() {
    return seniority;
  }

  public void setSeniority(Integer seniority) {
    this.seniority = seniority;
  }

  public HumanDeductionDTO disabled(Integer disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   * @return disabled
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getDisabled() {
    return disabled;
  }

  public void setDisabled(Integer disabled) {
    this.disabled = disabled;
  }

  public HumanDeductionDTO women(Integer women) {
    this.women = women;
    return this;
  }

  /**
   * Get women
   * @return women
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getWomen() {
    return women;
  }

  public void setWomen(Integer women) {
    this.women = women;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HumanDeductionDTO humanDeductionDTO = (HumanDeductionDTO) o;
    return Objects.equals(this.jumin, humanDeductionDTO.jumin) &&
        Objects.equals(this.myself, humanDeductionDTO.myself) &&
        Objects.equals(this.spouseYn, humanDeductionDTO.spouseYn) &&
        Objects.equals(this.parents, humanDeductionDTO.parents) &&
        Objects.equals(this.children, humanDeductionDTO.children) &&
        Objects.equals(this.exceptChildren, humanDeductionDTO.exceptChildren) &&
        Objects.equals(this.sibling, humanDeductionDTO.sibling) &&
        Objects.equals(this.seniority, humanDeductionDTO.seniority) &&
        Objects.equals(this.disabled, humanDeductionDTO.disabled) &&
        Objects.equals(this.women, humanDeductionDTO.women);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jumin, myself, spouseYn, parents, children, exceptChildren, sibling, seniority, disabled, women);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HumanDeductionDTO {\n");
    
    sb.append("    jumin: ").append(toIndentedString(jumin)).append("\n");
    sb.append("    myself: ").append(toIndentedString(myself)).append("\n");
    sb.append("    spouseYn: ").append(toIndentedString(spouseYn)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    exceptChildren: ").append(toIndentedString(exceptChildren)).append("\n");
    sb.append("    sibling: ").append(toIndentedString(sibling)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    women: ").append(toIndentedString(women)).append("\n");
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

