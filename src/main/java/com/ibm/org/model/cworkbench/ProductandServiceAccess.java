package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductandServiceAccess
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class ProductandServiceAccess   {
  @JsonProperty("CustomerDetails/Preferences")
  private String customerDetailsPreferences;

  @JsonProperty("ProductandServiceMenu")
  private String productandServiceMenu;

  @JsonProperty("ProductandServiceMenuAccessLog")
  private String productandServiceMenuAccessLog;

  @JsonProperty("AccessStart/EndTime")
  private String accessStartEndTime;

  @JsonProperty("CustomerResidentFiles")
  private String customerResidentFiles;

  public ProductandServiceAccess customerDetailsPreferences(String customerDetailsPreferences) {
    this.customerDetailsPreferences = customerDetailsPreferences;
    return this;
  }

  /**
   * Get customerDetailsPreferences
   * @return customerDetailsPreferences
  */
  @ApiModelProperty(value = "")


  public String getCustomerDetailsPreferences() {
    return customerDetailsPreferences;
  }

  public void setCustomerDetailsPreferences(String customerDetailsPreferences) {
    this.customerDetailsPreferences = customerDetailsPreferences;
  }

  public ProductandServiceAccess productandServiceMenu(String productandServiceMenu) {
    this.productandServiceMenu = productandServiceMenu;
    return this;
  }

  /**
   * Get productandServiceMenu
   * @return productandServiceMenu
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceMenu() {
    return productandServiceMenu;
  }

  public void setProductandServiceMenu(String productandServiceMenu) {
    this.productandServiceMenu = productandServiceMenu;
  }

  public ProductandServiceAccess productandServiceMenuAccessLog(String productandServiceMenuAccessLog) {
    this.productandServiceMenuAccessLog = productandServiceMenuAccessLog;
    return this;
  }

  /**
   * Get productandServiceMenuAccessLog
   * @return productandServiceMenuAccessLog
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceMenuAccessLog() {
    return productandServiceMenuAccessLog;
  }

  public void setProductandServiceMenuAccessLog(String productandServiceMenuAccessLog) {
    this.productandServiceMenuAccessLog = productandServiceMenuAccessLog;
  }

  public ProductandServiceAccess accessStartEndTime(String accessStartEndTime) {
    this.accessStartEndTime = accessStartEndTime;
    return this;
  }

  /**
   * Get accessStartEndTime
   * @return accessStartEndTime
  */
  @ApiModelProperty(value = "")


  public String getAccessStartEndTime() {
    return accessStartEndTime;
  }

  public void setAccessStartEndTime(String accessStartEndTime) {
    this.accessStartEndTime = accessStartEndTime;
  }

  public ProductandServiceAccess customerResidentFiles(String customerResidentFiles) {
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
    ProductandServiceAccess productandServiceAccess = (ProductandServiceAccess) o;
    return Objects.equals(this.customerDetailsPreferences, productandServiceAccess.customerDetailsPreferences) &&
        Objects.equals(this.productandServiceMenu, productandServiceAccess.productandServiceMenu) &&
        Objects.equals(this.productandServiceMenuAccessLog, productandServiceAccess.productandServiceMenuAccessLog) &&
        Objects.equals(this.accessStartEndTime, productandServiceAccess.accessStartEndTime) &&
        Objects.equals(this.customerResidentFiles, productandServiceAccess.customerResidentFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerDetailsPreferences, productandServiceMenu, productandServiceMenuAccessLog, accessStartEndTime, customerResidentFiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductandServiceAccess {\n");
    
    sb.append("    customerDetailsPreferences: ").append(toIndentedString(customerDetailsPreferences)).append("\n");
    sb.append("    productandServiceMenu: ").append(toIndentedString(productandServiceMenu)).append("\n");
    sb.append("    productandServiceMenuAccessLog: ").append(toIndentedString(productandServiceMenuAccessLog)).append("\n");
    sb.append("    accessStartEndTime: ").append(toIndentedString(accessStartEndTime)).append("\n");
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

