package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.contacthandler.RetrieveAuthenticationResponseAuthentication;
import com.ibm.org.model.contacthandler.RetrieveAuthenticationResponseCustomerContactOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveAuthenticationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class RetrieveAuthenticationResponse   {
  @JsonProperty("CustomerContactOperatingSession")
  private RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactOperatingSession;

  @JsonProperty("Authentication")
  private RetrieveAuthenticationResponseAuthentication authentication;

  public RetrieveAuthenticationResponse customerContactOperatingSession(RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactOperatingSession) {
    this.customerContactOperatingSession = customerContactOperatingSession;
    return this;
  }

  /**
   * Get customerContactOperatingSession
   * @return customerContactOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveAuthenticationResponseCustomerContactOperatingSession getCustomerContactOperatingSession() {
    return customerContactOperatingSession;
  }

  public void setCustomerContactOperatingSession(RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactOperatingSession) {
    this.customerContactOperatingSession = customerContactOperatingSession;
  }

  public RetrieveAuthenticationResponse authentication(RetrieveAuthenticationResponseAuthentication authentication) {
    this.authentication = authentication;
    return this;
  }

  /**
   * Get authentication
   * @return authentication
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveAuthenticationResponseAuthentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(RetrieveAuthenticationResponseAuthentication authentication) {
    this.authentication = authentication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAuthenticationResponse retrieveAuthenticationResponse = (RetrieveAuthenticationResponse) o;
    return Objects.equals(this.customerContactOperatingSession, retrieveAuthenticationResponse.customerContactOperatingSession) &&
        Objects.equals(this.authentication, retrieveAuthenticationResponse.authentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactOperatingSession, authentication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAuthenticationResponse {\n");
    
    sb.append("    customerContactOperatingSession: ").append(toIndentedString(customerContactOperatingSession)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
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

