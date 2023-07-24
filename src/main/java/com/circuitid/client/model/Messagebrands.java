/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.16
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
 * Messagebrands
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-24T07:17:39.853Z[UTC]")
public class Messagebrands {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name = null;

  public static final String SERIALIZED_NAME_BRAND_ID = "brandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Object brandId = null;

  public static final String SERIALIZED_NAME_EIN = "ein";
  @SerializedName(SERIALIZED_NAME_EIN)
  private Object ein = null;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Object user = null;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Object order = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    VERIFIED("verified"),
    
    UNVERIFIED("unverified");

    private Object value;

    StatusEnum(Object value) {
      this.value = value;
    }

    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(Object value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value =  jsonReader.nextObject();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status = null;

  public static final String SERIALIZED_NAME_BRAND_RELATIONSHIP = "brandRelationship";
  @SerializedName(SERIALIZED_NAME_BRAND_RELATIONSHIP)
  private Object brandRelationship = null;

  public static final String SERIALIZED_NAME_VERTICAL = "vertical";
  @SerializedName(SERIALIZED_NAME_VERTICAL)
  private Object vertical = null;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private Object entityType = null;

  public static final String SERIALIZED_NAME_CSP_ID = "cspId";
  @SerializedName(SERIALIZED_NAME_CSP_ID)
  private Object cspId = null;

  public static final String SERIALIZED_NAME_EIN_ISSUING_COUNTRY = "einIssuingCountry";
  @SerializedName(SERIALIZED_NAME_EIN_ISSUING_COUNTRY)
  private Object einIssuingCountry = null;

  public static final String SERIALIZED_NAME_UNIVERSAL_EIN = "universalEin";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_EIN)
  private Object universalEin = null;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Object referenceId = null;

  public Messagebrands() {
  }

  public Messagebrands name(Object name) {
    
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


  public Messagebrands brandId(Object brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @javax.annotation.Nullable
  public Object getBrandId() {
    return brandId;
  }


  public void setBrandId(Object brandId) {
    this.brandId = brandId;
  }


  public Messagebrands ein(Object ein) {
    
    this.ein = ein;
    return this;
  }

   /**
   * Get ein
   * @return ein
  **/
  @javax.annotation.Nullable
  public Object getEin() {
    return ein;
  }


  public void setEin(Object ein) {
    this.ein = ein;
  }


  public Messagebrands user(Object user) {
    
    this.user = user;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return user
  **/
  @javax.annotation.Nullable
  public Object getUser() {
    return user;
  }


  public void setUser(Object user) {
    this.user = user;
  }


  public Messagebrands order(Object order) {
    
    this.order = order;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return order
  **/
  @javax.annotation.Nullable
  public Object getOrder() {
    return order;
  }


  public void setOrder(Object order) {
    this.order = order;
  }


  public Messagebrands status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Messagebrands brandRelationship(Object brandRelationship) {
    
    this.brandRelationship = brandRelationship;
    return this;
  }

   /**
   * Get brandRelationship
   * @return brandRelationship
  **/
  @javax.annotation.Nullable
  public Object getBrandRelationship() {
    return brandRelationship;
  }


  public void setBrandRelationship(Object brandRelationship) {
    this.brandRelationship = brandRelationship;
  }


  public Messagebrands vertical(Object vertical) {
    
    this.vertical = vertical;
    return this;
  }

   /**
   * Get vertical
   * @return vertical
  **/
  @javax.annotation.Nullable
  public Object getVertical() {
    return vertical;
  }


  public void setVertical(Object vertical) {
    this.vertical = vertical;
  }


  public Messagebrands entityType(Object entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nullable
  public Object getEntityType() {
    return entityType;
  }


  public void setEntityType(Object entityType) {
    this.entityType = entityType;
  }


  public Messagebrands cspId(Object cspId) {
    
    this.cspId = cspId;
    return this;
  }

   /**
   * Get cspId
   * @return cspId
  **/
  @javax.annotation.Nullable
  public Object getCspId() {
    return cspId;
  }


  public void setCspId(Object cspId) {
    this.cspId = cspId;
  }


  public Messagebrands einIssuingCountry(Object einIssuingCountry) {
    
    this.einIssuingCountry = einIssuingCountry;
    return this;
  }

   /**
   * Get einIssuingCountry
   * @return einIssuingCountry
  **/
  @javax.annotation.Nullable
  public Object getEinIssuingCountry() {
    return einIssuingCountry;
  }


  public void setEinIssuingCountry(Object einIssuingCountry) {
    this.einIssuingCountry = einIssuingCountry;
  }


  public Messagebrands universalEin(Object universalEin) {
    
    this.universalEin = universalEin;
    return this;
  }

   /**
   * Get universalEin
   * @return universalEin
  **/
  @javax.annotation.Nullable
  public Object getUniversalEin() {
    return universalEin;
  }


  public void setUniversalEin(Object universalEin) {
    this.universalEin = universalEin;
  }


  public Messagebrands referenceId(Object referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Get referenceId
   * @return referenceId
  **/
  @javax.annotation.Nullable
  public Object getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(Object referenceId) {
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
    Messagebrands messagebrands = (Messagebrands) o;
    return Objects.equals(this.name, messagebrands.name) &&
        Objects.equals(this.brandId, messagebrands.brandId) &&
        Objects.equals(this.ein, messagebrands.ein) &&
        Objects.equals(this.user, messagebrands.user) &&
        Objects.equals(this.order, messagebrands.order) &&
        Objects.equals(this.status, messagebrands.status) &&
        Objects.equals(this.brandRelationship, messagebrands.brandRelationship) &&
        Objects.equals(this.vertical, messagebrands.vertical) &&
        Objects.equals(this.entityType, messagebrands.entityType) &&
        Objects.equals(this.cspId, messagebrands.cspId) &&
        Objects.equals(this.einIssuingCountry, messagebrands.einIssuingCountry) &&
        Objects.equals(this.universalEin, messagebrands.universalEin) &&
        Objects.equals(this.referenceId, messagebrands.referenceId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, brandId, ein, user, order, status, brandRelationship, vertical, entityType, cspId, einIssuingCountry, universalEin, referenceId);
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
    sb.append("class Messagebrands {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    brandRelationship: ").append(toIndentedString(brandRelationship)).append("\n");
    sb.append("    vertical: ").append(toIndentedString(vertical)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    cspId: ").append(toIndentedString(cspId)).append("\n");
    sb.append("    einIssuingCountry: ").append(toIndentedString(einIssuingCountry)).append("\n");
    sb.append("    universalEin: ").append(toIndentedString(universalEin)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("brandId");
    openapiFields.add("ein");
    openapiFields.add("user");
    openapiFields.add("order");
    openapiFields.add("status");
    openapiFields.add("brandRelationship");
    openapiFields.add("vertical");
    openapiFields.add("entityType");
    openapiFields.add("cspId");
    openapiFields.add("einIssuingCountry");
    openapiFields.add("universalEin");
    openapiFields.add("referenceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("ein");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("order");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Messagebrands
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Messagebrands.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Messagebrands is not found in the empty JSON string", Messagebrands.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Messagebrands.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Messagebrands` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Messagebrands.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Messagebrands.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Messagebrands' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Messagebrands> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Messagebrands.class));

       return (TypeAdapter<T>) new TypeAdapter<Messagebrands>() {
           @Override
           public void write(JsonWriter out, Messagebrands value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Messagebrands read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Messagebrands given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Messagebrands
  * @throws IOException if the JSON string is invalid with respect to Messagebrands
  */
  public static Messagebrands fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Messagebrands.class);
  }

 /**
  * Convert an instance of Messagebrands to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

