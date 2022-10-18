package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteInventoryResponseInventory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class ExecuteInventoryResponseInventory   {
  @JsonProperty("ServicingPositionInventoryRecord")
  private String servicingPositionInventoryRecord;

  @JsonProperty("ServicingInventoryTransactionRecord")
  private String servicingInventoryTransactionRecord;

  public ExecuteInventoryResponseInventory servicingPositionInventoryRecord(String servicingPositionInventoryRecord) {
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

  public ExecuteInventoryResponseInventory servicingInventoryTransactionRecord(String servicingInventoryTransactionRecord) {
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
    ExecuteInventoryResponseInventory executeInventoryResponseInventory = (ExecuteInventoryResponseInventory) o;
    return Objects.equals(this.servicingPositionInventoryRecord, executeInventoryResponseInventory.servicingPositionInventoryRecord) &&
        Objects.equals(this.servicingInventoryTransactionRecord, executeInventoryResponseInventory.servicingInventoryTransactionRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicingPositionInventoryRecord, servicingInventoryTransactionRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteInventoryResponseInventory {\n");
    
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

