package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateOutboundResponseOutbound
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class InitiateOutboundResponseOutbound   {
  @JsonProperty("CustomerSessionDialogueRecord")
  private String customerSessionDialogueRecord;

  @JsonProperty("EBranchOutboundConnectionStartTime")
  private String ebranchOutboundConnectionStartTime;

  @JsonProperty("EBranchOutboundConnectionDuration")
  private String ebranchOutboundConnectionDuration;

  public InitiateOutboundResponseOutbound customerSessionDialogueRecord(String customerSessionDialogueRecord) {
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

  public InitiateOutboundResponseOutbound ebranchOutboundConnectionStartTime(String ebranchOutboundConnectionStartTime) {
    this.ebranchOutboundConnectionStartTime = ebranchOutboundConnectionStartTime;
    return this;
  }

  /**
   * Get ebranchOutboundConnectionStartTime
   * @return ebranchOutboundConnectionStartTime
  */
  @ApiModelProperty(value = "")


  public String getEbranchOutboundConnectionStartTime() {
    return ebranchOutboundConnectionStartTime;
  }

  public void setEbranchOutboundConnectionStartTime(String ebranchOutboundConnectionStartTime) {
    this.ebranchOutboundConnectionStartTime = ebranchOutboundConnectionStartTime;
  }

  public InitiateOutboundResponseOutbound ebranchOutboundConnectionDuration(String ebranchOutboundConnectionDuration) {
    this.ebranchOutboundConnectionDuration = ebranchOutboundConnectionDuration;
    return this;
  }

  /**
   * Get ebranchOutboundConnectionDuration
   * @return ebranchOutboundConnectionDuration
  */
  @ApiModelProperty(value = "")


  public String getEbranchOutboundConnectionDuration() {
    return ebranchOutboundConnectionDuration;
  }

  public void setEbranchOutboundConnectionDuration(String ebranchOutboundConnectionDuration) {
    this.ebranchOutboundConnectionDuration = ebranchOutboundConnectionDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateOutboundResponseOutbound initiateOutboundResponseOutbound = (InitiateOutboundResponseOutbound) o;
    return Objects.equals(this.customerSessionDialogueRecord, initiateOutboundResponseOutbound.customerSessionDialogueRecord) &&
        Objects.equals(this.ebranchOutboundConnectionStartTime, initiateOutboundResponseOutbound.ebranchOutboundConnectionStartTime) &&
        Objects.equals(this.ebranchOutboundConnectionDuration, initiateOutboundResponseOutbound.ebranchOutboundConnectionDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerSessionDialogueRecord, ebranchOutboundConnectionStartTime, ebranchOutboundConnectionDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateOutboundResponseOutbound {\n");
    
    sb.append("    customerSessionDialogueRecord: ").append(toIndentedString(customerSessionDialogueRecord)).append("\n");
    sb.append("    ebranchOutboundConnectionStartTime: ").append(toIndentedString(ebranchOutboundConnectionStartTime)).append("\n");
    sb.append("    ebranchOutboundConnectionDuration: ").append(toIndentedString(ebranchOutboundConnectionDuration)).append("\n");
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

