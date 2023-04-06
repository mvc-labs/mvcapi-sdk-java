/*
 * MetaSV for MVC API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 3.0.5
 * Contact: heqiming@metasv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.metasv.mvc.client.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Contract fungible token balance
 */
@ApiModel(description = "Contract fungible token balance")
@JsonPropertyOrder({
  ContractFtBalance.JSON_PROPERTY_CODE_HASH,
  ContractFtBalance.JSON_PROPERTY_GENESIS,
  ContractFtBalance.JSON_PROPERTY_NAME,
  ContractFtBalance.JSON_PROPERTY_SYMBOL,
  ContractFtBalance.JSON_PROPERTY_DECIMAL,
  ContractFtBalance.JSON_PROPERTY_SENSIBLE_ID,
  ContractFtBalance.JSON_PROPERTY_UTXO_COUNT,
  ContractFtBalance.JSON_PROPERTY_CONFIRMED,
  ContractFtBalance.JSON_PROPERTY_CONFIRMED_STRING,
  ContractFtBalance.JSON_PROPERTY_UNCONFIRMED,
  ContractFtBalance.JSON_PROPERTY_UNCONFIRMED_STRING
})
@JsonTypeName("ContractFtBalance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T11:49:07.594678+09:00[Asia/Tokyo]")
public class ContractFtBalance {
  public static final String JSON_PROPERTY_CODE_HASH = "codeHash";
  private String codeHash;

  public static final String JSON_PROPERTY_GENESIS = "genesis";
  private String genesis;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_DECIMAL = "decimal";
  private Integer decimal;

  public static final String JSON_PROPERTY_SENSIBLE_ID = "sensibleId";
  private String sensibleId;

  public static final String JSON_PROPERTY_UTXO_COUNT = "utxoCount";
  private Integer utxoCount;

  public static final String JSON_PROPERTY_CONFIRMED = "confirmed";
  private Long confirmed;

  public static final String JSON_PROPERTY_CONFIRMED_STRING = "confirmedString";
  private String confirmedString;

  public static final String JSON_PROPERTY_UNCONFIRMED = "unconfirmed";
  private Long unconfirmed;

  public static final String JSON_PROPERTY_UNCONFIRMED_STRING = "unconfirmedString";
  private String unconfirmedString;


  public ContractFtBalance codeHash(String codeHash) {
    
    this.codeHash = codeHash;
    return this;
  }

