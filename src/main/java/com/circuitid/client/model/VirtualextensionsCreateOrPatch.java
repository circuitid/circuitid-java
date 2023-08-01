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
 * VirtualextensionsCreateOrPatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T20:00:37.621Z[UTC]")
public class VirtualextensionsCreateOrPatch {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private Integer extension;

  public static final String SERIALIZED_NAME_PHONEINBOUNDRULE = "phoneinboundrule";
  @SerializedName(SERIALIZED_NAME_PHONEINBOUNDRULE)
  private String phoneinboundrule;

  public VirtualextensionsCreateOrPatch() {
  }

  public VirtualextensionsCreateOrPatch name(String name) {
    
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


  public VirtualextensionsCreateOrPatch extension(Integer extension) {
    
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @javax.annotation.Nonnull
  public Integer getExtension() {
    return extension;
  }


  public void setExtension(Integer extension) {
    this.extension = extension;
  }


  public VirtualextensionsCreateOrPatch phoneinboundrule(String phoneinboundrule) {
    
    this.phoneinboundrule = phoneinboundrule;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return phoneinboundrule
  **/
  @javax.annotation.Nullable
  public String getPhoneinboundrule() {
    return phoneinboundrule;
  }


  public void setPhoneinboundrule(String phoneinboundrule) {
    this.phoneinboundrule = phoneinboundrule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualextensionsCreateOrPatch virtualextensionsCreateOrPatch = (VirtualextensionsCreateOrPatch) o;
    return Objects.equals(this.name, virtualextensionsCreateOrPatch.name) &&
        Objects.equals(this.extension, virtualextensionsCreateOrPatch.extension) &&
        Objects.equals(this.phoneinboundrule, virtualextensionsCreateOrPatch.phoneinboundrule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, extension, phoneinboundrule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualextensionsCreateOrPatch {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    phoneinboundrule: ").append(toIndentedString(phoneinboundrule)).append("\n");
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
    openapiFields.add("extension");
    openapiFields.add("phoneinboundrule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("extension");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VirtualextensionsCreateOrPatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VirtualextensionsCreateOrPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VirtualextensionsCreateOrPatch is not found in the empty JSON string", VirtualextensionsCreateOrPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VirtualextensionsCreateOrPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VirtualextensionsCreateOrPatch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VirtualextensionsCreateOrPatch.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("phoneinboundrule") != null && !jsonObj.get("phoneinboundrule").isJsonNull()) && !jsonObj.get("phoneinboundrule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneinboundrule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneinboundrule").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VirtualextensionsCreateOrPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VirtualextensionsCreateOrPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VirtualextensionsCreateOrPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VirtualextensionsCreateOrPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<VirtualextensionsCreateOrPatch>() {
           @Override
           public void write(JsonWriter out, VirtualextensionsCreateOrPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VirtualextensionsCreateOrPatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VirtualextensionsCreateOrPatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VirtualextensionsCreateOrPatch
  * @throws IOException if the JSON string is invalid with respect to VirtualextensionsCreateOrPatch
  */
  public static VirtualextensionsCreateOrPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VirtualextensionsCreateOrPatch.class);
  }

 /**
  * Convert an instance of VirtualextensionsCreateOrPatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

