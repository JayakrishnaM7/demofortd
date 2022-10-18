package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInboundRequestInbound
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class InitiateInboundRequestInbound   {
  @JsonProperty("EBranchDeviceReference")
  private Object ebranchDeviceReference;

  @JsonProperty("EBranchDevicePropertyValue")
  private String ebranchDevicePropertyValue;

  @JsonProperty("EBranchInboundConnectionContactRecordReference")
  private Object ebranchInboundConnectionContactRecordReference;

  public InitiateInboundRequestInbound ebranchDeviceReference(Object ebranchDeviceReference) {
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

  public InitiateInboundRequestInbound ebranchDevicePropertyValue(String ebranchDevicePropertyValue) {
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

  public InitiateInboundRequestInbound ebranchInboundConnectionContactRecordReference(Object ebranchInboundConnectionContactRecordReference) {
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
    InitiateInboundRequestInbound initiateInboundRequestInbound = (InitiateInboundRequestInbound) o;
    return Objects.equals(this.ebranchDeviceReference, initiateInboundRequestInbound.ebranchDeviceReference) &&
        Objects.equals(this.ebranchDevicePropertyValue, initiateInboundRequestInbound.ebranchDevicePropertyValue) &&
        Objects.equals(this.ebranchInboundConnectionContactRecordReference, initiateInboundRequestInbound.ebranchInboundConnectionContactRecordReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebranchDeviceReference, ebranchDevicePropertyValue, ebranchInboundConnectionContactRecordReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInboundRequestInbound {\n");
    
    sb.append("    ebranchDeviceReference: ").append(toIndentedString(ebranchDeviceReference)).append("\n");
    sb.append("    ebranchDevicePropertyValue: ").append(toIndentedString(ebranchDevicePropertyValue)).append("\n");
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

