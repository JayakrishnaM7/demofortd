package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveInboundResponseEBranchChannelOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class RetrieveInboundResponseEBranchChannelOperatingSession   {
  @JsonProperty("EBranchOperationsServiceMenu")
  private String ebranchOperationsServiceMenu;

  @JsonProperty("EBranchServiceSessionStatistics")
  private String ebranchServiceSessionStatistics;

  public RetrieveInboundResponseEBranchChannelOperatingSession ebranchOperationsServiceMenu(String ebranchOperationsServiceMenu) {
    this.ebranchOperationsServiceMenu = ebranchOperationsServiceMenu;
    return this;
  }

  /**
   * Get ebranchOperationsServiceMenu
   * @return ebranchOperationsServiceMenu
  */
  @ApiModelProperty(value = "")


  public String getEbranchOperationsServiceMenu() {
    return ebranchOperationsServiceMenu;
  }

  public void setEbranchOperationsServiceMenu(String ebranchOperationsServiceMenu) {
    this.ebranchOperationsServiceMenu = ebranchOperationsServiceMenu;
  }

  public RetrieveInboundResponseEBranchChannelOperatingSession ebranchServiceSessionStatistics(String ebranchServiceSessionStatistics) {
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
    RetrieveInboundResponseEBranchChannelOperatingSession retrieveInboundResponseEBranchChannelOperatingSession = (RetrieveInboundResponseEBranchChannelOperatingSession) o;
    return Objects.equals(this.ebranchOperationsServiceMenu, retrieveInboundResponseEBranchChannelOperatingSession.ebranchOperationsServiceMenu) &&
        Objects.equals(this.ebranchServiceSessionStatistics, retrieveInboundResponseEBranchChannelOperatingSession.ebranchServiceSessionStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebranchOperationsServiceMenu, ebranchServiceSessionStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveInboundResponseEBranchChannelOperatingSession {\n");
    
    sb.append("    ebranchOperationsServiceMenu: ").append(toIndentedString(ebranchOperationsServiceMenu)).append("\n");
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

