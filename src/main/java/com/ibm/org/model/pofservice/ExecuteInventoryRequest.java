package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.pofservice.ExecuteInventoryRequestInventory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteInventoryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class ExecuteInventoryRequest   {
  @JsonProperty("Inventory")
  private ExecuteInventoryRequestInventory inventory;

  public ExecuteInventoryRequest inventory(ExecuteInventoryRequestInventory inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * Get inventory
   * @return inventory
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteInventoryRequestInventory getInventory() {
    return inventory;
  }

  public void setInventory(ExecuteInventoryRequestInventory inventory) {
    this.inventory = inventory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteInventoryRequest executeInventoryRequest = (ExecuteInventoryRequest) o;
    return Objects.equals(this.inventory, executeInventoryRequest.inventory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteInventoryRequest {\n");
    
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
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

