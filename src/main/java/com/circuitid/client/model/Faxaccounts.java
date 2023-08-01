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
 * Faxaccounts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T19:31:01.524Z[UTC]")
public class Faxaccounts {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order;

  public static final String SERIALIZED_NAME_INBOUND_NOTIFICATION = "inboundNotification";
  @SerializedName(SERIALIZED_NAME_INBOUND_NOTIFICATION)
  private String inboundNotification;

  public static final String SERIALIZED_NAME_OUTBOUND_NOTIFICATION = "outboundNotification";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_NOTIFICATION)
  private String outboundNotification;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public Faxaccounts() {
  }

  public Faxaccounts name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Faxaccounts order(String order) {
    
    this.order = order;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return order
  **/
  @javax.annotation.Nullable
  public String getOrder() {
    return order;
  }


  public void setOrder(String order) {
    this.order = order;
  }


  public Faxaccounts inboundNotification(String inboundNotification) {
    
    this.inboundNotification = inboundNotification;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return inboundNotification
  **/
  @javax.annotation.Nullable
  public String getInboundNotification() {
    return inboundNotification;
  }


  public void setInboundNotification(String inboundNotification) {
    this.inboundNotification = inboundNotification;
  }


  public Faxaccounts outboundNotification(String outboundNotification) {
    
    this.outboundNotification = outboundNotification;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return outboundNotification
  **/
  @javax.annotation.Nullable
  public String getOutboundNotification() {
    return outboundNotification;
  }


  public void setOutboundNotification(String outboundNotification) {
    this.outboundNotification = outboundNotification;
  }


  public Faxaccounts number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return number
  **/
  @javax.annotation.Nullable
  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Faxaccounts faxaccounts = (Faxaccounts) o;
    return Objects.equals(this.name, faxaccounts.name) &&
        Objects.equals(this.order, faxaccounts.order) &&
        Objects.equals(this.inboundNotification, faxaccounts.inboundNotification) &&
        Objects.equals(this.outboundNotification, faxaccounts.outboundNotification) &&
        Objects.equals(this.number, faxaccounts.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, order, inboundNotification, outboundNotification, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Faxaccounts {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    inboundNotification: ").append(toIndentedString(inboundNotification)).append("\n");
    sb.append("    outboundNotification: ").append(toIndentedString(outboundNotification)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("order");
    openapiFields.add("inboundNotification");
    openapiFields.add("outboundNotification");
    openapiFields.add("number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Faxaccounts
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Faxaccounts.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Faxaccounts is not found in the empty JSON string", Faxaccounts.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Faxaccounts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Faxaccounts` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Faxaccounts.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) && !jsonObj.get("order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order").toString()));
      }
      if ((jsonObj.get("inboundNotification") != null && !jsonObj.get("inboundNotification").isJsonNull()) && !jsonObj.get("inboundNotification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inboundNotification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inboundNotification").toString()));
      }
      if ((jsonObj.get("outboundNotification") != null && !jsonObj.get("outboundNotification").isJsonNull()) && !jsonObj.get("outboundNotification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outboundNotification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outboundNotification").toString()));
      }
      if ((jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()) && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Faxaccounts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Faxaccounts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Faxaccounts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Faxaccounts.class));

       return (TypeAdapter<T>) new TypeAdapter<Faxaccounts>() {
           @Override
           public void write(JsonWriter out, Faxaccounts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Faxaccounts read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Faxaccounts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Faxaccounts
  * @throws IOException if the JSON string is invalid with respect to Faxaccounts
  */
  public static Faxaccounts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Faxaccounts.class);
  }

 /**
  * Convert an instance of Faxaccounts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

