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
 * OfficesCreateOrPatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T18:58:54.607Z[UTC]")
public class OfficesCreateOrPatch {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STREET_NUMBER = "streetNumber";
  @SerializedName(SERIALIZED_NAME_STREET_NUMBER)
  private String streetNumber;

  public static final String SERIALIZED_NAME_STREET_NAME = "streetName";
  @SerializedName(SERIALIZED_NAME_STREET_NAME)
  private String streetName;

  public static final String SERIALIZED_NAME_PRE_DIRECTION = "preDirection";
  @SerializedName(SERIALIZED_NAME_PRE_DIRECTION)
  private String preDirection;

  public static final String SERIALIZED_NAME_STREET_SUFFIX = "streetSuffix";
  @SerializedName(SERIALIZED_NAME_STREET_SUFFIX)
  private String streetSuffix;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_ADDRESS2 = "address2";
  @SerializedName(SERIALIZED_NAME_ADDRESS2)
  private String address2;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public OfficesCreateOrPatch() {
  }

  public OfficesCreateOrPatch name(String name) {
    
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


  public OfficesCreateOrPatch streetNumber(String streetNumber) {
    
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Get streetNumber
   * @return streetNumber
  **/
  @javax.annotation.Nonnull
  public String getStreetNumber() {
    return streetNumber;
  }


  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }


  public OfficesCreateOrPatch streetName(String streetName) {
    
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @javax.annotation.Nonnull
  public String getStreetName() {
    return streetName;
  }


  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  public OfficesCreateOrPatch preDirection(String preDirection) {
    
    this.preDirection = preDirection;
    return this;
  }

   /**
   * Get preDirection
   * @return preDirection
  **/
  @javax.annotation.Nullable
  public String getPreDirection() {
    return preDirection;
  }


  public void setPreDirection(String preDirection) {
    this.preDirection = preDirection;
  }


  public OfficesCreateOrPatch streetSuffix(String streetSuffix) {
    
    this.streetSuffix = streetSuffix;
    return this;
  }

   /**
   * Get streetSuffix
   * @return streetSuffix
  **/
  @javax.annotation.Nonnull
  public String getStreetSuffix() {
    return streetSuffix;
  }


  public void setStreetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }


  public OfficesCreateOrPatch zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @javax.annotation.Nullable
  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public OfficesCreateOrPatch address2(String address2) {
    
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @javax.annotation.Nullable
  public String getAddress2() {
    return address2;
  }


  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public OfficesCreateOrPatch country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nonnull
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public OfficesCreateOrPatch region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return region
  **/
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfficesCreateOrPatch officesCreateOrPatch = (OfficesCreateOrPatch) o;
    return Objects.equals(this.name, officesCreateOrPatch.name) &&
        Objects.equals(this.streetNumber, officesCreateOrPatch.streetNumber) &&
        Objects.equals(this.streetName, officesCreateOrPatch.streetName) &&
        Objects.equals(this.preDirection, officesCreateOrPatch.preDirection) &&
        Objects.equals(this.streetSuffix, officesCreateOrPatch.streetSuffix) &&
        Objects.equals(this.zipCode, officesCreateOrPatch.zipCode) &&
        Objects.equals(this.address2, officesCreateOrPatch.address2) &&
        Objects.equals(this.country, officesCreateOrPatch.country) &&
        Objects.equals(this.region, officesCreateOrPatch.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, streetNumber, streetName, preDirection, streetSuffix, zipCode, address2, country, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfficesCreateOrPatch {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    preDirection: ").append(toIndentedString(preDirection)).append("\n");
    sb.append("    streetSuffix: ").append(toIndentedString(streetSuffix)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
    openapiFields.add("streetNumber");
    openapiFields.add("streetName");
    openapiFields.add("preDirection");
    openapiFields.add("streetSuffix");
    openapiFields.add("zipCode");
    openapiFields.add("address2");
    openapiFields.add("country");
    openapiFields.add("region");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("streetNumber");
    openapiRequiredFields.add("streetName");
    openapiRequiredFields.add("streetSuffix");
    openapiRequiredFields.add("country");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OfficesCreateOrPatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OfficesCreateOrPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OfficesCreateOrPatch is not found in the empty JSON string", OfficesCreateOrPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OfficesCreateOrPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OfficesCreateOrPatch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OfficesCreateOrPatch.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("streetNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `streetNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("streetNumber").toString()));
      }
      if (!jsonObj.get("streetName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `streetName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("streetName").toString()));
      }
      if ((jsonObj.get("preDirection") != null && !jsonObj.get("preDirection").isJsonNull()) && !jsonObj.get("preDirection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preDirection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preDirection").toString()));
      }
      if (!jsonObj.get("streetSuffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `streetSuffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("streetSuffix").toString()));
      }
      if ((jsonObj.get("zipCode") != null && !jsonObj.get("zipCode").isJsonNull()) && !jsonObj.get("zipCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipCode").toString()));
      }
      if ((jsonObj.get("address2") != null && !jsonObj.get("address2").isJsonNull()) && !jsonObj.get("address2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address2").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfficesCreateOrPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfficesCreateOrPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfficesCreateOrPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfficesCreateOrPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<OfficesCreateOrPatch>() {
           @Override
           public void write(JsonWriter out, OfficesCreateOrPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfficesCreateOrPatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfficesCreateOrPatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfficesCreateOrPatch
  * @throws IOException if the JSON string is invalid with respect to OfficesCreateOrPatch
  */
  public static OfficesCreateOrPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfficesCreateOrPatch.class);
  }

 /**
  * Convert an instance of OfficesCreateOrPatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

