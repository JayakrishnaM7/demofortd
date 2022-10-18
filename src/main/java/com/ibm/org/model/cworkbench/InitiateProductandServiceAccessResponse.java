package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.cworkbench.InitiateProductandServiceAccessResponseContact;
import com.ibm.org.model.cworkbench.InitiateProductandServiceAccessResponseProductandServiceAccess;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateProductandServiceAccessResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class InitiateProductandServiceAccessResponse   {
  @JsonProperty("Contact")
  private InitiateProductandServiceAccessResponseContact contact;

  @JsonProperty("ProductandServiceAccess")
  private InitiateProductandServiceAccessResponseProductandServiceAccess productandServiceAccess;

  public InitiateProductandServiceAccessResponse contact(InitiateProductandServiceAccessResponseContact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateProductandServiceAccessResponseContact getContact() {
    return contact;
  }

  public void setContact(InitiateProductandServiceAccessResponseContact contact) {
    this.contact = contact;
  }

  public InitiateProductandServiceAccessResponse productandServiceAccess(InitiateProductandServiceAccessResponseProductandServiceAccess productandServiceAccess) {
    this.productandServiceAccess = productandServiceAccess;
    return this;
  }

  /**
   * Get productandServiceAccess
   * @return productandServiceAccess
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateProductandServiceAccessResponseProductandServiceAccess getProductandServiceAccess() {
    return productandServiceAccess;
  }

  public void setProductandServiceAccess(InitiateProductandServiceAccessResponseProductandServiceAccess productandServiceAccess) {
    this.productandServiceAccess = productandServiceAccess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateProductandServiceAccessResponse initiateProductandServiceAccessResponse = (InitiateProductandServiceAccessResponse) o;
    return Objects.equals(this.contact, initiateProductandServiceAccessResponse.contact) &&
        Objects.equals(this.productandServiceAccess, initiateProductandServiceAccessResponse.productandServiceAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, productandServiceAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateProductandServiceAccessResponse {\n");
    
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    productandServiceAccess: ").append(toIndentedString(productandServiceAccess)).append("\n");
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

