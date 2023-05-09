/*
 * MicrovisionChain API Document
 * API definition for MicrovisionChain provided apis
 *
 * The version of the OpenAPI document: 3.0.8
 * Contact: heqiming@mvcapi.com
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
 * Detailed block header info.
 */
@ApiModel(description = "Detailed block header info.")
@JsonPropertyOrder({
  BlockHeaderIndex.JSON_PROPERTY_BLOCK_HASH,
  BlockHeaderIndex.JSON_PROPERTY_HEIGHT,
  BlockHeaderIndex.JSON_PROPERTY_VERSION,
  BlockHeaderIndex.JSON_PROPERTY_PREV_BLOCK_HASH,
  BlockHeaderIndex.JSON_PROPERTY_MERKLE_ROOT,
  BlockHeaderIndex.JSON_PROPERTY_TIMESTAMP,
  BlockHeaderIndex.JSON_PROPERTY_MEDIAN_TIME,
  BlockHeaderIndex.JSON_PROPERTY_REWARD,
  BlockHeaderIndex.JSON_PROPERTY_MINER,
  BlockHeaderIndex.JSON_PROPERTY_MINER_ADDRESS,
  BlockHeaderIndex.JSON_PROPERTY_TX_COUNT,
  BlockHeaderIndex.JSON_PROPERTY_INPUT_COUNT,
  BlockHeaderIndex.JSON_PROPERTY_OUTPUT_COUNT,
  BlockHeaderIndex.JSON_PROPERTY_SIZE,
  BlockHeaderIndex.JSON_PROPERTY_BITS,
  BlockHeaderIndex.JSON_PROPERTY_NONCE,
  BlockHeaderIndex.JSON_PROPERTY_COINBASE
})
@JsonTypeName("BlockHeaderIndex")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T18:29:18.056213+09:00[Asia/Tokyo]")
public class BlockHeaderIndex {
  public static final String JSON_PROPERTY_BLOCK_HASH = "blockHash";
  private String blockHash;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public static final String JSON_PROPERTY_PREV_BLOCK_HASH = "prevBlockHash";
  private String prevBlockHash;

  public static final String JSON_PROPERTY_MERKLE_ROOT = "merkleRoot";
  private String merkleRoot;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_MEDIAN_TIME = "medianTime";
  private Long medianTime;

  public static final String JSON_PROPERTY_REWARD = "reward";
  private Long reward;

  public static final String JSON_PROPERTY_MINER = "miner";
  private String miner;

  public static final String JSON_PROPERTY_MINER_ADDRESS = "minerAddress";
  private String minerAddress;

  public static final String JSON_PROPERTY_TX_COUNT = "txCount";
  private Integer txCount;

  public static final String JSON_PROPERTY_INPUT_COUNT = "inputCount";
  private Integer inputCount;

  public static final String JSON_PROPERTY_OUTPUT_COUNT = "outputCount";
  private Integer outputCount;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_BITS = "bits";
  private Long bits;

  public static final String JSON_PROPERTY_NONCE = "nonce";
  private Long nonce;

  public static final String JSON_PROPERTY_COINBASE = "coinbase";
  private String coinbase;


