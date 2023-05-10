/*
 * MicrovisionChain API Document
 * API definition for MicrovisionChain provided apis
 *
 * The version of the OpenAPI document: 3.0.9
 * Contact: heqiming@metasv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mvcapi.client.openapi.model;

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
 * Get summary(count group by address) for specific genesis.
 */
@ApiModel(description = "Get summary(count group by address) for specific genesis.")
@JsonPropertyOrder({
  ContractNftGenesisSummary.JSON_PROPERTY_ADDRESS,
  ContractNftGenesisSummary.JSON_PROPERTY_SENSIBLE_ID,
  ContractNftGenesisSummary.JSON_PROPERTY_META_TXID,
  ContractNftGenesisSummary.JSON_PROPERTY_META_OUTPUT_INDEX,
  ContractNftGenesisSummary.JSON_PROPERTY_TOKEN_SUPPLY,
  ContractNftGenesisSummary.JSON_PROPERTY_COUNT
})
@JsonTypeName("ContractNftGenesisSummary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-10T16:23:17.579988+09:00[Asia/Tokyo]")
public class ContractNftGenesisSummary {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_SENSIBLE_ID = "sensibleId";
  private String sensibleId;

  public static final String JSON_PROPERTY_META_TXID = "metaTxid";
  private String metaTxid;

  public static final String JSON_PROPERTY_META_OUTPUT_INDEX = "metaOutputIndex";
  private Integer metaOutputIndex;

  public static final String JSON_PROPERTY_TOKEN_SUPPLY = "tokenSupply";
  private Long tokenSupply;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;


  public ContractNftGenesisSummary address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Owner address.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Owner address.")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ContractNftGenesisSummary sensibleId(String sensibleId) {
    
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


  public ContractNftGenesisSummary metaTxid(String metaTxid) {
    
    this.metaTxid = metaTxid;
    return this;
  }

   /**
   * The metanet tx describing the nft.
   * @return metaTxid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The metanet tx describing the nft.")
  @JsonProperty(JSON_PROPERTY_META_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetaTxid() {
    return metaTxid;
  }


  public void setMetaTxid(String metaTxid) {
    this.metaTxid = metaTxid;
  }


  public ContractNftGenesisSummary metaOutputIndex(Integer metaOutputIndex) {
    
    this.metaOutputIndex = metaOutputIndex;
    return this;
  }

   /**
   * Symbol of the token.
   * @return metaOutputIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Symbol of the token.")
  @JsonProperty(JSON_PROPERTY_META_OUTPUT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMetaOutputIndex() {
    return metaOutputIndex;
  }


  public void setMetaOutputIndex(Integer metaOutputIndex) {
    this.metaOutputIndex = metaOutputIndex;
  }


  public ContractNftGenesisSummary tokenSupply(Long tokenSupply) {
    
    this.tokenSupply = tokenSupply;
    return this;
  }

   /**
   * The total supply of this NFT.
   * @return tokenSupply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total supply of this NFT.")
  @JsonProperty(JSON_PROPERTY_TOKEN_SUPPLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTokenSupply() {
    return tokenSupply;
  }


  public void setTokenSupply(Long tokenSupply) {
    this.tokenSupply = tokenSupply;
  }


  public ContractNftGenesisSummary count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The count of this nft that the address owns.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of this nft that the address owns.")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractNftGenesisSummary contractNftGenesisSummary = (ContractNftGenesisSummary) o;
    return Objects.equals(this.address, contractNftGenesisSummary.address) &&
        Objects.equals(this.sensibleId, contractNftGenesisSummary.sensibleId) &&
        Objects.equals(this.metaTxid, contractNftGenesisSummary.metaTxid) &&
        Objects.equals(this.metaOutputIndex, contractNftGenesisSummary.metaOutputIndex) &&
        Objects.equals(this.tokenSupply, contractNftGenesisSummary.tokenSupply) &&
        Objects.equals(this.count, contractNftGenesisSummary.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, sensibleId, metaTxid, metaOutputIndex, tokenSupply, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractNftGenesisSummary {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    sensibleId: ").append(toIndentedString(sensibleId)).append("\n");
    sb.append("    metaTxid: ").append(toIndentedString(metaTxid)).append("\n");
    sb.append("    metaOutputIndex: ").append(toIndentedString(metaOutputIndex)).append("\n");
    sb.append("    tokenSupply: ").append(toIndentedString(tokenSupply)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

