package com.diegobonnin.openbanking.model;

import java.net.URI;
import java.util.Objects;
import com.diegobonnin.openbanking.model.OBPartyRelationships1Account;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The Party&#39;s relationships with other resources.
 */

@Schema(name = "OBPartyRelationships1", description = "The Party's relationships with other resources.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public class OBPartyRelationships1 {

  @JsonProperty("Account")
  private OBPartyRelationships1Account account;

  public OBPartyRelationships1 account(OBPartyRelationships1Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  
  @Schema(name = "Account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBPartyRelationships1Account getAccount() {
    return account;
  }

  public void setAccount(OBPartyRelationships1Account account) {
    this.account = account;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPartyRelationships1 obPartyRelationships1 = (OBPartyRelationships1) o;
    return Objects.equals(this.account, obPartyRelationships1.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPartyRelationships1 {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

