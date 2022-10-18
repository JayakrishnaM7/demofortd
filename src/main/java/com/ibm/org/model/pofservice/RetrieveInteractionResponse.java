package com.ibm.org.model.pofservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.pofservice.InitiateAutomatedResponseAssisted;
import com.ibm.org.model.pofservice.InitiateAutomatedResponseInteraction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveInteractionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T09:12:45.598Z[GMT]")

public class RetrieveInteractionResponse   {
  @JsonProperty("Assisted")
  private InitiateAutomatedResponseAssisted assisted;

  @JsonProperty("Interaction")
  private InitiateAutomatedResponseInteraction interaction;

  public RetrieveInteractionResponse assisted(InitiateAutomatedResponseAssisted assisted) {
    this.assisted = assisted;
    return this;
  }

  /**
   * Get assisted
   * @return assisted
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAutomatedResponseAssisted getAssisted() {
    return assisted;
  }

  public void setAssisted(InitiateAutomatedResponseAssisted assisted) {
    this.assisted = assisted;
  }

  public RetrieveInteractionResponse interaction(InitiateAutomatedResponseInteraction interaction) {
    this.interaction = interaction;
    return this;
  }

  /**
   * Get interaction
   * @return interaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAutomatedResponseInteraction getInteraction() {
    return interaction;
  }

  public void setInteraction(InitiateAutomatedResponseInteraction interaction) {
    this.interaction = interaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveInteractionResponse retrieveInteractionResponse = (RetrieveInteractionResponse) o;
    return Objects.equals(this.assisted, retrieveInteractionResponse.assisted) &&
        Objects.equals(this.interaction, retrieveInteractionResponse.interaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assisted, interaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveInteractionResponse {\n");
    
    sb.append("    assisted: ").append(toIndentedString(assisted)).append("\n");
    sb.append("    interaction: ").append(toIndentedString(interaction)).append("\n");
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

