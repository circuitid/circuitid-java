

# Numbers


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inUse** | [**InUseEnum**](#InUseEnum) |  |  [optional] |
|**name** | **Object** |  |  |
|**countryCode** | **Object** |  |  |
|**amount** | **Object** |  |  [optional] |
|**perMinuteRate** | **Object** |  |  [optional] |
|**provider** | **Object** | ObjectId (unique 12 bytes ID) |  |
|**originalProvider** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**providerOrderId** | **Object** |  |  [optional] |
|**fax** | [**FaxEnum**](#FaxEnum) |  |  [optional] |
|**voice** | [**VoiceEnum**](#VoiceEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**sms** | [**SmsEnum**](#SmsEnum) |  |  [optional] |
|**mms** | [**MmsEnum**](#MmsEnum) |  |  [optional] |
|**changeRegionOrderId** | **Object** |  |  [optional] |
|**changeRegionOrderDate** | **Object** |  |  [optional] |
|**directoryListing** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**directoryListingOrderId** | **Object** |  |  [optional] |
|**directoryListingOrderDate** | **Object** |  |  [optional] |
|**callerName** | **Object** |  |  [optional] |
|**callerNameOrderId** | **Object** |  |  [optional] |
|**callerNameOrderDate** | **Object** |  |  [optional] |
|**e911** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**e911OrderId** | **Object** |  |  [optional] |
|**e911OrderDate** | **Object** |  |  [optional] |
|**messageCampaign** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**messageClass** | [**MessageClassEnum**](#MessageClassEnum) |  |  [optional] |
|**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) |  |  [optional] |
|**messageCampaignOrderId** | **Object** |  |  [optional] |
|**messageCampaignOrderDate** | **Object** |  |  [optional] |
|**e911Supported** | [**E911SupportedEnum**](#E911SupportedEnum) |  |  [optional] |
|**callerNameSupported** | [**CallerNameSupportedEnum**](#CallerNameSupportedEnum) |  |  [optional] |
|**directoryListingSupported** | [**DirectoryListingSupportedEnum**](#DirectoryListingSupportedEnum) |  |  [optional] |
|**messagingSupported** | [**MessagingSupportedEnum**](#MessagingSupportedEnum) |  |  [optional] |
|**destinationType** | [**DestinationTypeEnum**](#DestinationTypeEnum) |  |  |
|**destination** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**ref** | **Object** |  |  [optional] |
|**callForwardingDestination** | **Object** |  |  [optional] |



## Enum: InUseEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: FaxEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: VoiceEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: SmsEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: MmsEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



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
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: CallerNameSupportedEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: DirectoryListingSupportedEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: MessagingSupportedEnum

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



