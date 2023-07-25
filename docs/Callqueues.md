

# Callqueues


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **Object** |  |  |
|**strategy** | **Object** |  |  |
|**announcePosition** | **Object** |  |  [optional] |
|**moh** | **Object** |  |  |
|**callerResumeTimeout** | **Object** |  |  |
|**maxWaitTime** | **Object** |  |  |
|**maxWaitTimeNoAgent** | **Object** |  |  |
|**maxNoAnswer** | **Object** |  |  |
|**noAnswerDelayTimeout** | **Object** |  |  [optional] |
|**rejectTimeout** | **Object** |  |  [optional] |
|**busyTimeout** | **Object** |  |  [optional] |
|**wrapUpTimeout** | **Object** |  |  [optional] |
|**timeBasedScore** | [**TimeBasedScoreEnum**](#TimeBasedScoreEnum) |  |  |
|**tierRulesApply** | **Object** |  |  |
|**tierRuleNoAgentNoWait** | [**TierRuleNoAgentNoWaitEnum**](#TierRuleNoAgentNoWaitEnum) |  |  |
|**tierRuleWaitSecond** | **Object** |  |  [optional] |
|**tierRuleWaitMultiplyLevel** | [**TierRuleWaitMultiplyLevelEnum**](#TierRuleWaitMultiplyLevelEnum) |  |  |
|**abandonedResumeAllowed** | [**AbandonedResumeAllowedEnum**](#AbandonedResumeAllowedEnum) |  |  |
|**discardAbandonedAfter** | **Object** |  |  [optional] |
|**maxWaitTimeNoAgentTimeReached** | **Object** |  |  |



## Enum: TimeBasedScoreEnum

| Name | Value |
|---- | -----|
| QUEUE | &quot;queue&quot; |
| SYSTEM | &quot;system&quot; |



## Enum: TierRuleNoAgentNoWaitEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: TierRuleWaitMultiplyLevelEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: AbandonedResumeAllowedEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



