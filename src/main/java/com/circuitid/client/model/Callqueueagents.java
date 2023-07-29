/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.19
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
 * Callqueueagents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-29T10:23:10.920Z[UTC]")
public class Callqueueagents {
  public static final String SERIALIZED_NAME_CALLQUEUE = "callqueue";
  @SerializedName(SERIALIZED_NAME_CALLQUEUE)
  private String callqueue;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority = 1;

  public static final String SERIALIZED_NAME_TIER = "tier";
  @SerializedName(SERIALIZED_NAME_TIER)
  private Integer tier = 1;

  public Callqueueagents() {
  }

  public Callqueueagents callqueue(String callqueue) {
    
    this.callqueue = callqueue;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return callqueue
  **/
  @javax.annotation.Nonnull
  public String getCallqueue() {
    return callqueue;
  }


  public void setCallqueue(String callqueue) {
    this.callqueue = callqueue;
  }


  public Callqueueagents user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return user
  **/
  @javax.annotation.Nonnull
  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  public Callqueueagents priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nonnull
  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public Callqueueagents tier(Integer tier) {
    
    this.tier = tier;
    return this;
  }

   /**
   * Get tier
   * @return tier
  **/
  @javax.annotation.Nonnull
  public Integer getTier() {
    return tier;
  }


  public void setTier(Integer tier) {
    this.tier = tier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Callqueueagents callqueueagents = (Callqueueagents) o;
    return Objects.equals(this.callqueue, callqueueagents.callqueue) &&
        Objects.equals(this.user, callqueueagents.user) &&
        Objects.equals(this.priority, callqueueagents.priority) &&
        Objects.equals(this.tier, callqueueagents.tier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callqueue, user, priority, tier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Callqueueagents {\n");
    sb.append("    callqueue: ").append(toIndentedString(callqueue)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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
    openapiFields.add("callqueue");
    openapiFields.add("user");
    openapiFields.add("priority");
    openapiFields.add("tier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("callqueue");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("tier");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Callqueueagents
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Callqueueagents.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Callqueueagents is not found in the empty JSON string", Callqueueagents.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Callqueueagents.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Callqueueagents` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Callqueueagents.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("callqueue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callqueue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callqueue").toString()));
      }
      if (!jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Callqueueagents.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Callqueueagents' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Callqueueagents> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Callqueueagents.class));

       return (TypeAdapter<T>) new TypeAdapter<Callqueueagents>() {
           @Override
           public void write(JsonWriter out, Callqueueagents value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Callqueueagents read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Callqueueagents given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Callqueueagents
  * @throws IOException if the JSON string is invalid with respect to Callqueueagents
  */
  public static Callqueueagents fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Callqueueagents.class);
  }

 /**
  * Convert an instance of Callqueueagents to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

