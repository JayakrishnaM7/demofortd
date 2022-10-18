package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveInboundResponseInbound
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class RetrieveInboundResponseInbound   {
  @JsonProperty("EBranchDeviceReference")
  private Object ebranchDeviceReference;

  @JsonProperty("EBranchDevicePropertyValue")
  private String ebranchDevicePropertyValue;

  @JsonProperty("EBranchInboundConnectionStartTime")
  private String ebranchInboundConnectionStartTime;

  @JsonProperty("EBranchInboundConnectionDuration")
  private String ebranchInboundConnectionDuration;

  @JsonProperty("EBranchInboundConnectionContactRecordReference")
  private Object ebranchInboundConnectionContactRecordReference;

  public RetrieveInboundResponseInbound ebranchDeviceReference(Object ebranchDeviceReference) {
    this.ebranchDeviceReference = ebranchDeviceReference;
    return this;
  }

  /**
   * Get ebranchDeviceReference
   * @return ebranchDeviceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEbranchDeviceReference() {
    return ebranchDeviceReference;
  }

  public void setEbranchDeviceReference(Object ebranchDeviceReference) {
    this.ebranchDeviceReference = ebranchDeviceReference;
  }

  public RetrieveInboundResponseInbound ebranchDevicePropertyValue(String ebranchDevicePropertyValue) {
    this.ebranchDevicePropertyValue = ebranchDevicePropertyValue;
    return this;
  }

  /**
   * Get ebranchDevicePropertyValue
   * @return ebranchDevicePropertyValue
  */
  @ApiModelProperty(value = "")


  public String getEbranchDevicePropertyValue() {
    return ebranchDevicePropertyValue;
  }

  public void setEbranchDevicePropertyValue(String ebranchDevicePropertyValue) {
    this.ebranchDevicePropertyValue = ebranchDevicePropertyValue;
  }

  public RetrieveInboundResponseInbound ebranchInboundConnectionStartTime(String ebranchInboundConnectionStartTime) {
    this.ebranchInboundConnectionStartTime = ebranchInboundConnectionStartTime;
    return this;
  }

  /**
   * Get ebranchInboundConnectionStartTime
   * @return ebranchInboundConnectionStartTime
  */
  @ApiModelProperty(value = "")


  public String getEbranchInboundConnectionStartTime() {
    return ebranchInboundConnectionStartTime;
  }

  public void setEbranchInboundConnectionStartTime(String ebranchInboundConnectionStartTime) {
    this.ebranchInboundConnectionStartTime = ebranchInboundConnectionStartTime;
  }

  public RetrieveInboundResponseInbound ebranchInboundConnectionDuration(String ebranchInboundConnectionDuration) {
    this.ebranchInboundConnectionDuration = ebranchInboundConnectionDuration;
    return this;
  }

  /**
   * Get ebranchInboundConnectionDuration
   * @return ebranchInboundConnectionDuration
  */
  @ApiModelProperty(value = "")


  public String getEbranchInboundConnectionDuration() {
    return ebranchInboundConnectionDuration;
  }

  public void setEbranchInboundConnectionDuration(String ebranchInboundConnectionDuration) {
    this.ebranchInboundConnectionDuration = ebranchInboundConnectionDuration;
  }

  public RetrieveInboundResponseInbound ebranchInboundConnectionContactRecordReference(Object ebranchInboundConnectionContactRecordReference) {
    this.ebranchInboundConnectionContactRecordReference = ebranchInboundConnectionContactRecordReference;
    return this;
  }

  /**
   * Get ebranchInboundConnectionContactRecordReference
   * @return ebranchInboundConnectionContactRecordReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEbranchInboundConnectionContactRecordReference() {
    return ebranchInboundConnectionContactRecordReference;
  }

  public void setEbranchInboundConnectionContactRecordReference(Object ebranchInboundConnectionContactRecordReference) {
    this.ebranchInboundConnectionContactRecordReference = ebranchInboundConnectionContactRecordReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveInboundResponseInbound retrieveInboundResponseInbound = (RetrieveInboundResponseInbound) o;
    return Objects.equals(this.ebranchDeviceReference, retrieveInboundResponseInbound.ebranchDeviceReference) &&
        Objects.equals(this.ebranchDevicePropertyValue, retrieveInboundResponseInbound.ebranchDevicePropertyValue) &&
        Objects.equals(this.ebranchInboundConnectionStartTime, retrieveInboundResponseInbound.ebranchInboundConnectionStartTime) &&
        Objects.equals(this.ebranchInboundConnectionDuration, retrieveInboundResponseInbound.ebranchInboundConnectionDuration) &&
        Objects.equals(this.ebranchInboundConnectionContactRecordReference, retrieveInboundResponseInbound.ebranchInboundConnectionContactRecordReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebranchDeviceReference, ebranchDevicePropertyValue, ebranchInboundConnectionStartTime, ebranchInboundConnectionDuration, ebranchInboundConnectionContactRecordReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveInboundResponseInbound {\n");
    
    sb.append("    ebranchDeviceReference: ").append(toIndentedString(ebranchDeviceReference)).append("\n");
    sb.append("    ebranchDevicePropertyValue: ").append(toIndentedString(ebranchDevicePropertyValue)).append("\n");
    sb.append("    ebranchInboundConnectionStartTime: ").append(toIndentedString(ebranchInboundConnectionStartTime)).append("\n");
    sb.append("    ebranchInboundConnectionDuration: ").append(toIndentedString(ebranchInboundConnectionDuration)).append("\n");
    sb.append("    ebranchInboundConnectionContactRecordReference: ").append(toIndentedString(ebranchInboundConnectionContactRecordReference)).append("\n");
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

