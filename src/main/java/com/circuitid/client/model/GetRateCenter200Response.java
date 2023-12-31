/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.22
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
import java.time.OffsetDateTime;

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
 * GetRateCenter200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T20:07:07.395Z[UTC]")
public class GetRateCenter200Response {
  public static final String SERIALIZED_NAME_NPA = "npa";
  @SerializedName(SERIALIZED_NAME_NPA)
  private String npa;

  public static final String SERIALIZED_NAME_NXX = "nxx";
  @SerializedName(SERIALIZED_NAME_NXX)
  private String nxx;

  public static final String SERIALIZED_NAME_LATA = "lata";
  @SerializedName(SERIALIZED_NAME_LATA)
  private String lata;

  public static final String SERIALIZED_NAME_LOC_STATE = "locState";
  @SerializedName(SERIALIZED_NAME_LOC_STATE)
  private String locState;

  public static final String SERIALIZED_NAME_RC_ABBRE = "rcAbbre";
  @SerializedName(SERIALIZED_NAME_RC_ABBRE)
  private String rcAbbre;

  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_BY_USER_ID = "createdByUserId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_ID)
  private String createdByUserId;

  public static final String SERIALIZED_NAME_UPDATED_BY_USER_ID = "updatedByUserId";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY_USER_ID)
  private String updatedByUserId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public GetRateCenter200Response() {
  }

  public GetRateCenter200Response npa(String npa) {
    
    this.npa = npa;
    return this;
  }

   /**
   * Get npa
   * @return npa
  **/
  @javax.annotation.Nonnull
  public String getNpa() {
    return npa;
  }


  public void setNpa(String npa) {
    this.npa = npa;
  }


  public GetRateCenter200Response nxx(String nxx) {
    
    this.nxx = nxx;
    return this;
  }

   /**
   * Get nxx
   * @return nxx
  **/
  @javax.annotation.Nonnull
  public String getNxx() {
    return nxx;
  }


  public void setNxx(String nxx) {
    this.nxx = nxx;
  }


  public GetRateCenter200Response lata(String lata) {
    
    this.lata = lata;
    return this;
  }

   /**
   * Get lata
   * @return lata
  **/
  @javax.annotation.Nonnull
  public String getLata() {
    return lata;
  }


  public void setLata(String lata) {
    this.lata = lata;
  }


  public GetRateCenter200Response locState(String locState) {
    
    this.locState = locState;
    return this;
  }

   /**
   * Get locState
   * @return locState
  **/
  @javax.annotation.Nonnull
  public String getLocState() {
    return locState;
  }


  public void setLocState(String locState) {
    this.locState = locState;
  }


  public GetRateCenter200Response rcAbbre(String rcAbbre) {
    
    this.rcAbbre = rcAbbre;
    return this;
  }

   /**
   * Get rcAbbre
   * @return rcAbbre
  **/
  @javax.annotation.Nonnull
  public String getRcAbbre() {
    return rcAbbre;
  }


  public void setRcAbbre(String rcAbbre) {
    this.rcAbbre = rcAbbre;
  }


  public GetRateCenter200Response id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GetRateCenter200Response createdByUserId(String createdByUserId) {
    
    this.createdByUserId = createdByUserId;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return createdByUserId
  **/
  @javax.annotation.Nullable
  public String getCreatedByUserId() {
    return createdByUserId;
  }


  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }


  public GetRateCenter200Response updatedByUserId(String updatedByUserId) {
    
    this.updatedByUserId = updatedByUserId;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return updatedByUserId
  **/
  @javax.annotation.Nullable
  public String getUpdatedByUserId() {
    return updatedByUserId;
  }


  public void setUpdatedByUserId(String updatedByUserId) {
    this.updatedByUserId = updatedByUserId;
  }


  public GetRateCenter200Response createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GetRateCenter200Response updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRateCenter200Response getRateCenter200Response = (GetRateCenter200Response) o;
    return Objects.equals(this.npa, getRateCenter200Response.npa) &&
        Objects.equals(this.nxx, getRateCenter200Response.nxx) &&
        Objects.equals(this.lata, getRateCenter200Response.lata) &&
        Objects.equals(this.locState, getRateCenter200Response.locState) &&
        Objects.equals(this.rcAbbre, getRateCenter200Response.rcAbbre) &&
        Objects.equals(this.id, getRateCenter200Response.id) &&
        Objects.equals(this.createdByUserId, getRateCenter200Response.createdByUserId) &&
        Objects.equals(this.updatedByUserId, getRateCenter200Response.updatedByUserId) &&
        Objects.equals(this.createdAt, getRateCenter200Response.createdAt) &&
        Objects.equals(this.updatedAt, getRateCenter200Response.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(npa, nxx, lata, locState, rcAbbre, id, createdByUserId, updatedByUserId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRateCenter200Response {\n");
    sb.append("    npa: ").append(toIndentedString(npa)).append("\n");
    sb.append("    nxx: ").append(toIndentedString(nxx)).append("\n");
    sb.append("    lata: ").append(toIndentedString(lata)).append("\n");
    sb.append("    locState: ").append(toIndentedString(locState)).append("\n");
    sb.append("    rcAbbre: ").append(toIndentedString(rcAbbre)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    updatedByUserId: ").append(toIndentedString(updatedByUserId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("npa");
    openapiFields.add("nxx");
    openapiFields.add("lata");
    openapiFields.add("locState");
    openapiFields.add("rcAbbre");
    openapiFields.add("_id");
    openapiFields.add("createdByUserId");
    openapiFields.add("updatedByUserId");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("npa");
    openapiRequiredFields.add("nxx");
    openapiRequiredFields.add("lata");
    openapiRequiredFields.add("locState");
    openapiRequiredFields.add("rcAbbre");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRateCenter200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetRateCenter200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRateCenter200Response is not found in the empty JSON string", GetRateCenter200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetRateCenter200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRateCenter200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetRateCenter200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("npa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `npa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("npa").toString()));
      }
      if (!jsonObj.get("nxx").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nxx` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nxx").toString()));
      }
      if (!jsonObj.get("lata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lata").toString()));
      }
      if (!jsonObj.get("locState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locState").toString()));
      }
      if (!jsonObj.get("rcAbbre").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rcAbbre` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rcAbbre").toString()));
      }
      if ((jsonObj.get("_id") != null && !jsonObj.get("_id").isJsonNull()) && !jsonObj.get("_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_id").toString()));
      }
      if ((jsonObj.get("createdByUserId") != null && !jsonObj.get("createdByUserId").isJsonNull()) && !jsonObj.get("createdByUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdByUserId").toString()));
      }
      if ((jsonObj.get("updatedByUserId") != null && !jsonObj.get("updatedByUserId").isJsonNull()) && !jsonObj.get("updatedByUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedByUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedByUserId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRateCenter200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRateCenter200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRateCenter200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRateCenter200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRateCenter200Response>() {
           @Override
           public void write(JsonWriter out, GetRateCenter200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRateCenter200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetRateCenter200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRateCenter200Response
  * @throws IOException if the JSON string is invalid with respect to GetRateCenter200Response
  */
  public static GetRateCenter200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRateCenter200Response.class);
  }

 /**
  * Convert an instance of GetRateCenter200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

