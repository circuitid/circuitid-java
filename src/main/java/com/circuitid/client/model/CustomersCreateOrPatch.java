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
 * CustomersCreateOrPatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T20:07:07.395Z[UTC]")
public class CustomersCreateOrPatch {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_WEBSITE_URL = "websiteUrl";
  @SerializedName(SERIALIZED_NAME_WEBSITE_URL)
  private String websiteUrl;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private Integer credit = 0;

  public static final String SERIALIZED_NAME_ADMIN_USER_ID = "adminUserId";
  @SerializedName(SERIALIZED_NAME_ADMIN_USER_ID)
  private String adminUserId;

  public static final String SERIALIZED_NAME_BILLING_USER_ID = "billingUserId";
  @SerializedName(SERIALIZED_NAME_BILLING_USER_ID)
  private String billingUserId;

  public static final String SERIALIZED_NAME_CALL_RECORDING_USER_ID = "callRecordingUserId";
  @SerializedName(SERIALIZED_NAME_CALL_RECORDING_USER_ID)
  private String callRecordingUserId;

  public static final String SERIALIZED_NAME_SUPPORT_USER_ID = "supportUserId";
  @SerializedName(SERIALIZED_NAME_SUPPORT_USER_ID)
  private String supportUserId;

  public static final String SERIALIZED_NAME_AUTOMATIC_REFILL_AMOUNT = "automaticRefillAmount";
  @SerializedName(SERIALIZED_NAME_AUTOMATIC_REFILL_AMOUNT)
  private Integer automaticRefillAmount = 0;

  public static final String SERIALIZED_NAME_LOW_BALANCE_ALERT_AMOUNT = "lowBalanceAlertAmount";
  @SerializedName(SERIALIZED_NAME_LOW_BALANCE_ALERT_AMOUNT)
  private Integer lowBalanceAlertAmount = 0;

  /**
   * Gets or Sets internationalCalling
   */
  @JsonAdapter(InternationalCallingEnum.Adapter.class)
  public enum InternationalCallingEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    InternationalCallingEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InternationalCallingEnum fromValue(Integer value) {
      for (InternationalCallingEnum b : InternationalCallingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InternationalCallingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InternationalCallingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InternationalCallingEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return InternationalCallingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INTERNATIONAL_CALLING = "internationalCalling";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_CALLING)
  private InternationalCallingEnum internationalCalling = InternationalCallingEnum.NUMBER_0;

  public static final String SERIALIZED_NAME_CREATED_BY_I_P = "createdByIP";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_I_P)
  private String createdByIP;

