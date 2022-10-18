package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SWUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class SWUpdate   {
  @JsonProperty("SWUpdateApplication")
  private String swUpdateApplication;

  @JsonProperty("SWUpdateVersion")
  private String swUpdateVersion;

  @JsonProperty("SWUpdateImage")
  private String swUpdateImage;

  @JsonProperty("Date")
  private String date;

  public SWUpdate swUpdateApplication(String swUpdateApplication) {
    this.swUpdateApplication = swUpdateApplication;
    return this;
  }

  /**
   * Get swUpdateApplication
   * @return swUpdateApplication
  */
  @ApiModelProperty(value = "")


  public String getSwUpdateApplication() {
    return swUpdateApplication;
  }

  public void setSwUpdateApplication(String swUpdateApplication) {
    this.swUpdateApplication = swUpdateApplication;
  }

  public SWUpdate swUpdateVersion(String swUpdateVersion) {
    this.swUpdateVersion = swUpdateVersion;
    return this;
  }

  /**
   * Get swUpdateVersion
   * @return swUpdateVersion
  */
  @ApiModelProperty(value = "")


  public String getSwUpdateVersion() {
    return swUpdateVersion;
  }

  public void setSwUpdateVersion(String swUpdateVersion) {
    this.swUpdateVersion = swUpdateVersion;
  }

  public SWUpdate swUpdateImage(String swUpdateImage) {
    this.swUpdateImage = swUpdateImage;
    return this;
  }

  /**
   * Get swUpdateImage
   * @return swUpdateImage
  */
  @ApiModelProperty(value = "")


  public String getSwUpdateImage() {
    return swUpdateImage;
  }

  public void setSwUpdateImage(String swUpdateImage) {
    this.swUpdateImage = swUpdateImage;
  }

  public SWUpdate date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SWUpdate swUpdate = (SWUpdate) o;
    return Objects.equals(this.swUpdateApplication, swUpdate.swUpdateApplication) &&
        Objects.equals(this.swUpdateVersion, swUpdate.swUpdateVersion) &&
        Objects.equals(this.swUpdateImage, swUpdate.swUpdateImage) &&
        Objects.equals(this.date, swUpdate.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(swUpdateApplication, swUpdateVersion, swUpdateImage, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SWUpdate {\n");
    
    sb.append("    swUpdateApplication: ").append(toIndentedString(swUpdateApplication)).append("\n");
    sb.append("    swUpdateVersion: ").append(toIndentedString(swUpdateVersion)).append("\n");
    sb.append("    swUpdateImage: ").append(toIndentedString(swUpdateImage)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

