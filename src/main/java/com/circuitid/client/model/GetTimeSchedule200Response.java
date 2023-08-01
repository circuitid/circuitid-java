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
import com.circuitid.client.model.TimeschedulesSunday;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * GetTimeSchedule200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-01T20:00:37.621Z[UTC]")
public class GetTimeSchedule200Response {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets timezone
   */
  @JsonAdapter(TimezoneEnum.Adapter.class)
  public enum TimezoneEnum {
    EUROPE_ANDORRA("Europe/Andorra"),
    
    ASIA_DUBAI("Asia/Dubai"),
    
    ASIA_KABUL("Asia/Kabul"),
    
    EUROPE_TIRANE("Europe/Tirane"),
    
    ASIA_YEREVAN("Asia/Yerevan"),
    
    ANTARCTICA_CASEY("Antarctica/Casey"),
    
    ANTARCTICA_DAVIS("Antarctica/Davis"),
    
    ANTARCTICA_DUMONTDURVILLE("Antarctica/DumontDUrville"),
    
    ANTARCTICA_MAWSON("Antarctica/Mawson"),
    
    ANTARCTICA_PALMER("Antarctica/Palmer"),
    
    ANTARCTICA_ROTHERA("Antarctica/Rothera"),
    
    ANTARCTICA_SYOWA("Antarctica/Syowa"),
    
    ANTARCTICA_TROLL("Antarctica/Troll"),
    
    ANTARCTICA_VOSTOK("Antarctica/Vostok"),
    
    AMERICA_ARGENTINA_BUENOS_AIRES("America/Argentina/Buenos_Aires"),
    
    AMERICA_ARGENTINA_CORDOBA("America/Argentina/Cordoba"),
    
    AMERICA_ARGENTINA_SALTA("America/Argentina/Salta"),
    
    AMERICA_ARGENTINA_JUJUY("America/Argentina/Jujuy"),
    
    AMERICA_ARGENTINA_TUCUMAN("America/Argentina/Tucuman"),
    
    AMERICA_ARGENTINA_CATAMARCA("America/Argentina/Catamarca"),
    
    AMERICA_ARGENTINA_LA_RIOJA("America/Argentina/La_Rioja"),
    
    AMERICA_ARGENTINA_SAN_JUAN("America/Argentina/San_Juan"),
    
    AMERICA_ARGENTINA_MENDOZA("America/Argentina/Mendoza"),
    
    AMERICA_ARGENTINA_SAN_LUIS("America/Argentina/San_Luis"),
    
    AMERICA_ARGENTINA_RIO_GALLEGOS("America/Argentina/Rio_Gallegos"),
    
    AMERICA_ARGENTINA_USHUAIA("America/Argentina/Ushuaia"),
    
    PACIFIC_PAGO_PAGO("Pacific/Pago_Pago"),
    
    EUROPE_VIENNA("Europe/Vienna"),
    
    AUSTRALIA_LORD_HOWE("Australia/Lord_Howe"),
    
    ANTARCTICA_MACQUARIE("Antarctica/Macquarie"),
    
    AUSTRALIA_HOBART("Australia/Hobart"),
    
    AUSTRALIA_CURRIE("Australia/Currie"),
    
    AUSTRALIA_MELBOURNE("Australia/Melbourne"),
    
    AUSTRALIA_SYDNEY("Australia/Sydney"),
    
    AUSTRALIA_BROKEN_HILL("Australia/Broken_Hill"),
    
    AUSTRALIA_BRISBANE("Australia/Brisbane"),
    
    AUSTRALIA_LINDEMAN("Australia/Lindeman"),
    
    AUSTRALIA_ADELAIDE("Australia/Adelaide"),
    
    AUSTRALIA_DARWIN("Australia/Darwin"),
    
    AUSTRALIA_PERTH("Australia/Perth"),
    
    AUSTRALIA_EUCLA("Australia/Eucla"),
    
    ASIA_BAKU("Asia/Baku"),
    
    AMERICA_BARBADOS("America/Barbados"),
    
    ASIA_DHAKA("Asia/Dhaka"),
    
    EUROPE_BRUSSELS("Europe/Brussels"),
    
    EUROPE_SOFIA("Europe/Sofia"),
    
    ATLANTIC_BERMUDA("Atlantic/Bermuda"),
    
    ASIA_BRUNEI("Asia/Brunei"),
    
    AMERICA_LA_PAZ("America/La_Paz"),
    
    AMERICA_NORONHA("America/Noronha"),
    
    AMERICA_BELEM("America/Belem"),
    
