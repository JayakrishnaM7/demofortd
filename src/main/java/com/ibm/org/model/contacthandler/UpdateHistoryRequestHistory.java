package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateHistoryRequestHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class UpdateHistoryRequestHistory   {
  @JsonProperty("HistoryTaskRecord")
  private String historyTaskRecord;

  public UpdateHistoryRequestHistory historyTaskRecord(String historyTaskRecord) {
    this.historyTaskRecord = historyTaskRecord;
    return this;
  }

  /**
   * Get historyTaskRecord
   * @return historyTaskRecord
  */
  @ApiModelProperty(value = "")


  public String getHistoryTaskRecord() {
    return historyTaskRecord;
  }

  public void setHistoryTaskRecord(String historyTaskRecord) {
    this.historyTaskRecord = historyTaskRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateHistoryRequestHistory updateHistoryRequestHistory = (UpdateHistoryRequestHistory) o;
    return Objects.equals(this.historyTaskRecord, updateHistoryRequestHistory.historyTaskRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historyTaskRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateHistoryRequestHistory {\n");
    
    sb.append("    historyTaskRecord: ").append(toIndentedString(historyTaskRecord)).append("\n");
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

