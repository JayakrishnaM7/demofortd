package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.cworkbench.InitiateBroadcastResponseBroadcast;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateBroadcastResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class InitiateBroadcastResponse   {
  @JsonProperty("Broadcast")
  private InitiateBroadcastResponseBroadcast broadcast;

  public InitiateBroadcastResponse broadcast(InitiateBroadcastResponseBroadcast broadcast) {
    this.broadcast = broadcast;
    return this;
  }

  /**
   * Get broadcast
   * @return broadcast
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateBroadcastResponseBroadcast getBroadcast() {
    return broadcast;
  }

  public void setBroadcast(InitiateBroadcastResponseBroadcast broadcast) {
    this.broadcast = broadcast;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateBroadcastResponse initiateBroadcastResponse = (InitiateBroadcastResponse) o;
    return Objects.equals(this.broadcast, initiateBroadcastResponse.broadcast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(broadcast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateBroadcastResponse {\n");
    
    sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
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

