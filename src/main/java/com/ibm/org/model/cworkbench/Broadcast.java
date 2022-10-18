package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Broadcast
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class Broadcast   {
  @JsonProperty("CustomerWorkbenchBroadcastRecord")
  private String customerWorkbenchBroadcastRecord;

  @JsonProperty("CustomerWorkbenchBroadcastRecordDate/Time")
  private String customerWorkbenchBroadcastRecordDateTime;

  public Broadcast customerWorkbenchBroadcastRecord(String customerWorkbenchBroadcastRecord) {
    this.customerWorkbenchBroadcastRecord = customerWorkbenchBroadcastRecord;
    return this;
  }

  /**
   * Get customerWorkbenchBroadcastRecord
   * @return customerWorkbenchBroadcastRecord
  */
  @ApiModelProperty(value = "")


  public String getCustomerWorkbenchBroadcastRecord() {
    return customerWorkbenchBroadcastRecord;
  }

  public void setCustomerWorkbenchBroadcastRecord(String customerWorkbenchBroadcastRecord) {
    this.customerWorkbenchBroadcastRecord = customerWorkbenchBroadcastRecord;
  }

  public Broadcast customerWorkbenchBroadcastRecordDateTime(String customerWorkbenchBroadcastRecordDateTime) {
    this.customerWorkbenchBroadcastRecordDateTime = customerWorkbenchBroadcastRecordDateTime;
    return this;
  }

  /**
   * Get customerWorkbenchBroadcastRecordDateTime
   * @return customerWorkbenchBroadcastRecordDateTime
  */
  @ApiModelProperty(value = "")


  public String getCustomerWorkbenchBroadcastRecordDateTime() {
    return customerWorkbenchBroadcastRecordDateTime;
  }

  public void setCustomerWorkbenchBroadcastRecordDateTime(String customerWorkbenchBroadcastRecordDateTime) {
    this.customerWorkbenchBroadcastRecordDateTime = customerWorkbenchBroadcastRecordDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Broadcast broadcast = (Broadcast) o;
    return Objects.equals(this.customerWorkbenchBroadcastRecord, broadcast.customerWorkbenchBroadcastRecord) &&
        Objects.equals(this.customerWorkbenchBroadcastRecordDateTime, broadcast.customerWorkbenchBroadcastRecordDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerWorkbenchBroadcastRecord, customerWorkbenchBroadcastRecordDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Broadcast {\n");
    
    sb.append("    customerWorkbenchBroadcastRecord: ").append(toIndentedString(customerWorkbenchBroadcastRecord)).append("\n");
    sb.append("    customerWorkbenchBroadcastRecordDateTime: ").append(toIndentedString(customerWorkbenchBroadcastRecordDateTime)).append("\n");
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

