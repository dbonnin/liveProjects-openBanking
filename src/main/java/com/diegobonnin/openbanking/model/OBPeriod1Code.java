package com.diegobonnin.openbanking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Period e.g. day, week, month etc. for which the fee/charge is capped
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public enum OBPeriod1Code {
  
  PACT("PACT"),
  
  PDAY("PDAY"),
  
  PHYR("PHYR"),
  
  PMTH("PMTH"),
  
  PQTR("PQTR"),
  
  PWEK("PWEK"),
  
  PYER("PYER");

  private String value;

  OBPeriod1Code(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBPeriod1Code fromValue(String value) {
    for (OBPeriod1Code b : OBPeriod1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

