package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.ebranchops.RetrieveInboundResponseEBranchChannelOperatingSession;
import com.ibm.org.model.ebranchops.RetrieveInboundResponseInbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveInboundResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class RetrieveInboundResponse   {
  @JsonProperty("eBranchChannelOperatingSession")
  private RetrieveInboundResponseEBranchChannelOperatingSession eBranchChannelOperatingSession;

  @JsonProperty("Inbound")
  private RetrieveInboundResponseInbound inbound;

  public RetrieveInboundResponse eBranchChannelOperatingSession(RetrieveInboundResponseEBranchChannelOperatingSession eBranchChannelOperatingSession) {
    this.eBranchChannelOperatingSession = eBranchChannelOperatingSession;
    return this;
  }

  /**
   * Get eBranchChannelOperatingSession
   * @return eBranchChannelOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveInboundResponseEBranchChannelOperatingSession geteBranchChannelOperatingSession() {
    return eBranchChannelOperatingSession;
  }

  public void seteBranchChannelOperatingSession(RetrieveInboundResponseEBranchChannelOperatingSession eBranchChannelOperatingSession) {
    this.eBranchChannelOperatingSession = eBranchChannelOperatingSession;
  }

  public RetrieveInboundResponse inbound(RetrieveInboundResponseInbound inbound) {
    this.inbound = inbound;
    return this;
  }

  /**
   * Get inbound
   * @return inbound
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveInboundResponseInbound getInbound() {
    return inbound;
  }

  public void setInbound(RetrieveInboundResponseInbound inbound) {
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
    RetrieveInboundResponse retrieveInboundResponse = (RetrieveInboundResponse) o;
    return Objects.equals(this.eBranchChannelOperatingSession, retrieveInboundResponse.eBranchChannelOperatingSession) &&
        Objects.equals(this.inbound, retrieveInboundResponse.inbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eBranchChannelOperatingSession, inbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveInboundResponse {\n");
    
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

