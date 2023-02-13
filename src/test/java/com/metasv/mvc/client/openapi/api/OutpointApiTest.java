/*
 * MetaSV for MVC API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 3.0.1
 * Contact: heqiming@metasv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.metasv.mvc.client.openapi.api;

import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.model.OutputInfo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OutpointApi
 */
@Ignore
public class OutpointApiTest {

    private final OutpointApi api = new OutpointApi();

    
    /**
     * Get tx output(outpoint for vin) spent status.
     *
     * Get detailed info for a utxo(or txo if spent), Only outputs spent no longer than one month are available. (Premium feature will support full history)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void outpointTxidIndexGetTest() throws ApiException {
        String txid = null;
        Integer index = null;
        OutputInfo response = api.outpointTxidIndexGet(txid, index);

        // TODO: test validations
    }
    
}
