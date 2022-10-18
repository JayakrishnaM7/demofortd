package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession   {
  @JsonProperty("ServicingPositionConfigurationOrSet-up")
  private String servicingPositionConfigurationOrSetUp;

  @JsonProperty("ServicingPositionReference")
  private Object servicingPositionReference;

  @JsonProperty("ServicingPositionSchedule")
  private String servicingPositionSchedule;

  @JsonProperty("ServicingPositionActivityReport")
  private String servicingPositionActivityReport;

  @JsonProperty("ServicingPositionOperatingSessionStatistics")
  private String servicingPositionOperatingSessionStatistics;

  @JsonProperty("ServicingPositionOperatingSessionReportType")
  private String servicingPositionOperatingSessionReportType;

  public InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession servicingPositionConfigurationOrSetUp(String servicingPositionConfigurationOrSetUp) {
    this.servicingPositionConfigurationOrSetUp = servicingPositionConfigurationOrSetUp;
    return this;
  }

  /**
   * Get servicingPositionConfigurationOrSetUp
   * @return servicingPositionConfigurationOrSetUp
  */
  @ApiModelProperty(value = "")


  public String getServicingPositionConfigurationOrSetUp() {
    return servicingPositionConfigurationOrSetUp;
  }

  public void setServicingPositionConfigurationOrSetUp(String servicingPositionConfigurationOrSetUp) {
    this.servicingPositionConfigurationOrSetUp = servicingPositionConfigurationOrSetUp;
  }

  public InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession servicingPositionReference(Object servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
    return this;
  }

  /**
   * Get servicingPositionReference
   * @return servicingPositionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(Object servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }

  public InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession servicingPositionSchedule(String servicingPositionSchedule) {
    this.servicingPositionSchedule = servicingPositionSchedule;
    return this;
  }

  /**
   * Get servicingPositionSchedule
   * @return servicingPositionSchedule
  */
  @ApiModelProperty(value = "")


  public String getServicingPositionSchedule() {
    return servicingPositionSchedule;
  }

  public void setServicingPositionSchedule(String servicingPositionSchedule) {
    this.servicingPositionSchedule = servicingPositionSchedule;
  }

  public InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession servicingPositionActivityReport(String servicingPositionActivityReport) {
    this.servicingPositionActivityReport = servicingPositionActivityReport;
    return this;
  }

  /**
   * Get servicingPositionActivityReport
   * @return servicingPositionActivityReport
  */
  @ApiModelProperty(value = "")


  public String getServicingPositionActivityReport() {
    return servicingPositionActivityReport;
  }

  public void setServicingPositionActivityReport(String servicingPositionActivityReport) {
    this.servicingPositionActivityReport = servicingPositionActivityReport;
  }

  public InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession servicingPositionOperatingSessionStatistics(String servicingPositionOperatingSessionStatistics) {
    this.servicingPositionOperatingSessionStatistics = servicingPositionOperatingSessionStatistics;
    return this;
  }

  /**
   * Get servicingPositionOperatingSessionStatistics
   * @return servicingPositionOperatingSessionStatistics
  */
  @ApiModelProperty(value = "")


  public String getServicingPositionOperatingSessionStatistics() {
    return servicingPositionOperatingSessionStatistics;
  }

  public void setServicingPositionOperatingSessionStatistics(String servicingPositionOperatingSessionStatistics) {
    this.servicingPositionOperatingSessionStatistics = servicingPositionOperatingSessionStatistics;
  }

  public InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession servicingPositionOperatingSessionReportType(String servicingPositionOperatingSessionReportType) {
    this.servicingPositionOperatingSessionReportType = servicingPositionOperatingSessionReportType;
    return this;
  }

  /**
   * Get servicingPositionOperatingSessionReportType
   * @return servicingPositionOperatingSessionReportType
  */
  @ApiModelProperty(value = "")


  public String getServicingPositionOperatingSessionReportType() {
    return servicingPositionOperatingSessionReportType;
  }

  public void setServicingPositionOperatingSessionReportType(String servicingPositionOperatingSessionReportType) {
    this.servicingPositionOperatingSessionReportType = servicingPositionOperatingSessionReportType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession initiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession = (InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession) o;
    return Objects.equals(this.servicingPositionConfigurationOrSetUp, initiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession.servicingPositionConfigurationOrSetUp) &&
        Objects.equals(this.servicingPositionReference, initiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession.servicingPositionReference) &&
        Objects.equals(this.servicingPositionSchedule, initiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession.servicingPositionSchedule) &&
        Objects.equals(this.servicingPositionActivityReport, initiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession.servicingPositionActivityReport) &&
        Objects.equals(this.servicingPositionOperatingSessionStatistics, initiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession.servicingPositionOperatingSessionStatistics) &&
        Objects.equals(this.servicingPositionOperatingSessionReportType, initiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession.servicingPositionOperatingSessionReportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicingPositionConfigurationOrSetUp, servicingPositionReference, servicingPositionSchedule, servicingPositionActivityReport, servicingPositionOperatingSessionStatistics, servicingPositionOperatingSessionReportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePointofServiceOperatingSessionResponsePointofServiceOperatingSession {\n");
    
    sb.append("    servicingPositionConfigurationOrSetUp: ").append(toIndentedString(servicingPositionConfigurationOrSetUp)).append("\n");
    sb.append("    servicingPositionReference: ").append(toIndentedString(servicingPositionReference)).append("\n");
    sb.append("    servicingPositionSchedule: ").append(toIndentedString(servicingPositionSchedule)).append("\n");
    sb.append("    servicingPositionActivityReport: ").append(toIndentedString(servicingPositionActivityReport)).append("\n");
    sb.append("    servicingPositionOperatingSessionStatistics: ").append(toIndentedString(servicingPositionOperatingSessionStatistics)).append("\n");
    sb.append("    servicingPositionOperatingSessionReportType: ").append(toIndentedString(servicingPositionOperatingSessionReportType)).append("\n");
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

