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
 * Transaction history of the address for specific ft.
 */
@ApiModel(description = "Transaction history of the address for specific ft.")
@JsonPropertyOrder({
  ContractFtAddressTx.JSON_PROPERTY_FLAG,
  ContractFtAddressTx.JSON_PROPERTY_ADDRESS,
  ContractFtAddressTx.JSON_PROPERTY_CODE_HASH,
  ContractFtAddressTx.JSON_PROPERTY_GENESIS,
  ContractFtAddressTx.JSON_PROPERTY_TIME,
  ContractFtAddressTx.JSON_PROPERTY_HEIGHT,
  ContractFtAddressTx.JSON_PROPERTY_INCOME,
  ContractFtAddressTx.JSON_PROPERTY_OUTCOME,
  ContractFtAddressTx.JSON_PROPERTY_TXID
})
@JsonTypeName("ContractFtAddressTx")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T11:49:07.594678+09:00[Asia/Tokyo]")
public class ContractFtAddressTx {
  public static final String JSON_PROPERTY_FLAG = "flag";
  private String flag;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_CODE_HASH = "codeHash";
  private String codeHash;

  public static final String JSON_PROPERTY_GENESIS = "genesis";
  private String genesis;

  public static final String JSON_PROPERTY_TIME = "time";
  private Long time;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_INCOME = "income";
  private Long income;

  public static final String JSON_PROPERTY_OUTCOME = "outcome";
  private Long outcome;

  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;


  public ContractFtAddressTx flag(String flag) {
    
    this.flag = flag;
    return this;
  }

   /**
   * Paging flag
   * @return flag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Paging flag")
  @JsonProperty(JSON_PROPERTY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFlag() {
    return flag;
  }


  public void setFlag(String flag) {
    this.flag = flag;
  }


  public ContractFtAddressTx address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The address of the record
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The address of the record")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ContractFtAddressTx codeHash(String codeHash) {
    
    this.codeHash = codeHash;
    return this;
  }

   /**
   * Specific codeHash
   * @return codeHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specific codeHash")
  @JsonProperty(JSON_PROPERTY_CODE_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCodeHash() {
    return codeHash;
  }


  public void setCodeHash(String codeHash) {
    this.codeHash = codeHash;
  }


  public ContractFtAddressTx genesis(String genesis) {
    
    this.genesis = genesis;
    return this;
  }

   /**
   * specific genesis
   * @return genesis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "specific genesis")
  @JsonProperty(JSON_PROPERTY_GENESIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGenesis() {
    return genesis;
  }


  public void setGenesis(String genesis) {
    this.genesis = genesis;
  }


  public ContractFtAddressTx time(Long time) {
    
    this.time = time;
    return this;
  }

   /**
   * timestamp of the tx
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "timestamp of the tx")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTime() {
    return time;
  }


  public void setTime(Long time) {
    this.time = time;
  }


  public ContractFtAddressTx height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * Block Height of the tx, -1 if not confirmed
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block Height of the tx, -1 if not confirmed")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public ContractFtAddressTx income(Long income) {
    
    this.income = income;
    return this;
  }

   /**
   * total income of the address from this tx
   * @return income
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "total income of the address from this tx")
  @JsonProperty(JSON_PROPERTY_INCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIncome() {
    return income;
  }


  public void setIncome(Long income) {
    this.income = income;
  }


  public ContractFtAddressTx outcome(Long outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * total outcome of the address from this tx
   * @return outcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "total outcome of the address from this tx")
  @JsonProperty(JSON_PROPERTY_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOutcome() {
    return outcome;
  }


  public void setOutcome(Long outcome) {
    this.outcome = outcome;
  }


  public ContractFtAddressTx txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * txid of this record
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "txid of this record")
  @JsonProperty(JSON_PROPERTY_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractFtAddressTx contractFtAddressTx = (ContractFtAddressTx) o;
    return Objects.equals(this.flag, contractFtAddressTx.flag) &&
        Objects.equals(this.address, contractFtAddressTx.address) &&
        Objects.equals(this.codeHash, contractFtAddressTx.codeHash) &&
        Objects.equals(this.genesis, contractFtAddressTx.genesis) &&
        Objects.equals(this.time, contractFtAddressTx.time) &&
        Objects.equals(this.height, contractFtAddressTx.height) &&
        Objects.equals(this.income, contractFtAddressTx.income) &&
        Objects.equals(this.outcome, contractFtAddressTx.outcome) &&
        Objects.equals(this.txid, contractFtAddressTx.txid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag, address, codeHash, genesis, time, height, income, outcome, txid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractFtAddressTx {\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    codeHash: ").append(toIndentedString(codeHash)).append("\n");
    sb.append("    genesis: ").append(toIndentedString(genesis)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
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

