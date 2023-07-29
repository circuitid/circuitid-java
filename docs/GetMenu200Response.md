

# GetMenu200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**maxExtensionLength** | **Integer** |  |  |
|**speechRecognition** | [**SpeechRecognitionEnum**](#SpeechRecognitionEnum) |  |  [optional] |
|**directory** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**greetingType** | [**GreetingTypeEnum**](#GreetingTypeEnum) |  |  |
|**greetingTTS** | **String** |  |  [optional] |
|**menuVoice** | **String** |  |  [optional] |
|**exitSound** | [**ExitSoundEnum**](#ExitSoundEnum) |  |  [optional] |
|**transferAnnouncement** | [**TransferAnnouncementEnum**](#TransferAnnouncementEnum) |  |  [optional] |
|**maxFailures** | **Integer** |  |  [optional] |
|**maxTimeouts** | **Integer** |  |  [optional] |
|**timeout** | **Integer** |  |  [optional] |
|**touchToneTerminators** | [**TouchToneTerminatorsEnum**](#TouchToneTerminatorsEnum) |  |  [optional] |
|**timeschedule** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**destinationType** | [**DestinationTypeEnum**](#DestinationTypeEnum) |  |  [optional] |
|**destination** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**ref** | **String** |  |  [optional] |
|**callForwardingDestination** | **String** |  |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: SpeechRecognitionEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: GreetingTypeEnum

| Name | Value |
|---- | -----|
| TTS | &quot;tts&quot; |
| MP3 | &quot;mp3&quot; |



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
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: DestinationTypeEnum

| Name | Value |
|---- | -----|
| ANNOUNCEMENTS | &quot;announcements&quot; |
| DIRECTORIES | &quot;directories&quot; |
| PARK | &quot;park&quot; |
| NUMBERS | &quot;numbers&quot; |
| MENUS | &quot;menus&quot; |
| USERS | &quot;users&quot; |
| SERVERS | &quot;servers&quot; |
| INBOUNDRULES | &quot;inboundrules&quot; |
| CALLQUEUES | &quot;callqueues&quot; |
| FAXACCOUNTS | &quot;faxaccounts&quot; |
| CALLFORWARDING | &quot;callforwarding&quot; |
| HANGUP | &quot;hangup&quot; |
| PHONEINBOUNDRULES | &quot;phoneinboundrules&quot; |
| VOICEMAILACCOUNTS | &quot;voicemailaccounts&quot; |



