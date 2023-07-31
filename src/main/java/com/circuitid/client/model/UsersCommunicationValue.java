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
import com.circuitid.client.model.UsersCommunicationValueNotifications;
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
 * UsersCommunicationValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-31T20:43:40.997Z[UTC]")
public class UsersCommunicationValue {
  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private UsersCommunicationValueNotifications notifications;

  public static final String SERIALIZED_NAME_MISSED_CALLS = "missedCalls";
  @SerializedName(SERIALIZED_NAME_MISSED_CALLS)
  private UsersCommunicationValueNotifications missedCalls;

  public static final String SERIALIZED_NAME_CALL_RECORDINGS = "callRecordings";
  @SerializedName(SERIALIZED_NAME_CALL_RECORDINGS)
  private UsersCommunicationValueNotifications callRecordings;

  public static final String SERIALIZED_NAME_NEWSLETTERS = "newsletters";
  @SerializedName(SERIALIZED_NAME_NEWSLETTERS)
  private UsersCommunicationValueNotifications newsletters;

  public static final String SERIALIZED_NAME_VOICEMAILS = "voicemails";
  @SerializedName(SERIALIZED_NAME_VOICEMAILS)
  private UsersCommunicationValueNotifications voicemails;

  public static final String SERIALIZED_NAME_WEB = "web";
  @SerializedName(SERIALIZED_NAME_WEB)
  private UsersCommunicationValueNotifications web;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private UsersCommunicationValueNotifications email;

  public UsersCommunicationValue() {
  }

