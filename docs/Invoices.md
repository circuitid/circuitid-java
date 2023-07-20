

# Invoices


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Object** |  |  |
|**subtotal** | **Object** |  |  |
|**tax** | **Object** |  |  [optional] |
|**setup** | **Object** |  |  [optional] |
|**discount** | **Object** |  |  [optional] |
|**closedAt** | **Object** |  |  [optional] |
|**dueAt** | **Object** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**error** | **Object** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |
| COLLECTION | &quot;collection&quot; |
| ONHOLD | &quot;onHold&quot; |
| ERROR | &quot;error&quot; |



