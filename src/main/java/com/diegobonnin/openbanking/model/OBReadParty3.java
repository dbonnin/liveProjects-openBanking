package com.diegobonnin.openbanking.model;

import java.net.URI;
import java.util.Objects;
import com.diegobonnin.openbanking.model.Links;
import com.diegobonnin.openbanking.model.Meta;
import com.diegobonnin.openbanking.model.OBReadParty3Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OBReadParty3
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public class OBReadParty3 {

  @JsonProperty("Data")
  private OBReadParty3Data data;

  @JsonProperty("Links")
  private Links links;

  @JsonProperty("Meta")
  private Meta meta;

  public OBReadParty3 data(OBReadParty3Data data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull
  @Schema(name = "Data", requiredMode = Schema.RequiredMode.REQUIRED)
  public OBReadParty3Data getData() {
    return data;
  }

  public void setData(OBReadParty3Data data) {
    this.data = data;
  }

  public OBReadParty3 links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  
  @Schema(name = "Links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBReadParty3 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  
  @Schema(name = "Meta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadParty3 obReadParty3 = (OBReadParty3) o;
    return Objects.equals(this.data, obReadParty3.data) &&
        Objects.equals(this.links, obReadParty3.links) &&
        Objects.equals(this.meta, obReadParty3.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadParty3 {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

