package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInboundResponseEBranchChannelOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class InitiateInboundResponseEBranchChannelOperatingSession   {
  @JsonProperty("EBranchServiceSessionStatistics")
  private String ebranchServiceSessionStatistics;

  public InitiateInboundResponseEBranchChannelOperatingSession ebranchServiceSessionStatistics(String ebranchServiceSessionStatistics) {
    this.ebranchServiceSessionStatistics = ebranchServiceSessionStatistics;
    return this;
  }

  /**
   * Get ebranchServiceSessionStatistics
   * @return ebranchServiceSessionStatistics
  */
  @ApiModelProperty(value = "")


  public String getEbranchServiceSessionStatistics() {
    return ebranchServiceSessionStatistics;
  }

  public void setEbranchServiceSessionStatistics(String ebranchServiceSessionStatistics) {
    this.ebranchServiceSessionStatistics = ebranchServiceSessionStatistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateInboundResponseEBranchChannelOperatingSession initiateInboundResponseEBranchChannelOperatingSession = (InitiateInboundResponseEBranchChannelOperatingSession) o;
    return Objects.equals(this.ebranchServiceSessionStatistics, initiateInboundResponseEBranchChannelOperatingSession.ebranchServiceSessionStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebranchServiceSessionStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInboundResponseEBranchChannelOperatingSession {\n");
    
    sb.append("    ebranchServiceSessionStatistics: ").append(toIndentedString(ebranchServiceSessionStatistics)).append("\n");
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

