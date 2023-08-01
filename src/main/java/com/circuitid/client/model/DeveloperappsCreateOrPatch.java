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
 * DeveloperappsCreateOrPatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T20:07:07.395Z[UTC]")
public class DeveloperappsCreateOrPatch {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    EVENTS("events");

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
   * Gets or Sets visibility
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    PRIVATE("private"),
    
    PUBLIC("public");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisibilityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityEnum visibility;

  /**
   * Gets or Sets requireId
   */
  @JsonAdapter(RequireIdEnum.Adapter.class)
  public enum RequireIdEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    RequireIdEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RequireIdEnum fromValue(Integer value) {
      for (RequireIdEnum b : RequireIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RequireIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequireIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequireIdEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return RequireIdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REQUIRE_ID = "requireId";
  @SerializedName(SERIALIZED_NAME_REQUIRE_ID)
  private RequireIdEnum requireId = RequireIdEnum.NUMBER_0;

  /**
   * Gets or Sets isFree
   */
  @JsonAdapter(IsFreeEnum.Adapter.class)
  public enum IsFreeEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    IsFreeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsFreeEnum fromValue(Integer value) {
      for (IsFreeEnum b : IsFreeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IsFreeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsFreeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsFreeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return IsFreeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IS_FREE = "isFree";
  @SerializedName(SERIALIZED_NAME_IS_FREE)
  private IsFreeEnum isFree = IsFreeEnum.NUMBER_1;

  public static final String SERIALIZED_NAME_FEE_DESCRIPTION = "feeDescription";
  @SerializedName(SERIALIZED_NAME_FEE_DESCRIPTION)
  private String feeDescription;

  /**
   * Gets or Sets integrationType
   */
  @JsonAdapter(IntegrationTypeEnum.Adapter.class)
  public enum IntegrationTypeEnum {
    WEBHOOK("webhook"),
    
    CLIENT("client");

    private String value;

    IntegrationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntegrationTypeEnum fromValue(String value) {
      for (IntegrationTypeEnum b : IntegrationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IntegrationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntegrationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntegrationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IntegrationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INTEGRATION_TYPE = "integrationType";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_TYPE)
  private IntegrationTypeEnum integrationType;

  /**
   * Gets or Sets services
   */
  @JsonAdapter(ServicesEnum.Adapter.class)
  public enum ServicesEnum {
    CALENDAREVENTS("calendarevents"),
    
    CALLQUEUES("callqueues"),
    
    CDRS("cdrs"),
    
    CHATMESSAGES("chatmessages"),
    
    CONTACTS("contacts"),
    
    CONVERSATIONMESSAGES("conversationmessages"),
    
    FAXES("faxes"),
    
    FIREWALL("firewall"),
    
    USERS("users"),
    
    VOICEMAIL("voicemail");

    private String value;

    ServicesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServicesEnum fromValue(String value) {
      for (ServicesEnum b : ServicesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ServicesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServicesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServicesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ServicesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private List<ServicesEnum> services = new ArrayList<>();

  /**
   * Gets or Sets events
   */
  @JsonAdapter(EventsEnum.Adapter.class)
  public enum EventsEnum {
    CREATE("create"),
    
    PATCH("patch"),
    
    REMOVED("removed");

    private String value;

    EventsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventsEnum fromValue(String value) {
      for (EventsEnum b : EventsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<EventsEnum> events;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhookUrl";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private String webhookUrl;

  public static final String SERIALIZED_NAME_TERMS_OF_SERVICE_URL = "termsOfServiceUrl";
  @SerializedName(SERIALIZED_NAME_TERMS_OF_SERVICE_URL)
  private String termsOfServiceUrl;

  public static final String SERIALIZED_NAME_PRIVACY_POLICY_URL = "privacyPolicyUrl";
  @SerializedName(SERIALIZED_NAME_PRIVACY_POLICY_URL)
  private String privacyPolicyUrl;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private Object permissions;

  /**
   * Gets or Sets webhookAuthType
   */
  @JsonAdapter(WebhookAuthTypeEnum.Adapter.class)
  public enum WebhookAuthTypeEnum {
    HEADER("header"),
    
    USERNAMEANDPASSWORD("usernameAndPassword");

    private String value;

    WebhookAuthTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WebhookAuthTypeEnum fromValue(String value) {
      for (WebhookAuthTypeEnum b : WebhookAuthTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WebhookAuthTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WebhookAuthTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WebhookAuthTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WebhookAuthTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WEBHOOK_AUTH_TYPE = "webhookAuthType";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_AUTH_TYPE)
  private WebhookAuthTypeEnum webhookAuthType;

  public static final String SERIALIZED_NAME_WEBHOOK_USERNAME = "webhookUsername";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_USERNAME)
  private String webhookUsername;

  public static final String SERIALIZED_NAME_WEBHOOK_PASSWORD = "webhookPassword";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_PASSWORD)
  private String webhookPassword;

  public static final String SERIALIZED_NAME_WEBHOOK_TOKEN_NAME = "webhookTokenName";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TOKEN_NAME)
  private String webhookTokenName;

  public static final String SERIALIZED_NAME_WEBHOOK_TOKEN = "webhookToken";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TOKEN)
  private String webhookToken;

  public DeveloperappsCreateOrPatch() {
  }

  public DeveloperappsCreateOrPatch name(String name) {
    
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


  public DeveloperappsCreateOrPatch description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DeveloperappsCreateOrPatch type(TypeEnum type) {
    
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


  public DeveloperappsCreateOrPatch visibility(VisibilityEnum visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nonnull
  public VisibilityEnum getVisibility() {
    return visibility;
  }


  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public DeveloperappsCreateOrPatch requireId(RequireIdEnum requireId) {
    
    this.requireId = requireId;
    return this;
  }

   /**
   * Get requireId
   * @return requireId
  **/
  @javax.annotation.Nullable
  public RequireIdEnum getRequireId() {
    return requireId;
  }


  public void setRequireId(RequireIdEnum requireId) {
    this.requireId = requireId;
  }


  public DeveloperappsCreateOrPatch isFree(IsFreeEnum isFree) {
    
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


  public DeveloperappsCreateOrPatch feeDescription(String feeDescription) {
    
    this.feeDescription = feeDescription;
    return this;
  }

   /**
   * Get feeDescription
   * @return feeDescription
  **/
  @javax.annotation.Nullable
  public String getFeeDescription() {
    return feeDescription;
  }


  public void setFeeDescription(String feeDescription) {
    this.feeDescription = feeDescription;
  }


  public DeveloperappsCreateOrPatch integrationType(IntegrationTypeEnum integrationType) {
    
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Get integrationType
   * @return integrationType
  **/
  @javax.annotation.Nonnull
  public IntegrationTypeEnum getIntegrationType() {
    return integrationType;
  }


  public void setIntegrationType(IntegrationTypeEnum integrationType) {
    this.integrationType = integrationType;
  }


  public DeveloperappsCreateOrPatch services(List<ServicesEnum> services) {
    
    this.services = services;
    return this;
  }

  public DeveloperappsCreateOrPatch addServicesItem(ServicesEnum servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @javax.annotation.Nonnull
  public List<ServicesEnum> getServices() {
    return services;
  }


  public void setServices(List<ServicesEnum> services) {
    this.services = services;
  }


  public DeveloperappsCreateOrPatch events(List<EventsEnum> events) {
    
    this.events = events;
    return this;
  }

  public DeveloperappsCreateOrPatch addEventsItem(EventsEnum eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  public List<EventsEnum> getEvents() {
    return events;
  }


  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }


  public DeveloperappsCreateOrPatch user(String user) {
    
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


  public DeveloperappsCreateOrPatch webhookUrl(String webhookUrl) {
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Get webhookUrl
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  public String getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  public DeveloperappsCreateOrPatch termsOfServiceUrl(String termsOfServiceUrl) {
    
    this.termsOfServiceUrl = termsOfServiceUrl;
    return this;
  }

   /**
   * Get termsOfServiceUrl
   * @return termsOfServiceUrl
  **/
  @javax.annotation.Nullable
  public String getTermsOfServiceUrl() {
    return termsOfServiceUrl;
  }


  public void setTermsOfServiceUrl(String termsOfServiceUrl) {
    this.termsOfServiceUrl = termsOfServiceUrl;
  }


  public DeveloperappsCreateOrPatch privacyPolicyUrl(String privacyPolicyUrl) {
    
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

   /**
   * Get privacyPolicyUrl
   * @return privacyPolicyUrl
  **/
  @javax.annotation.Nullable
  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }


  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }


  public DeveloperappsCreateOrPatch permissions(Object permissions) {
    
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


  public DeveloperappsCreateOrPatch webhookAuthType(WebhookAuthTypeEnum webhookAuthType) {
    
    this.webhookAuthType = webhookAuthType;
    return this;
  }

   /**
   * Get webhookAuthType
   * @return webhookAuthType
  **/
  @javax.annotation.Nullable
  public WebhookAuthTypeEnum getWebhookAuthType() {
    return webhookAuthType;
  }


  public void setWebhookAuthType(WebhookAuthTypeEnum webhookAuthType) {
    this.webhookAuthType = webhookAuthType;
  }


  public DeveloperappsCreateOrPatch webhookUsername(String webhookUsername) {
    
    this.webhookUsername = webhookUsername;
    return this;
  }

   /**
   * Get webhookUsername
   * @return webhookUsername
  **/
  @javax.annotation.Nullable
  public String getWebhookUsername() {
    return webhookUsername;
  }


  public void setWebhookUsername(String webhookUsername) {
    this.webhookUsername = webhookUsername;
  }


  public DeveloperappsCreateOrPatch webhookPassword(String webhookPassword) {
    
    this.webhookPassword = webhookPassword;
    return this;
  }

   /**
   * Get webhookPassword
   * @return webhookPassword
  **/
  @javax.annotation.Nullable
  public String getWebhookPassword() {
    return webhookPassword;
  }


  public void setWebhookPassword(String webhookPassword) {
    this.webhookPassword = webhookPassword;
  }


  public DeveloperappsCreateOrPatch webhookTokenName(String webhookTokenName) {
    
    this.webhookTokenName = webhookTokenName;
    return this;
  }

   /**
   * Get webhookTokenName
   * @return webhookTokenName
  **/
  @javax.annotation.Nullable
  public String getWebhookTokenName() {
    return webhookTokenName;
  }


  public void setWebhookTokenName(String webhookTokenName) {
    this.webhookTokenName = webhookTokenName;
  }


  public DeveloperappsCreateOrPatch webhookToken(String webhookToken) {
    
    this.webhookToken = webhookToken;
    return this;
  }

   /**
   * Get webhookToken
   * @return webhookToken
  **/
  @javax.annotation.Nullable
  public String getWebhookToken() {
    return webhookToken;
  }


  public void setWebhookToken(String webhookToken) {
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
    DeveloperappsCreateOrPatch developerappsCreateOrPatch = (DeveloperappsCreateOrPatch) o;
    return Objects.equals(this.name, developerappsCreateOrPatch.name) &&
        Objects.equals(this.description, developerappsCreateOrPatch.description) &&
        Objects.equals(this.type, developerappsCreateOrPatch.type) &&
        Objects.equals(this.visibility, developerappsCreateOrPatch.visibility) &&
        Objects.equals(this.requireId, developerappsCreateOrPatch.requireId) &&
        Objects.equals(this.isFree, developerappsCreateOrPatch.isFree) &&
        Objects.equals(this.feeDescription, developerappsCreateOrPatch.feeDescription) &&
        Objects.equals(this.integrationType, developerappsCreateOrPatch.integrationType) &&
        Objects.equals(this.services, developerappsCreateOrPatch.services) &&
        Objects.equals(this.events, developerappsCreateOrPatch.events) &&
        Objects.equals(this.user, developerappsCreateOrPatch.user) &&
        Objects.equals(this.webhookUrl, developerappsCreateOrPatch.webhookUrl) &&
        Objects.equals(this.termsOfServiceUrl, developerappsCreateOrPatch.termsOfServiceUrl) &&
        Objects.equals(this.privacyPolicyUrl, developerappsCreateOrPatch.privacyPolicyUrl) &&
        Objects.equals(this.permissions, developerappsCreateOrPatch.permissions) &&
        Objects.equals(this.webhookAuthType, developerappsCreateOrPatch.webhookAuthType) &&
        Objects.equals(this.webhookUsername, developerappsCreateOrPatch.webhookUsername) &&
        Objects.equals(this.webhookPassword, developerappsCreateOrPatch.webhookPassword) &&
        Objects.equals(this.webhookTokenName, developerappsCreateOrPatch.webhookTokenName) &&
        Objects.equals(this.webhookToken, developerappsCreateOrPatch.webhookToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, visibility, requireId, isFree, feeDescription, integrationType, services, events, user, webhookUrl, termsOfServiceUrl, privacyPolicyUrl, permissions, webhookAuthType, webhookUsername, webhookPassword, webhookTokenName, webhookToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeveloperappsCreateOrPatch {\n");
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
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeveloperappsCreateOrPatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeveloperappsCreateOrPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeveloperappsCreateOrPatch is not found in the empty JSON string", DeveloperappsCreateOrPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeveloperappsCreateOrPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeveloperappsCreateOrPatch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeveloperappsCreateOrPatch.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      if ((jsonObj.get("feeDescription") != null && !jsonObj.get("feeDescription").isJsonNull()) && !jsonObj.get("feeDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feeDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feeDescription").toString()));
      }
      if (!jsonObj.get("integrationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integrationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integrationType").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("services") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("services").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `services` to be an array in the JSON string but got `%s`", jsonObj.get("services").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("events") != null && !jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }
      if (!jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      if ((jsonObj.get("webhookUrl") != null && !jsonObj.get("webhookUrl").isJsonNull()) && !jsonObj.get("webhookUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookUrl").toString()));
      }
      if ((jsonObj.get("termsOfServiceUrl") != null && !jsonObj.get("termsOfServiceUrl").isJsonNull()) && !jsonObj.get("termsOfServiceUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `termsOfServiceUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("termsOfServiceUrl").toString()));
      }
      if ((jsonObj.get("privacyPolicyUrl") != null && !jsonObj.get("privacyPolicyUrl").isJsonNull()) && !jsonObj.get("privacyPolicyUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privacyPolicyUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privacyPolicyUrl").toString()));
      }
      if ((jsonObj.get("webhookAuthType") != null && !jsonObj.get("webhookAuthType").isJsonNull()) && !jsonObj.get("webhookAuthType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookAuthType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookAuthType").toString()));
      }
      if ((jsonObj.get("webhookUsername") != null && !jsonObj.get("webhookUsername").isJsonNull()) && !jsonObj.get("webhookUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookUsername").toString()));
      }
      if ((jsonObj.get("webhookPassword") != null && !jsonObj.get("webhookPassword").isJsonNull()) && !jsonObj.get("webhookPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookPassword").toString()));
      }
      if ((jsonObj.get("webhookTokenName") != null && !jsonObj.get("webhookTokenName").isJsonNull()) && !jsonObj.get("webhookTokenName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookTokenName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookTokenName").toString()));
      }
      if ((jsonObj.get("webhookToken") != null && !jsonObj.get("webhookToken").isJsonNull()) && !jsonObj.get("webhookToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeveloperappsCreateOrPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeveloperappsCreateOrPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeveloperappsCreateOrPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeveloperappsCreateOrPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<DeveloperappsCreateOrPatch>() {
           @Override
           public void write(JsonWriter out, DeveloperappsCreateOrPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeveloperappsCreateOrPatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeveloperappsCreateOrPatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeveloperappsCreateOrPatch
  * @throws IOException if the JSON string is invalid with respect to DeveloperappsCreateOrPatch
  */
  public static DeveloperappsCreateOrPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeveloperappsCreateOrPatch.class);
  }

 /**
  * Convert an instance of DeveloperappsCreateOrPatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

