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
import java.time.OffsetDateTime;
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
 * GetFax200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-31T20:15:30.371Z[UTC]")
public class GetFax200Response {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<String> attachments;

  public static final String SERIALIZED_NAME_CALLER_DESTINATIONS = "callerDestinations";
  @SerializedName(SERIALIZED_NAME_CALLER_DESTINATIONS)
  private List<String> callerDestinations = new ArrayList<>();

  public static final String SERIALIZED_NAME_CALLER_ID_NUMBER = "callerIdNumber";
  @SerializedName(SERIALIZED_NAME_CALLER_ID_NUMBER)
  private String callerIdNumber;

  public static final String SERIALIZED_NAME_CALLER_DESTINATION = "callerDestination";
  @SerializedName(SERIALIZED_NAME_CALLER_DESTINATION)
  private String callerDestination;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private Integer pages = 0;

  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_TRANSFERED_PAGES = "transferedPages";
  @SerializedName(SERIALIZED_NAME_TRANSFERED_PAGES)
  private Integer transferedPages = 0;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    FAILED("failed"),
    
    SUCCESS("success"),
    
    PROCESSING("processing");

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
  private StatusEnum status = StatusEnum.PROCESSING;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SEND("send"),
    
    RECEIVE("receive");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String _file;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private String contact;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_FAX_ACCOUNT = "faxAccount";
  @SerializedName(SERIALIZED_NAME_FAX_ACCOUNT)
  private String faxAccount;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private Integer retries = 0;

  public static final String SERIALIZED_NAME_INVOICE = "invoice";
  @SerializedName(SERIALIZED_NAME_INVOICE)
  private String invoice;

  public static final String SERIALIZED_NAME_SENDER_EMAIL = "senderEmail";
  @SerializedName(SERIALIZED_NAME_SENDER_EMAIL)
  private String senderEmail;

  public static final String SERIALIZED_NAME_SENDER_NAME = "senderName";
  @SerializedName(SERIALIZED_NAME_SENDER_NAME)
  private String senderName;

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

  public GetFax200Response() {
  }

