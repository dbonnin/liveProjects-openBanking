package com.diegobonnin.openbanking.model;

import java.net.URI;
import java.util.Objects;
import com.diegobonnin.openbanking.model.OBActiveOrHistoricCurrencyAndAmount10;
import com.diegobonnin.openbanking.model.OBActiveOrHistoricCurrencyAndAmount9;
import com.diegobonnin.openbanking.model.OBBankTransactionCodeStructure1;
import com.diegobonnin.openbanking.model.OBBranchAndFinancialInstitutionIdentification61;
import com.diegobonnin.openbanking.model.OBBranchAndFinancialInstitutionIdentification62;
import com.diegobonnin.openbanking.model.OBCashAccount60;
import com.diegobonnin.openbanking.model.OBCashAccount61;
import com.diegobonnin.openbanking.model.OBCreditDebitCode1;
import com.diegobonnin.openbanking.model.OBCurrencyExchange5;
import com.diegobonnin.openbanking.model.OBEntryStatus1Code;
import com.diegobonnin.openbanking.model.OBMerchantDetails1;
import com.diegobonnin.openbanking.model.OBTransactionCardInstrument1;
import com.diegobonnin.openbanking.model.OBTransactionCashBalance;
import com.diegobonnin.openbanking.model.OBTransactionMutability1Code;
import com.diegobonnin.openbanking.model.ProprietaryBankTransactionCodeStructure1;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Provides further details on an entry in the report.
 */

