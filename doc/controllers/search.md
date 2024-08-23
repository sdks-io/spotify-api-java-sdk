# Search

```java
SearchController searchController = client.getSearchController();
```

## Class Name

`SearchController`


# Search

Get Spotify catalog information about albums, artists, playlists, tracks, shows, episodes or audiobooks
that match a keyword string. Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets.

```java
CompletableFuture<ApiResponse<SearchItems>> searchAsync(
    final String q,
    final List<ItemTypeEnum> type,
    final String market,
    final Integer limit,
    final Integer offset,
    final IncludeExternalEnum includeExternal)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `q` | `String` | Query, Required | - |
| `type` | [`List<ItemTypeEnum>`](../../doc/models/item-type-enum.md) | Query, Required | - |
| `market` | `String` | Query, Optional | - |
| `limit` | `Integer` | Query, Optional | - |
| `offset` | `Integer` | Query, Optional | - |
| `includeExternal` | [`IncludeExternalEnum`](../../doc/models/include-external-enum.md) | Query, Optional | - |

## Response Type

[`SearchItems`](../../doc/models/search-items.md)

## Example Usage

```java
String q = "remaster%20track:Doxy%20artist:Miles%20Davis";
List<ItemTypeEnum> type = Arrays.asList(
    ItemTypeEnum.AUDIOBOOK,
    ItemTypeEnum.ALBUM,
    ItemTypeEnum.ARTIST
);

String market = "ES";
Integer limit = 10;
Integer offset = 5;

searchController.searchAsync(q, type, market, limit, offset, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Bad or expired token. This can happen if the user revoked a token or<br>the access token has expired. You should re-authenticate the user. | [`UnauthorizedException`](../../doc/models/unauthorized-exception.md) |
| 403 | Bad OAuth request (wrong consumer key, bad nonce, expired<br>timestamp...). Unfortunately, re-authenticating the user won't help here. | [`ForbiddenException`](../../doc/models/forbidden-exception.md) |
| 429 | The app has exceeded its rate limits. | [`TooManyRequestsException`](../../doc/models/too-many-requests-exception.md) |

