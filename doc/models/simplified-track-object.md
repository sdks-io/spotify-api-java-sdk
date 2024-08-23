
# Simplified Track Object

## Structure

`SimplifiedTrackObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Artists` | [`List<SimplifiedArtistObject>`](../../doc/models/simplified-artist-object.md) | Optional | The artists who performed the track. Each artist object includes a link in `href` to more detailed information about the artist. | List<SimplifiedArtistObject> getArtists() | setArtists(List<SimplifiedArtistObject> artists) |
| `AvailableMarkets` | `List<String>` | Optional | A list of the countries in which the track can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code. | List<String> getAvailableMarkets() | setAvailableMarkets(List<String> availableMarkets) |
| `DiscNumber` | `Integer` | Optional | The disc number (usually `1` unless the album consists of more than one disc). | Integer getDiscNumber() | setDiscNumber(Integer discNumber) |
| `DurationMs` | `Integer` | Optional | The track length in milliseconds. | Integer getDurationMs() | setDurationMs(Integer durationMs) |
| `Explicit` | `Boolean` | Optional | Whether or not the track has explicit lyrics ( `true` = yes it does; `false` = no it does not OR unknown). | Boolean getExplicit() | setExplicit(Boolean explicit) |
| `ExternalUrls` | [`ExternalUrlObject`](../../doc/models/external-url-object.md) | Optional | External URLs for this track. | ExternalUrlObject getExternalUrls() | setExternalUrls(ExternalUrlObject externalUrls) |
| `Href` | `String` | Optional | A link to the Web API endpoint providing full details of the track. | String getHref() | setHref(String href) |
| `Id` | `String` | Optional | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the track. | String getId() | setId(String id) |
| `IsPlayable` | `Boolean` | Optional | Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking/) is applied. If `true`, the track is playable in the given market. Otherwise `false`. | Boolean getIsPlayable() | setIsPlayable(Boolean isPlayable) |
| `LinkedFrom` | [`LinkedTrackObject`](../../doc/models/linked-track-object.md) | Optional | Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking/) is applied and is only part of the response if the track linking, in fact, exists. The requested track has been replaced with a different track. The track in the `linked_from` object contains information about the originally requested track. | LinkedTrackObject getLinkedFrom() | setLinkedFrom(LinkedTrackObject linkedFrom) |
| `Restrictions` | [`TrackRestrictionObject`](../../doc/models/track-restriction-object.md) | Optional | Included in the response when a content restriction is applied. | TrackRestrictionObject getRestrictions() | setRestrictions(TrackRestrictionObject restrictions) |
| `Name` | `String` | Optional | The name of the track. | String getName() | setName(String name) |
| `PreviewUrl` | `String` | Optional | A URL to a 30 second preview (MP3 format) of the track. | String getPreviewUrl() | setPreviewUrl(String previewUrl) |
| `TrackNumber` | `Integer` | Optional | The number of the track. If an album has several discs, the track number is the number on the specified disc. | Integer getTrackNumber() | setTrackNumber(Integer trackNumber) |
| `Type` | `String` | Optional | The object type: "track". | String getType() | setType(String type) |
| `Uri` | `String` | Optional | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the track. | String getUri() | setUri(String uri) |
| `IsLocal` | `Boolean` | Optional | Whether or not the track is from a local file. | Boolean getIsLocal() | setIsLocal(Boolean isLocal) |

## Example (as JSON)

```json
{
  "artists": [
    {
      "external_urls": {
        "spotify": "spotify6"
      },
      "href": "href2",
      "id": "id0",
      "name": "name0",
      "type": "artist"
    },
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
  "available_markets": [
    "available_markets0",
    "available_markets1",
    "available_markets2"
  ],
  "disc_number": 162,
  "duration_ms": 226,
  "explicit": false
}
```

