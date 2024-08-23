
# Queue Object

## Structure

`QueueObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrentlyPlaying` | `Object` | Optional | The currently playing track or episode. Can be `null`. | Object getCurrentlyPlaying() | setCurrentlyPlaying(Object currentlyPlaying) |
| `Queue` | `List<Object>` | Optional | The tracks or episodes in the queue. Can be empty. | List<Object> getQueue() | setQueue(List<Object> queue) |

## Example (as JSON)

```json
{
  "currently_playing": {
    "key1": "val1",
    "key2": "val2"
  },
  "queue": [
    {
      "key1": "val1",
      "key2": "val2"
    },
    {
      "key1": "val1",
      "key2": "val2"
    },
    {
      "key1": "val1",
      "key2": "val2"
    }
  ]
}
```

