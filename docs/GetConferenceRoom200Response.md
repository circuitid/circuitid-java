

# GetConferenceRoom200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**passcode** | **String** |  |  [optional] |
|**dialInPin** | **Integer** |  |  [optional] |
|**isUserRoom** | **Boolean** |  |  [optional] |
|**isChatRoom** | **Boolean** |  |  [optional] |
|**lobby** | [**LobbyEnum**](#LobbyEnum) |  |  [optional] |
|**requirePasscode** | [**RequirePasscodeEnum**](#RequirePasscodeEnum) |  |  [optional] |
|**share** | [**ShareEnum**](#ShareEnum) |  |  [optional] |
|**chatroom** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**id** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: LobbyEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: RequirePasscodeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: ShareEnum

| Name | Value |
|---- | -----|
| GROUPS | &quot;groups&quot; |
| CUSTOMERS | &quot;customers&quot; |



