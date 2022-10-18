package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.ebranchops.InitiateInboundResponseEBranchChannelOperatingSession;
import com.ibm.org.model.ebranchops.InitiateOutboundResponseOutbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateOutboundResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class InitiateOutboundResponse   {
  @JsonProperty("eBranchChannelOperatingSession")
  private InitiateInboundResponseEBranchChannelOperatingSession eBranchChannelOperatingSession;

  @JsonProperty("Outbound")
  private InitiateOutboundResponseOutbound outbound;

  public InitiateOutboundResponse eBranchChannelOperatingSession(InitiateInboundResponseEBranchChannelOperatingSession eBranchChannelOperatingSession) {
    this.eBranchChannelOperatingSession = eBranchChannelOperatingSession;
    return this;
  }

  /**
   * Get eBranchChannelOperatingSession
   * @return eBranchChannelOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateInboundResponseEBranchChannelOperatingSession geteBranchChannelOperatingSession() {
    return eBranchChannelOperatingSession;
  }

  public void seteBranchChannelOperatingSession(InitiateInboundResponseEBranchChannelOperatingSession eBranchChannelOperatingSession) {
    this.eBranchChannelOperatingSession = eBranchChannelOperatingSession;
  }

  public InitiateOutboundResponse outbound(InitiateOutboundResponseOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

  /**
   * Get outbound
   * @return outbound
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundResponseOutbound getOutbound() {
    return outbound;
  }

  public void setOutbound(InitiateOutboundResponseOutbound outbound) {
    this.outbound = outbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateOutboundResponse initiateOutboundResponse = (InitiateOutboundResponse) o;
    return Objects.equals(this.eBranchChannelOperatingSession, initiateOutboundResponse.eBranchChannelOperatingSession) &&
        Objects.equals(this.outbound, initiateOutboundResponse.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eBranchChannelOperatingSession, outbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateOutboundResponse {\n");
    
    sb.append("    eBranchChannelOperatingSession: ").append(toIndentedString(eBranchChannelOperatingSession)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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

