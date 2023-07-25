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
 * Developerapps
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-25T10:40:30.810Z[UTC]")
public class Developerapps {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private Object description = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Object type = null;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private Object visibility = null;

  public static final String SERIALIZED_NAME_REQUIRE_ID = "requireId";
  @SerializedName(SERIALIZED_NAME_REQUIRE_ID)
  private Object requireId = null;

  /**
   * Gets or Sets isFree
   */
  @JsonAdapter(IsFreeEnum.Adapter.class)
  public enum IsFreeEnum {
    _1("1"),
    
    _0("0");

    private Object value;

    IsFreeEnum(Object value) {
      this.value = value;
    }

    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsFreeEnum fromValue(Object value) {
      for (IsFreeEnum b : IsFreeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IsFreeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsFreeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsFreeEnum read(final JsonReader jsonReader) throws IOException {
        Object value =  jsonReader.nextObject();
        return IsFreeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IS_FREE = "isFree";
  @SerializedName(SERIALIZED_NAME_IS_FREE)
  private IsFreeEnum isFree = 1;

  public static final String SERIALIZED_NAME_FEE_DESCRIPTION = "feeDescription";
  @SerializedName(SERIALIZED_NAME_FEE_DESCRIPTION)
  private Object feeDescription = null;

  public static final String SERIALIZED_NAME_INTEGRATION_TYPE = "integrationType";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_TYPE)
  private Object integrationType = null;

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private Object services = null;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private Object events = null;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Object user = null;

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhookUrl";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private Object webhookUrl = null;

  public static final String SERIALIZED_NAME_TERMS_OF_SERVICE_URL = "termsOfServiceUrl";
  @SerializedName(SERIALIZED_NAME_TERMS_OF_SERVICE_URL)
  private Object termsOfServiceUrl = null;

  public static final String SERIALIZED_NAME_PRIVACY_POLICY_URL = "privacyPolicyUrl";
  @SerializedName(SERIALIZED_NAME_PRIVACY_POLICY_URL)
  private Object privacyPolicyUrl = null;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private Object permissions = {};

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    DISABLED("disabled"),
    
    SUSPENDED("suspended"),
    
    ERROR("error"),
    
    PENDING("pending");

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
  private StatusEnum status = pending;

  public static final String SERIALIZED_NAME_WEBHOOK_AUTH_TYPE = "webhookAuthType";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_AUTH_TYPE)
  private Object webhookAuthType = null;

  public static final String SERIALIZED_NAME_WEBHOOK_USERNAME = "webhookUsername";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_USERNAME)
  private Object webhookUsername = null;

  public static final String SERIALIZED_NAME_WEBHOOK_PASSWORD = "webhookPassword";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_PASSWORD)
  private Object webhookPassword = null;

