package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateSessionResponseCustomerContactOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class InitiateSessionResponseCustomerContactOperatingSession   {
  @JsonProperty("CustomerContactRecordAuthenticationStatus")
  private String customerContactRecordAuthenticationStatus;

  @JsonProperty("CustomerContactRecordRoutingSelectionStatus")
  private String customerContactRecordRoutingSelectionStatus;

  @JsonProperty("CustomerContactRecordActivityRecord")
  private String customerContactRecordActivityRecord;

  @JsonProperty("CustomerSessionDialogueReference")
  private Object customerSessionDialogueReference;

  @JsonProperty("CustomerSessionDialogueRecord")
  private String customerSessionDialogueRecord;

  @JsonProperty("CustomerContactRecordDuration")
  private String customerContactRecordDuration;

  @JsonProperty("CustomerContactRecordResult")
  private String customerContactRecordResult;

  public InitiateSessionResponseCustomerContactOperatingSession customerContactRecordAuthenticationStatus(String customerContactRecordAuthenticationStatus) {
    this.customerContactRecordAuthenticationStatus = customerContactRecordAuthenticationStatus;
    return this;
  }

  /**
   * Get customerContactRecordAuthenticationStatus
   * @return customerContactRecordAuthenticationStatus
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactRecordAuthenticationStatus() {
    return customerContactRecordAuthenticationStatus;
  }

  public void setCustomerContactRecordAuthenticationStatus(String customerContactRecordAuthenticationStatus) {
    this.customerContactRecordAuthenticationStatus = customerContactRecordAuthenticationStatus;
  }

  public InitiateSessionResponseCustomerContactOperatingSession customerContactRecordRoutingSelectionStatus(String customerContactRecordRoutingSelectionStatus) {
    this.customerContactRecordRoutingSelectionStatus = customerContactRecordRoutingSelectionStatus;
    return this;
  }

  /**
   * Get customerContactRecordRoutingSelectionStatus
   * @return customerContactRecordRoutingSelectionStatus
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactRecordRoutingSelectionStatus() {
    return customerContactRecordRoutingSelectionStatus;
  }

  public void setCustomerContactRecordRoutingSelectionStatus(String customerContactRecordRoutingSelectionStatus) {
    this.customerContactRecordRoutingSelectionStatus = customerContactRecordRoutingSelectionStatus;
  }

  public InitiateSessionResponseCustomerContactOperatingSession customerContactRecordActivityRecord(String customerContactRecordActivityRecord) {
    this.customerContactRecordActivityRecord = customerContactRecordActivityRecord;
    return this;
  }

  /**
   * Get customerContactRecordActivityRecord
   * @return customerContactRecordActivityRecord
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactRecordActivityRecord() {
    return customerContactRecordActivityRecord;
  }

  public void setCustomerContactRecordActivityRecord(String customerContactRecordActivityRecord) {
    this.customerContactRecordActivityRecord = customerContactRecordActivityRecord;
  }

  public InitiateSessionResponseCustomerContactOperatingSession customerSessionDialogueReference(Object customerSessionDialogueReference) {
    this.customerSessionDialogueReference = customerSessionDialogueReference;
    return this;
  }

  /**
   * Get customerSessionDialogueReference
   * @return customerSessionDialogueReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerSessionDialogueReference() {
    return customerSessionDialogueReference;
  }

  public void setCustomerSessionDialogueReference(Object customerSessionDialogueReference) {
    this.customerSessionDialogueReference = customerSessionDialogueReference;
  }

  public InitiateSessionResponseCustomerContactOperatingSession customerSessionDialogueRecord(String customerSessionDialogueRecord) {
    this.customerSessionDialogueRecord = customerSessionDialogueRecord;
    return this;
  }

  /**
   * Get customerSessionDialogueRecord
   * @return customerSessionDialogueRecord
  */
  @ApiModelProperty(value = "")


  public String getCustomerSessionDialogueRecord() {
    return customerSessionDialogueRecord;
  }

  public void setCustomerSessionDialogueRecord(String customerSessionDialogueRecord) {
    this.customerSessionDialogueRecord = customerSessionDialogueRecord;
  }

  public InitiateSessionResponseCustomerContactOperatingSession customerContactRecordDuration(String customerContactRecordDuration) {
    this.customerContactRecordDuration = customerContactRecordDuration;
    return this;
  }

  /**
   * Get customerContactRecordDuration
   * @return customerContactRecordDuration
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactRecordDuration() {
    return customerContactRecordDuration;
  }

  public void setCustomerContactRecordDuration(String customerContactRecordDuration) {
    this.customerContactRecordDuration = customerContactRecordDuration;
  }

  public InitiateSessionResponseCustomerContactOperatingSession customerContactRecordResult(String customerContactRecordResult) {
    this.customerContactRecordResult = customerContactRecordResult;
    return this;
  }

  /**
   * Get customerContactRecordResult
   * @return customerContactRecordResult
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactRecordResult() {
    return customerContactRecordResult;
  }

  public void setCustomerContactRecordResult(String customerContactRecordResult) {
    this.customerContactRecordResult = customerContactRecordResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateSessionResponseCustomerContactOperatingSession initiateSessionResponseCustomerContactOperatingSession = (InitiateSessionResponseCustomerContactOperatingSession) o;
    return Objects.equals(this.customerContactRecordAuthenticationStatus, initiateSessionResponseCustomerContactOperatingSession.customerContactRecordAuthenticationStatus) &&
        Objects.equals(this.customerContactRecordRoutingSelectionStatus, initiateSessionResponseCustomerContactOperatingSession.customerContactRecordRoutingSelectionStatus) &&
        Objects.equals(this.customerContactRecordActivityRecord, initiateSessionResponseCustomerContactOperatingSession.customerContactRecordActivityRecord) &&
        Objects.equals(this.customerSessionDialogueReference, initiateSessionResponseCustomerContactOperatingSession.customerSessionDialogueReference) &&
        Objects.equals(this.customerSessionDialogueRecord, initiateSessionResponseCustomerContactOperatingSession.customerSessionDialogueRecord) &&
        Objects.equals(this.customerContactRecordDuration, initiateSessionResponseCustomerContactOperatingSession.customerContactRecordDuration) &&
        Objects.equals(this.customerContactRecordResult, initiateSessionResponseCustomerContactOperatingSession.customerContactRecordResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactRecordAuthenticationStatus, customerContactRecordRoutingSelectionStatus, customerContactRecordActivityRecord, customerSessionDialogueReference, customerSessionDialogueRecord, customerContactRecordDuration, customerContactRecordResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSessionResponseCustomerContactOperatingSession {\n");
    
    sb.append("    customerContactRecordAuthenticationStatus: ").append(toIndentedString(customerContactRecordAuthenticationStatus)).append("\n");
    sb.append("    customerContactRecordRoutingSelectionStatus: ").append(toIndentedString(customerContactRecordRoutingSelectionStatus)).append("\n");
    sb.append("    customerContactRecordActivityRecord: ").append(toIndentedString(customerContactRecordActivityRecord)).append("\n");
    sb.append("    customerSessionDialogueReference: ").append(toIndentedString(customerSessionDialogueReference)).append("\n");
    sb.append("    customerSessionDialogueRecord: ").append(toIndentedString(customerSessionDialogueRecord)).append("\n");
    sb.append("    customerContactRecordDuration: ").append(toIndentedString(customerContactRecordDuration)).append("\n");
    sb.append("    customerContactRecordResult: ").append(toIndentedString(customerContactRecordResult)).append("\n");
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

