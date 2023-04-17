package com.diegobonnin.openbanking.model;

import java.net.URI;
import java.util.Objects;
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
 * Set of elements used to provide details of a generic rate related to the statement resource.
 */

@Schema(name = "OBStatement2_StatementRate_inner", description = "Set of elements used to provide details of a generic rate related to the statement resource.")
@JsonTypeName("OBStatement2_StatementRate_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public class OBStatement2StatementRateInner {

  @JsonProperty("Rate")
  private String rate;

  @JsonProperty("Type")
  private String type;

  public OBStatement2StatementRateInner rate(String rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate associated with the statement rate type.
   * @return rate
  */
  @NotNull
  @Schema(name = "Rate", description = "Rate associated with the statement rate type.", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public OBStatement2StatementRateInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Statement rate type, in a coded form.
   * @return type
  */
  @NotNull
  @Schema(name = "Type", description = "Statement rate type, in a coded form.", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementRateInner obStatement2StatementRateInner = (OBStatement2StatementRateInner) o;
    return Objects.equals(this.rate, obStatement2StatementRateInner.rate) &&
        Objects.equals(this.type, obStatement2StatementRateInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementRateInner {\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

