

# Faxes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callerIdNumber** | **Object** |  |  |
|**callerDestination** | **Object** |  |  |
|**pages** | **Object** |  |  [optional] |
|**statusCode** | **Object** |  |  [optional] |
|**transferedPages** | **Object** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**error** | **Object** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**order** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**_file** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**contact** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**number** | **Object** | ObjectId (unique 12 bytes ID) |  |
|**faxAccount** | **Object** | ObjectId (unique 12 bytes ID) |  |
|**retries** | **Object** |  |  [optional] |
|**invoice** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**senderEmail** | **Object** |  |  [optional] |
|**senderName** | **Object** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| FAILED | &quot;failed&quot; |
| SUCCESS | &quot;success&quot; |
| PROCESSING | &quot;processing&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SEND | &quot;send&quot; |
| RECEIVE | &quot;receive&quot; |


