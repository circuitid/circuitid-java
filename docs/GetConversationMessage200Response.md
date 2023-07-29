

# GetConversationMessage200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conversation** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**from** | **Object** |  |  |
|**fromNumber** | **String** |  |  |
|**to** | **List&lt;Object&gt;** |  |  |
|**text** | **String** |  |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) |  |  |
|**attachments** | **List&lt;Object&gt;** |  |  [optional] |
|**referenceId** | **String** |  |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |



