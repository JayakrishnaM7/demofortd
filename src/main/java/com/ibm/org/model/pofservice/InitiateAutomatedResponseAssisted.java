package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAutomatedResponseAssisted
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class InitiateAutomatedResponseAssisted   {
  @JsonProperty("CustomerContactReference")
  private Object customerContactReference;

  public InitiateAutomatedResponseAssisted customerContactReference(Object customerContactReference) {
    this.customerContactReference = customerContactReference;
    return this;
  }

  /**
   * Get customerContactReference
   * @return customerContactReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerContactReference() {
    return customerContactReference;
  }

  public void setCustomerContactReference(Object customerContactReference) {
    this.customerContactReference = customerContactReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAutomatedResponseAssisted initiateAutomatedResponseAssisted = (InitiateAutomatedResponseAssisted) o;
    return Objects.equals(this.customerContactReference, initiateAutomatedResponseAssisted.customerContactReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAutomatedResponseAssisted {\n");
    
    sb.append("    customerContactReference: ").append(toIndentedString(customerContactReference)).append("\n");
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