  /**
   * Gets or Sets mediaBypass
   */
  @JsonAdapter(MediaBypassEnum.Adapter.class)
  public enum MediaBypassEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    MediaBypassEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MediaBypassEnum fromValue(Integer value) {
      for (MediaBypassEnum b : MediaBypassEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MediaBypassEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MediaBypassEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MediaBypassEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return MediaBypassEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MEDIA_BYPASS = "mediaBypass";
  @SerializedName(SERIALIZED_NAME_MEDIA_BYPASS)
  private MediaBypassEnum mediaBypass = MediaBypassEnum.NUMBER_0;

  /**
   * Gets or Sets accountLock
   */
  @JsonAdapter(AccountLockEnum.Adapter.class)
  public enum AccountLockEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    AccountLockEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountLockEnum fromValue(Integer value) {
      for (AccountLockEnum b : AccountLockEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountLockEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountLockEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountLockEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return AccountLockEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_LOCK = "accountLock";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_LOCK)
  private AccountLockEnum accountLock = AccountLockEnum.NUMBER_1;

  /**
   * Gets or Sets callRecording
   */
  @JsonAdapter(CallRecordingEnum.Adapter.class)
  public enum CallRecordingEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    CallRecordingEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CallRecordingEnum fromValue(Integer value) {
      for (CallRecordingEnum b : CallRecordingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CallRecordingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CallRecordingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CallRecordingEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return CallRecordingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CALL_RECORDING = "callRecording";
  @SerializedName(SERIALIZED_NAME_CALL_RECORDING)
  private CallRecordingEnum callRecording = CallRecordingEnum.NUMBER_0;

  public static final String SERIALIZED_NAME_CDR_RETENTION = "cdrRetention";
  @SerializedName(SERIALIZED_NAME_CDR_RETENTION)
  private Integer cdrRetention = 12;

  /**
   * Gets or Sets cnamLookUps
   */
  @JsonAdapter(CnamLookUpsEnum.Adapter.class)
  public enum CnamLookUpsEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    CnamLookUpsEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CnamLookUpsEnum fromValue(Integer value) {
      for (CnamLookUpsEnum b : CnamLookUpsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CnamLookUpsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CnamLookUpsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CnamLookUpsEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return CnamLookUpsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CNAM_LOOK_UPS = "cnamLookUps";
  @SerializedName(SERIALIZED_NAME_CNAM_LOOK_UPS)
  private CnamLookUpsEnum cnamLookUps = CnamLookUpsEnum.NUMBER_0;

  /**
   * Gets or Sets holdMusic
   */
  @JsonAdapter(HoldMusicEnum.Adapter.class)
  public enum HoldMusicEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    HoldMusicEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HoldMusicEnum fromValue(Integer value) {
      for (HoldMusicEnum b : HoldMusicEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HoldMusicEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HoldMusicEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HoldMusicEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return HoldMusicEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HOLD_MUSIC = "holdMusic";
  @SerializedName(SERIALIZED_NAME_HOLD_MUSIC)
  private HoldMusicEnum holdMusic = HoldMusicEnum.NUMBER_0;

  /**
   * Gets or Sets transcribeCalls
   */
  @JsonAdapter(TranscribeCallsEnum.Adapter.class)
  public enum TranscribeCallsEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    TranscribeCallsEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TranscribeCallsEnum fromValue(Integer value) {
      for (TranscribeCallsEnum b : TranscribeCallsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TranscribeCallsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TranscribeCallsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TranscribeCallsEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return TranscribeCallsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSCRIBE_CALLS = "transcribeCalls";
  @SerializedName(SERIALIZED_NAME_TRANSCRIBE_CALLS)
  private TranscribeCallsEnum transcribeCalls;

  public static final String SERIALIZED_NAME_MAX_OUTBOUND_CALL_RATE = "maxOutboundCallRate";
  @SerializedName(SERIALIZED_NAME_MAX_OUTBOUND_CALL_RATE)
  private Integer maxOutboundCallRate = 1;

  /**
   * Gets or Sets defaultBillMethod
   */
  @JsonAdapter(DefaultBillMethodEnum.Adapter.class)
  public enum DefaultBillMethodEnum {
    CREDIT("credit"),
    
    PAYMENTMETHOD("paymentmethod");

    private String value;

    DefaultBillMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultBillMethodEnum fromValue(String value) {
      for (DefaultBillMethodEnum b : DefaultBillMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DefaultBillMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultBillMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultBillMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DefaultBillMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEFAULT_BILL_METHOD = "defaultBillMethod";
  @SerializedName(SERIALIZED_NAME_DEFAULT_BILL_METHOD)
  private DefaultBillMethodEnum defaultBillMethod = DefaultBillMethodEnum.CREDIT;

  public CustomersCreateOrPatch() {
  }

  public CustomersCreateOrPatch name(String name) {
    
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


  public CustomersCreateOrPatch websiteUrl(String websiteUrl) {
    
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * Get websiteUrl
   * @return websiteUrl
  **/
  @javax.annotation.Nullable
  public String getWebsiteUrl() {
    return websiteUrl;
  }


  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }


  public CustomersCreateOrPatch logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  @javax.annotation.Nullable
  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public CustomersCreateOrPatch credit(Integer credit) {
    
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @javax.annotation.Nullable
  public Integer getCredit() {
    return credit;
  }


  public void setCredit(Integer credit) {
    this.credit = credit;
  }


  public CustomersCreateOrPatch adminUserId(String adminUserId) {
    
    this.adminUserId = adminUserId;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return adminUserId
  **/
  @javax.annotation.Nullable
  public String getAdminUserId() {
    return adminUserId;
  }


  public void setAdminUserId(String adminUserId) {
    this.adminUserId = adminUserId;
  }


  public CustomersCreateOrPatch billingUserId(String billingUserId) {
    
    this.billingUserId = billingUserId;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return billingUserId
  **/
  @javax.annotation.Nullable
  public String getBillingUserId() {
    return billingUserId;
  }


  public void setBillingUserId(String billingUserId) {
    this.billingUserId = billingUserId;
  }


  public CustomersCreateOrPatch callRecordingUserId(String callRecordingUserId) {
    
    this.callRecordingUserId = callRecordingUserId;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return callRecordingUserId
  **/
  @javax.annotation.Nullable
  public String getCallRecordingUserId() {
    return callRecordingUserId;
  }


  public void setCallRecordingUserId(String callRecordingUserId) {
    this.callRecordingUserId = callRecordingUserId;
  }


  public CustomersCreateOrPatch supportUserId(String supportUserId) {
    
    this.supportUserId = supportUserId;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return supportUserId
  **/
  @javax.annotation.Nullable
  public String getSupportUserId() {
    return supportUserId;
  }


  public void setSupportUserId(String supportUserId) {
    this.supportUserId = supportUserId;
  }


  public CustomersCreateOrPatch automaticRefillAmount(Integer automaticRefillAmount) {
    
    this.automaticRefillAmount = automaticRefillAmount;
    return this;
  }

   /**
   * Get automaticRefillAmount
   * @return automaticRefillAmount
  **/
  @javax.annotation.Nullable
  public Integer getAutomaticRefillAmount() {
    return automaticRefillAmount;
  }


  public void setAutomaticRefillAmount(Integer automaticRefillAmount) {
    this.automaticRefillAmount = automaticRefillAmount;
  }


  public CustomersCreateOrPatch lowBalanceAlertAmount(Integer lowBalanceAlertAmount) {
    
    this.lowBalanceAlertAmount = lowBalanceAlertAmount;
    return this;
  }

   /**
   * Get lowBalanceAlertAmount
   * @return lowBalanceAlertAmount
  **/
  @javax.annotation.Nullable
  public Integer getLowBalanceAlertAmount() {
    return lowBalanceAlertAmount;
  }


  public void setLowBalanceAlertAmount(Integer lowBalanceAlertAmount) {
    this.lowBalanceAlertAmount = lowBalanceAlertAmount;
  }


  public CustomersCreateOrPatch internationalCalling(InternationalCallingEnum internationalCalling) {
    
    this.internationalCalling = internationalCalling;
    return this;
  }

   /**
   * Get internationalCalling
   * @return internationalCalling
  **/
  @javax.annotation.Nullable
  public InternationalCallingEnum getInternationalCalling() {
    return internationalCalling;
  }


  public void setInternationalCalling(InternationalCallingEnum internationalCalling) {
    this.internationalCalling = internationalCalling;
  }


  public CustomersCreateOrPatch createdByIP(String createdByIP) {
    
    this.createdByIP = createdByIP;
    return this;
  }

   /**
   * Get createdByIP
   * @return createdByIP
  **/
  @javax.annotation.Nullable
  public String getCreatedByIP() {
    return createdByIP;
  }


  public void setCreatedByIP(String createdByIP) {
    this.createdByIP = createdByIP;
  }


  public CustomersCreateOrPatch mediaBypass(MediaBypassEnum mediaBypass) {
    
    this.mediaBypass = mediaBypass;
    return this;
  }

   /**
   * Get mediaBypass
   * @return mediaBypass
  **/
  @javax.annotation.Nullable
  public MediaBypassEnum getMediaBypass() {
    return mediaBypass;
  }


  public void setMediaBypass(MediaBypassEnum mediaBypass) {
    this.mediaBypass = mediaBypass;
  }


  public CustomersCreateOrPatch accountLock(AccountLockEnum accountLock) {
    
    this.accountLock = accountLock;
    return this;
  }

   /**
   * Get accountLock
   * @return accountLock
  **/
  @javax.annotation.Nullable
  public AccountLockEnum getAccountLock() {
    return accountLock;
  }


  public void setAccountLock(AccountLockEnum accountLock) {
    this.accountLock = accountLock;
  }


  public CustomersCreateOrPatch callRecording(CallRecordingEnum callRecording) {
    
    this.callRecording = callRecording;
    return this;
  }

   /**
   * Get callRecording
   * @return callRecording
  **/
  @javax.annotation.Nullable
  public CallRecordingEnum getCallRecording() {
    return callRecording;
  }


  public void setCallRecording(CallRecordingEnum callRecording) {
    this.callRecording = callRecording;
  }


  public CustomersCreateOrPatch cdrRetention(Integer cdrRetention) {
    
    this.cdrRetention = cdrRetention;
    return this;
  }

   /**
   * Get cdrRetention
   * @return cdrRetention
  **/
  @javax.annotation.Nullable
  public Integer getCdrRetention() {
    return cdrRetention;
  }


  public void setCdrRetention(Integer cdrRetention) {
    this.cdrRetention = cdrRetention;
  }


  public CustomersCreateOrPatch cnamLookUps(CnamLookUpsEnum cnamLookUps) {
    
    this.cnamLookUps = cnamLookUps;
    return this;
  }

   /**
   * Get cnamLookUps
   * @return cnamLookUps
  **/
  @javax.annotation.Nullable
  public CnamLookUpsEnum getCnamLookUps() {
    return cnamLookUps;
  }


  public void setCnamLookUps(CnamLookUpsEnum cnamLookUps) {
    this.cnamLookUps = cnamLookUps;
  }


  public CustomersCreateOrPatch holdMusic(HoldMusicEnum holdMusic) {
    
    this.holdMusic = holdMusic;
    return this;
  }

   /**
   * Get holdMusic
   * @return holdMusic
  **/
  @javax.annotation.Nullable
  public HoldMusicEnum getHoldMusic() {
    return holdMusic;
  }


  public void setHoldMusic(HoldMusicEnum holdMusic) {
    this.holdMusic = holdMusic;
  }


  public CustomersCreateOrPatch transcribeCalls(TranscribeCallsEnum transcribeCalls) {
    
    this.transcribeCalls = transcribeCalls;
    return this;
  }

   /**
   * Get transcribeCalls
   * @return transcribeCalls
  **/
  @javax.annotation.Nullable
  public TranscribeCallsEnum getTranscribeCalls() {
    return transcribeCalls;
  }


  public void setTranscribeCalls(TranscribeCallsEnum transcribeCalls) {
    this.transcribeCalls = transcribeCalls;
  }


  public CustomersCreateOrPatch maxOutboundCallRate(Integer maxOutboundCallRate) {
    
    this.maxOutboundCallRate = maxOutboundCallRate;
    return this;
  }

   /**
   * Get maxOutboundCallRate
   * @return maxOutboundCallRate
  **/
  @javax.annotation.Nullable
  public Integer getMaxOutboundCallRate() {
    return maxOutboundCallRate;
  }


  public void setMaxOutboundCallRate(Integer maxOutboundCallRate) {
    this.maxOutboundCallRate = maxOutboundCallRate;
  }


  public CustomersCreateOrPatch defaultBillMethod(DefaultBillMethodEnum defaultBillMethod) {
    
    this.defaultBillMethod = defaultBillMethod;
    return this;
  }

   /**
   * Get defaultBillMethod
   * @return defaultBillMethod
  **/
  @javax.annotation.Nonnull
  public DefaultBillMethodEnum getDefaultBillMethod() {
    return defaultBillMethod;
  }


  public void setDefaultBillMethod(DefaultBillMethodEnum defaultBillMethod) {
    this.defaultBillMethod = defaultBillMethod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomersCreateOrPatch customersCreateOrPatch = (CustomersCreateOrPatch) o;
    return Objects.equals(this.name, customersCreateOrPatch.name) &&
        Objects.equals(this.websiteUrl, customersCreateOrPatch.websiteUrl) &&
        Objects.equals(this.logo, customersCreateOrPatch.logo) &&
        Objects.equals(this.credit, customersCreateOrPatch.credit) &&
        Objects.equals(this.adminUserId, customersCreateOrPatch.adminUserId) &&
        Objects.equals(this.billingUserId, customersCreateOrPatch.billingUserId) &&
        Objects.equals(this.callRecordingUserId, customersCreateOrPatch.callRecordingUserId) &&
        Objects.equals(this.supportUserId, customersCreateOrPatch.supportUserId) &&
        Objects.equals(this.automaticRefillAmount, customersCreateOrPatch.automaticRefillAmount) &&
        Objects.equals(this.lowBalanceAlertAmount, customersCreateOrPatch.lowBalanceAlertAmount) &&
        Objects.equals(this.internationalCalling, customersCreateOrPatch.internationalCalling) &&
        Objects.equals(this.createdByIP, customersCreateOrPatch.createdByIP) &&
        Objects.equals(this.mediaBypass, customersCreateOrPatch.mediaBypass) &&
        Objects.equals(this.accountLock, customersCreateOrPatch.accountLock) &&
        Objects.equals(this.callRecording, customersCreateOrPatch.callRecording) &&
        Objects.equals(this.cdrRetention, customersCreateOrPatch.cdrRetention) &&
        Objects.equals(this.cnamLookUps, customersCreateOrPatch.cnamLookUps) &&
        Objects.equals(this.holdMusic, customersCreateOrPatch.holdMusic) &&
        Objects.equals(this.transcribeCalls, customersCreateOrPatch.transcribeCalls) &&
        Objects.equals(this.maxOutboundCallRate, customersCreateOrPatch.maxOutboundCallRate) &&
        Objects.equals(this.defaultBillMethod, customersCreateOrPatch.defaultBillMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, websiteUrl, logo, credit, adminUserId, billingUserId, callRecordingUserId, supportUserId, automaticRefillAmount, lowBalanceAlertAmount, internationalCalling, createdByIP, mediaBypass, accountLock, callRecording, cdrRetention, cnamLookUps, holdMusic, transcribeCalls, maxOutboundCallRate, defaultBillMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomersCreateOrPatch {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    adminUserId: ").append(toIndentedString(adminUserId)).append("\n");
    sb.append("    billingUserId: ").append(toIndentedString(billingUserId)).append("\n");
    sb.append("    callRecordingUserId: ").append(toIndentedString(callRecordingUserId)).append("\n");
    sb.append("    supportUserId: ").append(toIndentedString(supportUserId)).append("\n");
    sb.append("    automaticRefillAmount: ").append(toIndentedString(automaticRefillAmount)).append("\n");
    sb.append("    lowBalanceAlertAmount: ").append(toIndentedString(lowBalanceAlertAmount)).append("\n");
    sb.append("    internationalCalling: ").append(toIndentedString(internationalCalling)).append("\n");
    sb.append("    createdByIP: ").append(toIndentedString(createdByIP)).append("\n");
    sb.append("    mediaBypass: ").append(toIndentedString(mediaBypass)).append("\n");
    sb.append("    accountLock: ").append(toIndentedString(accountLock)).append("\n");
    sb.append("    callRecording: ").append(toIndentedString(callRecording)).append("\n");
    sb.append("    cdrRetention: ").append(toIndentedString(cdrRetention)).append("\n");
    sb.append("    cnamLookUps: ").append(toIndentedString(cnamLookUps)).append("\n");
    sb.append("    holdMusic: ").append(toIndentedString(holdMusic)).append("\n");
    sb.append("    transcribeCalls: ").append(toIndentedString(transcribeCalls)).append("\n");
    sb.append("    maxOutboundCallRate: ").append(toIndentedString(maxOutboundCallRate)).append("\n");
    sb.append("    defaultBillMethod: ").append(toIndentedString(defaultBillMethod)).append("\n");
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
    openapiFields.add("websiteUrl");
    openapiFields.add("logo");
    openapiFields.add("credit");
    openapiFields.add("adminUserId");
    openapiFields.add("billingUserId");
    openapiFields.add("callRecordingUserId");
    openapiFields.add("supportUserId");
    openapiFields.add("automaticRefillAmount");
    openapiFields.add("lowBalanceAlertAmount");
    openapiFields.add("internationalCalling");
    openapiFields.add("createdByIP");
    openapiFields.add("mediaBypass");
    openapiFields.add("accountLock");
    openapiFields.add("callRecording");
    openapiFields.add("cdrRetention");
    openapiFields.add("cnamLookUps");
    openapiFields.add("holdMusic");
    openapiFields.add("transcribeCalls");
    openapiFields.add("maxOutboundCallRate");
    openapiFields.add("defaultBillMethod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("defaultBillMethod");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomersCreateOrPatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomersCreateOrPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomersCreateOrPatch is not found in the empty JSON string", CustomersCreateOrPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomersCreateOrPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomersCreateOrPatch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomersCreateOrPatch.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("websiteUrl") != null && !jsonObj.get("websiteUrl").isJsonNull()) && !jsonObj.get("websiteUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `websiteUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("websiteUrl").toString()));
      }
      if ((jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if ((jsonObj.get("adminUserId") != null && !jsonObj.get("adminUserId").isJsonNull()) && !jsonObj.get("adminUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adminUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adminUserId").toString()));
      }
      if ((jsonObj.get("billingUserId") != null && !jsonObj.get("billingUserId").isJsonNull()) && !jsonObj.get("billingUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingUserId").toString()));
      }
      if ((jsonObj.get("callRecordingUserId") != null && !jsonObj.get("callRecordingUserId").isJsonNull()) && !jsonObj.get("callRecordingUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callRecordingUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callRecordingUserId").toString()));
      }
      if ((jsonObj.get("supportUserId") != null && !jsonObj.get("supportUserId").isJsonNull()) && !jsonObj.get("supportUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supportUserId").toString()));
      }
      if ((jsonObj.get("createdByIP") != null && !jsonObj.get("createdByIP").isJsonNull()) && !jsonObj.get("createdByIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdByIP").toString()));
      }
      if (!jsonObj.get("defaultBillMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultBillMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultBillMethod").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomersCreateOrPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomersCreateOrPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomersCreateOrPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomersCreateOrPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomersCreateOrPatch>() {
           @Override
           public void write(JsonWriter out, CustomersCreateOrPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomersCreateOrPatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomersCreateOrPatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomersCreateOrPatch
  * @throws IOException if the JSON string is invalid with respect to CustomersCreateOrPatch
  */
  public static CustomersCreateOrPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomersCreateOrPatch.class);
  }

 /**
  * Convert an instance of CustomersCreateOrPatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

