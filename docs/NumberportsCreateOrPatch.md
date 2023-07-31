

# NumberportsCreateOrPatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numbers** | **List&lt;String&gt;** |  |  |
|**name** | **String** |  |  |
|**typeOfService** | [**TypeOfServiceEnum**](#TypeOfServiceEnum) |  |  |
|**authorizedPerson** | **String** |  |  |
|**desiredDueDate** | **OffsetDateTime** |  |  |
|**accountNumber** | **String** |  |  |
|**accountPhoneNumber** | **String** |  |  |
|**office** | **String** | ObjectId (unique 12 bytes ID) |  |
|**e911** | [**E911Enum**](#E911Enum) |  |  [optional] |
|**destinationType** | [**DestinationTypeEnum**](#DestinationTypeEnum) |  |  |
|**destination** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**callForwardingDestination** | **String** |  |  [optional] |



## Enum: TypeOfServiceEnum

| Name | Value |
|---- | -----|
| BUSINESS | &quot;business&quot; |
| RESIDENCE | &quot;residence&quot; |



## Enum: E911Enum

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



