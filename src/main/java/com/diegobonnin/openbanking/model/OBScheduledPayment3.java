package com.diegobonnin.openbanking.model;

import java.net.URI;
import java.util.Objects;
import com.diegobonnin.openbanking.model.OBActiveOrHistoricCurrencyAndAmount1;
import com.diegobonnin.openbanking.model.OBBranchAndFinancialInstitutionIdentification51;
import com.diegobonnin.openbanking.model.OBCashAccount51;
import com.diegobonnin.openbanking.model.OBExternalScheduleType1Code;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OBScheduledPayment3
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public class OBScheduledPayment3 {

  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("ScheduledPaymentId")
  private String scheduledPaymentId;

  @JsonProperty("ScheduledPaymentDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduledPaymentDateTime;

  @JsonProperty("ScheduledType")
  private OBExternalScheduleType1Code scheduledType;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("DebtorReference")
  private String debtorReference;

  @JsonProperty("InstructedAmount")
  private OBActiveOrHistoricCurrencyAndAmount1 instructedAmount;

  @JsonProperty("CreditorAgent")
  private OBBranchAndFinancialInstitutionIdentification51 creditorAgent;

  @JsonProperty("CreditorAccount")
  private OBCashAccount51 creditorAccount;

  public OBScheduledPayment3 accountId(String accountId) {
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

  public OBScheduledPayment3 scheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.
   * @return scheduledPaymentId
  */
  
  @Schema(name = "ScheduledPaymentId", description = "A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getScheduledPaymentId() {
    return scheduledPaymentId;
  }

  public void setScheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
  }

  public OBScheduledPayment3 scheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    return this;
  }

  /**
   * The date on which the scheduled payment will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return scheduledPaymentDateTime
  */
  @NotNull
  @Schema(name = "ScheduledPaymentDateTime", description = "The date on which the scheduled payment will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  public OffsetDateTime getScheduledPaymentDateTime() {
    return scheduledPaymentDateTime;
  }

  public void setScheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
  }

  public OBScheduledPayment3 scheduledType(OBExternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
    return this;
  }

  /**
   * Get scheduledType
   * @return scheduledType
  */
  @NotNull
  @Schema(name = "ScheduledType", requiredMode = Schema.RequiredMode.REQUIRED)
  public OBExternalScheduleType1Code getScheduledType() {
    return scheduledType;
  }

  public void setScheduledType(OBExternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
  }

  public OBScheduledPayment3 reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   * @return reference
  */
  
  @Schema(name = "Reference", description = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBScheduledPayment3 debtorReference(String debtorReference) {
    this.debtorReference = debtorReference;
    return this;
  }

  /**
   * A reference value provided by the PSU to the PISP while setting up the scheduled payment.
   * @return debtorReference
  */
  
  @Schema(name = "DebtorReference", description = "A reference value provided by the PSU to the PISP while setting up the scheduled payment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDebtorReference() {
    return debtorReference;
  }

  public void setDebtorReference(String debtorReference) {
    this.debtorReference = debtorReference;
  }

  public OBScheduledPayment3 instructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  */
  @NotNull
  @Schema(name = "InstructedAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  public OBActiveOrHistoricCurrencyAndAmount1 getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBScheduledPayment3 creditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   * @return creditorAgent
  */
  
  @Schema(name = "CreditorAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBBranchAndFinancialInstitutionIdentification51 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBScheduledPayment3 creditorAccount(OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
  */
  
  @Schema(name = "CreditorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBCashAccount51 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBScheduledPayment3 obScheduledPayment3 = (OBScheduledPayment3) o;
    return Objects.equals(this.accountId, obScheduledPayment3.accountId) &&
        Objects.equals(this.scheduledPaymentId, obScheduledPayment3.scheduledPaymentId) &&
        Objects.equals(this.scheduledPaymentDateTime, obScheduledPayment3.scheduledPaymentDateTime) &&
        Objects.equals(this.scheduledType, obScheduledPayment3.scheduledType) &&
        Objects.equals(this.reference, obScheduledPayment3.reference) &&
        Objects.equals(this.debtorReference, obScheduledPayment3.debtorReference) &&
        Objects.equals(this.instructedAmount, obScheduledPayment3.instructedAmount) &&
        Objects.equals(this.creditorAgent, obScheduledPayment3.creditorAgent) &&
        Objects.equals(this.creditorAccount, obScheduledPayment3.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, scheduledPaymentId, scheduledPaymentDateTime, scheduledType, reference, debtorReference, instructedAmount, creditorAgent, creditorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBScheduledPayment3 {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    scheduledPaymentId: ").append(toIndentedString(scheduledPaymentId)).append("\n");
    sb.append("    scheduledPaymentDateTime: ").append(toIndentedString(scheduledPaymentDateTime)).append("\n");
    sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    debtorReference: ").append(toIndentedString(debtorReference)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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

