

# Developerapps


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **Object** |  |  |
|**description** | **Object** |  |  [optional] |
|**type** | **Object** |  |  |
|**visibility** | **Object** |  |  |
|**requireId** | **Object** |  |  [optional] |
|**isFree** | [**IsFreeEnum**](#IsFreeEnum) |  |  [optional] |
|**feeDescription** | **Object** |  |  [optional] |
|**integrationType** | **Object** |  |  |
|**services** | **Object** |  |  |
|**events** | **Object** |  |  [optional] |
|**user** | **Object** | ObjectId (unique 12 bytes ID) |  |
|**webhookUrl** | **Object** |  |  [optional] |
|**termsOfServiceUrl** | **Object** |  |  [optional] |
|**privacyPolicyUrl** | **Object** |  |  [optional] |
|**permissions** | **Object** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**webhookAuthType** | **Object** |  |  [optional] |
|**webhookUsername** | **Object** |  |  [optional] |
|**webhookPassword** | **Object** |  |  [optional] |
|**webhookTokenName** | **Object** |  |  [optional] |
|**webhookToken** | **Object** |  |  [optional] |



## Enum: IsFreeEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| DISABLED | &quot;disabled&quot; |
| SUSPENDED | &quot;suspended&quot; |
| ERROR | &quot;error&quot; |
| PENDING | &quot;pending&quot; |



