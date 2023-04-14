/*
 * MVC API Spec
 * API definition for MicrovisionChain provided apis
 *
 * The version of the OpenAPI document: 3.0.6
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
 * block header saved by partition page
 */
@ApiModel(description = "block header saved by partition page")
@JsonPropertyOrder({
  BlockHeaderPage.JSON_PROPERTY_HEIGHT,
  BlockHeaderPage.JSON_PROPERTY_BLOCK_HASH,
  BlockHeaderPage.JSON_PROPERTY_TIMESTAMP,
  BlockHeaderPage.JSON_PROPERTY_MEDIAN_TIME,
  BlockHeaderPage.JSON_PROPERTY_REWARD,
  BlockHeaderPage.JSON_PROPERTY_MINER,
  BlockHeaderPage.JSON_PROPERTY_TX_COUNT,
  BlockHeaderPage.JSON_PROPERTY_SIZE
})
@JsonTypeName("BlockHeaderPage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-14T23:34:31.785376+09:00[Asia/Tokyo]")
public class BlockHeaderPage {
  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_BLOCK_HASH = "blockHash";
  private String blockHash;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_MEDIAN_TIME = "medianTime";
  private Long medianTime;

  public static final String JSON_PROPERTY_REWARD = "reward";
  private Long reward;

  public static final String JSON_PROPERTY_MINER = "miner";
  private String miner;

  public static final String JSON_PROPERTY_TX_COUNT = "txCount";
  private Integer txCount;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;


  public BlockHeaderPage height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * Block height.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block height.")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public BlockHeaderPage blockHash(String blockHash) {
    
    this.blockHash = blockHash;
    return this;
  }

   /**
   * Block hash.
   * @return blockHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block hash.")
  @JsonProperty(JSON_PROPERTY_BLOCK_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBlockHash() {
    return blockHash;
  }


  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }


  public BlockHeaderPage timestamp(Long timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Block timestamp.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block timestamp.")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  public BlockHeaderPage medianTime(Long medianTime) {
    
    this.medianTime = medianTime;
    return this;
  }

   /**
   * current median time
   * @return medianTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current median time")
  @JsonProperty(JSON_PROPERTY_MEDIAN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMedianTime() {
    return medianTime;
  }


  public void setMedianTime(Long medianTime) {
    this.medianTime = medianTime;
  }


  public BlockHeaderPage reward(Long reward) {
    
    this.reward = reward;
    return this;
  }

   /**
   * Miner total rewards, including miner fee.
   * @return reward
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Miner total rewards, including miner fee.")
  @JsonProperty(JSON_PROPERTY_REWARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReward() {
    return reward;
  }


  public void setReward(Long reward) {
    this.reward = reward;
  }


  public BlockHeaderPage miner(String miner) {
    
    this.miner = miner;
    return this;
  }

   /**
   * Guessed miner name.
   * @return miner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Guessed miner name.")
  @JsonProperty(JSON_PROPERTY_MINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMiner() {
    return miner;
  }


  public void setMiner(String miner) {
    this.miner = miner;
  }


  public BlockHeaderPage txCount(Integer txCount) {
    
    this.txCount = txCount;
    return this;
  }

   /**
   * Total txs count included in the block.
   * @return txCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total txs count included in the block.")
  @JsonProperty(JSON_PROPERTY_TX_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTxCount() {
    return txCount;
  }


  public void setTxCount(Integer txCount) {
    this.txCount = txCount;
  }


  public BlockHeaderPage size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Size of the block
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the block")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockHeaderPage blockHeaderPage = (BlockHeaderPage) o;
    return Objects.equals(this.height, blockHeaderPage.height) &&
        Objects.equals(this.blockHash, blockHeaderPage.blockHash) &&
        Objects.equals(this.timestamp, blockHeaderPage.timestamp) &&
        Objects.equals(this.medianTime, blockHeaderPage.medianTime) &&
        Objects.equals(this.reward, blockHeaderPage.reward) &&
        Objects.equals(this.miner, blockHeaderPage.miner) &&
        Objects.equals(this.txCount, blockHeaderPage.txCount) &&
        Objects.equals(this.size, blockHeaderPage.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, blockHash, timestamp, medianTime, reward, miner, txCount, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockHeaderPage {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    medianTime: ").append(toIndentedString(medianTime)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    miner: ").append(toIndentedString(miner)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

