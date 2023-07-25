

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
|**isPrimary** | [**IsPrimaryEnum**](#IsPrimaryEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**vmGreetingType** | [**VmGreetingTypeEnum**](#VmGreetingTypeEnum) |  |  [optional] |
|**vmTimeout** | **Object** |  |  [optional] |
|**vmFile** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**vmPlaybackNumber** | **Object** |  |  [optional] |
|**pin** | **Object** |  |  [optional] |
|**number** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**region** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**callerIdNumber** | **Object** |  |  [optional] |
|**adminPermission** | [**AdminPermissionEnum**](#AdminPermissionEnum) |  |  [optional] |
|**billingPermission** | [**BillingPermissionEnum**](#BillingPermissionEnum) |  |  [optional] |
|**phonePermission** | [**PhonePermissionEnum**](#PhonePermissionEnum) |  |  [optional] |
|**agilePermission** | [**AgilePermissionEnum**](#AgilePermissionEnum) |  |  [optional] |
|**jobServerPermission** | [**JobServerPermissionEnum**](#JobServerPermissionEnum) |  |  [optional] |
|**mediaServerPermission** | [**MediaServerPermissionEnum**](#MediaServerPermissionEnum) |  |  [optional] |
|**mailServerPermission** | [**MailServerPermissionEnum**](#MailServerPermissionEnum) |  |  [optional] |
|**superAdminPermission** | [**SuperAdminPermissionEnum**](#SuperAdminPermissionEnum) |  |  [optional] |
|**timezone** | **Object** |  |  |
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
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



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
| NULL | &quot;null&quot; |



## Enum: BillingPermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |
| NULL | &quot;null&quot; |



## Enum: PhonePermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |
| NULL | &quot;null&quot; |



## Enum: AgilePermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |
| NULL | &quot;null&quot; |



## Enum: JobServerPermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |
| NULL | &quot;null&quot; |



## Enum: MediaServerPermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |
| NULL | &quot;null&quot; |



## Enum: MailServerPermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |
| NULL | &quot;null&quot; |



## Enum: SuperAdminPermissionEnum

| Name | Value |
|---- | -----|
| R | &quot;r&quot; |
| RW | &quot;rw&quot; |
| NULL | &quot;null&quot; |



## Enum: VmTranscriptionEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _0 | &quot;0&quot; |



