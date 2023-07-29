

# GetAnnouncement200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attachments** | **List&lt;String&gt;** |  |  [optional] |
|**name** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**voice** | **String** |  |  [optional] |
|**text** | **String** |  |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TTS | &quot;tts&quot; |
| MP3 | &quot;mp3&quot; |



