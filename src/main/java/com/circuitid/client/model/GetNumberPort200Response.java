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
 * GetNumberPort200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-29T10:07:56.257Z[UTC]")
public class GetNumberPort200Response {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    IN("port in"),
    
    OUT("port out");

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

  /**
   * Gets or Sets typeOfService
   */
  @JsonAdapter(TypeOfServiceEnum.Adapter.class)
  public enum TypeOfServiceEnum {
    BUSINESS("business"),
    
    RESIDENCE("residence");

    private String value;

    TypeOfServiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeOfServiceEnum fromValue(String value) {
      for (TypeOfServiceEnum b : TypeOfServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeOfServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeOfServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeOfServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeOfServiceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE_OF_SERVICE = "typeOfService";
  @SerializedName(SERIALIZED_NAME_TYPE_OF_SERVICE)
  private TypeOfServiceEnum typeOfService;

  public static final String SERIALIZED_NAME_AUTHORIZED_PERSON = "authorizedPerson";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_PERSON)
  private String authorizedPerson;

  public static final String SERIALIZED_NAME_DESIRED_DUE_DATE = "desiredDueDate";
  @SerializedName(SERIALIZED_NAME_DESIRED_DUE_DATE)
  private OffsetDateTime desiredDueDate;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_PHONE_NUMBER = "accountPhoneNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_PHONE_NUMBER)
  private String accountPhoneNumber;

  public static final String SERIALIZED_NAME_OFFICE = "office";
  @SerializedName(SERIALIZED_NAME_OFFICE)
  private String office;

  /**
   * Gets or Sets e911
   */
  @JsonAdapter(E911Enum.Adapter.class)
  public enum E911Enum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    E911Enum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static E911Enum fromValue(Integer value) {
      for (E911Enum b : E911Enum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<E911Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final E911Enum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public E911Enum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return E911Enum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_E911 = "e911";
  @SerializedName(SERIALIZED_NAME_E911)
  private E911Enum e911 = E911Enum.NUMBER_0;

  public static final String SERIALIZED_NAME_INVOICE = "invoice";
  @SerializedName(SERIALIZED_NAME_INVOICE)
  private String invoice;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PROCESSING("processing"),
    
    FAILED("failed"),
    
    ERROR("error"),
    
    COMPLETED("completed");

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

  /**
   * Gets or Sets destinationType
   */
  @JsonAdapter(DestinationTypeEnum.Adapter.class)
  public enum DestinationTypeEnum {
    ANNOUNCEMENTS("announcements"),
    
    DIRECTORIES("directories"),
    
    PARK("park"),
    
    NUMBERS("numbers"),
    
    MENUS("menus"),
    
    USERS("users"),
    
    SERVERS("servers"),
    
    INBOUNDRULES("inboundrules"),
    
    CALLQUEUES("callqueues"),
    
    FAXACCOUNTS("faxaccounts"),
    
    CALLFORWARDING("callforwarding"),
    
    HANGUP("hangup"),
    
    PHONEINBOUNDRULES("phoneinboundrules"),
    
    VOICEMAILACCOUNTS("voicemailaccounts");

    private String value;

    DestinationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DestinationTypeEnum fromValue(String value) {
      for (DestinationTypeEnum b : DestinationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DestinationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DestinationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESTINATION_TYPE = "destinationType";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TYPE)
  private DestinationTypeEnum destinationType;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_CALL_FORWARDING_DESTINATION = "callForwardingDestination";
  @SerializedName(SERIALIZED_NAME_CALL_FORWARDING_DESTINATION)
  private String callForwardingDestination;

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

  public GetNumberPort200Response() {
  }

  public GetNumberPort200Response name(String name) {
    
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


  public GetNumberPort200Response type(TypeEnum type) {
    
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


  public GetNumberPort200Response typeOfService(TypeOfServiceEnum typeOfService) {
    
    this.typeOfService = typeOfService;
    return this;
  }

   /**
   * Get typeOfService
   * @return typeOfService
  **/
  @javax.annotation.Nonnull
  public TypeOfServiceEnum getTypeOfService() {
    return typeOfService;
  }


  public void setTypeOfService(TypeOfServiceEnum typeOfService) {
    this.typeOfService = typeOfService;
  }


  public GetNumberPort200Response authorizedPerson(String authorizedPerson) {
    
    this.authorizedPerson = authorizedPerson;
    return this;
  }

   /**
   * Get authorizedPerson
   * @return authorizedPerson
  **/
  @javax.annotation.Nonnull
  public String getAuthorizedPerson() {
    return authorizedPerson;
  }


  public void setAuthorizedPerson(String authorizedPerson) {
    this.authorizedPerson = authorizedPerson;
  }


  public GetNumberPort200Response desiredDueDate(OffsetDateTime desiredDueDate) {
    
    this.desiredDueDate = desiredDueDate;
    return this;
  }

   /**
   * Get desiredDueDate
   * @return desiredDueDate
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getDesiredDueDate() {
    return desiredDueDate;
  }


  public void setDesiredDueDate(OffsetDateTime desiredDueDate) {
    this.desiredDueDate = desiredDueDate;
  }


  public GetNumberPort200Response accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nonnull
  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public GetNumberPort200Response accountPhoneNumber(String accountPhoneNumber) {
    
    this.accountPhoneNumber = accountPhoneNumber;
    return this;
  }

   /**
   * Get accountPhoneNumber
   * @return accountPhoneNumber
  **/
  @javax.annotation.Nonnull
  public String getAccountPhoneNumber() {
    return accountPhoneNumber;
  }


  public void setAccountPhoneNumber(String accountPhoneNumber) {
    this.accountPhoneNumber = accountPhoneNumber;
  }


  public GetNumberPort200Response office(String office) {
    
    this.office = office;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return office
  **/
  @javax.annotation.Nonnull
  public String getOffice() {
    return office;
  }


  public void setOffice(String office) {
    this.office = office;
  }


  public GetNumberPort200Response e911(E911Enum e911) {
    
    this.e911 = e911;
    return this;
  }

   /**
   * Get e911
   * @return e911
  **/
  @javax.annotation.Nullable
  public E911Enum getE911() {
    return e911;
  }


  public void setE911(E911Enum e911) {
    this.e911 = e911;
  }


  public GetNumberPort200Response invoice(String invoice) {
    
    this.invoice = invoice;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return invoice
  **/
  @javax.annotation.Nonnull
  public String getInvoice() {
    return invoice;
  }


  public void setInvoice(String invoice) {
    this.invoice = invoice;
  }


  public GetNumberPort200Response status(StatusEnum status) {
    
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


  public GetNumberPort200Response destinationType(DestinationTypeEnum destinationType) {
    
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Get destinationType
   * @return destinationType
  **/
  @javax.annotation.Nonnull
  public DestinationTypeEnum getDestinationType() {
    return destinationType;
  }


  public void setDestinationType(DestinationTypeEnum destinationType) {
    this.destinationType = destinationType;
  }


  public GetNumberPort200Response destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return destination
  **/
  @javax.annotation.Nullable
  public String getDestination() {
    return destination;
  }


  public void setDestination(String destination) {
    this.destination = destination;
  }


  public GetNumberPort200Response ref(String ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @javax.annotation.Nullable
  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    this.ref = ref;
  }


  public GetNumberPort200Response callForwardingDestination(String callForwardingDestination) {
    
    this.callForwardingDestination = callForwardingDestination;
    return this;
  }

   /**
   * Get callForwardingDestination
   * @return callForwardingDestination
  **/
  @javax.annotation.Nullable
  public String getCallForwardingDestination() {
    return callForwardingDestination;
  }


  public void setCallForwardingDestination(String callForwardingDestination) {
    this.callForwardingDestination = callForwardingDestination;
  }


  public GetNumberPort200Response createdByUserId(String createdByUserId) {
    
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


  public GetNumberPort200Response updatedByUserId(String updatedByUserId) {
    
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


  public GetNumberPort200Response createdAt(OffsetDateTime createdAt) {
    
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


  public GetNumberPort200Response updatedAt(OffsetDateTime updatedAt) {
    
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
    GetNumberPort200Response getNumberPort200Response = (GetNumberPort200Response) o;
    return Objects.equals(this.name, getNumberPort200Response.name) &&
        Objects.equals(this.type, getNumberPort200Response.type) &&
        Objects.equals(this.typeOfService, getNumberPort200Response.typeOfService) &&
        Objects.equals(this.authorizedPerson, getNumberPort200Response.authorizedPerson) &&
        Objects.equals(this.desiredDueDate, getNumberPort200Response.desiredDueDate) &&
        Objects.equals(this.accountNumber, getNumberPort200Response.accountNumber) &&
        Objects.equals(this.accountPhoneNumber, getNumberPort200Response.accountPhoneNumber) &&
        Objects.equals(this.office, getNumberPort200Response.office) &&
        Objects.equals(this.e911, getNumberPort200Response.e911) &&
        Objects.equals(this.invoice, getNumberPort200Response.invoice) &&
        Objects.equals(this.status, getNumberPort200Response.status) &&
        Objects.equals(this.destinationType, getNumberPort200Response.destinationType) &&
        Objects.equals(this.destination, getNumberPort200Response.destination) &&
        Objects.equals(this.ref, getNumberPort200Response.ref) &&
        Objects.equals(this.callForwardingDestination, getNumberPort200Response.callForwardingDestination) &&
        Objects.equals(this.createdByUserId, getNumberPort200Response.createdByUserId) &&
        Objects.equals(this.updatedByUserId, getNumberPort200Response.updatedByUserId) &&
        Objects.equals(this.createdAt, getNumberPort200Response.createdAt) &&
        Objects.equals(this.updatedAt, getNumberPort200Response.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, typeOfService, authorizedPerson, desiredDueDate, accountNumber, accountPhoneNumber, office, e911, invoice, status, destinationType, destination, ref, callForwardingDestination, createdByUserId, updatedByUserId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNumberPort200Response {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeOfService: ").append(toIndentedString(typeOfService)).append("\n");
    sb.append("    authorizedPerson: ").append(toIndentedString(authorizedPerson)).append("\n");
    sb.append("    desiredDueDate: ").append(toIndentedString(desiredDueDate)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountPhoneNumber: ").append(toIndentedString(accountPhoneNumber)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    e911: ").append(toIndentedString(e911)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    callForwardingDestination: ").append(toIndentedString(callForwardingDestination)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("typeOfService");
    openapiFields.add("authorizedPerson");
    openapiFields.add("desiredDueDate");
    openapiFields.add("accountNumber");
    openapiFields.add("accountPhoneNumber");
    openapiFields.add("office");
    openapiFields.add("e911");
    openapiFields.add("invoice");
    openapiFields.add("status");
    openapiFields.add("destinationType");
    openapiFields.add("destination");
    openapiFields.add("ref");
    openapiFields.add("callForwardingDestination");
    openapiFields.add("createdByUserId");
    openapiFields.add("updatedByUserId");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("typeOfService");
    openapiRequiredFields.add("authorizedPerson");
    openapiRequiredFields.add("desiredDueDate");
    openapiRequiredFields.add("accountNumber");
    openapiRequiredFields.add("accountPhoneNumber");
    openapiRequiredFields.add("office");
    openapiRequiredFields.add("invoice");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("destinationType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetNumberPort200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetNumberPort200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetNumberPort200Response is not found in the empty JSON string", GetNumberPort200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetNumberPort200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetNumberPort200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetNumberPort200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("typeOfService").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeOfService` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typeOfService").toString()));
      }
      if (!jsonObj.get("authorizedPerson").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorizedPerson` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorizedPerson").toString()));
      }
      if (!jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      if (!jsonObj.get("accountPhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountPhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountPhoneNumber").toString()));
      }
      if (!jsonObj.get("office").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `office` to be a primitive type in the JSON string but got `%s`", jsonObj.get("office").toString()));
      }
      if (!jsonObj.get("invoice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("destinationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destinationType").toString()));
      }
      if ((jsonObj.get("destination") != null && !jsonObj.get("destination").isJsonNull()) && !jsonObj.get("destination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination").toString()));
      }
      if ((jsonObj.get("ref") != null && !jsonObj.get("ref").isJsonNull()) && !jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      if ((jsonObj.get("callForwardingDestination") != null && !jsonObj.get("callForwardingDestination").isJsonNull()) && !jsonObj.get("callForwardingDestination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callForwardingDestination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callForwardingDestination").toString()));
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
       if (!GetNumberPort200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetNumberPort200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetNumberPort200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetNumberPort200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetNumberPort200Response>() {
           @Override
           public void write(JsonWriter out, GetNumberPort200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetNumberPort200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetNumberPort200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetNumberPort200Response
  * @throws IOException if the JSON string is invalid with respect to GetNumberPort200Response
  */
  public static GetNumberPort200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetNumberPort200Response.class);
  }

 /**
  * Convert an instance of GetNumberPort200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

