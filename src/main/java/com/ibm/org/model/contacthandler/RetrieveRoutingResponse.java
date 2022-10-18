package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.contacthandler.RetrieveAuthenticationResponseCustomerContactOperatingSession;
import com.ibm.org.model.contacthandler.RetrieveRoutingResponseRouting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveRoutingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class RetrieveRoutingResponse   {
  @JsonProperty("CustomerContactOperatingSession")
  private RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactOperatingSession;

  @JsonProperty("Routing")
  private RetrieveRoutingResponseRouting routing;

  public RetrieveRoutingResponse customerContactOperatingSession(RetrieveAuthenticationResponseCustomerContactOperatingSession customerContactOperatingSession) {
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

  public RetrieveRoutingResponse routing(RetrieveRoutingResponseRouting routing) {
    this.routing = routing;
    return this;
  }

  /**
   * Get routing
   * @return routing
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveRoutingResponseRouting getRouting() {
    return routing;
  }

  public void setRouting(RetrieveRoutingResponseRouting routing) {
    this.routing = routing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveRoutingResponse retrieveRoutingResponse = (RetrieveRoutingResponse) o;
    return Objects.equals(this.customerContactOperatingSession, retrieveRoutingResponse.customerContactOperatingSession) &&
        Objects.equals(this.routing, retrieveRoutingResponse.routing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactOperatingSession, routing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveRoutingResponse {\n");
    
    sb.append("    customerContactOperatingSession: ").append(toIndentedString(customerContactOperatingSession)).append("\n");
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
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

