

# Phoneoutboundruleactions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **Object** |  |  |
|**group** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**phoneoutboundrule** | **Object** | ObjectId (unique 12 bytes ID) |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**priority** | **Object** |  |  |
|**startingChars** | **Object** |  |  [optional] |
|**contains** | **Object** |  |  [optional] |
|**lengthType** | [**LengthTypeEnum**](#LengthTypeEnum) |  |  [optional] |
|**length** | **Object** |  |  [optional] |
|**appendChars** | **Object** |  |  [optional] |
|**prependChars** | **Object** |  |  [optional] |
|**rangeStart** | **Object** |  |  [optional] |
|**rangeEnd** | **Object** |  |  [optional] |
|**removeStartingChars** | **Object** |  |  [optional] |
|**removeEndingChars** | **Object** |  |  [optional] |
|**route** | [**RouteEnum**](#RouteEnum) |  |  |
|**routingType** | [**RoutingTypeEnum**](#RoutingTypeEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: LengthTypeEnum

| Name | Value |
|---- | -----|
| ATLEAST | &quot;atleast&quot; |
| EXACTLY | &quot;exactly&quot; |
| RANGE | &quot;range&quot; |
| ANY | &quot;any&quot; |
| NULL | &quot;null&quot; |



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



