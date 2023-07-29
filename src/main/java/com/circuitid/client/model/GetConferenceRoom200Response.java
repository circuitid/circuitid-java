/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.19
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
 * GetConferenceRoom200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-29T09:44:28.938Z[UTC]")
public class GetConferenceRoom200Response {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSCODE = "passcode";
  @SerializedName(SERIALIZED_NAME_PASSCODE)
  private String passcode;

  public static final String SERIALIZED_NAME_DIAL_IN_PIN = "dialInPin";
  @SerializedName(SERIALIZED_NAME_DIAL_IN_PIN)
  private Integer dialInPin;

  /**
   * Gets or Sets isUserRoom
   */
  @JsonAdapter(IsUserRoomEnum.Adapter.class)
  public enum IsUserRoomEnum {
    TRUE("true"),
    
    FALSE("false");

    private Boolean value;

    IsUserRoomEnum(Boolean value) {
      this.value = value;
    }

    public Boolean getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsUserRoomEnum fromValue(Boolean value) {
      for (IsUserRoomEnum b : IsUserRoomEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IsUserRoomEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsUserRoomEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsUserRoomEnum read(final JsonReader jsonReader) throws IOException {
        Boolean value =  jsonReader.nextBoolean();
        return IsUserRoomEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IS_USER_ROOM = "isUserRoom";
  @SerializedName(SERIALIZED_NAME_IS_USER_ROOM)
  private IsUserRoomEnum isUserRoom;

  /**
   * Gets or Sets isChatRoom
   */
  @JsonAdapter(IsChatRoomEnum.Adapter.class)
  public enum IsChatRoomEnum {
    TRUE("true"),
    
    FALSE("false");

    private Boolean value;

    IsChatRoomEnum(Boolean value) {
      this.value = value;
    }

    public Boolean getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsChatRoomEnum fromValue(Boolean value) {
      for (IsChatRoomEnum b : IsChatRoomEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IsChatRoomEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsChatRoomEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsChatRoomEnum read(final JsonReader jsonReader) throws IOException {
        Boolean value =  jsonReader.nextBoolean();
        return IsChatRoomEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IS_CHAT_ROOM = "isChatRoom";
  @SerializedName(SERIALIZED_NAME_IS_CHAT_ROOM)
  private IsChatRoomEnum isChatRoom;

  /**
   * Gets or Sets lobby
   */
  @JsonAdapter(LobbyEnum.Adapter.class)
  public enum LobbyEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    LobbyEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LobbyEnum fromValue(Integer value) {
      for (LobbyEnum b : LobbyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LobbyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LobbyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LobbyEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return LobbyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LOBBY = "lobby";
  @SerializedName(SERIALIZED_NAME_LOBBY)
  private LobbyEnum lobby = LobbyEnum.NUMBER_0;

  /**
   * Gets or Sets requirePasscode
   */
  @JsonAdapter(RequirePasscodeEnum.Adapter.class)
  public enum RequirePasscodeEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    RequirePasscodeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RequirePasscodeEnum fromValue(Integer value) {
      for (RequirePasscodeEnum b : RequirePasscodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RequirePasscodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequirePasscodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequirePasscodeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return RequirePasscodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REQUIRE_PASSCODE = "requirePasscode";
  @SerializedName(SERIALIZED_NAME_REQUIRE_PASSCODE)
  private RequirePasscodeEnum requirePasscode = RequirePasscodeEnum.NUMBER_0;

  /**
   * Gets or Sets share
   */
  @JsonAdapter(ShareEnum.Adapter.class)
  public enum ShareEnum {
    GROUPS("groups"),
    
    CUSTOMERS("customers");

    private String value;

    ShareEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShareEnum fromValue(String value) {
      for (ShareEnum b : ShareEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShareEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShareEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShareEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShareEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private ShareEnum share;

  public static final String SERIALIZED_NAME_CHATROOM = "chatroom";
  @SerializedName(SERIALIZED_NAME_CHATROOM)
  private String chatroom;

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

  public GetConferenceRoom200Response() {
  }

  public GetConferenceRoom200Response name(String name) {
    
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


  public GetConferenceRoom200Response passcode(String passcode) {
    
    this.passcode = passcode;
    return this;
  }

   /**
   * Get passcode
   * @return passcode
  **/
  @javax.annotation.Nullable
  public String getPasscode() {
    return passcode;
  }


  public void setPasscode(String passcode) {
    this.passcode = passcode;
  }


  public GetConferenceRoom200Response dialInPin(Integer dialInPin) {
    
    this.dialInPin = dialInPin;
    return this;
  }

   /**
   * Get dialInPin
   * @return dialInPin
  **/
  @javax.annotation.Nullable
  public Integer getDialInPin() {
    return dialInPin;
  }


  public void setDialInPin(Integer dialInPin) {
    this.dialInPin = dialInPin;
  }


  public GetConferenceRoom200Response isUserRoom(IsUserRoomEnum isUserRoom) {
    
    this.isUserRoom = isUserRoom;
    return this;
  }

   /**
   * Get isUserRoom
   * @return isUserRoom
  **/
  @javax.annotation.Nullable
  public IsUserRoomEnum getIsUserRoom() {
    return isUserRoom;
  }


  public void setIsUserRoom(IsUserRoomEnum isUserRoom) {
    this.isUserRoom = isUserRoom;
  }


  public GetConferenceRoom200Response isChatRoom(IsChatRoomEnum isChatRoom) {
    
    this.isChatRoom = isChatRoom;
    return this;
  }

   /**
   * Get isChatRoom
   * @return isChatRoom
  **/
  @javax.annotation.Nullable
  public IsChatRoomEnum getIsChatRoom() {
    return isChatRoom;
  }


  public void setIsChatRoom(IsChatRoomEnum isChatRoom) {
    this.isChatRoom = isChatRoom;
  }


  public GetConferenceRoom200Response lobby(LobbyEnum lobby) {
    
    this.lobby = lobby;
    return this;
  }

   /**
   * Get lobby
   * @return lobby
  **/
  @javax.annotation.Nullable
  public LobbyEnum getLobby() {
    return lobby;
  }


  public void setLobby(LobbyEnum lobby) {
    this.lobby = lobby;
  }


  public GetConferenceRoom200Response requirePasscode(RequirePasscodeEnum requirePasscode) {
    
    this.requirePasscode = requirePasscode;
    return this;
  }

   /**
   * Get requirePasscode
   * @return requirePasscode
  **/
  @javax.annotation.Nullable
  public RequirePasscodeEnum getRequirePasscode() {
    return requirePasscode;
  }


  public void setRequirePasscode(RequirePasscodeEnum requirePasscode) {
    this.requirePasscode = requirePasscode;
  }


  public GetConferenceRoom200Response share(ShareEnum share) {
    
    this.share = share;
    return this;
  }

   /**
   * Get share
   * @return share
  **/
  @javax.annotation.Nullable
  public ShareEnum getShare() {
    return share;
  }


  public void setShare(ShareEnum share) {
    this.share = share;
  }


  public GetConferenceRoom200Response chatroom(String chatroom) {
    
    this.chatroom = chatroom;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return chatroom
  **/
  @javax.annotation.Nullable
  public String getChatroom() {
    return chatroom;
  }


  public void setChatroom(String chatroom) {
    this.chatroom = chatroom;
  }


  public GetConferenceRoom200Response createdByUserId(String createdByUserId) {
    
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


  public GetConferenceRoom200Response updatedByUserId(String updatedByUserId) {
    
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


  public GetConferenceRoom200Response createdAt(OffsetDateTime createdAt) {
    
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


  public GetConferenceRoom200Response updatedAt(OffsetDateTime updatedAt) {
    
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
    GetConferenceRoom200Response getConferenceRoom200Response = (GetConferenceRoom200Response) o;
    return Objects.equals(this.name, getConferenceRoom200Response.name) &&
        Objects.equals(this.passcode, getConferenceRoom200Response.passcode) &&
        Objects.equals(this.dialInPin, getConferenceRoom200Response.dialInPin) &&
        Objects.equals(this.isUserRoom, getConferenceRoom200Response.isUserRoom) &&
        Objects.equals(this.isChatRoom, getConferenceRoom200Response.isChatRoom) &&
        Objects.equals(this.lobby, getConferenceRoom200Response.lobby) &&
        Objects.equals(this.requirePasscode, getConferenceRoom200Response.requirePasscode) &&
        Objects.equals(this.share, getConferenceRoom200Response.share) &&
        Objects.equals(this.chatroom, getConferenceRoom200Response.chatroom) &&
        Objects.equals(this.createdByUserId, getConferenceRoom200Response.createdByUserId) &&
        Objects.equals(this.updatedByUserId, getConferenceRoom200Response.updatedByUserId) &&
        Objects.equals(this.createdAt, getConferenceRoom200Response.createdAt) &&
        Objects.equals(this.updatedAt, getConferenceRoom200Response.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, passcode, dialInPin, isUserRoom, isChatRoom, lobby, requirePasscode, share, chatroom, createdByUserId, updatedByUserId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetConferenceRoom200Response {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passcode: ").append(toIndentedString(passcode)).append("\n");
    sb.append("    dialInPin: ").append(toIndentedString(dialInPin)).append("\n");
    sb.append("    isUserRoom: ").append(toIndentedString(isUserRoom)).append("\n");
    sb.append("    isChatRoom: ").append(toIndentedString(isChatRoom)).append("\n");
    sb.append("    lobby: ").append(toIndentedString(lobby)).append("\n");
    sb.append("    requirePasscode: ").append(toIndentedString(requirePasscode)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    chatroom: ").append(toIndentedString(chatroom)).append("\n");
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
    openapiFields.add("passcode");
    openapiFields.add("dialInPin");
    openapiFields.add("isUserRoom");
    openapiFields.add("isChatRoom");
    openapiFields.add("lobby");
    openapiFields.add("requirePasscode");
    openapiFields.add("share");
    openapiFields.add("chatroom");
    openapiFields.add("createdByUserId");
    openapiFields.add("updatedByUserId");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetConferenceRoom200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetConferenceRoom200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetConferenceRoom200Response is not found in the empty JSON string", GetConferenceRoom200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetConferenceRoom200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetConferenceRoom200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetConferenceRoom200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("passcode") != null && !jsonObj.get("passcode").isJsonNull()) && !jsonObj.get("passcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passcode").toString()));
      }
      if ((jsonObj.get("share") != null && !jsonObj.get("share").isJsonNull()) && !jsonObj.get("share").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `share` to be a primitive type in the JSON string but got `%s`", jsonObj.get("share").toString()));
      }
      if ((jsonObj.get("chatroom") != null && !jsonObj.get("chatroom").isJsonNull()) && !jsonObj.get("chatroom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chatroom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chatroom").toString()));
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
       if (!GetConferenceRoom200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetConferenceRoom200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetConferenceRoom200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetConferenceRoom200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetConferenceRoom200Response>() {
           @Override
           public void write(JsonWriter out, GetConferenceRoom200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetConferenceRoom200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetConferenceRoom200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetConferenceRoom200Response
  * @throws IOException if the JSON string is invalid with respect to GetConferenceRoom200Response
  */
  public static GetConferenceRoom200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetConferenceRoom200Response.class);
  }

 /**
  * Convert an instance of GetConferenceRoom200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
