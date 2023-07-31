/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.21
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


import com.circuitid.client.model.FindMessageBrands200Response;
import com.circuitid.client.model.GetMessageBrand200Response;
import com.circuitid.client.model.MessagebrandsCreateOrPatch;
import com.circuitid.client.model.ResponseError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MessageBrandsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MessageBrandsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessageBrandsApi(ApiClient apiClient) {
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
     * Build call for createMessageBrand
     * @param messagebrandsCreateOrPatch The JSON object that will be posted to the REST API endpoint. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the new object created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> General Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createMessageBrandCall(MessagebrandsCreateOrPatch messagebrandsCreateOrPatch, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = messagebrandsCreateOrPatch;

        // create path and map variables
        String localVarPath = "/messagebrands";

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
    private okhttp3.Call createMessageBrandValidateBeforeCall(MessagebrandsCreateOrPatch messagebrandsCreateOrPatch, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'messagebrandsCreateOrPatch' is set
        if (messagebrandsCreateOrPatch == null) {
            throw new ApiException("Missing the required parameter 'messagebrandsCreateOrPatch' when calling createMessageBrand(Async)");
        }

        return createMessageBrandCall(messagebrandsCreateOrPatch, _callback);

    }

    /**
     * Create a new object
     * Add a new object to the system.
     * @param messagebrandsCreateOrPatch The JSON object that will be posted to the REST API endpoint. (required)
     * @return GetMessageBrand200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the new object created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> General Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public GetMessageBrand200Response createMessageBrand(MessagebrandsCreateOrPatch messagebrandsCreateOrPatch) throws ApiException {
        ApiResponse<GetMessageBrand200Response> localVarResp = createMessageBrandWithHttpInfo(messagebrandsCreateOrPatch);
        return localVarResp.getData();
    }

    /**
     * Create a new object
     * Add a new object to the system.
     * @param messagebrandsCreateOrPatch The JSON object that will be posted to the REST API endpoint. (required)
     * @return ApiResponse&lt;GetMessageBrand200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the new object created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> General Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetMessageBrand200Response> createMessageBrandWithHttpInfo(MessagebrandsCreateOrPatch messagebrandsCreateOrPatch) throws ApiException {
        okhttp3.Call localVarCall = createMessageBrandValidateBeforeCall(messagebrandsCreateOrPatch, null);
        Type localVarReturnType = new TypeToken<GetMessageBrand200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new object (asynchronously)
     * Add a new object to the system.
     * @param messagebrandsCreateOrPatch The JSON object that will be posted to the REST API endpoint. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the new object created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> General Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createMessageBrandAsync(MessagebrandsCreateOrPatch messagebrandsCreateOrPatch, final ApiCallback<GetMessageBrand200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = createMessageBrandValidateBeforeCall(messagebrandsCreateOrPatch, _callback);
        Type localVarReturnType = new TypeToken<GetMessageBrand200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findMessageBrands
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
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> General Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findMessageBrandsCall(String $search, Integer $limit, Integer $skip, Object $sort, List<String> $select, List<Object> $or, List<Object> $and, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/messagebrands";

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
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "$select", $select));
        }

        if ($or != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "$or", $or));
        }

        if ($and != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "$and", $and));
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
    private okhttp3.Call findMessageBrandsValidateBeforeCall(String $search, Integer $limit, Integer $skip, Object $sort, List<String> $select, List<Object> $or, List<Object> $and, final ApiCallback _callback) throws ApiException {
        return findMessageBrandsCall($search, $limit, $skip, $sort, $select, $or, $and, _callback);

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
     * @return FindMessageBrands200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the requested data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> General Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public FindMessageBrands200Response findMessageBrands(String $search, Integer $limit, Integer $skip, Object $sort, List<String> $select, List<Object> $or, List<Object> $and) throws ApiException {
        ApiResponse<FindMessageBrands200Response> localVarResp = findMessageBrandsWithHttpInfo($search, $limit, $skip, $sort, $select, $or, $and);
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
     * @return ApiResponse&lt;FindMessageBrands200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the requested data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> General Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FindMessageBrands200Response> findMessageBrandsWithHttpInfo(String $search, Integer $limit, Integer $skip, Object $sort, List<String> $select, List<Object> $or, List<Object> $and) throws ApiException {
        okhttp3.Call localVarCall = findMessageBrandsValidateBeforeCall($search, $limit, $skip, $sort, $select, $or, $and, null);
        Type localVarReturnType = new TypeToken<FindMessageBrands200Response>(){}.getType();
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
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> General Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findMessageBrandsAsync(String $search, Integer $limit, Integer $skip, Object $sort, List<String> $select, List<Object> $or, List<Object> $and, final ApiCallback<FindMessageBrands200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = findMessageBrandsValidateBeforeCall($search, $limit, $skip, $sort, $select, $or, $and, _callback);
        Type localVarReturnType = new TypeToken<FindMessageBrands200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMessageBrand
     * @param id The ObjectId (unique 12 bytes ID) of record you would like to GET. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the requested data. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> General Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMessageBrandCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/messagebrands/{id}"
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
    private okhttp3.Call getMessageBrandValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getMessageBrand(Async)");
        }

        return getMessageBrandCall(id, _callback);

    }

    /**
     * Get object by id
     * Get an object from the REST API Endpoint by its unique id.
     * @param id The ObjectId (unique 12 bytes ID) of record you would like to GET. (required)
     * @return GetMessageBrand200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the requested data. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> General Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public GetMessageBrand200Response getMessageBrand(String id) throws ApiException {
        ApiResponse<GetMessageBrand200Response> localVarResp = getMessageBrandWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get object by id
     * Get an object from the REST API Endpoint by its unique id.
     * @param id The ObjectId (unique 12 bytes ID) of record you would like to GET. (required)
     * @return ApiResponse&lt;GetMessageBrand200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A JSON object containing the requested data. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> General Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetMessageBrand200Response> getMessageBrandWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getMessageBrandValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<GetMessageBrand200Response>(){}.getType();
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
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> General Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMessageBrandAsync(String id, final ApiCallback<GetMessageBrand200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMessageBrandValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<GetMessageBrand200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
