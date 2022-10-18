package com.ibm.org.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Authentication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:39.202Z[GMT]")

public class Authentication   {
  @JsonProperty("AuthenticationTaskRecord")
  private String authenticationTaskRecord;

  public Authentication authenticationTaskRecord(String authenticationTaskRecord) {
    this.authenticationTaskRecord = authenticationTaskRecord;
    return this;
  }

  /**
   * Get authenticationTaskRecord
   * @return authenticationTaskRecord
  */
  @ApiModelProperty(value = "")


  public String getAuthenticationTaskRecord() {
    return authenticationTaskRecord;
  }

  public void setAuthenticationTaskRecord(String authenticationTaskRecord) {
    this.authenticationTaskRecord = authenticationTaskRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authentication authentication = (Authentication) o;
    return Objects.equals(this.authenticationTaskRecord, authentication.authenticationTaskRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationTaskRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authentication {\n");
    
    sb.append("    authenticationTaskRecord: ").append(toIndentedString(authenticationTaskRecord)).append("\n");
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

