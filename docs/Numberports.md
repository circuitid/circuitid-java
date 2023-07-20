

# Numberports


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **Object** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**typeOfService** | [**TypeOfServiceEnum**](#TypeOfServiceEnum) |  |  |
|**authorizedPerson** | **Object** |  |  |
|**desiredDueDate** | **Object** |  |  |
|**accountNumber** | **Object** |  |  |
|**accountPhoneNumber** | **Object** |  |  |
|**office** | **Object** | ObjectId (unique 12 bytes ID) |  |
|**e911** | [**E911Enum**](#E911Enum) |  |  [optional] |
|**invoice** | **Object** | ObjectId (unique 12 bytes ID) |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**destinationType** | [**DestinationTypeEnum**](#DestinationTypeEnum) |  |  |
|**destination** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**ref** | **Object** |  |  [optional] |
|**callForwardingDestination** | **Object** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IN | &quot;port in&quot; |
| OUT | &quot;port out&quot; |



## Enum: TypeOfServiceEnum

| Name | Value |
|---- | -----|
| BUSINESS | &quot;business&quot; |
| RESIDENCE | &quot;residence&quot; |



## Enum: E911Enum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSING | &quot;processing&quot; |
| FAILED | &quot;failed&quot; |
| ERROR | &quot;error&quot; |
| COMPLETED | &quot;completed&quot; |



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



