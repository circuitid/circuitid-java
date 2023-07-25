

# Menus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **Object** |  |  |
|**maxExtensionLength** | **Object** |  |  |
|**speechRecognition** | [**SpeechRecognitionEnum**](#SpeechRecognitionEnum) |  |  [optional] |
|**directory** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**greetingType** | [**GreetingTypeEnum**](#GreetingTypeEnum) |  |  |
|**greetingTTS** | **Object** |  |  [optional] |
|**menuVoice** | **Object** |  |  [optional] |
|**exitSound** | [**ExitSoundEnum**](#ExitSoundEnum) |  |  [optional] |
|**transferAnnouncement** | [**TransferAnnouncementEnum**](#TransferAnnouncementEnum) |  |  [optional] |
|**maxFailures** | **Object** |  |  [optional] |
|**maxTimeouts** | **Object** |  |  [optional] |
|**timeout** | **Object** |  |  [optional] |
|**touchToneTerminators** | [**TouchToneTerminatorsEnum**](#TouchToneTerminatorsEnum) |  |  [optional] |
|**timeschedule** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**destinationType** | [**DestinationTypeEnum**](#DestinationTypeEnum) |  |  [optional] |
|**destination** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**ref** | **Object** |  |  [optional] |
|**callForwardingDestination** | **Object** |  |  [optional] |



## Enum: SpeechRecognitionEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



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
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



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



