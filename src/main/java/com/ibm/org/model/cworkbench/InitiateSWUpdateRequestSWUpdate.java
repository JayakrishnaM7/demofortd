package com.ibm.org.model.cworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateSWUpdateRequestSWUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:33.810Z[GMT]")

public class InitiateSWUpdateRequestSWUpdate   {
  @JsonProperty("SWUpdateApplication")
  private String swUpdateApplication;

  @JsonProperty("SWUpdateVersion")
  private String swUpdateVersion;

  @JsonProperty("SWUpdateImage")
  private String swUpdateImage;

  public InitiateSWUpdateRequestSWUpdate swUpdateApplication(String swUpdateApplication) {
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

  public InitiateSWUpdateRequestSWUpdate swUpdateVersion(String swUpdateVersion) {
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

  public InitiateSWUpdateRequestSWUpdate swUpdateImage(String swUpdateImage) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateSWUpdateRequestSWUpdate initiateSWUpdateRequestSWUpdate = (InitiateSWUpdateRequestSWUpdate) o;
    return Objects.equals(this.swUpdateApplication, initiateSWUpdateRequestSWUpdate.swUpdateApplication) &&
        Objects.equals(this.swUpdateVersion, initiateSWUpdateRequestSWUpdate.swUpdateVersion) &&
        Objects.equals(this.swUpdateImage, initiateSWUpdateRequestSWUpdate.swUpdateImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(swUpdateApplication, swUpdateVersion, swUpdateImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSWUpdateRequestSWUpdate {\n");
    
    sb.append("    swUpdateApplication: ").append(toIndentedString(swUpdateApplication)).append("\n");
    sb.append("    swUpdateVersion: ").append(toIndentedString(swUpdateVersion)).append("\n");
    sb.append("    swUpdateImage: ").append(toIndentedString(swUpdateImage)).append("\n");
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