    AMERICA_FORTALEZA("America/Fortaleza"),
    
    AMERICA_RECIFE("America/Recife"),
    
    AMERICA_ARAGUAINA("America/Araguaina"),
    
    AMERICA_MACEIO("America/Maceio"),
    
    AMERICA_BAHIA("America/Bahia"),
    
    AMERICA_SAO_PAULO("America/Sao_Paulo"),
    
    AMERICA_CAMPO_GRANDE("America/Campo_Grande"),
    
    AMERICA_CUIABA("America/Cuiaba"),
    
    AMERICA_SANTAREM("America/Santarem"),
    
    AMERICA_PORTO_VELHO("America/Porto_Velho"),
    
    AMERICA_BOA_VISTA("America/Boa_Vista"),
    
    AMERICA_MANAUS("America/Manaus"),
    
    AMERICA_EIRUNEPE("America/Eirunepe"),
    
    AMERICA_RIO_BRANCO("America/Rio_Branco"),
    
    AMERICA_NASSAU("America/Nassau"),
    
    ASIA_THIMPHU("Asia/Thimphu"),
    
    EUROPE_MINSK("Europe/Minsk"),
    
    AMERICA_BELIZE("America/Belize"),
    
    AMERICA_ST_JOHNS("America/St_Johns"),
    
    AMERICA_HALIFAX("America/Halifax"),
    
    AMERICA_GLACE_BAY("America/Glace_Bay"),
    
    AMERICA_MONCTON("America/Moncton"),
    
    AMERICA_GOOSE_BAY("America/Goose_Bay"),
    
    AMERICA_BLANC_SABLON("America/Blanc-Sablon"),
    
    AMERICA_TORONTO("America/Toronto"),
    
    AMERICA_NIPIGON("America/Nipigon"),
    
    AMERICA_THUNDER_BAY("America/Thunder_Bay"),
    
    AMERICA_IQALUIT("America/Iqaluit"),
    
    AMERICA_PANGNIRTUNG("America/Pangnirtung"),
    
    AMERICA_ATIKOKAN("America/Atikokan"),
    
    AMERICA_WINNIPEG("America/Winnipeg"),
    
    AMERICA_RAINY_RIVER("America/Rainy_River"),
    
    AMERICA_RESOLUTE("America/Resolute"),
    
    AMERICA_RANKIN_INLET("America/Rankin_Inlet"),
    
    AMERICA_REGINA("America/Regina"),
    
    AMERICA_SWIFT_CURRENT("America/Swift_Current"),
    
    AMERICA_EDMONTON("America/Edmonton"),
    
    AMERICA_CAMBRIDGE_BAY("America/Cambridge_Bay"),
    
    AMERICA_YELLOWKNIFE("America/Yellowknife"),
    
    AMERICA_INUVIK("America/Inuvik"),
    
    AMERICA_CRESTON("America/Creston"),
    
    AMERICA_DAWSON_CREEK("America/Dawson_Creek"),
    
    AMERICA_FORT_NELSON("America/Fort_Nelson"),
    
    AMERICA_VANCOUVER("America/Vancouver"),
    
    AMERICA_WHITEHORSE("America/Whitehorse"),
    
    AMERICA_DAWSON("America/Dawson"),
    
    INDIAN_COCOS("Indian/Cocos"),
    
    EUROPE_ZURICH("Europe/Zurich"),
    
    AFRICA_ABIDJAN("Africa/Abidjan"),
    
    PACIFIC_RAROTONGA("Pacific/Rarotonga"),
    
    AMERICA_SANTIAGO("America/Santiago"),
    
    AMERICA_PUNTA_ARENAS("America/Punta_Arenas"),
    
    PACIFIC_EASTER("Pacific/Easter"),
    
    ASIA_SHANGHAI("Asia/Shanghai"),
    
    ASIA_URUMQI("Asia/Urumqi"),
    
    AMERICA_BOGOTA("America/Bogota"),
    
    AMERICA_COSTA_RICA("America/Costa_Rica"),
    
    AMERICA_HAVANA("America/Havana"),
    
    ATLANTIC_CAPE_VERDE("Atlantic/Cape_Verde"),
    
    AMERICA_CURACAO("America/Curacao"),
    
    INDIAN_CHRISTMAS("Indian/Christmas"),
    
    ASIA_NICOSIA("Asia/Nicosia"),
    
    ASIA_FAMAGUSTA("Asia/Famagusta"),
    
    EUROPE_PRAGUE("Europe/Prague"),
    
