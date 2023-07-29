

# GetMessageBrand200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**brandId** | **String** |  |  [optional] |
|**ein** | **String** |  |  |
|**user** | **String** | ObjectId (unique 12 bytes ID) |  |
|**order** | **String** | ObjectId (unique 12 bytes ID) |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**brandRelationship** | **String** |  |  [optional] |
|**vertical** | **String** |  |  [optional] |
|**entityType** | **String** |  |  [optional] |
|**cspId** | **String** |  |  [optional] |
|**einIssuingCountry** | **String** |  |  [optional] |
|**universalEin** | **String** |  |  [optional] |
|**referenceId** | **String** |  |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VERIFIED | &quot;verified&quot; |
| UNVERIFIED | &quot;unverified&quot; |



