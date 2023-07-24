/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.16
 * Contact: support@circuitid.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.circuitid.client.api;

import com.circuitid.client.ApiCallback;
import com.circuitid.client.ApiClient;
import com.circuitid.client.ApiException;
import com.circuitid.client.ApiResponse;
import com.circuitid.client.Configuration;
import com.circuitid.client.Pair;
import com.circuitid.client.ProgressRequestBody;
import com.circuitid.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.circuitid.client.model.FindNumberPorts200Response;
import com.circuitid.client.model.Numberports;
import com.circuitid.client.model.ResponseError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class NumberPortsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NumberPortsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NumberPortsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createNumberPort
     * @param numberports The JSON object that will be posted to the REST API endpoint. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the new object created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createNumberPortCall(Numberports numberports, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = numberports;

        // create path and map variables
        String localVarPath = "/numberports";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNumberPortValidateBeforeCall(Numberports numberports, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'numberports' is set
        if (numberports == null) {
            throw new ApiException("Missing the required parameter 'numberports' when calling createNumberPort(Async)");
        }

        return createNumberPortCall(numberports, _callback);

    }

    /**
     * Create a new object
     * Add a new object to the system.
     * @param numberports The JSON object that will be posted to the REST API endpoint. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the new object created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Object createNumberPort(Numberports numberports) throws ApiException {
        ApiResponse<Object> localVarResp = createNumberPortWithHttpInfo(numberports);
        return localVarResp.getData();
    }

    /**
     * Create a new object
     * Add a new object to the system.
     * @param numberports The JSON object that will be posted to the REST API endpoint. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the new object created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> createNumberPortWithHttpInfo(Numberports numberports) throws ApiException {
        okhttp3.Call localVarCall = createNumberPortValidateBeforeCall(numberports, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new object (asynchronously)
     * Add a new object to the system.
     * @param numberports The JSON object that will be posted to the REST API endpoint. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the new object created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createNumberPortAsync(Numberports numberports, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNumberPortValidateBeforeCall(numberports, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findNumberPorts
     * @param $search Filter results by the specified value. (optional)
     * @param $limit $limit will return only the number of results you specify. (optional)
     * @param $skip $skip will skip the specified number of results. (optional)
     * @param $sort $sort will sort based on the object you provide. It can contain a list of properties by which to sort mapped to the order (1 ascending, -1 descending). (optional)
     * @param $select $select allows to pick which fields to include in the result. (optional)
     * @param $or Find all records that match any of the given criteria. (optional)
     * @param $and Find all records that match all of the given criteria. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the requested data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findNumberPortsCall(Object $search, Object $limit, Object $skip, Object $sort, Object $select, Object $or, Object $and, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/numberports";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if ($search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$search", $search));
        }

        if ($limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$limit", $limit));
        }

        if ($skip != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$skip", $skip));
        }

        if ($sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$sort", $sort));
        }

        if ($select != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$select", $select));
        }

        if ($or != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$or", $or));
        }

        if ($and != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$and", $and));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findNumberPortsValidateBeforeCall(Object $search, Object $limit, Object $skip, Object $sort, Object $select, Object $or, Object $and, final ApiCallback _callback) throws ApiException {
        return findNumberPortsCall($search, $limit, $skip, $sort, $select, $or, $and, _callback);

    }

    /**
     * Find multiple objects
     * Search and retrieve multiple objects simultaneously. 
     * @param $search Filter results by the specified value. (optional)
     * @param $limit $limit will return only the number of results you specify. (optional)
     * @param $skip $skip will skip the specified number of results. (optional)
     * @param $sort $sort will sort based on the object you provide. It can contain a list of properties by which to sort mapped to the order (1 ascending, -1 descending). (optional)
     * @param $select $select allows to pick which fields to include in the result. (optional)
     * @param $or Find all records that match any of the given criteria. (optional)
     * @param $and Find all records that match all of the given criteria. (optional)
     * @return FindNumberPorts200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the requested data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public FindNumberPorts200Response findNumberPorts(Object $search, Object $limit, Object $skip, Object $sort, Object $select, Object $or, Object $and) throws ApiException {
        ApiResponse<FindNumberPorts200Response> localVarResp = findNumberPortsWithHttpInfo($search, $limit, $skip, $sort, $select, $or, $and);
        return localVarResp.getData();
    }

    /**
     * Find multiple objects
     * Search and retrieve multiple objects simultaneously. 
     * @param $search Filter results by the specified value. (optional)
     * @param $limit $limit will return only the number of results you specify. (optional)
     * @param $skip $skip will skip the specified number of results. (optional)
     * @param $sort $sort will sort based on the object you provide. It can contain a list of properties by which to sort mapped to the order (1 ascending, -1 descending). (optional)
     * @param $select $select allows to pick which fields to include in the result. (optional)
     * @param $or Find all records that match any of the given criteria. (optional)
     * @param $and Find all records that match all of the given criteria. (optional)
     * @return ApiResponse&lt;FindNumberPorts200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the requested data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FindNumberPorts200Response> findNumberPortsWithHttpInfo(Object $search, Object $limit, Object $skip, Object $sort, Object $select, Object $or, Object $and) throws ApiException {
        okhttp3.Call localVarCall = findNumberPortsValidateBeforeCall($search, $limit, $skip, $sort, $select, $or, $and, null);
        Type localVarReturnType = new TypeToken<FindNumberPorts200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Find multiple objects (asynchronously)
     * Search and retrieve multiple objects simultaneously. 
     * @param $search Filter results by the specified value. (optional)
     * @param $limit $limit will return only the number of results you specify. (optional)
     * @param $skip $skip will skip the specified number of results. (optional)
     * @param $sort $sort will sort based on the object you provide. It can contain a list of properties by which to sort mapped to the order (1 ascending, -1 descending). (optional)
     * @param $select $select allows to pick which fields to include in the result. (optional)
     * @param $or Find all records that match any of the given criteria. (optional)
     * @param $and Find all records that match all of the given criteria. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the requested data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findNumberPortsAsync(Object $search, Object $limit, Object $skip, Object $sort, Object $select, Object $or, Object $and, final ApiCallback<FindNumberPorts200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = findNumberPortsValidateBeforeCall($search, $limit, $skip, $sort, $select, $or, $and, _callback);
        Type localVarReturnType = new TypeToken<FindNumberPorts200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNumberPort
     * @param id The ObjectId (unique 12 bytes ID) of record you would like to GET. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the requested data. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNumberPortCall(Object id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/numberports/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getNumberPortValidateBeforeCall(Object id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getNumberPort(Async)");
        }

        return getNumberPortCall(id, _callback);

    }

    /**
     * Get object by id
     * Get an object from the REST API Endpoint by its unique id.
     * @param id The ObjectId (unique 12 bytes ID) of record you would like to GET. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the requested data. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Object getNumberPort(Object id) throws ApiException {
        ApiResponse<Object> localVarResp = getNumberPortWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get object by id
     * Get an object from the REST API Endpoint by its unique id.
     * @param id The ObjectId (unique 12 bytes ID) of record you would like to GET. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the requested data. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> getNumberPortWithHttpInfo(Object id) throws ApiException {
        okhttp3.Call localVarCall = getNumberPortValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get object by id (asynchronously)
     * Get an object from the REST API Endpoint by its unique id.
     * @param id The ObjectId (unique 12 bytes ID) of record you would like to GET. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the requested data. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNumberPortAsync(Object id, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNumberPortValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchNumberPort
     * @param id The ObjectId (unique 12 bytes ID) of record you would like to GET. (required)
     * @param numberports The request data. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the modified data. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchNumberPortCall(Object id, Numberports numberports, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = numberports;

        // create path and map variables
        String localVarPath = "/numberports/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchNumberPortValidateBeforeCall(Object id, Numberports numberports, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling patchNumberPort(Async)");
        }

        // verify the required parameter 'numberports' is set
        if (numberports == null) {
            throw new ApiException("Missing the required parameter 'numberports' when calling patchNumberPort(Async)");
        }

        return patchNumberPortCall(id, numberports, _callback);

    }

    /**
     * Patch object&#39;s data
     * Make updates to specific fields within the record without replacing the entire dataset.
     * @param id The ObjectId (unique 12 bytes ID) of record you would like to GET. (required)
     * @param numberports The request data. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the modified data. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Object patchNumberPort(Object id, Numberports numberports) throws ApiException {
        ApiResponse<Object> localVarResp = patchNumberPortWithHttpInfo(id, numberports);
        return localVarResp.getData();
    }

    /**
     * Patch object&#39;s data
     * Make updates to specific fields within the record without replacing the entire dataset.
     * @param id The ObjectId (unique 12 bytes ID) of record you would like to GET. (required)
     * @param numberports The request data. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the modified data. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> patchNumberPortWithHttpInfo(Object id, Numberports numberports) throws ApiException {
        okhttp3.Call localVarCall = patchNumberPortValidateBeforeCall(id, numberports, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Patch object&#39;s data (asynchronously)
     * Make updates to specific fields within the record without replacing the entire dataset.
     * @param id The ObjectId (unique 12 bytes ID) of record you would like to GET. (required)
     * @param numberports The request data. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the modified data. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 406 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 408 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 503 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchNumberPortAsync(Object id, Numberports numberports, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchNumberPortValidateBeforeCall(id, numberports, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
