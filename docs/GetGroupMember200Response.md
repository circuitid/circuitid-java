

# GetGroupMember200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**group** | **String** | ObjectId (unique 12 bytes ID) |  |
|**_object** | **String** | ObjectId (unique 12 bytes ID) |  |
|**priority** | **Integer** |  |  [optional] |
|**ref** | [**RefEnum**](#RefEnum) |  |  |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: RefEnum

| Name | Value |
|---- | -----|
| USERS | &quot;users&quot; |
| SERVERS | &quot;servers&quot; |
| IPADDRESSES | &quot;ipaddresses&quot; |



