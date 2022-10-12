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


package com.metasv.mvc.client.openapi.api;

import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.model.BroadcastResult;
import com.metasv.mvc.client.openapi.model.OutputInfoDetail;
import com.metasv.mvc.client.openapi.model.TxDetail;
import com.metasv.mvc.client.openapi.model.TxRaw;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TxApi
 */
@Ignore
public class TxApiTest {

    private final TxApi api = new TxApi();

    
    /**
     * Broadcast tx to metasv fullnode.
     *
     * This api will broadcast to metasv fullnode directly.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void txBroadcastPostTest() throws ApiException {
        TxRaw txRaw = null;
        BroadcastResult response = api.txBroadcastPost(txRaw);

        // TODO: test validations
    }
    
    /**
     * Get transaction detail by specific txid.
     *
     * This api is parsed from raw hex, you can use /tx/{txid}/raw to parse tx by yourself, If you want detail input info, use &#39;/vin/{txid}&#39; to get detailed input info including address and value.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void txTxidGetTest() throws ApiException {
        String txid = null;
        Boolean showScript = null;
        TxDetail response = api.txTxidGet(txid, showScript);

        // TODO: test validations
    }
    
    /**
     * Get transaction raw hex by specific txid.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void txTxidRawGetTest() throws ApiException {
        String txid = null;
        TxRaw response = api.txTxidRawGet(txid);

        // TODO: test validations
    }
    
    /**
     * Whether MetaSV have seen this tx before. This is a fast approach to know if the tx exist or not.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void txTxidSeenGetTest() throws ApiException {
        String txid = null;
        Boolean response = api.txTxidSeenGet(txid);

        // TODO: test validations
    }
    
    /**
     * Get all output point of vins in the tx with detailed output script.
     *
     * Search output points by spent txid. Use this api to get detailed inputs for the tx.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vinTxidDetailGetTest() throws ApiException {
        String txid = null;
        List<OutputInfoDetail> response = api.vinTxidDetailGet(txid);

        // TODO: test validations
    }
    
}