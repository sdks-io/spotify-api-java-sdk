
# Playlists Request

## Structure

`PlaylistsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The new name for the playlist, for example `"My New Playlist Title"` | String getName() | setName(String name) |
| `Public` | `Boolean` | Optional | If `true` the playlist will be public, if `false` it will be private. | Boolean getPublic() | setPublic(Boolean mPublic) |
| `Collaborative` | `Boolean` | Optional | If `true`, the playlist will become collaborative and other users will be able to modify the playlist in their Spotify client. <br/><br>_**Note**: You can only set `collaborative` to `true` on non-public playlists._ | Boolean getCollaborative() | setCollaborative(Boolean collaborative) |
| `Description` | `String` | Optional | Value for playlist description as displayed in Spotify Clients and in the Web API. | String getDescription() | setDescription(String description) |

## Example (as JSON)

```json
{
  "name": "Updated Playlist Name",
  "description": "Updated playlist description",
  "public": false,
  "collaborative": false
}
```