@Schema(name = "OBTransaction6", description = "Provides further details on an entry in the report.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public class OBTransaction6 {

  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("TransactionId")
  private String transactionId;

  @JsonProperty("TransactionReference")
  private String transactionReference;

  @JsonProperty("StatementReference")
  
  private List<String> statementReference = null;

  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode1 creditDebitIndicator;

  @JsonProperty("Status")
  private OBEntryStatus1Code status;

  @JsonProperty("TransactionMutability")
  private OBTransactionMutability1Code transactionMutability;

  @JsonProperty("BookingDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime bookingDateTime;

  @JsonProperty("ValueDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime valueDateTime;

  @JsonProperty("TransactionInformation")
  private String transactionInformation;

  @JsonProperty("AddressLine")
  private String addressLine;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount9 amount;

  @JsonProperty("ChargeAmount")
  private OBActiveOrHistoricCurrencyAndAmount10 chargeAmount;

  @JsonProperty("CurrencyExchange")
  private OBCurrencyExchange5 currencyExchange;

  @JsonProperty("BankTransactionCode")
  private OBBankTransactionCodeStructure1 bankTransactionCode;

  @JsonProperty("ProprietaryBankTransactionCode")
  private ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode;

  @JsonProperty("Balance")
  private OBTransactionCashBalance balance;

  @JsonProperty("MerchantDetails")
  private OBMerchantDetails1 merchantDetails;

  @JsonProperty("CreditorAgent")
  private OBBranchAndFinancialInstitutionIdentification61 creditorAgent;

  @JsonProperty("CreditorAccount")
  private OBCashAccount60 creditorAccount;

  @JsonProperty("DebtorAgent")
  private OBBranchAndFinancialInstitutionIdentification62 debtorAgent;

  @JsonProperty("DebtorAccount")
  private OBCashAccount61 debtorAccount;

  @JsonProperty("CardInstrument")
  private OBTransactionCardInstrument1 cardInstrument;

  @JsonProperty("SupplementaryData")
  
  private Map<String, Object> supplementaryData = null;

  public OBTransaction6 accountId(String accountId) {
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

  public OBTransaction6 transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
   * @return transactionId
  */
  
  @Schema(name = "TransactionId", description = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public OBTransaction6 transactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
    return this;
  }

  /**
   * Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.
   * @return transactionReference
  */
  
  @Schema(name = "TransactionReference", description = "Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTransactionReference() {
    return transactionReference;
  }

  public void setTransactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
  }

  public OBTransaction6 statementReference(List<String> statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  public OBTransaction6 addStatementReferenceItem(String statementReferenceItem) {
    if (this.statementReference == null) {
      this.statementReference = new ArrayList<>();
    }
    this.statementReference.add(statementReferenceItem);
    return this;
  }

  /**
   * Get statementReference
   * @return statementReference
  */
  
  @Schema(name = "StatementReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<String> getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(List<String> statementReference) {
    this.statementReference = statementReference;
  }

  public OBTransaction6 creditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  */
  @NotNull
  @Schema(name = "CreditDebitIndicator", requiredMode = Schema.RequiredMode.REQUIRED)
  public OBCreditDebitCode1 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBTransaction6 status(OBEntryStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
  public OBEntryStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBEntryStatus1Code status) {
    this.status = status;
  }

  public OBTransaction6 transactionMutability(OBTransactionMutability1Code transactionMutability) {
    this.transactionMutability = transactionMutability;
    return this;
  }

  /**
   * Get transactionMutability
   * @return transactionMutability
  */
  
  @Schema(name = "TransactionMutability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBTransactionMutability1Code getTransactionMutability() {
    return transactionMutability;
  }

  public void setTransactionMutability(OBTransactionMutability1Code transactionMutability) {
    this.transactionMutability = transactionMutability;
  }

  public OBTransaction6 bookingDateTime(OffsetDateTime bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
    return this;
  }

  /**
   * Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return bookingDateTime
  */
  @NotNull
  @Schema(name = "BookingDateTime", description = "Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  public OffsetDateTime getBookingDateTime() {
    return bookingDateTime;
  }

  public void setBookingDateTime(OffsetDateTime bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
  }

  public OBTransaction6 valueDateTime(OffsetDateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
    return this;
  }

  /**
   * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return valueDateTime
  */
  
  @Schema(name = "ValueDateTime", description = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(OffsetDateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public OBTransaction6 transactionInformation(String transactionInformation) {
    this.transactionInformation = transactionInformation;
    return this;
  }

  /**
   * Further details of the transaction.  This is the transaction narrative, which is unstructured text.
   * @return transactionInformation
  */
  
  @Schema(name = "TransactionInformation", description = "Further details of the transaction.  This is the transaction narrative, which is unstructured text.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTransactionInformation() {
    return transactionInformation;
  }

  public void setTransactionInformation(String transactionInformation) {
    this.transactionInformation = transactionInformation;
  }

  public OBTransaction6 addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.
   * @return addressLine
  */
  
  @Schema(name = "AddressLine", description = "Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public OBTransaction6 amount(OBActiveOrHistoricCurrencyAndAmount9 amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @NotNull
  @Schema(name = "Amount", requiredMode = Schema.RequiredMode.REQUIRED)
  public OBActiveOrHistoricCurrencyAndAmount9 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount9 amount) {
    this.amount = amount;
  }

  public OBTransaction6 chargeAmount(OBActiveOrHistoricCurrencyAndAmount10 chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

  /**
   * Get chargeAmount
   * @return chargeAmount
  */
  
  @Schema(name = "ChargeAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBActiveOrHistoricCurrencyAndAmount10 getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(OBActiveOrHistoricCurrencyAndAmount10 chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public OBTransaction6 currencyExchange(OBCurrencyExchange5 currencyExchange) {
    this.currencyExchange = currencyExchange;
    return this;
  }

  /**
   * Get currencyExchange
   * @return currencyExchange
  */
  
  @Schema(name = "CurrencyExchange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBCurrencyExchange5 getCurrencyExchange() {
    return currencyExchange;
  }

  public void setCurrencyExchange(OBCurrencyExchange5 currencyExchange) {
    this.currencyExchange = currencyExchange;
  }

  public OBTransaction6 bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
    return this;
  }

  /**
   * Get bankTransactionCode
   * @return bankTransactionCode
  */
  
  @Schema(name = "BankTransactionCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBBankTransactionCodeStructure1 getBankTransactionCode() {
    return bankTransactionCode;
  }

  public void setBankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
  }

  public OBTransaction6 proprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

  /**
   * Get proprietaryBankTransactionCode
   * @return proprietaryBankTransactionCode
  */
  
  @Schema(name = "ProprietaryBankTransactionCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ProprietaryBankTransactionCodeStructure1 getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }

  public void setProprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }

  public OBTransaction6 balance(OBTransactionCashBalance balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  */
  
  @Schema(name = "Balance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBTransactionCashBalance getBalance() {
    return balance;
  }

  public void setBalance(OBTransactionCashBalance balance) {
    this.balance = balance;
  }

  public OBTransaction6 merchantDetails(OBMerchantDetails1 merchantDetails) {
    this.merchantDetails = merchantDetails;
    return this;
  }

  /**
   * Get merchantDetails
   * @return merchantDetails
  */
  
  @Schema(name = "MerchantDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBMerchantDetails1 getMerchantDetails() {
    return merchantDetails;
  }

  public void setMerchantDetails(OBMerchantDetails1 merchantDetails) {
    this.merchantDetails = merchantDetails;
  }

  public OBTransaction6 creditorAgent(OBBranchAndFinancialInstitutionIdentification61 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   * @return creditorAgent
  */
  
  @Schema(name = "CreditorAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBBranchAndFinancialInstitutionIdentification61 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification61 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBTransaction6 creditorAccount(OBCashAccount60 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
  */
  
  @Schema(name = "CreditorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBCashAccount60 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount60 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBTransaction6 debtorAgent(OBBranchAndFinancialInstitutionIdentification62 debtorAgent) {
    this.debtorAgent = debtorAgent;
    return this;
  }

  /**
   * Get debtorAgent
   * @return debtorAgent
  */
  
  @Schema(name = "DebtorAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBBranchAndFinancialInstitutionIdentification62 getDebtorAgent() {
    return debtorAgent;
  }

  public void setDebtorAgent(OBBranchAndFinancialInstitutionIdentification62 debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  public OBTransaction6 debtorAccount(OBCashAccount61 debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  */
  
  @Schema(name = "DebtorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBCashAccount61 getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBCashAccount61 debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public OBTransaction6 cardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    this.cardInstrument = cardInstrument;
    return this;
  }

  /**
   * Get cardInstrument
   * @return cardInstrument
  */
  
  @Schema(name = "CardInstrument", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBTransactionCardInstrument1 getCardInstrument() {
    return cardInstrument;
  }

  public void setCardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    this.cardInstrument = cardInstrument;
  }

  public OBTransaction6 supplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  public OBTransaction6 putSupplementaryDataItem(String key, Object supplementaryDataItem) {
    if (this.supplementaryData == null) {
      this.supplementaryData = new HashMap<>();
    }
    this.supplementaryData.put(key, supplementaryDataItem);
    return this;
  }

  /**
   * Additional information that can not be captured in the structured fields and/or any other specific block.
   * @return supplementaryData
  */
  
  @Schema(name = "SupplementaryData", description = "Additional information that can not be captured in the structured fields and/or any other specific block.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Map<String, Object> getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransaction6 obTransaction6 = (OBTransaction6) o;
    return Objects.equals(this.accountId, obTransaction6.accountId) &&
        Objects.equals(this.transactionId, obTransaction6.transactionId) &&
        Objects.equals(this.transactionReference, obTransaction6.transactionReference) &&
        Objects.equals(this.statementReference, obTransaction6.statementReference) &&
        Objects.equals(this.creditDebitIndicator, obTransaction6.creditDebitIndicator) &&
        Objects.equals(this.status, obTransaction6.status) &&
        Objects.equals(this.transactionMutability, obTransaction6.transactionMutability) &&
        Objects.equals(this.bookingDateTime, obTransaction6.bookingDateTime) &&
        Objects.equals(this.valueDateTime, obTransaction6.valueDateTime) &&
        Objects.equals(this.transactionInformation, obTransaction6.transactionInformation) &&
        Objects.equals(this.addressLine, obTransaction6.addressLine) &&
        Objects.equals(this.amount, obTransaction6.amount) &&
        Objects.equals(this.chargeAmount, obTransaction6.chargeAmount) &&
        Objects.equals(this.currencyExchange, obTransaction6.currencyExchange) &&
        Objects.equals(this.bankTransactionCode, obTransaction6.bankTransactionCode) &&
        Objects.equals(this.proprietaryBankTransactionCode, obTransaction6.proprietaryBankTransactionCode) &&
        Objects.equals(this.balance, obTransaction6.balance) &&
        Objects.equals(this.merchantDetails, obTransaction6.merchantDetails) &&
        Objects.equals(this.creditorAgent, obTransaction6.creditorAgent) &&
        Objects.equals(this.creditorAccount, obTransaction6.creditorAccount) &&
        Objects.equals(this.debtorAgent, obTransaction6.debtorAgent) &&
        Objects.equals(this.debtorAccount, obTransaction6.debtorAccount) &&
        Objects.equals(this.cardInstrument, obTransaction6.cardInstrument) &&
        Objects.equals(this.supplementaryData, obTransaction6.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, transactionId, transactionReference, statementReference, creditDebitIndicator, status, transactionMutability, bookingDateTime, valueDateTime, transactionInformation, addressLine, amount, chargeAmount, currencyExchange, bankTransactionCode, proprietaryBankTransactionCode, balance, merchantDetails, creditorAgent, creditorAccount, debtorAgent, debtorAccount, cardInstrument, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransaction6 {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionMutability: ").append(toIndentedString(transactionMutability)).append("\n");
    sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
    sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
    sb.append("    transactionInformation: ").append(toIndentedString(transactionInformation)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    cardInstrument: ").append(toIndentedString(cardInstrument)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

