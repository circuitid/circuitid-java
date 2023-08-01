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


package com.circuitid.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Acceptedsenders.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.AcceptedsendersCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Announcements.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.AnnouncementsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Authentication.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.AuthenticationCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Callqueueagents.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.CallqueueagentsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Callqueues.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.CallqueuesCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Chatrooms.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.ChatroomsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Clients.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.ClientsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Conferencerooms.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.ConferenceroomsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Contacts.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.ContactsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Conversationmessages.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.ConversationmessagesCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Conversations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.ConversationsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.CreateAuthentication200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Customers.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.CustomersCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Developerapps.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.DeveloperappsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Developerappsubscriptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.DeveloperappsubscriptionsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Directories.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.DirectoriesCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Domains.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.DomainsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Faxaccounts.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FaxaccountsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Faxes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FaxesCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Find.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindAcceptedSenders200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindAnnouncements200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindAppMarketplace200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindCallQueueAgents200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindCallQueues200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindChatRooms200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindClients200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindConferenceRooms200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindContacts200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindConversationMessages200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindConversations200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindCustomers200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindDeveloperAppSubscriptions200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindDeveloperApps200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindDirectories200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindDomains200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindFaxAccounts200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindFaxes200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindFirewall200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindGroupMembers200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindGroups200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindHolidays200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindInvoiceItems200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindInvoices200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindLicenses200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindMenuOptions200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindMenus200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindMessageBrands200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindMessageCampaigns200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindNumberPorts200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindNumbers200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindOffices200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindPhoneInboundRuleActions200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindPhoneInboundRules200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindPhoneOutboundRuleActions200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindPhoneOutboundRules200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindRateCenters200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindServers200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindTimeSchedules200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindUserTokens200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindUsers200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FindVirtualExtensions200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Firewall.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.FirewallCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetAcceptedSender200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetAnnouncement200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetCallQueue200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetCallQueueAgent200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetChatRoom200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetClient200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetConferenceRoom200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetContact200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetConversation200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetConversationMessage200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetCustomer200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetDeveloperApp200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetDeveloperAppSubscription200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetDomain200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetFax200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetFaxAccount200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetFirewall200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetGroup200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetGroupMember200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetHoliday200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetInvoice200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetInvoiceItem200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetLicense200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetMenu200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetMenuOption200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetMessageBrand200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetMessageCampaign200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetNumber200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetNumberPort200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetOffice200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetPhoneInboundRule200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetPhoneInboundRuleAction200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetPhoneOutboundRule200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetPhoneOutboundRuleAction200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetRateCenter200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetServer200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetTimeSchedule200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetUser200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetUserToken200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GetVirtualExtension200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Getdirectory200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Groupmembers.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GroupmembersCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Groups.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.GroupsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Holidays.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.HolidaysCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Id.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Invoiceitems.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Invoices.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Licenses.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.LicensesCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Menuoptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.MenuoptionsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Menus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.MenusCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Messagebrands.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.MessagebrandsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Messagecampaigns.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.MessagecampaignsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Numberports.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.NumberportsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Numbers.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.NumbersCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Offices.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.OfficesCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Phoneinboundruleactions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.PhoneinboundruleactionsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Phoneinboundrules.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.PhoneinboundrulesCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Phoneoutboundruleactions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.PhoneoutboundruleactionsCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Phoneoutboundrules.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.PhoneoutboundrulesCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Ratecenters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.ResponseDate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.ResponseError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.ResponseUsers.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Servers.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.ServersCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Timeschedules.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.TimeschedulesCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Users.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.UsersCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Usertokens.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.UsertokensCreateOrPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.Virtualextensions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.circuitid.client.model.VirtualextensionsCreateOrPatch.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
