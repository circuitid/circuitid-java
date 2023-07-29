

# GetAcceptedSender200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | **String** | ObjectId (unique 12 bytes ID) |  |
|**service** | **String** | ObjectId (unique 12 bytes ID) |  |
|**serviceRef** | **String** |  |  |
|**ref** | [**RefEnum**](#RefEnum) |  |  |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: RefEnum

| Name | Value |
|---- | -----|
| USERS | &quot;users&quot; |
| DOMAINS | &quot;domains&quot; |
| CONTACTS | &quot;contacts&quot; |



