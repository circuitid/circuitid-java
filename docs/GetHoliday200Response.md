

# GetHoliday200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**_object** | **String** | ObjectId (unique 12 bytes ID) |  |
|**objectRef** | **String** |  |  |
|**dateTimeRanges** | **List&lt;List&lt;OffsetDateTime&gt;&gt;** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**destinationType** | [**DestinationTypeEnum**](#DestinationTypeEnum) |  |  |
|**destination** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**ref** | **String** |  |  [optional] |
|**callForwardingDestination** | **String** |  |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: DestinationTypeEnum

| Name | Value |
|---- | -----|
| ANNOUNCEMENTS | &quot;announcements&quot; |
| DIRECTORIES | &quot;directories&quot; |
| PARK | &quot;park&quot; |
| NUMBERS | &quot;numbers&quot; |
| MENUS | &quot;menus&quot; |
| USERS | &quot;users&quot; |
| SERVERS | &quot;servers&quot; |
| INBOUNDRULES | &quot;inboundrules&quot; |
| CALLQUEUES | &quot;callqueues&quot; |
| FAXACCOUNTS | &quot;faxaccounts&quot; |
| CALLFORWARDING | &quot;callforwarding&quot; |
| HANGUP | &quot;hangup&quot; |
| PHONEINBOUNDRULES | &quot;phoneinboundrules&quot; |
| VOICEMAILACCOUNTS | &quot;voicemailaccounts&quot; |



