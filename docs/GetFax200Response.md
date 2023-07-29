

# GetFax200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callerIdNumber** | **String** |  |  |
|**callerDestination** | **String** |  |  |
|**pages** | **Integer** |  |  [optional] |
|**statusCode** | **Integer** |  |  [optional] |
|**transferedPages** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**error** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**order** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**_file** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**contact** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**number** | **String** | ObjectId (unique 12 bytes ID) |  |
|**faxAccount** | **String** | ObjectId (unique 12 bytes ID) |  |
|**retries** | **Integer** |  |  [optional] |
|**invoice** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**senderEmail** | **String** |  |  [optional] |
|**senderName** | **String** |  |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| FAILED | &quot;failed&quot; |
| SUCCESS | &quot;success&quot; |
| PROCESSING | &quot;processing&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SEND | &quot;send&quot; |
| RECEIVE | &quot;receive&quot; |



