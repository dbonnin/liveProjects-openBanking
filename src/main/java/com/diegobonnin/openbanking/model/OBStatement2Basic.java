package com.diegobonnin.openbanking.model;

import java.net.URI;
import java.util.Objects;
import com.diegobonnin.openbanking.model.OBExternalStatementType1Code;
import com.diegobonnin.openbanking.model.OBStatement2StatementBenefitInner;
import com.diegobonnin.openbanking.model.OBStatement2StatementDateTimeInner;
import com.diegobonnin.openbanking.model.OBStatement2StatementFeeInner;
import com.diegobonnin.openbanking.model.OBStatement2StatementInterestInner;
import com.diegobonnin.openbanking.model.OBStatement2StatementRateInner;
import com.diegobonnin.openbanking.model.OBStatement2StatementValueInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Provides further details on a statement resource.
 */

@Schema(name = "OBStatement2Basic", description = "Provides further details on a statement resource.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public class OBStatement2Basic {

  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("StatementId")
  private String statementId;

  @JsonProperty("StatementReference")
  private String statementReference;

  @JsonProperty("Type")
  private OBExternalStatementType1Code type;

  @JsonProperty("StartDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateTime;

  @JsonProperty("EndDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDateTime;

  @JsonProperty("CreationDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDateTime;

  @JsonProperty("StatementDescription")
  
  private List<String> statementDescription = null;

  @JsonProperty("StatementBenefit")
  
  private List<OBStatement2StatementBenefitInner> statementBenefit = null;

  @JsonProperty("StatementFee")
  
  private List<OBStatement2StatementFeeInner> statementFee = null;

  @JsonProperty("StatementInterest")
  
  private List<OBStatement2StatementInterestInner> statementInterest = null;

  @JsonProperty("StatementDateTime")
  
  private List<OBStatement2StatementDateTimeInner> statementDateTime = null;

  @JsonProperty("StatementRate")
  
  private List<OBStatement2StatementRateInner> statementRate = null;

  @JsonProperty("StatementValue")
  
  private List<OBStatement2StatementValueInner> statementValue = null;

  public OBStatement2Basic accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
  */
  @NotNull
  @Schema(name = "AccountId", description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBStatement2Basic statementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.
   * @return statementId
  */
  
  @Schema(name = "StatementId", description = "Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStatementId() {
    return statementId;
  }

  public void setStatementId(String statementId) {
    this.statementId = statementId;
  }

  public OBStatement2Basic statementReference(String statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  /**
   * Unique reference for the statement. This reference may be optionally populated if available.
   * @return statementReference
  */
  
  @Schema(name = "StatementReference", description = "Unique reference for the statement. This reference may be optionally populated if available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(String statementReference) {
    this.statementReference = statementReference;
  }

  public OBStatement2Basic type(OBExternalStatementType1Code type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.REQUIRED)
  public OBExternalStatementType1Code getType() {
    return type;
  }

  public void setType(OBExternalStatementType1Code type) {
    this.type = type;
  }

  public OBStatement2Basic startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Date and time at which the statement period starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return startDateTime
  */
  @NotNull
  @Schema(name = "StartDateTime", description = "Date and time at which the statement period starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public OBStatement2Basic endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Date and time at which the statement period ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return endDateTime
  */
  @NotNull
  @Schema(name = "EndDateTime", description = "Date and time at which the statement period ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  public OBStatement2Basic creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  */
  @NotNull
  @Schema(name = "CreationDateTime", description = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBStatement2Basic statementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
    return this;
  }

  public OBStatement2Basic addStatementDescriptionItem(String statementDescriptionItem) {
    if (this.statementDescription == null) {
      this.statementDescription = new ArrayList<>();
    }
    this.statementDescription.add(statementDescriptionItem);
    return this;
  }

  /**
   * Get statementDescription
   * @return statementDescription
  */
  
  @Schema(name = "StatementDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<String> getStatementDescription() {
    return statementDescription;
  }

  public void setStatementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
  }

  public OBStatement2Basic statementBenefit(List<OBStatement2StatementBenefitInner> statementBenefit) {
    this.statementBenefit = statementBenefit;
    return this;
  }

  public OBStatement2Basic addStatementBenefitItem(OBStatement2StatementBenefitInner statementBenefitItem) {
    if (this.statementBenefit == null) {
      this.statementBenefit = new ArrayList<>();
    }
    this.statementBenefit.add(statementBenefitItem);
    return this;
  }

  /**
   * Get statementBenefit
   * @return statementBenefit
  */
  
  @Schema(name = "StatementBenefit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<OBStatement2StatementBenefitInner> getStatementBenefit() {
    return statementBenefit;
  }

  public void setStatementBenefit(List<OBStatement2StatementBenefitInner> statementBenefit) {
    this.statementBenefit = statementBenefit;
  }

  public OBStatement2Basic statementFee(List<OBStatement2StatementFeeInner> statementFee) {
    this.statementFee = statementFee;
    return this;
  }

  public OBStatement2Basic addStatementFeeItem(OBStatement2StatementFeeInner statementFeeItem) {
    if (this.statementFee == null) {
      this.statementFee = new ArrayList<>();
    }
    this.statementFee.add(statementFeeItem);
    return this;
  }

  /**
   * Get statementFee
   * @return statementFee
  */
  
  @Schema(name = "StatementFee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<OBStatement2StatementFeeInner> getStatementFee() {
    return statementFee;
  }

  public void setStatementFee(List<OBStatement2StatementFeeInner> statementFee) {
    this.statementFee = statementFee;
  }

  public OBStatement2Basic statementInterest(List<OBStatement2StatementInterestInner> statementInterest) {
    this.statementInterest = statementInterest;
    return this;
  }

  public OBStatement2Basic addStatementInterestItem(OBStatement2StatementInterestInner statementInterestItem) {
    if (this.statementInterest == null) {
      this.statementInterest = new ArrayList<>();
    }
    this.statementInterest.add(statementInterestItem);
    return this;
  }

  /**
   * Get statementInterest
   * @return statementInterest
  */
  
  @Schema(name = "StatementInterest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<OBStatement2StatementInterestInner> getStatementInterest() {
    return statementInterest;
  }

  public void setStatementInterest(List<OBStatement2StatementInterestInner> statementInterest) {
    this.statementInterest = statementInterest;
  }

  public OBStatement2Basic statementDateTime(List<OBStatement2StatementDateTimeInner> statementDateTime) {
    this.statementDateTime = statementDateTime;
    return this;
  }

  public OBStatement2Basic addStatementDateTimeItem(OBStatement2StatementDateTimeInner statementDateTimeItem) {
    if (this.statementDateTime == null) {
      this.statementDateTime = new ArrayList<>();
    }
    this.statementDateTime.add(statementDateTimeItem);
    return this;
  }

  /**
   * Get statementDateTime
   * @return statementDateTime
  */
  
  @Schema(name = "StatementDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<OBStatement2StatementDateTimeInner> getStatementDateTime() {
    return statementDateTime;
  }

  public void setStatementDateTime(List<OBStatement2StatementDateTimeInner> statementDateTime) {
    this.statementDateTime = statementDateTime;
  }

  public OBStatement2Basic statementRate(List<OBStatement2StatementRateInner> statementRate) {
    this.statementRate = statementRate;
    return this;
  }

  public OBStatement2Basic addStatementRateItem(OBStatement2StatementRateInner statementRateItem) {
    if (this.statementRate == null) {
      this.statementRate = new ArrayList<>();
    }
    this.statementRate.add(statementRateItem);
    return this;
  }

  /**
   * Get statementRate
   * @return statementRate
  */
  
  @Schema(name = "StatementRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<OBStatement2StatementRateInner> getStatementRate() {
    return statementRate;
  }

  public void setStatementRate(List<OBStatement2StatementRateInner> statementRate) {
    this.statementRate = statementRate;
  }

  public OBStatement2Basic statementValue(List<OBStatement2StatementValueInner> statementValue) {
    this.statementValue = statementValue;
    return this;
  }

  public OBStatement2Basic addStatementValueItem(OBStatement2StatementValueInner statementValueItem) {
    if (this.statementValue == null) {
      this.statementValue = new ArrayList<>();
    }
    this.statementValue.add(statementValueItem);
    return this;
  }

  /**
   * Get statementValue
   * @return statementValue
  */
  
  @Schema(name = "StatementValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<OBStatement2StatementValueInner> getStatementValue() {
    return statementValue;
  }

  public void setStatementValue(List<OBStatement2StatementValueInner> statementValue) {
    this.statementValue = statementValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2Basic obStatement2Basic = (OBStatement2Basic) o;
    return Objects.equals(this.accountId, obStatement2Basic.accountId) &&
        Objects.equals(this.statementId, obStatement2Basic.statementId) &&
        Objects.equals(this.statementReference, obStatement2Basic.statementReference) &&
        Objects.equals(this.type, obStatement2Basic.type) &&
        Objects.equals(this.startDateTime, obStatement2Basic.startDateTime) &&
        Objects.equals(this.endDateTime, obStatement2Basic.endDateTime) &&
        Objects.equals(this.creationDateTime, obStatement2Basic.creationDateTime) &&
        Objects.equals(this.statementDescription, obStatement2Basic.statementDescription) &&
        Objects.equals(this.statementBenefit, obStatement2Basic.statementBenefit) &&
        Objects.equals(this.statementFee, obStatement2Basic.statementFee) &&
        Objects.equals(this.statementInterest, obStatement2Basic.statementInterest) &&
        Objects.equals(this.statementDateTime, obStatement2Basic.statementDateTime) &&
        Objects.equals(this.statementRate, obStatement2Basic.statementRate) &&
        Objects.equals(this.statementValue, obStatement2Basic.statementValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, statementId, statementReference, type, startDateTime, endDateTime, creationDateTime, statementDescription, statementBenefit, statementFee, statementInterest, statementDateTime, statementRate, statementValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2Basic {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
    sb.append("    statementBenefit: ").append(toIndentedString(statementBenefit)).append("\n");
    sb.append("    statementFee: ").append(toIndentedString(statementFee)).append("\n");
    sb.append("    statementInterest: ").append(toIndentedString(statementInterest)).append("\n");
    sb.append("    statementDateTime: ").append(toIndentedString(statementDateTime)).append("\n");
    sb.append("    statementRate: ").append(toIndentedString(statementRate)).append("\n");
    sb.append("    statementValue: ").append(toIndentedString(statementValue)).append("\n");
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

