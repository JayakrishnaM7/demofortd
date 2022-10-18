package com.ibm.org.model.txauthorisation;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:47.805Z[GMT]")

public class EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("EmployeeReference")
  private Object employeeReference;

  @JsonProperty("ProductReference")
  private Object productReference;

  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("ProposedTransactionType")
  private String proposedTransactionType;

  @JsonProperty("ProposedTransactionValue")
  private String proposedTransactionValue;

  @JsonProperty("CustomerContactRecordReference")
  private Object customerContactRecordReference;

  @JsonProperty("CustomerContactRecordCustomerReference")
  private Object customerContactRecordCustomerReference;

  @JsonProperty("CustomerContactRecordContactDevice")
  private String customerContactRecordContactDevice;

  @JsonProperty("CustomerContactRecordAuthenticationStatus(asobtainedbySD-ContactHandler)")
  private String customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler;

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

  @JsonProperty("SessionDialogueType")
  private String sessionDialogueType;

  @JsonProperty("SessionDialogueScript")
  private String sessionDialogueScript;

  @JsonProperty("SessionDialogueLogReference")
  private Object sessionDialogueLogReference;

  @JsonProperty("SessionDialogueSessionMechanism")
  private String sessionDialogueSessionMechanism;

  @JsonProperty("SessionDialogueRecordSessionStartOrEndTime")
  private String sessionDialogueRecordSessionStartOrEndTime;

  @JsonProperty("SessionDialogueResult")
  private String sessionDialogueResult;

  @JsonProperty("CustomerContactRecordDuration")
  private String customerContactRecordDuration;

  @JsonProperty("CustomerContactActivityRecord")
  private String customerContactActivityRecord;

  @JsonProperty("CustomerContactResult")
  private String customerContactResult;

  @JsonProperty("ChannelActivityHistoryReportReference")
  private Object channelActivityHistoryReportReference;

  @JsonProperty("ChannelActivityHistoryReportFromOrto")
  private String channelActivityHistoryReportFromOrto;

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerReference(Object customerReference) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment employeeReference(Object employeeReference) {
    this.employeeReference = employeeReference;
    return this;
  }

  /**
   * Get employeeReference
   * @return employeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(Object employeeReference) {
    this.employeeReference = employeeReference;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment productReference(Object productReference) {
    this.productReference = productReference;
    return this;
  }

  /**
   * Get productReference
   * @return productReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductReference() {
    return productReference;
  }

  public void setProductReference(Object productReference) {
    this.productReference = productReference;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment productInstanceReference(Object productInstanceReference) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment proposedTransactionType(String proposedTransactionType) {
    this.proposedTransactionType = proposedTransactionType;
    return this;
  }

  /**
   * Get proposedTransactionType
   * @return proposedTransactionType
  */
  @ApiModelProperty(value = "")


  public String getProposedTransactionType() {
    return proposedTransactionType;
  }

  public void setProposedTransactionType(String proposedTransactionType) {
    this.proposedTransactionType = proposedTransactionType;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment proposedTransactionValue(String proposedTransactionValue) {
    this.proposedTransactionValue = proposedTransactionValue;
    return this;
  }

  /**
   * Get proposedTransactionValue
   * @return proposedTransactionValue
  */
  @ApiModelProperty(value = "")


  public String getProposedTransactionValue() {
    return proposedTransactionValue;
  }

  public void setProposedTransactionValue(String proposedTransactionValue) {
    this.proposedTransactionValue = proposedTransactionValue;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactRecordReference(Object customerContactRecordReference) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactRecordCustomerReference(Object customerContactRecordCustomerReference) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactRecordContactDevice(String customerContactRecordContactDevice) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler(String customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler) {
    this.customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler = customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler;
    return this;
  }

  /**
   * Get customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler
   * @return customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactRecordAuthenticationStatusAsobtainedbySDContactHandler() {
    return customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler;
  }

  public void setCustomerContactRecordAuthenticationStatusAsobtainedbySDContactHandler(String customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler) {
    this.customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler = customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactRecordRoutingSelectionStatus(String customerContactRecordRoutingSelectionStatus) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactRecordMenuSelection(String customerContactRecordMenuSelection) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactRecordServicingRequest(String customerContactRecordServicingRequest) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactRecordServicingEventHistory(String customerContactRecordServicingEventHistory) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactRecordServicingPositionReference(Object customerContactRecordServicingPositionReference) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactRecordServicingResourceReference(Object customerContactRecordServicingResourceReference) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactRecordActivityRecord(String customerContactRecordActivityRecord) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerSessionDialogueReference(Object customerSessionDialogueReference) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerSessionDialogueRecord(String customerSessionDialogueRecord) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment sessionDialogueType(String sessionDialogueType) {
    this.sessionDialogueType = sessionDialogueType;
    return this;
  }

  /**
   * Get sessionDialogueType
   * @return sessionDialogueType
  */
  @ApiModelProperty(value = "")


  public String getSessionDialogueType() {
    return sessionDialogueType;
  }

  public void setSessionDialogueType(String sessionDialogueType) {
    this.sessionDialogueType = sessionDialogueType;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment sessionDialogueScript(String sessionDialogueScript) {
    this.sessionDialogueScript = sessionDialogueScript;
    return this;
  }

  /**
   * Get sessionDialogueScript
   * @return sessionDialogueScript
  */
  @ApiModelProperty(value = "")


  public String getSessionDialogueScript() {
    return sessionDialogueScript;
  }

  public void setSessionDialogueScript(String sessionDialogueScript) {
    this.sessionDialogueScript = sessionDialogueScript;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment sessionDialogueLogReference(Object sessionDialogueLogReference) {
    this.sessionDialogueLogReference = sessionDialogueLogReference;
    return this;
  }

  /**
   * Get sessionDialogueLogReference
   * @return sessionDialogueLogReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSessionDialogueLogReference() {
    return sessionDialogueLogReference;
  }

  public void setSessionDialogueLogReference(Object sessionDialogueLogReference) {
    this.sessionDialogueLogReference = sessionDialogueLogReference;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment sessionDialogueSessionMechanism(String sessionDialogueSessionMechanism) {
    this.sessionDialogueSessionMechanism = sessionDialogueSessionMechanism;
    return this;
  }

  /**
   * Get sessionDialogueSessionMechanism
   * @return sessionDialogueSessionMechanism
  */
  @ApiModelProperty(value = "")


  public String getSessionDialogueSessionMechanism() {
    return sessionDialogueSessionMechanism;
  }

  public void setSessionDialogueSessionMechanism(String sessionDialogueSessionMechanism) {
    this.sessionDialogueSessionMechanism = sessionDialogueSessionMechanism;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment sessionDialogueRecordSessionStartOrEndTime(String sessionDialogueRecordSessionStartOrEndTime) {
    this.sessionDialogueRecordSessionStartOrEndTime = sessionDialogueRecordSessionStartOrEndTime;
    return this;
  }

  /**
   * Get sessionDialogueRecordSessionStartOrEndTime
   * @return sessionDialogueRecordSessionStartOrEndTime
  */
  @ApiModelProperty(value = "")


  public String getSessionDialogueRecordSessionStartOrEndTime() {
    return sessionDialogueRecordSessionStartOrEndTime;
  }

  public void setSessionDialogueRecordSessionStartOrEndTime(String sessionDialogueRecordSessionStartOrEndTime) {
    this.sessionDialogueRecordSessionStartOrEndTime = sessionDialogueRecordSessionStartOrEndTime;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment sessionDialogueResult(String sessionDialogueResult) {
    this.sessionDialogueResult = sessionDialogueResult;
    return this;
  }

  /**
   * Get sessionDialogueResult
   * @return sessionDialogueResult
  */
  @ApiModelProperty(value = "")


  public String getSessionDialogueResult() {
    return sessionDialogueResult;
  }

  public void setSessionDialogueResult(String sessionDialogueResult) {
    this.sessionDialogueResult = sessionDialogueResult;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactRecordDuration(String customerContactRecordDuration) {
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

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactActivityRecord(String customerContactActivityRecord) {
    this.customerContactActivityRecord = customerContactActivityRecord;
    return this;
  }

  /**
   * Get customerContactActivityRecord
   * @return customerContactActivityRecord
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactActivityRecord() {
    return customerContactActivityRecord;
  }

  public void setCustomerContactActivityRecord(String customerContactActivityRecord) {
    this.customerContactActivityRecord = customerContactActivityRecord;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment customerContactResult(String customerContactResult) {
    this.customerContactResult = customerContactResult;
    return this;
  }

  /**
   * Get customerContactResult
   * @return customerContactResult
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactResult() {
    return customerContactResult;
  }

  public void setCustomerContactResult(String customerContactResult) {
    this.customerContactResult = customerContactResult;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment channelActivityHistoryReportReference(Object channelActivityHistoryReportReference) {
    this.channelActivityHistoryReportReference = channelActivityHistoryReportReference;
    return this;
  }

  /**
   * Get channelActivityHistoryReportReference
   * @return channelActivityHistoryReportReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getChannelActivityHistoryReportReference() {
    return channelActivityHistoryReportReference;
  }

  public void setChannelActivityHistoryReportReference(Object channelActivityHistoryReportReference) {
    this.channelActivityHistoryReportReference = channelActivityHistoryReportReference;
  }

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment channelActivityHistoryReportFromOrto(String channelActivityHistoryReportFromOrto) {
    this.channelActivityHistoryReportFromOrto = channelActivityHistoryReportFromOrto;
    return this;
  }

  /**
   * Get channelActivityHistoryReportFromOrto
   * @return channelActivityHistoryReportFromOrto
  */
  @ApiModelProperty(value = "")


  public String getChannelActivityHistoryReportFromOrto() {
    return channelActivityHistoryReportFromOrto;
  }

  public void setChannelActivityHistoryReportFromOrto(String channelActivityHistoryReportFromOrto) {
    this.channelActivityHistoryReportFromOrto = channelActivityHistoryReportFromOrto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment = (EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment) o;
    return Objects.equals(this.customerReference, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerReference) &&
        Objects.equals(this.employeeReference, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.employeeReference) &&
        Objects.equals(this.productReference, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.productReference) &&
        Objects.equals(this.productInstanceReference, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.productInstanceReference) &&
        Objects.equals(this.proposedTransactionType, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.proposedTransactionType) &&
        Objects.equals(this.proposedTransactionValue, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.proposedTransactionValue) &&
        Objects.equals(this.customerContactRecordReference, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactRecordReference) &&
        Objects.equals(this.customerContactRecordCustomerReference, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactRecordCustomerReference) &&
        Objects.equals(this.customerContactRecordContactDevice, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactRecordContactDevice) &&
        Objects.equals(this.customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler) &&
        Objects.equals(this.customerContactRecordRoutingSelectionStatus, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactRecordRoutingSelectionStatus) &&
        Objects.equals(this.customerContactRecordMenuSelection, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactRecordMenuSelection) &&
        Objects.equals(this.customerContactRecordServicingRequest, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactRecordServicingRequest) &&
        Objects.equals(this.customerContactRecordServicingEventHistory, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactRecordServicingEventHistory) &&
        Objects.equals(this.customerContactRecordServicingPositionReference, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactRecordServicingPositionReference) &&
        Objects.equals(this.customerContactRecordServicingResourceReference, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactRecordServicingResourceReference) &&
        Objects.equals(this.customerContactRecordActivityRecord, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactRecordActivityRecord) &&
        Objects.equals(this.customerSessionDialogueReference, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerSessionDialogueReference) &&
        Objects.equals(this.customerSessionDialogueRecord, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerSessionDialogueRecord) &&
        Objects.equals(this.sessionDialogueType, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.sessionDialogueType) &&
        Objects.equals(this.sessionDialogueScript, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.sessionDialogueScript) &&
        Objects.equals(this.sessionDialogueLogReference, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.sessionDialogueLogReference) &&
        Objects.equals(this.sessionDialogueSessionMechanism, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.sessionDialogueSessionMechanism) &&
        Objects.equals(this.sessionDialogueRecordSessionStartOrEndTime, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.sessionDialogueRecordSessionStartOrEndTime) &&
        Objects.equals(this.sessionDialogueResult, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.sessionDialogueResult) &&
        Objects.equals(this.customerContactRecordDuration, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactRecordDuration) &&
        Objects.equals(this.customerContactActivityRecord, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactActivityRecord) &&
        Objects.equals(this.customerContactResult, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.customerContactResult) &&
        Objects.equals(this.channelActivityHistoryReportReference, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.channelActivityHistoryReportReference) &&
        Objects.equals(this.channelActivityHistoryReportFromOrto, evaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment.channelActivityHistoryReportFromOrto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, employeeReference, productReference, productInstanceReference, proposedTransactionType, proposedTransactionValue, customerContactRecordReference, customerContactRecordCustomerReference, customerContactRecordContactDevice, customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler, customerContactRecordRoutingSelectionStatus, customerContactRecordMenuSelection, customerContactRecordServicingRequest, customerContactRecordServicingEventHistory, customerContactRecordServicingPositionReference, customerContactRecordServicingResourceReference, customerContactRecordActivityRecord, customerSessionDialogueReference, customerSessionDialogueRecord, sessionDialogueType, sessionDialogueScript, sessionDialogueLogReference, sessionDialogueSessionMechanism, sessionDialogueRecordSessionStartOrEndTime, sessionDialogueResult, customerContactRecordDuration, customerContactActivityRecord, customerContactResult, channelActivityHistoryReportReference, channelActivityHistoryReportFromOrto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    employeeReference: ").append(toIndentedString(employeeReference)).append("\n");
    sb.append("    productReference: ").append(toIndentedString(productReference)).append("\n");
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    proposedTransactionType: ").append(toIndentedString(proposedTransactionType)).append("\n");
    sb.append("    proposedTransactionValue: ").append(toIndentedString(proposedTransactionValue)).append("\n");
    sb.append("    customerContactRecordReference: ").append(toIndentedString(customerContactRecordReference)).append("\n");
    sb.append("    customerContactRecordCustomerReference: ").append(toIndentedString(customerContactRecordCustomerReference)).append("\n");
    sb.append("    customerContactRecordContactDevice: ").append(toIndentedString(customerContactRecordContactDevice)).append("\n");
    sb.append("    customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler: ").append(toIndentedString(customerContactRecordAuthenticationStatusAsobtainedbySDContactHandler)).append("\n");
    sb.append("    customerContactRecordRoutingSelectionStatus: ").append(toIndentedString(customerContactRecordRoutingSelectionStatus)).append("\n");
    sb.append("    customerContactRecordMenuSelection: ").append(toIndentedString(customerContactRecordMenuSelection)).append("\n");
    sb.append("    customerContactRecordServicingRequest: ").append(toIndentedString(customerContactRecordServicingRequest)).append("\n");
    sb.append("    customerContactRecordServicingEventHistory: ").append(toIndentedString(customerContactRecordServicingEventHistory)).append("\n");
    sb.append("    customerContactRecordServicingPositionReference: ").append(toIndentedString(customerContactRecordServicingPositionReference)).append("\n");
    sb.append("    customerContactRecordServicingResourceReference: ").append(toIndentedString(customerContactRecordServicingResourceReference)).append("\n");
    sb.append("    customerContactRecordActivityRecord: ").append(toIndentedString(customerContactRecordActivityRecord)).append("\n");
    sb.append("    customerSessionDialogueReference: ").append(toIndentedString(customerSessionDialogueReference)).append("\n");
    sb.append("    customerSessionDialogueRecord: ").append(toIndentedString(customerSessionDialogueRecord)).append("\n");
    sb.append("    sessionDialogueType: ").append(toIndentedString(sessionDialogueType)).append("\n");
    sb.append("    sessionDialogueScript: ").append(toIndentedString(sessionDialogueScript)).append("\n");
    sb.append("    sessionDialogueLogReference: ").append(toIndentedString(sessionDialogueLogReference)).append("\n");
    sb.append("    sessionDialogueSessionMechanism: ").append(toIndentedString(sessionDialogueSessionMechanism)).append("\n");
    sb.append("    sessionDialogueRecordSessionStartOrEndTime: ").append(toIndentedString(sessionDialogueRecordSessionStartOrEndTime)).append("\n");
    sb.append("    sessionDialogueResult: ").append(toIndentedString(sessionDialogueResult)).append("\n");
    sb.append("    customerContactRecordDuration: ").append(toIndentedString(customerContactRecordDuration)).append("\n");
    sb.append("    customerContactActivityRecord: ").append(toIndentedString(customerContactActivityRecord)).append("\n");
    sb.append("    customerContactResult: ").append(toIndentedString(customerContactResult)).append("\n");
    sb.append("    channelActivityHistoryReportReference: ").append(toIndentedString(channelActivityHistoryReportReference)).append("\n");
    sb.append("    channelActivityHistoryReportFromOrto: ").append(toIndentedString(channelActivityHistoryReportFromOrto)).append("\n");
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

