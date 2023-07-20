

# Servers


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **Object** |  |  |
|**host** | **Object** |  |  |
|**port** | **Object** |  |  |
|**callerId** | **Object** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**domesticOutboundCallLimit** | **Object** |  |  |
|**domesticInboundCallLimit** | **Object** |  |  |
|**internationalOutboundCallLimit** | **Object** |  |  |
|**tollFreeChannelLimit** | **Object** |  |  |
|**inboundSipTrunkingOrder** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**outboundSipTrunkingOrder** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
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
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: BypassMediaEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: DisableRTPAutoAdjustEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



