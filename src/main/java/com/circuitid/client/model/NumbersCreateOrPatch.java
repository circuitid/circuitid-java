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
 * NumbersCreateOrPatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T20:07:07.395Z[UTC]")
public class NumbersCreateOrPatch {
  public static final String SERIALIZED_NAME_DIRECTORY_LISTING = "directoryListing";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_LISTING)
  private String directoryListing;

  public static final String SERIALIZED_NAME_CALLER_NAME = "callerName";
  @SerializedName(SERIALIZED_NAME_CALLER_NAME)
  private String callerName;

  public static final String SERIALIZED_NAME_E911 = "e911";
  @SerializedName(SERIALIZED_NAME_E911)
  private String e911;

  public static final String SERIALIZED_NAME_MESSAGE_CAMPAIGN = "messageCampaign";
  @SerializedName(SERIALIZED_NAME_MESSAGE_CAMPAIGN)
  private String messageCampaign;

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
  private DestinationTypeEnum destinationType = DestinationTypeEnum.PARK;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_CALL_FORWARDING_DESTINATION = "callForwardingDestination";
  @SerializedName(SERIALIZED_NAME_CALL_FORWARDING_DESTINATION)
  private String callForwardingDestination;

  public NumbersCreateOrPatch() {
  }

  public NumbersCreateOrPatch directoryListing(String directoryListing) {
    
    this.directoryListing = directoryListing;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return directoryListing
  **/
  @javax.annotation.Nullable
  public String getDirectoryListing() {
    return directoryListing;
  }


  public void setDirectoryListing(String directoryListing) {
    this.directoryListing = directoryListing;
  }


  public NumbersCreateOrPatch callerName(String callerName) {
    
    this.callerName = callerName;
    return this;
  }

   /**
   * Get callerName
   * @return callerName
  **/
  @javax.annotation.Nullable
  public String getCallerName() {
    return callerName;
  }


  public void setCallerName(String callerName) {
    this.callerName = callerName;
  }


  public NumbersCreateOrPatch e911(String e911) {
    
    this.e911 = e911;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return e911
  **/
  @javax.annotation.Nullable
  public String getE911() {
    return e911;
  }


  public void setE911(String e911) {
    this.e911 = e911;
  }


  public NumbersCreateOrPatch messageCampaign(String messageCampaign) {
    
    this.messageCampaign = messageCampaign;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return messageCampaign
  **/
  @javax.annotation.Nullable
  public String getMessageCampaign() {
    return messageCampaign;
  }


  public void setMessageCampaign(String messageCampaign) {
    this.messageCampaign = messageCampaign;
  }


  public NumbersCreateOrPatch destinationType(DestinationTypeEnum destinationType) {
    
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


  public NumbersCreateOrPatch destination(String destination) {
    
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


  public NumbersCreateOrPatch callForwardingDestination(String callForwardingDestination) {
    
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
    NumbersCreateOrPatch numbersCreateOrPatch = (NumbersCreateOrPatch) o;
    return Objects.equals(this.directoryListing, numbersCreateOrPatch.directoryListing) &&
        Objects.equals(this.callerName, numbersCreateOrPatch.callerName) &&
        Objects.equals(this.e911, numbersCreateOrPatch.e911) &&
        Objects.equals(this.messageCampaign, numbersCreateOrPatch.messageCampaign) &&
        Objects.equals(this.destinationType, numbersCreateOrPatch.destinationType) &&
        Objects.equals(this.destination, numbersCreateOrPatch.destination) &&
        Objects.equals(this.callForwardingDestination, numbersCreateOrPatch.callForwardingDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryListing, callerName, e911, messageCampaign, destinationType, destination, callForwardingDestination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumbersCreateOrPatch {\n");
    sb.append("    directoryListing: ").append(toIndentedString(directoryListing)).append("\n");
    sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
    sb.append("    e911: ").append(toIndentedString(e911)).append("\n");
    sb.append("    messageCampaign: ").append(toIndentedString(messageCampaign)).append("\n");
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
    openapiFields.add("directoryListing");
    openapiFields.add("callerName");
    openapiFields.add("e911");
    openapiFields.add("messageCampaign");
    openapiFields.add("destinationType");
    openapiFields.add("destination");
    openapiFields.add("callForwardingDestination");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("destinationType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NumbersCreateOrPatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NumbersCreateOrPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NumbersCreateOrPatch is not found in the empty JSON string", NumbersCreateOrPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NumbersCreateOrPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NumbersCreateOrPatch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NumbersCreateOrPatch.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("directoryListing") != null && !jsonObj.get("directoryListing").isJsonNull()) && !jsonObj.get("directoryListing").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directoryListing` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directoryListing").toString()));
      }
      if ((jsonObj.get("callerName") != null && !jsonObj.get("callerName").isJsonNull()) && !jsonObj.get("callerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callerName").toString()));
      }
      if ((jsonObj.get("e911") != null && !jsonObj.get("e911").isJsonNull()) && !jsonObj.get("e911").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `e911` to be a primitive type in the JSON string but got `%s`", jsonObj.get("e911").toString()));
      }
      if ((jsonObj.get("messageCampaign") != null && !jsonObj.get("messageCampaign").isJsonNull()) && !jsonObj.get("messageCampaign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageCampaign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageCampaign").toString()));
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
       if (!NumbersCreateOrPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NumbersCreateOrPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NumbersCreateOrPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NumbersCreateOrPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<NumbersCreateOrPatch>() {
           @Override
           public void write(JsonWriter out, NumbersCreateOrPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NumbersCreateOrPatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NumbersCreateOrPatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NumbersCreateOrPatch
  * @throws IOException if the JSON string is invalid with respect to NumbersCreateOrPatch
  */
  public static NumbersCreateOrPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NumbersCreateOrPatch.class);
  }

 /**
  * Convert an instance of NumbersCreateOrPatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

