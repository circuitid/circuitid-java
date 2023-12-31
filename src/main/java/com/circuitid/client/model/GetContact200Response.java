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
 * GetContact200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T20:07:07.395Z[UTC]")
public class GetContact200Response {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private String first;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private String last;

  public static final String SERIALIZED_NAME_MOBILE_PHONE = "mobilePhone";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE)
  private String mobilePhone;

  public static final String SERIALIZED_NAME_BUSINESS_PHONE = "businessPhone";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PHONE)
  private String businessPhone;

  public static final String SERIALIZED_NAME_FAX_PHONE = "faxPhone";
  @SerializedName(SERIALIZED_NAME_FAX_PHONE)
  private String faxPhone;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private Integer extension;

  public static final String SERIALIZED_NAME_JOB_TITLE = "jobTitle";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private String jobTitle;

  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private String department;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private String avatar;

  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

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

  public GetContact200Response() {
  }

  public GetContact200Response email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public GetContact200Response first(String first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nonnull
  public String getFirst() {
    return first;
  }


  public void setFirst(String first) {
    this.first = first;
  }


  public GetContact200Response last(String last) {
    
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @javax.annotation.Nullable
  public String getLast() {
    return last;
  }


  public void setLast(String last) {
    this.last = last;
  }


  public GetContact200Response mobilePhone(String mobilePhone) {
    
    this.mobilePhone = mobilePhone;
    return this;
  }

   /**
   * Get mobilePhone
   * @return mobilePhone
  **/
  @javax.annotation.Nullable
  public String getMobilePhone() {
    return mobilePhone;
  }


  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  public GetContact200Response businessPhone(String businessPhone) {
    
    this.businessPhone = businessPhone;
    return this;
  }

   /**
   * Get businessPhone
   * @return businessPhone
  **/
  @javax.annotation.Nullable
  public String getBusinessPhone() {
    return businessPhone;
  }


  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }


  public GetContact200Response faxPhone(String faxPhone) {
    
    this.faxPhone = faxPhone;
    return this;
  }

   /**
   * Get faxPhone
   * @return faxPhone
  **/
  @javax.annotation.Nullable
  public String getFaxPhone() {
    return faxPhone;
  }


  public void setFaxPhone(String faxPhone) {
    this.faxPhone = faxPhone;
  }


  public GetContact200Response extension(Integer extension) {
    
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @javax.annotation.Nullable
  public Integer getExtension() {
    return extension;
  }


  public void setExtension(Integer extension) {
    this.extension = extension;
  }


  public GetContact200Response jobTitle(String jobTitle) {
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  public String getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public GetContact200Response department(String department) {
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nullable
  public String getDepartment() {
    return department;
  }


  public void setDepartment(String department) {
    this.department = department;
  }


  public GetContact200Response avatar(String avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @javax.annotation.Nullable
  public String getAvatar() {
    return avatar;
  }


  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public GetContact200Response id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GetContact200Response createdByUserId(String createdByUserId) {
    
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


  public GetContact200Response updatedByUserId(String updatedByUserId) {
    
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


  public GetContact200Response createdAt(OffsetDateTime createdAt) {
    
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


  public GetContact200Response updatedAt(OffsetDateTime updatedAt) {
    
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
    GetContact200Response getContact200Response = (GetContact200Response) o;
    return Objects.equals(this.email, getContact200Response.email) &&
        Objects.equals(this.first, getContact200Response.first) &&
        Objects.equals(this.last, getContact200Response.last) &&
        Objects.equals(this.mobilePhone, getContact200Response.mobilePhone) &&
        Objects.equals(this.businessPhone, getContact200Response.businessPhone) &&
        Objects.equals(this.faxPhone, getContact200Response.faxPhone) &&
        Objects.equals(this.extension, getContact200Response.extension) &&
        Objects.equals(this.jobTitle, getContact200Response.jobTitle) &&
        Objects.equals(this.department, getContact200Response.department) &&
        Objects.equals(this.avatar, getContact200Response.avatar) &&
        Objects.equals(this.id, getContact200Response.id) &&
        Objects.equals(this.createdByUserId, getContact200Response.createdByUserId) &&
        Objects.equals(this.updatedByUserId, getContact200Response.updatedByUserId) &&
        Objects.equals(this.createdAt, getContact200Response.createdAt) &&
        Objects.equals(this.updatedAt, getContact200Response.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, first, last, mobilePhone, businessPhone, faxPhone, extension, jobTitle, department, avatar, id, createdByUserId, updatedByUserId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContact200Response {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    faxPhone: ").append(toIndentedString(faxPhone)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("first");
    openapiFields.add("last");
    openapiFields.add("mobilePhone");
    openapiFields.add("businessPhone");
    openapiFields.add("faxPhone");
    openapiFields.add("extension");
    openapiFields.add("jobTitle");
    openapiFields.add("department");
    openapiFields.add("avatar");
    openapiFields.add("_id");
    openapiFields.add("createdByUserId");
    openapiFields.add("updatedByUserId");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("first");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetContact200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetContact200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContact200Response is not found in the empty JSON string", GetContact200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetContact200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContact200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetContact200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("first").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first").toString()));
      }
      if ((jsonObj.get("last") != null && !jsonObj.get("last").isJsonNull()) && !jsonObj.get("last").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last").toString()));
      }
      if ((jsonObj.get("mobilePhone") != null && !jsonObj.get("mobilePhone").isJsonNull()) && !jsonObj.get("mobilePhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobilePhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobilePhone").toString()));
      }
      if ((jsonObj.get("businessPhone") != null && !jsonObj.get("businessPhone").isJsonNull()) && !jsonObj.get("businessPhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessPhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessPhone").toString()));
      }
      if ((jsonObj.get("faxPhone") != null && !jsonObj.get("faxPhone").isJsonNull()) && !jsonObj.get("faxPhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `faxPhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("faxPhone").toString()));
      }
      if ((jsonObj.get("jobTitle") != null && !jsonObj.get("jobTitle").isJsonNull()) && !jsonObj.get("jobTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobTitle").toString()));
      }
      if ((jsonObj.get("department") != null && !jsonObj.get("department").isJsonNull()) && !jsonObj.get("department").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `department` to be a primitive type in the JSON string but got `%s`", jsonObj.get("department").toString()));
      }
      if ((jsonObj.get("avatar") != null && !jsonObj.get("avatar").isJsonNull()) && !jsonObj.get("avatar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar").toString()));
      }
      if ((jsonObj.get("_id") != null && !jsonObj.get("_id").isJsonNull()) && !jsonObj.get("_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_id").toString()));
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
       if (!GetContact200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContact200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContact200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContact200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContact200Response>() {
           @Override
           public void write(JsonWriter out, GetContact200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContact200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetContact200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetContact200Response
  * @throws IOException if the JSON string is invalid with respect to GetContact200Response
  */
  public static GetContact200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContact200Response.class);
  }

 /**
  * Convert an instance of GetContact200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

