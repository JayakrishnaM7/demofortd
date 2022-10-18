package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.pofservice.InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePointofServiceOperatingSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class InitiatePointofServiceOperatingSessionResponse   {
  @JsonProperty("PointofServiceOperatingSession")
  private InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession pointofServiceOperatingSession;

  public InitiatePointofServiceOperatingSessionResponse pointofServiceOperatingSession(InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession pointofServiceOperatingSession) {
    this.pointofServiceOperatingSession = pointofServiceOperatingSession;
    return this;
  }

  /**
   * Get pointofServiceOperatingSession
   * @return pointofServiceOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession getPointofServiceOperatingSession() {
    return pointofServiceOperatingSession;
  }

  public void setPointofServiceOperatingSession(InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession pointofServiceOperatingSession) {
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
    InitiatePointofServiceOperatingSessionResponse initiatePointofServiceOperatingSessionResponse = (InitiatePointofServiceOperatingSessionResponse) o;
    return Objects.equals(this.pointofServiceOperatingSession, initiatePointofServiceOperatingSessionResponse.pointofServiceOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointofServiceOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePointofServiceOperatingSessionResponse {\n");
    
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

