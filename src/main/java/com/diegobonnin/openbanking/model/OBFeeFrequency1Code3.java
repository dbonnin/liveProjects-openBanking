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
 * How frequently the fee/charge is calculated
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public enum OBFeeFrequency1Code3 {
  
  FEAC("FEAC"),
  
  FEAO("FEAO"),
  
  FECP("FECP"),
  
  FEDA("FEDA"),
  
  FEHO("FEHO"),
  
  FEI("FEI"),
  
  FEMO("FEMO"),
  
  FEOA("FEOA"),
  
  FEOT("FEOT"),
  
  FEPC("FEPC"),
  
  FEPH("FEPH"),
  
  FEPO("FEPO"),
  
  FEPS("FEPS"),
  
  FEPT("FEPT"),
  
  FEPTA("FEPTA"),
  
  FEPTP("FEPTP"),
  
  FEQU("FEQU"),
  
  FESM("FESM"),
  
  FEST("FEST"),
  
  FEWE("FEWE"),
  
  FEYE("FEYE");

  private String value;

  OBFeeFrequency1Code3(String value) {
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
  public static OBFeeFrequency1Code3 fromValue(String value) {
    for (OBFeeFrequency1Code3 b : OBFeeFrequency1Code3.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
