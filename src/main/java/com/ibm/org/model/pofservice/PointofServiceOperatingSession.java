package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PointofServiceOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class PointofServiceOperatingSession   {
  @JsonProperty("ServicingPositionConfigurationOrSet-up")
  private String servicingPositionConfigurationOrSetUp;

  @JsonProperty("ServicingPositionReference")
  private Object servicingPositionReference;

  @JsonProperty("ServicingPositionType")
  private String servicingPositionType;

  @JsonProperty("ServicingPositionLocation")
  private String servicingPositionLocation;

  @JsonProperty("ServicingPositionFacilityType")
  private String servicingPositionFacilityType;

  @JsonProperty("ServicingPositionFacilityReference")
  private Object servicingPositionFacilityReference;

  @JsonProperty("ServicingPositionSchedule")
  private String servicingPositionSchedule;

  @JsonProperty("ServicingPositionActivityReport")
  private String servicingPositionActivityReport;

  @JsonProperty("ServicingPositionOperatingSessionStatistics")
  private String servicingPositionOperatingSessionStatistics;

  @JsonProperty("ServicingPositionOperatingSessionReportType")
  private String servicingPositionOperatingSessionReportType;

  @JsonProperty("ServicingPositionOperatingSessionReport")
  private String servicingPositionOperatingSessionReport;

  public PointofServiceOperatingSession servicingPositionConfigurationOrSetUp(String servicingPositionConfigurationOrSetUp) {
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

  public PointofServiceOperatingSession servicingPositionReference(Object servicingPositionReference) {
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

  public PointofServiceOperatingSession servicingPositionType(String servicingPositionType) {
    this.servicingPositionType = servicingPositionType;
    return this;
  }

  /**
   * Get servicingPositionType
   * @return servicingPositionType
  */
  @ApiModelProperty(value = "")


  public String getServicingPositionType() {
    return servicingPositionType;
  }

  public void setServicingPositionType(String servicingPositionType) {
    this.servicingPositionType = servicingPositionType;
  }

  public PointofServiceOperatingSession servicingPositionLocation(String servicingPositionLocation) {
    this.servicingPositionLocation = servicingPositionLocation;
    return this;
  }

  /**
   * Get servicingPositionLocation
   * @return servicingPositionLocation
  */
  @ApiModelProperty(value = "")


  public String getServicingPositionLocation() {
    return servicingPositionLocation;
  }

  public void setServicingPositionLocation(String servicingPositionLocation) {
    this.servicingPositionLocation = servicingPositionLocation;
  }

  public PointofServiceOperatingSession servicingPositionFacilityType(String servicingPositionFacilityType) {
    this.servicingPositionFacilityType = servicingPositionFacilityType;
    return this;
  }

  /**
   * Get servicingPositionFacilityType
   * @return servicingPositionFacilityType
  */
  @ApiModelProperty(value = "")


  public String getServicingPositionFacilityType() {
    return servicingPositionFacilityType;
  }

  public void setServicingPositionFacilityType(String servicingPositionFacilityType) {
    this.servicingPositionFacilityType = servicingPositionFacilityType;
  }

  public PointofServiceOperatingSession servicingPositionFacilityReference(Object servicingPositionFacilityReference) {
    this.servicingPositionFacilityReference = servicingPositionFacilityReference;
    return this;
  }

  /**
   * Get servicingPositionFacilityReference
   * @return servicingPositionFacilityReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getServicingPositionFacilityReference() {
    return servicingPositionFacilityReference;
  }

  public void setServicingPositionFacilityReference(Object servicingPositionFacilityReference) {
    this.servicingPositionFacilityReference = servicingPositionFacilityReference;
  }

  public PointofServiceOperatingSession servicingPositionSchedule(String servicingPositionSchedule) {
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

  public PointofServiceOperatingSession servicingPositionActivityReport(String servicingPositionActivityReport) {
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

  public PointofServiceOperatingSession servicingPositionOperatingSessionStatistics(String servicingPositionOperatingSessionStatistics) {
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

  public PointofServiceOperatingSession servicingPositionOperatingSessionReportType(String servicingPositionOperatingSessionReportType) {
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

  public PointofServiceOperatingSession servicingPositionOperatingSessionReport(String servicingPositionOperatingSessionReport) {
    this.servicingPositionOperatingSessionReport = servicingPositionOperatingSessionReport;
    return this;
  }

  /**
   * Get servicingPositionOperatingSessionReport
   * @return servicingPositionOperatingSessionReport
  */
  @ApiModelProperty(value = "")


  public String getServicingPositionOperatingSessionReport() {
    return servicingPositionOperatingSessionReport;
  }

  public void setServicingPositionOperatingSessionReport(String servicingPositionOperatingSessionReport) {
    this.servicingPositionOperatingSessionReport = servicingPositionOperatingSessionReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointofServiceOperatingSession pointofServiceOperatingSession = (PointofServiceOperatingSession) o;
    return Objects.equals(this.servicingPositionConfigurationOrSetUp, pointofServiceOperatingSession.servicingPositionConfigurationOrSetUp) &&
        Objects.equals(this.servicingPositionReference, pointofServiceOperatingSession.servicingPositionReference) &&
        Objects.equals(this.servicingPositionType, pointofServiceOperatingSession.servicingPositionType) &&
        Objects.equals(this.servicingPositionLocation, pointofServiceOperatingSession.servicingPositionLocation) &&
        Objects.equals(this.servicingPositionFacilityType, pointofServiceOperatingSession.servicingPositionFacilityType) &&
        Objects.equals(this.servicingPositionFacilityReference, pointofServiceOperatingSession.servicingPositionFacilityReference) &&
        Objects.equals(this.servicingPositionSchedule, pointofServiceOperatingSession.servicingPositionSchedule) &&
        Objects.equals(this.servicingPositionActivityReport, pointofServiceOperatingSession.servicingPositionActivityReport) &&
        Objects.equals(this.servicingPositionOperatingSessionStatistics, pointofServiceOperatingSession.servicingPositionOperatingSessionStatistics) &&
        Objects.equals(this.servicingPositionOperatingSessionReportType, pointofServiceOperatingSession.servicingPositionOperatingSessionReportType) &&
        Objects.equals(this.servicingPositionOperatingSessionReport, pointofServiceOperatingSession.servicingPositionOperatingSessionReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicingPositionConfigurationOrSetUp, servicingPositionReference, servicingPositionType, servicingPositionLocation, servicingPositionFacilityType, servicingPositionFacilityReference, servicingPositionSchedule, servicingPositionActivityReport, servicingPositionOperatingSessionStatistics, servicingPositionOperatingSessionReportType, servicingPositionOperatingSessionReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointofServiceOperatingSession {\n");
    
    sb.append("    servicingPositionConfigurationOrSetUp: ").append(toIndentedString(servicingPositionConfigurationOrSetUp)).append("\n");
    sb.append("    servicingPositionReference: ").append(toIndentedString(servicingPositionReference)).append("\n");
    sb.append("    servicingPositionType: ").append(toIndentedString(servicingPositionType)).append("\n");
    sb.append("    servicingPositionLocation: ").append(toIndentedString(servicingPositionLocation)).append("\n");
    sb.append("    servicingPositionFacilityType: ").append(toIndentedString(servicingPositionFacilityType)).append("\n");
    sb.append("    servicingPositionFacilityReference: ").append(toIndentedString(servicingPositionFacilityReference)).append("\n");
    sb.append("    servicingPositionSchedule: ").append(toIndentedString(servicingPositionSchedule)).append("\n");
    sb.append("    servicingPositionActivityReport: ").append(toIndentedString(servicingPositionActivityReport)).append("\n");
    sb.append("    servicingPositionOperatingSessionStatistics: ").append(toIndentedString(servicingPositionOperatingSessionStatistics)).append("\n");
    sb.append("    servicingPositionOperatingSessionReportType: ").append(toIndentedString(servicingPositionOperatingSessionReportType)).append("\n");
    sb.append("    servicingPositionOperatingSessionReport: ").append(toIndentedString(servicingPositionOperatingSessionReport)).append("\n");
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

