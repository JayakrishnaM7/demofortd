package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.contacthandler.UpdateCustomerContactOperatingSessionRequestCustomerContactOperatingSession;
import com.ibm.org.model.contacthandler.UpdateHistoryRequestHistory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateHistoryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class UpdateHistoryRequest   {
  @JsonProperty("CustomerContactOperatingSession")
  private UpdateCustomerContactOperatingSessionRequestCustomerContactOperatingSession customerContactOperatingSession;

  @JsonProperty("History")
  private UpdateHistoryRequestHistory history;

  public UpdateHistoryRequest customerContactOperatingSession(UpdateCustomerContactOperatingSessionRequestCustomerContactOperatingSession customerContactOperatingSession) {
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

  public UpdateHistoryRequest history(UpdateHistoryRequestHistory history) {
    this.history = history;
    return this;
  }

  /**
   * Get history
   * @return history
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateHistoryRequestHistory getHistory() {
    return history;
  }

  public void setHistory(UpdateHistoryRequestHistory history) {
    this.history = history;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateHistoryRequest updateHistoryRequest = (UpdateHistoryRequest) o;
    return Objects.equals(this.customerContactOperatingSession, updateHistoryRequest.customerContactOperatingSession) &&
        Objects.equals(this.history, updateHistoryRequest.history);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactOperatingSession, history);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateHistoryRequest {\n");
    
    sb.append("    customerContactOperatingSession: ").append(toIndentedString(customerContactOperatingSession)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
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

