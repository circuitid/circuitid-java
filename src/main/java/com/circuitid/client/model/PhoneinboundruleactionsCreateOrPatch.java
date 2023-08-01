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
 * PhoneinboundruleactionsCreateOrPatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T19:31:01.524Z[UTC]")
public class PhoneinboundruleactionsCreateOrPatch {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONEINBOUNDRULE = "phoneinboundrule";
  @SerializedName(SERIALIZED_NAME_PHONEINBOUNDRULE)
  private String phoneinboundrule;

  public static final String SERIALIZED_NAME_TIMESCHEDULE = "timeschedule";
  @SerializedName(SERIALIZED_NAME_TIMESCHEDULE)
  private String timeschedule;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    StatusEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(Integer value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status = StatusEnum.NUMBER_1;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority = 1;

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

  public static final String SERIALIZED_NAME_CALL_FORWARDING_DESTINATION = "callForwardingDestination";
  @SerializedName(SERIALIZED_NAME_CALL_FORWARDING_DESTINATION)
  private String callForwardingDestination;

  public PhoneinboundruleactionsCreateOrPatch() {
  }

  public PhoneinboundruleactionsCreateOrPatch name(String name) {
    
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


  public PhoneinboundruleactionsCreateOrPatch phoneinboundrule(String phoneinboundrule) {
    
    this.phoneinboundrule = phoneinboundrule;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return phoneinboundrule
  **/
  @javax.annotation.Nonnull
  public String getPhoneinboundrule() {
    return phoneinboundrule;
  }


  public void setPhoneinboundrule(String phoneinboundrule) {
    this.phoneinboundrule = phoneinboundrule;
  }


  public PhoneinboundruleactionsCreateOrPatch timeschedule(String timeschedule) {
    
    this.timeschedule = timeschedule;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return timeschedule
  **/
  @javax.annotation.Nullable
  public String getTimeschedule() {
    return timeschedule;
  }


  public void setTimeschedule(String timeschedule) {
    this.timeschedule = timeschedule;
  }


  public PhoneinboundruleactionsCreateOrPatch timeout(Integer timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @javax.annotation.Nullable
  public Integer getTimeout() {
    return timeout;
  }


  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public PhoneinboundruleactionsCreateOrPatch status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PhoneinboundruleactionsCreateOrPatch priority(Integer priority) {
    
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


  public PhoneinboundruleactionsCreateOrPatch destinationType(DestinationTypeEnum destinationType) {
    
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


  public PhoneinboundruleactionsCreateOrPatch destination(String destination) {
    
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


  public PhoneinboundruleactionsCreateOrPatch callForwardingDestination(String callForwardingDestination) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneinboundruleactionsCreateOrPatch phoneinboundruleactionsCreateOrPatch = (PhoneinboundruleactionsCreateOrPatch) o;
    return Objects.equals(this.name, phoneinboundruleactionsCreateOrPatch.name) &&
        Objects.equals(this.phoneinboundrule, phoneinboundruleactionsCreateOrPatch.phoneinboundrule) &&
        Objects.equals(this.timeschedule, phoneinboundruleactionsCreateOrPatch.timeschedule) &&
        Objects.equals(this.timeout, phoneinboundruleactionsCreateOrPatch.timeout) &&
        Objects.equals(this.status, phoneinboundruleactionsCreateOrPatch.status) &&
        Objects.equals(this.priority, phoneinboundruleactionsCreateOrPatch.priority) &&
        Objects.equals(this.destinationType, phoneinboundruleactionsCreateOrPatch.destinationType) &&
        Objects.equals(this.destination, phoneinboundruleactionsCreateOrPatch.destination) &&
        Objects.equals(this.callForwardingDestination, phoneinboundruleactionsCreateOrPatch.callForwardingDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phoneinboundrule, timeschedule, timeout, status, priority, destinationType, destination, callForwardingDestination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneinboundruleactionsCreateOrPatch {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneinboundrule: ").append(toIndentedString(phoneinboundrule)).append("\n");
    sb.append("    timeschedule: ").append(toIndentedString(timeschedule)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
    openapiFields.add("phoneinboundrule");
    openapiFields.add("timeschedule");
    openapiFields.add("timeout");
    openapiFields.add("status");
    openapiFields.add("priority");
    openapiFields.add("destinationType");
    openapiFields.add("destination");
    openapiFields.add("callForwardingDestination");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("phoneinboundrule");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("destinationType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PhoneinboundruleactionsCreateOrPatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PhoneinboundruleactionsCreateOrPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PhoneinboundruleactionsCreateOrPatch is not found in the empty JSON string", PhoneinboundruleactionsCreateOrPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PhoneinboundruleactionsCreateOrPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PhoneinboundruleactionsCreateOrPatch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PhoneinboundruleactionsCreateOrPatch.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("phoneinboundrule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneinboundrule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneinboundrule").toString()));
      }
      if ((jsonObj.get("timeschedule") != null && !jsonObj.get("timeschedule").isJsonNull()) && !jsonObj.get("timeschedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeschedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeschedule").toString()));
      }
      if (!jsonObj.get("destinationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destinationType").toString()));
      }
      if ((jsonObj.get("destination") != null && !jsonObj.get("destination").isJsonNull()) && !jsonObj.get("destination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination").toString()));
      }
      if ((jsonObj.get("callForwardingDestination") != null && !jsonObj.get("callForwardingDestination").isJsonNull()) && !jsonObj.get("callForwardingDestination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callForwardingDestination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callForwardingDestination").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PhoneinboundruleactionsCreateOrPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PhoneinboundruleactionsCreateOrPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PhoneinboundruleactionsCreateOrPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PhoneinboundruleactionsCreateOrPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<PhoneinboundruleactionsCreateOrPatch>() {
           @Override
           public void write(JsonWriter out, PhoneinboundruleactionsCreateOrPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PhoneinboundruleactionsCreateOrPatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PhoneinboundruleactionsCreateOrPatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PhoneinboundruleactionsCreateOrPatch
  * @throws IOException if the JSON string is invalid with respect to PhoneinboundruleactionsCreateOrPatch
  */
  public static PhoneinboundruleactionsCreateOrPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PhoneinboundruleactionsCreateOrPatch.class);
  }

 /**
  * Convert an instance of PhoneinboundruleactionsCreateOrPatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

