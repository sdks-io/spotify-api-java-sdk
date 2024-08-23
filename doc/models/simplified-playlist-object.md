
# Simplified Playlist Object

## Structure

`SimplifiedPlaylistObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Collaborative` | `Boolean` | Optional | `true` if the owner allows other users to modify the playlist. | Boolean getCollaborative() | setCollaborative(Boolean collaborative) |
| `Description` | `String` | Optional | The playlist description. _Only returned for modified, verified playlists, otherwise_ `null`. | String getDescription() | setDescription(String description) |
| `ExternalUrls` | [`ExternalUrlObject`](../../doc/models/external-url-object.md) | Optional | Known external URLs for this playlist. | ExternalUrlObject getExternalUrls() | setExternalUrls(ExternalUrlObject externalUrls) |
| `Href` | `String` | Optional | A link to the Web API endpoint providing full details of the playlist. | String getHref() | setHref(String href) |
| `Id` | `String` | Optional | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the playlist. | String getId() | setId(String id) |
| `Images` | [`List<ImageObject>`](../../doc/models/image-object.md) | Optional | Images for the playlist. The array may be empty or contain up to three images. The images are returned by size in descending order. See [Working with Playlists](/documentation/web-api/concepts/playlists). _**Note**: If returned, the source URL for the image (`url`) is temporary and will expire in less than a day._ | List<ImageObject> getImages() | setImages(List<ImageObject> images) |
| `Name` | `String` | Optional | The name of the playlist. | String getName() | setName(String name) |
| `Owner` | [`PlaylistOwnerObject`](../../doc/models/playlist-owner-object.md) | Optional | The user who owns the playlist | PlaylistOwnerObject getOwner() | setOwner(PlaylistOwnerObject owner) |
| `Public` | `Boolean` | Optional | The playlist's public/private status: `true` the playlist is public, `false` the playlist is private, `null` the playlist status is not relevant. For more about public/private status, see [Working with Playlists](/documentation/web-api/concepts/playlists) | Boolean getPublic() | setPublic(Boolean mPublic) |
| `SnapshotId` | `String` | Optional | The version identifier for the current playlist. Can be supplied in other requests to target a specific playlist version | String getSnapshotId() | setSnapshotId(String snapshotId) |
| `Tracks` | [`PlaylistTracksRefObject`](../../doc/models/playlist-tracks-ref-object.md) | Optional | A collection containing a link ( `href` ) to the Web API endpoint where full details of the playlist's tracks can be retrieved, along with the `total` number of tracks in the playlist. Note, a track object may be `null`. This can happen if a track is no longer available. | PlaylistTracksRefObject getTracks() | setTracks(PlaylistTracksRefObject tracks) |
| `Type` | `String` | Optional | The object type: "playlist" | String getType() | setType(String type) |
| `Uri` | `String` | Optional | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the playlist. | String getUri() | setUri(String uri) |

## Example (as JSON)

```json
{
  "collaborative": false,
  "description": "description6",
  "external_urls": {
    "spotify": "spotify6"
  },
  "href": "href8",
  "id": "id6"
}
```

