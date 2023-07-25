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
 * Faxes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-25T10:46:54.095Z[UTC]")
public class Faxes {
  public static final String SERIALIZED_NAME_CALLER_ID_NUMBER = "callerIdNumber";
  @SerializedName(SERIALIZED_NAME_CALLER_ID_NUMBER)
  private Object callerIdNumber = null;

  public static final String SERIALIZED_NAME_CALLER_DESTINATION = "callerDestination";
  @SerializedName(SERIALIZED_NAME_CALLER_DESTINATION)
  private Object callerDestination = null;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private Object pages = null;

  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Object statusCode = null;

  public static final String SERIALIZED_NAME_TRANSFERED_PAGES = "transferedPages";
  @SerializedName(SERIALIZED_NAME_TRANSFERED_PAGES)
  private Object transferedPages = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Object status = null;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Object error = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Object type = null;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Object order = null;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private Object _file = null;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private Object contact = null;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Object number = null;

  public static final String SERIALIZED_NAME_FAX_ACCOUNT = "faxAccount";
  @SerializedName(SERIALIZED_NAME_FAX_ACCOUNT)
  private Object faxAccount = null;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private Object retries = null;

  public static final String SERIALIZED_NAME_INVOICE = "invoice";
  @SerializedName(SERIALIZED_NAME_INVOICE)
  private Object invoice = null;

  public static final String SERIALIZED_NAME_SENDER_EMAIL = "senderEmail";
  @SerializedName(SERIALIZED_NAME_SENDER_EMAIL)
  private Object senderEmail = null;

  public static final String SERIALIZED_NAME_SENDER_NAME = "senderName";
  @SerializedName(SERIALIZED_NAME_SENDER_NAME)
  private Object senderName = null;

  public Faxes() {
  }

  public Faxes callerIdNumber(Object callerIdNumber) {
    
    this.callerIdNumber = callerIdNumber;
    return this;
  }

   /**
   * Get callerIdNumber
   * @return callerIdNumber
  **/
  @javax.annotation.Nullable
  public Object getCallerIdNumber() {
    return callerIdNumber;
  }


  public void setCallerIdNumber(Object callerIdNumber) {
    this.callerIdNumber = callerIdNumber;
  }


  public Faxes callerDestination(Object callerDestination) {
    
    this.callerDestination = callerDestination;
    return this;
  }

   /**
   * Get callerDestination
   * @return callerDestination
  **/
  @javax.annotation.Nullable
  public Object getCallerDestination() {
    return callerDestination;
  }


  public void setCallerDestination(Object callerDestination) {
    this.callerDestination = callerDestination;
  }


  public Faxes pages(Object pages) {
    
    this.pages = pages;
    return this;
  }

   /**
   * Get pages
   * @return pages
  **/
  @javax.annotation.Nullable
  public Object getPages() {
    return pages;
  }


  public void setPages(Object pages) {
    this.pages = pages;
  }


  public Faxes statusCode(Object statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  public Object getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Object statusCode) {
    this.statusCode = statusCode;
  }


  public Faxes transferedPages(Object transferedPages) {
    
    this.transferedPages = transferedPages;
    return this;
  }

   /**
   * Get transferedPages
   * @return transferedPages
  **/
  @javax.annotation.Nullable
  public Object getTransferedPages() {
    return transferedPages;
  }


  public void setTransferedPages(Object transferedPages) {
    this.transferedPages = transferedPages;
  }


