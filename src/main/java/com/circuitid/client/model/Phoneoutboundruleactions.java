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
 * Phoneoutboundruleactions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T19:49:36.657Z[UTC]")
public class Phoneoutboundruleactions {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_PHONEOUTBOUNDRULE = "phoneoutboundrule";
  @SerializedName(SERIALIZED_NAME_PHONEOUTBOUNDRULE)
  private String phoneoutboundrule;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NUMBER_1(1),
    
    NUMBER_0(0);

    private Integer value;

    StatusEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(Integer value) {
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
        Integer value =  jsonReader.nextInt();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status = StatusEnum.NUMBER_1;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority = 1;

  public static final String SERIALIZED_NAME_STARTING_CHARS = "startingChars";
  @SerializedName(SERIALIZED_NAME_STARTING_CHARS)
  private String startingChars;

  public static final String SERIALIZED_NAME_CONTAINS = "contains";
  @SerializedName(SERIALIZED_NAME_CONTAINS)
  private String contains;

  /**
   * Gets or Sets lengthType
   */
  @JsonAdapter(LengthTypeEnum.Adapter.class)
  public enum LengthTypeEnum {
    ATLEAST("atleast"),
    
    EXACTLY("exactly"),
    
    RANGE("range"),
    
    ANY("any");

    private String value;

    LengthTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LengthTypeEnum fromValue(String value) {
      for (LengthTypeEnum b : LengthTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LengthTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LengthTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LengthTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LengthTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LENGTH_TYPE = "lengthType";
  @SerializedName(SERIALIZED_NAME_LENGTH_TYPE)
  private LengthTypeEnum lengthType;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  public static final String SERIALIZED_NAME_APPEND_CHARS = "appendChars";
  @SerializedName(SERIALIZED_NAME_APPEND_CHARS)
  private String appendChars;

  public static final String SERIALIZED_NAME_PREPEND_CHARS = "prependChars";
  @SerializedName(SERIALIZED_NAME_PREPEND_CHARS)
  private String prependChars;

  public static final String SERIALIZED_NAME_RANGE_START = "rangeStart";
  @SerializedName(SERIALIZED_NAME_RANGE_START)
  private Integer rangeStart;

  public static final String SERIALIZED_NAME_RANGE_END = "rangeEnd";
  @SerializedName(SERIALIZED_NAME_RANGE_END)
  private Integer rangeEnd;

  public static final String SERIALIZED_NAME_REMOVE_STARTING_CHARS = "removeStartingChars";
  @SerializedName(SERIALIZED_NAME_REMOVE_STARTING_CHARS)
  private Integer removeStartingChars;

  public static final String SERIALIZED_NAME_REMOVE_ENDING_CHARS = "removeEndingChars";
  @SerializedName(SERIALIZED_NAME_REMOVE_ENDING_CHARS)
  private Integer removeEndingChars;

  /**
   * Gets or Sets route
   */
  @JsonAdapter(RouteEnum.Adapter.class)
  public enum RouteEnum {
    DEFAULT("default"),
    
    GROUP("group"),
    
    PSTN("pstn");

    private String value;

    RouteEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RouteEnum fromValue(String value) {
      for (RouteEnum b : RouteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RouteEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RouteEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RouteEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RouteEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROUTE = "route";
  @SerializedName(SERIALIZED_NAME_ROUTE)
  private RouteEnum route = RouteEnum.DEFAULT;

  /**
   * Gets or Sets routingType
   */
  @JsonAdapter(RoutingTypeEnum.Adapter.class)
  public enum RoutingTypeEnum {
    PRIORITY("priority"),
    
    LB("lb"),
    
    SIMULTANEOUS("simultaneous");

    private String value;

    RoutingTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoutingTypeEnum fromValue(String value) {
      for (RoutingTypeEnum b : RoutingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoutingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoutingTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoutingTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoutingTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROUTING_TYPE = "routingType";
  @SerializedName(SERIALIZED_NAME_ROUTING_TYPE)
  private RoutingTypeEnum routingType;

  public Phoneoutboundruleactions() {
  }

  public Phoneoutboundruleactions name(String name) {
    
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


  public Phoneoutboundruleactions group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return group
  **/
  @javax.annotation.Nullable
  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public Phoneoutboundruleactions phoneoutboundrule(String phoneoutboundrule) {
    
    this.phoneoutboundrule = phoneoutboundrule;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return phoneoutboundrule
  **/
  @javax.annotation.Nonnull
  public String getPhoneoutboundrule() {
    return phoneoutboundrule;
  }


  public void setPhoneoutboundrule(String phoneoutboundrule) {
    this.phoneoutboundrule = phoneoutboundrule;
  }


  public Phoneoutboundruleactions status(StatusEnum status) {
    
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


  public Phoneoutboundruleactions priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nonnull
  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public Phoneoutboundruleactions startingChars(String startingChars) {
    
    this.startingChars = startingChars;
    return this;
  }

   /**
   * Get startingChars
   * @return startingChars
  **/
  @javax.annotation.Nullable
  public String getStartingChars() {
    return startingChars;
  }


  public void setStartingChars(String startingChars) {
    this.startingChars = startingChars;
  }


  public Phoneoutboundruleactions contains(String contains) {
    
    this.contains = contains;
    return this;
  }

   /**
   * Get contains
   * @return contains
  **/
  @javax.annotation.Nullable
  public String getContains() {
    return contains;
  }


  public void setContains(String contains) {
    this.contains = contains;
  }


  public Phoneoutboundruleactions lengthType(LengthTypeEnum lengthType) {
    
    this.lengthType = lengthType;
    return this;
  }

   /**
   * Get lengthType
   * @return lengthType
  **/
  @javax.annotation.Nullable
  public LengthTypeEnum getLengthType() {
    return lengthType;
  }


  public void setLengthType(LengthTypeEnum lengthType) {
    this.lengthType = lengthType;
  }


  public Phoneoutboundruleactions length(Integer length) {
    
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @javax.annotation.Nullable
  public Integer getLength() {
    return length;
  }


  public void setLength(Integer length) {
    this.length = length;
  }


  public Phoneoutboundruleactions appendChars(String appendChars) {
    
    this.appendChars = appendChars;
    return this;
  }

   /**
   * Get appendChars
   * @return appendChars
  **/
  @javax.annotation.Nullable
  public String getAppendChars() {
    return appendChars;
  }


  public void setAppendChars(String appendChars) {
    this.appendChars = appendChars;
  }


  public Phoneoutboundruleactions prependChars(String prependChars) {
    
    this.prependChars = prependChars;
    return this;
  }

   /**
   * Get prependChars
   * @return prependChars
  **/
  @javax.annotation.Nullable
  public String getPrependChars() {
    return prependChars;
  }


  public void setPrependChars(String prependChars) {
    this.prependChars = prependChars;
  }


  public Phoneoutboundruleactions rangeStart(Integer rangeStart) {
    
    this.rangeStart = rangeStart;
    return this;
  }

   /**
   * Get rangeStart
   * @return rangeStart
  **/
  @javax.annotation.Nullable
  public Integer getRangeStart() {
    return rangeStart;
  }


  public void setRangeStart(Integer rangeStart) {
    this.rangeStart = rangeStart;
  }


  public Phoneoutboundruleactions rangeEnd(Integer rangeEnd) {
    
    this.rangeEnd = rangeEnd;
    return this;
  }

   /**
   * Get rangeEnd
   * @return rangeEnd
  **/
  @javax.annotation.Nullable
  public Integer getRangeEnd() {
    return rangeEnd;
  }


  public void setRangeEnd(Integer rangeEnd) {
    this.rangeEnd = rangeEnd;
  }


  public Phoneoutboundruleactions removeStartingChars(Integer removeStartingChars) {
    
    this.removeStartingChars = removeStartingChars;
    return this;
  }

   /**
   * Get removeStartingChars
   * @return removeStartingChars
  **/
  @javax.annotation.Nullable
  public Integer getRemoveStartingChars() {
    return removeStartingChars;
  }


  public void setRemoveStartingChars(Integer removeStartingChars) {
    this.removeStartingChars = removeStartingChars;
  }


  public Phoneoutboundruleactions removeEndingChars(Integer removeEndingChars) {
    
    this.removeEndingChars = removeEndingChars;
    return this;
  }

   /**
   * Get removeEndingChars
   * @return removeEndingChars
  **/
  @javax.annotation.Nullable
  public Integer getRemoveEndingChars() {
    return removeEndingChars;
  }


  public void setRemoveEndingChars(Integer removeEndingChars) {
    this.removeEndingChars = removeEndingChars;
  }


  public Phoneoutboundruleactions route(RouteEnum route) {
    
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @javax.annotation.Nonnull
  public RouteEnum getRoute() {
    return route;
  }


  public void setRoute(RouteEnum route) {
    this.route = route;
  }


  public Phoneoutboundruleactions routingType(RoutingTypeEnum routingType) {
    
    this.routingType = routingType;
    return this;
  }

   /**
   * Get routingType
   * @return routingType
  **/
  @javax.annotation.Nullable
  public RoutingTypeEnum getRoutingType() {
    return routingType;
  }


  public void setRoutingType(RoutingTypeEnum routingType) {
    this.routingType = routingType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phoneoutboundruleactions phoneoutboundruleactions = (Phoneoutboundruleactions) o;
    return Objects.equals(this.name, phoneoutboundruleactions.name) &&
        Objects.equals(this.group, phoneoutboundruleactions.group) &&
        Objects.equals(this.phoneoutboundrule, phoneoutboundruleactions.phoneoutboundrule) &&
        Objects.equals(this.status, phoneoutboundruleactions.status) &&
        Objects.equals(this.priority, phoneoutboundruleactions.priority) &&
        Objects.equals(this.startingChars, phoneoutboundruleactions.startingChars) &&
        Objects.equals(this.contains, phoneoutboundruleactions.contains) &&
        Objects.equals(this.lengthType, phoneoutboundruleactions.lengthType) &&
        Objects.equals(this.length, phoneoutboundruleactions.length) &&
        Objects.equals(this.appendChars, phoneoutboundruleactions.appendChars) &&
        Objects.equals(this.prependChars, phoneoutboundruleactions.prependChars) &&
        Objects.equals(this.rangeStart, phoneoutboundruleactions.rangeStart) &&
        Objects.equals(this.rangeEnd, phoneoutboundruleactions.rangeEnd) &&
        Objects.equals(this.removeStartingChars, phoneoutboundruleactions.removeStartingChars) &&
        Objects.equals(this.removeEndingChars, phoneoutboundruleactions.removeEndingChars) &&
        Objects.equals(this.route, phoneoutboundruleactions.route) &&
        Objects.equals(this.routingType, phoneoutboundruleactions.routingType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, group, phoneoutboundrule, status, priority, startingChars, contains, lengthType, length, appendChars, prependChars, rangeStart, rangeEnd, removeStartingChars, removeEndingChars, route, routingType);
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
    sb.append("class Phoneoutboundruleactions {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    phoneoutboundrule: ").append(toIndentedString(phoneoutboundrule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    startingChars: ").append(toIndentedString(startingChars)).append("\n");
    sb.append("    contains: ").append(toIndentedString(contains)).append("\n");
    sb.append("    lengthType: ").append(toIndentedString(lengthType)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    appendChars: ").append(toIndentedString(appendChars)).append("\n");
    sb.append("    prependChars: ").append(toIndentedString(prependChars)).append("\n");
    sb.append("    rangeStart: ").append(toIndentedString(rangeStart)).append("\n");
    sb.append("    rangeEnd: ").append(toIndentedString(rangeEnd)).append("\n");
    sb.append("    removeStartingChars: ").append(toIndentedString(removeStartingChars)).append("\n");
    sb.append("    removeEndingChars: ").append(toIndentedString(removeEndingChars)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    routingType: ").append(toIndentedString(routingType)).append("\n");
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
    openapiFields.add("group");
    openapiFields.add("phoneoutboundrule");
    openapiFields.add("status");
    openapiFields.add("priority");
    openapiFields.add("startingChars");
    openapiFields.add("contains");
    openapiFields.add("lengthType");
    openapiFields.add("length");
    openapiFields.add("appendChars");
    openapiFields.add("prependChars");
    openapiFields.add("rangeStart");
    openapiFields.add("rangeEnd");
    openapiFields.add("removeStartingChars");
    openapiFields.add("removeEndingChars");
    openapiFields.add("route");
    openapiFields.add("routingType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("phoneoutboundrule");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("route");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Phoneoutboundruleactions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Phoneoutboundruleactions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Phoneoutboundruleactions is not found in the empty JSON string", Phoneoutboundruleactions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Phoneoutboundruleactions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Phoneoutboundruleactions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Phoneoutboundruleactions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if (!jsonObj.get("phoneoutboundrule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneoutboundrule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneoutboundrule").toString()));
      }
      if ((jsonObj.get("startingChars") != null && !jsonObj.get("startingChars").isJsonNull()) && !jsonObj.get("startingChars").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startingChars` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startingChars").toString()));
      }
      if ((jsonObj.get("contains") != null && !jsonObj.get("contains").isJsonNull()) && !jsonObj.get("contains").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contains` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contains").toString()));
      }
      if ((jsonObj.get("lengthType") != null && !jsonObj.get("lengthType").isJsonNull()) && !jsonObj.get("lengthType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lengthType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lengthType").toString()));
      }
      if ((jsonObj.get("appendChars") != null && !jsonObj.get("appendChars").isJsonNull()) && !jsonObj.get("appendChars").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appendChars` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appendChars").toString()));
      }
      if ((jsonObj.get("prependChars") != null && !jsonObj.get("prependChars").isJsonNull()) && !jsonObj.get("prependChars").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prependChars` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prependChars").toString()));
      }
      if (!jsonObj.get("route").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route").toString()));
      }
      if ((jsonObj.get("routingType") != null && !jsonObj.get("routingType").isJsonNull()) && !jsonObj.get("routingType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routingType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routingType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Phoneoutboundruleactions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Phoneoutboundruleactions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Phoneoutboundruleactions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Phoneoutboundruleactions.class));

       return (TypeAdapter<T>) new TypeAdapter<Phoneoutboundruleactions>() {
           @Override
           public void write(JsonWriter out, Phoneoutboundruleactions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Phoneoutboundruleactions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Phoneoutboundruleactions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Phoneoutboundruleactions
  * @throws IOException if the JSON string is invalid with respect to Phoneoutboundruleactions
  */
  public static Phoneoutboundruleactions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Phoneoutboundruleactions.class);
  }

 /**
  * Convert an instance of Phoneoutboundruleactions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

