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
 * Conferencerooms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-25T10:21:28.674Z[UTC]")
public class Conferencerooms {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name = null;

  public static final String SERIALIZED_NAME_PASSCODE = "passcode";
  @SerializedName(SERIALIZED_NAME_PASSCODE)
  private Object passcode = null;

  public static final String SERIALIZED_NAME_DIAL_IN_PIN = "dialInPin";
  @SerializedName(SERIALIZED_NAME_DIAL_IN_PIN)
  private Object dialInPin = null;

  public static final String SERIALIZED_NAME_IS_USER_ROOM = "isUserRoom";
  @SerializedName(SERIALIZED_NAME_IS_USER_ROOM)
  private Object isUserRoom = null;

  public static final String SERIALIZED_NAME_IS_CHAT_ROOM = "isChatRoom";
  @SerializedName(SERIALIZED_NAME_IS_CHAT_ROOM)
  private Object isChatRoom = null;

  public static final String SERIALIZED_NAME_LOBBY = "lobby";
  @SerializedName(SERIALIZED_NAME_LOBBY)
  private Object lobby = null;

  public static final String SERIALIZED_NAME_REQUIRE_PASSCODE = "requirePasscode";
  @SerializedName(SERIALIZED_NAME_REQUIRE_PASSCODE)
  private Object requirePasscode = null;

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private Object share = null;

  public static final String SERIALIZED_NAME_CHATROOM = "chatroom";
  @SerializedName(SERIALIZED_NAME_CHATROOM)
  private Object chatroom = null;

  public Conferencerooms() {
  }

  public Conferencerooms name(Object name) {
    
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


  public Conferencerooms passcode(Object passcode) {
    
    this.passcode = passcode;
    return this;
  }

   /**
   * Get passcode
   * @return passcode
  **/
  @javax.annotation.Nullable
  public Object getPasscode() {
    return passcode;
  }


  public void setPasscode(Object passcode) {
    this.passcode = passcode;
  }


  public Conferencerooms dialInPin(Object dialInPin) {
    
    this.dialInPin = dialInPin;
    return this;
  }

   /**
   * Get dialInPin
   * @return dialInPin
  **/
  @javax.annotation.Nullable
  public Object getDialInPin() {
    return dialInPin;
  }


  public void setDialInPin(Object dialInPin) {
    this.dialInPin = dialInPin;
  }


  public Conferencerooms isUserRoom(Object isUserRoom) {
    
    this.isUserRoom = isUserRoom;
    return this;
  }

   /**
   * Get isUserRoom
   * @return isUserRoom
  **/
  @javax.annotation.Nullable
  public Object getIsUserRoom() {
    return isUserRoom;
  }


  public void setIsUserRoom(Object isUserRoom) {
    this.isUserRoom = isUserRoom;
  }


  public Conferencerooms isChatRoom(Object isChatRoom) {
    
    this.isChatRoom = isChatRoom;
    return this;
  }

   /**
   * Get isChatRoom
   * @return isChatRoom
  **/
  @javax.annotation.Nullable
  public Object getIsChatRoom() {
    return isChatRoom;
  }


  public void setIsChatRoom(Object isChatRoom) {
    this.isChatRoom = isChatRoom;
  }


  public Conferencerooms lobby(Object lobby) {
    
    this.lobby = lobby;
    return this;
  }

   /**
   * Get lobby
   * @return lobby
  **/
  @javax.annotation.Nullable
  public Object getLobby() {
    return lobby;
  }


  public void setLobby(Object lobby) {
    this.lobby = lobby;
  }


  public Conferencerooms requirePasscode(Object requirePasscode) {
    
    this.requirePasscode = requirePasscode;
    return this;
  }

   /**
   * Get requirePasscode
   * @return requirePasscode
  **/
  @javax.annotation.Nullable
  public Object getRequirePasscode() {
    return requirePasscode;
  }


  public void setRequirePasscode(Object requirePasscode) {
    this.requirePasscode = requirePasscode;
  }


  public Conferencerooms share(Object share) {
    
    this.share = share;
    return this;
  }

   /**
   * Get share
   * @return share
  **/
  @javax.annotation.Nullable
  public Object getShare() {
    return share;
  }


  public void setShare(Object share) {
    this.share = share;
  }


  public Conferencerooms chatroom(Object chatroom) {
    
    this.chatroom = chatroom;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return chatroom
  **/
  @javax.annotation.Nullable
  public Object getChatroom() {
    return chatroom;
  }


  public void setChatroom(Object chatroom) {
    this.chatroom = chatroom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conferencerooms conferencerooms = (Conferencerooms) o;
    return Objects.equals(this.name, conferencerooms.name) &&
        Objects.equals(this.passcode, conferencerooms.passcode) &&
        Objects.equals(this.dialInPin, conferencerooms.dialInPin) &&
        Objects.equals(this.isUserRoom, conferencerooms.isUserRoom) &&
        Objects.equals(this.isChatRoom, conferencerooms.isChatRoom) &&
        Objects.equals(this.lobby, conferencerooms.lobby) &&
        Objects.equals(this.requirePasscode, conferencerooms.requirePasscode) &&
        Objects.equals(this.share, conferencerooms.share) &&
        Objects.equals(this.chatroom, conferencerooms.chatroom);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, passcode, dialInPin, isUserRoom, isChatRoom, lobby, requirePasscode, share, chatroom);
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
    sb.append("class Conferencerooms {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passcode: ").append(toIndentedString(passcode)).append("\n");
    sb.append("    dialInPin: ").append(toIndentedString(dialInPin)).append("\n");
    sb.append("    isUserRoom: ").append(toIndentedString(isUserRoom)).append("\n");
    sb.append("    isChatRoom: ").append(toIndentedString(isChatRoom)).append("\n");
    sb.append("    lobby: ").append(toIndentedString(lobby)).append("\n");
    sb.append("    requirePasscode: ").append(toIndentedString(requirePasscode)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    chatroom: ").append(toIndentedString(chatroom)).append("\n");
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
    openapiFields.add("passcode");
    openapiFields.add("dialInPin");
    openapiFields.add("isUserRoom");
    openapiFields.add("isChatRoom");
    openapiFields.add("lobby");
    openapiFields.add("requirePasscode");
    openapiFields.add("share");
    openapiFields.add("chatroom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Conferencerooms
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Conferencerooms.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Conferencerooms is not found in the empty JSON string", Conferencerooms.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Conferencerooms.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Conferencerooms` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Conferencerooms.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Conferencerooms.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Conferencerooms' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Conferencerooms> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Conferencerooms.class));

       return (TypeAdapter<T>) new TypeAdapter<Conferencerooms>() {
           @Override
           public void write(JsonWriter out, Conferencerooms value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Conferencerooms read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Conferencerooms given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Conferencerooms
  * @throws IOException if the JSON string is invalid with respect to Conferencerooms
  */
  public static Conferencerooms fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Conferencerooms.class);
  }

 /**
  * Convert an instance of Conferencerooms to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

