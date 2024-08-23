
# Currently Playing Object

## Structure

`CurrentlyPlayingObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Context` | [`ContextObject`](../../doc/models/context-object.md) | Optional | A Context Object. Can be `null`. | ContextObject getContext() | setContext(ContextObject context) |
| `Timestamp` | `Long` | Optional | Unix Millisecond Timestamp when data was fetched | Long getTimestamp() | setTimestamp(Long timestamp) |
| `ProgressMs` | `Integer` | Optional | Progress into the currently playing track or episode. Can be `null`. | Integer getProgressMs() | setProgressMs(Integer progressMs) |
| `IsPlaying` | `Boolean` | Optional | If something is currently playing, return `true`. | Boolean getIsPlaying() | setIsPlaying(Boolean isPlaying) |
| `Item` | `Object` | Optional | The currently playing track or episode. Can be `null`. | Object getItem() | setItem(Object item) |
| `CurrentlyPlayingType` | `String` | Optional | The object type of the currently playing item. Can be one of `track`, `episode`, `ad` or `unknown`. | String getCurrentlyPlayingType() | setCurrentlyPlayingType(String currentlyPlayingType) |
| `Actions` | [`DisallowsObject`](../../doc/models/disallows-object.md) | Optional | Allows to update the user interface based on which playback actions are available within the current context. | DisallowsObject getActions() | setActions(DisallowsObject actions) |

## Example (as JSON)

```json
{
  "context": {
    "type": "type8",
    "href": "href4",
    "external_urls": {
      "spotify": "spotify6"
    },
    "uri": "uri6"
  },
  "timestamp": 182,
  "progress_ms": 154,
  "is_playing": false,
  "item": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

