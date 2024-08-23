
# Many Artists

## Structure

`ManyArtists`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Artists` | [`List<ArtistObject>`](../../doc/models/artist-object.md) | Required | - | List<ArtistObject> getArtists() | setArtists(List<ArtistObject> artists) |

## Example (as JSON)

```json
{
  "artists": [
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
      "href": "href2",
      "id": "id0"
    }
  ]
}
```

