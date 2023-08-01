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
 * UsersCommunicationNotifications
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T20:07:07.395Z[UTC]")
public class UsersCommunicationNotifications {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private Boolean email = true;

  public static final String SERIALIZED_NAME_SMS = "sms";
  @SerializedName(SERIALIZED_NAME_SMS)
  private Boolean sms = true;

  public static final String SERIALIZED_NAME_SOUND = "sound";
  @SerializedName(SERIALIZED_NAME_SOUND)
  private Boolean sound = true;

  public UsersCommunicationNotifications() {
  }

  public UsersCommunicationNotifications email(Boolean email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public Boolean getEmail() {
    return email;
  }


  public void setEmail(Boolean email) {
    this.email = email;
  }


  public UsersCommunicationNotifications sms(Boolean sms) {
    
    this.sms = sms;
    return this;
  }

   /**
   * Get sms
   * @return sms
  **/
  @javax.annotation.Nullable
  public Boolean getSms() {
    return sms;
  }


  public void setSms(Boolean sms) {
    this.sms = sms;
  }


  public UsersCommunicationNotifications sound(Boolean sound) {
    
    this.sound = sound;
    return this;
  }

   /**
   * Get sound
   * @return sound
  **/
  @javax.annotation.Nullable
  public Boolean getSound() {
    return sound;
  }


  public void setSound(Boolean sound) {
    this.sound = sound;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersCommunicationNotifications usersCommunicationNotifications = (UsersCommunicationNotifications) o;
    return Objects.equals(this.email, usersCommunicationNotifications.email) &&
        Objects.equals(this.sms, usersCommunicationNotifications.sms) &&
        Objects.equals(this.sound, usersCommunicationNotifications.sound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, sms, sound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersCommunicationNotifications {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    sound: ").append(toIndentedString(sound)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("sms");
    openapiFields.add("sound");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersCommunicationNotifications
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UsersCommunicationNotifications.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersCommunicationNotifications is not found in the empty JSON string", UsersCommunicationNotifications.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UsersCommunicationNotifications.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UsersCommunicationNotifications` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersCommunicationNotifications.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersCommunicationNotifications' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersCommunicationNotifications> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersCommunicationNotifications.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersCommunicationNotifications>() {
           @Override
           public void write(JsonWriter out, UsersCommunicationNotifications value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsersCommunicationNotifications read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UsersCommunicationNotifications given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersCommunicationNotifications
  * @throws IOException if the JSON string is invalid with respect to UsersCommunicationNotifications
  */
  public static UsersCommunicationNotifications fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersCommunicationNotifications.class);
  }

 /**
  * Convert an instance of UsersCommunicationNotifications to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

