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
 * InvoiceitemsCreateOrPatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-31T20:28:34.437Z[UTC]")
public class InvoiceitemsCreateOrPatch {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_SETUP = "setup";
  @SerializedName(SERIALIZED_NAME_SETUP)
  private Integer setup;

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  private Integer taxes;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity = 1;

  public static final String SERIALIZED_NAME_INVOICE = "invoice";
  @SerializedName(SERIALIZED_NAME_INVOICE)
  private String invoice;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public InvoiceitemsCreateOrPatch() {
  }

  public InvoiceitemsCreateOrPatch name(String name) {
    
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


  public InvoiceitemsCreateOrPatch amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public InvoiceitemsCreateOrPatch setup(Integer setup) {
    
    this.setup = setup;
    return this;
  }

   /**
   * Get setup
   * @return setup
  **/
  @javax.annotation.Nullable
  public Integer getSetup() {
    return setup;
  }


  public void setSetup(Integer setup) {
    this.setup = setup;
  }


  public InvoiceitemsCreateOrPatch taxes(Integer taxes) {
    
    this.taxes = taxes;
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @javax.annotation.Nullable
  public Integer getTaxes() {
    return taxes;
  }


  public void setTaxes(Integer taxes) {
    this.taxes = taxes;
  }


  public InvoiceitemsCreateOrPatch quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nonnull
  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public InvoiceitemsCreateOrPatch invoice(String invoice) {
    
    this.invoice = invoice;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return invoice
  **/
  @javax.annotation.Nonnull
  public String getInvoice() {
    return invoice;
  }


  public void setInvoice(String invoice) {
    this.invoice = invoice;
  }


  public InvoiceitemsCreateOrPatch ref(String ref) {
    
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


  public InvoiceitemsCreateOrPatch _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return _object
  **/
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceitemsCreateOrPatch invoiceitemsCreateOrPatch = (InvoiceitemsCreateOrPatch) o;
    return Objects.equals(this.name, invoiceitemsCreateOrPatch.name) &&
        Objects.equals(this.amount, invoiceitemsCreateOrPatch.amount) &&
        Objects.equals(this.setup, invoiceitemsCreateOrPatch.setup) &&
        Objects.equals(this.taxes, invoiceitemsCreateOrPatch.taxes) &&
        Objects.equals(this.quantity, invoiceitemsCreateOrPatch.quantity) &&
        Objects.equals(this.invoice, invoiceitemsCreateOrPatch.invoice) &&
        Objects.equals(this.ref, invoiceitemsCreateOrPatch.ref) &&
        Objects.equals(this._object, invoiceitemsCreateOrPatch._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, amount, setup, taxes, quantity, invoice, ref, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceitemsCreateOrPatch {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    setup: ").append(toIndentedString(setup)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("setup");
    openapiFields.add("taxes");
    openapiFields.add("quantity");
    openapiFields.add("invoice");
    openapiFields.add("ref");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("invoice");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceitemsCreateOrPatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvoiceitemsCreateOrPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceitemsCreateOrPatch is not found in the empty JSON string", InvoiceitemsCreateOrPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvoiceitemsCreateOrPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceitemsCreateOrPatch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoiceitemsCreateOrPatch.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("invoice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice").toString()));
      }
      if ((jsonObj.get("ref") != null && !jsonObj.get("ref").isJsonNull()) && !jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceitemsCreateOrPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceitemsCreateOrPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceitemsCreateOrPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceitemsCreateOrPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceitemsCreateOrPatch>() {
           @Override
           public void write(JsonWriter out, InvoiceitemsCreateOrPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceitemsCreateOrPatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceitemsCreateOrPatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceitemsCreateOrPatch
  * @throws IOException if the JSON string is invalid with respect to InvoiceitemsCreateOrPatch
  */
  public static InvoiceitemsCreateOrPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceitemsCreateOrPatch.class);
  }

 /**
  * Convert an instance of InvoiceitemsCreateOrPatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

