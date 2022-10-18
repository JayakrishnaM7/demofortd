package com.ibm.org.model.termdeposit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateTermDepositFacilityRequestTermDepositFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:51.710Z[GMT]")

public class InitiateTermDepositFacilityRequestTermDepositFacility   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("BankBranchOrLocationReference")
  private Object bankBranchOrLocationReference;

  @JsonProperty("AccountType")
  private String accountType;

  @JsonProperty("AccountCurrency")
  private String accountCurrency;

  @JsonProperty("TaxReference")
  private Object taxReference;

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("Associations")
  private String associations;

  @JsonProperty("AssociationType")
  private String associationType;

  @JsonProperty("AssociationObligationOrEntitlement")
  private String associationObligationOrEntitlement;

  @JsonProperty("AssociationReference")
  private Object associationReference;

  @JsonProperty("LinkedAccounts")
  private String linkedAccounts;

  @JsonProperty("LinkType")
  private String linkType;

  @JsonProperty("AccountDetails")
  private String accountDetails;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("StatementsSchedule")
  private String statementsSchedule;

  @JsonProperty("StatementType")
  private String statementType;

  @JsonProperty("StatementTransactionType")
  private String statementTransactionType;

  @JsonProperty("StatementPeriod")
  private String statementPeriod;

  @JsonProperty("StatementReport")
  private String statementReport;

  public InitiateTermDepositFacilityRequestTermDepositFacility customerReference(Object customerReference) {
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

  public InitiateTermDepositFacilityRequestTermDepositFacility bankBranchOrLocationReference(Object bankBranchOrLocationReference) {
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

  public InitiateTermDepositFacilityRequestTermDepositFacility accountType(String accountType) {
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

  public InitiateTermDepositFacilityRequestTermDepositFacility accountCurrency(String accountCurrency) {
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

  public InitiateTermDepositFacilityRequestTermDepositFacility taxReference(Object taxReference) {
    this.taxReference = taxReference;
    return this;
  }

  /**
   * Get taxReference
   * @return taxReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(Object taxReference) {
    this.taxReference = taxReference;
  }

  public InitiateTermDepositFacilityRequestTermDepositFacility entitlementOptionSetting(String entitlementOptionSetting) {
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

  public InitiateTermDepositFacilityRequestTermDepositFacility restrictionOptionSetting(String restrictionOptionSetting) {
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

  public InitiateTermDepositFacilityRequestTermDepositFacility associations(String associations) {
    this.associations = associations;
    return this;
  }

  /**
   * Get associations
   * @return associations
  */
  @ApiModelProperty(value = "")


  public String getAssociations() {
    return associations;
  }

  public void setAssociations(String associations) {
    this.associations = associations;
  }

  public InitiateTermDepositFacilityRequestTermDepositFacility associationType(String associationType) {
    this.associationType = associationType;
    return this;
  }

  /**
   * Get associationType
   * @return associationType
  */
  @ApiModelProperty(value = "")


  public String getAssociationType() {
    return associationType;
  }

  public void setAssociationType(String associationType) {
    this.associationType = associationType;
  }

  public InitiateTermDepositFacilityRequestTermDepositFacility associationObligationOrEntitlement(String associationObligationOrEntitlement) {
    this.associationObligationOrEntitlement = associationObligationOrEntitlement;
    return this;
  }

  /**
   * Get associationObligationOrEntitlement
   * @return associationObligationOrEntitlement
  */
  @ApiModelProperty(value = "")


  public String getAssociationObligationOrEntitlement() {
    return associationObligationOrEntitlement;
  }

  public void setAssociationObligationOrEntitlement(String associationObligationOrEntitlement) {
    this.associationObligationOrEntitlement = associationObligationOrEntitlement;
  }

  public InitiateTermDepositFacilityRequestTermDepositFacility associationReference(Object associationReference) {
    this.associationReference = associationReference;
    return this;
  }

  /**
   * Get associationReference
   * @return associationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getAssociationReference() {
    return associationReference;
  }

  public void setAssociationReference(Object associationReference) {
    this.associationReference = associationReference;
  }

  public InitiateTermDepositFacilityRequestTermDepositFacility linkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
    return this;
  }

  /**
   * Get linkedAccounts
   * @return linkedAccounts
  */
  @ApiModelProperty(value = "")


  public String getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }

  public InitiateTermDepositFacilityRequestTermDepositFacility linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

  /**
   * Get linkType
   * @return linkType
  */
  @ApiModelProperty(value = "")


  public String getLinkType() {
    return linkType;
  }

  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }

  public InitiateTermDepositFacilityRequestTermDepositFacility accountDetails(String accountDetails) {
    this.accountDetails = accountDetails;
    return this;
  }

  /**
   * Get accountDetails
   * @return accountDetails
  */
  @ApiModelProperty(value = "")


  public String getAccountDetails() {
    return accountDetails;
  }

  public void setAccountDetails(String accountDetails) {
    this.accountDetails = accountDetails;
  }

  public InitiateTermDepositFacilityRequestTermDepositFacility positionLimitSettings(String positionLimitSettings) {
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

  public InitiateTermDepositFacilityRequestTermDepositFacility dateType(String dateType) {
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

  public InitiateTermDepositFacilityRequestTermDepositFacility statementsSchedule(String statementsSchedule) {
    this.statementsSchedule = statementsSchedule;
    return this;
  }

  /**
   * Get statementsSchedule
   * @return statementsSchedule
  */
  @ApiModelProperty(value = "")


  public String getStatementsSchedule() {
    return statementsSchedule;
  }

  public void setStatementsSchedule(String statementsSchedule) {
    this.statementsSchedule = statementsSchedule;
  }

  public InitiateTermDepositFacilityRequestTermDepositFacility statementType(String statementType) {
    this.statementType = statementType;
    return this;
  }

  /**
   * Get statementType
   * @return statementType
  */
  @ApiModelProperty(value = "")


  public String getStatementType() {
    return statementType;
  }

  public void setStatementType(String statementType) {
    this.statementType = statementType;
  }

  public InitiateTermDepositFacilityRequestTermDepositFacility statementTransactionType(String statementTransactionType) {
    this.statementTransactionType = statementTransactionType;
    return this;
  }

  /**
   * Get statementTransactionType
   * @return statementTransactionType
  */
  @ApiModelProperty(value = "")


  public String getStatementTransactionType() {
    return statementTransactionType;
  }

  public void setStatementTransactionType(String statementTransactionType) {
    this.statementTransactionType = statementTransactionType;
  }

  public InitiateTermDepositFacilityRequestTermDepositFacility statementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
    return this;
  }

  /**
   * Get statementPeriod
   * @return statementPeriod
  */
  @ApiModelProperty(value = "")


  public String getStatementPeriod() {
    return statementPeriod;
  }

  public void setStatementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
  }

  public InitiateTermDepositFacilityRequestTermDepositFacility statementReport(String statementReport) {
    this.statementReport = statementReport;
    return this;
  }

  /**
   * Get statementReport
   * @return statementReport
  */
  @ApiModelProperty(value = "")


  public String getStatementReport() {
    return statementReport;
  }

  public void setStatementReport(String statementReport) {
    this.statementReport = statementReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateTermDepositFacilityRequestTermDepositFacility initiateTermDepositFacilityRequestTermDepositFacility = (InitiateTermDepositFacilityRequestTermDepositFacility) o;
    return Objects.equals(this.customerReference, initiateTermDepositFacilityRequestTermDepositFacility.customerReference) &&
        Objects.equals(this.bankBranchOrLocationReference, initiateTermDepositFacilityRequestTermDepositFacility.bankBranchOrLocationReference) &&
        Objects.equals(this.accountType, initiateTermDepositFacilityRequestTermDepositFacility.accountType) &&
        Objects.equals(this.accountCurrency, initiateTermDepositFacilityRequestTermDepositFacility.accountCurrency) &&
        Objects.equals(this.taxReference, initiateTermDepositFacilityRequestTermDepositFacility.taxReference) &&
        Objects.equals(this.entitlementOptionSetting, initiateTermDepositFacilityRequestTermDepositFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionSetting, initiateTermDepositFacilityRequestTermDepositFacility.restrictionOptionSetting) &&
        Objects.equals(this.associations, initiateTermDepositFacilityRequestTermDepositFacility.associations) &&
        Objects.equals(this.associationType, initiateTermDepositFacilityRequestTermDepositFacility.associationType) &&
        Objects.equals(this.associationObligationOrEntitlement, initiateTermDepositFacilityRequestTermDepositFacility.associationObligationOrEntitlement) &&
        Objects.equals(this.associationReference, initiateTermDepositFacilityRequestTermDepositFacility.associationReference) &&
        Objects.equals(this.linkedAccounts, initiateTermDepositFacilityRequestTermDepositFacility.linkedAccounts) &&
        Objects.equals(this.linkType, initiateTermDepositFacilityRequestTermDepositFacility.linkType) &&
        Objects.equals(this.accountDetails, initiateTermDepositFacilityRequestTermDepositFacility.accountDetails) &&
        Objects.equals(this.positionLimitSettings, initiateTermDepositFacilityRequestTermDepositFacility.positionLimitSettings) &&
        Objects.equals(this.dateType, initiateTermDepositFacilityRequestTermDepositFacility.dateType) &&
        Objects.equals(this.statementsSchedule, initiateTermDepositFacilityRequestTermDepositFacility.statementsSchedule) &&
        Objects.equals(this.statementType, initiateTermDepositFacilityRequestTermDepositFacility.statementType) &&
        Objects.equals(this.statementTransactionType, initiateTermDepositFacilityRequestTermDepositFacility.statementTransactionType) &&
        Objects.equals(this.statementPeriod, initiateTermDepositFacilityRequestTermDepositFacility.statementPeriod) &&
        Objects.equals(this.statementReport, initiateTermDepositFacilityRequestTermDepositFacility.statementReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, bankBranchOrLocationReference, accountType, accountCurrency, taxReference, entitlementOptionSetting, restrictionOptionSetting, associations, associationType, associationObligationOrEntitlement, associationReference, linkedAccounts, linkType, accountDetails, positionLimitSettings, dateType, statementsSchedule, statementType, statementTransactionType, statementPeriod, statementReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateTermDepositFacilityRequestTermDepositFacility {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchOrLocationReference: ").append(toIndentedString(bankBranchOrLocationReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    associationObligationOrEntitlement: ").append(toIndentedString(associationObligationOrEntitlement)).append("\n");
    sb.append("    associationReference: ").append(toIndentedString(associationReference)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    statementsSchedule: ").append(toIndentedString(statementsSchedule)).append("\n");
    sb.append("    statementType: ").append(toIndentedString(statementType)).append("\n");
    sb.append("    statementTransactionType: ").append(toIndentedString(statementTransactionType)).append("\n");
    sb.append("    statementPeriod: ").append(toIndentedString(statementPeriod)).append("\n");
    sb.append("    statementReport: ").append(toIndentedString(statementReport)).append("\n");
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

