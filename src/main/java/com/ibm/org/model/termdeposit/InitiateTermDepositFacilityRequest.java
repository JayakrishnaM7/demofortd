package com.ibm.org.model.termdeposit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.termdeposit.InitiateTermDepositFacilityRequestTermDepositFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateTermDepositFacilityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:51.710Z[GMT]")

public class InitiateTermDepositFacilityRequest   {
  @JsonProperty("TermDepositFacility")
  private InitiateTermDepositFacilityRequestTermDepositFacility termDepositFacility;

  public InitiateTermDepositFacilityRequest termDepositFacility(InitiateTermDepositFacilityRequestTermDepositFacility termDepositFacility) {
    this.termDepositFacility = termDepositFacility;
    return this;
  }

  /**
   * Get termDepositFacility
   * @return termDepositFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateTermDepositFacilityRequestTermDepositFacility getTermDepositFacility() {
    return termDepositFacility;
  }

  public void setTermDepositFacility(InitiateTermDepositFacilityRequestTermDepositFacility termDepositFacility) {
    this.termDepositFacility = termDepositFacility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateTermDepositFacilityRequest initiateTermDepositFacilityRequest = (InitiateTermDepositFacilityRequest) o;
    return Objects.equals(this.termDepositFacility, initiateTermDepositFacilityRequest.termDepositFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(termDepositFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateTermDepositFacilityRequest {\n");
    
    sb.append("    termDepositFacility: ").append(toIndentedString(termDepositFacility)).append("\n");
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

