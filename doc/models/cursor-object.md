
# Cursor Object

## Structure

`CursorObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `After` | `String` | Optional | The cursor to use as key to find the next page of items. | String getAfter() | setAfter(String after) |
| `Before` | `String` | Optional | The cursor to use as key to find the previous page of items. | String getBefore() | setBefore(String before) |

## Example (as JSON)

```json
{
  "after": "after2",
  "before": "before0"
}
```

