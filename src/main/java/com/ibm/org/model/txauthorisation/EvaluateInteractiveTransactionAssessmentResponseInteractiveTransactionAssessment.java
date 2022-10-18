package com.ibm.org.model.txauthorisation;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:47.805Z[GMT]")

public class EvaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment   {
  @JsonProperty("TransactionAuthorizationGuidance")
  private String transactionAuthorizationGuidance;

  @JsonProperty("TransactionAuthorizationResult")
  private String transactionAuthorizationResult;

  public EvaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment transactionAuthorizationGuidance(String transactionAuthorizationGuidance) {
    this.transactionAuthorizationGuidance = transactionAuthorizationGuidance;
    return this;
  }

  /**
   * Get transactionAuthorizationGuidance
   * @return transactionAuthorizationGuidance
  */
  @ApiModelProperty(value = "")


  public String getTransactionAuthorizationGuidance() {
    return transactionAuthorizationGuidance;
  }

  public void setTransactionAuthorizationGuidance(String transactionAuthorizationGuidance) {
    this.transactionAuthorizationGuidance = transactionAuthorizationGuidance;
  }

  public EvaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment transactionAuthorizationResult(String transactionAuthorizationResult) {
    this.transactionAuthorizationResult = transactionAuthorizationResult;
    return this;
  }

  /**
   * Get transactionAuthorizationResult
   * @return transactionAuthorizationResult
  */
  @ApiModelProperty(value = "")


  public String getTransactionAuthorizationResult() {
    return transactionAuthorizationResult;
  }

  public void setTransactionAuthorizationResult(String transactionAuthorizationResult) {
    this.transactionAuthorizationResult = transactionAuthorizationResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment evaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment = (EvaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment) o;
    return Objects.equals(this.transactionAuthorizationGuidance, evaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment.transactionAuthorizationGuidance) &&
        Objects.equals(this.transactionAuthorizationResult, evaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment.transactionAuthorizationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionAuthorizationGuidance, transactionAuthorizationResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment {\n");
    
    sb.append("    transactionAuthorizationGuidance: ").append(toIndentedString(transactionAuthorizationGuidance)).append("\n");
    sb.append("    transactionAuthorizationResult: ").append(toIndentedString(transactionAuthorizationResult)).append("\n");
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

