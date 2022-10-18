package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class InitiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession   {
  @JsonProperty("EBranchOperationsServiceMenu")
  private String ebranchOperationsServiceMenu;

  @JsonProperty("EBranchServiceSessionStatistics")
  private String ebranchServiceSessionStatistics;

  @JsonProperty("EBranchServiceSessionReportType")
  private String ebranchServiceSessionReportType;

  @JsonProperty("EBranchProductionIssueRecord")
  private String ebranchProductionIssueRecord;

  @JsonProperty("ProductionIssueDiagnosis")
  private String productionIssueDiagnosis;

  @JsonProperty("ProductionIssueResolutionTask")
  private String productionIssueResolutionTask;

  @JsonProperty("ProductionIssueStatus")
  private String productionIssueStatus;

  public InitiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession ebranchOperationsServiceMenu(String ebranchOperationsServiceMenu) {
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

  public InitiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession ebranchServiceSessionStatistics(String ebranchServiceSessionStatistics) {
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

  public InitiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession ebranchServiceSessionReportType(String ebranchServiceSessionReportType) {
    this.ebranchServiceSessionReportType = ebranchServiceSessionReportType;
    return this;
  }

  /**
   * Get ebranchServiceSessionReportType
   * @return ebranchServiceSessionReportType
  */
  @ApiModelProperty(value = "")


  public String getEbranchServiceSessionReportType() {
    return ebranchServiceSessionReportType;
  }

  public void setEbranchServiceSessionReportType(String ebranchServiceSessionReportType) {
    this.ebranchServiceSessionReportType = ebranchServiceSessionReportType;
  }

  public InitiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession ebranchProductionIssueRecord(String ebranchProductionIssueRecord) {
    this.ebranchProductionIssueRecord = ebranchProductionIssueRecord;
    return this;
  }

  /**
   * Get ebranchProductionIssueRecord
   * @return ebranchProductionIssueRecord
  */
  @ApiModelProperty(value = "")


  public String getEbranchProductionIssueRecord() {
    return ebranchProductionIssueRecord;
  }

  public void setEbranchProductionIssueRecord(String ebranchProductionIssueRecord) {
    this.ebranchProductionIssueRecord = ebranchProductionIssueRecord;
  }

  public InitiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession productionIssueDiagnosis(String productionIssueDiagnosis) {
    this.productionIssueDiagnosis = productionIssueDiagnosis;
    return this;
  }

  /**
   * Get productionIssueDiagnosis
   * @return productionIssueDiagnosis
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueDiagnosis() {
    return productionIssueDiagnosis;
  }

  public void setProductionIssueDiagnosis(String productionIssueDiagnosis) {
    this.productionIssueDiagnosis = productionIssueDiagnosis;
  }

  public InitiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession productionIssueResolutionTask(String productionIssueResolutionTask) {
    this.productionIssueResolutionTask = productionIssueResolutionTask;
    return this;
  }

  /**
   * Get productionIssueResolutionTask
   * @return productionIssueResolutionTask
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueResolutionTask() {
    return productionIssueResolutionTask;
  }

  public void setProductionIssueResolutionTask(String productionIssueResolutionTask) {
    this.productionIssueResolutionTask = productionIssueResolutionTask;
  }

  public InitiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession productionIssueStatus(String productionIssueStatus) {
    this.productionIssueStatus = productionIssueStatus;
    return this;
  }

  /**
   * Get productionIssueStatus
   * @return productionIssueStatus
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueStatus() {
    return productionIssueStatus;
  }

  public void setProductionIssueStatus(String productionIssueStatus) {
    this.productionIssueStatus = productionIssueStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession initiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession = (InitiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession) o;
    return Objects.equals(this.ebranchOperationsServiceMenu, initiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession.ebranchOperationsServiceMenu) &&
        Objects.equals(this.ebranchServiceSessionStatistics, initiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession.ebranchServiceSessionStatistics) &&
        Objects.equals(this.ebranchServiceSessionReportType, initiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession.ebranchServiceSessionReportType) &&
        Objects.equals(this.ebranchProductionIssueRecord, initiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession.ebranchProductionIssueRecord) &&
        Objects.equals(this.productionIssueDiagnosis, initiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession.productionIssueDiagnosis) &&
        Objects.equals(this.productionIssueResolutionTask, initiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession.productionIssueResolutionTask) &&
        Objects.equals(this.productionIssueStatus, initiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession.productionIssueStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebranchOperationsServiceMenu, ebranchServiceSessionStatistics, ebranchServiceSessionReportType, ebranchProductionIssueRecord, productionIssueDiagnosis, productionIssueResolutionTask, productionIssueStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateeBranchChannelOperatingSessionResponseEBranchChannelOperatingSession {\n");
    
    sb.append("    ebranchOperationsServiceMenu: ").append(toIndentedString(ebranchOperationsServiceMenu)).append("\n");
    sb.append("    ebranchServiceSessionStatistics: ").append(toIndentedString(ebranchServiceSessionStatistics)).append("\n");
    sb.append("    ebranchServiceSessionReportType: ").append(toIndentedString(ebranchServiceSessionReportType)).append("\n");
    sb.append("    ebranchProductionIssueRecord: ").append(toIndentedString(ebranchProductionIssueRecord)).append("\n");
    sb.append("    productionIssueDiagnosis: ").append(toIndentedString(productionIssueDiagnosis)).append("\n");
    sb.append("    productionIssueResolutionTask: ").append(toIndentedString(productionIssueResolutionTask)).append("\n");
    sb.append("    productionIssueStatus: ").append(toIndentedString(productionIssueStatus)).append("\n");
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

