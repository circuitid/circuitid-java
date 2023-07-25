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
 * Contacts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-25T10:46:54.095Z[UTC]")
public class Contacts {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private Object email = null;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private Object first = null;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private Object last = null;

  public static final String SERIALIZED_NAME_MOBILE_PHONE = "mobilePhone";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE)
  private Object mobilePhone = null;

  public static final String SERIALIZED_NAME_BUSINESS_PHONE = "businessPhone";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PHONE)
  private Object businessPhone = null;

  public static final String SERIALIZED_NAME_FAX_PHONE = "faxPhone";
  @SerializedName(SERIALIZED_NAME_FAX_PHONE)
  private Object faxPhone = null;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private Object extension = null;

  public static final String SERIALIZED_NAME_JOB_TITLE = "jobTitle";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private Object jobTitle = null;

  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private Object department = null;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private Object avatar = null;

  public Contacts() {
  }

  public Contacts email(Object email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public Object getEmail() {
    return email;
  }


  public void setEmail(Object email) {
    this.email = email;
  }


  public Contacts first(Object first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nullable
  public Object getFirst() {
    return first;
  }


  public void setFirst(Object first) {
    this.first = first;
  }


  public Contacts last(Object last) {
    
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @javax.annotation.Nullable
  public Object getLast() {
    return last;
  }


  public void setLast(Object last) {
    this.last = last;
  }


  public Contacts mobilePhone(Object mobilePhone) {
    
    this.mobilePhone = mobilePhone;
    return this;
  }

   /**
   * Get mobilePhone
   * @return mobilePhone
  **/
  @javax.annotation.Nullable
  public Object getMobilePhone() {
    return mobilePhone;
  }


  public void setMobilePhone(Object mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  public Contacts businessPhone(Object businessPhone) {
    
    this.businessPhone = businessPhone;
    return this;
  }

   /**
   * Get businessPhone
   * @return businessPhone
  **/
  @javax.annotation.Nullable
  public Object getBusinessPhone() {
    return businessPhone;
  }


  public void setBusinessPhone(Object businessPhone) {
    this.businessPhone = businessPhone;
  }


  public Contacts faxPhone(Object faxPhone) {
    
    this.faxPhone = faxPhone;
    return this;
  }

   /**
   * Get faxPhone
   * @return faxPhone
  **/
  @javax.annotation.Nullable
  public Object getFaxPhone() {
    return faxPhone;
  }


  public void setFaxPhone(Object faxPhone) {
    this.faxPhone = faxPhone;
  }


  public Contacts extension(Object extension) {
    
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @javax.annotation.Nullable
  public Object getExtension() {
    return extension;
  }


  public void setExtension(Object extension) {
    this.extension = extension;
  }


  public Contacts jobTitle(Object jobTitle) {
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  public Object getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(Object jobTitle) {
    this.jobTitle = jobTitle;
  }


  public Contacts department(Object department) {
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nullable
  public Object getDepartment() {
    return department;
  }


  public void setDepartment(Object department) {
    this.department = department;
  }


  public Contacts avatar(Object avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @javax.annotation.Nullable
  public Object getAvatar() {
    return avatar;
  }


  public void setAvatar(Object avatar) {
    this.avatar = avatar;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contacts contacts = (Contacts) o;
    return Objects.equals(this.email, contacts.email) &&
        Objects.equals(this.first, contacts.first) &&
        Objects.equals(this.last, contacts.last) &&
        Objects.equals(this.mobilePhone, contacts.mobilePhone) &&
        Objects.equals(this.businessPhone, contacts.businessPhone) &&
        Objects.equals(this.faxPhone, contacts.faxPhone) &&
        Objects.equals(this.extension, contacts.extension) &&
        Objects.equals(this.jobTitle, contacts.jobTitle) &&
        Objects.equals(this.department, contacts.department) &&
        Objects.equals(this.avatar, contacts.avatar);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, first, last, mobilePhone, businessPhone, faxPhone, extension, jobTitle, department, avatar);
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
    sb.append("class Contacts {\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("first");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Contacts
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Contacts.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Contacts is not found in the empty JSON string", Contacts.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Contacts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Contacts` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Contacts.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Contacts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Contacts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Contacts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Contacts.class));

       return (TypeAdapter<T>) new TypeAdapter<Contacts>() {
           @Override
           public void write(JsonWriter out, Contacts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Contacts read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Contacts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Contacts
  * @throws IOException if the JSON string is invalid with respect to Contacts
  */
  public static Contacts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Contacts.class);
  }

 /**
  * Convert an instance of Contacts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

