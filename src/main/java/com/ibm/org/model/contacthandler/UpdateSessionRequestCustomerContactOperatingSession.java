package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateSessionRequestCustomerContactOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class UpdateSessionRequestCustomerContactOperatingSession   {
  @JsonProperty("CustomerContactRecord")
  private String customerContactRecord;

  @JsonProperty("CustomerContactRecordCustomerReference")
  private Object customerContactRecordCustomerReference;

  @JsonProperty("CustomerContactRecordContactDevice")
  private String customerContactRecordContactDevice;

  @JsonProperty("CustomerContactRecordAuthenticationStatus")
  private String customerContactRecordAuthenticationStatus;

  @JsonProperty("CustomerContactRecordRoutingSelectionStatus")
  private String customerContactRecordRoutingSelectionStatus;

  @JsonProperty("CustomerContactRecordMenuSelection")
  private String customerContactRecordMenuSelection;

  @JsonProperty("CustomerContactRecordServicingRequest")
  private String customerContactRecordServicingRequest;

  @JsonProperty("CustomerContactRecordServicingEventHistory")
  private String customerContactRecordServicingEventHistory;

  @JsonProperty("CustomerContactRecordServicingPositionReference")
  private Object customerContactRecordServicingPositionReference;

  @JsonProperty("CustomerContactRecordServicingResourceReference")
  private Object customerContactRecordServicingResourceReference;

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

  public UpdateSessionRequestCustomerContactOperatingSession customerContactRecord(String customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
    return this;
  }

  /**
   * Get customerContactRecord
   * @return customerContactRecord
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(String customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }

  public UpdateSessionRequestCustomerContactOperatingSession customerContactRecordCustomerReference(Object customerContactRecordCustomerReference) {
    this.customerContactRecordCustomerReference = customerContactRecordCustomerReference;
    return this;
  }

  /**
   * Get customerContactRecordCustomerReference
   * @return customerContactRecordCustomerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerContactRecordCustomerReference() {
    return customerContactRecordCustomerReference;
  }

  public void setCustomerContactRecordCustomerReference(Object customerContactRecordCustomerReference) {
    this.customerContactRecordCustomerReference = customerContactRecordCustomerReference;
  }

  public UpdateSessionRequestCustomerContactOperatingSession customerContactRecordContactDevice(String customerContactRecordContactDevice) {
    this.customerContactRecordContactDevice = customerContactRecordContactDevice;
    return this;
  }

  /**
   * Get customerContactRecordContactDevice
   * @return customerContactRecordContactDevice
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactRecordContactDevice() {
    return customerContactRecordContactDevice;
  }

  public void setCustomerContactRecordContactDevice(String customerContactRecordContactDevice) {
    this.customerContactRecordContactDevice = customerContactRecordContactDevice;
  }

  public UpdateSessionRequestCustomerContactOperatingSession customerContactRecordAuthenticationStatus(String customerContactRecordAuthenticationStatus) {
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

  public UpdateSessionRequestCustomerContactOperatingSession customerContactRecordRoutingSelectionStatus(String customerContactRecordRoutingSelectionStatus) {
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

  public UpdateSessionRequestCustomerContactOperatingSession customerContactRecordMenuSelection(String customerContactRecordMenuSelection) {
    this.customerContactRecordMenuSelection = customerContactRecordMenuSelection;
    return this;
  }

  /**
   * Get customerContactRecordMenuSelection
   * @return customerContactRecordMenuSelection
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactRecordMenuSelection() {
    return customerContactRecordMenuSelection;
  }

  public void setCustomerContactRecordMenuSelection(String customerContactRecordMenuSelection) {
    this.customerContactRecordMenuSelection = customerContactRecordMenuSelection;
  }

  public UpdateSessionRequestCustomerContactOperatingSession customerContactRecordServicingRequest(String customerContactRecordServicingRequest) {
    this.customerContactRecordServicingRequest = customerContactRecordServicingRequest;
    return this;
  }

  /**
   * Get customerContactRecordServicingRequest
   * @return customerContactRecordServicingRequest
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactRecordServicingRequest() {
    return customerContactRecordServicingRequest;
  }

  public void setCustomerContactRecordServicingRequest(String customerContactRecordServicingRequest) {
    this.customerContactRecordServicingRequest = customerContactRecordServicingRequest;
  }

  public UpdateSessionRequestCustomerContactOperatingSession customerContactRecordServicingEventHistory(String customerContactRecordServicingEventHistory) {
    this.customerContactRecordServicingEventHistory = customerContactRecordServicingEventHistory;
    return this;
  }

  /**
   * Get customerContactRecordServicingEventHistory
   * @return customerContactRecordServicingEventHistory
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactRecordServicingEventHistory() {
    return customerContactRecordServicingEventHistory;
  }

  public void setCustomerContactRecordServicingEventHistory(String customerContactRecordServicingEventHistory) {
    this.customerContactRecordServicingEventHistory = customerContactRecordServicingEventHistory;
  }

  public UpdateSessionRequestCustomerContactOperatingSession customerContactRecordServicingPositionReference(Object customerContactRecordServicingPositionReference) {
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

  public UpdateSessionRequestCustomerContactOperatingSession customerContactRecordServicingResourceReference(Object customerContactRecordServicingResourceReference) {
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

  public UpdateSessionRequestCustomerContactOperatingSession customerContactRecordActivityRecord(String customerContactRecordActivityRecord) {
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

  public UpdateSessionRequestCustomerContactOperatingSession customerSessionDialogueReference(Object customerSessionDialogueReference) {
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

  public UpdateSessionRequestCustomerContactOperatingSession customerSessionDialogueRecord(String customerSessionDialogueRecord) {
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

  public UpdateSessionRequestCustomerContactOperatingSession customerContactRecordDuration(String customerContactRecordDuration) {
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

  public UpdateSessionRequestCustomerContactOperatingSession customerContactRecordResult(String customerContactRecordResult) {
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
    UpdateSessionRequestCustomerContactOperatingSession updateSessionRequestCustomerContactOperatingSession = (UpdateSessionRequestCustomerContactOperatingSession) o;
    return Objects.equals(this.customerContactRecord, updateSessionRequestCustomerContactOperatingSession.customerContactRecord) &&
        Objects.equals(this.customerContactRecordCustomerReference, updateSessionRequestCustomerContactOperatingSession.customerContactRecordCustomerReference) &&
        Objects.equals(this.customerContactRecordContactDevice, updateSessionRequestCustomerContactOperatingSession.customerContactRecordContactDevice) &&
        Objects.equals(this.customerContactRecordAuthenticationStatus, updateSessionRequestCustomerContactOperatingSession.customerContactRecordAuthenticationStatus) &&
        Objects.equals(this.customerContactRecordRoutingSelectionStatus, updateSessionRequestCustomerContactOperatingSession.customerContactRecordRoutingSelectionStatus) &&
        Objects.equals(this.customerContactRecordMenuSelection, updateSessionRequestCustomerContactOperatingSession.customerContactRecordMenuSelection) &&
        Objects.equals(this.customerContactRecordServicingRequest, updateSessionRequestCustomerContactOperatingSession.customerContactRecordServicingRequest) &&
        Objects.equals(this.customerContactRecordServicingEventHistory, updateSessionRequestCustomerContactOperatingSession.customerContactRecordServicingEventHistory) &&
        Objects.equals(this.customerContactRecordServicingPositionReference, updateSessionRequestCustomerContactOperatingSession.customerContactRecordServicingPositionReference) &&
        Objects.equals(this.customerContactRecordServicingResourceReference, updateSessionRequestCustomerContactOperatingSession.customerContactRecordServicingResourceReference) &&
        Objects.equals(this.customerContactRecordActivityRecord, updateSessionRequestCustomerContactOperatingSession.customerContactRecordActivityRecord) &&
        Objects.equals(this.customerSessionDialogueReference, updateSessionRequestCustomerContactOperatingSession.customerSessionDialogueReference) &&
        Objects.equals(this.customerSessionDialogueRecord, updateSessionRequestCustomerContactOperatingSession.customerSessionDialogueRecord) &&
        Objects.equals(this.customerContactRecordDuration, updateSessionRequestCustomerContactOperatingSession.customerContactRecordDuration) &&
        Objects.equals(this.customerContactRecordResult, updateSessionRequestCustomerContactOperatingSession.customerContactRecordResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactRecord, customerContactRecordCustomerReference, customerContactRecordContactDevice, customerContactRecordAuthenticationStatus, customerContactRecordRoutingSelectionStatus, customerContactRecordMenuSelection, customerContactRecordServicingRequest, customerContactRecordServicingEventHistory, customerContactRecordServicingPositionReference, customerContactRecordServicingResourceReference, customerContactRecordActivityRecord, customerSessionDialogueReference, customerSessionDialogueRecord, customerContactRecordDuration, customerContactRecordResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSessionRequestCustomerContactOperatingSession {\n");
    
    sb.append("    customerContactRecord: ").append(toIndentedString(customerContactRecord)).append("\n");
    sb.append("    customerContactRecordCustomerReference: ").append(toIndentedString(customerContactRecordCustomerReference)).append("\n");
    sb.append("    customerContactRecordContactDevice: ").append(toIndentedString(customerContactRecordContactDevice)).append("\n");
    sb.append("    customerContactRecordAuthenticationStatus: ").append(toIndentedString(customerContactRecordAuthenticationStatus)).append("\n");
    sb.append("    customerContactRecordRoutingSelectionStatus: ").append(toIndentedString(customerContactRecordRoutingSelectionStatus)).append("\n");
    sb.append("    customerContactRecordMenuSelection: ").append(toIndentedString(customerContactRecordMenuSelection)).append("\n");
    sb.append("    customerContactRecordServicingRequest: ").append(toIndentedString(customerContactRecordServicingRequest)).append("\n");
    sb.append("    customerContactRecordServicingEventHistory: ").append(toIndentedString(customerContactRecordServicingEventHistory)).append("\n");
    sb.append("    customerContactRecordServicingPositionReference: ").append(toIndentedString(customerContactRecordServicingPositionReference)).append("\n");
    sb.append("    customerContactRecordServicingResourceReference: ").append(toIndentedString(customerContactRecordServicingResourceReference)).append("\n");
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

