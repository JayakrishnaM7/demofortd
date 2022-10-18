package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.pofservice.UpdatePointofServiceOperatingSessionRequestPointofServiceOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatePointofServiceOperatingSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class UpdatePointofServiceOperatingSessionResponse   {
  @JsonProperty("PointofServiceOperatingSession")
  private UpdatePointofServiceOperatingSessionRequestPointofServiceOperatingSession pointofServiceOperatingSession;

  public UpdatePointofServiceOperatingSessionResponse pointofServiceOperatingSession(UpdatePointofServiceOperatingSessionRequestPointofServiceOperatingSession pointofServiceOperatingSession) {
    this.pointofServiceOperatingSession = pointofServiceOperatingSession;
    return this;
  }

  /**
   * Get pointofServiceOperatingSession
   * @return pointofServiceOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdatePointofServiceOperatingSessionRequestPointofServiceOperatingSession getPointofServiceOperatingSession() {
    return pointofServiceOperatingSession;
  }

  public void setPointofServiceOperatingSession(UpdatePointofServiceOperatingSessionRequestPointofServiceOperatingSession pointofServiceOperatingSession) {
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
    UpdatePointofServiceOperatingSessionResponse updatePointofServiceOperatingSessionResponse = (UpdatePointofServiceOperatingSessionResponse) o;
    return Objects.equals(this.pointofServiceOperatingSession, updatePointofServiceOperatingSessionResponse.pointofServiceOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointofServiceOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePointofServiceOperatingSessionResponse {\n");
    
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

