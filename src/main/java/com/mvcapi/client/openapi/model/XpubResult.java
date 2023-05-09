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
 * XpubRegister result
 */
@ApiModel(description = "XpubRegister result")
@JsonPropertyOrder({
  XpubResult.JSON_PROPERTY_XPUB,
  XpubResult.JSON_PROPERTY_MESSAGE
})
@JsonTypeName("XpubResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T18:29:18.056213+09:00[Asia/Tokyo]")
public class XpubResult {
  public static final String JSON_PROPERTY_XPUB = "xpub";
  private String xpub;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;


  public XpubResult xpub(String xpub) {
    
    this.xpub = xpub;
    return this;
  }

   /**
   * return xpub if broadcast success
   * @return xpub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "return xpub if broadcast success")
  @JsonProperty(JSON_PROPERTY_XPUB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getXpub() {
    return xpub;
  }


  public void setXpub(String xpub) {
    this.xpub = xpub;
  }


  public XpubResult message(String message) {
    
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
    XpubResult xpubResult = (XpubResult) o;
    return Objects.equals(this.xpub, xpubResult.xpub) &&
        Objects.equals(this.message, xpubResult.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xpub, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpubResult {\n");
    sb.append("    xpub: ").append(toIndentedString(xpub)).append("\n");
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

