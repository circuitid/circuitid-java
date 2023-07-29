

# GetClient200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**user** | **String** | ObjectId (unique 12 bytes ID) |  |
|**mac** | **String** |  |  |
|**httpUserAgent** | **String** |  |  [optional] |
|**manufacture** | [**ManufactureEnum**](#ManufactureEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: ManufactureEnum

| Name | Value |
|---- | -----|
| CISCO | &quot;cisco&quot; |
| GRANDSTREAM | &quot;grandstream&quot; |
| POLYCOM | &quot;polycom&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



