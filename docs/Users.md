

# Users


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** |  |  |
|**password** | **String** |  |  |
|**sipPassword** | **String** |  |  |
|**turnPassword** | **String** |  |  [optional] |
|**first** | **String** |  |  |
|**last** | **String** |  |  |
|**mobilePhone** | **String** |  |  [optional] |
|**businessPhone** | **String** |  |  [optional] |
|**extension** | **Integer** |  |  [optional] |
|**customCallerId** | **Integer** |  |  [optional] |
|**jobTitle** | **String** |  |  [optional] |
|**department** | **String** |  |  [optional] |
|**office** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**avatar** | **String** |  |  [optional] |
|**language** | [**LanguageEnum**](#LanguageEnum) |  |  [optional] |
|**isPrimary** | [**IsPrimaryEnum**](#IsPrimaryEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**vmGreetingType** | [**VmGreetingTypeEnum**](#VmGreetingTypeEnum) |  |  [optional] |
|**vmTimeout** | **Integer** |  |  [optional] |
|**vmFile** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**vmPlaybackNumber** | **String** |  |  [optional] |
|**pin** | **Integer** |  |  [optional] |
|**number** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**region** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**callerIdNumber** | **String** |  |  [optional] |
|**adminPermission** | [**AdminPermissionEnum**](#AdminPermissionEnum) |  |  [optional] |
|**billingPermission** | [**BillingPermissionEnum**](#BillingPermissionEnum) |  |  [optional] |
|**phonePermission** | [**PhonePermissionEnum**](#PhonePermissionEnum) |  |  [optional] |
|**agilePermission** | [**AgilePermissionEnum**](#AgilePermissionEnum) |  |  [optional] |
|**jobServerPermission** | [**JobServerPermissionEnum**](#JobServerPermissionEnum) |  |  [optional] |
|**mediaServerPermission** | [**MediaServerPermissionEnum**](#MediaServerPermissionEnum) |  |  [optional] |
|**mailServerPermission** | [**MailServerPermissionEnum**](#MailServerPermissionEnum) |  |  [optional] |
|**superAdminPermission** | [**SuperAdminPermissionEnum**](#SuperAdminPermissionEnum) |  |  [optional] |
|**timezone** | **String** |  |  |
|**vmTranscription** | [**VmTranscriptionEnum**](#VmTranscriptionEnum) |  |  [optional] |
|**communication** | **Object** |  |  [optional] |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| FR | &quot;fr&quot; |
| EN | &quot;en&quot; |
| JA | &quot;ja&quot; |
| DE | &quot;de&quot; |
| ES | &quot;es&quot; |



## Enum: IsPrimaryEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



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



## Enum: AdminPermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |



## Enum: BillingPermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |



## Enum: PhonePermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |



## Enum: AgilePermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |



## Enum: JobServerPermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |



## Enum: MediaServerPermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |



## Enum: MailServerPermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |



## Enum: SuperAdminPermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |



## Enum: VmTranscriptionEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_0 | 0 |