    EUROPE_BERLIN("Europe/Berlin"),
    
    EUROPE_COPENHAGEN("Europe/Copenhagen"),
    
    AMERICA_SANTO_DOMINGO("America/Santo_Domingo"),
    
    AFRICA_ALGIERS("Africa/Algiers"),
    
    AMERICA_GUAYAQUIL("America/Guayaquil"),
    
    PACIFIC_GALAPAGOS("Pacific/Galapagos"),
    
    EUROPE_TALLINN("Europe/Tallinn"),
    
    AFRICA_CAIRO("Africa/Cairo"),
    
    AFRICA_EL_AAIUN("Africa/El_Aaiun"),
    
    EUROPE_MADRID("Europe/Madrid"),
    
    AFRICA_CEUTA("Africa/Ceuta"),
    
    ATLANTIC_CANARY("Atlantic/Canary"),
    
    EUROPE_HELSINKI("Europe/Helsinki"),
    
    PACIFIC_FIJI("Pacific/Fiji"),
    
    ATLANTIC_STANLEY("Atlantic/Stanley"),
    
    PACIFIC_CHUUK("Pacific/Chuuk"),
    
    PACIFIC_POHNPEI("Pacific/Pohnpei"),
    
    PACIFIC_KOSRAE("Pacific/Kosrae"),
    
    ATLANTIC_FAROE("Atlantic/Faroe"),
    
    EUROPE_PARIS("Europe/Paris"),
    
    EUROPE_LONDON("Europe/London"),
    
    ASIA_TBILISI("Asia/Tbilisi"),
    
    AMERICA_CAYENNE("America/Cayenne"),
    
    AFRICA_ACCRA("Africa/Accra"),
    
    EUROPE_GIBRALTAR("Europe/Gibraltar"),
    
    AMERICA_GODTHAB("America/Godthab"),
    
    AMERICA_DANMARKSHAVN("America/Danmarkshavn"),
    
    AMERICA_SCORESBYSUND("America/Scoresbysund"),
    
    AMERICA_THULE("America/Thule"),
    
    EUROPE_ATHENS("Europe/Athens"),
    
    ATLANTIC_SOUTH_GEORGIA("Atlantic/South_Georgia"),
    
    AMERICA_GUATEMALA("America/Guatemala"),
    
    PACIFIC_GUAM("Pacific/Guam"),
    
    AFRICA_BISSAU("Africa/Bissau"),
    
    AMERICA_GUYANA("America/Guyana"),
    
    ASIA_HONG_KONG("Asia/Hong_Kong"),
    
    AMERICA_TEGUCIGALPA("America/Tegucigalpa"),
    
    AMERICA_PORT_AU_PRINCE("America/Port-au-Prince"),
    
    EUROPE_BUDAPEST("Europe/Budapest"),
    
    ASIA_JAKARTA("Asia/Jakarta"),
    
    ASIA_PONTIANAK("Asia/Pontianak"),
    
    ASIA_MAKASSAR("Asia/Makassar"),
    
    ASIA_JAYAPURA("Asia/Jayapura"),
    
    EUROPE_DUBLIN("Europe/Dublin"),
    
    ASIA_JERUSALEM("Asia/Jerusalem"),
    
    ASIA_KOLKATA("Asia/Kolkata"),
    
    INDIAN_CHAGOS("Indian/Chagos"),
    
    ASIA_BAGHDAD("Asia/Baghdad"),
    
    ASIA_TEHRAN("Asia/Tehran"),
    
    ATLANTIC_REYKJAVIK("Atlantic/Reykjavik"),
    
    EUROPE_ROME("Europe/Rome"),
    
    AMERICA_JAMAICA("America/Jamaica"),
    
    ASIA_AMMAN("Asia/Amman"),
    
    ASIA_TOKYO("Asia/Tokyo"),
    
    AFRICA_NAIROBI("Africa/Nairobi"),
    
    ASIA_BISHKEK("Asia/Bishkek"),
    
    PACIFIC_TARAWA("Pacific/Tarawa"),
    
    PACIFIC_ENDERBURY("Pacific/Enderbury"),
    
    PACIFIC_KIRITIMATI("Pacific/Kiritimati"),
    
    ASIA_PYONGYANG("Asia/Pyongyang"),
    
    ASIA_SEOUL("Asia/Seoul"),
    
    ASIA_ALMATY("Asia/Almaty"),
    
    ASIA_QYZYLORDA("Asia/Qyzylorda"),
    
    ASIA_QOSTANAY("Asia/Qostanay"),
    
