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
 * Callqueues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-25T10:39:03.806Z[UTC]")
public class Callqueues {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name = null;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private Object strategy = null;

  public static final String SERIALIZED_NAME_ANNOUNCE_POSITION = "announcePosition";
  @SerializedName(SERIALIZED_NAME_ANNOUNCE_POSITION)
  private Object announcePosition = null;

  public static final String SERIALIZED_NAME_MOH = "moh";
  @SerializedName(SERIALIZED_NAME_MOH)
  private Object moh = deafult;

  public static final String SERIALIZED_NAME_CALLER_RESUME_TIMEOUT = "callerResumeTimeout";
  @SerializedName(SERIALIZED_NAME_CALLER_RESUME_TIMEOUT)
  private Object callerResumeTimeout = 3600;

  public static final String SERIALIZED_NAME_MAX_WAIT_TIME = "maxWaitTime";
  @SerializedName(SERIALIZED_NAME_MAX_WAIT_TIME)
  private Object maxWaitTime = 300;

  public static final String SERIALIZED_NAME_MAX_WAIT_TIME_NO_AGENT = "maxWaitTimeNoAgent";
  @SerializedName(SERIALIZED_NAME_MAX_WAIT_TIME_NO_AGENT)
  private Object maxWaitTimeNoAgent = 300;

  public static final String SERIALIZED_NAME_MAX_NO_ANSWER = "maxNoAnswer";
  @SerializedName(SERIALIZED_NAME_MAX_NO_ANSWER)
  private Object maxNoAnswer = 1000000;

  public static final String SERIALIZED_NAME_NO_ANSWER_DELAY_TIMEOUT = "noAnswerDelayTimeout";
  @SerializedName(SERIALIZED_NAME_NO_ANSWER_DELAY_TIMEOUT)
  private Object noAnswerDelayTimeout = 60;

  public static final String SERIALIZED_NAME_REJECT_TIMEOUT = "rejectTimeout";
  @SerializedName(SERIALIZED_NAME_REJECT_TIMEOUT)
  private Object rejectTimeout = 60;

  public static final String SERIALIZED_NAME_BUSY_TIMEOUT = "busyTimeout";
  @SerializedName(SERIALIZED_NAME_BUSY_TIMEOUT)
  private Object busyTimeout = 60;

  public static final String SERIALIZED_NAME_WRAP_UP_TIMEOUT = "wrapUpTimeout";
  @SerializedName(SERIALIZED_NAME_WRAP_UP_TIMEOUT)
  private Object wrapUpTimeout = 10;

  public static final String SERIALIZED_NAME_TIME_BASED_SCORE = "timeBasedScore";
  @SerializedName(SERIALIZED_NAME_TIME_BASED_SCORE)
  private Object timeBasedScore = queue;

  public static final String SERIALIZED_NAME_TIER_RULES_APPLY = "tierRulesApply";
  @SerializedName(SERIALIZED_NAME_TIER_RULES_APPLY)
  private Object tierRulesApply = null;

  public static final String SERIALIZED_NAME_TIER_RULE_NO_AGENT_NO_WAIT = "tierRuleNoAgentNoWait";
  @SerializedName(SERIALIZED_NAME_TIER_RULE_NO_AGENT_NO_WAIT)
  private Object tierRuleNoAgentNoWait = true;

  public static final String SERIALIZED_NAME_TIER_RULE_WAIT_SECOND = "tierRuleWaitSecond";
  @SerializedName(SERIALIZED_NAME_TIER_RULE_WAIT_SECOND)
  private Object tierRuleWaitSecond = 300;

  public static final String SERIALIZED_NAME_TIER_RULE_WAIT_MULTIPLY_LEVEL = "tierRuleWaitMultiplyLevel";
  @SerializedName(SERIALIZED_NAME_TIER_RULE_WAIT_MULTIPLY_LEVEL)
  private Object tierRuleWaitMultiplyLevel = true;

  public static final String SERIALIZED_NAME_ABANDONED_RESUME_ALLOWED = "abandonedResumeAllowed";
  @SerializedName(SERIALIZED_NAME_ABANDONED_RESUME_ALLOWED)
  private Object abandonedResumeAllowed = true;

