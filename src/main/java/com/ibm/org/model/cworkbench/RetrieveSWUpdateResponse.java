package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.cworkbench.InitiateSWUpdateRequestCustomerWorkbenchOperatingSession;
import com.ibm.org.model.cworkbench.InitiateSWUpdateRequestSWUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveSWUpdateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class RetrieveSWUpdateResponse   {
  @JsonProperty("CustomerWorkbenchOperatingSession")
  private InitiateSWUpdateRequestCustomerWorkbenchOperatingSession customerWorkbenchOperatingSession;

  @JsonProperty("SWUpdate")
  private InitiateSWUpdateRequestSWUpdate swUpdate;

  public RetrieveSWUpdateResponse customerWorkbenchOperatingSession(InitiateSWUpdateRequestCustomerWorkbenchOperatingSession customerWorkbenchOperatingSession) {
    this.customerWorkbenchOperatingSession = customerWorkbenchOperatingSession;
    return this;
  }

  /**
   * Get customerWorkbenchOperatingSession
   * @return customerWorkbenchOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateSWUpdateRequestCustomerWorkbenchOperatingSession getCustomerWorkbenchOperatingSession() {
    return customerWorkbenchOperatingSession;
  }

  public void setCustomerWorkbenchOperatingSession(InitiateSWUpdateRequestCustomerWorkbenchOperatingSession customerWorkbenchOperatingSession) {
    this.customerWorkbenchOperatingSession = customerWorkbenchOperatingSession;
  }

  public RetrieveSWUpdateResponse swUpdate(InitiateSWUpdateRequestSWUpdate swUpdate) {
    this.swUpdate = swUpdate;
    return this;
  }

  /**
   * Get swUpdate
   * @return swUpdate
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateSWUpdateRequestSWUpdate getSwUpdate() {
    return swUpdate;
  }

  public void setSwUpdate(InitiateSWUpdateRequestSWUpdate swUpdate) {
    this.swUpdate = swUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveSWUpdateResponse retrieveSWUpdateResponse = (RetrieveSWUpdateResponse) o;
    return Objects.equals(this.customerWorkbenchOperatingSession, retrieveSWUpdateResponse.customerWorkbenchOperatingSession) &&
        Objects.equals(this.swUpdate, retrieveSWUpdateResponse.swUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerWorkbenchOperatingSession, swUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveSWUpdateResponse {\n");
    
    sb.append("    customerWorkbenchOperatingSession: ").append(toIndentedString(customerWorkbenchOperatingSession)).append("\n");
    sb.append("    swUpdate: ").append(toIndentedString(swUpdate)).append("\n");
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

