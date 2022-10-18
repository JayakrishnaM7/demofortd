package com.ibm.org.model.termdeposit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateTermDepositFacilityResponseTermDepositFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:51.710Z[GMT]")

public class InitiateTermDepositFacilityResponseTermDepositFacility   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("TermDepositAccountNumber")
  private String termDepositAccountNumber;

  @JsonProperty("AccountCurrency")
  private String accountCurrency;

  @JsonProperty("EntitlementOptionDefinition")
  private String entitlementOptionDefinition;

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting;

  @JsonProperty("RestrictionOptionDefinition")
  private String restrictionOptionDefinition;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("PositionLimitType")
  private String positionLimitType;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings;

  @JsonProperty("PositionLimitValue")
  private String positionLimitValue;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateTermDepositFacilityResponseTermDepositFacility productInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * Get productInstanceReference
   * @return productInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public InitiateTermDepositFacilityResponseTermDepositFacility termDepositAccountNumber(String termDepositAccountNumber) {
    this.termDepositAccountNumber = termDepositAccountNumber;
    return this;
  }

  /**
   * Get termDepositAccountNumber
   * @return termDepositAccountNumber
  */
  @ApiModelProperty(value = "")


  public String getTermDepositAccountNumber() {
    return termDepositAccountNumber;
  }

  public void setTermDepositAccountNumber(String termDepositAccountNumber) {
    this.termDepositAccountNumber = termDepositAccountNumber;
  }

  public InitiateTermDepositFacilityResponseTermDepositFacility accountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
    return this;
  }

  /**
   * Get accountCurrency
   * @return accountCurrency
  */
  @ApiModelProperty(value = "")


  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }

  public InitiateTermDepositFacilityResponseTermDepositFacility entitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
    return this;
  }

  /**
   * Get entitlementOptionDefinition
   * @return entitlementOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }

  public InitiateTermDepositFacilityResponseTermDepositFacility entitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
    return this;
  }

  /**
   * Get entitlementOptionSetting
   * @return entitlementOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }

  public InitiateTermDepositFacilityResponseTermDepositFacility restrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
    return this;
  }

  /**
   * Get restrictionOptionDefinition
   * @return restrictionOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }

  public InitiateTermDepositFacilityResponseTermDepositFacility restrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
    return this;
  }

  /**
   * Get restrictionOptionSetting
   * @return restrictionOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }

  public InitiateTermDepositFacilityResponseTermDepositFacility positionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
    return this;
  }

  /**
   * Get positionLimitType
   * @return positionLimitType
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitType() {
    return positionLimitType;
  }

  public void setPositionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
  }

  public InitiateTermDepositFacilityResponseTermDepositFacility positionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
    return this;
  }

  /**
   * Get positionLimitSettings
   * @return positionLimitSettings
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitSettings() {
    return positionLimitSettings;
  }

  public void setPositionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
  }

  public InitiateTermDepositFacilityResponseTermDepositFacility positionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
    return this;
  }

  /**
   * Get positionLimitValue
   * @return positionLimitValue
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitValue() {
    return positionLimitValue;
  }

  public void setPositionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
  }

  public InitiateTermDepositFacilityResponseTermDepositFacility dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateTermDepositFacilityResponseTermDepositFacility initiateTermDepositFacilityResponseTermDepositFacility = (InitiateTermDepositFacilityResponseTermDepositFacility) o;
    return Objects.equals(this.productInstanceReference, initiateTermDepositFacilityResponseTermDepositFacility.productInstanceReference) &&
        Objects.equals(this.termDepositAccountNumber, initiateTermDepositFacilityResponseTermDepositFacility.termDepositAccountNumber) &&
        Objects.equals(this.accountCurrency, initiateTermDepositFacilityResponseTermDepositFacility.accountCurrency) &&
        Objects.equals(this.entitlementOptionDefinition, initiateTermDepositFacilityResponseTermDepositFacility.entitlementOptionDefinition) &&
        Objects.equals(this.entitlementOptionSetting, initiateTermDepositFacilityResponseTermDepositFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionDefinition, initiateTermDepositFacilityResponseTermDepositFacility.restrictionOptionDefinition) &&
        Objects.equals(this.restrictionOptionSetting, initiateTermDepositFacilityResponseTermDepositFacility.restrictionOptionSetting) &&
        Objects.equals(this.positionLimitType, initiateTermDepositFacilityResponseTermDepositFacility.positionLimitType) &&
        Objects.equals(this.positionLimitSettings, initiateTermDepositFacilityResponseTermDepositFacility.positionLimitSettings) &&
        Objects.equals(this.positionLimitValue, initiateTermDepositFacilityResponseTermDepositFacility.positionLimitValue) &&
        Objects.equals(this.dateType, initiateTermDepositFacilityResponseTermDepositFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, termDepositAccountNumber, accountCurrency, entitlementOptionDefinition, entitlementOptionSetting, restrictionOptionDefinition, restrictionOptionSetting, positionLimitType, positionLimitSettings, positionLimitValue, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateTermDepositFacilityResponseTermDepositFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    termDepositAccountNumber: ").append(toIndentedString(termDepositAccountNumber)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    entitlementOptionDefinition: ").append(toIndentedString(entitlementOptionDefinition)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionDefinition: ").append(toIndentedString(restrictionOptionDefinition)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    positionLimitType: ").append(toIndentedString(positionLimitType)).append("\n");
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

