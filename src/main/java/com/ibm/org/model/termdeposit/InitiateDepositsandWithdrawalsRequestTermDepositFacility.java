package com.ibm.org.model.termdeposit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateDepositsandWithdrawalsRequestTermDepositFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:51.710Z[GMT]")

public class InitiateDepositsandWithdrawalsRequestTermDepositFacility   {
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

  @JsonProperty("PositionLimitType")
  private String positionLimitType;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateDepositsandWithdrawalsRequestTermDepositFacility productInstanceReference(Object productInstanceReference) {
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

  public InitiateDepositsandWithdrawalsRequestTermDepositFacility termDepositAccountNumber(String termDepositAccountNumber) {
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

  public InitiateDepositsandWithdrawalsRequestTermDepositFacility customerReference(Object customerReference) {
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

  public InitiateDepositsandWithdrawalsRequestTermDepositFacility bankBranchOrLocationReference(Object bankBranchOrLocationReference) {
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

  public InitiateDepositsandWithdrawalsRequestTermDepositFacility accountType(String accountType) {
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

  public InitiateDepositsandWithdrawalsRequestTermDepositFacility accountCurrency(String accountCurrency) {
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

  public InitiateDepositsandWithdrawalsRequestTermDepositFacility entitlementOptionSetting(String entitlementOptionSetting) {
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

  public InitiateDepositsandWithdrawalsRequestTermDepositFacility restrictionOptionSetting(String restrictionOptionSetting) {
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

  public InitiateDepositsandWithdrawalsRequestTermDepositFacility positionLimitType(String positionLimitType) {
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

  public InitiateDepositsandWithdrawalsRequestTermDepositFacility dateType(String dateType) {
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
    InitiateDepositsandWithdrawalsRequestTermDepositFacility initiateDepositsandWithdrawalsRequestTermDepositFacility = (InitiateDepositsandWithdrawalsRequestTermDepositFacility) o;
    return Objects.equals(this.productInstanceReference, initiateDepositsandWithdrawalsRequestTermDepositFacility.productInstanceReference) &&
        Objects.equals(this.termDepositAccountNumber, initiateDepositsandWithdrawalsRequestTermDepositFacility.termDepositAccountNumber) &&
        Objects.equals(this.customerReference, initiateDepositsandWithdrawalsRequestTermDepositFacility.customerReference) &&
        Objects.equals(this.bankBranchOrLocationReference, initiateDepositsandWithdrawalsRequestTermDepositFacility.bankBranchOrLocationReference) &&
        Objects.equals(this.accountType, initiateDepositsandWithdrawalsRequestTermDepositFacility.accountType) &&
        Objects.equals(this.accountCurrency, initiateDepositsandWithdrawalsRequestTermDepositFacility.accountCurrency) &&
        Objects.equals(this.entitlementOptionSetting, initiateDepositsandWithdrawalsRequestTermDepositFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionSetting, initiateDepositsandWithdrawalsRequestTermDepositFacility.restrictionOptionSetting) &&
        Objects.equals(this.positionLimitType, initiateDepositsandWithdrawalsRequestTermDepositFacility.positionLimitType) &&
        Objects.equals(this.dateType, initiateDepositsandWithdrawalsRequestTermDepositFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, termDepositAccountNumber, customerReference, bankBranchOrLocationReference, accountType, accountCurrency, entitlementOptionSetting, restrictionOptionSetting, positionLimitType, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDepositsandWithdrawalsRequestTermDepositFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    termDepositAccountNumber: ").append(toIndentedString(termDepositAccountNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchOrLocationReference: ").append(toIndentedString(bankBranchOrLocationReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    positionLimitType: ").append(toIndentedString(positionLimitType)).append("\n");
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

