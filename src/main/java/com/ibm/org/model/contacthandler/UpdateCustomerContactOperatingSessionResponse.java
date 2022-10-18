package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.contacthandler.UpdateCustomerContactOperatingSessionRequestCustomerContactOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateCustomerContactOperatingSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class UpdateCustomerContactOperatingSessionResponse   {
  @JsonProperty("CustomerContactOperatingSession")
  private UpdateCustomerContactOperatingSessionRequestCustomerContactOperatingSession customerContactOperatingSession;

  public UpdateCustomerContactOperatingSessionResponse customerContactOperatingSession(UpdateCustomerContactOperatingSessionRequestCustomerContactOperatingSession customerContactOperatingSession) {
    this.customerContactOperatingSession = customerContactOperatingSession;
    return this;
  }

  /**
   * Get customerContactOperatingSession
   * @return customerContactOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateCustomerContactOperatingSessionRequestCustomerContactOperatingSession getCustomerContactOperatingSession() {
    return customerContactOperatingSession;
  }

  public void setCustomerContactOperatingSession(UpdateCustomerContactOperatingSessionRequestCustomerContactOperatingSession customerContactOperatingSession) {
    this.customerContactOperatingSession = customerContactOperatingSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerContactOperatingSessionResponse updateCustomerContactOperatingSessionResponse = (UpdateCustomerContactOperatingSessionResponse) o;
    return Objects.equals(this.customerContactOperatingSession, updateCustomerContactOperatingSessionResponse.customerContactOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerContactOperatingSessionResponse {\n");
    
    sb.append("    customerContactOperatingSession: ").append(toIndentedString(customerContactOperatingSession)).append("\n");
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

