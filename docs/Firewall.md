

# Firewall


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **Object** |  |  |
|**description** | **Object** |  |  [optional] |
|**priority** | **Object** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**target** | [**TargetEnum**](#TargetEnum) |  |  |
|**direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional] |
|**param** | **Object** |  |  |
|**hits** | **Object** |  |  [optional] |
|**ai** | [**AiEnum**](#AiEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**notificationHits** | **Object** |  |  [optional] |



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



## Enum: AiEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |



