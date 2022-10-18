package com.ibm.org.model.txauthorisation;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.txauthorisation.EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateInteractiveTransactionAssessmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:47.805Z[GMT]")

public class EvaluateInteractiveTransactionAssessmentRequest   {
  @JsonProperty("InteractiveTransactionAssessment")
  private EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment interactiveTransactionAssessment;

  public EvaluateInteractiveTransactionAssessmentRequest interactiveTransactionAssessment(EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment interactiveTransactionAssessment) {
    this.interactiveTransactionAssessment = interactiveTransactionAssessment;
    return this;
  }

  /**
   * Get interactiveTransactionAssessment
   * @return interactiveTransactionAssessment
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment getInteractiveTransactionAssessment() {
    return interactiveTransactionAssessment;
  }

  public void setInteractiveTransactionAssessment(EvaluateInteractiveTransactionAssessmentRequestInteractiveTransactionAssessment interactiveTransactionAssessment) {
    this.interactiveTransactionAssessment = interactiveTransactionAssessment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateInteractiveTransactionAssessmentRequest evaluateInteractiveTransactionAssessmentRequest = (EvaluateInteractiveTransactionAssessmentRequest) o;
    return Objects.equals(this.interactiveTransactionAssessment, evaluateInteractiveTransactionAssessmentRequest.interactiveTransactionAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactiveTransactionAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateInteractiveTransactionAssessmentRequest {\n");
    
    sb.append("    interactiveTransactionAssessment: ").append(toIndentedString(interactiveTransactionAssessment)).append("\n");
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

