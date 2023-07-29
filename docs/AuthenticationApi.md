# AuthenticationApi

All URIs are relative to *https://cloud9.circuitid.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAuthentication**](AuthenticationApi.md#createAuthentication) | **POST** /authentication | Create a new object |


<a id="createAuthentication"></a>
# **createAuthentication**
> CreateAuthentication200Response createAuthentication(authentication)

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
import com.circuitid.client.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloud9.circuitid.com");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    Authentication authentication = new Authentication(); // Authentication | The JSON object that will be posted to the REST API endpoint.
    try {
      CreateAuthentication200Response result = apiInstance.createAuthentication(authentication);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#createAuthentication");
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
| **authentication** | [**Authentication**](Authentication.md)| The JSON object that will be posted to the REST API endpoint. | |

### Return type

[**CreateAuthentication200Response**](CreateAuthentication200Response.md)

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

