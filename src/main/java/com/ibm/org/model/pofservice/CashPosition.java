package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashPosition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class CashPosition   {
  @JsonProperty("ServicingCurrency")
  private String servicingCurrency;

  @JsonProperty("ServicingCashHoldingRecord")
  private String servicingCashHoldingRecord;

  @JsonProperty("ServicingCashTransactionReference")
  private Object servicingCashTransactionReference;

  @JsonProperty("ServicingCashTransactionRecord")
  private String servicingCashTransactionRecord;

  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  public CashPosition servicingCurrency(String servicingCurrency) {
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

  public CashPosition servicingCashHoldingRecord(String servicingCashHoldingRecord) {
    this.servicingCashHoldingRecord = servicingCashHoldingRecord;
    return this;
  }

  /**
   * Get servicingCashHoldingRecord
   * @return servicingCashHoldingRecord
  */
  @ApiModelProperty(value = "")


  public String getServicingCashHoldingRecord() {
    return servicingCashHoldingRecord;
  }

  public void setServicingCashHoldingRecord(String servicingCashHoldingRecord) {
    this.servicingCashHoldingRecord = servicingCashHoldingRecord;
  }

  public CashPosition servicingCashTransactionReference(Object servicingCashTransactionReference) {
    this.servicingCashTransactionReference = servicingCashTransactionReference;
    return this;
  }

  /**
   * Get servicingCashTransactionReference
   * @return servicingCashTransactionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getServicingCashTransactionReference() {
    return servicingCashTransactionReference;
  }

  public void setServicingCashTransactionReference(Object servicingCashTransactionReference) {
    this.servicingCashTransactionReference = servicingCashTransactionReference;
  }

  public CashPosition servicingCashTransactionRecord(String servicingCashTransactionRecord) {
    this.servicingCashTransactionRecord = servicingCashTransactionRecord;
    return this;
  }

  /**
   * Get servicingCashTransactionRecord
   * @return servicingCashTransactionRecord
  */
  @ApiModelProperty(value = "")


  public String getServicingCashTransactionRecord() {
    return servicingCashTransactionRecord;
  }

  public void setServicingCashTransactionRecord(String servicingCashTransactionRecord) {
    this.servicingCashTransactionRecord = servicingCashTransactionRecord;
  }

  public CashPosition productInstanceReference(Object productInstanceReference) {
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
    CashPosition cashPosition = (CashPosition) o;
    return Objects.equals(this.servicingCurrency, cashPosition.servicingCurrency) &&
        Objects.equals(this.servicingCashHoldingRecord, cashPosition.servicingCashHoldingRecord) &&
        Objects.equals(this.servicingCashTransactionReference, cashPosition.servicingCashTransactionReference) &&
        Objects.equals(this.servicingCashTransactionRecord, cashPosition.servicingCashTransactionRecord) &&
        Objects.equals(this.productInstanceReference, cashPosition.productInstanceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicingCurrency, servicingCashHoldingRecord, servicingCashTransactionReference, servicingCashTransactionRecord, productInstanceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashPosition {\n");
    
    sb.append("    servicingCurrency: ").append(toIndentedString(servicingCurrency)).append("\n");
    sb.append("    servicingCashHoldingRecord: ").append(toIndentedString(servicingCashHoldingRecord)).append("\n");
    sb.append("    servicingCashTransactionReference: ").append(toIndentedString(servicingCashTransactionReference)).append("\n");
    sb.append("    servicingCashTransactionRecord: ").append(toIndentedString(servicingCashTransactionRecord)).append("\n");
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

