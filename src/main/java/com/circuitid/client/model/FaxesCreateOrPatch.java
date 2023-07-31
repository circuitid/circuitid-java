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
 * FaxesCreateOrPatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-31T20:15:30.371Z[UTC]")
public class FaxesCreateOrPatch {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<String> attachments;

  public static final String SERIALIZED_NAME_CALLER_DESTINATIONS = "callerDestinations";
  @SerializedName(SERIALIZED_NAME_CALLER_DESTINATIONS)
  private List<String> callerDestinations = new ArrayList<>();

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_FAX_ACCOUNT = "faxAccount";
  @SerializedName(SERIALIZED_NAME_FAX_ACCOUNT)
  private String faxAccount;

  public FaxesCreateOrPatch() {
  }

  public FaxesCreateOrPatch attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public FaxesCreateOrPatch addAttachmentsItem(String attachmentsItem) {
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
  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


  public FaxesCreateOrPatch callerDestinations(List<String> callerDestinations) {
    
    this.callerDestinations = callerDestinations;
    return this;
  }

  public FaxesCreateOrPatch addCallerDestinationsItem(String callerDestinationsItem) {
    if (this.callerDestinations == null) {
      this.callerDestinations = new ArrayList<>();
    }
    this.callerDestinations.add(callerDestinationsItem);
    return this;
  }

   /**
   * Get callerDestinations
   * @return callerDestinations
  **/
  @javax.annotation.Nonnull
  public List<String> getCallerDestinations() {
    return callerDestinations;
  }


  public void setCallerDestinations(List<String> callerDestinations) {
    this.callerDestinations = callerDestinations;
  }


  public FaxesCreateOrPatch number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return number
  **/
  @javax.annotation.Nonnull
  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public FaxesCreateOrPatch faxAccount(String faxAccount) {
    
    this.faxAccount = faxAccount;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return faxAccount
  **/
  @javax.annotation.Nonnull
  public String getFaxAccount() {
    return faxAccount;
  }


  public void setFaxAccount(String faxAccount) {
    this.faxAccount = faxAccount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaxesCreateOrPatch faxesCreateOrPatch = (FaxesCreateOrPatch) o;
    return Objects.equals(this.attachments, faxesCreateOrPatch.attachments) &&
        Objects.equals(this.callerDestinations, faxesCreateOrPatch.callerDestinations) &&
        Objects.equals(this.number, faxesCreateOrPatch.number) &&
        Objects.equals(this.faxAccount, faxesCreateOrPatch.faxAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, callerDestinations, number, faxAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxesCreateOrPatch {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    callerDestinations: ").append(toIndentedString(callerDestinations)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    faxAccount: ").append(toIndentedString(faxAccount)).append("\n");
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
    openapiFields.add("attachments");
    openapiFields.add("callerDestinations");
    openapiFields.add("number");
    openapiFields.add("faxAccount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("callerDestinations");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("faxAccount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FaxesCreateOrPatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FaxesCreateOrPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FaxesCreateOrPatch is not found in the empty JSON string", FaxesCreateOrPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FaxesCreateOrPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FaxesCreateOrPatch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FaxesCreateOrPatch.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("callerDestinations") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("callerDestinations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `callerDestinations` to be an array in the JSON string but got `%s`", jsonObj.get("callerDestinations").toString()));
      }
      if (!jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      if (!jsonObj.get("faxAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `faxAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("faxAccount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FaxesCreateOrPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FaxesCreateOrPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FaxesCreateOrPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FaxesCreateOrPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<FaxesCreateOrPatch>() {
           @Override
           public void write(JsonWriter out, FaxesCreateOrPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FaxesCreateOrPatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FaxesCreateOrPatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FaxesCreateOrPatch
  * @throws IOException if the JSON string is invalid with respect to FaxesCreateOrPatch
  */
  public static FaxesCreateOrPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FaxesCreateOrPatch.class);
  }

 /**
  * Convert an instance of FaxesCreateOrPatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

