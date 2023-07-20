/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.8
 * Contact: support@circuitid.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package CircuitID;

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

import invalidPackageName.JSON;

/**
 * Menus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-20T01:51:21.811Z[UTC]")
public class Menus {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name = null;

  public static final String SERIALIZED_NAME_MAX_EXTENSION_LENGTH = "maxExtensionLength";
  @SerializedName(SERIALIZED_NAME_MAX_EXTENSION_LENGTH)
  private Object maxExtensionLength = 4;

  /**
   * Gets or Sets speechRecognition
   */
  @JsonAdapter(SpeechRecognitionEnum.Adapter.class)
  public enum SpeechRecognitionEnum {
    _1("1"),
    
    _0("0");

    private Object value;

    SpeechRecognitionEnum(Object value) {
      this.value = value;
    }

    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpeechRecognitionEnum fromValue(Object value) {
      for (SpeechRecognitionEnum b : SpeechRecognitionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SpeechRecognitionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpeechRecognitionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpeechRecognitionEnum read(final JsonReader jsonReader) throws IOException {
        Object value =  jsonReader.nextObject();
        return SpeechRecognitionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SPEECH_RECOGNITION = "speechRecognition";
  @SerializedName(SERIALIZED_NAME_SPEECH_RECOGNITION)
  private SpeechRecognitionEnum speechRecognition = 0;

  public static final String SERIALIZED_NAME_DIRECTORY = "directory";
  @SerializedName(SERIALIZED_NAME_DIRECTORY)
  private Object directory = null;

  /**
   * Gets or Sets greetingType
   */
  @JsonAdapter(GreetingTypeEnum.Adapter.class)
  public enum GreetingTypeEnum {
    TTS("tts"),
    
    MP3("mp3");

    private Object value;

    GreetingTypeEnum(Object value) {
      this.value = value;
    }

    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GreetingTypeEnum fromValue(Object value) {
      for (GreetingTypeEnum b : GreetingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GreetingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GreetingTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GreetingTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value =  jsonReader.nextObject();
        return GreetingTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GREETING_TYPE = "greetingType";
  @SerializedName(SERIALIZED_NAME_GREETING_TYPE)
  private GreetingTypeEnum greetingType = null;

  public static final String SERIALIZED_NAME_GREETING_T_T_S = "greetingTTS";
  @SerializedName(SERIALIZED_NAME_GREETING_T_T_S)
  private Object greetingTTS = null;

  public static final String SERIALIZED_NAME_MENU_VOICE = "menuVoice";
  @SerializedName(SERIALIZED_NAME_MENU_VOICE)
  private Object menuVoice = null;

  /**
   * Gets or Sets exitSound
   */
  @JsonAdapter(ExitSoundEnum.Adapter.class)
  public enum ExitSoundEnum {
    DEFAULT("default"),
    
    MP3("mp3");

    private Object value;

    ExitSoundEnum(Object value) {
      this.value = value;
    }

    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExitSoundEnum fromValue(Object value) {
      for (ExitSoundEnum b : ExitSoundEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ExitSoundEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExitSoundEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExitSoundEnum read(final JsonReader jsonReader) throws IOException {
        Object value =  jsonReader.nextObject();
        return ExitSoundEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXIT_SOUND = "exitSound";
  @SerializedName(SERIALIZED_NAME_EXIT_SOUND)
  private ExitSoundEnum exitSound = default;

  /**
   * Gets or Sets transferAnnouncement
   */
  @JsonAdapter(TransferAnnouncementEnum.Adapter.class)
  public enum TransferAnnouncementEnum {
    DEFAULT("default"),
    
    MP3("mp3"),
    
    NONE("none");

    private Object value;

    TransferAnnouncementEnum(Object value) {
      this.value = value;
    }

    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransferAnnouncementEnum fromValue(Object value) {
      for (TransferAnnouncementEnum b : TransferAnnouncementEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransferAnnouncementEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransferAnnouncementEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransferAnnouncementEnum read(final JsonReader jsonReader) throws IOException {
        Object value =  jsonReader.nextObject();
        return TransferAnnouncementEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSFER_ANNOUNCEMENT = "transferAnnouncement";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ANNOUNCEMENT)
  private TransferAnnouncementEnum transferAnnouncement = default;

  public static final String SERIALIZED_NAME_MAX_FAILURES = "maxFailures";
  @SerializedName(SERIALIZED_NAME_MAX_FAILURES)
  private Object maxFailures = 3;

  public static final String SERIALIZED_NAME_MAX_TIMEOUTS = "maxTimeouts";
  @SerializedName(SERIALIZED_NAME_MAX_TIMEOUTS)
  private Object maxTimeouts = 3;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Object timeout = 10;

  /**
   * Gets or Sets touchToneTerminators
   */
  @JsonAdapter(TouchToneTerminatorsEnum.Adapter.class)
  public enum TouchToneTerminatorsEnum {
    _1("1"),
    
    _0("0");

    private Object value;

    TouchToneTerminatorsEnum(Object value) {
      this.value = value;
    }

    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TouchToneTerminatorsEnum fromValue(Object value) {
      for (TouchToneTerminatorsEnum b : TouchToneTerminatorsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TouchToneTerminatorsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TouchToneTerminatorsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TouchToneTerminatorsEnum read(final JsonReader jsonReader) throws IOException {
        Object value =  jsonReader.nextObject();
        return TouchToneTerminatorsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TOUCH_TONE_TERMINATORS = "touchToneTerminators";
  @SerializedName(SERIALIZED_NAME_TOUCH_TONE_TERMINATORS)
  private TouchToneTerminatorsEnum touchToneTerminators = 1;

  public static final String SERIALIZED_NAME_TIMESCHEDULE = "timeschedule";
  @SerializedName(SERIALIZED_NAME_TIMESCHEDULE)
  private Object timeschedule = null;

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

    private Object value;

    DestinationTypeEnum(Object value) {
      this.value = value;
    }

    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DestinationTypeEnum fromValue(Object value) {
      for (DestinationTypeEnum b : DestinationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DestinationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value =  jsonReader.nextObject();
        return DestinationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESTINATION_TYPE = "destinationType";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TYPE)
  private DestinationTypeEnum destinationType = null;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private Object destination = null;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private Object ref = null;

  public static final String SERIALIZED_NAME_CALL_FORWARDING_DESTINATION = "callForwardingDestination";
  @SerializedName(SERIALIZED_NAME_CALL_FORWARDING_DESTINATION)
  private Object callForwardingDestination = null;

  public Menus() {
  }

  public Menus name(Object name) {
    
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


  public Menus maxExtensionLength(Object maxExtensionLength) {
    
    this.maxExtensionLength = maxExtensionLength;
    return this;
  }

   /**
   * Get maxExtensionLength
   * @return maxExtensionLength
  **/
  @javax.annotation.Nullable
  public Object getMaxExtensionLength() {
    return maxExtensionLength;
  }


  public void setMaxExtensionLength(Object maxExtensionLength) {
    this.maxExtensionLength = maxExtensionLength;
  }


  public Menus speechRecognition(SpeechRecognitionEnum speechRecognition) {
    
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


  public Menus directory(Object directory) {
    
    this.directory = directory;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return directory
  **/
  @javax.annotation.Nullable
  public Object getDirectory() {
    return directory;
  }


  public void setDirectory(Object directory) {
    this.directory = directory;
  }


  public Menus greetingType(GreetingTypeEnum greetingType) {
    
    this.greetingType = greetingType;
    return this;
  }

   /**
   * Get greetingType
   * @return greetingType
  **/
  @javax.annotation.Nullable
  public GreetingTypeEnum getGreetingType() {
    return greetingType;
  }


  public void setGreetingType(GreetingTypeEnum greetingType) {
    this.greetingType = greetingType;
  }


  public Menus greetingTTS(Object greetingTTS) {
    
    this.greetingTTS = greetingTTS;
    return this;
  }

   /**
   * Get greetingTTS
   * @return greetingTTS
  **/
  @javax.annotation.Nullable
  public Object getGreetingTTS() {
    return greetingTTS;
  }


  public void setGreetingTTS(Object greetingTTS) {
    this.greetingTTS = greetingTTS;
  }


  public Menus menuVoice(Object menuVoice) {
    
    this.menuVoice = menuVoice;
    return this;
  }

   /**
   * Get menuVoice
   * @return menuVoice
  **/
  @javax.annotation.Nullable
  public Object getMenuVoice() {
    return menuVoice;
  }


  public void setMenuVoice(Object menuVoice) {
    this.menuVoice = menuVoice;
  }


  public Menus exitSound(ExitSoundEnum exitSound) {
    
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


  public Menus transferAnnouncement(TransferAnnouncementEnum transferAnnouncement) {
    
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


  public Menus maxFailures(Object maxFailures) {
    
    this.maxFailures = maxFailures;
    return this;
  }

   /**
   * Get maxFailures
   * @return maxFailures
  **/
  @javax.annotation.Nullable
  public Object getMaxFailures() {
    return maxFailures;
  }


  public void setMaxFailures(Object maxFailures) {
    this.maxFailures = maxFailures;
  }


  public Menus maxTimeouts(Object maxTimeouts) {
    
    this.maxTimeouts = maxTimeouts;
    return this;
  }

   /**
   * Get maxTimeouts
   * @return maxTimeouts
  **/
  @javax.annotation.Nullable
  public Object getMaxTimeouts() {
    return maxTimeouts;
  }


  public void setMaxTimeouts(Object maxTimeouts) {
    this.maxTimeouts = maxTimeouts;
  }


  public Menus timeout(Object timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @javax.annotation.Nullable
  public Object getTimeout() {
    return timeout;
  }


  public void setTimeout(Object timeout) {
    this.timeout = timeout;
  }


  public Menus touchToneTerminators(TouchToneTerminatorsEnum touchToneTerminators) {
    
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


  public Menus timeschedule(Object timeschedule) {
    
    this.timeschedule = timeschedule;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return timeschedule
  **/
  @javax.annotation.Nullable
  public Object getTimeschedule() {
    return timeschedule;
  }


  public void setTimeschedule(Object timeschedule) {
    this.timeschedule = timeschedule;
  }


  public Menus destinationType(DestinationTypeEnum destinationType) {
    
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


  public Menus destination(Object destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return destination
  **/
  @javax.annotation.Nullable
  public Object getDestination() {
    return destination;
  }


  public void setDestination(Object destination) {
    this.destination = destination;
  }


  public Menus ref(Object ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @javax.annotation.Nullable
  public Object getRef() {
    return ref;
  }


  public void setRef(Object ref) {
    this.ref = ref;
  }


  public Menus callForwardingDestination(Object callForwardingDestination) {
    
    this.callForwardingDestination = callForwardingDestination;
    return this;
  }

   /**
   * Get callForwardingDestination
   * @return callForwardingDestination
  **/
  @javax.annotation.Nullable
  public Object getCallForwardingDestination() {
    return callForwardingDestination;
  }


  public void setCallForwardingDestination(Object callForwardingDestination) {
    this.callForwardingDestination = callForwardingDestination;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Menus menus = (Menus) o;
    return Objects.equals(this.name, menus.name) &&
        Objects.equals(this.maxExtensionLength, menus.maxExtensionLength) &&
        Objects.equals(this.speechRecognition, menus.speechRecognition) &&
        Objects.equals(this.directory, menus.directory) &&
        Objects.equals(this.greetingType, menus.greetingType) &&
        Objects.equals(this.greetingTTS, menus.greetingTTS) &&
        Objects.equals(this.menuVoice, menus.menuVoice) &&
        Objects.equals(this.exitSound, menus.exitSound) &&
        Objects.equals(this.transferAnnouncement, menus.transferAnnouncement) &&
        Objects.equals(this.maxFailures, menus.maxFailures) &&
        Objects.equals(this.maxTimeouts, menus.maxTimeouts) &&
        Objects.equals(this.timeout, menus.timeout) &&
        Objects.equals(this.touchToneTerminators, menus.touchToneTerminators) &&
        Objects.equals(this.timeschedule, menus.timeschedule) &&
        Objects.equals(this.destinationType, menus.destinationType) &&
        Objects.equals(this.destination, menus.destination) &&
        Objects.equals(this.ref, menus.ref) &&
        Objects.equals(this.callForwardingDestination, menus.callForwardingDestination);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, maxExtensionLength, speechRecognition, directory, greetingType, greetingTTS, menuVoice, exitSound, transferAnnouncement, maxFailures, maxTimeouts, timeout, touchToneTerminators, timeschedule, destinationType, destination, ref, callForwardingDestination);
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
    sb.append("class Menus {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to Menus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Menus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Menus is not found in the empty JSON string", Menus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Menus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Menus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Menus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Menus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Menus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Menus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Menus.class));

       return (TypeAdapter<T>) new TypeAdapter<Menus>() {
           @Override
           public void write(JsonWriter out, Menus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Menus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Menus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Menus
  * @throws IOException if the JSON string is invalid with respect to Menus
  */
  public static Menus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Menus.class);
  }

 /**
  * Convert an instance of Menus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