    ASIA_AQTOBE("Asia/Aqtobe"),
    
    ASIA_AQTAU("Asia/Aqtau"),
    
    ASIA_ATYRAU("Asia/Atyrau"),
    
    ASIA_ORAL("Asia/Oral"),
    
    ASIA_BEIRUT("Asia/Beirut"),
    
    ASIA_COLOMBO("Asia/Colombo"),
    
    AFRICA_MONROVIA("Africa/Monrovia"),
    
    EUROPE_VILNIUS("Europe/Vilnius"),
    
    EUROPE_LUXEMBOURG("Europe/Luxembourg"),
    
    EUROPE_RIGA("Europe/Riga"),
    
    AFRICA_TRIPOLI("Africa/Tripoli"),
    
    AFRICA_CASABLANCA("Africa/Casablanca"),
    
    EUROPE_MONACO("Europe/Monaco"),
    
    EUROPE_CHISINAU("Europe/Chisinau"),
    
    PACIFIC_MAJURO("Pacific/Majuro"),
    
    PACIFIC_KWAJALEIN("Pacific/Kwajalein"),
    
    ASIA_YANGON("Asia/Yangon"),
    
    ASIA_ULAANBAATAR("Asia/Ulaanbaatar"),
    
    ASIA_HOVD("Asia/Hovd"),
    
    ASIA_CHOIBALSAN("Asia/Choibalsan"),
    
    ASIA_MACAU("Asia/Macau"),
    
    AMERICA_MARTINIQUE("America/Martinique"),
    
    EUROPE_MALTA("Europe/Malta"),
    
    INDIAN_MAURITIUS("Indian/Mauritius"),
    
    INDIAN_MALDIVES("Indian/Maldives"),
    
    AMERICA_MEXICO_CITY("America/Mexico_City"),
    
    AMERICA_CANCUN("America/Cancun"),
    
    AMERICA_MERIDA("America/Merida"),
    
    AMERICA_MONTERREY("America/Monterrey"),
    
    AMERICA_MATAMOROS("America/Matamoros"),
    
    AMERICA_MAZATLAN("America/Mazatlan"),
    
    AMERICA_CHIHUAHUA("America/Chihuahua"),
    
    AMERICA_OJINAGA("America/Ojinaga"),
    
    AMERICA_HERMOSILLO("America/Hermosillo"),
    
    AMERICA_TIJUANA("America/Tijuana"),
    
    AMERICA_BAHIA_BANDERAS("America/Bahia_Banderas"),
    
    ASIA_KUALA_LUMPUR("Asia/Kuala_Lumpur"),
    
    ASIA_KUCHING("Asia/Kuching"),
    
    AFRICA_MAPUTO("Africa/Maputo"),
    
    AFRICA_WINDHOEK("Africa/Windhoek"),
    
    PACIFIC_NOUMEA("Pacific/Noumea"),
    
    PACIFIC_NORFOLK("Pacific/Norfolk"),
    
    AFRICA_LAGOS("Africa/Lagos"),
    
    AMERICA_MANAGUA("America/Managua"),
    
    EUROPE_AMSTERDAM("Europe/Amsterdam"),
    
    EUROPE_OSLO("Europe/Oslo"),
    
    ASIA_KATHMANDU("Asia/Kathmandu"),
    
    PACIFIC_NAURU("Pacific/Nauru"),
    
    PACIFIC_NIUE("Pacific/Niue"),
    
    PACIFIC_AUCKLAND("Pacific/Auckland"),
    
    PACIFIC_CHATHAM("Pacific/Chatham"),
    
    AMERICA_PANAMA("America/Panama"),
    
    AMERICA_LIMA("America/Lima"),
    
    PACIFIC_TAHITI("Pacific/Tahiti"),
    
    PACIFIC_MARQUESAS("Pacific/Marquesas"),
    
    PACIFIC_GAMBIER("Pacific/Gambier"),
    
    PACIFIC_PORT_MORESBY("Pacific/Port_Moresby"),
    
    PACIFIC_BOUGAINVILLE("Pacific/Bougainville"),
    
    ASIA_MANILA("Asia/Manila"),
    
    ASIA_KARACHI("Asia/Karachi"),
    
    EUROPE_WARSAW("Europe/Warsaw"),
    
    AMERICA_MIQUELON("America/Miquelon"),
    
    PACIFIC_PITCAIRN("Pacific/Pitcairn"),
    
    AMERICA_PUERTO_RICO("America/Puerto_Rico"),
    
    ASIA_GAZA("Asia/Gaza"),
    
