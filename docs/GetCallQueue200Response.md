

# GetCallQueue200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**strategy** | [**StrategyEnum**](#StrategyEnum) |  |  |
|**announcePosition** | **Integer** |  |  [optional] |
|**moh** | **String** |  |  |
|**callerResumeTimeout** | **Integer** |  |  |
|**maxWaitTime** | **Integer** |  |  |
|**maxWaitTimeNoAgent** | **Integer** |  |  |
|**maxNoAnswer** | **Integer** |  |  |
|**noAnswerDelayTimeout** | **Integer** |  |  [optional] |
|**rejectTimeout** | **Integer** |  |  [optional] |
|**busyTimeout** | **Integer** |  |  [optional] |
|**wrapUpTimeout** | **Integer** |  |  [optional] |
|**timeBasedScore** | [**TimeBasedScoreEnum**](#TimeBasedScoreEnum) |  |  |
|**tierRulesApply** | [**TierRulesApplyEnum**](#TierRulesApplyEnum) |  |  |
|**tierRuleNoAgentNoWait** | [**TierRuleNoAgentNoWaitEnum**](#TierRuleNoAgentNoWaitEnum) |  |  |
|**tierRuleWaitSecond** | **Integer** |  |  [optional] |
|**tierRuleWaitMultiplyLevel** | [**TierRuleWaitMultiplyLevelEnum**](#TierRuleWaitMultiplyLevelEnum) |  |  |
|**abandonedResumeAllowed** | [**AbandonedResumeAllowedEnum**](#AbandonedResumeAllowedEnum) |  |  |
|**discardAbandonedAfter** | **Integer** |  |  [optional] |
|**maxWaitTimeNoAgentTimeReached** | **Integer** |  |  |
|**createdByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**updatedByUserId** | **String** | ObjectId (unique 12 bytes ID) |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StrategyEnum

| Name | Value |
|---- | -----|
| RING_ALL | &quot;ring-all&quot; |
| LONGEST_IDLE_AGENT | &quot;longest-idle-agent&quot; |
| ROUND_ROBIN | &quot;round-robin&quot; |
| TOP_DOWN | &quot;top-down&quot; |
| AGENT_WITH_LEAST_TALK_TIME | &quot;agent-with-least-talk-time&quot; |
| AGENT_WITH_FEWEST_CALLS | &quot;agent-with-fewest-calls&quot; |
| SEQUENTIALLY_BY_AGENT_ORDER | &quot;sequentially-by-agent-order&quot; |
| RANDOM | &quot;random&quot; |



## Enum: TimeBasedScoreEnum

| Name | Value |
|---- | -----|
| QUEUE | &quot;queue&quot; |
| SYSTEM | &quot;system&quot; |



## Enum: TierRulesApplyEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



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



