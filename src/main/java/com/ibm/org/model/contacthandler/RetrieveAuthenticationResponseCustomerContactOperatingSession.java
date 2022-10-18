package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveAuthenticationResponseCustomerContactOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class RetrieveAuthenticationResponseCustomerContactOperatingSession   {
  @JsonProperty("CustomerContactInboundorOutboundIndicator")
  private Boolean customerContactInboundorOutboundIndicator;

  @JsonProperty("eBranchOperatingSessionReference")
  private Object eBranchOperatingSessionReference;

  @JsonProperty("AdvancedVoiceServiceOperatingSessionReference")
  private Object advancedVoiceServiceOperatingSessionReference;

  @JsonProperty("CustomerContactRecordReference")
  private Object customerContactRecordReference;

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

  @JsonProperty("CustomerContactRecordActivityRecord")
  private String customerContactRecordActivityRecord;

  @JsonProperty("CustomerSessionDialogueReference")
  private Object customerSessionDialogueReference;

  @JsonProperty("CustomerSessionDialogueRecord")
  private String customerSessionDialogueRecord;

  public RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactInboundorOutboundIndicator(Boolean customerContactInboundorOutboundIndicator) {
    this.customerContactInboundorOutboundIndicator = customerContactInboundorOutboundIndicator;
    return this;
  }

  /**
   * Get customerContactInboundorOutboundIndicator
   * @return customerContactInboundorOutboundIndicator
  */
  @ApiModelProperty(value = "")


  public Boolean getCustomerContactInboundorOutboundIndicator() {
    return customerContactInboundorOutboundIndicator;
  }

  public void setCustomerContactInboundorOutboundIndicator(Boolean customerContactInboundorOutboundIndicator) {
    this.customerContactInboundorOutboundIndicator = customerContactInboundorOutboundIndicator;
  }

  public RetrieveAuthenticationResponseCustomerContactOperatingSession eBranchOperatingSessionReference(Object eBranchOperatingSessionReference) {
    this.eBranchOperatingSessionReference = eBranchOperatingSessionReference;
    return this;
  }

  /**
   * Get eBranchOperatingSessionReference
   * @return eBranchOperatingSessionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object geteBranchOperatingSessionReference() {
    return eBranchOperatingSessionReference;
  }

  public void seteBranchOperatingSessionReference(Object eBranchOperatingSessionReference) {
    this.eBranchOperatingSessionReference = eBranchOperatingSessionReference;
  }

  public RetrieveAuthenticationResponseCustomerContactOperatingSession advancedVoiceServiceOperatingSessionReference(Object advancedVoiceServiceOperatingSessionReference) {
    this.advancedVoiceServiceOperatingSessionReference = advancedVoiceServiceOperatingSessionReference;
    return this;
  }

  /**
   * Get advancedVoiceServiceOperatingSessionReference
   * @return advancedVoiceServiceOperatingSessionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getAdvancedVoiceServiceOperatingSessionReference() {
    return advancedVoiceServiceOperatingSessionReference;
  }

  public void setAdvancedVoiceServiceOperatingSessionReference(Object advancedVoiceServiceOperatingSessionReference) {
    this.advancedVoiceServiceOperatingSessionReference = advancedVoiceServiceOperatingSessionReference;
  }

  public RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactRecordReference(Object customerContactRecordReference) {
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

  public RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactRecordCustomerReference(Object customerContactRecordCustomerReference) {
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

  public RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactRecordContactDevice(String customerContactRecordContactDevice) {
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

  public RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactRecordAuthenticationStatus(String customerContactRecordAuthenticationStatus) {
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

  public RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactRecordRoutingSelectionStatus(String customerContactRecordRoutingSelectionStatus) {
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

  public RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactRecordMenuSelection(String customerContactRecordMenuSelection) {
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

  public RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactRecordServicingRequest(String customerContactRecordServicingRequest) {
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

  public RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactRecordServicingEventHistory(String customerContactRecordServicingEventHistory) {
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

  public RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactRecordActivityRecord(String customerContactRecordActivityRecord) {
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

  public RetrieveAuthenticationResponseCustomerContactOperatingSession customerSessionDialogueReference(Object customerSessionDialogueReference) {
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

  public RetrieveAuthenticationResponseCustomerContactOperatingSession customerSessionDialogueRecord(String customerSessionDialogueRecord) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAuthenticationResponseCustomerContactOperatingSession retrieveAuthenticationResponseCustomerContactOperatingSession = (RetrieveAuthenticationResponseCustomerContactOperatingSession) o;
    return Objects.equals(this.customerContactInboundorOutboundIndicator, retrieveAuthenticationResponseCustomerContactOperatingSession.customerContactInboundorOutboundIndicator) &&
        Objects.equals(this.eBranchOperatingSessionReference, retrieveAuthenticationResponseCustomerContactOperatingSession.eBranchOperatingSessionReference) &&
        Objects.equals(this.advancedVoiceServiceOperatingSessionReference, retrieveAuthenticationResponseCustomerContactOperatingSession.advancedVoiceServiceOperatingSessionReference) &&
        Objects.equals(this.customerContactRecordReference, retrieveAuthenticationResponseCustomerContactOperatingSession.customerContactRecordReference) &&
        Objects.equals(this.customerContactRecordCustomerReference, retrieveAuthenticationResponseCustomerContactOperatingSession.customerContactRecordCustomerReference) &&
        Objects.equals(this.customerContactRecordContactDevice, retrieveAuthenticationResponseCustomerContactOperatingSession.customerContactRecordContactDevice) &&
        Objects.equals(this.customerContactRecordAuthenticationStatus, retrieveAuthenticationResponseCustomerContactOperatingSession.customerContactRecordAuthenticationStatus) &&
        Objects.equals(this.customerContactRecordRoutingSelectionStatus, retrieveAuthenticationResponseCustomerContactOperatingSession.customerContactRecordRoutingSelectionStatus) &&
        Objects.equals(this.customerContactRecordMenuSelection, retrieveAuthenticationResponseCustomerContactOperatingSession.customerContactRecordMenuSelection) &&
        Objects.equals(this.customerContactRecordServicingRequest, retrieveAuthenticationResponseCustomerContactOperatingSession.customerContactRecordServicingRequest) &&
        Objects.equals(this.customerContactRecordServicingEventHistory, retrieveAuthenticationResponseCustomerContactOperatingSession.customerContactRecordServicingEventHistory) &&
        Objects.equals(this.customerContactRecordActivityRecord, retrieveAuthenticationResponseCustomerContactOperatingSession.customerContactRecordActivityRecord) &&
        Objects.equals(this.customerSessionDialogueReference, retrieveAuthenticationResponseCustomerContactOperatingSession.customerSessionDialogueReference) &&
        Objects.equals(this.customerSessionDialogueRecord, retrieveAuthenticationResponseCustomerContactOperatingSession.customerSessionDialogueRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactInboundorOutboundIndicator, eBranchOperatingSessionReference, advancedVoiceServiceOperatingSessionReference, customerContactRecordReference, customerContactRecordCustomerReference, customerContactRecordContactDevice, customerContactRecordAuthenticationStatus, customerContactRecordRoutingSelectionStatus, customerContactRecordMenuSelection, customerContactRecordServicingRequest, customerContactRecordServicingEventHistory, customerContactRecordActivityRecord, customerSessionDialogueReference, customerSessionDialogueRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAuthenticationResponseCustomerContactOperatingSession {\n");
    
    sb.append("    customerContactInboundorOutboundIndicator: ").append(toIndentedString(customerContactInboundorOutboundIndicator)).append("\n");
    sb.append("    eBranchOperatingSessionReference: ").append(toIndentedString(eBranchOperatingSessionReference)).append("\n");
    sb.append("    advancedVoiceServiceOperatingSessionReference: ").append(toIndentedString(advancedVoiceServiceOperatingSessionReference)).append("\n");
    sb.append("    customerContactRecordReference: ").append(toIndentedString(customerContactRecordReference)).append("\n");
    sb.append("    customerContactRecordCustomerReference: ").append(toIndentedString(customerContactRecordCustomerReference)).append("\n");
    sb.append("    customerContactRecordContactDevice: ").append(toIndentedString(customerContactRecordContactDevice)).append("\n");
    sb.append("    customerContactRecordAuthenticationStatus: ").append(toIndentedString(customerContactRecordAuthenticationStatus)).append("\n");
    sb.append("    customerContactRecordRoutingSelectionStatus: ").append(toIndentedString(customerContactRecordRoutingSelectionStatus)).append("\n");
    sb.append("    customerContactRecordMenuSelection: ").append(toIndentedString(customerContactRecordMenuSelection)).append("\n");
    sb.append("    customerContactRecordServicingRequest: ").append(toIndentedString(customerContactRecordServicingRequest)).append("\n");
    sb.append("    customerContactRecordServicingEventHistory: ").append(toIndentedString(customerContactRecordServicingEventHistory)).append("\n");
    sb.append("    customerContactRecordActivityRecord: ").append(toIndentedString(customerContactRecordActivityRecord)).append("\n");
    sb.append("    customerSessionDialogueReference: ").append(toIndentedString(customerSessionDialogueReference)).append("\n");
    sb.append("    customerSessionDialogueRecord: ").append(toIndentedString(customerSessionDialogueRecord)).append("\n");
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

