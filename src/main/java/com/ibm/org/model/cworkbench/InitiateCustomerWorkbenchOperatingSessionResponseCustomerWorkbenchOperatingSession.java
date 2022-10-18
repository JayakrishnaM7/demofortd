package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerWorkbenchOperatingSessionResponseCustomerWorkbenchOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class InitiateCustomerWorkbenchOperatingSessionResponseCustomerWorkbenchOperatingSession   {
  @JsonProperty("CustomerWorkbenchDeviceAccessPermissions")
  private String customerWorkbenchDeviceAccessPermissions;

  public InitiateCustomerWorkbenchOperatingSessionResponseCustomerWorkbenchOperatingSession customerWorkbenchDeviceAccessPermissions(String customerWorkbenchDeviceAccessPermissions) {
    this.customerWorkbenchDeviceAccessPermissions = customerWorkbenchDeviceAccessPermissions;
    return this;
  }

  /**
   * Get customerWorkbenchDeviceAccessPermissions
   * @return customerWorkbenchDeviceAccessPermissions
  */
  @ApiModelProperty(value = "")


  public String getCustomerWorkbenchDeviceAccessPermissions() {
    return customerWorkbenchDeviceAccessPermissions;
  }

  public void setCustomerWorkbenchDeviceAccessPermissions(String customerWorkbenchDeviceAccessPermissions) {
    this.customerWorkbenchDeviceAccessPermissions = customerWorkbenchDeviceAccessPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerWorkbenchOperatingSessionResponseCustomerWorkbenchOperatingSession initiateCustomerWorkbenchOperatingSessionResponseCustomerWorkbenchOperatingSession = (InitiateCustomerWorkbenchOperatingSessionResponseCustomerWorkbenchOperatingSession) o;
    return Objects.equals(this.customerWorkbenchDeviceAccessPermissions, initiateCustomerWorkbenchOperatingSessionResponseCustomerWorkbenchOperatingSession.customerWorkbenchDeviceAccessPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerWorkbenchDeviceAccessPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerWorkbenchOperatingSessionResponseCustomerWorkbenchOperatingSession {\n");
    
    sb.append("    customerWorkbenchDeviceAccessPermissions: ").append(toIndentedString(customerWorkbenchDeviceAccessPermissions)).append("\n");
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

