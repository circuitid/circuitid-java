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
 * GetMenuOption200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T19:52:01.559Z[UTC]")
public class GetMenuOption200Response {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DIGIT = "digit";
  @SerializedName(SERIALIZED_NAME_DIGIT)
  private Integer digit;

  public static final String SERIALIZED_NAME_MENUS = "menus";
  @SerializedName(SERIALIZED_NAME_MENUS)
  private Object menus = null;

  /**
   * Gets or Sets destinationType
   */
  @JsonAdapter(DestinationTypeEnum.Adapter.class)
  public enum DestinationTypeEnum {
    ANNOUNCEMENTS("announcements"),
    
    DIRECTORIES("directories"),
    
    PARK("park"),
    
    NUMBERS("numbers"),
    
    MENUS("menus"),
    
    USERS("users"),
    
    SERVERS("servers"),
    
    INBOUNDRULES("inboundrules"),
    
    CALLQUEUES("callqueues"),
    
    FAXACCOUNTS("faxaccounts"),
    
    CALLFORWARDING("callforwarding"),
    
    HANGUP("hangup"),
    
    PHONEINBOUNDRULES("phoneinboundrules"),
    
    VOICEMAILACCOUNTS("voicemailaccounts");

    private String value;

    DestinationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DestinationTypeEnum fromValue(String value) {
      for (DestinationTypeEnum b : DestinationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DestinationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DestinationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESTINATION_TYPE = "destinationType";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TYPE)
  private DestinationTypeEnum destinationType;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_CALL_FORWARDING_DESTINATION = "callForwardingDestination";
  @SerializedName(SERIALIZED_NAME_CALL_FORWARDING_DESTINATION)
  private String callForwardingDestination;

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

  public GetMenuOption200Response() {
  }

  public GetMenuOption200Response name(String name) {
    
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


  public GetMenuOption200Response digit(Integer digit) {
    
    this.digit = digit;
    return this;
  }

   /**
   * Get digit
   * @return digit
  **/
  @javax.annotation.Nonnull
  public Integer getDigit() {
    return digit;
  }


  public void setDigit(Integer digit) {
    this.digit = digit;
  }


  public GetMenuOption200Response menus(Object menus) {
    
    this.menus = menus;
    return this;
  }

   /**
   * Get menus
   * @return menus
  **/
  @javax.annotation.Nullable
  public Object getMenus() {
    return menus;
  }


  public void setMenus(Object menus) {
    this.menus = menus;
  }


  public GetMenuOption200Response destinationType(DestinationTypeEnum destinationType) {
    
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Get destinationType
   * @return destinationType
  **/
  @javax.annotation.Nonnull
  public DestinationTypeEnum getDestinationType() {
    return destinationType;
  }


  public void setDestinationType(DestinationTypeEnum destinationType) {
    this.destinationType = destinationType;
  }


  public GetMenuOption200Response destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return destination
  **/
  @javax.annotation.Nullable
  public String getDestination() {
    return destination;
  }


  public void setDestination(String destination) {
    this.destination = destination;
  }


  public GetMenuOption200Response ref(String ref) {
    
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


  public GetMenuOption200Response callForwardingDestination(String callForwardingDestination) {
    
    this.callForwardingDestination = callForwardingDestination;
    return this;
  }

   /**
   * Get callForwardingDestination
   * @return callForwardingDestination
  **/
  @javax.annotation.Nullable
  public String getCallForwardingDestination() {
    return callForwardingDestination;
  }


  public void setCallForwardingDestination(String callForwardingDestination) {
    this.callForwardingDestination = callForwardingDestination;
  }


  public GetMenuOption200Response id(String id) {
    
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


  public GetMenuOption200Response createdByUserId(String createdByUserId) {
    
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


  public GetMenuOption200Response updatedByUserId(String updatedByUserId) {
    
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


  public GetMenuOption200Response createdAt(OffsetDateTime createdAt) {
    
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


  public GetMenuOption200Response updatedAt(OffsetDateTime updatedAt) {
    
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
    GetMenuOption200Response getMenuOption200Response = (GetMenuOption200Response) o;
    return Objects.equals(this.name, getMenuOption200Response.name) &&
        Objects.equals(this.digit, getMenuOption200Response.digit) &&
        Objects.equals(this.menus, getMenuOption200Response.menus) &&
        Objects.equals(this.destinationType, getMenuOption200Response.destinationType) &&
        Objects.equals(this.destination, getMenuOption200Response.destination) &&
        Objects.equals(this.ref, getMenuOption200Response.ref) &&
        Objects.equals(this.callForwardingDestination, getMenuOption200Response.callForwardingDestination) &&
        Objects.equals(this.id, getMenuOption200Response.id) &&
        Objects.equals(this.createdByUserId, getMenuOption200Response.createdByUserId) &&
        Objects.equals(this.updatedByUserId, getMenuOption200Response.updatedByUserId) &&
        Objects.equals(this.createdAt, getMenuOption200Response.createdAt) &&
        Objects.equals(this.updatedAt, getMenuOption200Response.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, digit, menus, destinationType, destination, ref, callForwardingDestination, id, createdByUserId, updatedByUserId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMenuOption200Response {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    digit: ").append(toIndentedString(digit)).append("\n");
    sb.append("    menus: ").append(toIndentedString(menus)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    callForwardingDestination: ").append(toIndentedString(callForwardingDestination)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("digit");
    openapiFields.add("menus");
    openapiFields.add("destinationType");
    openapiFields.add("destination");
    openapiFields.add("ref");
    openapiFields.add("callForwardingDestination");
    openapiFields.add("_id");
    openapiFields.add("createdByUserId");
    openapiFields.add("updatedByUserId");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("digit");
    openapiRequiredFields.add("menus");
    openapiRequiredFields.add("destinationType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetMenuOption200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetMenuOption200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMenuOption200Response is not found in the empty JSON string", GetMenuOption200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetMenuOption200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMenuOption200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetMenuOption200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("destinationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destinationType").toString()));
      }
      if ((jsonObj.get("destination") != null && !jsonObj.get("destination").isJsonNull()) && !jsonObj.get("destination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination").toString()));
      }
      if ((jsonObj.get("ref") != null && !jsonObj.get("ref").isJsonNull()) && !jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      if ((jsonObj.get("callForwardingDestination") != null && !jsonObj.get("callForwardingDestination").isJsonNull()) && !jsonObj.get("callForwardingDestination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callForwardingDestination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callForwardingDestination").toString()));
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
       if (!GetMenuOption200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMenuOption200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMenuOption200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMenuOption200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMenuOption200Response>() {
           @Override
           public void write(JsonWriter out, GetMenuOption200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMenuOption200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMenuOption200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMenuOption200Response
  * @throws IOException if the JSON string is invalid with respect to GetMenuOption200Response
  */
  public static GetMenuOption200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMenuOption200Response.class);
  }

 /**
  * Convert an instance of GetMenuOption200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

