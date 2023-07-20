

# Developerapps


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **Object** |  |  |
|**description** | **Object** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) |  |  |
|**requireId** | [**RequireIdEnum**](#RequireIdEnum) |  |  [optional] |
|**isFree** | [**IsFreeEnum**](#IsFreeEnum) |  |  [optional] |
|**feeDescription** | **Object** |  |  [optional] |
|**integrationType** | [**IntegrationTypeEnum**](#IntegrationTypeEnum) |  |  |
|**services** | **Object** |  |  |
|**events** | **Object** |  |  [optional] |
|**user** | **Object** | ObjectId (unique 12 bytes ID) |  |
|**webhookUrl** | **Object** |  |  [optional] |
|**termsOfServiceUrl** | **Object** |  |  [optional] |
|**privacyPolicyUrl** | **Object** |  |  [optional] |
|**permissions** | **Object** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**webhookAuthType** | [**WebhookAuthTypeEnum**](#WebhookAuthTypeEnum) |  |  [optional] |
|**webhookUsername** | **Object** |  |  [optional] |
|**webhookPassword** | **Object** |  |  [optional] |
|**webhookTokenName** | **Object** |  |  [optional] |
|**webhookToken** | **Object** |  |  [optional] |



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
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: IsFreeEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: IntegrationTypeEnum

| Name | Value |
|---- | -----|
| WEBHOOK | &quot;webhook&quot; |
| CLIENT | &quot;client&quot; |



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



