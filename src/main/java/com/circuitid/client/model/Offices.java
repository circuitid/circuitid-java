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
 * Offices
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-25T10:26:21.235Z[UTC]")
public class Offices {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name = null;

  public static final String SERIALIZED_NAME_STREET_NUMBER = "streetNumber";
  @SerializedName(SERIALIZED_NAME_STREET_NUMBER)
  private Object streetNumber = null;

  public static final String SERIALIZED_NAME_STREET_NAME = "streetName";
  @SerializedName(SERIALIZED_NAME_STREET_NAME)
  private Object streetName = null;

  public static final String SERIALIZED_NAME_PRE_DIRECTION = "preDirection";
  @SerializedName(SERIALIZED_NAME_PRE_DIRECTION)
  private Object preDirection = null;

  public static final String SERIALIZED_NAME_STREET_SUFFIX = "streetSuffix";
  @SerializedName(SERIALIZED_NAME_STREET_SUFFIX)
  private Object streetSuffix = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private Object city = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private Object state = null;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private Object zip = null;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private Object zipCode = null;

  public static final String SERIALIZED_NAME_ADDRESS2 = "address2";
  @SerializedName(SERIALIZED_NAME_ADDRESS2)
  private Object address2 = null;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private Object country = null;

  public static final String SERIALIZED_NAME_PROVIDERS = "providers";
  @SerializedName(SERIALIZED_NAME_PROVIDERS)
  private Object providers = null;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private Object region = null;

  public Offices() {
  }

  public Offices name(Object name) {
    
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


  public Offices streetNumber(Object streetNumber) {
    
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Get streetNumber
   * @return streetNumber
  **/
  @javax.annotation.Nullable
  public Object getStreetNumber() {
    return streetNumber;
  }


  public void setStreetNumber(Object streetNumber) {
    this.streetNumber = streetNumber;
  }


  public Offices streetName(Object streetName) {
    
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @javax.annotation.Nullable
  public Object getStreetName() {
    return streetName;
  }


  public void setStreetName(Object streetName) {
    this.streetName = streetName;
  }


  public Offices preDirection(Object preDirection) {
    
    this.preDirection = preDirection;
    return this;
  }

   /**
   * Get preDirection
   * @return preDirection
  **/
  @javax.annotation.Nullable
  public Object getPreDirection() {
    return preDirection;
  }


  public void setPreDirection(Object preDirection) {
    this.preDirection = preDirection;
  }


  public Offices streetSuffix(Object streetSuffix) {
    
    this.streetSuffix = streetSuffix;
    return this;
  }

   /**
   * Get streetSuffix
   * @return streetSuffix
  **/
  @javax.annotation.Nullable
  public Object getStreetSuffix() {
    return streetSuffix;
  }


  public void setStreetSuffix(Object streetSuffix) {
    this.streetSuffix = streetSuffix;
  }


  public Offices city(Object city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  public Object getCity() {
    return city;
  }


  public void setCity(Object city) {
    this.city = city;
  }


  public Offices state(Object state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public Object getState() {
    return state;
  }


  public void setState(Object state) {
    this.state = state;
  }


  public Offices zip(Object zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return zip
  **/
  @javax.annotation.Nullable
  public Object getZip() {
    return zip;
  }


  public void setZip(Object zip) {
    this.zip = zip;
  }


  public Offices zipCode(Object zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @javax.annotation.Nullable
  public Object getZipCode() {
    return zipCode;
  }


  public void setZipCode(Object zipCode) {
    this.zipCode = zipCode;
  }


  public Offices address2(Object address2) {
    
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @javax.annotation.Nullable
  public Object getAddress2() {
    return address2;
  }


  public void setAddress2(Object address2) {
    this.address2 = address2;
  }


  public Offices country(Object country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  public Object getCountry() {
    return country;
  }


  public void setCountry(Object country) {
    this.country = country;
  }


  public Offices providers(Object providers) {
    
    this.providers = providers;
    return this;
  }

   /**
   * Get providers
   * @return providers
  **/
  @javax.annotation.Nullable
  public Object getProviders() {
    return providers;
  }


  public void setProviders(Object providers) {
    this.providers = providers;
  }


  public Offices region(Object region) {
    
    this.region = region;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return region
  **/
  @javax.annotation.Nullable
  public Object getRegion() {
    return region;
  }


  public void setRegion(Object region) {
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
    Offices offices = (Offices) o;
    return Objects.equals(this.name, offices.name) &&
        Objects.equals(this.streetNumber, offices.streetNumber) &&
        Objects.equals(this.streetName, offices.streetName) &&
        Objects.equals(this.preDirection, offices.preDirection) &&
        Objects.equals(this.streetSuffix, offices.streetSuffix) &&
        Objects.equals(this.city, offices.city) &&
        Objects.equals(this.state, offices.state) &&
        Objects.equals(this.zip, offices.zip) &&
        Objects.equals(this.zipCode, offices.zipCode) &&
        Objects.equals(this.address2, offices.address2) &&
        Objects.equals(this.country, offices.country) &&
        Objects.equals(this.providers, offices.providers) &&
        Objects.equals(this.region, offices.region);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, streetNumber, streetName, preDirection, streetSuffix, city, state, zip, zipCode, address2, country, providers, region);
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
    sb.append("class Offices {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    preDirection: ").append(toIndentedString(preDirection)).append("\n");
    sb.append("    streetSuffix: ").append(toIndentedString(streetSuffix)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("zipCode");
    openapiFields.add("address2");
    openapiFields.add("country");
    openapiFields.add("providers");
    openapiFields.add("region");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("streetNumber");
    openapiRequiredFields.add("streetName");
    openapiRequiredFields.add("streetSuffix");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("country");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Offices
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Offices.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Offices is not found in the empty JSON string", Offices.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Offices.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Offices` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Offices.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Offices.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Offices' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Offices> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Offices.class));

       return (TypeAdapter<T>) new TypeAdapter<Offices>() {
           @Override
           public void write(JsonWriter out, Offices value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Offices read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Offices given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Offices
  * @throws IOException if the JSON string is invalid with respect to Offices
  */
  public static Offices fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Offices.class);
  }

 /**
  * Convert an instance of Offices to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

