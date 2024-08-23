
# Recommendation Seed Object

## Structure

`RecommendationSeedObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AfterFilteringSize` | `Integer` | Optional | The number of tracks available after min\_\* and max\_\* filters have been applied. | Integer getAfterFilteringSize() | setAfterFilteringSize(Integer afterFilteringSize) |
| `AfterRelinkingSize` | `Integer` | Optional | The number of tracks available after relinking for regional availability. | Integer getAfterRelinkingSize() | setAfterRelinkingSize(Integer afterRelinkingSize) |
| `Href` | `String` | Optional | A link to the full track or artist data for this seed. For tracks this will be a link to a Track Object. For artists a link to an Artist Object. For genre seeds, this value will be `null`. | String getHref() | setHref(String href) |
| `Id` | `String` | Optional | The id used to select this seed. This will be the same as the string used in the `seed_artists`, `seed_tracks` or `seed_genres` parameter. | String getId() | setId(String id) |
| `InitialPoolSize` | `Integer` | Optional | The number of recommended tracks available for this seed. | Integer getInitialPoolSize() | setInitialPoolSize(Integer initialPoolSize) |
| `Type` | `String` | Optional | The entity type of this seed. One of `artist`, `track` or `genre`. | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "afterFilteringSize": 208,
  "afterRelinkingSize": 228,
  "href": "href4",
  "id": "id2",
  "initialPoolSize": 214
}
```