  public static final String SERIALIZED_NAME_DISCARD_ABANDONED_AFTER = "discardAbandonedAfter";
  @SerializedName(SERIALIZED_NAME_DISCARD_ABANDONED_AFTER)
  private Object discardAbandonedAfter = 14400;

  public static final String SERIALIZED_NAME_MAX_WAIT_TIME_NO_AGENT_TIME_REACHED = "maxWaitTimeNoAgentTimeReached";
  @SerializedName(SERIALIZED_NAME_MAX_WAIT_TIME_NO_AGENT_TIME_REACHED)
  private Object maxWaitTimeNoAgentTimeReached = 5;

  public Callqueues() {
  }

  public Callqueues name(Object name) {
    
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


  public Callqueues strategy(Object strategy) {
    
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @javax.annotation.Nullable
  public Object getStrategy() {
    return strategy;
  }


  public void setStrategy(Object strategy) {
    this.strategy = strategy;
  }


  public Callqueues announcePosition(Object announcePosition) {
    
    this.announcePosition = announcePosition;
    return this;
  }

   /**
   * Get announcePosition
   * @return announcePosition
  **/
  @javax.annotation.Nullable
  public Object getAnnouncePosition() {
    return announcePosition;
  }


  public void setAnnouncePosition(Object announcePosition) {
    this.announcePosition = announcePosition;
  }


  public Callqueues moh(Object moh) {
    
    this.moh = moh;
    return this;
  }

   /**
   * Get moh
   * @return moh
  **/
  @javax.annotation.Nullable
  public Object getMoh() {
    return moh;
  }


  public void setMoh(Object moh) {
    this.moh = moh;
  }


  public Callqueues callerResumeTimeout(Object callerResumeTimeout) {
    
    this.callerResumeTimeout = callerResumeTimeout;
    return this;
  }

   /**
   * Get callerResumeTimeout
   * @return callerResumeTimeout
  **/
  @javax.annotation.Nullable
  public Object getCallerResumeTimeout() {
    return callerResumeTimeout;
  }


  public void setCallerResumeTimeout(Object callerResumeTimeout) {
    this.callerResumeTimeout = callerResumeTimeout;
  }


  public Callqueues maxWaitTime(Object maxWaitTime) {
    
    this.maxWaitTime = maxWaitTime;
    return this;
  }

   /**
   * Get maxWaitTime
   * @return maxWaitTime
  **/
  @javax.annotation.Nullable
  public Object getMaxWaitTime() {
    return maxWaitTime;
  }


  public void setMaxWaitTime(Object maxWaitTime) {
    this.maxWaitTime = maxWaitTime;
  }


  public Callqueues maxWaitTimeNoAgent(Object maxWaitTimeNoAgent) {
    
    this.maxWaitTimeNoAgent = maxWaitTimeNoAgent;
    return this;
  }

   /**
   * Get maxWaitTimeNoAgent
   * @return maxWaitTimeNoAgent
  **/
  @javax.annotation.Nullable
  public Object getMaxWaitTimeNoAgent() {
    return maxWaitTimeNoAgent;
  }


  public void setMaxWaitTimeNoAgent(Object maxWaitTimeNoAgent) {
    this.maxWaitTimeNoAgent = maxWaitTimeNoAgent;
  }


  public Callqueues maxNoAnswer(Object maxNoAnswer) {
    
    this.maxNoAnswer = maxNoAnswer;
    return this;
  }

   /**
   * Get maxNoAnswer
   * @return maxNoAnswer
  **/
  @javax.annotation.Nullable
  public Object getMaxNoAnswer() {
    return maxNoAnswer;
  }


  public void setMaxNoAnswer(Object maxNoAnswer) {
    this.maxNoAnswer = maxNoAnswer;
  }


  public Callqueues noAnswerDelayTimeout(Object noAnswerDelayTimeout) {
    
    this.noAnswerDelayTimeout = noAnswerDelayTimeout;
    return this;
  }

   /**
   * Get noAnswerDelayTimeout
   * @return noAnswerDelayTimeout
  **/
  @javax.annotation.Nullable
  public Object getNoAnswerDelayTimeout() {
    return noAnswerDelayTimeout;
  }


  public void setNoAnswerDelayTimeout(Object noAnswerDelayTimeout) {
    this.noAnswerDelayTimeout = noAnswerDelayTimeout;
  }


  public Callqueues rejectTimeout(Object rejectTimeout) {
    
    this.rejectTimeout = rejectTimeout;
    return this;
  }

   /**
   * Get rejectTimeout
   * @return rejectTimeout
  **/
  @javax.annotation.Nullable
  public Object getRejectTimeout() {
    return rejectTimeout;
  }


  public void setRejectTimeout(Object rejectTimeout) {
    this.rejectTimeout = rejectTimeout;
  }


  public Callqueues busyTimeout(Object busyTimeout) {
    
    this.busyTimeout = busyTimeout;
    return this;
  }

   /**
   * Get busyTimeout
   * @return busyTimeout
  **/
  @javax.annotation.Nullable
  public Object getBusyTimeout() {
    return busyTimeout;
  }


  public void setBusyTimeout(Object busyTimeout) {
    this.busyTimeout = busyTimeout;
  }


  public Callqueues wrapUpTimeout(Object wrapUpTimeout) {
    
    this.wrapUpTimeout = wrapUpTimeout;
    return this;
  }

   /**
   * Get wrapUpTimeout
   * @return wrapUpTimeout
  **/
  @javax.annotation.Nullable
  public Object getWrapUpTimeout() {
    return wrapUpTimeout;
  }


  public void setWrapUpTimeout(Object wrapUpTimeout) {
    this.wrapUpTimeout = wrapUpTimeout;
  }


  public Callqueues timeBasedScore(Object timeBasedScore) {
    
    this.timeBasedScore = timeBasedScore;
    return this;
  }

   /**
   * Get timeBasedScore
   * @return timeBasedScore
  **/
  @javax.annotation.Nullable
  public Object getTimeBasedScore() {
    return timeBasedScore;
  }


  public void setTimeBasedScore(Object timeBasedScore) {
    this.timeBasedScore = timeBasedScore;
  }


  public Callqueues tierRulesApply(Object tierRulesApply) {
    
    this.tierRulesApply = tierRulesApply;
    return this;
  }

   /**
   * Get tierRulesApply
   * @return tierRulesApply
  **/
  @javax.annotation.Nullable
  public Object getTierRulesApply() {
    return tierRulesApply;
  }


  public void setTierRulesApply(Object tierRulesApply) {
    this.tierRulesApply = tierRulesApply;
  }


  public Callqueues tierRuleNoAgentNoWait(Object tierRuleNoAgentNoWait) {
    
    this.tierRuleNoAgentNoWait = tierRuleNoAgentNoWait;
    return this;
  }

   /**
   * Get tierRuleNoAgentNoWait
   * @return tierRuleNoAgentNoWait
  **/
  @javax.annotation.Nullable
  public Object getTierRuleNoAgentNoWait() {
    return tierRuleNoAgentNoWait;
  }


  public void setTierRuleNoAgentNoWait(Object tierRuleNoAgentNoWait) {
    this.tierRuleNoAgentNoWait = tierRuleNoAgentNoWait;
  }


  public Callqueues tierRuleWaitSecond(Object tierRuleWaitSecond) {
    
    this.tierRuleWaitSecond = tierRuleWaitSecond;
    return this;
  }

   /**
   * Get tierRuleWaitSecond
   * @return tierRuleWaitSecond
  **/
  @javax.annotation.Nullable
  public Object getTierRuleWaitSecond() {
    return tierRuleWaitSecond;
  }


  public void setTierRuleWaitSecond(Object tierRuleWaitSecond) {
    this.tierRuleWaitSecond = tierRuleWaitSecond;
  }


  public Callqueues tierRuleWaitMultiplyLevel(Object tierRuleWaitMultiplyLevel) {
    
    this.tierRuleWaitMultiplyLevel = tierRuleWaitMultiplyLevel;
    return this;
  }

   /**
   * Get tierRuleWaitMultiplyLevel
   * @return tierRuleWaitMultiplyLevel
  **/
  @javax.annotation.Nullable
  public Object getTierRuleWaitMultiplyLevel() {
    return tierRuleWaitMultiplyLevel;
  }


  public void setTierRuleWaitMultiplyLevel(Object tierRuleWaitMultiplyLevel) {
    this.tierRuleWaitMultiplyLevel = tierRuleWaitMultiplyLevel;
  }


  public Callqueues abandonedResumeAllowed(Object abandonedResumeAllowed) {
    
    this.abandonedResumeAllowed = abandonedResumeAllowed;
    return this;
  }

   /**
   * Get abandonedResumeAllowed
   * @return abandonedResumeAllowed
  **/
  @javax.annotation.Nullable
  public Object getAbandonedResumeAllowed() {
    return abandonedResumeAllowed;
  }


  public void setAbandonedResumeAllowed(Object abandonedResumeAllowed) {
    this.abandonedResumeAllowed = abandonedResumeAllowed;
  }


  public Callqueues discardAbandonedAfter(Object discardAbandonedAfter) {
    
    this.discardAbandonedAfter = discardAbandonedAfter;
    return this;
  }

   /**
   * Get discardAbandonedAfter
   * @return discardAbandonedAfter
  **/
  @javax.annotation.Nullable
  public Object getDiscardAbandonedAfter() {
    return discardAbandonedAfter;
  }


  public void setDiscardAbandonedAfter(Object discardAbandonedAfter) {
    this.discardAbandonedAfter = discardAbandonedAfter;
  }


  public Callqueues maxWaitTimeNoAgentTimeReached(Object maxWaitTimeNoAgentTimeReached) {
    
    this.maxWaitTimeNoAgentTimeReached = maxWaitTimeNoAgentTimeReached;
    return this;
  }

   /**
   * Get maxWaitTimeNoAgentTimeReached
   * @return maxWaitTimeNoAgentTimeReached
  **/
  @javax.annotation.Nullable
  public Object getMaxWaitTimeNoAgentTimeReached() {
    return maxWaitTimeNoAgentTimeReached;
  }


  public void setMaxWaitTimeNoAgentTimeReached(Object maxWaitTimeNoAgentTimeReached) {
    this.maxWaitTimeNoAgentTimeReached = maxWaitTimeNoAgentTimeReached;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Callqueues callqueues = (Callqueues) o;
    return Objects.equals(this.name, callqueues.name) &&
        Objects.equals(this.strategy, callqueues.strategy) &&
        Objects.equals(this.announcePosition, callqueues.announcePosition) &&
        Objects.equals(this.moh, callqueues.moh) &&
        Objects.equals(this.callerResumeTimeout, callqueues.callerResumeTimeout) &&
        Objects.equals(this.maxWaitTime, callqueues.maxWaitTime) &&
        Objects.equals(this.maxWaitTimeNoAgent, callqueues.maxWaitTimeNoAgent) &&
        Objects.equals(this.maxNoAnswer, callqueues.maxNoAnswer) &&
        Objects.equals(this.noAnswerDelayTimeout, callqueues.noAnswerDelayTimeout) &&
        Objects.equals(this.rejectTimeout, callqueues.rejectTimeout) &&
        Objects.equals(this.busyTimeout, callqueues.busyTimeout) &&
        Objects.equals(this.wrapUpTimeout, callqueues.wrapUpTimeout) &&
        Objects.equals(this.timeBasedScore, callqueues.timeBasedScore) &&
        Objects.equals(this.tierRulesApply, callqueues.tierRulesApply) &&
        Objects.equals(this.tierRuleNoAgentNoWait, callqueues.tierRuleNoAgentNoWait) &&
        Objects.equals(this.tierRuleWaitSecond, callqueues.tierRuleWaitSecond) &&
        Objects.equals(this.tierRuleWaitMultiplyLevel, callqueues.tierRuleWaitMultiplyLevel) &&
        Objects.equals(this.abandonedResumeAllowed, callqueues.abandonedResumeAllowed) &&
        Objects.equals(this.discardAbandonedAfter, callqueues.discardAbandonedAfter) &&
        Objects.equals(this.maxWaitTimeNoAgentTimeReached, callqueues.maxWaitTimeNoAgentTimeReached);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, strategy, announcePosition, moh, callerResumeTimeout, maxWaitTime, maxWaitTimeNoAgent, maxNoAnswer, noAnswerDelayTimeout, rejectTimeout, busyTimeout, wrapUpTimeout, timeBasedScore, tierRulesApply, tierRuleNoAgentNoWait, tierRuleWaitSecond, tierRuleWaitMultiplyLevel, abandonedResumeAllowed, discardAbandonedAfter, maxWaitTimeNoAgentTimeReached);
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
    sb.append("class Callqueues {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    announcePosition: ").append(toIndentedString(announcePosition)).append("\n");
    sb.append("    moh: ").append(toIndentedString(moh)).append("\n");
    sb.append("    callerResumeTimeout: ").append(toIndentedString(callerResumeTimeout)).append("\n");
    sb.append("    maxWaitTime: ").append(toIndentedString(maxWaitTime)).append("\n");
    sb.append("    maxWaitTimeNoAgent: ").append(toIndentedString(maxWaitTimeNoAgent)).append("\n");
    sb.append("    maxNoAnswer: ").append(toIndentedString(maxNoAnswer)).append("\n");
    sb.append("    noAnswerDelayTimeout: ").append(toIndentedString(noAnswerDelayTimeout)).append("\n");
    sb.append("    rejectTimeout: ").append(toIndentedString(rejectTimeout)).append("\n");
    sb.append("    busyTimeout: ").append(toIndentedString(busyTimeout)).append("\n");
    sb.append("    wrapUpTimeout: ").append(toIndentedString(wrapUpTimeout)).append("\n");
    sb.append("    timeBasedScore: ").append(toIndentedString(timeBasedScore)).append("\n");
    sb.append("    tierRulesApply: ").append(toIndentedString(tierRulesApply)).append("\n");
    sb.append("    tierRuleNoAgentNoWait: ").append(toIndentedString(tierRuleNoAgentNoWait)).append("\n");
    sb.append("    tierRuleWaitSecond: ").append(toIndentedString(tierRuleWaitSecond)).append("\n");
    sb.append("    tierRuleWaitMultiplyLevel: ").append(toIndentedString(tierRuleWaitMultiplyLevel)).append("\n");
    sb.append("    abandonedResumeAllowed: ").append(toIndentedString(abandonedResumeAllowed)).append("\n");
    sb.append("    discardAbandonedAfter: ").append(toIndentedString(discardAbandonedAfter)).append("\n");
    sb.append("    maxWaitTimeNoAgentTimeReached: ").append(toIndentedString(maxWaitTimeNoAgentTimeReached)).append("\n");
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
    openapiFields.add("strategy");
    openapiFields.add("announcePosition");
    openapiFields.add("moh");
    openapiFields.add("callerResumeTimeout");
    openapiFields.add("maxWaitTime");
    openapiFields.add("maxWaitTimeNoAgent");
    openapiFields.add("maxNoAnswer");
    openapiFields.add("noAnswerDelayTimeout");
    openapiFields.add("rejectTimeout");
    openapiFields.add("busyTimeout");
    openapiFields.add("wrapUpTimeout");
    openapiFields.add("timeBasedScore");
    openapiFields.add("tierRulesApply");
    openapiFields.add("tierRuleNoAgentNoWait");
    openapiFields.add("tierRuleWaitSecond");
    openapiFields.add("tierRuleWaitMultiplyLevel");
    openapiFields.add("abandonedResumeAllowed");
    openapiFields.add("discardAbandonedAfter");
    openapiFields.add("maxWaitTimeNoAgentTimeReached");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("strategy");
    openapiRequiredFields.add("moh");
    openapiRequiredFields.add("callerResumeTimeout");
    openapiRequiredFields.add("maxWaitTime");
    openapiRequiredFields.add("maxWaitTimeNoAgent");
    openapiRequiredFields.add("maxNoAnswer");
    openapiRequiredFields.add("timeBasedScore");
    openapiRequiredFields.add("tierRulesApply");
    openapiRequiredFields.add("tierRuleNoAgentNoWait");
    openapiRequiredFields.add("tierRuleWaitMultiplyLevel");
    openapiRequiredFields.add("abandonedResumeAllowed");
    openapiRequiredFields.add("maxWaitTimeNoAgentTimeReached");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Callqueues
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Callqueues.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Callqueues is not found in the empty JSON string", Callqueues.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Callqueues.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Callqueues` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Callqueues.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Callqueues.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Callqueues' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Callqueues> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Callqueues.class));

       return (TypeAdapter<T>) new TypeAdapter<Callqueues>() {
           @Override
           public void write(JsonWriter out, Callqueues value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Callqueues read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Callqueues given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Callqueues
  * @throws IOException if the JSON string is invalid with respect to Callqueues
  */
  public static Callqueues fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Callqueues.class);
  }

 /**
  * Convert an instance of Callqueues to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

