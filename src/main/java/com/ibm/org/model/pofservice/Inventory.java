package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Inventory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class Inventory   {
  @JsonProperty("ServicingInventoryType")
  private String servicingInventoryType;

  @JsonProperty("ServicingPositionInventoryRecord")
  private String servicingPositionInventoryRecord;

  @JsonProperty("ServicingInventoryTransactionRecord")
  private String servicingInventoryTransactionRecord;

  public Inventory servicingInventoryType(String servicingInventoryType) {
    this.servicingInventoryType = servicingInventoryType;
    return this;
  }

  /**
   * Get servicingInventoryType
   * @return servicingInventoryType
  */
  @ApiModelProperty(value = "")


  public String getServicingInventoryType() {
    return servicingInventoryType;
  }

  public void setServicingInventoryType(String servicingInventoryType) {
    this.servicingInventoryType = servicingInventoryType;
  }

  public Inventory servicingPositionInventoryRecord(String servicingPositionInventoryRecord) {
    this.servicingPositionInventoryRecord = servicingPositionInventoryRecord;
    return this;
  }

  /**
   * Get servicingPositionInventoryRecord
   * @return servicingPositionInventoryRecord
  */
  @ApiModelProperty(value = "")


  public String getServicingPositionInventoryRecord() {
    return servicingPositionInventoryRecord;
  }

  public void setServicingPositionInventoryRecord(String servicingPositionInventoryRecord) {
    this.servicingPositionInventoryRecord = servicingPositionInventoryRecord;
  }

  public Inventory servicingInventoryTransactionRecord(String servicingInventoryTransactionRecord) {
    this.servicingInventoryTransactionRecord = servicingInventoryTransactionRecord;
    return this;
  }

  /**
   * Get servicingInventoryTransactionRecord
   * @return servicingInventoryTransactionRecord
  */
  @ApiModelProperty(value = "")


  public String getServicingInventoryTransactionRecord() {
    return servicingInventoryTransactionRecord;
  }

  public void setServicingInventoryTransactionRecord(String servicingInventoryTransactionRecord) {
    this.servicingInventoryTransactionRecord = servicingInventoryTransactionRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inventory inventory = (Inventory) o;
    return Objects.equals(this.servicingInventoryType, inventory.servicingInventoryType) &&
        Objects.equals(this.servicingPositionInventoryRecord, inventory.servicingPositionInventoryRecord) &&
        Objects.equals(this.servicingInventoryTransactionRecord, inventory.servicingInventoryTransactionRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicingInventoryType, servicingPositionInventoryRecord, servicingInventoryTransactionRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inventory {\n");
    
    sb.append("    servicingInventoryType: ").append(toIndentedString(servicingInventoryType)).append("\n");
    sb.append("    servicingPositionInventoryRecord: ").append(toIndentedString(servicingPositionInventoryRecord)).append("\n");
    sb.append("    servicingInventoryTransactionRecord: ").append(toIndentedString(servicingInventoryTransactionRecord)).append("\n");
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

