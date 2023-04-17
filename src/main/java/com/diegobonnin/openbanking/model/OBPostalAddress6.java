package com.diegobonnin.openbanking.model;

import java.net.URI;
import java.util.Objects;
import com.diegobonnin.openbanking.model.OBAddressTypeCode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Information that locates and identifies a specific address, as defined by postal services.
 */

@Schema(name = "OBPostalAddress6", description = "Information that locates and identifies a specific address, as defined by postal services.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T22:08:21.934362800-04:00[America/Asuncion]")
public class OBPostalAddress6 {

  @JsonProperty("AddressType")
  private OBAddressTypeCode addressType;

  @JsonProperty("Department")
  private String department;

  @JsonProperty("SubDepartment")
  private String subDepartment;

  @JsonProperty("StreetName")
  private String streetName;

  @JsonProperty("BuildingNumber")
  private String buildingNumber;

  @JsonProperty("PostCode")
  private String postCode;

  @JsonProperty("TownName")
  private String townName;

  @JsonProperty("CountrySubDivision")
  private String countrySubDivision;

  @JsonProperty("Country")
  private String country;

  @JsonProperty("AddressLine")
  
  private List<String> addressLine = null;

  public OBPostalAddress6 addressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
  */
  
  @Schema(name = "AddressType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OBAddressTypeCode getAddressType() {
    return addressType;
  }

  public void setAddressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
  }

  public OBPostalAddress6 department(String department) {
    this.department = department;
    return this;
  }

  /**
   * Identification of a division of a large organisation or building.
   * @return department
  */
  
  @Schema(name = "Department", description = "Identification of a division of a large organisation or building.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public OBPostalAddress6 subDepartment(String subDepartment) {
    this.subDepartment = subDepartment;
    return this;
  }

  /**
   * Identification of a sub-division of a large organisation or building.
   * @return subDepartment
  */
  
  @Schema(name = "SubDepartment", description = "Identification of a sub-division of a large organisation or building.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSubDepartment() {
    return subDepartment;
  }

  public void setSubDepartment(String subDepartment) {
    this.subDepartment = subDepartment;
  }

  public OBPostalAddress6 streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of a street or thoroughfare.
   * @return streetName
  */
  
  @Schema(name = "StreetName", description = "Name of a street or thoroughfare.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public OBPostalAddress6 buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Number that identifies the position of a building on a street.
   * @return buildingNumber
  */
  
  @Schema(name = "BuildingNumber", description = "Number that identifies the position of a building on a street.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public OBPostalAddress6 postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
   * @return postCode
  */
  
  @Schema(name = "PostCode", description = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OBPostalAddress6 townName(String townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Name of a built-up area, with defined boundaries, and a local government.
   * @return townName
  */
  
  @Schema(name = "TownName", description = "Name of a built-up area, with defined boundaries, and a local government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public OBPostalAddress6 countrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  /**
   * Identifies a subdivision of a country such as state, region, county.
   * @return countrySubDivision
  */
  
  @Schema(name = "CountrySubDivision", description = "Identifies a subdivision of a country such as state, region, county.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBPostalAddress6 country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Nation with its own government.
   * @return country
  */
  
  @Schema(name = "Country", description = "Nation with its own government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OBPostalAddress6 addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public OBPostalAddress6 addAddressLineItem(String addressLineItem) {
    if (this.addressLine == null) {
      this.addressLine = new ArrayList<>();
    }
    this.addressLine.add(addressLineItem);
    return this;
  }

  /**
   * Get addressLine
   * @return addressLine
  */
  
  @Schema(name = "AddressLine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPostalAddress6 obPostalAddress6 = (OBPostalAddress6) o;
    return Objects.equals(this.addressType, obPostalAddress6.addressType) &&
        Objects.equals(this.department, obPostalAddress6.department) &&
        Objects.equals(this.subDepartment, obPostalAddress6.subDepartment) &&
        Objects.equals(this.streetName, obPostalAddress6.streetName) &&
        Objects.equals(this.buildingNumber, obPostalAddress6.buildingNumber) &&
        Objects.equals(this.postCode, obPostalAddress6.postCode) &&
        Objects.equals(this.townName, obPostalAddress6.townName) &&
        Objects.equals(this.countrySubDivision, obPostalAddress6.countrySubDivision) &&
        Objects.equals(this.country, obPostalAddress6.country) &&
        Objects.equals(this.addressLine, obPostalAddress6.addressLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, department, subDepartment, streetName, buildingNumber, postCode, townName, countrySubDivision, country, addressLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPostalAddress6 {\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    subDepartment: ").append(toIndentedString(subDepartment)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
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

