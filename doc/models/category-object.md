
# Category Object

## Structure

`CategoryObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Href` | `String` | Required | A link to the Web API endpoint returning full details of the category. | String getHref() | setHref(String href) |
| `Icons` | [`List<ImageObject>`](../../doc/models/image-object.md) | Required | The category icon, in various sizes. | List<ImageObject> getIcons() | setIcons(List<ImageObject> icons) |
| `Id` | `String` | Required | The [Spotify category ID](/documentation/web-api/concepts/spotify-uris-ids) of the category. | String getId() | setId(String id) |
| `Name` | `String` | Required | The name of the category. | String getName() | setName(String name) |

## Example (as JSON)

```json
{
  "href": "href0",
  "icons": [
    {
      "url": "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n",
      "height": 300,
      "width": 300
    }
  ],
  "id": "equal",
  "name": "EQUAL"
}
```
