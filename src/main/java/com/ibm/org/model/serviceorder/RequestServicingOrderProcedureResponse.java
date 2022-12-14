package com.ibm.org.model.serviceorder;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.serviceorder.InitiateServicingOrderProcedureResponseServicingOrderProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestServicingOrderProcedureResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:43.596Z[GMT]")

public class RequestServicingOrderProcedureResponse   {
  @JsonProperty("ServicingOrderProcedure")
  private InitiateServicingOrderProcedureResponseServicingOrderProcedure servicingOrderProcedure;

  public RequestServicingOrderProcedureResponse servicingOrderProcedure(InitiateServicingOrderProcedureResponseServicingOrderProcedure servicingOrderProcedure) {
    this.servicingOrderProcedure = servicingOrderProcedure;
    return this;
  }

  /**
   * Get servicingOrderProcedure
   * @return servicingOrderProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateServicingOrderProcedureResponseServicingOrderProcedure getServicingOrderProcedure() {
    return servicingOrderProcedure;
  }

  public void setServicingOrderProcedure(InitiateServicingOrderProcedureResponseServicingOrderProcedure servicingOrderProcedure) {
    this.servicingOrderProcedure = servicingOrderProcedure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestServicingOrderProcedureResponse requestServicingOrderProcedureResponse = (RequestServicingOrderProcedureResponse) o;
    return Objects.equals(this.servicingOrderProcedure, requestServicingOrderProcedureResponse.servicingOrderProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicingOrderProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestServicingOrderProcedureResponse {\n");
    
    sb.append("    servicingOrderProcedure: ").append(toIndentedString(servicingOrderProcedure)).append("\n");
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

