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
 * The current balance for a particular address
 */
@ApiModel(description = "The current balance for a particular address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-12T19:14:49.325014+09:00[Asia/Tokyo]")
public class AddressBalance {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CONFIRMED = "confirmed";
  @SerializedName(SERIALIZED_NAME_CONFIRMED)
  private Long confirmed;

  public static final String SERIALIZED_NAME_UNCONFIRMED = "unconfirmed";
  @SerializedName(SERIALIZED_NAME_UNCONFIRMED)
  private Long unconfirmed;


  public AddressBalance address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * current address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current address")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AddressBalance confirmed(Long confirmed) {
    
    this.confirmed = confirmed;
    return this;
  }

   /**
   * confirmed balance
   * @return confirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "confirmed balance")

  public Long getConfirmed() {
    return confirmed;
  }


  public void setConfirmed(Long confirmed) {
    this.confirmed = confirmed;
  }


  public AddressBalance unconfirmed(Long unconfirmed) {
    
    this.unconfirmed = unconfirmed;
    return this;
  }

   /**
   * unconfirmed balance
   * @return unconfirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unconfirmed balance")

  public Long getUnconfirmed() {
    return unconfirmed;
  }


  public void setUnconfirmed(Long unconfirmed) {
    this.unconfirmed = unconfirmed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressBalance addressBalance = (AddressBalance) o;
    return Objects.equals(this.address, addressBalance.address) &&
        Objects.equals(this.confirmed, addressBalance.confirmed) &&
        Objects.equals(this.unconfirmed, addressBalance.unconfirmed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, confirmed, unconfirmed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressBalance {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    unconfirmed: ").append(toIndentedString(unconfirmed)).append("\n");
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
