
# Cursor Paging Play History Object

## Structure

`CursorPagingPlayHistoryObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Href` | `String` | Optional | A link to the Web API endpoint returning the full result of the request. | String getHref() | setHref(String href) |
| `Limit` | `Integer` | Optional | The maximum number of items in the response (as set in the query or by default). | Integer getLimit() | setLimit(Integer limit) |
| `Next` | `String` | Optional | URL to the next page of items. ( `null` if none) | String getNext() | setNext(String next) |
| `Cursors` | [`CursorObject`](../../doc/models/cursor-object.md) | Optional | The cursors used to find the next set of items. | CursorObject getCursors() | setCursors(CursorObject cursors) |
| `Total` | `Integer` | Optional | The total number of items available to return. | Integer getTotal() | setTotal(Integer total) |
| `Items` | [`List<PlayHistoryObject>`](../../doc/models/play-history-object.md) | Optional | - | List<PlayHistoryObject> getItems() | setItems(List<PlayHistoryObject> items) |

## Example (as JSON)

```json
{
  "href": "href2",
  "limit": 16,
  "next": "next2",
  "cursors": {
    "after": "after8",
    "before": "before6"
  },
  "total": 110
}
```

