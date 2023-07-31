

# GetUserToken200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**user** | **String** | ObjectId (unique 12 bytes ID) |  |
|**token** | **String** |  |  |
|**expiresInYears** | **Integer** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
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



