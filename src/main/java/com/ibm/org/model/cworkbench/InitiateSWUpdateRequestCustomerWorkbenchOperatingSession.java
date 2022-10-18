package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateSWUpdateRequestCustomerWorkbenchOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class InitiateSWUpdateRequestCustomerWorkbenchOperatingSession   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("CustomerWorkbenchDeviceType")
  private String customerWorkbenchDeviceType;

  @JsonProperty("CustomerWorkbenchDeviceRegistration")
  private String customerWorkbenchDeviceRegistration;

  @JsonProperty("CustomerWorkbenchDeviceManufacturer")
  private String customerWorkbenchDeviceManufacturer;

  @JsonProperty("CustomerWorkbenchDeviceOperatingSystemOrVersionNumber")
  private String customerWorkbenchDeviceOperatingSystemOrVersionNumber;

  @JsonProperty("CustomerWorkbenchDeviceAccessPermissions")
  private String customerWorkbenchDeviceAccessPermissions;

  @JsonProperty("InstalledBankApplicationType")
  private String installedBankApplicationType;

  @JsonProperty("InstalledBankApplicationVersionNumber")
  private String installedBankApplicationVersionNumber;

  @JsonProperty("LastUpdateDateOrTime")
  private String lastUpdateDateOrTime;

  public InitiateSWUpdateRequestCustomerWorkbenchOperatingSession customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public InitiateSWUpdateRequestCustomerWorkbenchOperatingSession customerWorkbenchDeviceType(String customerWorkbenchDeviceType) {
    this.customerWorkbenchDeviceType = customerWorkbenchDeviceType;
    return this;
  }

  /**
   * Get customerWorkbenchDeviceType
   * @return customerWorkbenchDeviceType
  */
  @ApiModelProperty(value = "")


  public String getCustomerWorkbenchDeviceType() {
    return customerWorkbenchDeviceType;
  }

  public void setCustomerWorkbenchDeviceType(String customerWorkbenchDeviceType) {
    this.customerWorkbenchDeviceType = customerWorkbenchDeviceType;
  }

  public InitiateSWUpdateRequestCustomerWorkbenchOperatingSession customerWorkbenchDeviceRegistration(String customerWorkbenchDeviceRegistration) {
    this.customerWorkbenchDeviceRegistration = customerWorkbenchDeviceRegistration;
    return this;
  }

  /**
   * Get customerWorkbenchDeviceRegistration
   * @return customerWorkbenchDeviceRegistration
  */
  @ApiModelProperty(value = "")


  public String getCustomerWorkbenchDeviceRegistration() {
    return customerWorkbenchDeviceRegistration;
  }

  public void setCustomerWorkbenchDeviceRegistration(String customerWorkbenchDeviceRegistration) {
    this.customerWorkbenchDeviceRegistration = customerWorkbenchDeviceRegistration;
  }

  public InitiateSWUpdateRequestCustomerWorkbenchOperatingSession customerWorkbenchDeviceManufacturer(String customerWorkbenchDeviceManufacturer) {
    this.customerWorkbenchDeviceManufacturer = customerWorkbenchDeviceManufacturer;
    return this;
  }

  /**
   * Get customerWorkbenchDeviceManufacturer
   * @return customerWorkbenchDeviceManufacturer
  */
  @ApiModelProperty(value = "")


  public String getCustomerWorkbenchDeviceManufacturer() {
    return customerWorkbenchDeviceManufacturer;
  }

  public void setCustomerWorkbenchDeviceManufacturer(String customerWorkbenchDeviceManufacturer) {
    this.customerWorkbenchDeviceManufacturer = customerWorkbenchDeviceManufacturer;
  }

  public InitiateSWUpdateRequestCustomerWorkbenchOperatingSession customerWorkbenchDeviceOperatingSystemOrVersionNumber(String customerWorkbenchDeviceOperatingSystemOrVersionNumber) {
    this.customerWorkbenchDeviceOperatingSystemOrVersionNumber = customerWorkbenchDeviceOperatingSystemOrVersionNumber;
    return this;
  }

  /**
   * Get customerWorkbenchDeviceOperatingSystemOrVersionNumber
   * @return customerWorkbenchDeviceOperatingSystemOrVersionNumber
  */
  @ApiModelProperty(value = "")


  public String getCustomerWorkbenchDeviceOperatingSystemOrVersionNumber() {
    return customerWorkbenchDeviceOperatingSystemOrVersionNumber;
  }

  public void setCustomerWorkbenchDeviceOperatingSystemOrVersionNumber(String customerWorkbenchDeviceOperatingSystemOrVersionNumber) {
    this.customerWorkbenchDeviceOperatingSystemOrVersionNumber = customerWorkbenchDeviceOperatingSystemOrVersionNumber;
  }

  public InitiateSWUpdateRequestCustomerWorkbenchOperatingSession customerWorkbenchDeviceAccessPermissions(String customerWorkbenchDeviceAccessPermissions) {
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

  public InitiateSWUpdateRequestCustomerWorkbenchOperatingSession installedBankApplicationType(String installedBankApplicationType) {
    this.installedBankApplicationType = installedBankApplicationType;
    return this;
  }

  /**
   * Get installedBankApplicationType
   * @return installedBankApplicationType
  */
  @ApiModelProperty(value = "")


  public String getInstalledBankApplicationType() {
    return installedBankApplicationType;
  }

  public void setInstalledBankApplicationType(String installedBankApplicationType) {
    this.installedBankApplicationType = installedBankApplicationType;
  }

  public InitiateSWUpdateRequestCustomerWorkbenchOperatingSession installedBankApplicationVersionNumber(String installedBankApplicationVersionNumber) {
    this.installedBankApplicationVersionNumber = installedBankApplicationVersionNumber;
    return this;
  }

  /**
   * Get installedBankApplicationVersionNumber
   * @return installedBankApplicationVersionNumber
  */
  @ApiModelProperty(value = "")


  public String getInstalledBankApplicationVersionNumber() {
    return installedBankApplicationVersionNumber;
  }

  public void setInstalledBankApplicationVersionNumber(String installedBankApplicationVersionNumber) {
    this.installedBankApplicationVersionNumber = installedBankApplicationVersionNumber;
  }

  public InitiateSWUpdateRequestCustomerWorkbenchOperatingSession lastUpdateDateOrTime(String lastUpdateDateOrTime) {
    this.lastUpdateDateOrTime = lastUpdateDateOrTime;
    return this;
  }

  /**
   * Get lastUpdateDateOrTime
   * @return lastUpdateDateOrTime
  */
  @ApiModelProperty(value = "")


  public String getLastUpdateDateOrTime() {
    return lastUpdateDateOrTime;
  }

  public void setLastUpdateDateOrTime(String lastUpdateDateOrTime) {
    this.lastUpdateDateOrTime = lastUpdateDateOrTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateSWUpdateRequestCustomerWorkbenchOperatingSession initiateSWUpdateRequestCustomerWorkbenchOperatingSession = (InitiateSWUpdateRequestCustomerWorkbenchOperatingSession) o;
    return Objects.equals(this.customerReference, initiateSWUpdateRequestCustomerWorkbenchOperatingSession.customerReference) &&
        Objects.equals(this.customerWorkbenchDeviceType, initiateSWUpdateRequestCustomerWorkbenchOperatingSession.customerWorkbenchDeviceType) &&
        Objects.equals(this.customerWorkbenchDeviceRegistration, initiateSWUpdateRequestCustomerWorkbenchOperatingSession.customerWorkbenchDeviceRegistration) &&
        Objects.equals(this.customerWorkbenchDeviceManufacturer, initiateSWUpdateRequestCustomerWorkbenchOperatingSession.customerWorkbenchDeviceManufacturer) &&
        Objects.equals(this.customerWorkbenchDeviceOperatingSystemOrVersionNumber, initiateSWUpdateRequestCustomerWorkbenchOperatingSession.customerWorkbenchDeviceOperatingSystemOrVersionNumber) &&
        Objects.equals(this.customerWorkbenchDeviceAccessPermissions, initiateSWUpdateRequestCustomerWorkbenchOperatingSession.customerWorkbenchDeviceAccessPermissions) &&
        Objects.equals(this.installedBankApplicationType, initiateSWUpdateRequestCustomerWorkbenchOperatingSession.installedBankApplicationType) &&
        Objects.equals(this.installedBankApplicationVersionNumber, initiateSWUpdateRequestCustomerWorkbenchOperatingSession.installedBankApplicationVersionNumber) &&
        Objects.equals(this.lastUpdateDateOrTime, initiateSWUpdateRequestCustomerWorkbenchOperatingSession.lastUpdateDateOrTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, customerWorkbenchDeviceType, customerWorkbenchDeviceRegistration, customerWorkbenchDeviceManufacturer, customerWorkbenchDeviceOperatingSystemOrVersionNumber, customerWorkbenchDeviceAccessPermissions, installedBankApplicationType, installedBankApplicationVersionNumber, lastUpdateDateOrTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSWUpdateRequestCustomerWorkbenchOperatingSession {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    customerWorkbenchDeviceType: ").append(toIndentedString(customerWorkbenchDeviceType)).append("\n");
    sb.append("    customerWorkbenchDeviceRegistration: ").append(toIndentedString(customerWorkbenchDeviceRegistration)).append("\n");
    sb.append("    customerWorkbenchDeviceManufacturer: ").append(toIndentedString(customerWorkbenchDeviceManufacturer)).append("\n");
    sb.append("    customerWorkbenchDeviceOperatingSystemOrVersionNumber: ").append(toIndentedString(customerWorkbenchDeviceOperatingSystemOrVersionNumber)).append("\n");
    sb.append("    customerWorkbenchDeviceAccessPermissions: ").append(toIndentedString(customerWorkbenchDeviceAccessPermissions)).append("\n");
    sb.append("    installedBankApplicationType: ").append(toIndentedString(installedBankApplicationType)).append("\n");
    sb.append("    installedBankApplicationVersionNumber: ").append(toIndentedString(installedBankApplicationVersionNumber)).append("\n");
    sb.append("    lastUpdateDateOrTime: ").append(toIndentedString(lastUpdateDateOrTime)).append("\n");
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

