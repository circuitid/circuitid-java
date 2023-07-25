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
 * Users
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-25T10:43:34.034Z[UTC]")
public class Users {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private Object email = null;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private Object password = null;

  public static final String SERIALIZED_NAME_SIP_PASSWORD = "sipPassword";
  @SerializedName(SERIALIZED_NAME_SIP_PASSWORD)
  private Object sipPassword = null;

  public static final String SERIALIZED_NAME_TURN_PASSWORD = "turnPassword";
  @SerializedName(SERIALIZED_NAME_TURN_PASSWORD)
  private Object turnPassword = null;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private Object first = null;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private Object last = null;

  public static final String SERIALIZED_NAME_MOBILE_PHONE = "mobilePhone";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE)
  private Object mobilePhone = null;

  public static final String SERIALIZED_NAME_BUSINESS_PHONE = "businessPhone";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PHONE)
  private Object businessPhone = null;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private Object extension = null;

  public static final String SERIALIZED_NAME_CUSTOM_CALLER_ID = "customCallerId";
  @SerializedName(SERIALIZED_NAME_CUSTOM_CALLER_ID)
  private Object customCallerId = null;

  public static final String SERIALIZED_NAME_JOB_TITLE = "jobTitle";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private Object jobTitle = null;

  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private Object department = null;

  public static final String SERIALIZED_NAME_OFFICE = "office";
  @SerializedName(SERIALIZED_NAME_OFFICE)
  private Object office = null;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private Object avatar = null;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private Object language = en;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "isPrimary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Object isPrimary = 0;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Object status = active;

  public static final String SERIALIZED_NAME_VM_GREETING_TYPE = "vmGreetingType";
  @SerializedName(SERIALIZED_NAME_VM_GREETING_TYPE)
  private Object vmGreetingType = default;

  public static final String SERIALIZED_NAME_VM_TIMEOUT = "vmTimeout";
  @SerializedName(SERIALIZED_NAME_VM_TIMEOUT)
  private Object vmTimeout = 20;

  public static final String SERIALIZED_NAME_VM_FILE = "vmFile";
  @SerializedName(SERIALIZED_NAME_VM_FILE)
  private Object vmFile = null;

  public static final String SERIALIZED_NAME_VM_PLAYBACK_NUMBER = "vmPlaybackNumber";
  @SerializedName(SERIALIZED_NAME_VM_PLAYBACK_NUMBER)
  private Object vmPlaybackNumber = null;

  public static final String SERIALIZED_NAME_PIN = "pin";
  @SerializedName(SERIALIZED_NAME_PIN)
  private Object pin = 1234;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Object number = null;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private Object region = null;

  public static final String SERIALIZED_NAME_CALLER_ID_NUMBER = "callerIdNumber";
  @SerializedName(SERIALIZED_NAME_CALLER_ID_NUMBER)
  private Object callerIdNumber = null;

  public static final String SERIALIZED_NAME_ADMIN_PERMISSION = "adminPermission";
  @SerializedName(SERIALIZED_NAME_ADMIN_PERMISSION)
  private Object adminPermission = null;

  public static final String SERIALIZED_NAME_BILLING_PERMISSION = "billingPermission";
  @SerializedName(SERIALIZED_NAME_BILLING_PERMISSION)
  private Object billingPermission = null;

  public static final String SERIALIZED_NAME_PHONE_PERMISSION = "phonePermission";
  @SerializedName(SERIALIZED_NAME_PHONE_PERMISSION)
  private Object phonePermission = null;

  public static final String SERIALIZED_NAME_AGILE_PERMISSION = "agilePermission";
  @SerializedName(SERIALIZED_NAME_AGILE_PERMISSION)
  private Object agilePermission = null;

  public static final String SERIALIZED_NAME_JOB_SERVER_PERMISSION = "jobServerPermission";
  @SerializedName(SERIALIZED_NAME_JOB_SERVER_PERMISSION)
  private Object jobServerPermission = null;

  public static final String SERIALIZED_NAME_MEDIA_SERVER_PERMISSION = "mediaServerPermission";
  @SerializedName(SERIALIZED_NAME_MEDIA_SERVER_PERMISSION)
  private Object mediaServerPermission = null;

  public static final String SERIALIZED_NAME_MAIL_SERVER_PERMISSION = "mailServerPermission";
  @SerializedName(SERIALIZED_NAME_MAIL_SERVER_PERMISSION)
  private Object mailServerPermission = null;

  public static final String SERIALIZED_NAME_SUPER_ADMIN_PERMISSION = "superAdminPermission";
  @SerializedName(SERIALIZED_NAME_SUPER_ADMIN_PERMISSION)
  private Object superAdminPermission = null;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private Object timezone = America/New_York;

  public static final String SERIALIZED_NAME_VM_TRANSCRIPTION = "vmTranscription";
  @SerializedName(SERIALIZED_NAME_VM_TRANSCRIPTION)
  private Object vmTranscription = 0;

  public static final String SERIALIZED_NAME_COMMUNICATION = "communication";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION)
  private Object communication = {notifications={email=true, sms=true}, missedCalls={email=true, sms=true}, callRecordings={email=true, sms=true}, newsletters={email=true, sms=true}, voicemails={email=true, sms=true}, web={sounds=true}};

  public Users() {
  }

  public Users email(Object email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public Object getEmail() {
    return email;
  }


  public void setEmail(Object email) {
    this.email = email;
  }


  public Users password(Object password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  public Object getPassword() {
    return password;
  }


  public void setPassword(Object password) {
    this.password = password;
  }


  public Users sipPassword(Object sipPassword) {
    
    this.sipPassword = sipPassword;
    return this;
  }

   /**
   * Get sipPassword
   * @return sipPassword
  **/
  @javax.annotation.Nullable
  public Object getSipPassword() {
    return sipPassword;
  }


  public void setSipPassword(Object sipPassword) {
    this.sipPassword = sipPassword;
  }


  public Users turnPassword(Object turnPassword) {
    
    this.turnPassword = turnPassword;
    return this;
  }

   /**
   * Get turnPassword
   * @return turnPassword
  **/
  @javax.annotation.Nullable
  public Object getTurnPassword() {
    return turnPassword;
  }


  public void setTurnPassword(Object turnPassword) {
    this.turnPassword = turnPassword;
  }


  public Users first(Object first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nullable
  public Object getFirst() {
    return first;
  }


  public void setFirst(Object first) {
    this.first = first;
  }


  public Users last(Object last) {
    
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @javax.annotation.Nullable
  public Object getLast() {
    return last;
  }


  public void setLast(Object last) {
    this.last = last;
  }


  public Users mobilePhone(Object mobilePhone) {
    
    this.mobilePhone = mobilePhone;
    return this;
  }

   /**
   * Get mobilePhone
   * @return mobilePhone
  **/
  @javax.annotation.Nullable
  public Object getMobilePhone() {
    return mobilePhone;
  }


  public void setMobilePhone(Object mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  public Users businessPhone(Object businessPhone) {
    
    this.businessPhone = businessPhone;
    return this;
  }

   /**
   * Get businessPhone
   * @return businessPhone
  **/
  @javax.annotation.Nullable
  public Object getBusinessPhone() {
    return businessPhone;
  }


  public void setBusinessPhone(Object businessPhone) {
    this.businessPhone = businessPhone;
  }


  public Users extension(Object extension) {
    
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @javax.annotation.Nullable
  public Object getExtension() {
    return extension;
  }


  public void setExtension(Object extension) {
    this.extension = extension;
  }


  public Users customCallerId(Object customCallerId) {
    
    this.customCallerId = customCallerId;
    return this;
  }

   /**
   * Get customCallerId
   * @return customCallerId
  **/
  @javax.annotation.Nullable
  public Object getCustomCallerId() {
    return customCallerId;
  }


  public void setCustomCallerId(Object customCallerId) {
    this.customCallerId = customCallerId;
  }


  public Users jobTitle(Object jobTitle) {
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  public Object getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(Object jobTitle) {
    this.jobTitle = jobTitle;
  }


  public Users department(Object department) {
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nullable
  public Object getDepartment() {
    return department;
  }


  public void setDepartment(Object department) {
    this.department = department;
  }


  public Users office(Object office) {
    
    this.office = office;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return office
  **/
  @javax.annotation.Nullable
  public Object getOffice() {
    return office;
  }


  public void setOffice(Object office) {
    this.office = office;
  }


  public Users avatar(Object avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @javax.annotation.Nullable
  public Object getAvatar() {
    return avatar;
  }


  public void setAvatar(Object avatar) {
    this.avatar = avatar;
  }


  public Users language(Object language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  public Object getLanguage() {
    return language;
  }


  public void setLanguage(Object language) {
    this.language = language;
  }


  public Users isPrimary(Object isPrimary) {
    
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Get isPrimary
   * @return isPrimary
  **/
  @javax.annotation.Nullable
  public Object getIsPrimary() {
    return isPrimary;
  }


  public void setIsPrimary(Object isPrimary) {
    this.isPrimary = isPrimary;
  }


  public Users status(Object status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Object getStatus() {
    return status;
  }


  public void setStatus(Object status) {
    this.status = status;
  }


  public Users vmGreetingType(Object vmGreetingType) {
    
    this.vmGreetingType = vmGreetingType;
    return this;
  }

   /**
   * Get vmGreetingType
   * @return vmGreetingType
  **/
  @javax.annotation.Nullable
  public Object getVmGreetingType() {
    return vmGreetingType;
  }


  public void setVmGreetingType(Object vmGreetingType) {
    this.vmGreetingType = vmGreetingType;
  }


  public Users vmTimeout(Object vmTimeout) {
    
    this.vmTimeout = vmTimeout;
    return this;
  }

   /**
   * Get vmTimeout
   * @return vmTimeout
  **/
  @javax.annotation.Nullable
  public Object getVmTimeout() {
    return vmTimeout;
  }


  public void setVmTimeout(Object vmTimeout) {
    this.vmTimeout = vmTimeout;
  }


  public Users vmFile(Object vmFile) {
    
    this.vmFile = vmFile;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return vmFile
  **/
  @javax.annotation.Nullable
  public Object getVmFile() {
    return vmFile;
  }


  public void setVmFile(Object vmFile) {
    this.vmFile = vmFile;
  }


  public Users vmPlaybackNumber(Object vmPlaybackNumber) {
    
    this.vmPlaybackNumber = vmPlaybackNumber;
    return this;
  }

   /**
   * Get vmPlaybackNumber
   * @return vmPlaybackNumber
  **/
  @javax.annotation.Nullable
  public Object getVmPlaybackNumber() {
    return vmPlaybackNumber;
  }


  public void setVmPlaybackNumber(Object vmPlaybackNumber) {
    this.vmPlaybackNumber = vmPlaybackNumber;
  }


  public Users pin(Object pin) {
    
    this.pin = pin;
    return this;
  }

   /**
   * Get pin
   * @return pin
  **/
  @javax.annotation.Nullable
  public Object getPin() {
    return pin;
  }


  public void setPin(Object pin) {
    this.pin = pin;
  }


  public Users number(Object number) {
    
    this.number = number;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return number
  **/
  @javax.annotation.Nullable
  public Object getNumber() {
    return number;
  }


  public void setNumber(Object number) {
    this.number = number;
  }


  public Users region(Object region) {
    
    this.region = region;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return region
  **/
  @javax.annotation.Nullable
  public Object getRegion() {
    return region;
  }


  public void setRegion(Object region) {
    this.region = region;
  }


  public Users callerIdNumber(Object callerIdNumber) {
    
    this.callerIdNumber = callerIdNumber;
    return this;
  }

   /**
   * Get callerIdNumber
   * @return callerIdNumber
  **/
  @javax.annotation.Nullable
  public Object getCallerIdNumber() {
    return callerIdNumber;
  }


  public void setCallerIdNumber(Object callerIdNumber) {
    this.callerIdNumber = callerIdNumber;
  }


  public Users adminPermission(Object adminPermission) {
    
    this.adminPermission = adminPermission;
    return this;
  }

   /**
   * Get adminPermission
   * @return adminPermission
  **/
  @javax.annotation.Nullable
  public Object getAdminPermission() {
    return adminPermission;
  }


  public void setAdminPermission(Object adminPermission) {
    this.adminPermission = adminPermission;
  }


  public Users billingPermission(Object billingPermission) {
    
    this.billingPermission = billingPermission;
    return this;
  }

   /**
   * Get billingPermission
   * @return billingPermission
  **/
  @javax.annotation.Nullable
  public Object getBillingPermission() {
    return billingPermission;
  }


  public void setBillingPermission(Object billingPermission) {
    this.billingPermission = billingPermission;
  }


  public Users phonePermission(Object phonePermission) {
    
    this.phonePermission = phonePermission;
    return this;
  }

   /**
   * Get phonePermission
   * @return phonePermission
  **/
  @javax.annotation.Nullable
  public Object getPhonePermission() {
    return phonePermission;
  }


  public void setPhonePermission(Object phonePermission) {
    this.phonePermission = phonePermission;
  }


  public Users agilePermission(Object agilePermission) {
    
    this.agilePermission = agilePermission;
    return this;
  }

   /**
   * Get agilePermission
   * @return agilePermission
  **/
  @javax.annotation.Nullable
  public Object getAgilePermission() {
    return agilePermission;
  }


  public void setAgilePermission(Object agilePermission) {
    this.agilePermission = agilePermission;
  }


  public Users jobServerPermission(Object jobServerPermission) {
    
    this.jobServerPermission = jobServerPermission;
    return this;
  }

   /**
   * Get jobServerPermission
   * @return jobServerPermission
  **/
  @javax.annotation.Nullable
  public Object getJobServerPermission() {
    return jobServerPermission;
  }


  public void setJobServerPermission(Object jobServerPermission) {
    this.jobServerPermission = jobServerPermission;
  }


  public Users mediaServerPermission(Object mediaServerPermission) {
    
    this.mediaServerPermission = mediaServerPermission;
    return this;
  }

   /**
   * Get mediaServerPermission
   * @return mediaServerPermission
  **/
  @javax.annotation.Nullable
  public Object getMediaServerPermission() {
    return mediaServerPermission;
  }


  public void setMediaServerPermission(Object mediaServerPermission) {
    this.mediaServerPermission = mediaServerPermission;
  }


  public Users mailServerPermission(Object mailServerPermission) {
    
    this.mailServerPermission = mailServerPermission;
    return this;
  }

   /**
   * Get mailServerPermission
   * @return mailServerPermission
  **/
  @javax.annotation.Nullable
  public Object getMailServerPermission() {
    return mailServerPermission;
  }


  public void setMailServerPermission(Object mailServerPermission) {
    this.mailServerPermission = mailServerPermission;
  }


  public Users superAdminPermission(Object superAdminPermission) {
    
    this.superAdminPermission = superAdminPermission;
    return this;
  }

   /**
   * Get superAdminPermission
   * @return superAdminPermission
  **/
  @javax.annotation.Nullable
  public Object getSuperAdminPermission() {
    return superAdminPermission;
  }


  public void setSuperAdminPermission(Object superAdminPermission) {
    this.superAdminPermission = superAdminPermission;
  }


  public Users timezone(Object timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  public Object getTimezone() {
    return timezone;
  }


  public void setTimezone(Object timezone) {
    this.timezone = timezone;
  }


  public Users vmTranscription(Object vmTranscription) {
    
    this.vmTranscription = vmTranscription;
    return this;
  }

   /**
   * Get vmTranscription
   * @return vmTranscription
  **/
  @javax.annotation.Nullable
  public Object getVmTranscription() {
    return vmTranscription;
  }


  public void setVmTranscription(Object vmTranscription) {
    this.vmTranscription = vmTranscription;
  }


  public Users communication(Object communication) {
    
    this.communication = communication;
    return this;
  }

   /**
   * Get communication
   * @return communication
  **/
  @javax.annotation.Nullable
  public Object getCommunication() {
    return communication;
  }


  public void setCommunication(Object communication) {
    this.communication = communication;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Users users = (Users) o;
    return Objects.equals(this.email, users.email) &&
        Objects.equals(this.password, users.password) &&
        Objects.equals(this.sipPassword, users.sipPassword) &&
        Objects.equals(this.turnPassword, users.turnPassword) &&
        Objects.equals(this.first, users.first) &&
        Objects.equals(this.last, users.last) &&
        Objects.equals(this.mobilePhone, users.mobilePhone) &&
        Objects.equals(this.businessPhone, users.businessPhone) &&
        Objects.equals(this.extension, users.extension) &&
        Objects.equals(this.customCallerId, users.customCallerId) &&
        Objects.equals(this.jobTitle, users.jobTitle) &&
        Objects.equals(this.department, users.department) &&
        Objects.equals(this.office, users.office) &&
        Objects.equals(this.avatar, users.avatar) &&
        Objects.equals(this.language, users.language) &&
        Objects.equals(this.isPrimary, users.isPrimary) &&
        Objects.equals(this.status, users.status) &&
        Objects.equals(this.vmGreetingType, users.vmGreetingType) &&
        Objects.equals(this.vmTimeout, users.vmTimeout) &&
        Objects.equals(this.vmFile, users.vmFile) &&
        Objects.equals(this.vmPlaybackNumber, users.vmPlaybackNumber) &&
        Objects.equals(this.pin, users.pin) &&
        Objects.equals(this.number, users.number) &&
        Objects.equals(this.region, users.region) &&
        Objects.equals(this.callerIdNumber, users.callerIdNumber) &&
        Objects.equals(this.adminPermission, users.adminPermission) &&
        Objects.equals(this.billingPermission, users.billingPermission) &&
        Objects.equals(this.phonePermission, users.phonePermission) &&
        Objects.equals(this.agilePermission, users.agilePermission) &&
        Objects.equals(this.jobServerPermission, users.jobServerPermission) &&
        Objects.equals(this.mediaServerPermission, users.mediaServerPermission) &&
        Objects.equals(this.mailServerPermission, users.mailServerPermission) &&
        Objects.equals(this.superAdminPermission, users.superAdminPermission) &&
        Objects.equals(this.timezone, users.timezone) &&
        Objects.equals(this.vmTranscription, users.vmTranscription) &&
        Objects.equals(this.communication, users.communication);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password, sipPassword, turnPassword, first, last, mobilePhone, businessPhone, extension, customCallerId, jobTitle, department, office, avatar, language, isPrimary, status, vmGreetingType, vmTimeout, vmFile, vmPlaybackNumber, pin, number, region, callerIdNumber, adminPermission, billingPermission, phonePermission, agilePermission, jobServerPermission, mediaServerPermission, mailServerPermission, superAdminPermission, timezone, vmTranscription, communication);
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
    sb.append("class Users {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sipPassword: ").append(toIndentedString(sipPassword)).append("\n");
    sb.append("    turnPassword: ").append(toIndentedString(turnPassword)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    customCallerId: ").append(toIndentedString(customCallerId)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vmGreetingType: ").append(toIndentedString(vmGreetingType)).append("\n");
    sb.append("    vmTimeout: ").append(toIndentedString(vmTimeout)).append("\n");
    sb.append("    vmFile: ").append(toIndentedString(vmFile)).append("\n");
    sb.append("    vmPlaybackNumber: ").append(toIndentedString(vmPlaybackNumber)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    callerIdNumber: ").append(toIndentedString(callerIdNumber)).append("\n");
    sb.append("    adminPermission: ").append(toIndentedString(adminPermission)).append("\n");
    sb.append("    billingPermission: ").append(toIndentedString(billingPermission)).append("\n");
    sb.append("    phonePermission: ").append(toIndentedString(phonePermission)).append("\n");
    sb.append("    agilePermission: ").append(toIndentedString(agilePermission)).append("\n");
    sb.append("    jobServerPermission: ").append(toIndentedString(jobServerPermission)).append("\n");
    sb.append("    mediaServerPermission: ").append(toIndentedString(mediaServerPermission)).append("\n");
    sb.append("    mailServerPermission: ").append(toIndentedString(mailServerPermission)).append("\n");
    sb.append("    superAdminPermission: ").append(toIndentedString(superAdminPermission)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    vmTranscription: ").append(toIndentedString(vmTranscription)).append("\n");
    sb.append("    communication: ").append(toIndentedString(communication)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("password");
    openapiFields.add("sipPassword");
    openapiFields.add("turnPassword");
    openapiFields.add("first");
    openapiFields.add("last");
    openapiFields.add("mobilePhone");
    openapiFields.add("businessPhone");
    openapiFields.add("extension");
    openapiFields.add("customCallerId");
    openapiFields.add("jobTitle");
    openapiFields.add("department");
    openapiFields.add("office");
    openapiFields.add("avatar");
    openapiFields.add("language");
    openapiFields.add("isPrimary");
    openapiFields.add("status");
    openapiFields.add("vmGreetingType");
    openapiFields.add("vmTimeout");
    openapiFields.add("vmFile");
    openapiFields.add("vmPlaybackNumber");
    openapiFields.add("pin");
    openapiFields.add("number");
    openapiFields.add("region");
    openapiFields.add("callerIdNumber");
    openapiFields.add("adminPermission");
    openapiFields.add("billingPermission");
    openapiFields.add("phonePermission");
    openapiFields.add("agilePermission");
    openapiFields.add("jobServerPermission");
    openapiFields.add("mediaServerPermission");
    openapiFields.add("mailServerPermission");
    openapiFields.add("superAdminPermission");
    openapiFields.add("timezone");
    openapiFields.add("vmTranscription");
    openapiFields.add("communication");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("password");
    openapiRequiredFields.add("sipPassword");
    openapiRequiredFields.add("first");
    openapiRequiredFields.add("last");
    openapiRequiredFields.add("timezone");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Users
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Users.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Users is not found in the empty JSON string", Users.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Users.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Users` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Users.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Users.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Users' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Users> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Users.class));

       return (TypeAdapter<T>) new TypeAdapter<Users>() {
           @Override
           public void write(JsonWriter out, Users value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Users read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Users given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Users
  * @throws IOException if the JSON string is invalid with respect to Users
  */
  public static Users fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Users.class);
  }

 /**
  * Convert an instance of Users to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

