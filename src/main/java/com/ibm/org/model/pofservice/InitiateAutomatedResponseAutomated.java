package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAutomatedResponseAutomated
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class InitiateAutomatedResponseAutomated   {
  @JsonProperty("BusinessUnitReference")
  private Object businessUnitReference;

  public InitiateAutomatedResponseAutomated businessUnitReference(Object businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
    return this;
  }

  /**
   * Get businessUnitReference
   * @return businessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(Object businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAutomatedResponseAutomated initiateAutomatedResponseAutomated = (InitiateAutomatedResponseAutomated) o;
    return Objects.equals(this.businessUnitReference, initiateAutomatedResponseAutomated.businessUnitReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUnitReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAutomatedResponseAutomated {\n");
    
    sb.append("    businessUnitReference: ").append(toIndentedString(businessUnitReference)).append("\n");
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

