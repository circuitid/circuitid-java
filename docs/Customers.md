

# Customers


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **Object** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**websiteUrl** | **Object** |  |  [optional] |
|**logo** | **Object** |  |  [optional] |
|**credit** | **Object** |  |  [optional] |
|**adminUserId** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**billingUserId** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**callRecordingUserId** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**callForwardingCallLimit** | **Object** |  |  [optional] |
|**supportUserId** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**automaticRefillAmount** | **Object** |  |  [optional] |
|**lowBalanceAlertAmount** | **Object** |  |  [optional] |
|**lowBalanceAlertAt** | **Object** |  |  [optional] |
|**lowBalanceAlertCount** | **Object** |  |  [optional] |
|**lastAutomaticRefillInvoice** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**internationalCalling** | [**InternationalCallingEnum**](#InternationalCallingEnum) |  |  [optional] |
|**createdByIP** | **Object** |  |  [optional] |
|**callDebug** | [**CallDebugEnum**](#CallDebugEnum) |  |  [optional] |
|**mediaBypass** | [**MediaBypassEnum**](#MediaBypassEnum) |  |  [optional] |
|**accountLock** | [**AccountLockEnum**](#AccountLockEnum) |  |  [optional] |
|**callRecording** | [**CallRecordingEnum**](#CallRecordingEnum) |  |  [optional] |
|**cdrRetention** | **Object** |  |  [optional] |
|**cnamLookUps** | [**CnamLookUpsEnum**](#CnamLookUpsEnum) |  |  [optional] |
|**holdMusic** | [**HoldMusicEnum**](#HoldMusicEnum) |  |  [optional] |
|**transcribeCalls** | [**TranscribeCallsEnum**](#TranscribeCallsEnum) |  |  [optional] |
|**maxOutboundCallRate** | **Object** |  |  [optional] |
|**defaultBillMethod** | [**DefaultBillMethodEnum**](#DefaultBillMethodEnum) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| SUSPENDED | &quot;suspended&quot; |
| TERMINATED | &quot;terminated&quot; |
| FRAUD | &quot;fraud&quot; |



## Enum: InternationalCallingEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: CallDebugEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: MediaBypassEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: AccountLockEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: CallRecordingEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: CnamLookUpsEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: HoldMusicEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: TranscribeCallsEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: DefaultBillMethodEnum

| Name | Value |
|---- | -----|
| CREDIT | &quot;credit&quot; |
| PAYMENTMETHOD | &quot;paymentmethod&quot; |



