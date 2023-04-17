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
 * Balance type, in a coded form.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public enum OBBalanceType1Code {
  
  CLOSINGAVAILABLE("ClosingAvailable"),
  
  CLOSINGBOOKED("ClosingBooked"),
  
  CLOSINGCLEARED("ClosingCleared"),
  
  EXPECTED("Expected"),
  
  FORWARDAVAILABLE("ForwardAvailable"),
  
  INFORMATION("Information"),
  
  INTERIMAVAILABLE("InterimAvailable"),
  
  INTERIMBOOKED("InterimBooked"),
  
  INTERIMCLEARED("InterimCleared"),
  
  OPENINGAVAILABLE("OpeningAvailable"),
  
  OPENINGBOOKED("OpeningBooked"),
  
  OPENINGCLEARED("OpeningCleared"),
  
  PREVIOUSLYCLOSEDBOOKED("PreviouslyClosedBooked");

  private String value;

  OBBalanceType1Code(String value) {
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
  public static OBBalanceType1Code fromValue(String value) {
    for (OBBalanceType1Code b : OBBalanceType1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

