
# Followers Object

## Structure

`FollowersObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Href` | `String` | Optional | This will always be set to null, as the Web API does not support it at the moment. | String getHref() | setHref(String href) |
| `Total` | `Integer` | Optional | The total number of followers. | Integer getTotal() | setTotal(Integer total) |

## Example (as JSON)

```json
{
  "href": "href2",
  "total": 82
}
```

