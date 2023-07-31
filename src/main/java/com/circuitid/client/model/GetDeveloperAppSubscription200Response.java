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
import java.time.OffsetDateTime;
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
 * GetDeveloperAppSubscription200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-31T19:48:25.560Z[UTC]")
public class GetDeveloperAppSubscription200Response {
  public static final String SERIALIZED_NAME_DEVELOPER_APP = "developerApp";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_APP)
  private String developerApp;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private Object permissions;

  /**
   * Gets or Sets requireId
   */
  @JsonAdapter(RequireIdEnum.Adapter.class)
  public enum RequireIdEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    RequireIdEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RequireIdEnum fromValue(Integer value) {
      for (RequireIdEnum b : RequireIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RequireIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequireIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequireIdEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return RequireIdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REQUIRE_ID = "requireId";
  @SerializedName(SERIALIZED_NAME_REQUIRE_ID)
  private RequireIdEnum requireId = RequireIdEnum.NUMBER_0;

  /**
   * Gets or Sets services
   */
  @JsonAdapter(ServicesEnum.Adapter.class)
  public enum ServicesEnum {
    CALENDAREVENTS("calendarevents"),
    
    CALLQUEUES("callqueues"),
    
    CDRS("cdrs"),
    
    CHATMESSAGES("chatmessages"),
    
    CONTACTS("contacts"),
    
    CONVERSATIONMESSAGES("conversationmessages"),
    
    FAXES("faxes"),
    
    FIREWALL("firewall"),
    
    USERS("users"),
    
    VOICEMAIL("voicemail");

    private String value;

    ServicesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServicesEnum fromValue(String value) {
      for (ServicesEnum b : ServicesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ServicesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServicesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServicesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ServicesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private List<ServicesEnum> services = new ArrayList<>();

  /**
   * Gets or Sets events
   */
  @JsonAdapter(EventsEnum.Adapter.class)
  public enum EventsEnum {
    CREATE("create"),
    
    PATCH("patch"),
    
    REMOVED("removed");

    private String value;

    EventsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventsEnum fromValue(String value) {
      for (EventsEnum b : EventsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<EventsEnum> events;

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

  public GetDeveloperAppSubscription200Response() {
  }

  public GetDeveloperAppSubscription200Response developerApp(String developerApp) {
    
    this.developerApp = developerApp;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return developerApp
  **/
  @javax.annotation.Nonnull
  public String getDeveloperApp() {
    return developerApp;
  }


  public void setDeveloperApp(String developerApp) {
    this.developerApp = developerApp;
  }


  public GetDeveloperAppSubscription200Response _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return _object
  **/
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public GetDeveloperAppSubscription200Response ref(String ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @javax.annotation.Nullable
  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    this.ref = ref;
  }


  public GetDeveloperAppSubscription200Response permissions(Object permissions) {
    
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


  public GetDeveloperAppSubscription200Response requireId(RequireIdEnum requireId) {
    
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


  public GetDeveloperAppSubscription200Response services(List<ServicesEnum> services) {
    
    this.services = services;
    return this;
  }

  public GetDeveloperAppSubscription200Response addServicesItem(ServicesEnum servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @javax.annotation.Nonnull
  public List<ServicesEnum> getServices() {
    return services;
  }


  public void setServices(List<ServicesEnum> services) {
    this.services = services;
  }


  public GetDeveloperAppSubscription200Response events(List<EventsEnum> events) {
    
    this.events = events;
    return this;
  }

  public GetDeveloperAppSubscription200Response addEventsItem(EventsEnum eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  public List<EventsEnum> getEvents() {
    return events;
  }


  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }


  public GetDeveloperAppSubscription200Response id(String id) {
    
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


  public GetDeveloperAppSubscription200Response createdByUserId(String createdByUserId) {
    
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


  public GetDeveloperAppSubscription200Response updatedByUserId(String updatedByUserId) {
    
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


  public GetDeveloperAppSubscription200Response createdAt(OffsetDateTime createdAt) {
    
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


  public GetDeveloperAppSubscription200Response updatedAt(OffsetDateTime updatedAt) {
    
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
    GetDeveloperAppSubscription200Response getDeveloperAppSubscription200Response = (GetDeveloperAppSubscription200Response) o;
    return Objects.equals(this.developerApp, getDeveloperAppSubscription200Response.developerApp) &&
        Objects.equals(this._object, getDeveloperAppSubscription200Response._object) &&
        Objects.equals(this.ref, getDeveloperAppSubscription200Response.ref) &&
        Objects.equals(this.permissions, getDeveloperAppSubscription200Response.permissions) &&
        Objects.equals(this.requireId, getDeveloperAppSubscription200Response.requireId) &&
        Objects.equals(this.services, getDeveloperAppSubscription200Response.services) &&
        Objects.equals(this.events, getDeveloperAppSubscription200Response.events) &&
        Objects.equals(this.id, getDeveloperAppSubscription200Response.id) &&
        Objects.equals(this.createdByUserId, getDeveloperAppSubscription200Response.createdByUserId) &&
        Objects.equals(this.updatedByUserId, getDeveloperAppSubscription200Response.updatedByUserId) &&
        Objects.equals(this.createdAt, getDeveloperAppSubscription200Response.createdAt) &&
        Objects.equals(this.updatedAt, getDeveloperAppSubscription200Response.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(developerApp, _object, ref, permissions, requireId, services, events, id, createdByUserId, updatedByUserId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDeveloperAppSubscription200Response {\n");
    sb.append("    developerApp: ").append(toIndentedString(developerApp)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    requireId: ").append(toIndentedString(requireId)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
    openapiFields.add("developerApp");
    openapiFields.add("object");
    openapiFields.add("ref");
    openapiFields.add("permissions");
    openapiFields.add("requireId");
    openapiFields.add("services");
    openapiFields.add("events");
    openapiFields.add("_id");
    openapiFields.add("createdByUserId");
    openapiFields.add("updatedByUserId");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("developerApp");
    openapiRequiredFields.add("services");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetDeveloperAppSubscription200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetDeveloperAppSubscription200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDeveloperAppSubscription200Response is not found in the empty JSON string", GetDeveloperAppSubscription200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetDeveloperAppSubscription200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDeveloperAppSubscription200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetDeveloperAppSubscription200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("developerApp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `developerApp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("developerApp").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if ((jsonObj.get("ref") != null && !jsonObj.get("ref").isJsonNull()) && !jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("services") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("services").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `services` to be an array in the JSON string but got `%s`", jsonObj.get("services").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("events") != null && !jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
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
       if (!GetDeveloperAppSubscription200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDeveloperAppSubscription200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDeveloperAppSubscription200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDeveloperAppSubscription200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDeveloperAppSubscription200Response>() {
           @Override
           public void write(JsonWriter out, GetDeveloperAppSubscription200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDeveloperAppSubscription200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetDeveloperAppSubscription200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDeveloperAppSubscription200Response
  * @throws IOException if the JSON string is invalid with respect to GetDeveloperAppSubscription200Response
  */
  public static GetDeveloperAppSubscription200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDeveloperAppSubscription200Response.class);
  }

 /**
  * Convert an instance of GetDeveloperAppSubscription200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

