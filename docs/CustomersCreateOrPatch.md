

# CustomersCreateOrPatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**websiteUrl** | **String** |  |  [optional] |
|**logo** | **String** |  |  [optional] |
|**credit** | **Integer** |  |  [optional] |
|**adminUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**billingUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**callRecordingUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**supportUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**automaticRefillAmount** | **Integer** |  |  [optional] |
|**lowBalanceAlertAmount** | **Integer** |  |  [optional] |
|**internationalCalling** | [**InternationalCallingEnum**](#InternationalCallingEnum) |  |  [optional] |
|**createdByIP** | **String** |  |  [optional] |
|**mediaBypass** | [**MediaBypassEnum**](#MediaBypassEnum) |  |  [optional] |
|**accountLock** | [**AccountLockEnum**](#AccountLockEnum) |  |  [optional] |
|**callRecording** | [**CallRecordingEnum**](#CallRecordingEnum) |  |  [optional] |
|**cdrRetention** | **Integer** |  |  [optional] |
|**cnamLookUps** | [**CnamLookUpsEnum**](#CnamLookUpsEnum) |  |  [optional] |
|**holdMusic** | [**HoldMusicEnum**](#HoldMusicEnum) |  |  [optional] |
|**transcribeCalls** | [**TranscribeCallsEnum**](#TranscribeCallsEnum) |  |  [optional] |
|**maxOutboundCallRate** | **Integer** |  |  [optional] |
|**defaultBillMethod** | [**DefaultBillMethodEnum**](#DefaultBillMethodEnum) |  |  |



## Enum: InternationalCallingEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: MediaBypassEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: AccountLockEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: CallRecordingEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: CnamLookUpsEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: HoldMusicEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: TranscribeCallsEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: DefaultBillMethodEnum

| Name | Value |
|---- | -----|
| CREDIT | &quot;credit&quot; |
| PAYMENTMETHOD | &quot;paymentmethod&quot; |



