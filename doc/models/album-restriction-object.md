
# Album Restriction Object

## Structure

`AlbumRestrictionObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | [`ReasonEnum`](../../doc/models/reason-enum.md) | Optional | The reason for the restriction. Albums may be restricted if the content is not available in a given market, to the user's subscription type, or when the user's account is set to not play explicit content.<br>Additional reasons may be added in the future. | ReasonEnum getReason() | setReason(ReasonEnum reason) |

## Example (as JSON)

```json
{
  "reason": "explicit"
}
```

