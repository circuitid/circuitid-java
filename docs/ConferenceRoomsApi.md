# ConferenceRoomsApi

All URIs are relative to *https://cloud9.circuitid.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConferenceRoom**](ConferenceRoomsApi.md#createConferenceRoom) | **POST** /conferencerooms | Create a new object |
| [**findConferenceRooms**](ConferenceRoomsApi.md#findConferenceRooms) | **GET** /conferencerooms | Find multiple objects |
| [**getConferenceRoom**](ConferenceRoomsApi.md#getConferenceRoom) | **GET** /conferencerooms/{id} | Get object by id |
| [**patchConferenceRoom**](ConferenceRoomsApi.md#patchConferenceRoom) | **PATCH** /conferencerooms/{id} | Patch object&#39;s data |
| [**removeConferenceRoom**](ConferenceRoomsApi.md#removeConferenceRoom) | **DELETE** /conferencerooms/{id} | Delete object by id |


<a id="createConferenceRoom"></a>
# **createConferenceRoom**
> Object createConferenceRoom(conferencerooms)

Create a new object

Add a new object to the system.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import CircuitID.ConferenceRoomsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    ConferenceRoomsApi apiInstance = new ConferenceRoomsApi(defaultClient);
    Conferencerooms conferencerooms = new Conferencerooms(); // Conferencerooms | The JSON object that will be posted to the REST API endpoint.
    try {
      Object result = apiInstance.createConferenceRoom(conferencerooms);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferenceRoomsApi#createConferenceRoom");
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
| **conferencerooms** | [**Conferencerooms**](Conferencerooms.md)| The JSON object that will be posted to the REST API endpoint. | |

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

<a id="findConferenceRooms"></a>
# **findConferenceRooms**
> FindConferenceRooms200Response findConferenceRooms($search, $limit, $skip, $sort, $select, $or, $and)

Find multiple objects

Search and retrieve multiple objects simultaneously. 

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import CircuitID.ConferenceRoomsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    ConferenceRoomsApi apiInstance = new ConferenceRoomsApi(defaultClient);
    Object $search = null; // Object | Filter results by the specified value.
    Object $limit = null; // Object | $limit will return only the number of results you specify.
    Object $skip = null; // Object | $skip will skip the specified number of results.
    Object $sort = null; // Object | $sort will sort based on the object you provide. It can contain a list of properties by which to sort mapped to the order (1 ascending, -1 descending).
    Object $select = null; // Object | $select allows to pick which fields to include in the result.
    Object $or = null; // Object | Find all records that match any of the given criteria.
    Object $and = null; // Object | Find all records that match all of the given criteria.
    try {
      FindConferenceRooms200Response result = apiInstance.findConferenceRooms($search, $limit, $skip, $sort, $select, $or, $and);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferenceRoomsApi#findConferenceRooms");
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

[**FindConferenceRooms200Response**](FindConferenceRooms200Response.md)

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

<a id="getConferenceRoom"></a>
# **getConferenceRoom**
> Object getConferenceRoom(id)

Get object by id

Get an object from the REST API Endpoint by its unique id.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import CircuitID.ConferenceRoomsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    ConferenceRoomsApi apiInstance = new ConferenceRoomsApi(defaultClient);
    Object id = null; // Object | The ObjectId (unique 12 bytes ID) of record you would like to GET.
    try {
      Object result = apiInstance.getConferenceRoom(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferenceRoomsApi#getConferenceRoom");
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

<a id="patchConferenceRoom"></a>
# **patchConferenceRoom**
> Object patchConferenceRoom(id, conferencerooms)

Patch object&#39;s data

Make updates to specific fields within the record without replacing the entire dataset.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import CircuitID.ConferenceRoomsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    ConferenceRoomsApi apiInstance = new ConferenceRoomsApi(defaultClient);
    Object id = null; // Object | The ObjectId (unique 12 bytes ID) of record you would like to GET.
    Conferencerooms conferencerooms = new Conferencerooms(); // Conferencerooms | The request data.
    try {
      Object result = apiInstance.patchConferenceRoom(id, conferencerooms);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferenceRoomsApi#patchConferenceRoom");
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
| **conferencerooms** | [**Conferencerooms**](Conferencerooms.md)| The request data. | |

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

<a id="removeConferenceRoom"></a>
# **removeConferenceRoom**
> Object removeConferenceRoom(id)

Delete object by id

Delete an object by id, removing it from the service.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import CircuitID.ConferenceRoomsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    ConferenceRoomsApi apiInstance = new ConferenceRoomsApi(defaultClient);
    Object id = null; // Object | The ObjectId (unique 12 bytes ID) of record you would like to GET.
    try {
      Object result = apiInstance.removeConferenceRoom(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferenceRoomsApi#removeConferenceRoom");
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

