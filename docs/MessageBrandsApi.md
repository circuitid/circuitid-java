# MessageBrandsApi

All URIs are relative to *https://cloud9.circuitid.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMessageBrand**](MessageBrandsApi.md#createMessageBrand) | **POST** /messagebrands | Create a new object |
| [**findMessageBrands**](MessageBrandsApi.md#findMessageBrands) | **GET** /messagebrands | Find multiple objects |
| [**getMessageBrand**](MessageBrandsApi.md#getMessageBrand) | **GET** /messagebrands/{id} | Get object by id |


<a id="createMessageBrand"></a>
# **createMessageBrand**
> GetMessageBrand200Response createMessageBrand(messagebrandsCreateOrPatch)

Create a new object

Add a new object to the system.

### Example
```java
// Import classes:
import com.circuitid.client.ApiClient;
import com.circuitid.client.ApiException;
import com.circuitid.client.Configuration;
import com.circuitid.client.auth.*;
import com.circuitid.client.models.*;
import com.circuitid.client.api.MessageBrandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    MessageBrandsApi apiInstance = new MessageBrandsApi(defaultClient);
    MessagebrandsCreateOrPatch messagebrandsCreateOrPatch = new MessagebrandsCreateOrPatch(); // MessagebrandsCreateOrPatch | The JSON object that will be posted to the REST API endpoint.
    try {
      GetMessageBrand200Response result = apiInstance.createMessageBrand(messagebrandsCreateOrPatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageBrandsApi#createMessageBrand");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messagebrandsCreateOrPatch** | [**MessagebrandsCreateOrPatch**](MessagebrandsCreateOrPatch.md)| The JSON object that will be posted to the REST API endpoint. | |

### Return type

[**GetMessageBrand200Response**](GetMessageBrand200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object containing the new object created |  -  |
| **400** | Bad Request |  -  |
| **401** | Not Authenticated |  -  |
| **403** | Forbidden |  -  |
| **405** | Method Not Allowed |  -  |
| **406** | Not Acceptable |  -  |
| **408** | Timeout |  -  |
| **429** | Too Many Requests |  -  |
| **500** | General Error |  -  |
| **503** | Unavailable |  -  |

<a id="findMessageBrands"></a>
# **findMessageBrands**
> FindMessageBrands200Response findMessageBrands($search, $limit, $skip, $sort, $select, $or, $and)

Find multiple objects

Search and retrieve multiple objects simultaneously. 

### Example
```java
// Import classes:
import com.circuitid.client.ApiClient;
import com.circuitid.client.ApiException;
import com.circuitid.client.Configuration;
import com.circuitid.client.auth.*;
import com.circuitid.client.models.*;
import com.circuitid.client.api.MessageBrandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    MessageBrandsApi apiInstance = new MessageBrandsApi(defaultClient);
    String $search = "$search_example"; // String | Filter results by the specified value.
    Integer $limit = 56; // Integer | $limit will return only the number of results you specify.
    Integer $skip = 56; // Integer | $skip will skip the specified number of results.
    Object $sort = null; // Object | $sort will sort based on the object you provide. It can contain a list of properties by which to sort mapped to the order (1 ascending, -1 descending).
    List<String> $select = Arrays.asList(); // List<String> | $select allows to pick which fields to include in the result.
    List<Object> $or = null; // List<Object> | Find all records that match any of the given criteria.
    List<Object> $and = null; // List<Object> | Find all records that match all of the given criteria.
    try {
      FindMessageBrands200Response result = apiInstance.findMessageBrands($search, $limit, $skip, $sort, $select, $or, $and);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageBrandsApi#findMessageBrands");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **$search** | **String**| Filter results by the specified value. | [optional] |
| **$limit** | **Integer**| $limit will return only the number of results you specify. | [optional] |
| **$skip** | **Integer**| $skip will skip the specified number of results. | [optional] |
| **$sort** | [**Object**](.md)| $sort will sort based on the object you provide. It can contain a list of properties by which to sort mapped to the order (1 ascending, -1 descending). | [optional] |
| **$select** | [**List&lt;String&gt;**](String.md)| $select allows to pick which fields to include in the result. | [optional] |
| **$or** | [**List&lt;Object&gt;**](Object.md)| Find all records that match any of the given criteria. | [optional] |
| **$and** | [**List&lt;Object&gt;**](Object.md)| Find all records that match all of the given criteria. | [optional] |

### Return type

[**FindMessageBrands200Response**](FindMessageBrands200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object containing the requested data |  -  |
| **400** | Bad Request |  -  |
| **401** | Not Authenticated |  -  |
| **403** | Forbidden |  -  |
| **405** | Method Not Allowed |  -  |
| **406** | Not Acceptable |  -  |
| **408** | Timeout |  -  |
| **429** | Too Many Requests |  -  |
| **500** | General Error |  -  |
| **503** | Unavailable |  -  |

<a id="getMessageBrand"></a>
# **getMessageBrand**
> GetMessageBrand200Response getMessageBrand(id)

Get object by id

Get an object from the REST API Endpoint by its unique id.

### Example
```java
// Import classes:
import com.circuitid.client.ApiClient;
import com.circuitid.client.ApiException;
import com.circuitid.client.Configuration;
import com.circuitid.client.auth.*;
import com.circuitid.client.models.*;
import com.circuitid.client.api.MessageBrandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    MessageBrandsApi apiInstance = new MessageBrandsApi(defaultClient);
    String id = "id_example"; // String | The ObjectId (unique 12 bytes ID) of record you would like to GET.
    try {
      GetMessageBrand200Response result = apiInstance.getMessageBrand(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageBrandsApi#getMessageBrand");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ObjectId (unique 12 bytes ID) of record you would like to GET. | |

### Return type

[**GetMessageBrand200Response**](GetMessageBrand200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object containing the requested data. |  -  |
| **400** | Bad Request |  -  |
| **401** | Not Authenticated |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **406** | Not Acceptable |  -  |
| **408** | Timeout |  -  |
| **429** | Too Many Requests |  -  |
| **500** | General Error |  -  |
| **503** | Unavailable |  -  |