  public GetFax200Response attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public GetFax200Response addAttachmentsItem(String attachmentsItem) {
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


  public GetFax200Response callerDestinations(List<String> callerDestinations) {
    
    this.callerDestinations = callerDestinations;
    return this;
  }

  public GetFax200Response addCallerDestinationsItem(String callerDestinationsItem) {
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


  public GetFax200Response callerIdNumber(String callerIdNumber) {
    
    this.callerIdNumber = callerIdNumber;
    return this;
  }

   /**
   * Get callerIdNumber
   * @return callerIdNumber
  **/
  @javax.annotation.Nonnull
  public String getCallerIdNumber() {
    return callerIdNumber;
  }


  public void setCallerIdNumber(String callerIdNumber) {
    this.callerIdNumber = callerIdNumber;
  }


  public GetFax200Response callerDestination(String callerDestination) {
    
    this.callerDestination = callerDestination;
    return this;
  }

   /**
   * Get callerDestination
   * @return callerDestination
  **/
  @javax.annotation.Nonnull
  public String getCallerDestination() {
    return callerDestination;
  }


  public void setCallerDestination(String callerDestination) {
    this.callerDestination = callerDestination;
  }


  public GetFax200Response pages(Integer pages) {
    
    this.pages = pages;
    return this;
  }

   /**
   * Get pages
   * @return pages
  **/
  @javax.annotation.Nullable
  public Integer getPages() {
    return pages;
  }


  public void setPages(Integer pages) {
    this.pages = pages;
  }


  public GetFax200Response statusCode(Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  public Integer getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public GetFax200Response transferedPages(Integer transferedPages) {
    
    this.transferedPages = transferedPages;
    return this;
  }

   /**
   * Get transferedPages
   * @return transferedPages
  **/
  @javax.annotation.Nullable
  public Integer getTransferedPages() {
    return transferedPages;
  }


  public void setTransferedPages(Integer transferedPages) {
    this.transferedPages = transferedPages;
  }


  public GetFax200Response status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public GetFax200Response error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public GetFax200Response type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public GetFax200Response order(String order) {
    
    this.order = order;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return order
  **/
  @javax.annotation.Nullable
  public String getOrder() {
    return order;
  }


  public void setOrder(String order) {
    this.order = order;
  }


  public GetFax200Response _file(String _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return _file
  **/
  @javax.annotation.Nullable
  public String getFile() {
    return _file;
  }


  public void setFile(String _file) {
    this._file = _file;
  }


  public GetFax200Response contact(String contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return contact
  **/
  @javax.annotation.Nullable
  public String getContact() {
    return contact;
  }


  public void setContact(String contact) {
    this.contact = contact;
  }


  public GetFax200Response number(String number) {
    
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


  public GetFax200Response faxAccount(String faxAccount) {
    
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


  public GetFax200Response retries(Integer retries) {
    
    this.retries = retries;
    return this;
  }

   /**
   * Get retries
   * @return retries
  **/
  @javax.annotation.Nullable
  public Integer getRetries() {
    return retries;
  }


  public void setRetries(Integer retries) {
    this.retries = retries;
  }


  public GetFax200Response invoice(String invoice) {
    
    this.invoice = invoice;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return invoice
  **/
  @javax.annotation.Nullable
  public String getInvoice() {
    return invoice;
  }


  public void setInvoice(String invoice) {
    this.invoice = invoice;
  }


  public GetFax200Response senderEmail(String senderEmail) {
    
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * Get senderEmail
   * @return senderEmail
  **/
  @javax.annotation.Nullable
  public String getSenderEmail() {
    return senderEmail;
  }


  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }


  public GetFax200Response senderName(String senderName) {
    
    this.senderName = senderName;
    return this;
  }

   /**
   * Get senderName
   * @return senderName
  **/
  @javax.annotation.Nullable
  public String getSenderName() {
    return senderName;
  }


  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }


  public GetFax200Response id(String id) {
    
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


  public GetFax200Response createdByUserId(String createdByUserId) {
    
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


  public GetFax200Response updatedByUserId(String updatedByUserId) {
    
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


  public GetFax200Response createdAt(OffsetDateTime createdAt) {
    
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


  public GetFax200Response updatedAt(OffsetDateTime updatedAt) {
    
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
    GetFax200Response getFax200Response = (GetFax200Response) o;
    return Objects.equals(this.attachments, getFax200Response.attachments) &&
        Objects.equals(this.callerDestinations, getFax200Response.callerDestinations) &&
        Objects.equals(this.callerIdNumber, getFax200Response.callerIdNumber) &&
        Objects.equals(this.callerDestination, getFax200Response.callerDestination) &&
        Objects.equals(this.pages, getFax200Response.pages) &&
        Objects.equals(this.statusCode, getFax200Response.statusCode) &&
        Objects.equals(this.transferedPages, getFax200Response.transferedPages) &&
        Objects.equals(this.status, getFax200Response.status) &&
        Objects.equals(this.error, getFax200Response.error) &&
        Objects.equals(this.type, getFax200Response.type) &&
        Objects.equals(this.order, getFax200Response.order) &&
        Objects.equals(this._file, getFax200Response._file) &&
        Objects.equals(this.contact, getFax200Response.contact) &&
        Objects.equals(this.number, getFax200Response.number) &&
        Objects.equals(this.faxAccount, getFax200Response.faxAccount) &&
        Objects.equals(this.retries, getFax200Response.retries) &&
        Objects.equals(this.invoice, getFax200Response.invoice) &&
        Objects.equals(this.senderEmail, getFax200Response.senderEmail) &&
        Objects.equals(this.senderName, getFax200Response.senderName) &&
        Objects.equals(this.id, getFax200Response.id) &&
        Objects.equals(this.createdByUserId, getFax200Response.createdByUserId) &&
        Objects.equals(this.updatedByUserId, getFax200Response.updatedByUserId) &&
        Objects.equals(this.createdAt, getFax200Response.createdAt) &&
        Objects.equals(this.updatedAt, getFax200Response.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, callerDestinations, callerIdNumber, callerDestination, pages, statusCode, transferedPages, status, error, type, order, _file, contact, number, faxAccount, retries, invoice, senderEmail, senderName, id, createdByUserId, updatedByUserId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFax200Response {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    callerDestinations: ").append(toIndentedString(callerDestinations)).append("\n");
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
    openapiFields.add("attachments");
    openapiFields.add("callerDestinations");
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
    openapiFields.add("_id");
    openapiFields.add("createdByUserId");
    openapiFields.add("updatedByUserId");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("callerDestinations");
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
  * @throws IOException if the JSON Object is invalid with respect to GetFax200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetFax200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFax200Response is not found in the empty JSON string", GetFax200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetFax200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFax200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetFax200Response.openapiRequiredFields) {
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
      if (!jsonObj.get("callerIdNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callerIdNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callerIdNumber").toString()));
      }
      if (!jsonObj.get("callerDestination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callerDestination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callerDestination").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) && !jsonObj.get("order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order").toString()));
      }
      if ((jsonObj.get("file") != null && !jsonObj.get("file").isJsonNull()) && !jsonObj.get("file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file").toString()));
      }
      if ((jsonObj.get("contact") != null && !jsonObj.get("contact").isJsonNull()) && !jsonObj.get("contact").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact").toString()));
      }
      if (!jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      if (!jsonObj.get("faxAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `faxAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("faxAccount").toString()));
      }
      if ((jsonObj.get("invoice") != null && !jsonObj.get("invoice").isJsonNull()) && !jsonObj.get("invoice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice").toString()));
      }
      if ((jsonObj.get("senderEmail") != null && !jsonObj.get("senderEmail").isJsonNull()) && !jsonObj.get("senderEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senderEmail").toString()));
      }
      if ((jsonObj.get("senderName") != null && !jsonObj.get("senderName").isJsonNull()) && !jsonObj.get("senderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senderName").toString()));
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
       if (!GetFax200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFax200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFax200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFax200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFax200Response>() {
           @Override
           public void write(JsonWriter out, GetFax200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFax200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetFax200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetFax200Response
  * @throws IOException if the JSON string is invalid with respect to GetFax200Response
  */
  public static GetFax200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFax200Response.class);
  }

 /**
  * Convert an instance of GetFax200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

