package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateSessionResponseSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class InitiateSessionResponseSession   {
  @JsonProperty("SessionTaskRecord")
  private String sessionTaskRecord;

  @JsonProperty("SessionResult")
  private String sessionResult;

  public InitiateSessionResponseSession sessionTaskRecord(String sessionTaskRecord) {
    this.sessionTaskRecord = sessionTaskRecord;
    return this;
  }

  /**
   * Get sessionTaskRecord
   * @return sessionTaskRecord
  */
  @ApiModelProperty(value = "")


  public String getSessionTaskRecord() {
    return sessionTaskRecord;
  }

  public void setSessionTaskRecord(String sessionTaskRecord) {
    this.sessionTaskRecord = sessionTaskRecord;
  }

  public InitiateSessionResponseSession sessionResult(String sessionResult) {
    this.sessionResult = sessionResult;
    return this;
  }

  /**
   * Get sessionResult
   * @return sessionResult
  */
  @ApiModelProperty(value = "")


  public String getSessionResult() {
    return sessionResult;
  }

  public void setSessionResult(String sessionResult) {
    this.sessionResult = sessionResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateSessionResponseSession initiateSessionResponseSession = (InitiateSessionResponseSession) o;
    return Objects.equals(this.sessionTaskRecord, initiateSessionResponseSession.sessionTaskRecord) &&
        Objects.equals(this.sessionResult, initiateSessionResponseSession.sessionResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionTaskRecord, sessionResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSessionResponseSession {\n");
    
    sb.append("    sessionTaskRecord: ").append(toIndentedString(sessionTaskRecord)).append("\n");
    sb.append("    sessionResult: ").append(toIndentedString(sessionResult)).append("\n");
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

