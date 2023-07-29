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
 * GetMenu200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-29T09:44:28.938Z[UTC]")
public class GetMenu200Response {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MAX_EXTENSION_LENGTH = "maxExtensionLength";
  @SerializedName(SERIALIZED_NAME_MAX_EXTENSION_LENGTH)
  private Integer maxExtensionLength = 4;

  /**
   * Gets or Sets speechRecognition
   */
  @JsonAdapter(SpeechRecognitionEnum.Adapter.class)
  public enum SpeechRecognitionEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    SpeechRecognitionEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpeechRecognitionEnum fromValue(Integer value) {
      for (SpeechRecognitionEnum b : SpeechRecognitionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SpeechRecognitionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpeechRecognitionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpeechRecognitionEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return SpeechRecognitionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SPEECH_RECOGNITION = "speechRecognition";
  @SerializedName(SERIALIZED_NAME_SPEECH_RECOGNITION)
  private SpeechRecognitionEnum speechRecognition = SpeechRecognitionEnum.NUMBER_0;

  public static final String SERIALIZED_NAME_DIRECTORY = "directory";
  @SerializedName(SERIALIZED_NAME_DIRECTORY)
  private String directory;

  /**
   * Gets or Sets greetingType
   */
  @JsonAdapter(GreetingTypeEnum.Adapter.class)
  public enum GreetingTypeEnum {
    TTS("tts"),
    
    MP3("mp3");

    private String value;

    GreetingTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GreetingTypeEnum fromValue(String value) {
      for (GreetingTypeEnum b : GreetingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GreetingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GreetingTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GreetingTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GreetingTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GREETING_TYPE = "greetingType";
  @SerializedName(SERIALIZED_NAME_GREETING_TYPE)
  private GreetingTypeEnum greetingType;

  public static final String SERIALIZED_NAME_GREETING_T_T_S = "greetingTTS";
  @SerializedName(SERIALIZED_NAME_GREETING_T_T_S)
  private String greetingTTS;

  public static final String SERIALIZED_NAME_MENU_VOICE = "menuVoice";
  @SerializedName(SERIALIZED_NAME_MENU_VOICE)
  private String menuVoice;

  /**
   * Gets or Sets exitSound
   */
  @JsonAdapter(ExitSoundEnum.Adapter.class)
  public enum ExitSoundEnum {
    DEFAULT("default"),
    
    MP3("mp3");

    private String value;

    ExitSoundEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExitSoundEnum fromValue(String value) {
      for (ExitSoundEnum b : ExitSoundEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExitSoundEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExitSoundEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExitSoundEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExitSoundEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXIT_SOUND = "exitSound";
  @SerializedName(SERIALIZED_NAME_EXIT_SOUND)
  private ExitSoundEnum exitSound = ExitSoundEnum.DEFAULT;

  /**
   * Gets or Sets transferAnnouncement
   */
  @JsonAdapter(TransferAnnouncementEnum.Adapter.class)
  public enum TransferAnnouncementEnum {
    DEFAULT("default"),
    
    MP3("mp3"),
    
    NONE("none");

    private String value;

    TransferAnnouncementEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransferAnnouncementEnum fromValue(String value) {
      for (TransferAnnouncementEnum b : TransferAnnouncementEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransferAnnouncementEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransferAnnouncementEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransferAnnouncementEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransferAnnouncementEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSFER_ANNOUNCEMENT = "transferAnnouncement";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ANNOUNCEMENT)
  private TransferAnnouncementEnum transferAnnouncement = TransferAnnouncementEnum.DEFAULT;

  public static final String SERIALIZED_NAME_MAX_FAILURES = "maxFailures";
  @SerializedName(SERIALIZED_NAME_MAX_FAILURES)
  private Integer maxFailures = 3;

  public static final String SERIALIZED_NAME_MAX_TIMEOUTS = "maxTimeouts";
  @SerializedName(SERIALIZED_NAME_MAX_TIMEOUTS)
  private Integer maxTimeouts = 3;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout = 10;

  /**
   * Gets or Sets touchToneTerminators
   */
  @JsonAdapter(TouchToneTerminatorsEnum.Adapter.class)
  public enum TouchToneTerminatorsEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    TouchToneTerminatorsEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TouchToneTerminatorsEnum fromValue(Integer value) {
      for (TouchToneTerminatorsEnum b : TouchToneTerminatorsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TouchToneTerminatorsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TouchToneTerminatorsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TouchToneTerminatorsEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return TouchToneTerminatorsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TOUCH_TONE_TERMINATORS = "touchToneTerminators";
  @SerializedName(SERIALIZED_NAME_TOUCH_TONE_TERMINATORS)
  private TouchToneTerminatorsEnum touchToneTerminators = TouchToneTerminatorsEnum.NUMBER_1;

  public static final String SERIALIZED_NAME_TIMESCHEDULE = "timeschedule";
  @SerializedName(SERIALIZED_NAME_TIMESCHEDULE)
  private String timeschedule;

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

  public GetMenu200Response() {
  }

  public GetMenu200Response name(String name) {
    
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


  public GetMenu200Response maxExtensionLength(Integer maxExtensionLength) {
    
    this.maxExtensionLength = maxExtensionLength;
    return this;
  }

   /**
   * Get maxExtensionLength
   * @return maxExtensionLength
  **/
  @javax.annotation.Nonnull
  public Integer getMaxExtensionLength() {
    return maxExtensionLength;
  }


  public void setMaxExtensionLength(Integer maxExtensionLength) {
    this.maxExtensionLength = maxExtensionLength;
  }


  public GetMenu200Response speechRecognition(SpeechRecognitionEnum speechRecognition) {
    
    this.speechRecognition = speechRecognition;
    return this;
  }

   /**
   * Get speechRecognition
   * @return speechRecognition
  **/
  @javax.annotation.Nullable
  public SpeechRecognitionEnum getSpeechRecognition() {
    return speechRecognition;
  }


  public void setSpeechRecognition(SpeechRecognitionEnum speechRecognition) {
    this.speechRecognition = speechRecognition;
  }


  public GetMenu200Response directory(String directory) {
    
    this.directory = directory;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return directory
  **/
  @javax.annotation.Nullable
  public String getDirectory() {
    return directory;
  }


  public void setDirectory(String directory) {
    this.directory = directory;
  }


  public GetMenu200Response greetingType(GreetingTypeEnum greetingType) {
    
    this.greetingType = greetingType;
    return this;
  }

   /**
   * Get greetingType
   * @return greetingType
  **/
  @javax.annotation.Nonnull
  public GreetingTypeEnum getGreetingType() {
    return greetingType;
  }


  public void setGreetingType(GreetingTypeEnum greetingType) {
    this.greetingType = greetingType;
  }


  public GetMenu200Response greetingTTS(String greetingTTS) {
    
    this.greetingTTS = greetingTTS;
    return this;
  }

   /**
   * Get greetingTTS
   * @return greetingTTS
  **/
  @javax.annotation.Nullable
  public String getGreetingTTS() {
    return greetingTTS;
  }


  public void setGreetingTTS(String greetingTTS) {
    this.greetingTTS = greetingTTS;
  }


  public GetMenu200Response menuVoice(String menuVoice) {
    
    this.menuVoice = menuVoice;
    return this;
  }

   /**
   * Get menuVoice
   * @return menuVoice
  **/
  @javax.annotation.Nullable
  public String getMenuVoice() {
    return menuVoice;
  }


  public void setMenuVoice(String menuVoice) {
    this.menuVoice = menuVoice;
  }


  public GetMenu200Response exitSound(ExitSoundEnum exitSound) {
    
    this.exitSound = exitSound;
    return this;
  }

   /**
   * Get exitSound
   * @return exitSound
  **/
  @javax.annotation.Nullable
  public ExitSoundEnum getExitSound() {
    return exitSound;
  }


  public void setExitSound(ExitSoundEnum exitSound) {
    this.exitSound = exitSound;
  }


  public GetMenu200Response transferAnnouncement(TransferAnnouncementEnum transferAnnouncement) {
    
    this.transferAnnouncement = transferAnnouncement;
    return this;
  }

   /**
   * Get transferAnnouncement
   * @return transferAnnouncement
  **/
  @javax.annotation.Nullable
  public TransferAnnouncementEnum getTransferAnnouncement() {
    return transferAnnouncement;
  }


  public void setTransferAnnouncement(TransferAnnouncementEnum transferAnnouncement) {
    this.transferAnnouncement = transferAnnouncement;
  }


  public GetMenu200Response maxFailures(Integer maxFailures) {
    
    this.maxFailures = maxFailures;
    return this;
  }

   /**
   * Get maxFailures
   * @return maxFailures
  **/
  @javax.annotation.Nullable
  public Integer getMaxFailures() {
    return maxFailures;
  }


  public void setMaxFailures(Integer maxFailures) {
    this.maxFailures = maxFailures;
  }


  public GetMenu200Response maxTimeouts(Integer maxTimeouts) {
    
    this.maxTimeouts = maxTimeouts;
    return this;
  }

   /**
   * Get maxTimeouts
   * @return maxTimeouts
  **/
  @javax.annotation.Nullable
  public Integer getMaxTimeouts() {
    return maxTimeouts;
  }


  public void setMaxTimeouts(Integer maxTimeouts) {
    this.maxTimeouts = maxTimeouts;
  }


  public GetMenu200Response timeout(Integer timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @javax.annotation.Nullable
  public Integer getTimeout() {
    return timeout;
  }


  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public GetMenu200Response touchToneTerminators(TouchToneTerminatorsEnum touchToneTerminators) {
    
    this.touchToneTerminators = touchToneTerminators;
    return this;
  }

   /**
   * Get touchToneTerminators
   * @return touchToneTerminators
  **/
  @javax.annotation.Nullable
  public TouchToneTerminatorsEnum getTouchToneTerminators() {
    return touchToneTerminators;
  }


  public void setTouchToneTerminators(TouchToneTerminatorsEnum touchToneTerminators) {
    this.touchToneTerminators = touchToneTerminators;
  }


  public GetMenu200Response timeschedule(String timeschedule) {
    
    this.timeschedule = timeschedule;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return timeschedule
  **/
  @javax.annotation.Nullable
  public String getTimeschedule() {
    return timeschedule;
  }


  public void setTimeschedule(String timeschedule) {
    this.timeschedule = timeschedule;
  }


  public GetMenu200Response destinationType(DestinationTypeEnum destinationType) {
    
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Get destinationType
   * @return destinationType
  **/
  @javax.annotation.Nullable
  public DestinationTypeEnum getDestinationType() {
    return destinationType;
  }


  public void setDestinationType(DestinationTypeEnum destinationType) {
    this.destinationType = destinationType;
  }


  public GetMenu200Response destination(String destination) {
    
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


  public GetMenu200Response ref(String ref) {
    
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


  public GetMenu200Response callForwardingDestination(String callForwardingDestination) {
    
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


  public GetMenu200Response createdByUserId(String createdByUserId) {
    
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


  public GetMenu200Response updatedByUserId(String updatedByUserId) {
    
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


  public GetMenu200Response createdAt(OffsetDateTime createdAt) {
    
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


  public GetMenu200Response updatedAt(OffsetDateTime updatedAt) {
    
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
    GetMenu200Response getMenu200Response = (GetMenu200Response) o;
    return Objects.equals(this.name, getMenu200Response.name) &&
        Objects.equals(this.maxExtensionLength, getMenu200Response.maxExtensionLength) &&
        Objects.equals(this.speechRecognition, getMenu200Response.speechRecognition) &&
        Objects.equals(this.directory, getMenu200Response.directory) &&
        Objects.equals(this.greetingType, getMenu200Response.greetingType) &&
        Objects.equals(this.greetingTTS, getMenu200Response.greetingTTS) &&
        Objects.equals(this.menuVoice, getMenu200Response.menuVoice) &&
        Objects.equals(this.exitSound, getMenu200Response.exitSound) &&
        Objects.equals(this.transferAnnouncement, getMenu200Response.transferAnnouncement) &&
        Objects.equals(this.maxFailures, getMenu200Response.maxFailures) &&
        Objects.equals(this.maxTimeouts, getMenu200Response.maxTimeouts) &&
        Objects.equals(this.timeout, getMenu200Response.timeout) &&
        Objects.equals(this.touchToneTerminators, getMenu200Response.touchToneTerminators) &&
        Objects.equals(this.timeschedule, getMenu200Response.timeschedule) &&
        Objects.equals(this.destinationType, getMenu200Response.destinationType) &&
        Objects.equals(this.destination, getMenu200Response.destination) &&
        Objects.equals(this.ref, getMenu200Response.ref) &&
        Objects.equals(this.callForwardingDestination, getMenu200Response.callForwardingDestination) &&
        Objects.equals(this.createdByUserId, getMenu200Response.createdByUserId) &&
        Objects.equals(this.updatedByUserId, getMenu200Response.updatedByUserId) &&
        Objects.equals(this.createdAt, getMenu200Response.createdAt) &&
        Objects.equals(this.updatedAt, getMenu200Response.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, maxExtensionLength, speechRecognition, directory, greetingType, greetingTTS, menuVoice, exitSound, transferAnnouncement, maxFailures, maxTimeouts, timeout, touchToneTerminators, timeschedule, destinationType, destination, ref, callForwardingDestination, createdByUserId, updatedByUserId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMenu200Response {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    maxExtensionLength: ").append(toIndentedString(maxExtensionLength)).append("\n");
    sb.append("    speechRecognition: ").append(toIndentedString(speechRecognition)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    greetingType: ").append(toIndentedString(greetingType)).append("\n");
    sb.append("    greetingTTS: ").append(toIndentedString(greetingTTS)).append("\n");
    sb.append("    menuVoice: ").append(toIndentedString(menuVoice)).append("\n");
    sb.append("    exitSound: ").append(toIndentedString(exitSound)).append("\n");
    sb.append("    transferAnnouncement: ").append(toIndentedString(transferAnnouncement)).append("\n");
    sb.append("    maxFailures: ").append(toIndentedString(maxFailures)).append("\n");
    sb.append("    maxTimeouts: ").append(toIndentedString(maxTimeouts)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    touchToneTerminators: ").append(toIndentedString(touchToneTerminators)).append("\n");
    sb.append("    timeschedule: ").append(toIndentedString(timeschedule)).append("\n");
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
    openapiFields.add("maxExtensionLength");
    openapiFields.add("speechRecognition");
    openapiFields.add("directory");
    openapiFields.add("greetingType");
    openapiFields.add("greetingTTS");
    openapiFields.add("menuVoice");
    openapiFields.add("exitSound");
    openapiFields.add("transferAnnouncement");
    openapiFields.add("maxFailures");
    openapiFields.add("maxTimeouts");
    openapiFields.add("timeout");
    openapiFields.add("touchToneTerminators");
    openapiFields.add("timeschedule");
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
    openapiRequiredFields.add("maxExtensionLength");
    openapiRequiredFields.add("greetingType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetMenu200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetMenu200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMenu200Response is not found in the empty JSON string", GetMenu200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetMenu200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMenu200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetMenu200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("directory") != null && !jsonObj.get("directory").isJsonNull()) && !jsonObj.get("directory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directory").toString()));
      }
      if (!jsonObj.get("greetingType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `greetingType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("greetingType").toString()));
      }
      if ((jsonObj.get("greetingTTS") != null && !jsonObj.get("greetingTTS").isJsonNull()) && !jsonObj.get("greetingTTS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `greetingTTS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("greetingTTS").toString()));
      }
      if ((jsonObj.get("menuVoice") != null && !jsonObj.get("menuVoice").isJsonNull()) && !jsonObj.get("menuVoice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `menuVoice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("menuVoice").toString()));
      }
      if ((jsonObj.get("exitSound") != null && !jsonObj.get("exitSound").isJsonNull()) && !jsonObj.get("exitSound").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exitSound` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exitSound").toString()));
      }
      if ((jsonObj.get("transferAnnouncement") != null && !jsonObj.get("transferAnnouncement").isJsonNull()) && !jsonObj.get("transferAnnouncement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferAnnouncement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferAnnouncement").toString()));
      }
      if ((jsonObj.get("timeschedule") != null && !jsonObj.get("timeschedule").isJsonNull()) && !jsonObj.get("timeschedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeschedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeschedule").toString()));
      }
      if ((jsonObj.get("destinationType") != null && !jsonObj.get("destinationType").isJsonNull()) && !jsonObj.get("destinationType").isJsonPrimitive()) {
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
       if (!GetMenu200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMenu200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMenu200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMenu200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMenu200Response>() {
           @Override
           public void write(JsonWriter out, GetMenu200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMenu200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMenu200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMenu200Response
  * @throws IOException if the JSON string is invalid with respect to GetMenu200Response
  */
  public static GetMenu200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMenu200Response.class);
  }

 /**
  * Convert an instance of GetMenu200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
