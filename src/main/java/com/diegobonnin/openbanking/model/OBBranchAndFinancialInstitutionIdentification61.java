package com.diegobonnin.openbanking.model;

import java.net.URI;
import java.util.Objects;
import com.diegobonnin.openbanking.model.OBPostalAddress6;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Financial institution servicing an account for the creditor.
 */

@Schema(name = "OBBranchAndFinancialInstitutionIdentification6_1", description = "Financial institution servicing an account for the creditor.")
@JsonTypeName("OBBranchAndFinancialInstitutionIdentification6_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public class OBBranchAndFinancialInstitutionIdentification61 {

  @JsonProperty("SchemeName")
  private String schemeName;

  @JsonProperty("Identification")
  private String identification;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("PostalAddress")
  private OBPostalAddress6 postalAddress;

  public OBBranchAndFinancialInstitutionIdentification61 schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Name of the identification scheme, in a coded form as published in an external list.
   * @return schemeName
  */
  
  @Schema(name = "SchemeName", description = "Name of the identification scheme, in a coded form as published in an external list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBBranchAndFinancialInstitutionIdentification61 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a financial institution or a branch of a financial institution.
   * @return identification
  */
  
  @Schema(name = "Identification", description = "Unique and unambiguous identification of a financial institution or a branch of a financial institution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBBranchAndFinancialInstitutionIdentification61 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which an agent is known and which is usually used to identify that agent.
   * @return name
  */
  
  @Schema(name = "Name", description = "Name by which an agent is known and which is usually used to identify that agent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBBranchAndFinancialInstitutionIdentification61 postalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
  */
  
  @Schema(name = "PostalAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBPostalAddress6 getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBranchAndFinancialInstitutionIdentification61 obBranchAndFinancialInstitutionIdentification61 = (OBBranchAndFinancialInstitutionIdentification61) o;
    return Objects.equals(this.schemeName, obBranchAndFinancialInstitutionIdentification61.schemeName) &&
        Objects.equals(this.identification, obBranchAndFinancialInstitutionIdentification61.identification) &&
        Objects.equals(this.name, obBranchAndFinancialInstitutionIdentification61.name) &&
        Objects.equals(this.postalAddress, obBranchAndFinancialInstitutionIdentification61.postalAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, postalAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBranchAndFinancialInstitutionIdentification61 {\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

