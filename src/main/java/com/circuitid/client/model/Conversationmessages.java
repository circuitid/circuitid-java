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
 * Conversationmessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T20:07:07.395Z[UTC]")
public class Conversationmessages {
  public static final String SERIALIZED_NAME_CONVERSATION = "conversation";
  @SerializedName(SERIALIZED_NAME_CONVERSATION)
  private String conversation;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private Object from;

  public static final String SERIALIZED_NAME_FROM_NUMBER = "fromNumber";
  @SerializedName(SERIALIZED_NAME_FROM_NUMBER)
  private String fromNumber;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<Object> to = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  /**
   * Gets or Sets direction
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    INBOUND("inbound"),
    
    OUTBOUND("outbound");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private DirectionEnum direction;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<Object> attachments;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public Conversationmessages() {
  }

  public Conversationmessages conversation(String conversation) {
    
    this.conversation = conversation;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return conversation
  **/
  @javax.annotation.Nullable
  public String getConversation() {
    return conversation;
  }


  public void setConversation(String conversation) {
    this.conversation = conversation;
  }


  public Conversationmessages from(Object from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nonnull
  public Object getFrom() {
    return from;
  }


  public void setFrom(Object from) {
    this.from = from;
  }


  public Conversationmessages fromNumber(String fromNumber) {
    
    this.fromNumber = fromNumber;
    return this;
  }

   /**
   * Get fromNumber
   * @return fromNumber
  **/
  @javax.annotation.Nonnull
  public String getFromNumber() {
    return fromNumber;
  }


  public void setFromNumber(String fromNumber) {
    this.fromNumber = fromNumber;
  }


  public Conversationmessages to(List<Object> to) {
    
    this.to = to;
    return this;
  }

  public Conversationmessages addToItem(Object toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nonnull
  public List<Object> getTo() {
    return to;
  }


  public void setTo(List<Object> to) {
    this.to = to;
  }


  public Conversationmessages text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public Conversationmessages direction(DirectionEnum direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nonnull
  public DirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public Conversationmessages attachments(List<Object> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public Conversationmessages addAttachmentsItem(Object attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  public List<Object> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<Object> attachments) {
    this.attachments = attachments;
  }


  public Conversationmessages referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Get referenceId
   * @return referenceId
  **/
  @javax.annotation.Nullable
  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conversationmessages conversationmessages = (Conversationmessages) o;
    return Objects.equals(this.conversation, conversationmessages.conversation) &&
        Objects.equals(this.from, conversationmessages.from) &&
        Objects.equals(this.fromNumber, conversationmessages.fromNumber) &&
        Objects.equals(this.to, conversationmessages.to) &&
        Objects.equals(this.text, conversationmessages.text) &&
        Objects.equals(this.direction, conversationmessages.direction) &&
        Objects.equals(this.attachments, conversationmessages.attachments) &&
        Objects.equals(this.referenceId, conversationmessages.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, from, fromNumber, to, text, direction, attachments, referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversationmessages {\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    fromNumber: ").append(toIndentedString(fromNumber)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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
    openapiFields.add("conversation");
    openapiFields.add("from");
    openapiFields.add("fromNumber");
    openapiFields.add("to");
    openapiFields.add("text");
    openapiFields.add("direction");
    openapiFields.add("attachments");
    openapiFields.add("referenceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("fromNumber");
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("direction");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Conversationmessages
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Conversationmessages.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Conversationmessages is not found in the empty JSON string", Conversationmessages.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Conversationmessages.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Conversationmessages` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Conversationmessages.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("conversation") != null && !jsonObj.get("conversation").isJsonNull()) && !jsonObj.get("conversation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversation").toString()));
      }
      if (!jsonObj.get("fromNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromNumber").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("to") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("to").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be an array in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (!jsonObj.get("direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Conversationmessages.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Conversationmessages' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Conversationmessages> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Conversationmessages.class));

       return (TypeAdapter<T>) new TypeAdapter<Conversationmessages>() {
           @Override
           public void write(JsonWriter out, Conversationmessages value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Conversationmessages read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Conversationmessages given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Conversationmessages
  * @throws IOException if the JSON string is invalid with respect to Conversationmessages
  */
  public static Conversationmessages fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Conversationmessages.class);
  }

 /**
  * Convert an instance of Conversationmessages to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

