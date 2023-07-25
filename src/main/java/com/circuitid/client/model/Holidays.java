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
 * Holidays
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-25T10:32:07.025Z[UTC]")
public class Holidays {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name = null;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private Object _object = null;

  public static final String SERIALIZED_NAME_OBJECT_REF = "objectRef";
  @SerializedName(SERIALIZED_NAME_OBJECT_REF)
  private Object objectRef = null;

  public static final String SERIALIZED_NAME_DATE_TIME_RANGES = "dateTimeRanges";
  @SerializedName(SERIALIZED_NAME_DATE_TIME_RANGES)
  private Object dateTimeRanges = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Object status = 1;

  public static final String SERIALIZED_NAME_DESTINATION_TYPE = "destinationType";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TYPE)
  private Object destinationType = null;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private Object destination = null;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private Object ref = null;

  public static final String SERIALIZED_NAME_CALL_FORWARDING_DESTINATION = "callForwardingDestination";
  @SerializedName(SERIALIZED_NAME_CALL_FORWARDING_DESTINATION)
  private Object callForwardingDestination = null;

  public Holidays() {
  }

  public Holidays name(Object name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public Object getName() {
    return name;
  }


  public void setName(Object name) {
    this.name = name;
  }


  public Holidays _object(Object _object) {
    
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


  public Holidays objectRef(Object objectRef) {
    
    this.objectRef = objectRef;
    return this;
  }

   /**
   * Get objectRef
   * @return objectRef
  **/
  @javax.annotation.Nullable
  public Object getObjectRef() {
    return objectRef;
  }


  public void setObjectRef(Object objectRef) {
    this.objectRef = objectRef;
  }


  public Holidays dateTimeRanges(Object dateTimeRanges) {
    
    this.dateTimeRanges = dateTimeRanges;
    return this;
  }

   /**
   * Get dateTimeRanges
   * @return dateTimeRanges
  **/
  @javax.annotation.Nullable
  public Object getDateTimeRanges() {
    return dateTimeRanges;
  }


  public void setDateTimeRanges(Object dateTimeRanges) {
    this.dateTimeRanges = dateTimeRanges;
  }


  public Holidays status(Object status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Object getStatus() {
    return status;
  }


  public void setStatus(Object status) {
    this.status = status;
  }


  public Holidays destinationType(Object destinationType) {
    
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Get destinationType
   * @return destinationType
  **/
  @javax.annotation.Nullable
  public Object getDestinationType() {
    return destinationType;
  }


  public void setDestinationType(Object destinationType) {
    this.destinationType = destinationType;
  }


  public Holidays destination(Object destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return destination
  **/
  @javax.annotation.Nullable
  public Object getDestination() {
    return destination;
  }


  public void setDestination(Object destination) {
    this.destination = destination;
  }


  public Holidays ref(Object ref) {
    
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


  public Holidays callForwardingDestination(Object callForwardingDestination) {
    
    this.callForwardingDestination = callForwardingDestination;
    return this;
  }

   /**
   * Get callForwardingDestination
   * @return callForwardingDestination
  **/
  @javax.annotation.Nullable
  public Object getCallForwardingDestination() {
    return callForwardingDestination;
  }


  public void setCallForwardingDestination(Object callForwardingDestination) {
    this.callForwardingDestination = callForwardingDestination;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Holidays holidays = (Holidays) o;
    return Objects.equals(this.name, holidays.name) &&
        Objects.equals(this._object, holidays._object) &&
        Objects.equals(this.objectRef, holidays.objectRef) &&
        Objects.equals(this.dateTimeRanges, holidays.dateTimeRanges) &&
        Objects.equals(this.status, holidays.status) &&
        Objects.equals(this.destinationType, holidays.destinationType) &&
        Objects.equals(this.destination, holidays.destination) &&
        Objects.equals(this.ref, holidays.ref) &&
        Objects.equals(this.callForwardingDestination, holidays.callForwardingDestination);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, _object, objectRef, dateTimeRanges, status, destinationType, destination, ref, callForwardingDestination);
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
    sb.append("class Holidays {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    objectRef: ").append(toIndentedString(objectRef)).append("\n");
    sb.append("    dateTimeRanges: ").append(toIndentedString(dateTimeRanges)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    callForwardingDestination: ").append(toIndentedString(callForwardingDestination)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("objectRef");
    openapiFields.add("dateTimeRanges");
    openapiFields.add("status");
    openapiFields.add("destinationType");
    openapiFields.add("destination");
    openapiFields.add("ref");
    openapiFields.add("callForwardingDestination");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("objectRef");
    openapiRequiredFields.add("dateTimeRanges");
    openapiRequiredFields.add("destinationType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Holidays
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Holidays.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Holidays is not found in the empty JSON string", Holidays.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Holidays.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Holidays` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Holidays.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Holidays.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Holidays' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Holidays> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Holidays.class));

       return (TypeAdapter<T>) new TypeAdapter<Holidays>() {
           @Override
           public void write(JsonWriter out, Holidays value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Holidays read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Holidays given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Holidays
  * @throws IOException if the JSON string is invalid with respect to Holidays
  */
  public static Holidays fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Holidays.class);
  }

 /**
  * Convert an instance of Holidays to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

