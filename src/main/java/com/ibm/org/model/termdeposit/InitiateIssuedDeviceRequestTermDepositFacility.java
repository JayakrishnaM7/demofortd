package com.ibm.org.model.termdeposit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateIssuedDeviceRequestTermDepositFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:51.710Z[GMT]")

public class InitiateIssuedDeviceRequestTermDepositFacility   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("TermDepositAccountNumber")
  private String termDepositAccountNumber;

  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("BankBranchOrLocationReference")
  private Object bankBranchOrLocationReference;

  @JsonProperty("AccountType")
  private String accountType;

  @JsonProperty("AccountCurrency")
  private String accountCurrency;

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("PositionLimitValue")
  private String positionLimitValue;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateIssuedDeviceRequestTermDepositFacility productInstanceReference(Object productInstanceReference) {
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

  public InitiateIssuedDeviceRequestTermDepositFacility termDepositAccountNumber(String termDepositAccountNumber) {
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

  public InitiateIssuedDeviceRequestTermDepositFacility customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public InitiateIssuedDeviceRequestTermDepositFacility bankBranchOrLocationReference(Object bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
    return this;
  }

  /**
   * Get bankBranchOrLocationReference
   * @return bankBranchOrLocationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBankBranchOrLocationReference() {
    return bankBranchOrLocationReference;
  }

  public void setBankBranchOrLocationReference(Object bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
  }

  public InitiateIssuedDeviceRequestTermDepositFacility accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @ApiModelProperty(value = "")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public InitiateIssuedDeviceRequestTermDepositFacility accountCurrency(String accountCurrency) {
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

  public InitiateIssuedDeviceRequestTermDepositFacility entitlementOptionSetting(String entitlementOptionSetting) {
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

  public InitiateIssuedDeviceRequestTermDepositFacility restrictionOptionSetting(String restrictionOptionSetting) {
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

  public InitiateIssuedDeviceRequestTermDepositFacility positionLimitValue(String positionLimitValue) {
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

  public InitiateIssuedDeviceRequestTermDepositFacility dateType(String dateType) {
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
    InitiateIssuedDeviceRequestTermDepositFacility initiateIssuedDeviceRequestTermDepositFacility = (InitiateIssuedDeviceRequestTermDepositFacility) o;
    return Objects.equals(this.productInstanceReference, initiateIssuedDeviceRequestTermDepositFacility.productInstanceReference) &&
        Objects.equals(this.termDepositAccountNumber, initiateIssuedDeviceRequestTermDepositFacility.termDepositAccountNumber) &&
        Objects.equals(this.customerReference, initiateIssuedDeviceRequestTermDepositFacility.customerReference) &&
        Objects.equals(this.bankBranchOrLocationReference, initiateIssuedDeviceRequestTermDepositFacility.bankBranchOrLocationReference) &&
        Objects.equals(this.accountType, initiateIssuedDeviceRequestTermDepositFacility.accountType) &&
        Objects.equals(this.accountCurrency, initiateIssuedDeviceRequestTermDepositFacility.accountCurrency) &&
        Objects.equals(this.entitlementOptionSetting, initiateIssuedDeviceRequestTermDepositFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionSetting, initiateIssuedDeviceRequestTermDepositFacility.restrictionOptionSetting) &&
        Objects.equals(this.positionLimitValue, initiateIssuedDeviceRequestTermDepositFacility.positionLimitValue) &&
        Objects.equals(this.dateType, initiateIssuedDeviceRequestTermDepositFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, termDepositAccountNumber, customerReference, bankBranchOrLocationReference, accountType, accountCurrency, entitlementOptionSetting, restrictionOptionSetting, positionLimitValue, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIssuedDeviceRequestTermDepositFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    termDepositAccountNumber: ").append(toIndentedString(termDepositAccountNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchOrLocationReference: ").append(toIndentedString(bankBranchOrLocationReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
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

