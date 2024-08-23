
# Artist Object

## Structure

`ArtistObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExternalUrls` | [`ExternalUrlObject`](../../doc/models/external-url-object.md) | Optional | Known external URLs for this artist. | ExternalUrlObject getExternalUrls() | setExternalUrls(ExternalUrlObject externalUrls) |
| `Followers` | [`FollowersObject`](../../doc/models/followers-object.md) | Optional | Information about the followers of the artist. | FollowersObject getFollowers() | setFollowers(FollowersObject followers) |
| `Genres` | `List<String>` | Optional | A list of the genres the artist is associated with. If not yet classified, the array is empty. | List<String> getGenres() | setGenres(List<String> genres) |
| `Href` | `String` | Optional | A link to the Web API endpoint providing full details of the artist. | String getHref() | setHref(String href) |
| `Id` | `String` | Optional | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the artist. | String getId() | setId(String id) |
| `Images` | [`List<ImageObject>`](../../doc/models/image-object.md) | Optional | Images of the artist in various sizes, widest first. | List<ImageObject> getImages() | setImages(List<ImageObject> images) |
| `Name` | `String` | Optional | The name of the artist. | String getName() | setName(String name) |
| `Popularity` | `Integer` | Optional | The popularity of the artist. The value will be between 0 and 100, with 100 being the most popular. The artist's popularity is calculated from the popularity of all the artist's tracks. | Integer getPopularity() | setPopularity(Integer popularity) |
| `Type` | [`TypeEnum`](../../doc/models/type-enum.md) | Optional | The object type. | TypeEnum getType() | setType(TypeEnum type) |
| `Uri` | `String` | Optional | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the artist. | String getUri() | setUri(String uri) |

## Example (as JSON)

```json
{
  "genres": [
    "Prog rock",
    "Grunge"
  ],
  "external_urls": {
    "spotify": "spotify6"
  },
  "followers": {
    "href": "href0",
    "total": 82
  },
  "href": "href8",
  "id": "id0"
}
```

