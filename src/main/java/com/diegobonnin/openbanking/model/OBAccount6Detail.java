package com.diegobonnin.openbanking.model;

import java.net.URI;
import java.util.Objects;
import com.diegobonnin.openbanking.model.OBAccount6AccountInner;
import com.diegobonnin.openbanking.model.OBAccountStatus1Code;
import com.diegobonnin.openbanking.model.OBBranchAndFinancialInstitutionIdentification50;
import com.diegobonnin.openbanking.model.OBExternalAccountSubType1Code;
import com.diegobonnin.openbanking.model.OBExternalAccountType1Code;
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
 * Unambiguous identification of the account to which credit and debit entries are made.
 */

@Schema(name = "OBAccount6Detail", description = "Unambiguous identification of the account to which credit and debit entries are made.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public class OBAccount6Detail {

  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("Status")
  private OBAccountStatus1Code status;

  @JsonProperty("StatusUpdateDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime statusUpdateDateTime;

  @JsonProperty("Currency")
  private String currency;

  @JsonProperty("AccountType")
  private OBExternalAccountType1Code accountType;

  @JsonProperty("AccountSubType")
  private OBExternalAccountSubType1Code accountSubType;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("Nickname")
  private String nickname;

  @JsonProperty("OpeningDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime openingDate;

  @JsonProperty("MaturityDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime maturityDate;

  @JsonProperty("SwitchStatus")
  private String switchStatus;

  @JsonProperty("Account")
  
  private List<OBAccount6AccountInner> account = new ArrayList<>();

  @JsonProperty("Servicer")
  private OBBranchAndFinancialInstitutionIdentification50 servicer;

  public OBAccount6Detail accountId(String accountId) {
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

  public OBAccount6Detail status(OBAccountStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBAccountStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBAccountStatus1Code status) {
    this.status = status;
  }

  public OBAccount6Detail statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
  */
  
  @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBAccount6Detail currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.
   * @return currency
  */
  @NotNull
  @Schema(name = "Currency", description = "Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBAccount6Detail accountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @NotNull
  @Schema(name = "AccountType", requiredMode = Schema.RequiredMode.REQUIRED)
  public OBExternalAccountType1Code getAccountType() {
    return accountType;
  }

  public void setAccountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
  }

  public OBAccount6Detail accountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
    return this;
  }

  /**
   * Get accountSubType
   * @return accountSubType
  */
  @NotNull
  @Schema(name = "AccountSubType", requiredMode = Schema.RequiredMode.REQUIRED)
  public OBExternalAccountSubType1Code getAccountSubType() {
    return accountSubType;
  }

  public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
  }

  public OBAccount6Detail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Specifies the description of the account type.
   * @return description
  */
  
  @Schema(name = "Description", description = "Specifies the description of the account type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBAccount6Detail nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.
   * @return nickname
  */
  
  @Schema(name = "Nickname", description = "The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public OBAccount6Detail openingDate(OffsetDateTime openingDate) {
    this.openingDate = openingDate;
    return this;
  }

  /**
   * Date on which the account and related basic services are effectively operational for the account owner.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return openingDate
  */
  
  @Schema(name = "OpeningDate", description = "Date on which the account and related basic services are effectively operational for the account owner.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getOpeningDate() {
    return openingDate;
  }

  public void setOpeningDate(OffsetDateTime openingDate) {
    this.openingDate = openingDate;
  }

  public OBAccount6Detail maturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

  /**
   * Maturity date of the account.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return maturityDate
  */
  
  @Schema(name = "MaturityDate", description = "Maturity date of the account.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }

  public OBAccount6Detail switchStatus(String switchStatus) {
    this.switchStatus = switchStatus;
    return this;
  }

  /**
   * Specifies the switch status for the account, in a coded form.
   * @return switchStatus
  */
  
  @Schema(name = "SwitchStatus", description = "Specifies the switch status for the account, in a coded form.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSwitchStatus() {
    return switchStatus;
  }

  public void setSwitchStatus(String switchStatus) {
    this.switchStatus = switchStatus;
  }

  public OBAccount6Detail account(List<OBAccount6AccountInner> account) {
    this.account = account;
    return this;
  }

  public OBAccount6Detail addAccountItem(OBAccount6AccountInner accountItem) {
    this.account.add(accountItem);
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @NotNull
  @Schema(name = "Account", requiredMode = Schema.RequiredMode.REQUIRED)
  public List<OBAccount6AccountInner> getAccount() {
    return account;
  }

  public void setAccount(List<OBAccount6AccountInner> account) {
    this.account = account;
  }

  public OBAccount6Detail servicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
    return this;
  }

  /**
   * Get servicer
   * @return servicer
  */
  
  @Schema(name = "Servicer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBBranchAndFinancialInstitutionIdentification50 getServicer() {
    return servicer;
  }

  public void setServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccount6Detail obAccount6Detail = (OBAccount6Detail) o;
    return Objects.equals(this.accountId, obAccount6Detail.accountId) &&
        Objects.equals(this.status, obAccount6Detail.status) &&
        Objects.equals(this.statusUpdateDateTime, obAccount6Detail.statusUpdateDateTime) &&
        Objects.equals(this.currency, obAccount6Detail.currency) &&
        Objects.equals(this.accountType, obAccount6Detail.accountType) &&
        Objects.equals(this.accountSubType, obAccount6Detail.accountSubType) &&
        Objects.equals(this.description, obAccount6Detail.description) &&
        Objects.equals(this.nickname, obAccount6Detail.nickname) &&
        Objects.equals(this.openingDate, obAccount6Detail.openingDate) &&
        Objects.equals(this.maturityDate, obAccount6Detail.maturityDate) &&
        Objects.equals(this.switchStatus, obAccount6Detail.switchStatus) &&
        Objects.equals(this.account, obAccount6Detail.account) &&
        Objects.equals(this.servicer, obAccount6Detail.servicer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, status, statusUpdateDateTime, currency, accountType, accountSubType, description, nickname, openingDate, maturityDate, switchStatus, account, servicer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount6Detail {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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

