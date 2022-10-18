package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class InitiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession   {
  @JsonProperty("CustomerContactRecordReference")
  private Object customerContactRecordReference;

  @JsonProperty("CustomerContactRecordAuthenticationStatus")
  private String customerContactRecordAuthenticationStatus;

  @JsonProperty("CustomerContactRecordRoutingSelectionStatus")
  private String customerContactRecordRoutingSelectionStatus;

  @JsonProperty("CustomerContactRecordServicingPositionReference")
  private Object customerContactRecordServicingPositionReference;

  @JsonProperty("CustomerContactRecordServicingResourceReference")
  private Object customerContactRecordServicingResourceReference;

  @JsonProperty("CustomerContactRecordActivityRecord")
  private String customerContactRecordActivityRecord;

  @JsonProperty("CustomerContactRecordDuration")
  private String customerContactRecordDuration;

  @JsonProperty("CustomerContactRecordResult")
  private String customerContactRecordResult;

  public InitiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession customerContactRecordReference(Object customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
    return this;
  }

  /**
   * Get customerContactRecordReference
   * @return customerContactRecordReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(Object customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }

  public InitiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession customerContactRecordAuthenticationStatus(String customerContactRecordAuthenticationStatus) {
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

  public InitiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession customerContactRecordRoutingSelectionStatus(String customerContactRecordRoutingSelectionStatus) {
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

  public InitiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession customerContactRecordServicingPositionReference(Object customerContactRecordServicingPositionReference) {
    this.customerContactRecordServicingPositionReference = customerContactRecordServicingPositionReference;
    return this;
  }

  /**
   * Get customerContactRecordServicingPositionReference
   * @return customerContactRecordServicingPositionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerContactRecordServicingPositionReference() {
    return customerContactRecordServicingPositionReference;
  }

  public void setCustomerContactRecordServicingPositionReference(Object customerContactRecordServicingPositionReference) {
    this.customerContactRecordServicingPositionReference = customerContactRecordServicingPositionReference;
  }

  public InitiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession customerContactRecordServicingResourceReference(Object customerContactRecordServicingResourceReference) {
    this.customerContactRecordServicingResourceReference = customerContactRecordServicingResourceReference;
    return this;
  }

  /**
   * Get customerContactRecordServicingResourceReference
   * @return customerContactRecordServicingResourceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerContactRecordServicingResourceReference() {
    return customerContactRecordServicingResourceReference;
  }

  public void setCustomerContactRecordServicingResourceReference(Object customerContactRecordServicingResourceReference) {
    this.customerContactRecordServicingResourceReference = customerContactRecordServicingResourceReference;
  }

  public InitiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession customerContactRecordActivityRecord(String customerContactRecordActivityRecord) {
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

  public InitiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession customerContactRecordDuration(String customerContactRecordDuration) {
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

  public InitiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession customerContactRecordResult(String customerContactRecordResult) {
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
    InitiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession initiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession = (InitiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession) o;
    return Objects.equals(this.customerContactRecordReference, initiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession.customerContactRecordReference) &&
        Objects.equals(this.customerContactRecordAuthenticationStatus, initiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession.customerContactRecordAuthenticationStatus) &&
        Objects.equals(this.customerContactRecordRoutingSelectionStatus, initiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession.customerContactRecordRoutingSelectionStatus) &&
        Objects.equals(this.customerContactRecordServicingPositionReference, initiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession.customerContactRecordServicingPositionReference) &&
        Objects.equals(this.customerContactRecordServicingResourceReference, initiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession.customerContactRecordServicingResourceReference) &&
        Objects.equals(this.customerContactRecordActivityRecord, initiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession.customerContactRecordActivityRecord) &&
        Objects.equals(this.customerContactRecordDuration, initiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession.customerContactRecordDuration) &&
        Objects.equals(this.customerContactRecordResult, initiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession.customerContactRecordResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactRecordReference, customerContactRecordAuthenticationStatus, customerContactRecordRoutingSelectionStatus, customerContactRecordServicingPositionReference, customerContactRecordServicingResourceReference, customerContactRecordActivityRecord, customerContactRecordDuration, customerContactRecordResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerContactOperatingSessionResponseCustomerContactOperatingSession {\n");
    
    sb.append("    customerContactRecordReference: ").append(toIndentedString(customerContactRecordReference)).append("\n");
    sb.append("    customerContactRecordAuthenticationStatus: ").append(toIndentedString(customerContactRecordAuthenticationStatus)).append("\n");
    sb.append("    customerContactRecordRoutingSelectionStatus: ").append(toIndentedString(customerContactRecordRoutingSelectionStatus)).append("\n");
    sb.append("    customerContactRecordServicingPositionReference: ").append(toIndentedString(customerContactRecordServicingPositionReference)).append("\n");
    sb.append("    customerContactRecordServicingResourceReference: ").append(toIndentedString(customerContactRecordServicingResourceReference)).append("\n");
    sb.append("    customerContactRecordActivityRecord: ").append(toIndentedString(customerContactRecordActivityRecord)).append("\n");
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

