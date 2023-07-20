# GroupMembersApi

All URIs are relative to *https://cloud9.circuitid.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGroupMember**](GroupMembersApi.md#createGroupMember) | **POST** /groupmembers | Create a new object |
| [**findGroupMembers**](GroupMembersApi.md#findGroupMembers) | **GET** /groupmembers | Find multiple objects |
| [**getGroupMember**](GroupMembersApi.md#getGroupMember) | **GET** /groupmembers/{id} | Get object by id |
| [**patchGroupMember**](GroupMembersApi.md#patchGroupMember) | **PATCH** /groupmembers/{id} | Patch object&#39;s data |
| [**removeGroupMember**](GroupMembersApi.md#removeGroupMember) | **DELETE** /groupmembers/{id} | Delete object by id |


<a id="createGroupMember"></a>
# **createGroupMember**
> Object createGroupMember(groupmembers)

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
import CircuitID.GroupMembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    GroupMembersApi apiInstance = new GroupMembersApi(defaultClient);
    Groupmembers groupmembers = new Groupmembers(); // Groupmembers | The JSON object that will be posted to the REST API endpoint.
    try {
      Object result = apiInstance.createGroupMember(groupmembers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembersApi#createGroupMember");
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
| **groupmembers** | [**Groupmembers**](Groupmembers.md)| The JSON object that will be posted to the REST API endpoint. | |

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

<a id="findGroupMembers"></a>
# **findGroupMembers**
> FindGroupMembers200Response findGroupMembers($search, $limit, $skip, $sort, $select, $or, $and)

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
import CircuitID.GroupMembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    GroupMembersApi apiInstance = new GroupMembersApi(defaultClient);
    Object $search = null; // Object | Filter results by the specified value.
    Object $limit = null; // Object | $limit will return only the number of results you specify.
    Object $skip = null; // Object | $skip will skip the specified number of results.
    Object $sort = null; // Object | $sort will sort based on the object you provide. It can contain a list of properties by which to sort mapped to the order (1 ascending, -1 descending).
    Object $select = null; // Object | $select allows to pick which fields to include in the result.
    Object $or = null; // Object | Find all records that match any of the given criteria.
    Object $and = null; // Object | Find all records that match all of the given criteria.
    try {
      FindGroupMembers200Response result = apiInstance.findGroupMembers($search, $limit, $skip, $sort, $select, $or, $and);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembersApi#findGroupMembers");
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

[**FindGroupMembers200Response**](FindGroupMembers200Response.md)

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

<a id="getGroupMember"></a>
# **getGroupMember**
> Object getGroupMember(id)

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
import CircuitID.GroupMembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    GroupMembersApi apiInstance = new GroupMembersApi(defaultClient);
    Object id = null; // Object | The ObjectId (unique 12 bytes ID) of record you would like to GET.
    try {
      Object result = apiInstance.getGroupMember(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembersApi#getGroupMember");
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

<a id="patchGroupMember"></a>
# **patchGroupMember**
> Object patchGroupMember(id, groupmembers)

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
import CircuitID.GroupMembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    GroupMembersApi apiInstance = new GroupMembersApi(defaultClient);
    Object id = null; // Object | The ObjectId (unique 12 bytes ID) of record you would like to GET.
    Groupmembers groupmembers = new Groupmembers(); // Groupmembers | The request data.
    try {
      Object result = apiInstance.patchGroupMember(id, groupmembers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembersApi#patchGroupMember");
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
| **groupmembers** | [**Groupmembers**](Groupmembers.md)| The request data. | |

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

<a id="removeGroupMember"></a>
# **removeGroupMember**
> Object removeGroupMember(id)

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
import CircuitID.GroupMembersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    GroupMembersApi apiInstance = new GroupMembersApi(defaultClient);
    Object id = null; // Object | The ObjectId (unique 12 bytes ID) of record you would like to GET.
    try {
      Object result = apiInstance.removeGroupMember(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembersApi#removeGroupMember");
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
