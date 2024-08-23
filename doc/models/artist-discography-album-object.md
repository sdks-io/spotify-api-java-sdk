
# Artist Discography Album Object

## Structure

`ArtistDiscographyAlbumObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AlbumType` | [`AlbumTypeEnum`](../../doc/models/album-type-enum.md) | Required | The type of the album. | AlbumTypeEnum getAlbumType() | setAlbumType(AlbumTypeEnum albumType) |
| `TotalTracks` | `int` | Required | The number of tracks in the album. | int getTotalTracks() | setTotalTracks(int totalTracks) |
| `AvailableMarkets` | `List<String>` | Required | The markets in which the album is available: [ISO 3166-1 alpha-2 country codes](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _**NOTE**: an album is considered available in a market when at least 1 of its tracks is available in that market._ | List<String> getAvailableMarkets() | setAvailableMarkets(List<String> availableMarkets) |
| `ExternalUrls` | [`ExternalUrlObject`](../../doc/models/external-url-object.md) | Required | Known external URLs for this album. | ExternalUrlObject getExternalUrls() | setExternalUrls(ExternalUrlObject externalUrls) |
| `Href` | `String` | Required | A link to the Web API endpoint providing full details of the album. | String getHref() | setHref(String href) |
| `Id` | `String` | Required | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the album. | String getId() | setId(String id) |
| `Images` | [`List<ImageObject>`](../../doc/models/image-object.md) | Required | The cover art for the album in various sizes, widest first. | List<ImageObject> getImages() | setImages(List<ImageObject> images) |
| `Name` | `String` | Required | The name of the album. In case of an album takedown, the value may be an empty string. | String getName() | setName(String name) |
| `ReleaseDate` | `String` | Required | The date the album was first released. | String getReleaseDate() | setReleaseDate(String releaseDate) |
| `ReleaseDatePrecision` | [`ReleaseDatePrecisionEnum`](../../doc/models/release-date-precision-enum.md) | Required | The precision with which `release_date` value is known. | ReleaseDatePrecisionEnum getReleaseDatePrecision() | setReleaseDatePrecision(ReleaseDatePrecisionEnum releaseDatePrecision) |
| `Restrictions` | [`AlbumRestrictionObject`](../../doc/models/album-restriction-object.md) | Optional | Included in the response when a content restriction is applied. | AlbumRestrictionObject getRestrictions() | setRestrictions(AlbumRestrictionObject restrictions) |
| `Type` | [`Type2Enum`](../../doc/models/type-2-enum.md) | Required | The object type. | Type2Enum getType() | setType(Type2Enum type) |
| `Uri` | `String` | Required | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the album. | String getUri() | setUri(String uri) |
| `Artists` | [`List<SimplifiedArtistObject>`](../../doc/models/simplified-artist-object.md) | Required | The artists of the album. Each artist object includes a link in `href` to more detailed information about the artist. | List<SimplifiedArtistObject> getArtists() | setArtists(List<SimplifiedArtistObject> artists) |
| `AlbumGroup` | [`AlbumGroupEnum`](../../doc/models/album-group-enum.md) | Required | This field describes the relationship between the artist and the album. | AlbumGroupEnum getAlbumGroup() | setAlbumGroup(AlbumGroupEnum albumGroup) |

## Example (as JSON)

```json
{
  "album_type": "compilation",
  "total_tracks": 9,
  "available_markets": [
    "CA",
    "BR",
    "IT"
  ],
  "external_urls": {
    "spotify": "spotify6"
  },
  "href": "href4",
  "id": "2up3OPMp9Tb4dAKM2erWXQ",
  "images": [
    {
      "url": "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n",
      "height": 300,
      "width": 300
    }
  ],
  "name": "name2",
  "release_date": "1981-12",
  "release_date_precision": "year",
  "type": "album",
  "uri": "spotify:album:2up3OPMp9Tb4dAKM2erWXQ",
  "artists": [
    {
      "external_urls": {
        "spotify": "spotify6"
      },
      "href": "href2",
      "id": "id0",
      "name": "name0",
      "type": "artist"
    }
  ],
  "album_group": "compilation",
  "restrictions": {
    "reason": "explicit"
  }
}
```
