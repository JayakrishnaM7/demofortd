package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession   {
  @JsonProperty("ServicingPositionConfigurationOrSet-up")
  private String servicingPositionConfigurationOrSetUp;

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

  @JsonProperty("ServicingPositionOperatingSessionReportType")
  private String servicingPositionOperatingSessionReportType;

  public InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession servicingPositionConfigurationOrSetUp(String servicingPositionConfigurationOrSetUp) {
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

  public InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession servicingPositionType(String servicingPositionType) {
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

  public InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession servicingPositionLocation(String servicingPositionLocation) {
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

  public InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession servicingPositionFacilityType(String servicingPositionFacilityType) {
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

  public InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession servicingPositionFacilityReference(Object servicingPositionFacilityReference) {
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

  public InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession servicingPositionSchedule(String servicingPositionSchedule) {
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

  public InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession servicingPositionOperatingSessionReportType(String servicingPositionOperatingSessionReportType) {
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
    InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession initiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession = (InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession) o;
    return Objects.equals(this.servicingPositionConfigurationOrSetUp, initiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession.servicingPositionConfigurationOrSetUp) &&
        Objects.equals(this.servicingPositionType, initiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession.servicingPositionType) &&
        Objects.equals(this.servicingPositionLocation, initiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession.servicingPositionLocation) &&
        Objects.equals(this.servicingPositionFacilityType, initiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession.servicingPositionFacilityType) &&
        Objects.equals(this.servicingPositionFacilityReference, initiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession.servicingPositionFacilityReference) &&
        Objects.equals(this.servicingPositionSchedule, initiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession.servicingPositionSchedule) &&
        Objects.equals(this.servicingPositionOperatingSessionReportType, initiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession.servicingPositionOperatingSessionReportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicingPositionConfigurationOrSetUp, servicingPositionType, servicingPositionLocation, servicingPositionFacilityType, servicingPositionFacilityReference, servicingPositionSchedule, servicingPositionOperatingSessionReportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePointofServiceOperatingSessionRequestPointofServiceOperatingSession {\n");
    
    sb.append("    servicingPositionConfigurationOrSetUp: ").append(toIndentedString(servicingPositionConfigurationOrSetUp)).append("\n");
    sb.append("    servicingPositionType: ").append(toIndentedString(servicingPositionType)).append("\n");
    sb.append("    servicingPositionLocation: ").append(toIndentedString(servicingPositionLocation)).append("\n");
    sb.append("    servicingPositionFacilityType: ").append(toIndentedString(servicingPositionFacilityType)).append("\n");
    sb.append("    servicingPositionFacilityReference: ").append(toIndentedString(servicingPositionFacilityReference)).append("\n");
    sb.append("    servicingPositionSchedule: ").append(toIndentedString(servicingPositionSchedule)).append("\n");
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

