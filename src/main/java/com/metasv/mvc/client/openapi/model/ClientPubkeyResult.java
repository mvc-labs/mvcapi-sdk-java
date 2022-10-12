/*
 * MetaSV API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: heqiming@metasv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.metasv.mvc.client.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Client public key result
 */
@ApiModel(description = "Client public key result")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-12T19:14:49.325014+09:00[Asia/Tokyo]")
public class ClientPubkeyResult {
  public static final String SERIALIZED_NAME_PUBKEY = "pubkey";
  @SerializedName(SERIALIZED_NAME_PUBKEY)
  private String pubkey;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;


  public ClientPubkeyResult pubkey(String pubkey) {
    
    this.pubkey = pubkey;
    return this;
  }

   /**
   * return pubkey if created successfully
   * @return pubkey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "return pubkey if created successfully")

  public String getPubkey() {
    return pubkey;
  }


  public void setPubkey(String pubkey) {
    this.pubkey = pubkey;
  }


  public ClientPubkeyResult message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * return messages if broadcast failed
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "return messages if broadcast failed")

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
    ClientPubkeyResult clientPubkeyResult = (ClientPubkeyResult) o;
    return Objects.equals(this.pubkey, clientPubkeyResult.pubkey) &&
        Objects.equals(this.message, clientPubkeyResult.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pubkey, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientPubkeyResult {\n");
    sb.append("    pubkey: ").append(toIndentedString(pubkey)).append("\n");
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
