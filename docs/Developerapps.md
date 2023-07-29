

# Developerapps


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) |  |  |
|**requireId** | [**RequireIdEnum**](#RequireIdEnum) |  |  [optional] |
|**isFree** | [**IsFreeEnum**](#IsFreeEnum) |  |  [optional] |
|**feeDescription** | **String** |  |  [optional] |
|**integrationType** | [**IntegrationTypeEnum**](#IntegrationTypeEnum) |  |  |
|**services** | [**List&lt;ServicesEnum&gt;**](#List&lt;ServicesEnum&gt;) |  |  |
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) |  |  [optional] |
|**user** | **String** | ObjectId (unique 12 bytes ID) |  |
|**webhookUrl** | **String** |  |  [optional] |
|**termsOfServiceUrl** | **String** |  |  [optional] |
|**privacyPolicyUrl** | **String** |  |  [optional] |
|**permissions** | **Object** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**webhookAuthType** | [**WebhookAuthTypeEnum**](#WebhookAuthTypeEnum) |  |  [optional] |
|**webhookUsername** | **String** |  |  [optional] |
|**webhookPassword** | **String** |  |  [optional] |
|**webhookTokenName** | **String** |  |  [optional] |
|**webhookToken** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EVENTS | &quot;events&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |
| PUBLIC | &quot;public&quot; |



## Enum: RequireIdEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: IsFreeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: IntegrationTypeEnum

| Name | Value |
|---- | -----|
| WEBHOOK | &quot;webhook&quot; |
| CLIENT | &quot;client&quot; |



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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| DISABLED | &quot;disabled&quot; |
| SUSPENDED | &quot;suspended&quot; |
| ERROR | &quot;error&quot; |
| PENDING | &quot;pending&quot; |



## Enum: WebhookAuthTypeEnum

| Name | Value |
|---- | -----|
| HEADER | &quot;header&quot; |
| USERNAMEANDPASSWORD | &quot;usernameAndPassword&quot; |



