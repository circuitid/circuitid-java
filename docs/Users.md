

# Users


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **Object** |  |  |
|**password** | **Object** |  |  |
|**sipPassword** | **Object** |  |  |
|**turnPassword** | **Object** |  |  [optional] |
|**first** | **Object** |  |  |
|**last** | **Object** |  |  |
|**mobilePhone** | **Object** |  |  [optional] |
|**businessPhone** | **Object** |  |  [optional] |
|**extension** | **Object** |  |  [optional] |
|**customCallerId** | **Object** |  |  [optional] |
|**jobTitle** | **Object** |  |  [optional] |
|**department** | **Object** |  |  [optional] |
|**office** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**avatar** | **Object** |  |  [optional] |
|**language** | [**LanguageEnum**](#LanguageEnum) |  |  [optional] |
|**isPrimary** | **Object** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**vmGreetingType** | [**VmGreetingTypeEnum**](#VmGreetingTypeEnum) |  |  [optional] |
|**vmTimeout** | **Object** |  |  [optional] |
|**vmFile** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**vmPlaybackNumber** | **Object** |  |  [optional] |
|**pin** | **Object** |  |  [optional] |
|**number** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**region** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**callerIdNumber** | **Object** |  |  [optional] |
|**adminPermission** | **Object** |  |  [optional] |
|**billingPermission** | **Object** |  |  [optional] |
|**phonePermission** | **Object** |  |  [optional] |
|**agilePermission** | **Object** |  |  [optional] |
|**jobServerPermission** | **Object** |  |  [optional] |
|**mediaServerPermission** | **Object** |  |  [optional] |
|**mailServerPermission** | **Object** |  |  [optional] |
|**superAdminPermission** | **Object** |  |  [optional] |
|**timezone** | **Object** |  |  |
|**vmTranscription** | **Object** |  |  [optional] |
|**communication** | **Object** |  |  [optional] |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| FR | &quot;fr&quot; |
| EN | &quot;en&quot; |
| JA | &quot;ja&quot; |
| DE | &quot;de&quot; |
| ES | &quot;es&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| DISABLED | &quot;disabled&quot; |
| TERMINATED | &quot;terminated&quot; |



## Enum: VmGreetingTypeEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| MP3 | &quot;mp3&quot; |
| NUMBER | &quot;number&quot; |



