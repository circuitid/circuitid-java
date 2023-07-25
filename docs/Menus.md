

# Menus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **Object** |  |  |
|**maxExtensionLength** | **Object** |  |  |
|**speechRecognition** | **Object** |  |  [optional] |
|**directory** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**greetingType** | **Object** |  |  |
|**greetingTTS** | **Object** |  |  [optional] |
|**menuVoice** | **Object** |  |  [optional] |
|**exitSound** | [**ExitSoundEnum**](#ExitSoundEnum) |  |  [optional] |
|**transferAnnouncement** | [**TransferAnnouncementEnum**](#TransferAnnouncementEnum) |  |  [optional] |
|**maxFailures** | **Object** |  |  [optional] |
|**maxTimeouts** | **Object** |  |  [optional] |
|**timeout** | **Object** |  |  [optional] |
|**touchToneTerminators** | [**TouchToneTerminatorsEnum**](#TouchToneTerminatorsEnum) |  |  [optional] |
|**timeschedule** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**destinationType** | **Object** |  |  [optional] |
|**destination** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**ref** | **Object** |  |  [optional] |
|**callForwardingDestination** | **Object** |  |  [optional] |



## Enum: ExitSoundEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| MP3 | &quot;mp3&quot; |



## Enum: TransferAnnouncementEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| MP3 | &quot;mp3&quot; |
| NONE | &quot;none&quot; |



## Enum: TouchToneTerminatorsEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



