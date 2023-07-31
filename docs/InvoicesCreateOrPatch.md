

# InvoicesCreateOrPatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** |  |  |
|**subtotal** | **Integer** |  |  |
|**tax** | **Integer** |  |  [optional] |
|**setup** | **Integer** |  |  [optional] |
|**discount** | **Integer** |  |  [optional] |
|**closedAt** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**error** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |
| COLLECTION | &quot;collection&quot; |
| ONHOLD | &quot;onHold&quot; |
| ERROR | &quot;error&quot; |



