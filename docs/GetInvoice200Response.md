

# GetInvoice200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** |  |  |
|**subtotal** | **Integer** |  |  |
|**tax** | **Integer** |  |  [optional] |
|**setup** | **Integer** |  |  [optional] |
|**discount** | **Integer** |  |  [optional] |
|**closedAt** | **OffsetDateTime** |  |  [optional] |
|**dueAt** | **OffsetDateTime** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**error** | **String** |  |  [optional] |
|**id** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |
| COLLECTION | &quot;collection&quot; |
| ONHOLD | &quot;onHold&quot; |
| ERROR | &quot;error&quot; |



