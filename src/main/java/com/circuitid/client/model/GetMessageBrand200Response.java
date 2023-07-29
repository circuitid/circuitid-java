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
 * GetMessageBrand200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-29T10:15:00.907Z[UTC]")
public class GetMessageBrand200Response {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BRAND_ID = "brandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public static final String SERIALIZED_NAME_EIN = "ein";
  @SerializedName(SERIALIZED_NAME_EIN)
  private String ein;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    VERIFIED("verified"),
    
    UNVERIFIED("unverified");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_BRAND_RELATIONSHIP = "brandRelationship";
  @SerializedName(SERIALIZED_NAME_BRAND_RELATIONSHIP)
  private String brandRelationship;

  public static final String SERIALIZED_NAME_VERTICAL = "vertical";
  @SerializedName(SERIALIZED_NAME_VERTICAL)
  private String vertical;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_CSP_ID = "cspId";
  @SerializedName(SERIALIZED_NAME_CSP_ID)
  private String cspId;

  public static final String SERIALIZED_NAME_EIN_ISSUING_COUNTRY = "einIssuingCountry";
  @SerializedName(SERIALIZED_NAME_EIN_ISSUING_COUNTRY)
  private String einIssuingCountry;

  public static final String SERIALIZED_NAME_UNIVERSAL_EIN = "universalEin";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_EIN)
  private String universalEin;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

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

  public GetMessageBrand200Response() {
  }

  public GetMessageBrand200Response name(String name) {
    
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


  public GetMessageBrand200Response brandId(String brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @javax.annotation.Nullable
  public String getBrandId() {
    return brandId;
  }


  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public GetMessageBrand200Response ein(String ein) {
    
    this.ein = ein;
    return this;
  }

   /**
   * Get ein
   * @return ein
  **/
  @javax.annotation.Nonnull
  public String getEin() {
    return ein;
  }


  public void setEin(String ein) {
    this.ein = ein;
  }


  public GetMessageBrand200Response user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return user
  **/
  @javax.annotation.Nonnull
  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  public GetMessageBrand200Response order(String order) {
    
    this.order = order;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return order
  **/
  @javax.annotation.Nonnull
  public String getOrder() {
    return order;
  }


  public void setOrder(String order) {
    this.order = order;
  }


  public GetMessageBrand200Response status(StatusEnum status) {
    
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


  public GetMessageBrand200Response brandRelationship(String brandRelationship) {
    
    this.brandRelationship = brandRelationship;
    return this;
  }

   /**
   * Get brandRelationship
   * @return brandRelationship
  **/
  @javax.annotation.Nullable
  public String getBrandRelationship() {
    return brandRelationship;
  }


  public void setBrandRelationship(String brandRelationship) {
    this.brandRelationship = brandRelationship;
  }


  public GetMessageBrand200Response vertical(String vertical) {
    
    this.vertical = vertical;
    return this;
  }

   /**
   * Get vertical
   * @return vertical
  **/
  @javax.annotation.Nullable
  public String getVertical() {
    return vertical;
  }


  public void setVertical(String vertical) {
    this.vertical = vertical;
  }


  public GetMessageBrand200Response entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nullable
  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public GetMessageBrand200Response cspId(String cspId) {
    
    this.cspId = cspId;
    return this;
  }

   /**
   * Get cspId
   * @return cspId
  **/
  @javax.annotation.Nullable
  public String getCspId() {
    return cspId;
  }


  public void setCspId(String cspId) {
    this.cspId = cspId;
  }


  public GetMessageBrand200Response einIssuingCountry(String einIssuingCountry) {
    
    this.einIssuingCountry = einIssuingCountry;
    return this;
  }

   /**
   * Get einIssuingCountry
   * @return einIssuingCountry
  **/
  @javax.annotation.Nullable
  public String getEinIssuingCountry() {
    return einIssuingCountry;
  }


  public void setEinIssuingCountry(String einIssuingCountry) {
    this.einIssuingCountry = einIssuingCountry;
  }


  public GetMessageBrand200Response universalEin(String universalEin) {
    
    this.universalEin = universalEin;
    return this;
  }

   /**
   * Get universalEin
   * @return universalEin
  **/
  @javax.annotation.Nullable
  public String getUniversalEin() {
    return universalEin;
  }


  public void setUniversalEin(String universalEin) {
    this.universalEin = universalEin;
  }


  public GetMessageBrand200Response referenceId(String referenceId) {
    
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


  public GetMessageBrand200Response createdByUserId(String createdByUserId) {
    
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


  public GetMessageBrand200Response updatedByUserId(String updatedByUserId) {
    
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


  public GetMessageBrand200Response createdAt(OffsetDateTime createdAt) {
    
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


  public GetMessageBrand200Response updatedAt(OffsetDateTime updatedAt) {
    
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
    GetMessageBrand200Response getMessageBrand200Response = (GetMessageBrand200Response) o;
    return Objects.equals(this.name, getMessageBrand200Response.name) &&
        Objects.equals(this.brandId, getMessageBrand200Response.brandId) &&
        Objects.equals(this.ein, getMessageBrand200Response.ein) &&
        Objects.equals(this.user, getMessageBrand200Response.user) &&
        Objects.equals(this.order, getMessageBrand200Response.order) &&
        Objects.equals(this.status, getMessageBrand200Response.status) &&
        Objects.equals(this.brandRelationship, getMessageBrand200Response.brandRelationship) &&
        Objects.equals(this.vertical, getMessageBrand200Response.vertical) &&
        Objects.equals(this.entityType, getMessageBrand200Response.entityType) &&
        Objects.equals(this.cspId, getMessageBrand200Response.cspId) &&
        Objects.equals(this.einIssuingCountry, getMessageBrand200Response.einIssuingCountry) &&
        Objects.equals(this.universalEin, getMessageBrand200Response.universalEin) &&
        Objects.equals(this.referenceId, getMessageBrand200Response.referenceId) &&
        Objects.equals(this.createdByUserId, getMessageBrand200Response.createdByUserId) &&
        Objects.equals(this.updatedByUserId, getMessageBrand200Response.updatedByUserId) &&
        Objects.equals(this.createdAt, getMessageBrand200Response.createdAt) &&
        Objects.equals(this.updatedAt, getMessageBrand200Response.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, brandId, ein, user, order, status, brandRelationship, vertical, entityType, cspId, einIssuingCountry, universalEin, referenceId, createdByUserId, updatedByUserId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMessageBrand200Response {\n");
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
    openapiFields.add("createdByUserId");
    openapiFields.add("updatedByUserId");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

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
  * @throws IOException if the JSON Object is invalid with respect to GetMessageBrand200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetMessageBrand200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMessageBrand200Response is not found in the empty JSON string", GetMessageBrand200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetMessageBrand200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMessageBrand200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetMessageBrand200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("brandId") != null && !jsonObj.get("brandId").isJsonNull()) && !jsonObj.get("brandId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandId").toString()));
      }
      if (!jsonObj.get("ein").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ein` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ein").toString()));
      }
      if (!jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      if (!jsonObj.get("order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("brandRelationship") != null && !jsonObj.get("brandRelationship").isJsonNull()) && !jsonObj.get("brandRelationship").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandRelationship` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandRelationship").toString()));
      }
      if ((jsonObj.get("vertical") != null && !jsonObj.get("vertical").isJsonNull()) && !jsonObj.get("vertical").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vertical` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vertical").toString()));
      }
      if ((jsonObj.get("entityType") != null && !jsonObj.get("entityType").isJsonNull()) && !jsonObj.get("entityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityType").toString()));
      }
      if ((jsonObj.get("cspId") != null && !jsonObj.get("cspId").isJsonNull()) && !jsonObj.get("cspId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cspId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cspId").toString()));
      }
      if ((jsonObj.get("einIssuingCountry") != null && !jsonObj.get("einIssuingCountry").isJsonNull()) && !jsonObj.get("einIssuingCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `einIssuingCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("einIssuingCountry").toString()));
      }
      if ((jsonObj.get("universalEin") != null && !jsonObj.get("universalEin").isJsonNull()) && !jsonObj.get("universalEin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `universalEin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("universalEin").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
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
       if (!GetMessageBrand200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMessageBrand200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMessageBrand200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMessageBrand200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMessageBrand200Response>() {
           @Override
           public void write(JsonWriter out, GetMessageBrand200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMessageBrand200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMessageBrand200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMessageBrand200Response
  * @throws IOException if the JSON string is invalid with respect to GetMessageBrand200Response
  */
  public static GetMessageBrand200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMessageBrand200Response.class);
  }

 /**
  * Convert an instance of GetMessageBrand200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

