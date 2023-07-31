

# Getdirectory200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**groups** | **List&lt;String&gt;** |  |  [optional] |
|**announcement** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**id** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOMERS | &quot;customers&quot; |
| GROUPS | &quot;groups&quot; |



