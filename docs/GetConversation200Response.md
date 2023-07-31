

# GetConversation200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contacts** | **List&lt;Object&gt;** |  |  [optional] |
|**number** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) |  |  |
|**ref** | [**RefEnum**](#RefEnum) |  |  |
|**_object** | **String** | ObjectId (unique 12 bytes ID) |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**id** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;email&quot; |
| SMS | &quot;sms&quot; |
| PHONE | &quot;phone&quot; |



## Enum: RefEnum

| Name | Value |
|---- | -----|
| CONTACTS | &quot;contacts&quot; |
| USERS | &quot;users&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| RESOLVED | &quot;resolved&quot; |



