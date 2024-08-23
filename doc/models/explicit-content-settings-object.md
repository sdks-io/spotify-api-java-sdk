
# Explicit Content Settings Object

## Structure

`ExplicitContentSettingsObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FilterEnabled` | `Boolean` | Optional | When `true`, indicates that explicit content should not be played. | Boolean getFilterEnabled() | setFilterEnabled(Boolean filterEnabled) |
| `FilterLocked` | `Boolean` | Optional | When `true`, indicates that the explicit content setting is locked and can't be changed by the user. | Boolean getFilterLocked() | setFilterLocked(Boolean filterLocked) |

## Example (as JSON)

```json
{
  "filter_enabled": false,
  "filter_locked": false
}
```

