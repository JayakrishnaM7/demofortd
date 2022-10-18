package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.ebranchops.InitiateeBranchChannelOperatingSessionRequestEBranchChannelOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateeBranchChannelOperatingSessionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class InitiateeBranchChannelOperatingSessionRequest   {
  @JsonProperty("eBranchChannelOperatingSession")
  private InitiateeBranchChannelOperatingSessionRequestEBranchChannelOperatingSession eBranchChannelOperatingSession;

  public InitiateeBranchChannelOperatingSessionRequest eBranchChannelOperatingSession(InitiateeBranchChannelOperatingSessionRequestEBranchChannelOperatingSession eBranchChannelOperatingSession) {
    this.eBranchChannelOperatingSession = eBranchChannelOperatingSession;
    return this;
  }

  /**
   * Get eBranchChannelOperatingSession
   * @return eBranchChannelOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateeBranchChannelOperatingSessionRequestEBranchChannelOperatingSession geteBranchChannelOperatingSession() {
    return eBranchChannelOperatingSession;
  }

  public void seteBranchChannelOperatingSession(InitiateeBranchChannelOperatingSessionRequestEBranchChannelOperatingSession eBranchChannelOperatingSession) {
    this.eBranchChannelOperatingSession = eBranchChannelOperatingSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateeBranchChannelOperatingSessionRequest initiateeBranchChannelOperatingSessionRequest = (InitiateeBranchChannelOperatingSessionRequest) o;
    return Objects.equals(this.eBranchChannelOperatingSession, initiateeBranchChannelOperatingSessionRequest.eBranchChannelOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eBranchChannelOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateeBranchChannelOperatingSessionRequest {\n");
    
    sb.append("    eBranchChannelOperatingSession: ").append(toIndentedString(eBranchChannelOperatingSession)).append("\n");
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

