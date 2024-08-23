
# Time Interval Object

## Structure

`TimeIntervalObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Start` | `Double` | Optional | The starting point (in seconds) of the time interval. | Double getStart() | setStart(Double start) |
| `Duration` | `Double` | Optional | The duration (in seconds) of the time interval. | Double getDuration() | setDuration(Double duration) |
| `Confidence` | `Double` | Optional | The confidence, from 0.0 to 1.0, of the reliability of the interval.<br>**Constraints**: `>= 0`, `<= 1` | Double getConfidence() | setConfidence(Double confidence) |

## Example (as JSON)

```json
{
  "start": 0.49567,
  "duration": 2.18749,
  "confidence": 0.925
}
```

