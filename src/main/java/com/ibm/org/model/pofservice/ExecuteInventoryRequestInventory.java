package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteInventoryRequestInventory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class ExecuteInventoryRequestInventory   {
  @JsonProperty("ServicingInventoryType")
  private String servicingInventoryType;

  public ExecuteInventoryRequestInventory servicingInventoryType(String servicingInventoryType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteInventoryRequestInventory executeInventoryRequestInventory = (ExecuteInventoryRequestInventory) o;
    return Objects.equals(this.servicingInventoryType, executeInventoryRequestInventory.servicingInventoryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicingInventoryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteInventoryRequestInventory {\n");
    
    sb.append("    servicingInventoryType: ").append(toIndentedString(servicingInventoryType)).append("\n");
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

