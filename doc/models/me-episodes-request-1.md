
# Me Episodes Request 1

## Structure

`MeEpisodesRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ids` | `List<String>` | Optional | A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). <br/>A maximum of 50 items can be specified in one request. _**Note**: if the `ids` parameter is present in the query string, any IDs listed here in the body will be ignored._ | List<String> getIds() | setIds(List<String> ids) |

## Example (as JSON)

```json
{
  "ids": [
    "ids3"
  ]
}
```
