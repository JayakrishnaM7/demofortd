package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.ebranchops.InitiateInboundRequestEBranchChannelOperatingSession;
import com.ibm.org.model.ebranchops.InitiateInboundRequestInbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInboundRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class InitiateInboundRequest   {
  @JsonProperty("eBranchChannelOperatingSession")
  private InitiateInboundRequestEBranchChannelOperatingSession eBranchChannelOperatingSession;

  @JsonProperty("Inbound")
  private InitiateInboundRequestInbound inbound;

  public InitiateInboundRequest eBranchChannelOperatingSession(InitiateInboundRequestEBranchChannelOperatingSession eBranchChannelOperatingSession) {
    this.eBranchChannelOperatingSession = eBranchChannelOperatingSession;
    return this;
  }

  /**
   * Get eBranchChannelOperatingSession
   * @return eBranchChannelOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateInboundRequestEBranchChannelOperatingSession geteBranchChannelOperatingSession() {
    return eBranchChannelOperatingSession;
  }

  public void seteBranchChannelOperatingSession(InitiateInboundRequestEBranchChannelOperatingSession eBranchChannelOperatingSession) {
    this.eBranchChannelOperatingSession = eBranchChannelOperatingSession;
  }

  public InitiateInboundRequest inbound(InitiateInboundRequestInbound inbound) {
    this.inbound = inbound;
    return this;
  }

  /**
   * Get inbound
   * @return inbound
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateInboundRequestInbound getInbound() {
    return inbound;
  }

  public void setInbound(InitiateInboundRequestInbound inbound) {
    this.inbound = inbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateInboundRequest initiateInboundRequest = (InitiateInboundRequest) o;
    return Objects.equals(this.eBranchChannelOperatingSession, initiateInboundRequest.eBranchChannelOperatingSession) &&
        Objects.equals(this.inbound, initiateInboundRequest.inbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eBranchChannelOperatingSession, inbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInboundRequest {\n");
    
    sb.append("    eBranchChannelOperatingSession: ").append(toIndentedString(eBranchChannelOperatingSession)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
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

