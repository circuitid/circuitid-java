

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
|**lengthType** | **Object** |  |  [optional] |
|**length** | **Object** |  |  [optional] |
|**appendChars** | **Object** |  |  [optional] |
|**prependChars** | **Object** |  |  [optional] |
|**rangeStart** | **Object** |  |  [optional] |
|**rangeEnd** | **Object** |  |  [optional] |
|**removeStartingChars** | **Object** |  |  [optional] |
|**removeEndingChars** | **Object** |  |  [optional] |
|**route** | [**RouteEnum**](#RouteEnum) |  |  |
|**routingType** | **Object** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: RouteEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| GROUP | &quot;group&quot; |
| PSTN | &quot;pstn&quot; |



