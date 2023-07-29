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
 * Servers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-29T10:07:56.257Z[UTC]")
public class Servers {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port = 5060;

  public static final String SERIALIZED_NAME_CALLER_ID = "callerId";
  @SerializedName(SERIALIZED_NAME_CALLER_ID)
  private String callerId;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SIP("sip"),
    
    SKYPE("skype");

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

  public static final String SERIALIZED_NAME_DOMESTIC_OUTBOUND_CALL_LIMIT = "domesticOutboundCallLimit";
  @SerializedName(SERIALIZED_NAME_DOMESTIC_OUTBOUND_CALL_LIMIT)
  private Integer domesticOutboundCallLimit = 10;

  public static final String SERIALIZED_NAME_DOMESTIC_INBOUND_CALL_LIMIT = "domesticInboundCallLimit";
  @SerializedName(SERIALIZED_NAME_DOMESTIC_INBOUND_CALL_LIMIT)
  private Integer domesticInboundCallLimit = 10;

  public static final String SERIALIZED_NAME_INTERNATIONAL_OUTBOUND_CALL_LIMIT = "internationalOutboundCallLimit";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_OUTBOUND_CALL_LIMIT)
  private Integer internationalOutboundCallLimit = 10;

  public static final String SERIALIZED_NAME_TOLL_FREE_CHANNEL_LIMIT = "tollFreeChannelLimit";
  @SerializedName(SERIALIZED_NAME_TOLL_FREE_CHANNEL_LIMIT)
  private Integer tollFreeChannelLimit = 10;

  public static final String SERIALIZED_NAME_INBOUND_SIP_TRUNKING_ORDER = "inboundSipTrunkingOrder";
  @SerializedName(SERIALIZED_NAME_INBOUND_SIP_TRUNKING_ORDER)
  private String inboundSipTrunkingOrder;

  public static final String SERIALIZED_NAME_OUTBOUND_SIP_TRUNKING_ORDER = "outboundSipTrunkingOrder";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_SIP_TRUNKING_ORDER)
  private String outboundSipTrunkingOrder;

  /**
   * Gets or Sets noInstantRingBack
   */
  @JsonAdapter(NoInstantRingBackEnum.Adapter.class)
  public enum NoInstantRingBackEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    NoInstantRingBackEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NoInstantRingBackEnum fromValue(Integer value) {
      for (NoInstantRingBackEnum b : NoInstantRingBackEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NoInstantRingBackEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NoInstantRingBackEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NoInstantRingBackEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return NoInstantRingBackEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NO_INSTANT_RING_BACK = "noInstantRingBack";
  @SerializedName(SERIALIZED_NAME_NO_INSTANT_RING_BACK)
  private NoInstantRingBackEnum noInstantRingBack;

  /**
   * Gets or Sets bypassMedia
   */
  @JsonAdapter(BypassMediaEnum.Adapter.class)
  public enum BypassMediaEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    BypassMediaEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BypassMediaEnum fromValue(Integer value) {
      for (BypassMediaEnum b : BypassMediaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BypassMediaEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BypassMediaEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BypassMediaEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return BypassMediaEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BYPASS_MEDIA = "bypassMedia";
  @SerializedName(SERIALIZED_NAME_BYPASS_MEDIA)
  private BypassMediaEnum bypassMedia = BypassMediaEnum.NUMBER_0;

  /**
   * Gets or Sets disableRTPAutoAdjust
   */
  @JsonAdapter(DisableRTPAutoAdjustEnum.Adapter.class)
  public enum DisableRTPAutoAdjustEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    DisableRTPAutoAdjustEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisableRTPAutoAdjustEnum fromValue(Integer value) {
      for (DisableRTPAutoAdjustEnum b : DisableRTPAutoAdjustEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DisableRTPAutoAdjustEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisableRTPAutoAdjustEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisableRTPAutoAdjustEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return DisableRTPAutoAdjustEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISABLE_R_T_P_AUTO_ADJUST = "disableRTPAutoAdjust";
  @SerializedName(SERIALIZED_NAME_DISABLE_R_T_P_AUTO_ADJUST)
  private DisableRTPAutoAdjustEnum disableRTPAutoAdjust = DisableRTPAutoAdjustEnum.NUMBER_0;

  public Servers() {
  }

  public Servers name(String name) {
    
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


  public Servers host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nonnull
  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public Servers port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nonnull
  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public Servers callerId(String callerId) {
    
    this.callerId = callerId;
    return this;
  }

   /**
   * Get callerId
   * @return callerId
  **/
  @javax.annotation.Nullable
  public String getCallerId() {
    return callerId;
  }


  public void setCallerId(String callerId) {
    this.callerId = callerId;
  }


  public Servers type(TypeEnum type) {
    
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


  public Servers domesticOutboundCallLimit(Integer domesticOutboundCallLimit) {
    
    this.domesticOutboundCallLimit = domesticOutboundCallLimit;
    return this;
  }

   /**
   * Get domesticOutboundCallLimit
   * @return domesticOutboundCallLimit
  **/
  @javax.annotation.Nonnull
  public Integer getDomesticOutboundCallLimit() {
    return domesticOutboundCallLimit;
  }


  public void setDomesticOutboundCallLimit(Integer domesticOutboundCallLimit) {
    this.domesticOutboundCallLimit = domesticOutboundCallLimit;
  }


  public Servers domesticInboundCallLimit(Integer domesticInboundCallLimit) {
    
    this.domesticInboundCallLimit = domesticInboundCallLimit;
    return this;
  }

   /**
   * Get domesticInboundCallLimit
   * @return domesticInboundCallLimit
  **/
  @javax.annotation.Nonnull
  public Integer getDomesticInboundCallLimit() {
    return domesticInboundCallLimit;
  }


  public void setDomesticInboundCallLimit(Integer domesticInboundCallLimit) {
    this.domesticInboundCallLimit = domesticInboundCallLimit;
  }


  public Servers internationalOutboundCallLimit(Integer internationalOutboundCallLimit) {
    
    this.internationalOutboundCallLimit = internationalOutboundCallLimit;
    return this;
  }

   /**
   * Get internationalOutboundCallLimit
   * @return internationalOutboundCallLimit
  **/
  @javax.annotation.Nonnull
  public Integer getInternationalOutboundCallLimit() {
    return internationalOutboundCallLimit;
  }


  public void setInternationalOutboundCallLimit(Integer internationalOutboundCallLimit) {
    this.internationalOutboundCallLimit = internationalOutboundCallLimit;
  }


  public Servers tollFreeChannelLimit(Integer tollFreeChannelLimit) {
    
    this.tollFreeChannelLimit = tollFreeChannelLimit;
    return this;
  }

   /**
   * Get tollFreeChannelLimit
   * @return tollFreeChannelLimit
  **/
  @javax.annotation.Nonnull
  public Integer getTollFreeChannelLimit() {
    return tollFreeChannelLimit;
  }


  public void setTollFreeChannelLimit(Integer tollFreeChannelLimit) {
    this.tollFreeChannelLimit = tollFreeChannelLimit;
  }


  public Servers inboundSipTrunkingOrder(String inboundSipTrunkingOrder) {
    
    this.inboundSipTrunkingOrder = inboundSipTrunkingOrder;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return inboundSipTrunkingOrder
  **/
  @javax.annotation.Nullable
  public String getInboundSipTrunkingOrder() {
    return inboundSipTrunkingOrder;
  }


  public void setInboundSipTrunkingOrder(String inboundSipTrunkingOrder) {
    this.inboundSipTrunkingOrder = inboundSipTrunkingOrder;
  }


  public Servers outboundSipTrunkingOrder(String outboundSipTrunkingOrder) {
    
    this.outboundSipTrunkingOrder = outboundSipTrunkingOrder;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return outboundSipTrunkingOrder
  **/
  @javax.annotation.Nullable
  public String getOutboundSipTrunkingOrder() {
    return outboundSipTrunkingOrder;
  }


  public void setOutboundSipTrunkingOrder(String outboundSipTrunkingOrder) {
    this.outboundSipTrunkingOrder = outboundSipTrunkingOrder;
  }


  public Servers noInstantRingBack(NoInstantRingBackEnum noInstantRingBack) {
    
    this.noInstantRingBack = noInstantRingBack;
    return this;
  }

   /**
   * Get noInstantRingBack
   * @return noInstantRingBack
  **/
  @javax.annotation.Nullable
  public NoInstantRingBackEnum getNoInstantRingBack() {
    return noInstantRingBack;
  }


  public void setNoInstantRingBack(NoInstantRingBackEnum noInstantRingBack) {
    this.noInstantRingBack = noInstantRingBack;
  }


  public Servers bypassMedia(BypassMediaEnum bypassMedia) {
    
    this.bypassMedia = bypassMedia;
    return this;
  }

   /**
   * Get bypassMedia
   * @return bypassMedia
  **/
  @javax.annotation.Nullable
  public BypassMediaEnum getBypassMedia() {
    return bypassMedia;
  }


  public void setBypassMedia(BypassMediaEnum bypassMedia) {
    this.bypassMedia = bypassMedia;
  }


  public Servers disableRTPAutoAdjust(DisableRTPAutoAdjustEnum disableRTPAutoAdjust) {
    
    this.disableRTPAutoAdjust = disableRTPAutoAdjust;
    return this;
  }

   /**
   * Get disableRTPAutoAdjust
   * @return disableRTPAutoAdjust
  **/
  @javax.annotation.Nullable
  public DisableRTPAutoAdjustEnum getDisableRTPAutoAdjust() {
    return disableRTPAutoAdjust;
  }


  public void setDisableRTPAutoAdjust(DisableRTPAutoAdjustEnum disableRTPAutoAdjust) {
    this.disableRTPAutoAdjust = disableRTPAutoAdjust;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Servers servers = (Servers) o;
    return Objects.equals(this.name, servers.name) &&
        Objects.equals(this.host, servers.host) &&
        Objects.equals(this.port, servers.port) &&
        Objects.equals(this.callerId, servers.callerId) &&
        Objects.equals(this.type, servers.type) &&
        Objects.equals(this.domesticOutboundCallLimit, servers.domesticOutboundCallLimit) &&
        Objects.equals(this.domesticInboundCallLimit, servers.domesticInboundCallLimit) &&
        Objects.equals(this.internationalOutboundCallLimit, servers.internationalOutboundCallLimit) &&
        Objects.equals(this.tollFreeChannelLimit, servers.tollFreeChannelLimit) &&
        Objects.equals(this.inboundSipTrunkingOrder, servers.inboundSipTrunkingOrder) &&
        Objects.equals(this.outboundSipTrunkingOrder, servers.outboundSipTrunkingOrder) &&
        Objects.equals(this.noInstantRingBack, servers.noInstantRingBack) &&
        Objects.equals(this.bypassMedia, servers.bypassMedia) &&
        Objects.equals(this.disableRTPAutoAdjust, servers.disableRTPAutoAdjust);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, host, port, callerId, type, domesticOutboundCallLimit, domesticInboundCallLimit, internationalOutboundCallLimit, tollFreeChannelLimit, inboundSipTrunkingOrder, outboundSipTrunkingOrder, noInstantRingBack, bypassMedia, disableRTPAutoAdjust);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Servers {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    callerId: ").append(toIndentedString(callerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    domesticOutboundCallLimit: ").append(toIndentedString(domesticOutboundCallLimit)).append("\n");
    sb.append("    domesticInboundCallLimit: ").append(toIndentedString(domesticInboundCallLimit)).append("\n");
    sb.append("    internationalOutboundCallLimit: ").append(toIndentedString(internationalOutboundCallLimit)).append("\n");
    sb.append("    tollFreeChannelLimit: ").append(toIndentedString(tollFreeChannelLimit)).append("\n");
    sb.append("    inboundSipTrunkingOrder: ").append(toIndentedString(inboundSipTrunkingOrder)).append("\n");
    sb.append("    outboundSipTrunkingOrder: ").append(toIndentedString(outboundSipTrunkingOrder)).append("\n");
    sb.append("    noInstantRingBack: ").append(toIndentedString(noInstantRingBack)).append("\n");
    sb.append("    bypassMedia: ").append(toIndentedString(bypassMedia)).append("\n");
    sb.append("    disableRTPAutoAdjust: ").append(toIndentedString(disableRTPAutoAdjust)).append("\n");
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
    openapiFields.add("host");
    openapiFields.add("port");
    openapiFields.add("callerId");
    openapiFields.add("type");
    openapiFields.add("domesticOutboundCallLimit");
    openapiFields.add("domesticInboundCallLimit");
    openapiFields.add("internationalOutboundCallLimit");
    openapiFields.add("tollFreeChannelLimit");
    openapiFields.add("inboundSipTrunkingOrder");
    openapiFields.add("outboundSipTrunkingOrder");
    openapiFields.add("noInstantRingBack");
    openapiFields.add("bypassMedia");
    openapiFields.add("disableRTPAutoAdjust");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("host");
    openapiRequiredFields.add("port");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("domesticOutboundCallLimit");
    openapiRequiredFields.add("domesticInboundCallLimit");
    openapiRequiredFields.add("internationalOutboundCallLimit");
    openapiRequiredFields.add("tollFreeChannelLimit");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Servers
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Servers.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Servers is not found in the empty JSON string", Servers.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Servers.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Servers` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Servers.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      if ((jsonObj.get("callerId") != null && !jsonObj.get("callerId").isJsonNull()) && !jsonObj.get("callerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callerId").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("inboundSipTrunkingOrder") != null && !jsonObj.get("inboundSipTrunkingOrder").isJsonNull()) && !jsonObj.get("inboundSipTrunkingOrder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inboundSipTrunkingOrder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inboundSipTrunkingOrder").toString()));
      }
      if ((jsonObj.get("outboundSipTrunkingOrder") != null && !jsonObj.get("outboundSipTrunkingOrder").isJsonNull()) && !jsonObj.get("outboundSipTrunkingOrder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outboundSipTrunkingOrder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outboundSipTrunkingOrder").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Servers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Servers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Servers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Servers.class));

       return (TypeAdapter<T>) new TypeAdapter<Servers>() {
           @Override
           public void write(JsonWriter out, Servers value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Servers read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Servers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Servers
  * @throws IOException if the JSON string is invalid with respect to Servers
  */
  public static Servers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Servers.class);
  }

 /**
  * Convert an instance of Servers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

