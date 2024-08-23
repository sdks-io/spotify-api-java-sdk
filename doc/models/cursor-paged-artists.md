
# Cursor Paged Artists

## Structure

`CursorPagedArtists`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Artists` | [`CursorPagingSimplifiedArtistObject`](../../doc/models/cursor-paging-simplified-artist-object.md) | Required | - | CursorPagingSimplifiedArtistObject getArtists() | setArtists(CursorPagingSimplifiedArtistObject artists) |

## Example (as JSON)

```json
{
  "artists": {
    "href": "href2",
    "limit": 214,
    "next": "next2",
    "cursors": {
      "after": "after8",
      "before": "before6"
    },
    "total": 52
  }
}
```

