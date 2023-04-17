package com.diegobonnin.openbanking.model;

import java.net.URI;
import java.util.Objects;
import com.diegobonnin.openbanking.model.TierBandSetInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about the interest that may be payable to the BCA account holders
 */

@Schema(name = "CreditInterest", description = "Details about the interest that may be payable to the BCA account holders")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public class CreditInterest {

  @JsonProperty("TierBandSet")
  
  private List<TierBandSetInner> tierBandSet = new ArrayList<>();

  public CreditInterest tierBandSet(List<TierBandSetInner> tierBandSet) {
    this.tierBandSet = tierBandSet;
    return this;
  }

  public CreditInterest addTierBandSetItem(TierBandSetInner tierBandSetItem) {
    this.tierBandSet.add(tierBandSetItem);
    return this;
  }

  /**
   * The group of tiers or bands for which credit interest can be applied.
   * @return tierBandSet
  */
  @NotNull
  @Schema(name = "TierBandSet", description = "The group of tiers or bands for which credit interest can be applied.", requiredMode = Schema.RequiredMode.REQUIRED)
  public List<TierBandSetInner> getTierBandSet() {
    return tierBandSet;
  }

  public void setTierBandSet(List<TierBandSetInner> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditInterest creditInterest = (CreditInterest) o;
    return Objects.equals(this.tierBandSet, creditInterest.tierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditInterest {\n");
    sb.append("    tierBandSet: ").append(toIndentedString(tierBandSet)).append("\n");
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