   /**
   * Codehash of the token.
   * @return codeHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Codehash of the token.")
  @JsonProperty(JSON_PROPERTY_CODE_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCodeHash() {
    return codeHash;
  }


  public void setCodeHash(String codeHash) {
    this.codeHash = codeHash;
  }


  public ContractFtBalance genesis(String genesis) {
    
    this.genesis = genesis;
    return this;
  }

   /**
   * Genesis of the token.
   * @return genesis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Genesis of the token.")
  @JsonProperty(JSON_PROPERTY_GENESIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGenesis() {
    return genesis;
  }


  public void setGenesis(String genesis) {
    this.genesis = genesis;
  }


  public ContractFtBalance name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the token.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the token.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ContractFtBalance symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol of the token.
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Symbol of the token.")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public ContractFtBalance decimal(Integer decimal) {
    
    this.decimal = decimal;
    return this;
  }

   /**
   * The decimal position.
   * @return decimal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The decimal position.")
  @JsonProperty(JSON_PROPERTY_DECIMAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDecimal() {
    return decimal;
  }


  public void setDecimal(Integer decimal) {
    this.decimal = decimal;
  }


  public ContractFtBalance sensibleId(String sensibleId) {
    
    this.sensibleId = sensibleId;
    return this;
  }

   /**
   * SensibleId of the token
   * @return sensibleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SensibleId of the token")
  @JsonProperty(JSON_PROPERTY_SENSIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSensibleId() {
    return sensibleId;
  }


  public void setSensibleId(String sensibleId) {
    this.sensibleId = sensibleId;
  }


  public ContractFtBalance utxoCount(Integer utxoCount) {
    
    this.utxoCount = utxoCount;
    return this;
  }

   /**
   * Number of utxos for this token.
   * @return utxoCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of utxos for this token.")
  @JsonProperty(JSON_PROPERTY_UTXO_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUtxoCount() {
    return utxoCount;
  }


  public void setUtxoCount(Integer utxoCount) {
    this.utxoCount = utxoCount;
  }


  public ContractFtBalance confirmed(Long confirmed) {
    
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Confirmed balance of the token.
   * @return confirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Confirmed balance of the token.")
  @JsonProperty(JSON_PROPERTY_CONFIRMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConfirmed() {
    return confirmed;
  }


  public void setConfirmed(Long confirmed) {
    this.confirmed = confirmed;
  }


  public ContractFtBalance confirmedString(String confirmedString) {
    
    this.confirmedString = confirmedString;
    return this;
  }

   /**
   * Confirmed balance of the token(In string format).
   * @return confirmedString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Confirmed balance of the token(In string format).")
  @JsonProperty(JSON_PROPERTY_CONFIRMED_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConfirmedString() {
    return confirmedString;
  }


  public void setConfirmedString(String confirmedString) {
    this.confirmedString = confirmedString;
  }


  public ContractFtBalance unconfirmed(Long unconfirmed) {
    
    this.unconfirmed = unconfirmed;
    return this;
  }

   /**
   * Unconfirmed balance of the token.
   * @return unconfirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unconfirmed balance of the token.")
  @JsonProperty(JSON_PROPERTY_UNCONFIRMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUnconfirmed() {
    return unconfirmed;
  }


  public void setUnconfirmed(Long unconfirmed) {
    this.unconfirmed = unconfirmed;
  }


  public ContractFtBalance unconfirmedString(String unconfirmedString) {
    
    this.unconfirmedString = unconfirmedString;
    return this;
  }

   /**
   * Unconfirmed balance of the token(In string format).
   * @return unconfirmedString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unconfirmed balance of the token(In string format).")
  @JsonProperty(JSON_PROPERTY_UNCONFIRMED_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnconfirmedString() {
    return unconfirmedString;
  }


  public void setUnconfirmedString(String unconfirmedString) {
    this.unconfirmedString = unconfirmedString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractFtBalance contractFtBalance = (ContractFtBalance) o;
    return Objects.equals(this.codeHash, contractFtBalance.codeHash) &&
        Objects.equals(this.genesis, contractFtBalance.genesis) &&
        Objects.equals(this.name, contractFtBalance.name) &&
        Objects.equals(this.symbol, contractFtBalance.symbol) &&
        Objects.equals(this.decimal, contractFtBalance.decimal) &&
        Objects.equals(this.sensibleId, contractFtBalance.sensibleId) &&
        Objects.equals(this.utxoCount, contractFtBalance.utxoCount) &&
        Objects.equals(this.confirmed, contractFtBalance.confirmed) &&
        Objects.equals(this.confirmedString, contractFtBalance.confirmedString) &&
        Objects.equals(this.unconfirmed, contractFtBalance.unconfirmed) &&
        Objects.equals(this.unconfirmedString, contractFtBalance.unconfirmedString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeHash, genesis, name, symbol, decimal, sensibleId, utxoCount, confirmed, confirmedString, unconfirmed, unconfirmedString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractFtBalance {\n");
    sb.append("    codeHash: ").append(toIndentedString(codeHash)).append("\n");
    sb.append("    genesis: ").append(toIndentedString(genesis)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    decimal: ").append(toIndentedString(decimal)).append("\n");
    sb.append("    sensibleId: ").append(toIndentedString(sensibleId)).append("\n");
    sb.append("    utxoCount: ").append(toIndentedString(utxoCount)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    confirmedString: ").append(toIndentedString(confirmedString)).append("\n");
    sb.append("    unconfirmed: ").append(toIndentedString(unconfirmed)).append("\n");
    sb.append("    unconfirmedString: ").append(toIndentedString(unconfirmedString)).append("\n");
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

