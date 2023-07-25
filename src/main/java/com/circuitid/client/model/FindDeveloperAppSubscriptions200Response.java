/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.17
 * Contact: support@circuitid.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.circuitid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * FindDeveloperAppSubscriptions200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-25T10:21:28.674Z[UTC]")
public class FindDeveloperAppSubscriptions200Response {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Object total = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Object limit = null;

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private Object skip = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data = null;

  public FindDeveloperAppSubscriptions200Response() {
  }

  public FindDeveloperAppSubscriptions200Response total(Object total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  public Object getTotal() {
    return total;
  }


  public void setTotal(Object total) {
    this.total = total;
  }


  public FindDeveloperAppSubscriptions200Response limit(Object limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  public Object getLimit() {
    return limit;
  }


  public void setLimit(Object limit) {
    this.limit = limit;
  }


  public FindDeveloperAppSubscriptions200Response skip(Object skip) {
    
    this.skip = skip;
    return this;
  }

   /**
   * Get skip
   * @return skip
  **/
  @javax.annotation.Nullable
  public Object getSkip() {
    return skip;
  }


  public void setSkip(Object skip) {
    this.skip = skip;
  }


  public FindDeveloperAppSubscriptions200Response data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public Object getData() {
    return data;
  }


  public void setData(Object data) {
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
    FindDeveloperAppSubscriptions200Response findDeveloperAppSubscriptions200Response = (FindDeveloperAppSubscriptions200Response) o;
    return Objects.equals(this.total, findDeveloperAppSubscriptions200Response.total) &&
        Objects.equals(this.limit, findDeveloperAppSubscriptions200Response.limit) &&
        Objects.equals(this.skip, findDeveloperAppSubscriptions200Response.skip) &&
        Objects.equals(this.data, findDeveloperAppSubscriptions200Response.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, limit, skip, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindDeveloperAppSubscriptions200Response {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to FindDeveloperAppSubscriptions200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FindDeveloperAppSubscriptions200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FindDeveloperAppSubscriptions200Response is not found in the empty JSON string", FindDeveloperAppSubscriptions200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FindDeveloperAppSubscriptions200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FindDeveloperAppSubscriptions200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FindDeveloperAppSubscriptions200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FindDeveloperAppSubscriptions200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FindDeveloperAppSubscriptions200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FindDeveloperAppSubscriptions200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FindDeveloperAppSubscriptions200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<FindDeveloperAppSubscriptions200Response>() {
           @Override
           public void write(JsonWriter out, FindDeveloperAppSubscriptions200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FindDeveloperAppSubscriptions200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FindDeveloperAppSubscriptions200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FindDeveloperAppSubscriptions200Response
  * @throws IOException if the JSON string is invalid with respect to FindDeveloperAppSubscriptions200Response
  */
  public static FindDeveloperAppSubscriptions200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FindDeveloperAppSubscriptions200Response.class);
  }

 /**
  * Convert an instance of FindDeveloperAppSubscriptions200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

