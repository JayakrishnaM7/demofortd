package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contact
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class Contact   {
  @JsonProperty("ContactStart/EndTime")
  private String contactStartEndTime;

  @JsonProperty("ContactActivityLog")
  private String contactActivityLog;

  public Contact contactStartEndTime(String contactStartEndTime) {
    this.contactStartEndTime = contactStartEndTime;
    return this;
  }

  /**
   * Get contactStartEndTime
   * @return contactStartEndTime
  */
  @ApiModelProperty(value = "")


  public String getContactStartEndTime() {
    return contactStartEndTime;
  }

  public void setContactStartEndTime(String contactStartEndTime) {
    this.contactStartEndTime = contactStartEndTime;
  }

  public Contact contactActivityLog(String contactActivityLog) {
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
    Contact contact = (Contact) o;
    return Objects.equals(this.contactStartEndTime, contact.contactStartEndTime) &&
        Objects.equals(this.contactActivityLog, contact.contactActivityLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactStartEndTime, contactActivityLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    contactStartEndTime: ").append(toIndentedString(contactStartEndTime)).append("\n");
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

