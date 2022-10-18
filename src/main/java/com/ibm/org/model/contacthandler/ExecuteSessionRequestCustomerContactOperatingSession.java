package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteSessionRequestCustomerContactOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class ExecuteSessionRequestCustomerContactOperatingSession   {
  @JsonProperty("CustomerContactRecord")
  private String customerContactRecord;

  @JsonProperty("CustomerContactRecordAuthenticationStatus")
  private String customerContactRecordAuthenticationStatus;

  public ExecuteSessionRequestCustomerContactOperatingSession customerContactRecord(String customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
    return this;
  }

  /**
   * Get customerContactRecord
   * @return customerContactRecord
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(String customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }

  public ExecuteSessionRequestCustomerContactOperatingSession customerContactRecordAuthenticationStatus(String customerContactRecordAuthenticationStatus) {
    this.customerContactRecordAuthenticationStatus = customerContactRecordAuthenticationStatus;
    return this;
  }

  /**
   * Get customerContactRecordAuthenticationStatus
   * @return customerContactRecordAuthenticationStatus
  */
  @ApiModelProperty(value = "")


  public String getCustomerContactRecordAuthenticationStatus() {
    return customerContactRecordAuthenticationStatus;
  }

  public void setCustomerContactRecordAuthenticationStatus(String customerContactRecordAuthenticationStatus) {
    this.customerContactRecordAuthenticationStatus = customerContactRecordAuthenticationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteSessionRequestCustomerContactOperatingSession executeSessionRequestCustomerContactOperatingSession = (ExecuteSessionRequestCustomerContactOperatingSession) o;
    return Objects.equals(this.customerContactRecord, executeSessionRequestCustomerContactOperatingSession.customerContactRecord) &&
        Objects.equals(this.customerContactRecordAuthenticationStatus, executeSessionRequestCustomerContactOperatingSession.customerContactRecordAuthenticationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactRecord, customerContactRecordAuthenticationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteSessionRequestCustomerContactOperatingSession {\n");
    
    sb.append("    customerContactRecord: ").append(toIndentedString(customerContactRecord)).append("\n");
    sb.append("    customerContactRecordAuthenticationStatus: ").append(toIndentedString(customerContactRecordAuthenticationStatus)).append("\n");
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

