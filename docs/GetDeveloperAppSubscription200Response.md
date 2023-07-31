

# GetDeveloperAppSubscription200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**developerApp** | **String** | ObjectId (unique 12 bytes ID) |  |
|**_object** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**ref** | **String** |  |  [optional] |
|**permissions** | **Object** |  |  [optional] |
|**requireId** | [**RequireIdEnum**](#RequireIdEnum) |  |  [optional] |
|**services** | [**List&lt;ServicesEnum&gt;**](#List&lt;ServicesEnum&gt;) |  |  |
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) |  |  [optional] |
|**id** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: RequireIdEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: List&lt;ServicesEnum&gt;

| Name | Value |
|---- | -----|
| CALENDAREVENTS | &quot;calendarevents&quot; |
| CALLQUEUES | &quot;callqueues&quot; |
| CDRS | &quot;cdrs&quot; |
| CHATMESSAGES | &quot;chatmessages&quot; |
| CONTACTS | &quot;contacts&quot; |
| CONVERSATIONMESSAGES | &quot;conversationmessages&quot; |
| FAXES | &quot;faxes&quot; |
| FIREWALL | &quot;firewall&quot; |
| USERS | &quot;users&quot; |
| VOICEMAIL | &quot;voicemail&quot; |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| CREATE | &quot;create&quot; |
| PATCH | &quot;patch&quot; |
| REMOVED | &quot;removed&quot; |



