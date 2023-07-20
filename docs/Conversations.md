

# Conversations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contacts** | **Object** |  |  [optional] |
|**number** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) |  |  |
|**ref** | [**RefEnum**](#RefEnum) |  |  |
|**_object** | **Object** | ObjectId (unique 12 bytes ID) |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |



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



