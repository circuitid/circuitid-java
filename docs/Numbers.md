

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
|**fax** | **Object** |  |  [optional] |
|**voice** | **Object** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**sms** | **Object** |  |  [optional] |
|**mms** | **Object** |  |  [optional] |
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
|**messageClass** | **Object** |  |  [optional] |
|**messageType** | **Object** |  |  [optional] |
|**messageCampaignOrderId** | **Object** |  |  [optional] |
|**messageCampaignOrderDate** | **Object** |  |  [optional] |
|**e911Supported** | **Object** |  |  [optional] |
|**callerNameSupported** | **Object** |  |  [optional] |
|**directoryListingSupported** | **Object** |  |  [optional] |
|**messagingSupported** | **Object** |  |  [optional] |
|**destinationType** | [**DestinationTypeEnum**](#DestinationTypeEnum) |  |  |
|**destination** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**ref** | **Object** |  |  [optional] |
|**callForwardingDestination** | **Object** |  |  [optional] |



## Enum: InUseEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: StatusEnum

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



