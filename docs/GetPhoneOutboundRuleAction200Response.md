

# GetPhoneOutboundRuleAction200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**group** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**phoneoutboundrule** | **String** | ObjectId (unique 12 bytes ID) |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**priority** | **Integer** |  |  |
|**startingChars** | **String** |  |  [optional] |
|**contains** | **String** |  |  [optional] |
|**lengthType** | [**LengthTypeEnum**](#LengthTypeEnum) |  |  [optional] |
|**length** | **Integer** |  |  [optional] |
|**appendChars** | **String** |  |  [optional] |
|**prependChars** | **String** |  |  [optional] |
|**rangeStart** | **Integer** |  |  [optional] |
|**rangeEnd** | **Integer** |  |  [optional] |
|**removeStartingChars** | **Integer** |  |  [optional] |
|**removeEndingChars** | **Integer** |  |  [optional] |
|**route** | [**RouteEnum**](#RouteEnum) |  |  |
|**routingType** | [**RoutingTypeEnum**](#RoutingTypeEnum) |  |  [optional] |
|**id** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: LengthTypeEnum

| Name | Value |
|---- | -----|
| ATLEAST | &quot;atleast&quot; |
| EXACTLY | &quot;exactly&quot; |
| RANGE | &quot;range&quot; |
| ANY | &quot;any&quot; |



## Enum: RouteEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| GROUP | &quot;group&quot; |
| PSTN | &quot;pstn&quot; |



## Enum: RoutingTypeEnum

| Name | Value |
|---- | -----|
| PRIORITY | &quot;priority&quot; |
| LB | &quot;lb&quot; |
| SIMULTANEOUS | &quot;simultaneous&quot; |



