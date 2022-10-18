package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.contacthandler.InitiateSessionResponseSession;
import com.ibm.org.model.contacthandler.UpdateSessionRequestCustomerContactOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class RetrieveSessionResponse   {
  @JsonProperty("CustomerContactOperatingSession")
  private UpdateSessionRequestCustomerContactOperatingSession customerContactOperatingSession;

  @JsonProperty("Session")
  private InitiateSessionResponseSession session;

  public RetrieveSessionResponse customerContactOperatingSession(UpdateSessionRequestCustomerContactOperatingSession customerContactOperatingSession) {
    this.customerContactOperatingSession = customerContactOperatingSession;
    return this;
  }

  /**
   * Get customerContactOperatingSession
   * @return customerContactOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateSessionRequestCustomerContactOperatingSession getCustomerContactOperatingSession() {
    return customerContactOperatingSession;
  }

  public void setCustomerContactOperatingSession(UpdateSessionRequestCustomerContactOperatingSession customerContactOperatingSession) {
    this.customerContactOperatingSession = customerContactOperatingSession;
  }

  public RetrieveSessionResponse session(InitiateSessionResponseSession session) {
    this.session = session;
    return this;
  }

  /**
   * Get session
   * @return session
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateSessionResponseSession getSession() {
    return session;
  }

  public void setSession(InitiateSessionResponseSession session) {
    this.session = session;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveSessionResponse retrieveSessionResponse = (RetrieveSessionResponse) o;
    return Objects.equals(this.customerContactOperatingSession, retrieveSessionResponse.customerContactOperatingSession) &&
        Objects.equals(this.session, retrieveSessionResponse.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactOperatingSession, session);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveSessionResponse {\n");
    
    sb.append("    customerContactOperatingSession: ").append(toIndentedString(customerContactOperatingSession)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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

