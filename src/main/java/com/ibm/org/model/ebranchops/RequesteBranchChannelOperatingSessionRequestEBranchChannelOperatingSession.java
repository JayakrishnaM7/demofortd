package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class RequesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession   {
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

  public RequesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession ebranchProductionIssueRecord(String ebranchProductionIssueRecord) {
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

  public RequesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession employeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
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

  public RequesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession customerContactRecordReference(Object customerContactRecordReference) {
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

  public RequesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession productionIssueType(String productionIssueType) {
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

  public RequesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession productionIssueDescription(String productionIssueDescription) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession requesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession = (RequesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession) o;
    return Objects.equals(this.ebranchProductionIssueRecord, requesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession.ebranchProductionIssueRecord) &&
        Objects.equals(this.employeeOrBusinessUnitReference, requesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession.employeeOrBusinessUnitReference) &&
        Objects.equals(this.customerContactRecordReference, requesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession.customerContactRecordReference) &&
        Objects.equals(this.productionIssueType, requesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession.productionIssueType) &&
        Objects.equals(this.productionIssueDescription, requesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession.productionIssueDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebranchProductionIssueRecord, employeeOrBusinessUnitReference, customerContactRecordReference, productionIssueType, productionIssueDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequesteBranchChannelOperatingSessionRequestEBranchChannelOperatingSession {\n");
    
    sb.append("    ebranchProductionIssueRecord: ").append(toIndentedString(ebranchProductionIssueRecord)).append("\n");
    sb.append("    employeeOrBusinessUnitReference: ").append(toIndentedString(employeeOrBusinessUnitReference)).append("\n");
    sb.append("    customerContactRecordReference: ").append(toIndentedString(customerContactRecordReference)).append("\n");
    sb.append("    productionIssueType: ").append(toIndentedString(productionIssueType)).append("\n");
    sb.append("    productionIssueDescription: ").append(toIndentedString(productionIssueDescription)).append("\n");
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

