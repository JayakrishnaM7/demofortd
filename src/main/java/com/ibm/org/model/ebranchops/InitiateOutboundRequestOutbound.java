package com.ibm.org.model.ebranchops;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateOutboundRequestOutbound
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:41.897Z[GMT]")

public class InitiateOutboundRequestOutbound   {
  @JsonProperty("EmployeeOrBusinessUnitReference")
  private Object employeeOrBusinessUnitReference;

  @JsonProperty("CustomerContactRecordReference")
  private Object customerContactRecordReference;

  @JsonProperty("CustomerSessionDialogueRecord")
  private String customerSessionDialogueRecord;

  @JsonProperty("EBranchCustomerDeviceReference")
  private Object ebranchCustomerDeviceReference;

  public InitiateOutboundRequestOutbound employeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
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

  public InitiateOutboundRequestOutbound customerContactRecordReference(Object customerContactRecordReference) {
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

  public InitiateOutboundRequestOutbound customerSessionDialogueRecord(String customerSessionDialogueRecord) {
    this.customerSessionDialogueRecord = customerSessionDialogueRecord;
    return this;
  }

  /**
   * Get customerSessionDialogueRecord
   * @return customerSessionDialogueRecord
  */
  @ApiModelProperty(value = "")


  public String getCustomerSessionDialogueRecord() {
    return customerSessionDialogueRecord;
  }

  public void setCustomerSessionDialogueRecord(String customerSessionDialogueRecord) {
    this.customerSessionDialogueRecord = customerSessionDialogueRecord;
  }

  public InitiateOutboundRequestOutbound ebranchCustomerDeviceReference(Object ebranchCustomerDeviceReference) {
    this.ebranchCustomerDeviceReference = ebranchCustomerDeviceReference;
    return this;
  }

  /**
   * Get ebranchCustomerDeviceReference
   * @return ebranchCustomerDeviceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEbranchCustomerDeviceReference() {
    return ebranchCustomerDeviceReference;
  }

  public void setEbranchCustomerDeviceReference(Object ebranchCustomerDeviceReference) {
    this.ebranchCustomerDeviceReference = ebranchCustomerDeviceReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateOutboundRequestOutbound initiateOutboundRequestOutbound = (InitiateOutboundRequestOutbound) o;
    return Objects.equals(this.employeeOrBusinessUnitReference, initiateOutboundRequestOutbound.employeeOrBusinessUnitReference) &&
        Objects.equals(this.customerContactRecordReference, initiateOutboundRequestOutbound.customerContactRecordReference) &&
        Objects.equals(this.customerSessionDialogueRecord, initiateOutboundRequestOutbound.customerSessionDialogueRecord) &&
        Objects.equals(this.ebranchCustomerDeviceReference, initiateOutboundRequestOutbound.ebranchCustomerDeviceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeOrBusinessUnitReference, customerContactRecordReference, customerSessionDialogueRecord, ebranchCustomerDeviceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateOutboundRequestOutbound {\n");
    
    sb.append("    employeeOrBusinessUnitReference: ").append(toIndentedString(employeeOrBusinessUnitReference)).append("\n");
    sb.append("    customerContactRecordReference: ").append(toIndentedString(customerContactRecordReference)).append("\n");
    sb.append("    customerSessionDialogueRecord: ").append(toIndentedString(customerSessionDialogueRecord)).append("\n");
    sb.append("    ebranchCustomerDeviceReference: ").append(toIndentedString(ebranchCustomerDeviceReference)).append("\n");
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

