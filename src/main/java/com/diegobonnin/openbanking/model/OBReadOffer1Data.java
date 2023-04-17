package com.diegobonnin.openbanking.model;

import java.net.URI;
import java.util.Objects;
import com.diegobonnin.openbanking.model.OBReadOffer1DataOfferInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OBReadOffer1Data
 */

@JsonTypeName("OBReadOffer1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public class OBReadOffer1Data {

  @JsonProperty("Offer")
  
  private List<OBReadOffer1DataOfferInner> offer = null;

  public OBReadOffer1Data offer(List<OBReadOffer1DataOfferInner> offer) {
    this.offer = offer;
    return this;
  }

  public OBReadOffer1Data addOfferItem(OBReadOffer1DataOfferInner offerItem) {
    if (this.offer == null) {
      this.offer = new ArrayList<>();
    }
    this.offer.add(offerItem);
    return this;
  }

  /**
   * Get offer
   * @return offer
  */
  
  @Schema(name = "Offer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<OBReadOffer1DataOfferInner> getOffer() {
    return offer;
  }

  public void setOffer(List<OBReadOffer1DataOfferInner> offer) {
    this.offer = offer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadOffer1Data obReadOffer1Data = (OBReadOffer1Data) o;
    return Objects.equals(this.offer, obReadOffer1Data.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadOffer1Data {\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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

