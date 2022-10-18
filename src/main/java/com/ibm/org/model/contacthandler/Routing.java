package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Routing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class Routing   {
  @JsonProperty("RoutingTaskRecord")
  private String routingTaskRecord;

  public Routing routingTaskRecord(String routingTaskRecord) {
    this.routingTaskRecord = routingTaskRecord;
    return this;
  }

  /**
   * Get routingTaskRecord
   * @return routingTaskRecord
  */
  @ApiModelProperty(value = "")


  public String getRoutingTaskRecord() {
    return routingTaskRecord;
  }

  public void setRoutingTaskRecord(String routingTaskRecord) {
    this.routingTaskRecord = routingTaskRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Routing routing = (Routing) o;
    return Objects.equals(this.routingTaskRecord, routing.routingTaskRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingTaskRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Routing {\n");
    
    sb.append("    routingTaskRecord: ").append(toIndentedString(routingTaskRecord)).append("\n");
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

