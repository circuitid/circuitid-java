

# ServersCreateOrPatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**host** | **String** |  |  |
|**port** | **Integer** |  |  |
|**callerId** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**inboundSipTrunkingOrder** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**outboundSipTrunkingOrder** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**noInstantRingBack** | [**NoInstantRingBackEnum**](#NoInstantRingBackEnum) |  |  [optional] |
|**bypassMedia** | [**BypassMediaEnum**](#BypassMediaEnum) |  |  [optional] |
|**disableRTPAutoAdjust** | [**DisableRTPAutoAdjustEnum**](#DisableRTPAutoAdjustEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SIP | &quot;sip&quot; |
| SKYPE | &quot;skype&quot; |



## Enum: NoInstantRingBackEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: BypassMediaEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



## Enum: DisableRTPAutoAdjustEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



