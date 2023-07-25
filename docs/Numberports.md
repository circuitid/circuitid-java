

# Numberports


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **Object** |  |  |
|**type** | **Object** |  |  |
|**typeOfService** | **Object** |  |  |
|**authorizedPerson** | **Object** |  |  |
|**desiredDueDate** | **Object** |  |  |
|**accountNumber** | **Object** |  |  |
|**accountPhoneNumber** | **Object** |  |  |
|**office** | **Object** | ObjectId (unique 12 bytes ID) |  |
|**e911** | **Object** |  |  [optional] |
|**invoice** | **Object** | ObjectId (unique 12 bytes ID) |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**destinationType** | **Object** |  |  |
|**destination** | **Object** | ObjectId (unique 12 bytes ID) |  [optional] |
|**ref** | **Object** |  |  [optional] |
|**callForwardingDestination** | **Object** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSING | &quot;processing&quot; |
| FAILED | &quot;failed&quot; |
| ERROR | &quot;error&quot; |
| COMPLETED | &quot;completed&quot; |