  public UsersCommunicationValue notifications(UsersCommunicationValueNotifications notifications) {
    
    this.notifications = notifications;
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @javax.annotation.Nullable
  public UsersCommunicationValueNotifications getNotifications() {
    return notifications;
  }


  public void setNotifications(UsersCommunicationValueNotifications notifications) {
    this.notifications = notifications;
  }


  public UsersCommunicationValue missedCalls(UsersCommunicationValueNotifications missedCalls) {
    
    this.missedCalls = missedCalls;
    return this;
  }

   /**
   * Get missedCalls
   * @return missedCalls
  **/
  @javax.annotation.Nullable
  public UsersCommunicationValueNotifications getMissedCalls() {
    return missedCalls;
  }


  public void setMissedCalls(UsersCommunicationValueNotifications missedCalls) {
    this.missedCalls = missedCalls;
  }


  public UsersCommunicationValue callRecordings(UsersCommunicationValueNotifications callRecordings) {
    
    this.callRecordings = callRecordings;
    return this;
  }

   /**
   * Get callRecordings
   * @return callRecordings
  **/
  @javax.annotation.Nullable
  public UsersCommunicationValueNotifications getCallRecordings() {
    return callRecordings;
  }


  public void setCallRecordings(UsersCommunicationValueNotifications callRecordings) {
    this.callRecordings = callRecordings;
  }


  public UsersCommunicationValue newsletters(UsersCommunicationValueNotifications newsletters) {
    
    this.newsletters = newsletters;
    return this;
  }

   /**
   * Get newsletters
   * @return newsletters
  **/
  @javax.annotation.Nullable
  public UsersCommunicationValueNotifications getNewsletters() {
    return newsletters;
  }


  public void setNewsletters(UsersCommunicationValueNotifications newsletters) {
    this.newsletters = newsletters;
  }


  public UsersCommunicationValue voicemails(UsersCommunicationValueNotifications voicemails) {
    
    this.voicemails = voicemails;
    return this;
  }

   /**
   * Get voicemails
   * @return voicemails
  **/
  @javax.annotation.Nullable
  public UsersCommunicationValueNotifications getVoicemails() {
    return voicemails;
  }


  public void setVoicemails(UsersCommunicationValueNotifications voicemails) {
    this.voicemails = voicemails;
  }


  public UsersCommunicationValue web(UsersCommunicationValueNotifications web) {
    
    this.web = web;
    return this;
  }

   /**
   * Get web
   * @return web
  **/
  @javax.annotation.Nullable
  public UsersCommunicationValueNotifications getWeb() {
    return web;
  }


  public void setWeb(UsersCommunicationValueNotifications web) {
    this.web = web;
  }


  public UsersCommunicationValue email(UsersCommunicationValueNotifications email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public UsersCommunicationValueNotifications getEmail() {
    return email;
  }


  public void setEmail(UsersCommunicationValueNotifications email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersCommunicationValue usersCommunicationValue = (UsersCommunicationValue) o;
    return Objects.equals(this.notifications, usersCommunicationValue.notifications) &&
        Objects.equals(this.missedCalls, usersCommunicationValue.missedCalls) &&
        Objects.equals(this.callRecordings, usersCommunicationValue.callRecordings) &&
        Objects.equals(this.newsletters, usersCommunicationValue.newsletters) &&
        Objects.equals(this.voicemails, usersCommunicationValue.voicemails) &&
        Objects.equals(this.web, usersCommunicationValue.web) &&
        Objects.equals(this.email, usersCommunicationValue.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifications, missedCalls, callRecordings, newsletters, voicemails, web, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersCommunicationValue {\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    missedCalls: ").append(toIndentedString(missedCalls)).append("\n");
    sb.append("    callRecordings: ").append(toIndentedString(callRecordings)).append("\n");
    sb.append("    newsletters: ").append(toIndentedString(newsletters)).append("\n");
    sb.append("    voicemails: ").append(toIndentedString(voicemails)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("notifications");
    openapiFields.add("missedCalls");
    openapiFields.add("callRecordings");
    openapiFields.add("newsletters");
    openapiFields.add("voicemails");
    openapiFields.add("web");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersCommunicationValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UsersCommunicationValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersCommunicationValue is not found in the empty JSON string", UsersCommunicationValue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UsersCommunicationValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UsersCommunicationValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `notifications`
      if (jsonObj.get("notifications") != null && !jsonObj.get("notifications").isJsonNull()) {
        UsersCommunicationValueNotifications.validateJsonObject(jsonObj.getAsJsonObject("notifications"));
      }
      // validate the optional field `missedCalls`
      if (jsonObj.get("missedCalls") != null && !jsonObj.get("missedCalls").isJsonNull()) {
        UsersCommunicationValueNotifications.validateJsonObject(jsonObj.getAsJsonObject("missedCalls"));
      }
      // validate the optional field `callRecordings`
      if (jsonObj.get("callRecordings") != null && !jsonObj.get("callRecordings").isJsonNull()) {
        UsersCommunicationValueNotifications.validateJsonObject(jsonObj.getAsJsonObject("callRecordings"));
      }
      // validate the optional field `newsletters`
      if (jsonObj.get("newsletters") != null && !jsonObj.get("newsletters").isJsonNull()) {
        UsersCommunicationValueNotifications.validateJsonObject(jsonObj.getAsJsonObject("newsletters"));
      }
      // validate the optional field `voicemails`
      if (jsonObj.get("voicemails") != null && !jsonObj.get("voicemails").isJsonNull()) {
        UsersCommunicationValueNotifications.validateJsonObject(jsonObj.getAsJsonObject("voicemails"));
      }
      // validate the optional field `web`
      if (jsonObj.get("web") != null && !jsonObj.get("web").isJsonNull()) {
        UsersCommunicationValueNotifications.validateJsonObject(jsonObj.getAsJsonObject("web"));
      }
      // validate the optional field `email`
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) {
        UsersCommunicationValueNotifications.validateJsonObject(jsonObj.getAsJsonObject("email"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersCommunicationValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersCommunicationValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersCommunicationValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersCommunicationValue.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersCommunicationValue>() {
           @Override
           public void write(JsonWriter out, UsersCommunicationValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsersCommunicationValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UsersCommunicationValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersCommunicationValue
  * @throws IOException if the JSON string is invalid with respect to UsersCommunicationValue
  */
  public static UsersCommunicationValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersCommunicationValue.class);
  }

 /**
  * Convert an instance of UsersCommunicationValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

