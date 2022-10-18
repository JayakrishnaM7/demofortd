package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateBroadcastResponseBroadcast
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class InitiateBroadcastResponseBroadcast   {
  @JsonProperty("CustomerWorkbenchBroadcastRecordDateOrTime")
  private String customerWorkbenchBroadcastRecordDateOrTime;

  public InitiateBroadcastResponseBroadcast customerWorkbenchBroadcastRecordDateOrTime(String customerWorkbenchBroadcastRecordDateOrTime) {
    this.customerWorkbenchBroadcastRecordDateOrTime = customerWorkbenchBroadcastRecordDateOrTime;
    return this;
  }

  /**
   * Get customerWorkbenchBroadcastRecordDateOrTime
   * @return customerWorkbenchBroadcastRecordDateOrTime
  */
  @ApiModelProperty(value = "")


  public String getCustomerWorkbenchBroadcastRecordDateOrTime() {
    return customerWorkbenchBroadcastRecordDateOrTime;
  }

  public void setCustomerWorkbenchBroadcastRecordDateOrTime(String customerWorkbenchBroadcastRecordDateOrTime) {
    this.customerWorkbenchBroadcastRecordDateOrTime = customerWorkbenchBroadcastRecordDateOrTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateBroadcastResponseBroadcast initiateBroadcastResponseBroadcast = (InitiateBroadcastResponseBroadcast) o;
    return Objects.equals(this.customerWorkbenchBroadcastRecordDateOrTime, initiateBroadcastResponseBroadcast.customerWorkbenchBroadcastRecordDateOrTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerWorkbenchBroadcastRecordDateOrTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateBroadcastResponseBroadcast {\n");
    
    sb.append("    customerWorkbenchBroadcastRecordDateOrTime: ").append(toIndentedString(customerWorkbenchBroadcastRecordDateOrTime)).append("\n");
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

