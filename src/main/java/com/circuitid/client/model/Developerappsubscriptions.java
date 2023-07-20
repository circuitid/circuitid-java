/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.8
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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Developerappsubscriptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-20T03:15:48.668Z[UTC]")
public class Developerappsubscriptions {
  public static final String SERIALIZED_NAME_DEVELOPER_APP = "developerApp";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_APP)
  private Object developerApp = null;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private Object _object = null;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private Object ref = null;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private Object permissions = {};

  /**
   * Gets or Sets requireId
   */
  @JsonAdapter(RequireIdEnum.Adapter.class)
  public enum RequireIdEnum {
    _1("1"),
    
    _0("0");

    private Object value;

    RequireIdEnum(Object value) {
      this.value = value;
    }

    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RequireIdEnum fromValue(Object value) {
      for (RequireIdEnum b : RequireIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RequireIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequireIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequireIdEnum read(final JsonReader jsonReader) throws IOException {
        Object value =  jsonReader.nextObject();
        return RequireIdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REQUIRE_ID = "requireId";
  @SerializedName(SERIALIZED_NAME_REQUIRE_ID)
  private RequireIdEnum requireId = 0;

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private Object services = null;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private Object events = null;

  public Developerappsubscriptions() {
  }

  public Developerappsubscriptions developerApp(Object developerApp) {
    
    this.developerApp = developerApp;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return developerApp
  **/
  @javax.annotation.Nullable
  public Object getDeveloperApp() {
    return developerApp;
  }


  public void setDeveloperApp(Object developerApp) {
    this.developerApp = developerApp;
  }


  public Developerappsubscriptions _object(Object _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return _object
  **/
  @javax.annotation.Nullable
  public Object getObject() {
    return _object;
  }


  public void setObject(Object _object) {
    this._object = _object;
  }


  public Developerappsubscriptions ref(Object ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @javax.annotation.Nullable
  public Object getRef() {
    return ref;
  }


  public void setRef(Object ref) {
    this.ref = ref;
  }


  public Developerappsubscriptions permissions(Object permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  public Object getPermissions() {
    return permissions;
  }


  public void setPermissions(Object permissions) {
    this.permissions = permissions;
  }


  public Developerappsubscriptions requireId(RequireIdEnum requireId) {
    
    this.requireId = requireId;
    return this;
  }

   /**
   * Get requireId
   * @return requireId
  **/
  @javax.annotation.Nullable
  public RequireIdEnum getRequireId() {
    return requireId;
  }


  public void setRequireId(RequireIdEnum requireId) {
    this.requireId = requireId;
  }


  public Developerappsubscriptions services(Object services) {
    
    this.services = services;
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @javax.annotation.Nullable
  public Object getServices() {
    return services;
  }


  public void setServices(Object services) {
    this.services = services;
  }


  public Developerappsubscriptions events(Object events) {
    
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  public Object getEvents() {
    return events;
  }


  public void setEvents(Object events) {
    this.events = events;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Developerappsubscriptions developerappsubscriptions = (Developerappsubscriptions) o;
    return Objects.equals(this.developerApp, developerappsubscriptions.developerApp) &&
        Objects.equals(this._object, developerappsubscriptions._object) &&
        Objects.equals(this.ref, developerappsubscriptions.ref) &&
        Objects.equals(this.permissions, developerappsubscriptions.permissions) &&
        Objects.equals(this.requireId, developerappsubscriptions.requireId) &&
        Objects.equals(this.services, developerappsubscriptions.services) &&
        Objects.equals(this.events, developerappsubscriptions.events);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(developerApp, _object, ref, permissions, requireId, services, events);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Developerappsubscriptions {\n");
    sb.append("    developerApp: ").append(toIndentedString(developerApp)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    requireId: ").append(toIndentedString(requireId)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
    openapiFields.add("developerApp");
    openapiFields.add("object");
    openapiFields.add("ref");
    openapiFields.add("permissions");
    openapiFields.add("requireId");
    openapiFields.add("services");
    openapiFields.add("events");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("developerApp");
    openapiRequiredFields.add("services");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Developerappsubscriptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Developerappsubscriptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Developerappsubscriptions is not found in the empty JSON string", Developerappsubscriptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Developerappsubscriptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Developerappsubscriptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Developerappsubscriptions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Developerappsubscriptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Developerappsubscriptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Developerappsubscriptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Developerappsubscriptions.class));

       return (TypeAdapter<T>) new TypeAdapter<Developerappsubscriptions>() {
           @Override
           public void write(JsonWriter out, Developerappsubscriptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Developerappsubscriptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Developerappsubscriptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Developerappsubscriptions
  * @throws IOException if the JSON string is invalid with respect to Developerappsubscriptions
  */
  public static Developerappsubscriptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Developerappsubscriptions.class);
  }

 /**
  * Convert an instance of Developerappsubscriptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

