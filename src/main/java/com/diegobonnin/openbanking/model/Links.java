package com.diegobonnin.openbanking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Links relevant to the payload
 */

@Schema(name = "Links", description = "Links relevant to the payload")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public class Links {

  @JsonProperty("Self")
  private URI self;

  @JsonProperty("First")
  private URI first;

  @JsonProperty("Prev")
  private URI prev;

  @JsonProperty("Next")
  private URI next;

  @JsonProperty("Last")
  private URI last;

  public Links self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  @NotNull
  @Schema(name = "Self", requiredMode = Schema.RequiredMode.REQUIRED)
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public Links first(URI first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  */
  
  @Schema(name = "First", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public URI getFirst() {
    return first;
  }

  public void setFirst(URI first) {
    this.first = first;
  }

  public Links prev(URI prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   * @return prev
  */
  
  @Schema(name = "Prev", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public URI getPrev() {
    return prev;
  }

  public void setPrev(URI prev) {
    this.prev = prev;
  }

  public Links next(URI next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
  */
  
  @Schema(name = "Next", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  public Links last(URI last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  */
  
  @Schema(name = "Last", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public URI getLast() {
    return last;
  }

  public void setLast(URI last) {
    this.last = last;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.self, links.self) &&
        Objects.equals(this.first, links.first) &&
        Objects.equals(this.prev, links.prev) &&
        Objects.equals(this.next, links.next) &&
        Objects.equals(this.last, links.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

