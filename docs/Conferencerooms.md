

# Conferencerooms


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **Object** |  |  |
|**passcode** | **Object** |  |  [optional] |
|**dialInPin** | **Object** |  |  [optional] |
|**isUserRoom** | [**IsUserRoomEnum**](#IsUserRoomEnum) |  |  [optional] |
|**isChatRoom** | [**IsChatRoomEnum**](#IsChatRoomEnum) |  |  [optional] |
|**lobby** | [**LobbyEnum**](#LobbyEnum) |  |  [optional] |
|**requirePasscode** | [**RequirePasscodeEnum**](#RequirePasscodeEnum) |  |  [optional] |
|**share** | [**ShareEnum**](#ShareEnum) |  |  [optional] |
|**chatroom** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |



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
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: RequirePasscodeEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: ShareEnum

| Name | Value |
|---- | -----|
| GROUPS | &quot;groups&quot; |
| CUSTOMERS | &quot;customers&quot; |



