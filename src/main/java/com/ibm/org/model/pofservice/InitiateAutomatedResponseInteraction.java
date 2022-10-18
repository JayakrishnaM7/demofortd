package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAutomatedResponseInteraction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class InitiateAutomatedResponseInteraction   {
  @JsonProperty("CustomerSessionDialogueReference")
  private Object customerSessionDialogueReference;

  public InitiateAutomatedResponseInteraction customerSessionDialogueReference(Object customerSessionDialogueReference) {
    this.customerSessionDialogueReference = customerSessionDialogueReference;
    return this;
  }

  /**
   * Get customerSessionDialogueReference
   * @return customerSessionDialogueReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerSessionDialogueReference() {
    return customerSessionDialogueReference;
  }

  public void setCustomerSessionDialogueReference(Object customerSessionDialogueReference) {
    this.customerSessionDialogueReference = customerSessionDialogueReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAutomatedResponseInteraction initiateAutomatedResponseInteraction = (InitiateAutomatedResponseInteraction) o;
    return Objects.equals(this.customerSessionDialogueReference, initiateAutomatedResponseInteraction.customerSessionDialogueReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerSessionDialogueReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAutomatedResponseInteraction {\n");
    
    sb.append("    customerSessionDialogueReference: ").append(toIndentedString(customerSessionDialogueReference)).append("\n");
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

