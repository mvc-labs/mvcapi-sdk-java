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
 * Broadcast result
 */
@ApiModel(description = "Broadcast result")
@JsonPropertyOrder({
  AsyncBroadcastResult.JSON_PROPERTY_TXID,
  AsyncBroadcastResult.JSON_PROPERTY_STATE,
  AsyncBroadcastResult.JSON_PROPERTY_MESSAGE
})
@JsonTypeName("AsyncBroadcastResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-14T23:34:31.785376+09:00[Asia/Tokyo]")
public class AsyncBroadcastResult {
  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;


  public AsyncBroadcastResult txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * the txid of this tx
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the txid of this tx")
  @JsonProperty(JSON_PROPERTY_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public AsyncBroadcastResult state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * the state of this tx, possible values PENDING, BROADCASTED, INVALID, UNKNOWN
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the state of this tx, possible values PENDING, BROADCASTED, INVALID, UNKNOWN")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public AsyncBroadcastResult message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * return messages if broadcast failed
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "return messages if broadcast failed")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncBroadcastResult asyncBroadcastResult = (AsyncBroadcastResult) o;
    return Objects.equals(this.txid, asyncBroadcastResult.txid) &&
        Objects.equals(this.state, asyncBroadcastResult.state) &&
        Objects.equals(this.message, asyncBroadcastResult.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txid, state, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncBroadcastResult {\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

