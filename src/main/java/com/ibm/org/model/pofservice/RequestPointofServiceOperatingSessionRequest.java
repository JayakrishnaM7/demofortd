package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.pofservice.InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestPointofServiceOperatingSessionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class RequestPointofServiceOperatingSessionRequest   {
  @JsonProperty("PointofServiceOperatingSession")
  private InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession pointofServiceOperatingSession;

  public RequestPointofServiceOperatingSessionRequest pointofServiceOperatingSession(InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession pointofServiceOperatingSession) {
    this.pointofServiceOperatingSession = pointofServiceOperatingSession;
    return this;
  }

  /**
   * Get pointofServiceOperatingSession
   * @return pointofServiceOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession getPointofServiceOperatingSession() {
    return pointofServiceOperatingSession;
  }

  public void setPointofServiceOperatingSession(InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession pointofServiceOperatingSession) {
    this.pointofServiceOperatingSession = pointofServiceOperatingSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPointofServiceOperatingSessionRequest requestPointofServiceOperatingSessionRequest = (RequestPointofServiceOperatingSessionRequest) o;
    return Objects.equals(this.pointofServiceOperatingSession, requestPointofServiceOperatingSessionRequest.pointofServiceOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointofServiceOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPointofServiceOperatingSessionRequest {\n");
    
    sb.append("    pointofServiceOperatingSession: ").append(toIndentedString(pointofServiceOperatingSession)).append("\n");
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

