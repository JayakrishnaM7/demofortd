package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateSWUpdateResponseCustomerWorkbenchOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class InitiateSWUpdateResponseCustomerWorkbenchOperatingSession   {
  @JsonProperty("InstalledBankApplicationType")
  private String installedBankApplicationType;

  @JsonProperty("InstalledBankApplicationVersionNumber")
  private String installedBankApplicationVersionNumber;

  @JsonProperty("LastUpdateDateOrTime")
  private String lastUpdateDateOrTime;

  public InitiateSWUpdateResponseCustomerWorkbenchOperatingSession installedBankApplicationType(String installedBankApplicationType) {
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

  public InitiateSWUpdateResponseCustomerWorkbenchOperatingSession installedBankApplicationVersionNumber(String installedBankApplicationVersionNumber) {
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

  public InitiateSWUpdateResponseCustomerWorkbenchOperatingSession lastUpdateDateOrTime(String lastUpdateDateOrTime) {
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
    InitiateSWUpdateResponseCustomerWorkbenchOperatingSession initiateSWUpdateResponseCustomerWorkbenchOperatingSession = (InitiateSWUpdateResponseCustomerWorkbenchOperatingSession) o;
    return Objects.equals(this.installedBankApplicationType, initiateSWUpdateResponseCustomerWorkbenchOperatingSession.installedBankApplicationType) &&
        Objects.equals(this.installedBankApplicationVersionNumber, initiateSWUpdateResponseCustomerWorkbenchOperatingSession.installedBankApplicationVersionNumber) &&
        Objects.equals(this.lastUpdateDateOrTime, initiateSWUpdateResponseCustomerWorkbenchOperatingSession.lastUpdateDateOrTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installedBankApplicationType, installedBankApplicationVersionNumber, lastUpdateDateOrTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSWUpdateResponseCustomerWorkbenchOperatingSession {\n");
    
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

