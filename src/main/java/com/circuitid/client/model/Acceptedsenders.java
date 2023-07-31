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
 * Acceptedsenders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-31T21:08:48.173Z[UTC]")
public class Acceptedsenders {
  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_SERVICE_REF = "serviceRef";
  @SerializedName(SERIALIZED_NAME_SERVICE_REF)
  private String serviceRef;

  /**
   * Gets or Sets ref
   */
  @JsonAdapter(RefEnum.Adapter.class)
  public enum RefEnum {
    USERS("users"),
    
    DOMAINS("domains"),
    
    CONTACTS("contacts");

    private String value;

    RefEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RefEnum fromValue(String value) {
      for (RefEnum b : RefEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RefEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RefEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RefEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RefEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private RefEnum ref;

  public Acceptedsenders() {
  }

  public Acceptedsenders _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return _object
  **/
  @javax.annotation.Nonnull
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public Acceptedsenders service(String service) {
    
    this.service = service;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return service
  **/
  @javax.annotation.Nonnull
  public String getService() {
    return service;
  }


  public void setService(String service) {
    this.service = service;
  }


  public Acceptedsenders serviceRef(String serviceRef) {
    
    this.serviceRef = serviceRef;
    return this;
  }

   /**
   * Get serviceRef
   * @return serviceRef
  **/
  @javax.annotation.Nonnull
  public String getServiceRef() {
    return serviceRef;
  }


  public void setServiceRef(String serviceRef) {
    this.serviceRef = serviceRef;
  }


  public Acceptedsenders ref(RefEnum ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @javax.annotation.Nonnull
  public RefEnum getRef() {
    return ref;
  }


  public void setRef(RefEnum ref) {
    this.ref = ref;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Acceptedsenders acceptedsenders = (Acceptedsenders) o;
    return Objects.equals(this._object, acceptedsenders._object) &&
        Objects.equals(this.service, acceptedsenders.service) &&
        Objects.equals(this.serviceRef, acceptedsenders.serviceRef) &&
        Objects.equals(this.ref, acceptedsenders.ref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, service, serviceRef, ref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Acceptedsenders {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    serviceRef: ").append(toIndentedString(serviceRef)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("service");
    openapiFields.add("serviceRef");
    openapiFields.add("ref");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("service");
    openapiRequiredFields.add("serviceRef");
    openapiRequiredFields.add("ref");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Acceptedsenders
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Acceptedsenders.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Acceptedsenders is not found in the empty JSON string", Acceptedsenders.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Acceptedsenders.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Acceptedsenders` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Acceptedsenders.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (!jsonObj.get("service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service").toString()));
      }
      if (!jsonObj.get("serviceRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceRef").toString()));
      }
      if (!jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Acceptedsenders.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Acceptedsenders' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Acceptedsenders> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Acceptedsenders.class));

       return (TypeAdapter<T>) new TypeAdapter<Acceptedsenders>() {
           @Override
           public void write(JsonWriter out, Acceptedsenders value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Acceptedsenders read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Acceptedsenders given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Acceptedsenders
  * @throws IOException if the JSON string is invalid with respect to Acceptedsenders
  */
  public static Acceptedsenders fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Acceptedsenders.class);
  }

 /**
  * Convert an instance of Acceptedsenders to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