  public Faxes status(Object status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Object getStatus() {
    return status;
  }


  public void setStatus(Object status) {
    this.status = status;
  }


  public Faxes error(Object error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  public Object getError() {
    return error;
  }


  public void setError(Object error) {
    this.error = error;
  }


  public Faxes type(Object type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public Object getType() {
    return type;
  }


  public void setType(Object type) {
    this.type = type;
  }


  public Faxes order(Object order) {
    
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


  public Faxes _file(Object _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return _file
  **/
  @javax.annotation.Nullable
  public Object getFile() {
    return _file;
  }


  public void setFile(Object _file) {
    this._file = _file;
  }


  public Faxes contact(Object contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return contact
  **/
  @javax.annotation.Nullable
  public Object getContact() {
    return contact;
  }


  public void setContact(Object contact) {
    this.contact = contact;
  }


  public Faxes number(Object number) {
    
    this.number = number;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return number
  **/
  @javax.annotation.Nullable
  public Object getNumber() {
    return number;
  }


  public void setNumber(Object number) {
    this.number = number;
  }


  public Faxes faxAccount(Object faxAccount) {
    
    this.faxAccount = faxAccount;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return faxAccount
  **/
  @javax.annotation.Nullable
  public Object getFaxAccount() {
    return faxAccount;
  }


  public void setFaxAccount(Object faxAccount) {
    this.faxAccount = faxAccount;
  }


  public Faxes retries(Object retries) {
    
    this.retries = retries;
    return this;
  }

   /**
   * Get retries
   * @return retries
  **/
  @javax.annotation.Nullable
  public Object getRetries() {
    return retries;
  }


  public void setRetries(Object retries) {
    this.retries = retries;
  }


  public Faxes invoice(Object invoice) {
    
    this.invoice = invoice;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return invoice
  **/
  @javax.annotation.Nullable
  public Object getInvoice() {
    return invoice;
  }


  public void setInvoice(Object invoice) {
    this.invoice = invoice;
  }


  public Faxes senderEmail(Object senderEmail) {
    
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * Get senderEmail
   * @return senderEmail
  **/
  @javax.annotation.Nullable
  public Object getSenderEmail() {
    return senderEmail;
  }


  public void setSenderEmail(Object senderEmail) {
    this.senderEmail = senderEmail;
  }


  public Faxes senderName(Object senderName) {
    
    this.senderName = senderName;
    return this;
  }

   /**
   * Get senderName
   * @return senderName
  **/
  @javax.annotation.Nullable
  public Object getSenderName() {
    return senderName;
  }


  public void setSenderName(Object senderName) {
    this.senderName = senderName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Faxes faxes = (Faxes) o;
    return Objects.equals(this.callerIdNumber, faxes.callerIdNumber) &&
        Objects.equals(this.callerDestination, faxes.callerDestination) &&
        Objects.equals(this.pages, faxes.pages) &&
        Objects.equals(this.statusCode, faxes.statusCode) &&
        Objects.equals(this.transferedPages, faxes.transferedPages) &&
        Objects.equals(this.status, faxes.status) &&
        Objects.equals(this.error, faxes.error) &&
        Objects.equals(this.type, faxes.type) &&
        Objects.equals(this.order, faxes.order) &&
        Objects.equals(this._file, faxes._file) &&
        Objects.equals(this.contact, faxes.contact) &&
        Objects.equals(this.number, faxes.number) &&
        Objects.equals(this.faxAccount, faxes.faxAccount) &&
        Objects.equals(this.retries, faxes.retries) &&
        Objects.equals(this.invoice, faxes.invoice) &&
        Objects.equals(this.senderEmail, faxes.senderEmail) &&
        Objects.equals(this.senderName, faxes.senderName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(callerIdNumber, callerDestination, pages, statusCode, transferedPages, status, error, type, order, _file, contact, number, faxAccount, retries, invoice, senderEmail, senderName);
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
    sb.append("class Faxes {\n");
    sb.append("    callerIdNumber: ").append(toIndentedString(callerIdNumber)).append("\n");
    sb.append("    callerDestination: ").append(toIndentedString(callerDestination)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    transferedPages: ").append(toIndentedString(transferedPages)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    faxAccount: ").append(toIndentedString(faxAccount)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
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
    openapiFields.add("callerIdNumber");
    openapiFields.add("callerDestination");
    openapiFields.add("pages");
    openapiFields.add("statusCode");
    openapiFields.add("transferedPages");
    openapiFields.add("status");
    openapiFields.add("error");
    openapiFields.add("type");
    openapiFields.add("order");
    openapiFields.add("file");
    openapiFields.add("contact");
    openapiFields.add("number");
    openapiFields.add("faxAccount");
    openapiFields.add("retries");
    openapiFields.add("invoice");
    openapiFields.add("senderEmail");
    openapiFields.add("senderName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("callerIdNumber");
    openapiRequiredFields.add("callerDestination");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("faxAccount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Faxes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Faxes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Faxes is not found in the empty JSON string", Faxes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Faxes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Faxes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Faxes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Faxes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Faxes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Faxes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Faxes.class));

       return (TypeAdapter<T>) new TypeAdapter<Faxes>() {
           @Override
           public void write(JsonWriter out, Faxes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Faxes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Faxes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Faxes
  * @throws IOException if the JSON string is invalid with respect to Faxes
  */
  public static Faxes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Faxes.class);
  }

 /**
  * Convert an instance of Faxes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

