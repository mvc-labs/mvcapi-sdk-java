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
 * Raw hex formatted Tx returned.
 */
@ApiModel(description = "Raw hex formatted Tx returned.")
@JsonPropertyOrder({
  TxRaw.JSON_PROPERTY_HEX
})
@JsonTypeName("TxRaw")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T18:29:18.056213+09:00[Asia/Tokyo]")
public class TxRaw {
  public static final String JSON_PROPERTY_HEX = "hex";
  private String hex;


  public TxRaw hex(String hex) {
    
    this.hex = hex;
    return this;
  }

   /**
   * hex formatted raw tx.
   * @return hex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "hex formatted raw tx.")
  @JsonProperty(JSON_PROPERTY_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHex() {
    return hex;
  }


  public void setHex(String hex) {
    this.hex = hex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxRaw txRaw = (TxRaw) o;
    return Objects.equals(this.hex, txRaw.hex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxRaw {\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
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

