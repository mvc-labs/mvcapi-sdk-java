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
 * Address detail in the wallet
 */
@ApiModel(description = "Address detail in the wallet")
@JsonPropertyOrder({
  XpubAddress.JSON_PROPERTY_XPUB,
  XpubAddress.JSON_PROPERTY_ADDRESS,
  XpubAddress.JSON_PROPERTY_ADDRESS_TYPE,
  XpubAddress.JSON_PROPERTY_ADDRESS_INDEX
})
@JsonTypeName("XpubAddress")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-14T23:34:31.785376+09:00[Asia/Tokyo]")
public class XpubAddress {
  public static final String JSON_PROPERTY_XPUB = "xpub";
  private String xpub;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_ADDRESS_TYPE = "addressType";
  private Integer addressType;

  public static final String JSON_PROPERTY_ADDRESS_INDEX = "addressIndex";
  private Integer addressIndex;


  public XpubAddress xpub(String xpub) {
    
    this.xpub = xpub;
    return this;
  }

   /**
   * xpub in the query
   * @return xpub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "xpub in the query")
  @JsonProperty(JSON_PROPERTY_XPUB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getXpub() {
    return xpub;
  }


  public void setXpub(String xpub) {
    this.xpub = xpub;
  }


  public XpubAddress address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address in the query
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address in the query")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public XpubAddress addressType(Integer addressType) {
    
    this.addressType = addressType;
    return this;
  }

   /**
   * Address type, 0 for receive address, 1 for change address. path is {{addressType}}/{{addressIndex}}
   * @return addressType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address type, 0 for receive address, 1 for change address. path is {{addressType}}/{{addressIndex}}")
  @JsonProperty(JSON_PROPERTY_ADDRESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAddressType() {
    return addressType;
  }


  public void setAddressType(Integer addressType) {
    this.addressType = addressType;
  }


  public XpubAddress addressIndex(Integer addressIndex) {
    
    this.addressIndex = addressIndex;
    return this;
  }

   /**
   * Address index. Address path in the xpub is {{addressType}}/{{addressIndex}}
   * @return addressIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address index. Address path in the xpub is {{addressType}}/{{addressIndex}}")
  @JsonProperty(JSON_PROPERTY_ADDRESS_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAddressIndex() {
    return addressIndex;
  }


  public void setAddressIndex(Integer addressIndex) {
    this.addressIndex = addressIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XpubAddress xpubAddress = (XpubAddress) o;
    return Objects.equals(this.xpub, xpubAddress.xpub) &&
        Objects.equals(this.address, xpubAddress.address) &&
        Objects.equals(this.addressType, xpubAddress.addressType) &&
        Objects.equals(this.addressIndex, xpubAddress.addressIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xpub, address, addressType, addressIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpubAddress {\n");
    sb.append("    xpub: ").append(toIndentedString(xpub)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    addressIndex: ").append(toIndentedString(addressIndex)).append("\n");
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