  public BlockHeaderIndex blockHash(String blockHash) {
    
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


  public BlockHeaderIndex height(Long height) {
    
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


  public BlockHeaderIndex version(Long version) {
    
    this.version = version;
    return this;
  }

   /**
   * Block version.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block version.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getVersion() {
    return version;
  }


  public void setVersion(Long version) {
    this.version = version;
  }


  public BlockHeaderIndex prevBlockHash(String prevBlockHash) {
    
    this.prevBlockHash = prevBlockHash;
    return this;
  }

   /**
   * The block hash of the previous block.
   * @return prevBlockHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The block hash of the previous block.")
  @JsonProperty(JSON_PROPERTY_PREV_BLOCK_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrevBlockHash() {
    return prevBlockHash;
  }


  public void setPrevBlockHash(String prevBlockHash) {
    this.prevBlockHash = prevBlockHash;
  }


  public BlockHeaderIndex merkleRoot(String merkleRoot) {
    
    this.merkleRoot = merkleRoot;
    return this;
  }

   /**
   * Hex formatted block merkle root.
   * @return merkleRoot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hex formatted block merkle root.")
  @JsonProperty(JSON_PROPERTY_MERKLE_ROOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerkleRoot() {
    return merkleRoot;
  }


  public void setMerkleRoot(String merkleRoot) {
    this.merkleRoot = merkleRoot;
  }


  public BlockHeaderIndex timestamp(Long timestamp) {
    
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


  public BlockHeaderIndex medianTime(Long medianTime) {
    
    this.medianTime = medianTime;
    return this;
  }

   /**
   * Block median timestamp.
   * @return medianTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block median timestamp.")
  @JsonProperty(JSON_PROPERTY_MEDIAN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMedianTime() {
    return medianTime;
  }


  public void setMedianTime(Long medianTime) {
    this.medianTime = medianTime;
  }


  public BlockHeaderIndex reward(Long reward) {
    
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


  public BlockHeaderIndex miner(String miner) {
    
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


  public BlockHeaderIndex minerAddress(String minerAddress) {
    
    this.minerAddress = minerAddress;
    return this;
  }

   /**
   * Miner address that received rewards.
   * @return minerAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Miner address that received rewards.")
  @JsonProperty(JSON_PROPERTY_MINER_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMinerAddress() {
    return minerAddress;
  }


  public void setMinerAddress(String minerAddress) {
    this.minerAddress = minerAddress;
  }


  public BlockHeaderIndex txCount(Integer txCount) {
    
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


  public BlockHeaderIndex inputCount(Integer inputCount) {
    
    this.inputCount = inputCount;
    return this;
  }

   /**
   * Total input count in the block.
   * @return inputCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total input count in the block.")
  @JsonProperty(JSON_PROPERTY_INPUT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInputCount() {
    return inputCount;
  }


  public void setInputCount(Integer inputCount) {
    this.inputCount = inputCount;
  }


  public BlockHeaderIndex outputCount(Integer outputCount) {
    
    this.outputCount = outputCount;
    return this;
  }

   /**
   * Total output count in the block
   * @return outputCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total output count in the block")
  @JsonProperty(JSON_PROPERTY_OUTPUT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOutputCount() {
    return outputCount;
  }


  public void setOutputCount(Integer outputCount) {
    this.outputCount = outputCount;
  }


  public BlockHeaderIndex size(Long size) {
    
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


  public BlockHeaderIndex bits(Long bits) {
    
    this.bits = bits;
    return this;
  }

   /**
   * Target bits.
   * @return bits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target bits.")
  @JsonProperty(JSON_PROPERTY_BITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBits() {
    return bits;
  }


  public void setBits(Long bits) {
    this.bits = bits;
  }


  public BlockHeaderIndex nonce(Long nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Block nonce
   * @return nonce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block nonce")
  @JsonProperty(JSON_PROPERTY_NONCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNonce() {
    return nonce;
  }


  public void setNonce(Long nonce) {
    this.nonce = nonce;
  }


  public BlockHeaderIndex coinbase(String coinbase) {
    
    this.coinbase = coinbase;
    return this;
  }

   /**
   * Hex formated coinbase info.
   * @return coinbase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hex formated coinbase info.")
  @JsonProperty(JSON_PROPERTY_COINBASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoinbase() {
    return coinbase;
  }


  public void setCoinbase(String coinbase) {
    this.coinbase = coinbase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockHeaderIndex blockHeaderIndex = (BlockHeaderIndex) o;
    return Objects.equals(this.blockHash, blockHeaderIndex.blockHash) &&
        Objects.equals(this.height, blockHeaderIndex.height) &&
        Objects.equals(this.version, blockHeaderIndex.version) &&
        Objects.equals(this.prevBlockHash, blockHeaderIndex.prevBlockHash) &&
        Objects.equals(this.merkleRoot, blockHeaderIndex.merkleRoot) &&
        Objects.equals(this.timestamp, blockHeaderIndex.timestamp) &&
        Objects.equals(this.medianTime, blockHeaderIndex.medianTime) &&
        Objects.equals(this.reward, blockHeaderIndex.reward) &&
        Objects.equals(this.miner, blockHeaderIndex.miner) &&
        Objects.equals(this.minerAddress, blockHeaderIndex.minerAddress) &&
        Objects.equals(this.txCount, blockHeaderIndex.txCount) &&
        Objects.equals(this.inputCount, blockHeaderIndex.inputCount) &&
        Objects.equals(this.outputCount, blockHeaderIndex.outputCount) &&
        Objects.equals(this.size, blockHeaderIndex.size) &&
        Objects.equals(this.bits, blockHeaderIndex.bits) &&
        Objects.equals(this.nonce, blockHeaderIndex.nonce) &&
        Objects.equals(this.coinbase, blockHeaderIndex.coinbase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockHash, height, version, prevBlockHash, merkleRoot, timestamp, medianTime, reward, miner, minerAddress, txCount, inputCount, outputCount, size, bits, nonce, coinbase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockHeaderIndex {\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    prevBlockHash: ").append(toIndentedString(prevBlockHash)).append("\n");
    sb.append("    merkleRoot: ").append(toIndentedString(merkleRoot)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    medianTime: ").append(toIndentedString(medianTime)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    miner: ").append(toIndentedString(miner)).append("\n");
    sb.append("    minerAddress: ").append(toIndentedString(minerAddress)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
    sb.append("    inputCount: ").append(toIndentedString(inputCount)).append("\n");
    sb.append("    outputCount: ").append(toIndentedString(outputCount)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    bits: ").append(toIndentedString(bits)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    coinbase: ").append(toIndentedString(coinbase)).append("\n");
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