    ASIA_HEBRON("Asia/Hebron"),
    
    EUROPE_LISBON("Europe/Lisbon"),
    
    ATLANTIC_MADEIRA("Atlantic/Madeira"),
    
    ATLANTIC_AZORES("Atlantic/Azores"),
    
    PACIFIC_PALAU("Pacific/Palau"),
    
    AMERICA_ASUNCION("America/Asuncion"),
    
    ASIA_QATAR("Asia/Qatar"),
    
    INDIAN_REUNION("Indian/Reunion"),
    
    EUROPE_BUCHAREST("Europe/Bucharest"),
    
    EUROPE_BELGRADE("Europe/Belgrade"),
    
    EUROPE_KALININGRAD("Europe/Kaliningrad"),
    
    EUROPE_MOSCOW("Europe/Moscow"),
    
    EUROPE_SIMFEROPOL("Europe/Simferopol"),
    
    EUROPE_KIROV("Europe/Kirov"),
    
    EUROPE_ASTRAKHAN("Europe/Astrakhan"),
    
    EUROPE_VOLGOGRAD("Europe/Volgograd"),
    
    EUROPE_SARATOV("Europe/Saratov"),
    
    EUROPE_ULYANOVSK("Europe/Ulyanovsk"),
    
    EUROPE_SAMARA("Europe/Samara"),
    
    ASIA_YEKATERINBURG("Asia/Yekaterinburg"),
    
    ASIA_OMSK("Asia/Omsk"),
    
    ASIA_NOVOSIBIRSK("Asia/Novosibirsk"),
    
    ASIA_BARNAUL("Asia/Barnaul"),
    
    ASIA_TOMSK("Asia/Tomsk"),
    
    ASIA_NOVOKUZNETSK("Asia/Novokuznetsk"),
    
    ASIA_KRASNOYARSK("Asia/Krasnoyarsk"),
    
    ASIA_IRKUTSK("Asia/Irkutsk"),
    
    ASIA_CHITA("Asia/Chita"),
    
    ASIA_YAKUTSK("Asia/Yakutsk"),
    
    ASIA_KHANDYGA("Asia/Khandyga"),
    
    ASIA_VLADIVOSTOK("Asia/Vladivostok"),
    
    ASIA_UST_NERA("Asia/Ust-Nera"),
    
    ASIA_MAGADAN("Asia/Magadan"),
    
    ASIA_SAKHALIN("Asia/Sakhalin"),
    
    ASIA_SREDNEKOLYMSK("Asia/Srednekolymsk"),
    
    ASIA_KAMCHATKA("Asia/Kamchatka"),
    
    ASIA_ANADYR("Asia/Anadyr"),
    
    ASIA_RIYADH("Asia/Riyadh"),
    
    PACIFIC_GUADALCANAL("Pacific/Guadalcanal"),
    
    INDIAN_MAHE("Indian/Mahe"),
    
    AFRICA_KHARTOUM("Africa/Khartoum"),
    
    EUROPE_STOCKHOLM("Europe/Stockholm"),
    
    ASIA_SINGAPORE("Asia/Singapore"),
    
    AMERICA_PARAMARIBO("America/Paramaribo"),
    
    AFRICA_JUBA("Africa/Juba"),
    
    AFRICA_SAO_TOME("Africa/Sao_Tome"),
    
    AMERICA_EL_SALVADOR("America/El_Salvador"),
    
    ASIA_DAMASCUS("Asia/Damascus"),
    
    AMERICA_GRAND_TURK("America/Grand_Turk"),
    
    AFRICA_NDJAMENA("Africa/Ndjamena"),
    
    INDIAN_KERGUELEN("Indian/Kerguelen"),
    
    ASIA_BANGKOK("Asia/Bangkok"),
    
    ASIA_DUSHANBE("Asia/Dushanbe"),
    
    PACIFIC_FAKAOFO("Pacific/Fakaofo"),
    
    ASIA_DILI("Asia/Dili"),
    
    ASIA_ASHGABAT("Asia/Ashgabat"),
    
    AFRICA_TUNIS("Africa/Tunis"),
    
    PACIFIC_TONGATAPU("Pacific/Tongatapu"),
    
    EUROPE_ISTANBUL("Europe/Istanbul"),
    
    AMERICA_PORT_OF_SPAIN("America/Port_of_Spain"),
    
    PACIFIC_FUNAFUTI("Pacific/Funafuti"),
    
    ASIA_TAIPEI("Asia/Taipei"),
    
