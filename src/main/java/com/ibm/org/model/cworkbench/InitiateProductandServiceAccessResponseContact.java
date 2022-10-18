package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateProductandServiceAccessResponseContact
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class InitiateProductandServiceAccessResponseContact   {
  @JsonProperty("ContactStartOrEndTime")
  private String contactStartOrEndTime;

  @JsonProperty("ContactActivityLog")
  private String contactActivityLog;

  public InitiateProductandServiceAccessResponseContact contactStartOrEndTime(String contactStartOrEndTime) {
    this.contactStartOrEndTime = contactStartOrEndTime;
    return this;
  }

  /**
   * Get contactStartOrEndTime
   * @return contactStartOrEndTime
  */
  @ApiModelProperty(value = "")


  public String getContactStartOrEndTime() {
    return contactStartOrEndTime;
  }

  public void setContactStartOrEndTime(String contactStartOrEndTime) {
    this.contactStartOrEndTime = contactStartOrEndTime;
  }

  public InitiateProductandServiceAccessResponseContact contactActivityLog(String contactActivityLog) {
    this.contactActivityLog = contactActivityLog;
    return this;
  }

  /**
   * Get contactActivityLog
   * @return contactActivityLog
  */
  @ApiModelProperty(value = "")


  public String getContactActivityLog() {
    return contactActivityLog;
  }

  public void setContactActivityLog(String contactActivityLog) {
    this.contactActivityLog = contactActivityLog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateProductandServiceAccessResponseContact initiateProductandServiceAccessResponseContact = (InitiateProductandServiceAccessResponseContact) o;
    return Objects.equals(this.contactStartOrEndTime, initiateProductandServiceAccessResponseContact.contactStartOrEndTime) &&
        Objects.equals(this.contactActivityLog, initiateProductandServiceAccessResponseContact.contactActivityLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactStartOrEndTime, contactActivityLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateProductandServiceAccessResponseContact {\n");
    
    sb.append("    contactStartOrEndTime: ").append(toIndentedString(contactStartOrEndTime)).append("\n");
    sb.append("    contactActivityLog: ").append(toIndentedString(contactActivityLog)).append("\n");
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

