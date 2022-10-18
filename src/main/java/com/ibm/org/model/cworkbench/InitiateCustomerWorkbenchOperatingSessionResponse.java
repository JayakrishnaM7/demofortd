package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.cworkbench.InitiateCustomerWorkbenchOperatingSessionResponseCustomerWorkbenchOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerWorkbenchOperatingSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class InitiateCustomerWorkbenchOperatingSessionResponse   {
  @JsonProperty("CustomerWorkbenchOperatingSession")
  private InitiateCustomerWorkbenchOperatingSessionResponseCustomerWorkbenchOperatingSession customerWorkbenchOperatingSession;

  public InitiateCustomerWorkbenchOperatingSessionResponse customerWorkbenchOperatingSession(InitiateCustomerWorkbenchOperatingSessionResponseCustomerWorkbenchOperatingSession customerWorkbenchOperatingSession) {
    this.customerWorkbenchOperatingSession = customerWorkbenchOperatingSession;
    return this;
  }

  /**
   * Get customerWorkbenchOperatingSession
   * @return customerWorkbenchOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerWorkbenchOperatingSessionResponseCustomerWorkbenchOperatingSession getCustomerWorkbenchOperatingSession() {
    return customerWorkbenchOperatingSession;
  }

  public void setCustomerWorkbenchOperatingSession(InitiateCustomerWorkbenchOperatingSessionResponseCustomerWorkbenchOperatingSession customerWorkbenchOperatingSession) {
    this.customerWorkbenchOperatingSession = customerWorkbenchOperatingSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerWorkbenchOperatingSessionResponse initiateCustomerWorkbenchOperatingSessionResponse = (InitiateCustomerWorkbenchOperatingSessionResponse) o;
    return Objects.equals(this.customerWorkbenchOperatingSession, initiateCustomerWorkbenchOperatingSessionResponse.customerWorkbenchOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerWorkbenchOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerWorkbenchOperatingSessionResponse {\n");
    
    sb.append("    customerWorkbenchOperatingSession: ").append(toIndentedString(customerWorkbenchOperatingSession)).append("\n");
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

