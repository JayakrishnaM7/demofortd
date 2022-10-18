package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteCashPositionRequestCashPosition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class ExecuteCashPositionRequestCashPosition   {
  @JsonProperty("ServicingCurrency")
  private String servicingCurrency;

  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  public ExecuteCashPositionRequestCashPosition servicingCurrency(String servicingCurrency) {
    this.servicingCurrency = servicingCurrency;
    return this;
  }

  /**
   * Get servicingCurrency
   * @return servicingCurrency
  */
  @ApiModelProperty(value = "")


  public String getServicingCurrency() {
    return servicingCurrency;
  }

  public void setServicingCurrency(String servicingCurrency) {
    this.servicingCurrency = servicingCurrency;
  }

  public ExecuteCashPositionRequestCashPosition productInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * Get productInstanceReference
   * @return productInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteCashPositionRequestCashPosition executeCashPositionRequestCashPosition = (ExecuteCashPositionRequestCashPosition) o;
    return Objects.equals(this.servicingCurrency, executeCashPositionRequestCashPosition.servicingCurrency) &&
        Objects.equals(this.productInstanceReference, executeCashPositionRequestCashPosition.productInstanceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicingCurrency, productInstanceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteCashPositionRequestCashPosition {\n");
    
    sb.append("    servicingCurrency: ").append(toIndentedString(servicingCurrency)).append("\n");
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
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

