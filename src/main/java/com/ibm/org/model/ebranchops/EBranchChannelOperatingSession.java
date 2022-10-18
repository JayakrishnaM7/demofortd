package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EBranchChannelOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class EBranchChannelOperatingSession   {
  @JsonProperty("EBranchOperationsServiceMenu")
  private String ebranchOperationsServiceMenu;

  @JsonProperty("EBranchServiceSessionStatistics")
  private String ebranchServiceSessionStatistics;

  @JsonProperty("EBranchServiceSessionReportType")
  private String ebranchServiceSessionReportType;

  @JsonProperty("EBranchServiceSessionReport")
  private String ebranchServiceSessionReport;

  @JsonProperty("EBranchProductionIssueRecord")
  private String ebranchProductionIssueRecord;

  @JsonProperty("EmployeeOrBusinessUnitReference")
  private Object employeeOrBusinessUnitReference;

  @JsonProperty("CustomerContactRecordReference")
  private Object customerContactRecordReference;

  @JsonProperty("ProductionIssueType")
  private String productionIssueType;

  @JsonProperty("ProductionIssueDescription")
  private String productionIssueDescription;

  @JsonProperty("ProductionIssueDiagnosis")
  private String productionIssueDiagnosis;

  @JsonProperty("ProductionIssueResolutionTask")
  private String productionIssueResolutionTask;

  @JsonProperty("ProductionIssueStatus")
  private String productionIssueStatus;

  public EBranchChannelOperatingSession ebranchOperationsServiceMenu(String ebranchOperationsServiceMenu) {
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

  public EBranchChannelOperatingSession ebranchServiceSessionStatistics(String ebranchServiceSessionStatistics) {
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

  public EBranchChannelOperatingSession ebranchServiceSessionReportType(String ebranchServiceSessionReportType) {
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

  public EBranchChannelOperatingSession ebranchServiceSessionReport(String ebranchServiceSessionReport) {
    this.ebranchServiceSessionReport = ebranchServiceSessionReport;
    return this;
  }

  /**
   * Get ebranchServiceSessionReport
   * @return ebranchServiceSessionReport
  */
  @ApiModelProperty(value = "")


  public String getEbranchServiceSessionReport() {
    return ebranchServiceSessionReport;
  }

  public void setEbranchServiceSessionReport(String ebranchServiceSessionReport) {
    this.ebranchServiceSessionReport = ebranchServiceSessionReport;
  }

  public EBranchChannelOperatingSession ebranchProductionIssueRecord(String ebranchProductionIssueRecord) {
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

  public EBranchChannelOperatingSession employeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
    this.employeeOrBusinessUnitReference = employeeOrBusinessUnitReference;
    return this;
  }

  /**
   * Get employeeOrBusinessUnitReference
   * @return employeeOrBusinessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeeOrBusinessUnitReference() {
    return employeeOrBusinessUnitReference;
  }

  public void setEmployeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
    this.employeeOrBusinessUnitReference = employeeOrBusinessUnitReference;
  }

  public EBranchChannelOperatingSession customerContactRecordReference(Object customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
    return this;
  }

  /**
   * Get customerContactRecordReference
   * @return customerContactRecordReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(Object customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }

  public EBranchChannelOperatingSession productionIssueType(String productionIssueType) {
    this.productionIssueType = productionIssueType;
    return this;
  }

  /**
   * Get productionIssueType
   * @return productionIssueType
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueType() {
    return productionIssueType;
  }

  public void setProductionIssueType(String productionIssueType) {
    this.productionIssueType = productionIssueType;
  }

  public EBranchChannelOperatingSession productionIssueDescription(String productionIssueDescription) {
    this.productionIssueDescription = productionIssueDescription;
    return this;
  }

  /**
   * Get productionIssueDescription
   * @return productionIssueDescription
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueDescription() {
    return productionIssueDescription;
  }

  public void setProductionIssueDescription(String productionIssueDescription) {
    this.productionIssueDescription = productionIssueDescription;
  }

  public EBranchChannelOperatingSession productionIssueDiagnosis(String productionIssueDiagnosis) {
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

  public EBranchChannelOperatingSession productionIssueResolutionTask(String productionIssueResolutionTask) {
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

  public EBranchChannelOperatingSession productionIssueStatus(String productionIssueStatus) {
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
    EBranchChannelOperatingSession eBranchChannelOperatingSession = (EBranchChannelOperatingSession) o;
    return Objects.equals(this.ebranchOperationsServiceMenu, eBranchChannelOperatingSession.ebranchOperationsServiceMenu) &&
        Objects.equals(this.ebranchServiceSessionStatistics, eBranchChannelOperatingSession.ebranchServiceSessionStatistics) &&
        Objects.equals(this.ebranchServiceSessionReportType, eBranchChannelOperatingSession.ebranchServiceSessionReportType) &&
        Objects.equals(this.ebranchServiceSessionReport, eBranchChannelOperatingSession.ebranchServiceSessionReport) &&
        Objects.equals(this.ebranchProductionIssueRecord, eBranchChannelOperatingSession.ebranchProductionIssueRecord) &&
        Objects.equals(this.employeeOrBusinessUnitReference, eBranchChannelOperatingSession.employeeOrBusinessUnitReference) &&
        Objects.equals(this.customerContactRecordReference, eBranchChannelOperatingSession.customerContactRecordReference) &&
        Objects.equals(this.productionIssueType, eBranchChannelOperatingSession.productionIssueType) &&
        Objects.equals(this.productionIssueDescription, eBranchChannelOperatingSession.productionIssueDescription) &&
        Objects.equals(this.productionIssueDiagnosis, eBranchChannelOperatingSession.productionIssueDiagnosis) &&
        Objects.equals(this.productionIssueResolutionTask, eBranchChannelOperatingSession.productionIssueResolutionTask) &&
        Objects.equals(this.productionIssueStatus, eBranchChannelOperatingSession.productionIssueStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebranchOperationsServiceMenu, ebranchServiceSessionStatistics, ebranchServiceSessionReportType, ebranchServiceSessionReport, ebranchProductionIssueRecord, employeeOrBusinessUnitReference, customerContactRecordReference, productionIssueType, productionIssueDescription, productionIssueDiagnosis, productionIssueResolutionTask, productionIssueStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EBranchChannelOperatingSession {\n");
    
    sb.append("    ebranchOperationsServiceMenu: ").append(toIndentedString(ebranchOperationsServiceMenu)).append("\n");
    sb.append("    ebranchServiceSessionStatistics: ").append(toIndentedString(ebranchServiceSessionStatistics)).append("\n");
    sb.append("    ebranchServiceSessionReportType: ").append(toIndentedString(ebranchServiceSessionReportType)).append("\n");
    sb.append("    ebranchServiceSessionReport: ").append(toIndentedString(ebranchServiceSessionReport)).append("\n");
    sb.append("    ebranchProductionIssueRecord: ").append(toIndentedString(ebranchProductionIssueRecord)).append("\n");
    sb.append("    employeeOrBusinessUnitReference: ").append(toIndentedString(employeeOrBusinessUnitReference)).append("\n");
    sb.append("    customerContactRecordReference: ").append(toIndentedString(customerContactRecordReference)).append("\n");
    sb.append("    productionIssueType: ").append(toIndentedString(productionIssueType)).append("\n");
    sb.append("    productionIssueDescription: ").append(toIndentedString(productionIssueDescription)).append("\n");
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

