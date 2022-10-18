package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInboundResponseInbound
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class InitiateInboundResponseInbound   {
  @JsonProperty("EBranchInboundConnectionStartTime")
  private String ebranchInboundConnectionStartTime;

  @JsonProperty("EBranchInboundConnectionDuration")
  private String ebranchInboundConnectionDuration;

  public InitiateInboundResponseInbound ebranchInboundConnectionStartTime(String ebranchInboundConnectionStartTime) {
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

  public InitiateInboundResponseInbound ebranchInboundConnectionDuration(String ebranchInboundConnectionDuration) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateInboundResponseInbound initiateInboundResponseInbound = (InitiateInboundResponseInbound) o;
    return Objects.equals(this.ebranchInboundConnectionStartTime, initiateInboundResponseInbound.ebranchInboundConnectionStartTime) &&
        Objects.equals(this.ebranchInboundConnectionDuration, initiateInboundResponseInbound.ebranchInboundConnectionDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebranchInboundConnectionStartTime, ebranchInboundConnectionDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInboundResponseInbound {\n");
    
    sb.append("    ebranchInboundConnectionStartTime: ").append(toIndentedString(ebranchInboundConnectionStartTime)).append("\n");
    sb.append("    ebranchInboundConnectionDuration: ").append(toIndentedString(ebranchInboundConnectionDuration)).append("\n");
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

