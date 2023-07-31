

# GetFirewall200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**priority** | **Integer** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**target** | [**TargetEnum**](#TargetEnum) |  |  |
|**direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional] |
|**param** | **String** |  |  |
|**hits** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**id** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALLOW | &quot;allow&quot; |
| DENY | &quot;deny&quot; |



## Enum: TargetEnum

| Name | Value |
|---- | -----|
| NUMBERS | &quot;numbers&quot; |
| IPADDRESSES | &quot;ipaddresses&quot; |
| SMS | &quot;sms&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
| BOTH | &quot;both&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



