package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Browsing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class Browsing   {
  @JsonProperty("CustomerURL")
  private String customerURL;

  @JsonProperty("BankWebsiteURL")
  private String bankWebsiteURL;

  public Browsing customerURL(String customerURL) {
    this.customerURL = customerURL;
    return this;
  }

  /**
   * Get customerURL
   * @return customerURL
  */
  @ApiModelProperty(value = "")


  public String getCustomerURL() {
    return customerURL;
  }

  public void setCustomerURL(String customerURL) {
    this.customerURL = customerURL;
  }

  public Browsing bankWebsiteURL(String bankWebsiteURL) {
    this.bankWebsiteURL = bankWebsiteURL;
    return this;
  }

  /**
   * Get bankWebsiteURL
   * @return bankWebsiteURL
  */
  @ApiModelProperty(value = "")


  public String getBankWebsiteURL() {
    return bankWebsiteURL;
  }

  public void setBankWebsiteURL(String bankWebsiteURL) {
    this.bankWebsiteURL = bankWebsiteURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Browsing browsing = (Browsing) o;
    return Objects.equals(this.customerURL, browsing.customerURL) &&
        Objects.equals(this.bankWebsiteURL, browsing.bankWebsiteURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerURL, bankWebsiteURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Browsing {\n");
    
    sb.append("    customerURL: ").append(toIndentedString(customerURL)).append("\n");
    sb.append("    bankWebsiteURL: ").append(toIndentedString(bankWebsiteURL)).append("\n");
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

