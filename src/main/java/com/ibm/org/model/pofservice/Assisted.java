package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Assisted
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class Assisted   {
  @JsonProperty("Employee/BusinessUnitReference")
  private Object employeeBusinessUnitReference;

  @JsonProperty("CustomerContactReference")
  private Object customerContactReference;

  public Assisted employeeBusinessUnitReference(Object employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    return this;
  }

  /**
   * Get employeeBusinessUnitReference
   * @return employeeBusinessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(Object employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }

  public Assisted customerContactReference(Object customerContactReference) {
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
    Assisted assisted = (Assisted) o;
    return Objects.equals(this.employeeBusinessUnitReference, assisted.employeeBusinessUnitReference) &&
        Objects.equals(this.customerContactReference, assisted.customerContactReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeBusinessUnitReference, customerContactReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assisted {\n");
    
    sb.append("    employeeBusinessUnitReference: ").append(toIndentedString(employeeBusinessUnitReference)).append("\n");
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

