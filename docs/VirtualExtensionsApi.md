# VirtualExtensionsApi

All URIs are relative to *https://rest.circuitid.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVirtualExtension**](VirtualExtensionsApi.md#createVirtualExtension) | **POST** /virtualextensions | Create a new object |
| [**findVirtualExtensions**](VirtualExtensionsApi.md#findVirtualExtensions) | **GET** /virtualextensions | Find multiple objects |
| [**getVirtualExtension**](VirtualExtensionsApi.md#getVirtualExtension) | **GET** /virtualextensions/{id} | Get object by id |
| [**patchVirtualExtension**](VirtualExtensionsApi.md#patchVirtualExtension) | **PATCH** /virtualextensions/{id} | Patch object&#39;s data |
| [**removeVirtualExtension**](VirtualExtensionsApi.md#removeVirtualExtension) | **DELETE** /virtualextensions/{id} | Delete object by id |


<a id="createVirtualExtension"></a>
# **createVirtualExtension**
> Object createVirtualExtension(virtualextensions)

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
import com.circuitid.client.api.VirtualExtensionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    VirtualExtensionsApi apiInstance = new VirtualExtensionsApi(defaultClient);
    Virtualextensions virtualextensions = new Virtualextensions(); // Virtualextensions | The JSON object that will be posted to the REST API endpoint.
    try {
      Object result = apiInstance.createVirtualExtension(virtualextensions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualExtensionsApi#createVirtualExtension");
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
| **virtualextensions** | [**Virtualextensions**](Virtualextensions.md)| The JSON object that will be posted to the REST API endpoint. | |

### Return type

**Object**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object containing the new object created |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **405** |  |  -  |
| **406** |  |  -  |
| **408** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |
| **503** |  |  -  |

<a id="findVirtualExtensions"></a>
# **findVirtualExtensions**
> FindVirtualExtensions200Response findVirtualExtensions($search, $limit, $skip, $sort, $select, $or, $and)

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
import com.circuitid.client.api.VirtualExtensionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    VirtualExtensionsApi apiInstance = new VirtualExtensionsApi(defaultClient);
    Object $search = null; // Object | Filter results by the specified value.
    Object $limit = null; // Object | $limit will return only the number of results you specify.
    Object $skip = null; // Object | $skip will skip the specified number of results.
    Object $sort = null; // Object | $sort will sort based on the object you provide. It can contain a list of properties by which to sort mapped to the order (1 ascending, -1 descending).
    Object $select = null; // Object | $select allows to pick which fields to include in the result.
    Object $or = null; // Object | Find all records that match any of the given criteria.
    Object $and = null; // Object | Find all records that match all of the given criteria.
    try {
      FindVirtualExtensions200Response result = apiInstance.findVirtualExtensions($search, $limit, $skip, $sort, $select, $or, $and);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualExtensionsApi#findVirtualExtensions");
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
| **$search** | [**Object**](.md)| Filter results by the specified value. | [optional] |
| **$limit** | [**Object**](.md)| $limit will return only the number of results you specify. | [optional] |
| **$skip** | [**Object**](.md)| $skip will skip the specified number of results. | [optional] |
| **$sort** | [**Object**](.md)| $sort will sort based on the object you provide. It can contain a list of properties by which to sort mapped to the order (1 ascending, -1 descending). | [optional] |
| **$select** | [**Object**](.md)| $select allows to pick which fields to include in the result. | [optional] |
| **$or** | [**Object**](.md)| Find all records that match any of the given criteria. | [optional] |
| **$and** | [**Object**](.md)| Find all records that match all of the given criteria. | [optional] |

### Return type

[**FindVirtualExtensions200Response**](FindVirtualExtensions200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object containing the requested data |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **405** |  |  -  |
| **406** |  |  -  |
| **408** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |
| **503** |  |  -  |

<a id="getVirtualExtension"></a>
# **getVirtualExtension**
> Object getVirtualExtension(id)

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
import com.circuitid.client.api.VirtualExtensionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    VirtualExtensionsApi apiInstance = new VirtualExtensionsApi(defaultClient);
    Object id = null; // Object | The ObjectId (unique 12 bytes ID) of record you would like to GET.
    try {
      Object result = apiInstance.getVirtualExtension(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualExtensionsApi#getVirtualExtension");
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
| **id** | [**Object**](.md)| The ObjectId (unique 12 bytes ID) of record you would like to GET. | |

### Return type

**Object**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object containing the requested data. |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** | Not Found |  -  |
| **405** |  |  -  |
| **406** |  |  -  |
| **408** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |
| **503** |  |  -  |

<a id="patchVirtualExtension"></a>
# **patchVirtualExtension**
> Object patchVirtualExtension(id, virtualextensions)

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
import com.circuitid.client.api.VirtualExtensionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    VirtualExtensionsApi apiInstance = new VirtualExtensionsApi(defaultClient);
    Object id = null; // Object | The ObjectId (unique 12 bytes ID) of record you would like to GET.
    Virtualextensions virtualextensions = new Virtualextensions(); // Virtualextensions | The request data.
    try {
      Object result = apiInstance.patchVirtualExtension(id, virtualextensions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualExtensionsApi#patchVirtualExtension");
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
| **id** | [**Object**](.md)| The ObjectId (unique 12 bytes ID) of record you would like to GET. | |
| **virtualextensions** | [**Virtualextensions**](Virtualextensions.md)| The request data. | |

### Return type

**Object**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object containing the modified data. |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **405** |  |  -  |
| **406** |  |  -  |
| **408** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |
| **503** |  |  -  |

<a id="removeVirtualExtension"></a>
# **removeVirtualExtension**
> Object removeVirtualExtension(id)

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
import com.circuitid.client.api.VirtualExtensionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    VirtualExtensionsApi apiInstance = new VirtualExtensionsApi(defaultClient);
    Object id = null; // Object | The ObjectId (unique 12 bytes ID) of record you would like to GET.
    try {
      Object result = apiInstance.removeVirtualExtension(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualExtensionsApi#removeVirtualExtension");
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
| **id** | [**Object**](.md)| The ObjectId (unique 12 bytes ID) of record you would like to GET. | |

### Return type

**Object**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object containing the deleted data. |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **405** |  |  -  |
| **406** |  |  -  |
| **408** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |
| **503** |  |  -  |