    EUROPE_KIEV("Europe/Kiev"),
    
    EUROPE_UZHGOROD("Europe/Uzhgorod"),
    
    EUROPE_ZAPOROZHYE("Europe/Zaporozhye"),
    
    PACIFIC_WAKE("Pacific/Wake"),
    
    AMERICA_NEW_YORK("America/New_York"),
    
    AMERICA_DETROIT("America/Detroit"),
    
    AMERICA_KENTUCKY_LOUISVILLE("America/Kentucky/Louisville"),
    
    AMERICA_KENTUCKY_MONTICELLO("America/Kentucky/Monticello"),
    
    AMERICA_INDIANA_INDIANAPOLIS("America/Indiana/Indianapolis"),
    
    AMERICA_INDIANA_VINCENNES("America/Indiana/Vincennes"),
    
    AMERICA_INDIANA_WINAMAC("America/Indiana/Winamac"),
    
    AMERICA_INDIANA_MARENGO("America/Indiana/Marengo"),
    
    AMERICA_INDIANA_PETERSBURG("America/Indiana/Petersburg"),
    
    AMERICA_INDIANA_VEVAY("America/Indiana/Vevay"),
    
    AMERICA_CHICAGO("America/Chicago"),
    
    AMERICA_INDIANA_TELL_CITY("America/Indiana/Tell_City"),
    
    AMERICA_INDIANA_KNOX("America/Indiana/Knox"),
    
    AMERICA_MENOMINEE("America/Menominee"),
    
    AMERICA_NORTH_DAKOTA_CENTER("America/North_Dakota/Center"),
    
    AMERICA_NORTH_DAKOTA_NEW_SALEM("America/North_Dakota/New_Salem"),
    
    AMERICA_NORTH_DAKOTA_BEULAH("America/North_Dakota/Beulah"),
    
    AMERICA_DENVER("America/Denver"),
    
    AMERICA_BOISE("America/Boise"),
    
    AMERICA_PHOENIX("America/Phoenix"),
    
    AMERICA_LOS_ANGELES("America/Los_Angeles"),
    
    AMERICA_ANCHORAGE("America/Anchorage"),
    
    AMERICA_JUNEAU("America/Juneau"),
    
    AMERICA_SITKA("America/Sitka"),
    
    AMERICA_METLAKATLA("America/Metlakatla"),
    
    AMERICA_YAKUTAT("America/Yakutat"),
    
    AMERICA_NOME("America/Nome"),
    
    AMERICA_ADAK("America/Adak"),
    
    PACIFIC_HONOLULU("Pacific/Honolulu"),
    
    AMERICA_MONTEVIDEO("America/Montevideo"),
    
    ASIA_SAMARKAND("Asia/Samarkand"),
    
    ASIA_TASHKENT("Asia/Tashkent"),
    
    AMERICA_CARACAS("America/Caracas"),
    
    ASIA_HO_CHI_MINH("Asia/Ho_Chi_Minh"),
    
    PACIFIC_EFATE("Pacific/Efate"),
    
    PACIFIC_WALLIS("Pacific/Wallis"),
    
    PACIFIC_APIA("Pacific/Apia"),
    
    AFRICA_JOHANNESBURG("Africa/Johannesburg");

    private String value;

    TimezoneEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimezoneEnum fromValue(String value) {
      for (TimezoneEnum b : TimezoneEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimezoneEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimezoneEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimezoneEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TimezoneEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private TimezoneEnum timezone = TimezoneEnum.AMERICA_NEW_YORK;

  public static final String SERIALIZED_NAME_SUNDAY = "sunday";
  @SerializedName(SERIALIZED_NAME_SUNDAY)
  private TimeschedulesSunday sunday;

  public static final String SERIALIZED_NAME_MONDAY = "monday";
  @SerializedName(SERIALIZED_NAME_MONDAY)
  private TimeschedulesSunday monday;

  public static final String SERIALIZED_NAME_TUESDAY = "tuesday";
  @SerializedName(SERIALIZED_NAME_TUESDAY)
  private TimeschedulesSunday tuesday;

  public static final String SERIALIZED_NAME_WEDNESDAY = "wednesday";
  @SerializedName(SERIALIZED_NAME_WEDNESDAY)
  private TimeschedulesSunday wednesday;

  public static final String SERIALIZED_NAME_THURSDAY = "thursday";
  @SerializedName(SERIALIZED_NAME_THURSDAY)
  private TimeschedulesSunday thursday;

  public static final String SERIALIZED_NAME_FRIDAY = "friday";
  @SerializedName(SERIALIZED_NAME_FRIDAY)
  private TimeschedulesSunday friday;

  public static final String SERIALIZED_NAME_SATURDAY = "saturday";
  @SerializedName(SERIALIZED_NAME_SATURDAY)
  private TimeschedulesSunday saturday;

  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_BY_USER_ID = "createdByUserId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_ID)
  private String createdByUserId;

  public static final String SERIALIZED_NAME_UPDATED_BY_USER_ID = "updatedByUserId";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY_USER_ID)
  private String updatedByUserId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public GetTimeSchedule200Response() {
  }

  public GetTimeSchedule200Response name(String name) {
    
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


  public GetTimeSchedule200Response timezone(TimezoneEnum timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nonnull
  public TimezoneEnum getTimezone() {
    return timezone;
  }


  public void setTimezone(TimezoneEnum timezone) {
    this.timezone = timezone;
  }


  public GetTimeSchedule200Response sunday(TimeschedulesSunday sunday) {
    
    this.sunday = sunday;
    return this;
  }

   /**
   * Get sunday
   * @return sunday
  **/
  @javax.annotation.Nonnull
  public TimeschedulesSunday getSunday() {
    return sunday;
  }


  public void setSunday(TimeschedulesSunday sunday) {
    this.sunday = sunday;
  }


  public GetTimeSchedule200Response monday(TimeschedulesSunday monday) {
    
    this.monday = monday;
    return this;
  }

   /**
   * Get monday
   * @return monday
  **/
  @javax.annotation.Nonnull
  public TimeschedulesSunday getMonday() {
    return monday;
  }


  public void setMonday(TimeschedulesSunday monday) {
    this.monday = monday;
  }


  public GetTimeSchedule200Response tuesday(TimeschedulesSunday tuesday) {
    
    this.tuesday = tuesday;
    return this;
  }

   /**
   * Get tuesday
   * @return tuesday
  **/
  @javax.annotation.Nonnull
  public TimeschedulesSunday getTuesday() {
    return tuesday;
  }


  public void setTuesday(TimeschedulesSunday tuesday) {
    this.tuesday = tuesday;
  }


  public GetTimeSchedule200Response wednesday(TimeschedulesSunday wednesday) {
    
    this.wednesday = wednesday;
    return this;
  }

   /**
   * Get wednesday
   * @return wednesday
  **/
  @javax.annotation.Nonnull
  public TimeschedulesSunday getWednesday() {
    return wednesday;
  }


  public void setWednesday(TimeschedulesSunday wednesday) {
    this.wednesday = wednesday;
  }


  public GetTimeSchedule200Response thursday(TimeschedulesSunday thursday) {
    
    this.thursday = thursday;
    return this;
  }

   /**
   * Get thursday
   * @return thursday
  **/
  @javax.annotation.Nonnull
  public TimeschedulesSunday getThursday() {
    return thursday;
  }


  public void setThursday(TimeschedulesSunday thursday) {
    this.thursday = thursday;
  }


  public GetTimeSchedule200Response friday(TimeschedulesSunday friday) {
    
    this.friday = friday;
    return this;
  }

   /**
   * Get friday
   * @return friday
  **/
  @javax.annotation.Nonnull
  public TimeschedulesSunday getFriday() {
    return friday;
  }


  public void setFriday(TimeschedulesSunday friday) {
    this.friday = friday;
  }


  public GetTimeSchedule200Response saturday(TimeschedulesSunday saturday) {
    
    this.saturday = saturday;
    return this;
  }

   /**
   * Get saturday
   * @return saturday
  **/
  @javax.annotation.Nonnull
  public TimeschedulesSunday getSaturday() {
    return saturday;
  }


  public void setSaturday(TimeschedulesSunday saturday) {
    this.saturday = saturday;
  }


  public GetTimeSchedule200Response id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GetTimeSchedule200Response createdByUserId(String createdByUserId) {
    
    this.createdByUserId = createdByUserId;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return createdByUserId
  **/
  @javax.annotation.Nullable
  public String getCreatedByUserId() {
    return createdByUserId;
  }


  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }


  public GetTimeSchedule200Response updatedByUserId(String updatedByUserId) {
    
    this.updatedByUserId = updatedByUserId;
    return this;
  }

   /**
   * ObjectId (unique 12 bytes ID)
   * @return updatedByUserId
  **/
  @javax.annotation.Nullable
  public String getUpdatedByUserId() {
    return updatedByUserId;
  }


  public void setUpdatedByUserId(String updatedByUserId) {
    this.updatedByUserId = updatedByUserId;
  }


  public GetTimeSchedule200Response createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GetTimeSchedule200Response updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSchedule200Response getTimeSchedule200Response = (GetTimeSchedule200Response) o;
    return Objects.equals(this.name, getTimeSchedule200Response.name) &&
        Objects.equals(this.timezone, getTimeSchedule200Response.timezone) &&
        Objects.equals(this.sunday, getTimeSchedule200Response.sunday) &&
        Objects.equals(this.monday, getTimeSchedule200Response.monday) &&
        Objects.equals(this.tuesday, getTimeSchedule200Response.tuesday) &&
        Objects.equals(this.wednesday, getTimeSchedule200Response.wednesday) &&
        Objects.equals(this.thursday, getTimeSchedule200Response.thursday) &&
        Objects.equals(this.friday, getTimeSchedule200Response.friday) &&
        Objects.equals(this.saturday, getTimeSchedule200Response.saturday) &&
        Objects.equals(this.id, getTimeSchedule200Response.id) &&
        Objects.equals(this.createdByUserId, getTimeSchedule200Response.createdByUserId) &&
        Objects.equals(this.updatedByUserId, getTimeSchedule200Response.updatedByUserId) &&
        Objects.equals(this.createdAt, getTimeSchedule200Response.createdAt) &&
        Objects.equals(this.updatedAt, getTimeSchedule200Response.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, timezone, sunday, monday, tuesday, wednesday, thursday, friday, saturday, id, createdByUserId, updatedByUserId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSchedule200Response {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    updatedByUserId: ").append(toIndentedString(updatedByUserId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("timezone");
    openapiFields.add("sunday");
    openapiFields.add("monday");
    openapiFields.add("tuesday");
    openapiFields.add("wednesday");
    openapiFields.add("thursday");
    openapiFields.add("friday");
    openapiFields.add("saturday");
    openapiFields.add("_id");
    openapiFields.add("createdByUserId");
    openapiFields.add("updatedByUserId");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("timezone");
    openapiRequiredFields.add("sunday");
    openapiRequiredFields.add("monday");
    openapiRequiredFields.add("tuesday");
    openapiRequiredFields.add("wednesday");
    openapiRequiredFields.add("thursday");
    openapiRequiredFields.add("friday");
    openapiRequiredFields.add("saturday");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetTimeSchedule200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetTimeSchedule200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTimeSchedule200Response is not found in the empty JSON string", GetTimeSchedule200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetTimeSchedule200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTimeSchedule200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTimeSchedule200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      // validate the required field `sunday`
      TimeschedulesSunday.validateJsonObject(jsonObj.getAsJsonObject("sunday"));
      // validate the required field `monday`
      TimeschedulesSunday.validateJsonObject(jsonObj.getAsJsonObject("monday"));
      // validate the required field `tuesday`
      TimeschedulesSunday.validateJsonObject(jsonObj.getAsJsonObject("tuesday"));
      // validate the required field `wednesday`
      TimeschedulesSunday.validateJsonObject(jsonObj.getAsJsonObject("wednesday"));
      // validate the required field `thursday`
      TimeschedulesSunday.validateJsonObject(jsonObj.getAsJsonObject("thursday"));
      // validate the required field `friday`
      TimeschedulesSunday.validateJsonObject(jsonObj.getAsJsonObject("friday"));
      // validate the required field `saturday`
      TimeschedulesSunday.validateJsonObject(jsonObj.getAsJsonObject("saturday"));
      if ((jsonObj.get("_id") != null && !jsonObj.get("_id").isJsonNull()) && !jsonObj.get("_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_id").toString()));
      }
      if ((jsonObj.get("createdByUserId") != null && !jsonObj.get("createdByUserId").isJsonNull()) && !jsonObj.get("createdByUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdByUserId").toString()));
      }
      if ((jsonObj.get("updatedByUserId") != null && !jsonObj.get("updatedByUserId").isJsonNull()) && !jsonObj.get("updatedByUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedByUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedByUserId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTimeSchedule200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTimeSchedule200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTimeSchedule200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTimeSchedule200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTimeSchedule200Response>() {
           @Override
           public void write(JsonWriter out, GetTimeSchedule200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTimeSchedule200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTimeSchedule200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTimeSchedule200Response
  * @throws IOException if the JSON string is invalid with respect to GetTimeSchedule200Response
  */
  public static GetTimeSchedule200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTimeSchedule200Response.class);
  }

 /**
  * Convert an instance of GetTimeSchedule200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

