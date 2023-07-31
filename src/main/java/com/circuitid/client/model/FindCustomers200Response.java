/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.20
 * Contact: support@circuitid.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.circuitid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.circuitid.client.model.GetCustomer200Response;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.circuitid.client.JSON;

/**
 * FindCustomers200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-31T19:48:25.560Z[UTC]")
public class FindCustomers200Response {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private Integer skip;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<GetCustomer200Response> data = new ArrayList<>();

  public FindCustomers200Response() {
  }

  public FindCustomers200Response total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nonnull
  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public FindCustomers200Response limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nonnull
  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public FindCustomers200Response skip(Integer skip) {
    
    this.skip = skip;
    return this;
  }

   /**
   * Get skip
   * @return skip
  **/
  @javax.annotation.Nonnull
  public Integer getSkip() {
    return skip;
  }


  public void setSkip(Integer skip) {
    this.skip = skip;
  }


  public FindCustomers200Response data(List<GetCustomer200Response> data) {
    
    this.data = data;
    return this;
  }

  public FindCustomers200Response addDataItem(GetCustomer200Response dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  public List<GetCustomer200Response> getData() {
    return data;
  }


  public void setData(List<GetCustomer200Response> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindCustomers200Response findCustomers200Response = (FindCustomers200Response) o;
    return Objects.equals(this.total, findCustomers200Response.total) &&
        Objects.equals(this.limit, findCustomers200Response.limit) &&
        Objects.equals(this.skip, findCustomers200Response.skip) &&
        Objects.equals(this.data, findCustomers200Response.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, limit, skip, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindCustomers200Response {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("total");
    openapiFields.add("limit");
    openapiFields.add("skip");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("limit");
    openapiRequiredFields.add("skip");
    openapiRequiredFields.add("data");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FindCustomers200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FindCustomers200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FindCustomers200Response is not found in the empty JSON string", FindCustomers200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FindCustomers200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FindCustomers200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FindCustomers200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }

      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      // validate the required field `data` (array)
      for (int i = 0; i < jsonArraydata.size(); i++) {
        GetCustomer200Response.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FindCustomers200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FindCustomers200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FindCustomers200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FindCustomers200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<FindCustomers200Response>() {
           @Override
           public void write(JsonWriter out, FindCustomers200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FindCustomers200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FindCustomers200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FindCustomers200Response
  * @throws IOException if the JSON string is invalid with respect to FindCustomers200Response
  */
  public static FindCustomers200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FindCustomers200Response.class);
  }

 /**
  * Convert an instance of FindCustomers200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

