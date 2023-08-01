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
import com.circuitid.client.model.TimeschedulesSundaySchedulesInner;
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
 * TimeschedulesSunday
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T19:31:01.524Z[UTC]")
public class TimeschedulesSunday {
  public static final String SERIALIZED_NAME_SCHEDULES = "schedules";
  @SerializedName(SERIALIZED_NAME_SCHEDULES)
  private List<TimeschedulesSundaySchedulesInner> schedules;

  public TimeschedulesSunday() {
  }

  public TimeschedulesSunday schedules(List<TimeschedulesSundaySchedulesInner> schedules) {
    
    this.schedules = schedules;
    return this;
  }

  public TimeschedulesSunday addSchedulesItem(TimeschedulesSundaySchedulesInner schedulesItem) {
    if (this.schedules == null) {
      this.schedules = new ArrayList<>();
    }
    this.schedules.add(schedulesItem);
    return this;
  }

   /**
   * Get schedules
   * @return schedules
  **/
  @javax.annotation.Nullable
  public List<TimeschedulesSundaySchedulesInner> getSchedules() {
    return schedules;
  }


  public void setSchedules(List<TimeschedulesSundaySchedulesInner> schedules) {
    this.schedules = schedules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeschedulesSunday timeschedulesSunday = (TimeschedulesSunday) o;
    return Objects.equals(this.schedules, timeschedulesSunday.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeschedulesSunday {\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
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
    openapiFields.add("schedules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeschedulesSunday
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimeschedulesSunday.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeschedulesSunday is not found in the empty JSON string", TimeschedulesSunday.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TimeschedulesSunday.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeschedulesSunday` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("schedules") != null && !jsonObj.get("schedules").isJsonNull()) {
        JsonArray jsonArrayschedules = jsonObj.getAsJsonArray("schedules");
        if (jsonArrayschedules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("schedules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `schedules` to be an array in the JSON string but got `%s`", jsonObj.get("schedules").toString()));
          }

          // validate the optional field `schedules` (array)
          for (int i = 0; i < jsonArrayschedules.size(); i++) {
            TimeschedulesSundaySchedulesInner.validateJsonObject(jsonArrayschedules.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeschedulesSunday.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeschedulesSunday' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeschedulesSunday> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeschedulesSunday.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeschedulesSunday>() {
           @Override
           public void write(JsonWriter out, TimeschedulesSunday value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeschedulesSunday read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TimeschedulesSunday given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeschedulesSunday
  * @throws IOException if the JSON string is invalid with respect to TimeschedulesSunday
  */
  public static TimeschedulesSunday fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeschedulesSunday.class);
  }

 /**
  * Convert an instance of TimeschedulesSunday to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

