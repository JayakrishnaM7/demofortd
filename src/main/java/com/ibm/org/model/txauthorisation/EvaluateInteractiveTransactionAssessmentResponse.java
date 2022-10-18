package com.ibm.org.model.txauthorisation;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.txauthorisation.EvaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateInteractiveTransactionAssessmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:47.805Z[GMT]")

public class EvaluateInteractiveTransactionAssessmentResponse   {
  @JsonProperty("InteractiveTransactionAssessment")
  private EvaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment interactiveTransactionAssessment;

  public EvaluateInteractiveTransactionAssessmentResponse interactiveTransactionAssessment(EvaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment interactiveTransactionAssessment) {
    this.interactiveTransactionAssessment = interactiveTransactionAssessment;
    return this;
  }

  /**
   * Get interactiveTransactionAssessment
   * @return interactiveTransactionAssessment
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment getInteractiveTransactionAssessment() {
    return interactiveTransactionAssessment;
  }

  public void setInteractiveTransactionAssessment(EvaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment interactiveTransactionAssessment) {
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
    EvaluateInteractiveTransactionAssessmentResponse evaluateInteractiveTransactionAssessmentResponse = (EvaluateInteractiveTransactionAssessmentResponse) o;
    return Objects.equals(this.interactiveTransactionAssessment, evaluateInteractiveTransactionAssessmentResponse.interactiveTransactionAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactiveTransactionAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateInteractiveTransactionAssessmentResponse {\n");
    
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

