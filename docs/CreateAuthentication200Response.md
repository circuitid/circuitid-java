

# CreateAuthentication200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** |  |  |
|**password** | **String** |  |  |
|**strategy** | [**StrategyEnum**](#StrategyEnum) |  |  |
|**id** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StrategyEnum

| Name | Value |
|---- | -----|
| LOCAL | &quot;local&quot; |



