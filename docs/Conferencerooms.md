

# Conferencerooms


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**passcode** | **String** |  |  [optional] |
|**dialInPin** | **Integer** |  |  [optional] |
|**isUserRoom** | [**IsUserRoomEnum**](#IsUserRoomEnum) |  |  [optional] |
|**isChatRoom** | [**IsChatRoomEnum**](#IsChatRoomEnum) |  |  [optional] |
|**lobby** | [**LobbyEnum**](#LobbyEnum) |  |  [optional] |
|**requirePasscode** | [**RequirePasscodeEnum**](#RequirePasscodeEnum) |  |  [optional] |
|**share** | [**ShareEnum**](#ShareEnum) |  |  [optional] |
|**chatroom** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |



## Enum: IsUserRoomEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: IsChatRoomEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



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



