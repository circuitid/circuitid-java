/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.21
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
 * Clients
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-31T21:56:43.797Z[UTC]")
public class Clients {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_MAC = "mac";
  @SerializedName(SERIALIZED_NAME_MAC)
  private String mac;

  public static final String SERIALIZED_NAME_HTTP_USER_AGENT = "httpUserAgent";
  @SerializedName(SERIALIZED_NAME_HTTP_USER_AGENT)
  private String httpUserAgent;

  /**
   * Gets or Sets manufacture
   */
  @JsonAdapter(ManufactureEnum.Adapter.class)
  public enum ManufactureEnum {
    CISCO("cisco"),
    
    GRANDSTREAM("grandstream"),
    
    POLYCOM("polycom");

    private String value;

    ManufactureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ManufactureEnum fromValue(String value) {
      for (ManufactureEnum b : ManufactureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ManufactureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ManufactureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ManufactureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ManufactureEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MANUFACTURE = "manufacture";
  @SerializedName(SERIALIZED_NAME_MANUFACTURE)
  private ManufactureEnum manufacture;

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

  public Clients() {
  }

  public Clients name(String name) {
    
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


  public Clients user(String user) {
    
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


  public Clients mac(String mac) {
    
    this.mac = mac;
    return this;
  }

   /**
   * Get mac
   * @return mac
  **/
  @javax.annotation.Nonnull
  public String getMac() {
    return mac;
  }


  public void setMac(String mac) {
    this.mac = mac;
  }


  public Clients httpUserAgent(String httpUserAgent) {
    
    this.httpUserAgent = httpUserAgent;
    return this;
  }

   /**
   * Get httpUserAgent
   * @return httpUserAgent
  **/
  @javax.annotation.Nullable
  public String getHttpUserAgent() {
    return httpUserAgent;
  }


  public void setHttpUserAgent(String httpUserAgent) {
    this.httpUserAgent = httpUserAgent;
  }


  public Clients manufacture(ManufactureEnum manufacture) {
    
    this.manufacture = manufacture;
    return this;
  }

   /**
   * Get manufacture
   * @return manufacture
  **/
  @javax.annotation.Nullable
  public ManufactureEnum getManufacture() {
    return manufacture;
  }


  public void setManufacture(ManufactureEnum manufacture) {
    this.manufacture = manufacture;
  }


  public Clients status(StatusEnum status) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clients clients = (Clients) o;
    return Objects.equals(this.name, clients.name) &&
        Objects.equals(this.user, clients.user) &&
        Objects.equals(this.mac, clients.mac) &&
        Objects.equals(this.httpUserAgent, clients.httpUserAgent) &&
        Objects.equals(this.manufacture, clients.manufacture) &&
        Objects.equals(this.status, clients.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, user, mac, httpUserAgent, manufacture, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clients {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    httpUserAgent: ").append(toIndentedString(httpUserAgent)).append("\n");
    sb.append("    manufacture: ").append(toIndentedString(manufacture)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("user");
    openapiFields.add("mac");
    openapiFields.add("httpUserAgent");
    openapiFields.add("manufacture");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("mac");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Clients
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Clients.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Clients is not found in the empty JSON string", Clients.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Clients.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Clients` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Clients.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      if (!jsonObj.get("mac").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mac` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mac").toString()));
      }
      if ((jsonObj.get("httpUserAgent") != null && !jsonObj.get("httpUserAgent").isJsonNull()) && !jsonObj.get("httpUserAgent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpUserAgent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpUserAgent").toString()));
      }
      if ((jsonObj.get("manufacture") != null && !jsonObj.get("manufacture").isJsonNull()) && !jsonObj.get("manufacture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manufacture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manufacture").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Clients.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Clients' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Clients> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Clients.class));

       return (TypeAdapter<T>) new TypeAdapter<Clients>() {
           @Override
           public void write(JsonWriter out, Clients value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Clients read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Clients given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Clients
  * @throws IOException if the JSON string is invalid with respect to Clients
  */
  public static Clients fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Clients.class);
  }

 /**
  * Convert an instance of Clients to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

