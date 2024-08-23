
# Resume Point Object

## Structure

`ResumePointObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FullyPlayed` | `Boolean` | Optional | Whether or not the episode has been fully played by the user. | Boolean getFullyPlayed() | setFullyPlayed(Boolean fullyPlayed) |
| `ResumePositionMs` | `Integer` | Optional | The user's most recent position in the episode in milliseconds. | Integer getResumePositionMs() | setResumePositionMs(Integer resumePositionMs) |

## Example (as JSON)

```json
{
  "fully_played": false,
  "resume_position_ms": 150
}
```

