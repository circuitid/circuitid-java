/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.20
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
 * CallqueuesCreateOrPatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-31T20:43:40.997Z[UTC]")
public class CallqueuesCreateOrPatch {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets strategy
   */
  @JsonAdapter(StrategyEnum.Adapter.class)
  public enum StrategyEnum {
    RING_ALL("ring-all"),
    
    LONGEST_IDLE_AGENT("longest-idle-agent"),
    
    ROUND_ROBIN("round-robin"),
    
    TOP_DOWN("top-down"),
    
    AGENT_WITH_LEAST_TALK_TIME("agent-with-least-talk-time"),
    
    AGENT_WITH_FEWEST_CALLS("agent-with-fewest-calls"),
    
    SEQUENTIALLY_BY_AGENT_ORDER("sequentially-by-agent-order"),
    
    RANDOM("random");

    private String value;

    StrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StrategyEnum fromValue(String value) {
      for (StrategyEnum b : StrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private StrategyEnum strategy;

  public static final String SERIALIZED_NAME_ANNOUNCE_POSITION = "announcePosition";
  @SerializedName(SERIALIZED_NAME_ANNOUNCE_POSITION)
  private Integer announcePosition;

  public static final String SERIALIZED_NAME_MOH = "moh";
  @SerializedName(SERIALIZED_NAME_MOH)
  private String moh = "deafult";

  public static final String SERIALIZED_NAME_CALLER_RESUME_TIMEOUT = "callerResumeTimeout";
  @SerializedName(SERIALIZED_NAME_CALLER_RESUME_TIMEOUT)
  private Integer callerResumeTimeout = 3600;

  public static final String SERIALIZED_NAME_MAX_WAIT_TIME = "maxWaitTime";
  @SerializedName(SERIALIZED_NAME_MAX_WAIT_TIME)
  private Integer maxWaitTime = 300;

  public static final String SERIALIZED_NAME_MAX_WAIT_TIME_NO_AGENT = "maxWaitTimeNoAgent";
  @SerializedName(SERIALIZED_NAME_MAX_WAIT_TIME_NO_AGENT)
  private Integer maxWaitTimeNoAgent = 300;

  public static final String SERIALIZED_NAME_MAX_NO_ANSWER = "maxNoAnswer";
  @SerializedName(SERIALIZED_NAME_MAX_NO_ANSWER)
  private Integer maxNoAnswer = 1000000;

  public static final String SERIALIZED_NAME_NO_ANSWER_DELAY_TIMEOUT = "noAnswerDelayTimeout";
  @SerializedName(SERIALIZED_NAME_NO_ANSWER_DELAY_TIMEOUT)
  private Integer noAnswerDelayTimeout = 60;

  public static final String SERIALIZED_NAME_REJECT_TIMEOUT = "rejectTimeout";
  @SerializedName(SERIALIZED_NAME_REJECT_TIMEOUT)
  private Integer rejectTimeout = 60;

  public static final String SERIALIZED_NAME_BUSY_TIMEOUT = "busyTimeout";
  @SerializedName(SERIALIZED_NAME_BUSY_TIMEOUT)
  private Integer busyTimeout = 60;

  public static final String SERIALIZED_NAME_WRAP_UP_TIMEOUT = "wrapUpTimeout";
  @SerializedName(SERIALIZED_NAME_WRAP_UP_TIMEOUT)
  private Integer wrapUpTimeout = 10;

  /**
   * Gets or Sets timeBasedScore
   */
  @JsonAdapter(TimeBasedScoreEnum.Adapter.class)
  public enum TimeBasedScoreEnum {
    QUEUE("queue"),
    
    SYSTEM("system");

    private String value;

    TimeBasedScoreEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeBasedScoreEnum fromValue(String value) {
      for (TimeBasedScoreEnum b : TimeBasedScoreEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimeBasedScoreEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeBasedScoreEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeBasedScoreEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TimeBasedScoreEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TIME_BASED_SCORE = "timeBasedScore";
  @SerializedName(SERIALIZED_NAME_TIME_BASED_SCORE)
  private TimeBasedScoreEnum timeBasedScore = TimeBasedScoreEnum.QUEUE;

  public static final String SERIALIZED_NAME_TIER_RULES_APPLY = "tierRulesApply";
  @SerializedName(SERIALIZED_NAME_TIER_RULES_APPLY)
  private Boolean tierRulesApply = false;

  public static final String SERIALIZED_NAME_TIER_RULE_NO_AGENT_NO_WAIT = "tierRuleNoAgentNoWait";
  @SerializedName(SERIALIZED_NAME_TIER_RULE_NO_AGENT_NO_WAIT)
  private Boolean tierRuleNoAgentNoWait = true;

  public static final String SERIALIZED_NAME_TIER_RULE_WAIT_SECOND = "tierRuleWaitSecond";
  @SerializedName(SERIALIZED_NAME_TIER_RULE_WAIT_SECOND)
  private Integer tierRuleWaitSecond = 300;

  public static final String SERIALIZED_NAME_TIER_RULE_WAIT_MULTIPLY_LEVEL = "tierRuleWaitMultiplyLevel";
  @SerializedName(SERIALIZED_NAME_TIER_RULE_WAIT_MULTIPLY_LEVEL)
  private Boolean tierRuleWaitMultiplyLevel = true;

  public static final String SERIALIZED_NAME_ABANDONED_RESUME_ALLOWED = "abandonedResumeAllowed";
  @SerializedName(SERIALIZED_NAME_ABANDONED_RESUME_ALLOWED)
  private Boolean abandonedResumeAllowed = true;

  public static final String SERIALIZED_NAME_DISCARD_ABANDONED_AFTER = "discardAbandonedAfter";
  @SerializedName(SERIALIZED_NAME_DISCARD_ABANDONED_AFTER)
  private Integer discardAbandonedAfter = 14400;

  public static final String SERIALIZED_NAME_MAX_WAIT_TIME_NO_AGENT_TIME_REACHED = "maxWaitTimeNoAgentTimeReached";
  @SerializedName(SERIALIZED_NAME_MAX_WAIT_TIME_NO_AGENT_TIME_REACHED)
  private Integer maxWaitTimeNoAgentTimeReached = 5;

  public CallqueuesCreateOrPatch() {
  }

  public CallqueuesCreateOrPatch name(String name) {
    
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


  public CallqueuesCreateOrPatch strategy(StrategyEnum strategy) {
    
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @javax.annotation.Nonnull
  public StrategyEnum getStrategy() {
    return strategy;
  }


  public void setStrategy(StrategyEnum strategy) {
    this.strategy = strategy;
  }


  public CallqueuesCreateOrPatch announcePosition(Integer announcePosition) {
    
    this.announcePosition = announcePosition;
    return this;
  }

   /**
   * Get announcePosition
   * @return announcePosition
  **/
  @javax.annotation.Nullable
  public Integer getAnnouncePosition() {
    return announcePosition;
  }


  public void setAnnouncePosition(Integer announcePosition) {
    this.announcePosition = announcePosition;
  }


  public CallqueuesCreateOrPatch moh(String moh) {
    
    this.moh = moh;
    return this;
  }

   /**
   * Get moh
   * @return moh
  **/
  @javax.annotation.Nonnull
  public String getMoh() {
    return moh;
  }


  public void setMoh(String moh) {
    this.moh = moh;
  }


  public CallqueuesCreateOrPatch callerResumeTimeout(Integer callerResumeTimeout) {
    
    this.callerResumeTimeout = callerResumeTimeout;
    return this;
  }

   /**
   * Get callerResumeTimeout
   * @return callerResumeTimeout
  **/
  @javax.annotation.Nonnull
  public Integer getCallerResumeTimeout() {
    return callerResumeTimeout;
  }


  public void setCallerResumeTimeout(Integer callerResumeTimeout) {
    this.callerResumeTimeout = callerResumeTimeout;
  }


  public CallqueuesCreateOrPatch maxWaitTime(Integer maxWaitTime) {
    
    this.maxWaitTime = maxWaitTime;
    return this;
  }

   /**
   * Get maxWaitTime
   * @return maxWaitTime
  **/
  @javax.annotation.Nonnull
  public Integer getMaxWaitTime() {
    return maxWaitTime;
  }


  public void setMaxWaitTime(Integer maxWaitTime) {
    this.maxWaitTime = maxWaitTime;
  }


  public CallqueuesCreateOrPatch maxWaitTimeNoAgent(Integer maxWaitTimeNoAgent) {
    
    this.maxWaitTimeNoAgent = maxWaitTimeNoAgent;
    return this;
  }

   /**
   * Get maxWaitTimeNoAgent
   * @return maxWaitTimeNoAgent
  **/
  @javax.annotation.Nonnull
  public Integer getMaxWaitTimeNoAgent() {
    return maxWaitTimeNoAgent;
  }


  public void setMaxWaitTimeNoAgent(Integer maxWaitTimeNoAgent) {
    this.maxWaitTimeNoAgent = maxWaitTimeNoAgent;
  }


  public CallqueuesCreateOrPatch maxNoAnswer(Integer maxNoAnswer) {
    
    this.maxNoAnswer = maxNoAnswer;
    return this;
  }

   /**
   * Get maxNoAnswer
   * @return maxNoAnswer
  **/
  @javax.annotation.Nonnull
  public Integer getMaxNoAnswer() {
    return maxNoAnswer;
  }


  public void setMaxNoAnswer(Integer maxNoAnswer) {
    this.maxNoAnswer = maxNoAnswer;
  }


  public CallqueuesCreateOrPatch noAnswerDelayTimeout(Integer noAnswerDelayTimeout) {
    
    this.noAnswerDelayTimeout = noAnswerDelayTimeout;
    return this;
  }

   /**
   * Get noAnswerDelayTimeout
   * @return noAnswerDelayTimeout
  **/
  @javax.annotation.Nullable
  public Integer getNoAnswerDelayTimeout() {
    return noAnswerDelayTimeout;
  }


  public void setNoAnswerDelayTimeout(Integer noAnswerDelayTimeout) {
    this.noAnswerDelayTimeout = noAnswerDelayTimeout;
  }


  public CallqueuesCreateOrPatch rejectTimeout(Integer rejectTimeout) {
    
    this.rejectTimeout = rejectTimeout;
    return this;
  }

   /**
   * Get rejectTimeout
   * @return rejectTimeout
  **/
  @javax.annotation.Nullable
  public Integer getRejectTimeout() {
    return rejectTimeout;
  }


  public void setRejectTimeout(Integer rejectTimeout) {
    this.rejectTimeout = rejectTimeout;
  }


  public CallqueuesCreateOrPatch busyTimeout(Integer busyTimeout) {
    
    this.busyTimeout = busyTimeout;
    return this;
  }

   /**
   * Get busyTimeout
   * @return busyTimeout
  **/
  @javax.annotation.Nullable
  public Integer getBusyTimeout() {
    return busyTimeout;
  }


  public void setBusyTimeout(Integer busyTimeout) {
    this.busyTimeout = busyTimeout;
  }


  public CallqueuesCreateOrPatch wrapUpTimeout(Integer wrapUpTimeout) {
    
    this.wrapUpTimeout = wrapUpTimeout;
    return this;
  }

   /**
   * Get wrapUpTimeout
   * @return wrapUpTimeout
  **/
  @javax.annotation.Nullable
  public Integer getWrapUpTimeout() {
    return wrapUpTimeout;
  }


  public void setWrapUpTimeout(Integer wrapUpTimeout) {
    this.wrapUpTimeout = wrapUpTimeout;
  }


  public CallqueuesCreateOrPatch timeBasedScore(TimeBasedScoreEnum timeBasedScore) {
    
    this.timeBasedScore = timeBasedScore;
    return this;
  }

   /**
   * Get timeBasedScore
   * @return timeBasedScore
  **/
  @javax.annotation.Nonnull
  public TimeBasedScoreEnum getTimeBasedScore() {
    return timeBasedScore;
  }


  public void setTimeBasedScore(TimeBasedScoreEnum timeBasedScore) {
    this.timeBasedScore = timeBasedScore;
  }


  public CallqueuesCreateOrPatch tierRulesApply(Boolean tierRulesApply) {
    
    this.tierRulesApply = tierRulesApply;
    return this;
  }

   /**
   * Get tierRulesApply
   * @return tierRulesApply
  **/
  @javax.annotation.Nonnull
  public Boolean getTierRulesApply() {
    return tierRulesApply;
  }


  public void setTierRulesApply(Boolean tierRulesApply) {
    this.tierRulesApply = tierRulesApply;
  }


  public CallqueuesCreateOrPatch tierRuleNoAgentNoWait(Boolean tierRuleNoAgentNoWait) {
    
    this.tierRuleNoAgentNoWait = tierRuleNoAgentNoWait;
    return this;
  }

   /**
   * Get tierRuleNoAgentNoWait
   * @return tierRuleNoAgentNoWait
  **/
  @javax.annotation.Nonnull
  public Boolean getTierRuleNoAgentNoWait() {
    return tierRuleNoAgentNoWait;
  }


  public void setTierRuleNoAgentNoWait(Boolean tierRuleNoAgentNoWait) {
    this.tierRuleNoAgentNoWait = tierRuleNoAgentNoWait;
  }


  public CallqueuesCreateOrPatch tierRuleWaitSecond(Integer tierRuleWaitSecond) {
    
    this.tierRuleWaitSecond = tierRuleWaitSecond;
    return this;
  }

   /**
   * Get tierRuleWaitSecond
   * @return tierRuleWaitSecond
  **/
  @javax.annotation.Nullable
  public Integer getTierRuleWaitSecond() {
    return tierRuleWaitSecond;
  }


  public void setTierRuleWaitSecond(Integer tierRuleWaitSecond) {
    this.tierRuleWaitSecond = tierRuleWaitSecond;
  }


  public CallqueuesCreateOrPatch tierRuleWaitMultiplyLevel(Boolean tierRuleWaitMultiplyLevel) {
    
    this.tierRuleWaitMultiplyLevel = tierRuleWaitMultiplyLevel;
    return this;
  }

   /**
   * Get tierRuleWaitMultiplyLevel
   * @return tierRuleWaitMultiplyLevel
  **/
  @javax.annotation.Nonnull
  public Boolean getTierRuleWaitMultiplyLevel() {
    return tierRuleWaitMultiplyLevel;
  }


  public void setTierRuleWaitMultiplyLevel(Boolean tierRuleWaitMultiplyLevel) {
    this.tierRuleWaitMultiplyLevel = tierRuleWaitMultiplyLevel;
  }


  public CallqueuesCreateOrPatch abandonedResumeAllowed(Boolean abandonedResumeAllowed) {
    
    this.abandonedResumeAllowed = abandonedResumeAllowed;
    return this;
  }

   /**
   * Get abandonedResumeAllowed
   * @return abandonedResumeAllowed
  **/
  @javax.annotation.Nonnull
  public Boolean getAbandonedResumeAllowed() {
    return abandonedResumeAllowed;
  }


  public void setAbandonedResumeAllowed(Boolean abandonedResumeAllowed) {
    this.abandonedResumeAllowed = abandonedResumeAllowed;
  }


  public CallqueuesCreateOrPatch discardAbandonedAfter(Integer discardAbandonedAfter) {
    
    this.discardAbandonedAfter = discardAbandonedAfter;
    return this;
  }

   /**
   * Get discardAbandonedAfter
   * @return discardAbandonedAfter
  **/
  @javax.annotation.Nullable
  public Integer getDiscardAbandonedAfter() {
    return discardAbandonedAfter;
  }


  public void setDiscardAbandonedAfter(Integer discardAbandonedAfter) {
    this.discardAbandonedAfter = discardAbandonedAfter;
  }


  public CallqueuesCreateOrPatch maxWaitTimeNoAgentTimeReached(Integer maxWaitTimeNoAgentTimeReached) {
    
    this.maxWaitTimeNoAgentTimeReached = maxWaitTimeNoAgentTimeReached;
    return this;
  }

   /**
   * Get maxWaitTimeNoAgentTimeReached
   * @return maxWaitTimeNoAgentTimeReached
  **/
  @javax.annotation.Nonnull
  public Integer getMaxWaitTimeNoAgentTimeReached() {
    return maxWaitTimeNoAgentTimeReached;
  }


  public void setMaxWaitTimeNoAgentTimeReached(Integer maxWaitTimeNoAgentTimeReached) {
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
    CallqueuesCreateOrPatch callqueuesCreateOrPatch = (CallqueuesCreateOrPatch) o;
    return Objects.equals(this.name, callqueuesCreateOrPatch.name) &&
        Objects.equals(this.strategy, callqueuesCreateOrPatch.strategy) &&
        Objects.equals(this.announcePosition, callqueuesCreateOrPatch.announcePosition) &&
        Objects.equals(this.moh, callqueuesCreateOrPatch.moh) &&
        Objects.equals(this.callerResumeTimeout, callqueuesCreateOrPatch.callerResumeTimeout) &&
        Objects.equals(this.maxWaitTime, callqueuesCreateOrPatch.maxWaitTime) &&
        Objects.equals(this.maxWaitTimeNoAgent, callqueuesCreateOrPatch.maxWaitTimeNoAgent) &&
        Objects.equals(this.maxNoAnswer, callqueuesCreateOrPatch.maxNoAnswer) &&
        Objects.equals(this.noAnswerDelayTimeout, callqueuesCreateOrPatch.noAnswerDelayTimeout) &&
        Objects.equals(this.rejectTimeout, callqueuesCreateOrPatch.rejectTimeout) &&
        Objects.equals(this.busyTimeout, callqueuesCreateOrPatch.busyTimeout) &&
        Objects.equals(this.wrapUpTimeout, callqueuesCreateOrPatch.wrapUpTimeout) &&
        Objects.equals(this.timeBasedScore, callqueuesCreateOrPatch.timeBasedScore) &&
        Objects.equals(this.tierRulesApply, callqueuesCreateOrPatch.tierRulesApply) &&
        Objects.equals(this.tierRuleNoAgentNoWait, callqueuesCreateOrPatch.tierRuleNoAgentNoWait) &&
        Objects.equals(this.tierRuleWaitSecond, callqueuesCreateOrPatch.tierRuleWaitSecond) &&
        Objects.equals(this.tierRuleWaitMultiplyLevel, callqueuesCreateOrPatch.tierRuleWaitMultiplyLevel) &&
        Objects.equals(this.abandonedResumeAllowed, callqueuesCreateOrPatch.abandonedResumeAllowed) &&
        Objects.equals(this.discardAbandonedAfter, callqueuesCreateOrPatch.discardAbandonedAfter) &&
        Objects.equals(this.maxWaitTimeNoAgentTimeReached, callqueuesCreateOrPatch.maxWaitTimeNoAgentTimeReached);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, strategy, announcePosition, moh, callerResumeTimeout, maxWaitTime, maxWaitTimeNoAgent, maxNoAnswer, noAnswerDelayTimeout, rejectTimeout, busyTimeout, wrapUpTimeout, timeBasedScore, tierRulesApply, tierRuleNoAgentNoWait, tierRuleWaitSecond, tierRuleWaitMultiplyLevel, abandonedResumeAllowed, discardAbandonedAfter, maxWaitTimeNoAgentTimeReached);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallqueuesCreateOrPatch {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to CallqueuesCreateOrPatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CallqueuesCreateOrPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallqueuesCreateOrPatch is not found in the empty JSON string", CallqueuesCreateOrPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CallqueuesCreateOrPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CallqueuesCreateOrPatch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CallqueuesCreateOrPatch.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("strategy").toString()));
      }
      if (!jsonObj.get("moh").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moh` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moh").toString()));
      }
      if (!jsonObj.get("timeBasedScore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeBasedScore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeBasedScore").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallqueuesCreateOrPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallqueuesCreateOrPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallqueuesCreateOrPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallqueuesCreateOrPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<CallqueuesCreateOrPatch>() {
           @Override
           public void write(JsonWriter out, CallqueuesCreateOrPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallqueuesCreateOrPatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CallqueuesCreateOrPatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallqueuesCreateOrPatch
  * @throws IOException if the JSON string is invalid with respect to CallqueuesCreateOrPatch
  */
  public static CallqueuesCreateOrPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallqueuesCreateOrPatch.class);
  }

 /**
  * Convert an instance of CallqueuesCreateOrPatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

