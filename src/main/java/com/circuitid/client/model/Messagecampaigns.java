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
 * Messagecampaigns
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-25T10:21:28.674Z[UTC]")
public class Messagecampaigns {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Object campaignId = null;

  public static final String SERIALIZED_NAME_BRAND_ID = "brandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Object brandId = null;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Object order = null;

  public static final String SERIALIZED_NAME_SUBSCRIBER_OPTIN = "subscriberOptin";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_OPTIN)
  private Object subscriberOptin = null;

  public static final String SERIALIZED_NAME_SUBSCRIBER_OPTOUT = "subscriberOptout";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_OPTOUT)
  private Object subscriberOptout = null;

  public static final String SERIALIZED_NAME_SUBSCRIBER_HELP = "subscriberHelp";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_HELP)
  private Object subscriberHelp = null;

  public static final String SERIALIZED_NAME_NUMBER_POOL = "numberPool";
  @SerializedName(SERIALIZED_NAME_NUMBER_POOL)
  private Object numberPool = null;

  public static final String SERIALIZED_NAME_DIRECT_LENDING = "directLending";
  @SerializedName(SERIALIZED_NAME_DIRECT_LENDING)
  private Object directLending = null;

  public static final String SERIALIZED_NAME_EMBEDDED_LINK = "embeddedLink";
  @SerializedName(SERIALIZED_NAME_EMBEDDED_LINK)
  private Object embeddedLink = null;

  public static final String SERIALIZED_NAME_EMBEDDED_PHONE = "embeddedPhone";
  @SerializedName(SERIALIZED_NAME_EMBEDDED_PHONE)
  private Object embeddedPhone = null;

  public static final String SERIALIZED_NAME_AFFILIATE_MARKETING = "affiliateMarketing";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_MARKETING)
  private Object affiliateMarketing = null;

  public static final String SERIALIZED_NAME_AGE_GATED = "ageGated";
  @SerializedName(SERIALIZED_NAME_AGE_GATED)
  private Object ageGated = null;

  public static final String SERIALIZED_NAME_MNOS = "mnos";
  @SerializedName(SERIALIZED_NAME_MNOS)
  private Object mnos = null;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Object referenceId = null;

  public static final String SERIALIZED_NAME_USE_CASE = "useCase";
  @SerializedName(SERIALIZED_NAME_USE_CASE)
  private Object useCase = null;

  public static final String SERIALIZED_NAME_SUB_USE_CASES = "subUseCases";
  @SerializedName(SERIALIZED_NAME_SUB_USE_CASES)
  private Object subUseCases = null;

  public static final String SERIALIZED_NAME_SAMPLE1 = "sample1";
  @SerializedName(SERIALIZED_NAME_SAMPLE1)
  private Object sample1 = null;

  public static final String SERIALIZED_NAME_SAMPLE2 = "sample2";
  @SerializedName(SERIALIZED_NAME_SAMPLE2)
  private Object sample2 = null;

  public static final String SERIALIZED_NAME_SAMPLE3 = "sample3";
  @SerializedName(SERIALIZED_NAME_SAMPLE3)
  private Object sample3 = null;

  public static final String SERIALIZED_NAME_SAMPLE4 = "sample4";
  @SerializedName(SERIALIZED_NAME_SAMPLE4)
  private Object sample4 = null;

  public static final String SERIALIZED_NAME_SAMPLE5 = "sample5";
  @SerializedName(SERIALIZED_NAME_SAMPLE5)
  private Object sample5 = null;

  public Messagecampaigns() {
  }

  public Messagecampaigns name(Object name) {
    
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


  public Messagecampaigns campaignId(Object campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Object getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Object campaignId) {
    this.campaignId = campaignId;
  }


  public Messagecampaigns brandId(Object brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @javax.annotation.Nullable
  public Object getBrandId() {
    return brandId;
  }


  public void setBrandId(Object brandId) {
    this.brandId = brandId;
  }


  public Messagecampaigns order(Object order) {
    
    this.order = order;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return order
  **/
  @javax.annotation.Nullable
  public Object getOrder() {
    return order;
  }


  public void setOrder(Object order) {
    this.order = order;
  }


  public Messagecampaigns subscriberOptin(Object subscriberOptin) {
    
    this.subscriberOptin = subscriberOptin;
    return this;
  }

   /**
   * Get subscriberOptin
   * @return subscriberOptin
  **/
  @javax.annotation.Nullable
  public Object getSubscriberOptin() {
    return subscriberOptin;
  }


  public void setSubscriberOptin(Object subscriberOptin) {
    this.subscriberOptin = subscriberOptin;
  }


  public Messagecampaigns subscriberOptout(Object subscriberOptout) {
    
    this.subscriberOptout = subscriberOptout;
    return this;
  }

   /**
   * Get subscriberOptout
   * @return subscriberOptout
  **/
  @javax.annotation.Nullable
  public Object getSubscriberOptout() {
    return subscriberOptout;
  }


  public void setSubscriberOptout(Object subscriberOptout) {
    this.subscriberOptout = subscriberOptout;
  }


  public Messagecampaigns subscriberHelp(Object subscriberHelp) {
    
    this.subscriberHelp = subscriberHelp;
    return this;
  }

   /**
   * Get subscriberHelp
   * @return subscriberHelp
  **/
  @javax.annotation.Nullable
  public Object getSubscriberHelp() {
    return subscriberHelp;
  }


  public void setSubscriberHelp(Object subscriberHelp) {
    this.subscriberHelp = subscriberHelp;
  }


  public Messagecampaigns numberPool(Object numberPool) {
    
    this.numberPool = numberPool;
    return this;
  }

   /**
   * Get numberPool
   * @return numberPool
  **/
  @javax.annotation.Nullable
  public Object getNumberPool() {
    return numberPool;
  }


  public void setNumberPool(Object numberPool) {
    this.numberPool = numberPool;
  }


  public Messagecampaigns directLending(Object directLending) {
    
    this.directLending = directLending;
    return this;
  }

   /**
   * Get directLending
   * @return directLending
  **/
  @javax.annotation.Nullable
  public Object getDirectLending() {
    return directLending;
  }


  public void setDirectLending(Object directLending) {
    this.directLending = directLending;
  }


  public Messagecampaigns embeddedLink(Object embeddedLink) {
    
    this.embeddedLink = embeddedLink;
    return this;
  }

   /**
   * Get embeddedLink
   * @return embeddedLink
  **/
  @javax.annotation.Nullable
  public Object getEmbeddedLink() {
    return embeddedLink;
  }


  public void setEmbeddedLink(Object embeddedLink) {
    this.embeddedLink = embeddedLink;
  }


  public Messagecampaigns embeddedPhone(Object embeddedPhone) {
    
    this.embeddedPhone = embeddedPhone;
    return this;
  }

   /**
   * Get embeddedPhone
   * @return embeddedPhone
  **/
  @javax.annotation.Nullable
  public Object getEmbeddedPhone() {
    return embeddedPhone;
  }


  public void setEmbeddedPhone(Object embeddedPhone) {
    this.embeddedPhone = embeddedPhone;
  }


  public Messagecampaigns affiliateMarketing(Object affiliateMarketing) {
    
    this.affiliateMarketing = affiliateMarketing;
    return this;
  }

   /**
   * Get affiliateMarketing
   * @return affiliateMarketing
  **/
  @javax.annotation.Nullable
  public Object getAffiliateMarketing() {
    return affiliateMarketing;
  }


  public void setAffiliateMarketing(Object affiliateMarketing) {
    this.affiliateMarketing = affiliateMarketing;
  }


  public Messagecampaigns ageGated(Object ageGated) {
    
    this.ageGated = ageGated;
    return this;
  }

   /**
   * Get ageGated
   * @return ageGated
  **/
  @javax.annotation.Nullable
  public Object getAgeGated() {
    return ageGated;
  }


  public void setAgeGated(Object ageGated) {
    this.ageGated = ageGated;
  }


  public Messagecampaigns mnos(Object mnos) {
    
    this.mnos = mnos;
    return this;
  }

   /**
   * Get mnos
   * @return mnos
  **/
  @javax.annotation.Nullable
  public Object getMnos() {
    return mnos;
  }


  public void setMnos(Object mnos) {
    this.mnos = mnos;
  }


  public Messagecampaigns referenceId(Object referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Get referenceId
   * @return referenceId
  **/
  @javax.annotation.Nullable
  public Object getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(Object referenceId) {
    this.referenceId = referenceId;
  }


  public Messagecampaigns useCase(Object useCase) {
    
    this.useCase = useCase;
    return this;
  }

   /**
   * Get useCase
   * @return useCase
  **/
  @javax.annotation.Nullable
  public Object getUseCase() {
    return useCase;
  }


  public void setUseCase(Object useCase) {
    this.useCase = useCase;
  }


  public Messagecampaigns subUseCases(Object subUseCases) {
    
    this.subUseCases = subUseCases;
    return this;
  }

   /**
   * Get subUseCases
   * @return subUseCases
  **/
  @javax.annotation.Nullable
  public Object getSubUseCases() {
    return subUseCases;
  }


  public void setSubUseCases(Object subUseCases) {
    this.subUseCases = subUseCases;
  }


  public Messagecampaigns sample1(Object sample1) {
    
    this.sample1 = sample1;
    return this;
  }

   /**
   * Get sample1
   * @return sample1
  **/
  @javax.annotation.Nullable
  public Object getSample1() {
    return sample1;
  }


  public void setSample1(Object sample1) {
    this.sample1 = sample1;
  }


  public Messagecampaigns sample2(Object sample2) {
    
    this.sample2 = sample2;
    return this;
  }

   /**
   * Get sample2
   * @return sample2
  **/
  @javax.annotation.Nullable
  public Object getSample2() {
    return sample2;
  }


  public void setSample2(Object sample2) {
    this.sample2 = sample2;
  }


  public Messagecampaigns sample3(Object sample3) {
    
    this.sample3 = sample3;
    return this;
  }

   /**
   * Get sample3
   * @return sample3
  **/
  @javax.annotation.Nullable
  public Object getSample3() {
    return sample3;
  }


  public void setSample3(Object sample3) {
    this.sample3 = sample3;
  }


  public Messagecampaigns sample4(Object sample4) {
    
    this.sample4 = sample4;
    return this;
  }

   /**
   * Get sample4
   * @return sample4
  **/
  @javax.annotation.Nullable
  public Object getSample4() {
    return sample4;
  }


  public void setSample4(Object sample4) {
    this.sample4 = sample4;
  }


  public Messagecampaigns sample5(Object sample5) {
    
    this.sample5 = sample5;
    return this;
  }

   /**
   * Get sample5
   * @return sample5
  **/
  @javax.annotation.Nullable
  public Object getSample5() {
    return sample5;
  }


  public void setSample5(Object sample5) {
    this.sample5 = sample5;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Messagecampaigns messagecampaigns = (Messagecampaigns) o;
    return Objects.equals(this.name, messagecampaigns.name) &&
        Objects.equals(this.campaignId, messagecampaigns.campaignId) &&
        Objects.equals(this.brandId, messagecampaigns.brandId) &&
        Objects.equals(this.order, messagecampaigns.order) &&
        Objects.equals(this.subscriberOptin, messagecampaigns.subscriberOptin) &&
        Objects.equals(this.subscriberOptout, messagecampaigns.subscriberOptout) &&
        Objects.equals(this.subscriberHelp, messagecampaigns.subscriberHelp) &&
        Objects.equals(this.numberPool, messagecampaigns.numberPool) &&
        Objects.equals(this.directLending, messagecampaigns.directLending) &&
        Objects.equals(this.embeddedLink, messagecampaigns.embeddedLink) &&
        Objects.equals(this.embeddedPhone, messagecampaigns.embeddedPhone) &&
        Objects.equals(this.affiliateMarketing, messagecampaigns.affiliateMarketing) &&
        Objects.equals(this.ageGated, messagecampaigns.ageGated) &&
        Objects.equals(this.mnos, messagecampaigns.mnos) &&
        Objects.equals(this.referenceId, messagecampaigns.referenceId) &&
        Objects.equals(this.useCase, messagecampaigns.useCase) &&
        Objects.equals(this.subUseCases, messagecampaigns.subUseCases) &&
        Objects.equals(this.sample1, messagecampaigns.sample1) &&
        Objects.equals(this.sample2, messagecampaigns.sample2) &&
        Objects.equals(this.sample3, messagecampaigns.sample3) &&
        Objects.equals(this.sample4, messagecampaigns.sample4) &&
        Objects.equals(this.sample5, messagecampaigns.sample5);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, campaignId, brandId, order, subscriberOptin, subscriberOptout, subscriberHelp, numberPool, directLending, embeddedLink, embeddedPhone, affiliateMarketing, ageGated, mnos, referenceId, useCase, subUseCases, sample1, sample2, sample3, sample4, sample5);
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
    sb.append("class Messagecampaigns {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    subscriberOptin: ").append(toIndentedString(subscriberOptin)).append("\n");
    sb.append("    subscriberOptout: ").append(toIndentedString(subscriberOptout)).append("\n");
    sb.append("    subscriberHelp: ").append(toIndentedString(subscriberHelp)).append("\n");
    sb.append("    numberPool: ").append(toIndentedString(numberPool)).append("\n");
    sb.append("    directLending: ").append(toIndentedString(directLending)).append("\n");
    sb.append("    embeddedLink: ").append(toIndentedString(embeddedLink)).append("\n");
    sb.append("    embeddedPhone: ").append(toIndentedString(embeddedPhone)).append("\n");
    sb.append("    affiliateMarketing: ").append(toIndentedString(affiliateMarketing)).append("\n");
    sb.append("    ageGated: ").append(toIndentedString(ageGated)).append("\n");
    sb.append("    mnos: ").append(toIndentedString(mnos)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    useCase: ").append(toIndentedString(useCase)).append("\n");
    sb.append("    subUseCases: ").append(toIndentedString(subUseCases)).append("\n");
    sb.append("    sample1: ").append(toIndentedString(sample1)).append("\n");
    sb.append("    sample2: ").append(toIndentedString(sample2)).append("\n");
    sb.append("    sample3: ").append(toIndentedString(sample3)).append("\n");
    sb.append("    sample4: ").append(toIndentedString(sample4)).append("\n");
    sb.append("    sample5: ").append(toIndentedString(sample5)).append("\n");
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
    openapiFields.add("campaignId");
    openapiFields.add("brandId");
    openapiFields.add("order");
    openapiFields.add("subscriberOptin");
    openapiFields.add("subscriberOptout");
    openapiFields.add("subscriberHelp");
    openapiFields.add("numberPool");
    openapiFields.add("directLending");
    openapiFields.add("embeddedLink");
    openapiFields.add("embeddedPhone");
    openapiFields.add("affiliateMarketing");
    openapiFields.add("ageGated");
    openapiFields.add("mnos");
    openapiFields.add("referenceId");
    openapiFields.add("useCase");
    openapiFields.add("subUseCases");
    openapiFields.add("sample1");
    openapiFields.add("sample2");
    openapiFields.add("sample3");
    openapiFields.add("sample4");
    openapiFields.add("sample5");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("brandId");
    openapiRequiredFields.add("order");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Messagecampaigns
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Messagecampaigns.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Messagecampaigns is not found in the empty JSON string", Messagecampaigns.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Messagecampaigns.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Messagecampaigns` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Messagecampaigns.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Messagecampaigns.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Messagecampaigns' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Messagecampaigns> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Messagecampaigns.class));

       return (TypeAdapter<T>) new TypeAdapter<Messagecampaigns>() {
           @Override
           public void write(JsonWriter out, Messagecampaigns value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Messagecampaigns read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Messagecampaigns given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Messagecampaigns
  * @throws IOException if the JSON string is invalid with respect to Messagecampaigns
  */
  public static Messagecampaigns fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Messagecampaigns.class);
  }

 /**
  * Convert an instance of Messagecampaigns to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

