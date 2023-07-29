# CustomersApi

All URIs are relative to *https://cloud9.circuitid.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomer**](CustomersApi.md#createCustomer) | **POST** /customers | Create a new object |
| [**findCustomers**](CustomersApi.md#findCustomers) | **GET** /customers | Find multiple objects |
| [**getCustomer**](CustomersApi.md#getCustomer) | **GET** /customers/{id} | Get object by id |
| [**patchCustomer**](CustomersApi.md#patchCustomer) | **PATCH** /customers/{id} | Patch object&#39;s data |
| [**removeCustomer**](CustomersApi.md#removeCustomer) | **DELETE** /customers/{id} | Delete object by id |


<a id="createCustomer"></a>
# **createCustomer**
> GetCustomer200Response createCustomer(customers)

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
import com.circuitid.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    Customers customers = new Customers(); // Customers | The JSON object that will be posted to the REST API endpoint.
    try {
      GetCustomer200Response result = apiInstance.createCustomer(customers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createCustomer");
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
| **customers** | [**Customers**](Customers.md)| The JSON object that will be posted to the REST API endpoint. | |

### Return type

[**GetCustomer200Response**](GetCustomer200Response.md)

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

<a id="findCustomers"></a>
# **findCustomers**
> FindCustomers200Response findCustomers($search, $limit, $skip, $sort, $select, $or, $and)

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
import com.circuitid.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String $search = "$search_example"; // String | Filter results by the specified value.
    Integer $limit = 56; // Integer | $limit will return only the number of results you specify.
    Integer $skip = 56; // Integer | $skip will skip the specified number of results.
    Object $sort = null; // Object | $sort will sort based on the object you provide. It can contain a list of properties by which to sort mapped to the order (1 ascending, -1 descending).
    List<String> $select = Arrays.asList(); // List<String> | $select allows to pick which fields to include in the result.
    List<Object> $or = null; // List<Object> | Find all records that match any of the given criteria.
    List<Object> $and = null; // List<Object> | Find all records that match all of the given criteria.
    try {
      FindCustomers200Response result = apiInstance.findCustomers($search, $limit, $skip, $sort, $select, $or, $and);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#findCustomers");
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

[**FindCustomers200Response**](FindCustomers200Response.md)

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

<a id="getCustomer"></a>
# **getCustomer**
> GetCustomer200Response getCustomer(id)

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
import com.circuitid.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String id = "id_example"; // String | The ObjectId (unique 12 bytes ID) of record you would like to GET.
    try {
      GetCustomer200Response result = apiInstance.getCustomer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#getCustomer");
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

[**GetCustomer200Response**](GetCustomer200Response.md)

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

<a id="patchCustomer"></a>
# **patchCustomer**
> GetCustomer200Response patchCustomer(id, customers)

Patch object&#39;s data

Make updates to specific fields within the record without replacing the entire dataset.

### Example
```java
// Import classes:
import com.circuitid.client.ApiClient;
import com.circuitid.client.ApiException;
import com.circuitid.client.Configuration;
import com.circuitid.client.auth.*;
import com.circuitid.client.models.*;
import com.circuitid.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String id = "id_example"; // String | The ObjectId (unique 12 bytes ID) of record you would like to GET.
    Customers customers = new Customers(); // Customers | The request data.
    try {
      GetCustomer200Response result = apiInstance.patchCustomer(id, customers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#patchCustomer");
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
| **customers** | [**Customers**](Customers.md)| The request data. | |

### Return type

[**GetCustomer200Response**](GetCustomer200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object containing the modified data. |  -  |
| **400** | Bad Request |  -  |
| **401** | Not Authenticated |  -  |
| **403** | Forbidden |  -  |
| **405** | Method Not Allowed |  -  |
| **406** | Not Acceptable |  -  |
| **408** | Timeout |  -  |
| **429** | Too Many Requests |  -  |
| **500** | General Error |  -  |
| **503** | Unavailable |  -  |

<a id="removeCustomer"></a>
# **removeCustomer**
> GetCustomer200Response removeCustomer(id)

Delete object by id

Delete an object by id, removing it from the service.

### Example
```java
// Import classes:
import com.circuitid.client.ApiClient;
import com.circuitid.client.ApiException;
import com.circuitid.client.Configuration;
import com.circuitid.client.auth.*;
import com.circuitid.client.models.*;
import com.circuitid.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String id = "id_example"; // String | The ObjectId (unique 12 bytes ID) of record you would like to GET.
    try {
      GetCustomer200Response result = apiInstance.removeCustomer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#removeCustomer");
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

[**GetCustomer200Response**](GetCustomer200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object containing the deleted data. |  -  |
| **400** | Bad Request |  -  |
| **401** | Not Authenticated |  -  |
| **403** | Forbidden |  -  |
| **405** | Method Not Allowed |  -  |
| **406** | Not Acceptable |  -  |
| **408** | Timeout |  -  |
| **429** | Too Many Requests |  -  |
| **500** | General Error |  -  |
| **503** | Unavailable |  -  |

