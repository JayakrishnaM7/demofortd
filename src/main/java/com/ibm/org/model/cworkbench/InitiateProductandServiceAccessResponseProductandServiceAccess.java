package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateProductandServiceAccessResponseProductandServiceAccess
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class InitiateProductandServiceAccessResponseProductandServiceAccess   {
  @JsonProperty("AccessStartOrEndTime")
  private String accessStartOrEndTime;

  @JsonProperty("CustomerResidentFiles")
  private String customerResidentFiles;

  public InitiateProductandServiceAccessResponseProductandServiceAccess accessStartOrEndTime(String accessStartOrEndTime) {
    this.accessStartOrEndTime = accessStartOrEndTime;
    return this;
  }

  /**
   * Get accessStartOrEndTime
   * @return accessStartOrEndTime
  */
  @ApiModelProperty(value = "")


  public String getAccessStartOrEndTime() {
    return accessStartOrEndTime;
  }

  public void setAccessStartOrEndTime(String accessStartOrEndTime) {
    this.accessStartOrEndTime = accessStartOrEndTime;
  }

  public InitiateProductandServiceAccessResponseProductandServiceAccess customerResidentFiles(String customerResidentFiles) {
    this.customerResidentFiles = customerResidentFiles;
    return this;
  }

  /**
   * Get customerResidentFiles
   * @return customerResidentFiles
  */
  @ApiModelProperty(value = "")


  public String getCustomerResidentFiles() {
    return customerResidentFiles;
  }

  public void setCustomerResidentFiles(String customerResidentFiles) {
    this.customerResidentFiles = customerResidentFiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateProductandServiceAccessResponseProductandServiceAccess initiateProductandServiceAccessResponseProductandServiceAccess = (InitiateProductandServiceAccessResponseProductandServiceAccess) o;
    return Objects.equals(this.accessStartOrEndTime, initiateProductandServiceAccessResponseProductandServiceAccess.accessStartOrEndTime) &&
        Objects.equals(this.customerResidentFiles, initiateProductandServiceAccessResponseProductandServiceAccess.customerResidentFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessStartOrEndTime, customerResidentFiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateProductandServiceAccessResponseProductandServiceAccess {\n");
    
    sb.append("    accessStartOrEndTime: ").append(toIndentedString(accessStartOrEndTime)).append("\n");
    sb.append("    customerResidentFiles: ").append(toIndentedString(customerResidentFiles)).append("\n");
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