  public static final String SERIALIZED_NAME_WEBHOOK_TOKEN_NAME = "webhookTokenName";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TOKEN_NAME)
  private Object webhookTokenName = null;

  public static final String SERIALIZED_NAME_WEBHOOK_TOKEN = "webhookToken";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TOKEN)
  private Object webhookToken = null;

  public Developerapps() {
  }

  public Developerapps name(Object name) {
    
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


  public Developerapps description(Object description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public Object getDescription() {
    return description;
  }


  public void setDescription(Object description) {
    this.description = description;
  }


  public Developerapps type(Object type) {
    
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


  public Developerapps visibility(Object visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nullable
  public Object getVisibility() {
    return visibility;
  }


  public void setVisibility(Object visibility) {
    this.visibility = visibility;
  }


  public Developerapps requireId(Object requireId) {
    
    this.requireId = requireId;
    return this;
  }

   /**
   * Get requireId
   * @return requireId
  **/
  @javax.annotation.Nullable
  public Object getRequireId() {
    return requireId;
  }


  public void setRequireId(Object requireId) {
    this.requireId = requireId;
  }


  public Developerapps isFree(IsFreeEnum isFree) {
    
    this.isFree = isFree;
    return this;
  }

   /**
   * Get isFree
   * @return isFree
  **/
  @javax.annotation.Nullable
  public IsFreeEnum getIsFree() {
    return isFree;
  }


  public void setIsFree(IsFreeEnum isFree) {
    this.isFree = isFree;
  }


  public Developerapps feeDescription(Object feeDescription) {
    
    this.feeDescription = feeDescription;
    return this;
  }

   /**
   * Get feeDescription
   * @return feeDescription
  **/
  @javax.annotation.Nullable
  public Object getFeeDescription() {
    return feeDescription;
  }


  public void setFeeDescription(Object feeDescription) {
    this.feeDescription = feeDescription;
  }


  public Developerapps integrationType(Object integrationType) {
    
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Get integrationType
   * @return integrationType
  **/
  @javax.annotation.Nullable
  public Object getIntegrationType() {
    return integrationType;
  }


  public void setIntegrationType(Object integrationType) {
    this.integrationType = integrationType;
  }


  public Developerapps services(Object services) {
    
    this.services = services;
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @javax.annotation.Nullable
  public Object getServices() {
    return services;
  }


  public void setServices(Object services) {
    this.services = services;
  }


  public Developerapps events(Object events) {
    
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  public Object getEvents() {
    return events;
  }


  public void setEvents(Object events) {
    this.events = events;
  }


  public Developerapps user(Object user) {
    
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


  public Developerapps webhookUrl(Object webhookUrl) {
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Get webhookUrl
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  public Object getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(Object webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  public Developerapps termsOfServiceUrl(Object termsOfServiceUrl) {
    
    this.termsOfServiceUrl = termsOfServiceUrl;
    return this;
  }

   /**
   * Get termsOfServiceUrl
   * @return termsOfServiceUrl
  **/
  @javax.annotation.Nullable
  public Object getTermsOfServiceUrl() {
    return termsOfServiceUrl;
  }


  public void setTermsOfServiceUrl(Object termsOfServiceUrl) {
    this.termsOfServiceUrl = termsOfServiceUrl;
  }


  public Developerapps privacyPolicyUrl(Object privacyPolicyUrl) {
    
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

   /**
   * Get privacyPolicyUrl
   * @return privacyPolicyUrl
  **/
  @javax.annotation.Nullable
  public Object getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }


  public void setPrivacyPolicyUrl(Object privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }


  public Developerapps permissions(Object permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  public Object getPermissions() {
    return permissions;
  }


  public void setPermissions(Object permissions) {
    this.permissions = permissions;
  }


  public Developerapps status(StatusEnum status) {
    
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


  public Developerapps webhookAuthType(Object webhookAuthType) {
    
    this.webhookAuthType = webhookAuthType;
    return this;
  }

   /**
   * Get webhookAuthType
   * @return webhookAuthType
  **/
  @javax.annotation.Nullable
  public Object getWebhookAuthType() {
    return webhookAuthType;
  }


  public void setWebhookAuthType(Object webhookAuthType) {
    this.webhookAuthType = webhookAuthType;
  }


  public Developerapps webhookUsername(Object webhookUsername) {
    
    this.webhookUsername = webhookUsername;
    return this;
  }

   /**
   * Get webhookUsername
   * @return webhookUsername
  **/
  @javax.annotation.Nullable
  public Object getWebhookUsername() {
    return webhookUsername;
  }


  public void setWebhookUsername(Object webhookUsername) {
    this.webhookUsername = webhookUsername;
  }


  public Developerapps webhookPassword(Object webhookPassword) {
    
    this.webhookPassword = webhookPassword;
    return this;
  }

   /**
   * Get webhookPassword
   * @return webhookPassword
  **/
  @javax.annotation.Nullable
  public Object getWebhookPassword() {
    return webhookPassword;
  }


  public void setWebhookPassword(Object webhookPassword) {
    this.webhookPassword = webhookPassword;
  }


  public Developerapps webhookTokenName(Object webhookTokenName) {
    
    this.webhookTokenName = webhookTokenName;
    return this;
  }

   /**
   * Get webhookTokenName
   * @return webhookTokenName
  **/
  @javax.annotation.Nullable
  public Object getWebhookTokenName() {
    return webhookTokenName;
  }


  public void setWebhookTokenName(Object webhookTokenName) {
    this.webhookTokenName = webhookTokenName;
  }


  public Developerapps webhookToken(Object webhookToken) {
    
    this.webhookToken = webhookToken;
    return this;
  }

   /**
   * Get webhookToken
   * @return webhookToken
  **/
  @javax.annotation.Nullable
  public Object getWebhookToken() {
    return webhookToken;
  }


  public void setWebhookToken(Object webhookToken) {
    this.webhookToken = webhookToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Developerapps developerapps = (Developerapps) o;
    return Objects.equals(this.name, developerapps.name) &&
        Objects.equals(this.description, developerapps.description) &&
        Objects.equals(this.type, developerapps.type) &&
        Objects.equals(this.visibility, developerapps.visibility) &&
        Objects.equals(this.requireId, developerapps.requireId) &&
        Objects.equals(this.isFree, developerapps.isFree) &&
        Objects.equals(this.feeDescription, developerapps.feeDescription) &&
        Objects.equals(this.integrationType, developerapps.integrationType) &&
        Objects.equals(this.services, developerapps.services) &&
        Objects.equals(this.events, developerapps.events) &&
        Objects.equals(this.user, developerapps.user) &&
        Objects.equals(this.webhookUrl, developerapps.webhookUrl) &&
        Objects.equals(this.termsOfServiceUrl, developerapps.termsOfServiceUrl) &&
        Objects.equals(this.privacyPolicyUrl, developerapps.privacyPolicyUrl) &&
        Objects.equals(this.permissions, developerapps.permissions) &&
        Objects.equals(this.status, developerapps.status) &&
        Objects.equals(this.webhookAuthType, developerapps.webhookAuthType) &&
        Objects.equals(this.webhookUsername, developerapps.webhookUsername) &&
        Objects.equals(this.webhookPassword, developerapps.webhookPassword) &&
        Objects.equals(this.webhookTokenName, developerapps.webhookTokenName) &&
        Objects.equals(this.webhookToken, developerapps.webhookToken);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, visibility, requireId, isFree, feeDescription, integrationType, services, events, user, webhookUrl, termsOfServiceUrl, privacyPolicyUrl, permissions, status, webhookAuthType, webhookUsername, webhookPassword, webhookTokenName, webhookToken);
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
    sb.append("class Developerapps {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    requireId: ").append(toIndentedString(requireId)).append("\n");
    sb.append("    isFree: ").append(toIndentedString(isFree)).append("\n");
    sb.append("    feeDescription: ").append(toIndentedString(feeDescription)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    termsOfServiceUrl: ").append(toIndentedString(termsOfServiceUrl)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    webhookAuthType: ").append(toIndentedString(webhookAuthType)).append("\n");
    sb.append("    webhookUsername: ").append(toIndentedString(webhookUsername)).append("\n");
    sb.append("    webhookPassword: ").append(toIndentedString(webhookPassword)).append("\n");
    sb.append("    webhookTokenName: ").append(toIndentedString(webhookTokenName)).append("\n");
    sb.append("    webhookToken: ").append(toIndentedString(webhookToken)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("type");
    openapiFields.add("visibility");
    openapiFields.add("requireId");
    openapiFields.add("isFree");
    openapiFields.add("feeDescription");
    openapiFields.add("integrationType");
    openapiFields.add("services");
    openapiFields.add("events");
    openapiFields.add("user");
    openapiFields.add("webhookUrl");
    openapiFields.add("termsOfServiceUrl");
    openapiFields.add("privacyPolicyUrl");
    openapiFields.add("permissions");
    openapiFields.add("status");
    openapiFields.add("webhookAuthType");
    openapiFields.add("webhookUsername");
    openapiFields.add("webhookPassword");
    openapiFields.add("webhookTokenName");
    openapiFields.add("webhookToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("visibility");
    openapiRequiredFields.add("integrationType");
    openapiRequiredFields.add("services");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Developerapps
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Developerapps.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Developerapps is not found in the empty JSON string", Developerapps.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Developerapps.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Developerapps` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Developerapps.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Developerapps.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Developerapps' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Developerapps> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Developerapps.class));

       return (TypeAdapter<T>) new TypeAdapter<Developerapps>() {
           @Override
           public void write(JsonWriter out, Developerapps value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Developerapps read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Developerapps given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Developerapps
  * @throws IOException if the JSON string is invalid with respect to Developerapps
  */
  public static Developerapps fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Developerapps.class);
  }

 /**
  * Convert an instance of Developerapps to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

