package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.ebranchops.InitiateInboundResponseEBranchChannelOperatingSession;
import com.ibm.org.model.ebranchops.InitiateInboundResponseInbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInboundResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class InitiateInboundResponse   {
  @JsonProperty("eBranchChannelOperatingSession")
  private InitiateInboundResponseEBranchChannelOperatingSession eBranchChannelOperatingSession;

  @JsonProperty("Inbound")
  private InitiateInboundResponseInbound inbound;

  public InitiateInboundResponse eBranchChannelOperatingSession(InitiateInboundResponseEBranchChannelOperatingSession eBranchChannelOperatingSession) {
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

  public InitiateInboundResponse inbound(InitiateInboundResponseInbound inbound) {
    this.inbound = inbound;
    return this;
  }

  /**
   * Get inbound
   * @return inbound
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateInboundResponseInbound getInbound() {
    return inbound;
  }

  public void setInbound(InitiateInboundResponseInbound inbound) {
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
    InitiateInboundResponse initiateInboundResponse = (InitiateInboundResponse) o;
    return Objects.equals(this.eBranchChannelOperatingSession, initiateInboundResponse.eBranchChannelOperatingSession) &&
        Objects.equals(this.inbound, initiateInboundResponse.inbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eBranchChannelOperatingSession, inbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInboundResponse {\n");
    
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

