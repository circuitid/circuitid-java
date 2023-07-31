

# Messagebrands


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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VERIFIED | &quot;verified&quot; |
| UNVERIFIED | &quot;unverified&quot; |



