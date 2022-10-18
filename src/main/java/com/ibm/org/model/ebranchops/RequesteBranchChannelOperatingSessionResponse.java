package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.ebranchops.RequesteBranchChannelOperatingSessionResponseEBranchChannelOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequesteBranchChannelOperatingSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class RequesteBranchChannelOperatingSessionResponse   {
  @JsonProperty("eBranchChannelOperatingSession")
  private RequesteBranchChannelOperatingSessionResponseEBranchChannelOperatingSession eBranchChannelOperatingSession;

  public RequesteBranchChannelOperatingSessionResponse eBranchChannelOperatingSession(RequesteBranchChannelOperatingSessionResponseEBranchChannelOperatingSession eBranchChannelOperatingSession) {
    this.eBranchChannelOperatingSession = eBranchChannelOperatingSession;
    return this;
  }

  /**
   * Get eBranchChannelOperatingSession
   * @return eBranchChannelOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public RequesteBranchChannelOperatingSessionResponseEBranchChannelOperatingSession geteBranchChannelOperatingSession() {
    return eBranchChannelOperatingSession;
  }

  public void seteBranchChannelOperatingSession(RequesteBranchChannelOperatingSessionResponseEBranchChannelOperatingSession eBranchChannelOperatingSession) {
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
    RequesteBranchChannelOperatingSessionResponse requesteBranchChannelOperatingSessionResponse = (RequesteBranchChannelOperatingSessionResponse) o;
    return Objects.equals(this.eBranchChannelOperatingSession, requesteBranchChannelOperatingSessionResponse.eBranchChannelOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eBranchChannelOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequesteBranchChannelOperatingSessionResponse {\n");
    
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

