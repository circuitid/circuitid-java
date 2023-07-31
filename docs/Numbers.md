

# Numbers


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inUse** | [**InUseEnum**](#InUseEnum) |  |  [optional] |
|**name** | **String** |  |  |
|**countryCode** | **String** |  |  |
|**amount** | **Integer** |  |  [optional] |
|**perMinuteRate** | **Integer** |  |  [optional] |
|**fax** | [**FaxEnum**](#FaxEnum) |  |  [optional] |
|**voice** | [**VoiceEnum**](#VoiceEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**sms** | [**SmsEnum**](#SmsEnum) |  |  [optional] |
|**mms** | [**MmsEnum**](#MmsEnum) |  |  [optional] |
|**directoryListing** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**callerName** | **String** |  |  [optional] |
|**e911** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**messageCampaign** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**messageClass** | [**MessageClassEnum**](#MessageClassEnum) |  |  [optional] |
|**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) |  |  [optional] |
|**e911Supported** | [**E911SupportedEnum**](#E911SupportedEnum) |  |  [optional] |
|**callerNameSupported** | [**CallerNameSupportedEnum**](#CallerNameSupportedEnum) |  |  [optional] |
|**directoryListingSupported** | [**DirectoryListingSupportedEnum**](#DirectoryListingSupportedEnum) |  |  [optional] |
|**messagingSupported** | [**MessagingSupportedEnum**](#MessagingSupportedEnum) |  |  [optional] |
|**destinationType** | [**DestinationTypeEnum**](#DestinationTypeEnum) |  |  |
|**destination** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**ref** | **String** |  |  [optional] |
|**callForwardingDestination** | **String** |  |  [optional] |



## Enum: InUseEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: FaxEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: VoiceEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: SmsEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: MmsEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: MessageClassEnum

| Name | Value |
|---- | -----|
| P2P | &quot;P2P&quot; |
| A2PLC | &quot;A2PLC&quot; |
| A2P8XX | &quot;A2P8XX&quot; |



## Enum: MessageTypeEnum

| Name | Value |
|---- | -----|
| SMS | &quot;SMS&quot; |
| MMS | &quot;MMS&quot; |
| SMSMMS | &quot;SMSMMS&quot; |
| SMS_ALT | &quot;SMS_ALT&quot; |
| MMS_ALT | &quot;MMS_ALT&quot; |
| SMSMMS_ALT | &quot;SMSMMS_ALT&quot; |



## Enum: E911SupportedEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: CallerNameSupportedEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: DirectoryListingSupportedEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: MessagingSupportedEnum

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



