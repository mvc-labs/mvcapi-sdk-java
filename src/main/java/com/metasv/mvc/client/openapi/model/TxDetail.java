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
import com.metasv.mvc.client.openapi.model.BlockTx;
import com.metasv.mvc.client.openapi.model.TxInput;
import com.metasv.mvc.client.openapi.model.TxOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Parsed tx info
 */
@ApiModel(description = "Parsed tx info")
@JsonPropertyOrder({
  TxDetail.JSON_PROPERTY_TX_DETAIL,
  TxDetail.JSON_PROPERTY_INPUTS,
  TxDetail.JSON_PROPERTY_OUTPUTS
})
@JsonTypeName("TxDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-14T23:34:31.785376+09:00[Asia/Tokyo]")
public class TxDetail {
  public static final String JSON_PROPERTY_TX_DETAIL = "txDetail";
  private BlockTx txDetail;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<TxInput> inputs = null;

  public static final String JSON_PROPERTY_OUTPUTS = "outputs";
  private List<TxOutput> outputs = null;


  public TxDetail txDetail(BlockTx txDetail) {
    
    this.txDetail = txDetail;
    return this;
  }

   /**
   * Get txDetail
   * @return txDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TX_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BlockTx getTxDetail() {
    return txDetail;
  }


  public void setTxDetail(BlockTx txDetail) {
    this.txDetail = txDetail;
  }


  public TxDetail inputs(List<TxInput> inputs) {
    
    this.inputs = inputs;
    return this;
  }

  public TxDetail addInputsItem(TxInput inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TxInput> getInputs() {
    return inputs;
  }


  public void setInputs(List<TxInput> inputs) {
    this.inputs = inputs;
  }


  public TxDetail outputs(List<TxOutput> outputs) {
    
    this.outputs = outputs;
    return this;
  }

  public TxDetail addOutputsItem(TxOutput outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OUTPUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TxOutput> getOutputs() {
    return outputs;
  }


  public void setOutputs(List<TxOutput> outputs) {
    this.outputs = outputs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxDetail txDetail = (TxDetail) o;
    return Objects.equals(this.txDetail, txDetail.txDetail) &&
        Objects.equals(this.inputs, txDetail.inputs) &&
        Objects.equals(this.outputs, txDetail.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txDetail, inputs, outputs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxDetail {\n");
    sb.append("    txDetail: ").append(toIndentedString(txDetail)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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

