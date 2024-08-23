# Tracks

```java
TracksController tracksController = client.getTracksController();
```

## Class Name

`TracksController`

## Methods

* [Get-Track](../../doc/controllers/tracks.md#get-track)
* [Get-Several-Tracks](../../doc/controllers/tracks.md#get-several-tracks)
* [Get-Users-Saved-Tracks](../../doc/controllers/tracks.md#get-users-saved-tracks)
* [Save-Tracks-User](../../doc/controllers/tracks.md#save-tracks-user)
* [Remove-Tracks-User](../../doc/controllers/tracks.md#remove-tracks-user)
* [Check-Users-Saved-Tracks](../../doc/controllers/tracks.md#check-users-saved-tracks)
* [Get-Several-Audio-Features](../../doc/controllers/tracks.md#get-several-audio-features)
* [Get-Audio-Features](../../doc/controllers/tracks.md#get-audio-features)
* [Get-Audio-Analysis](../../doc/controllers/tracks.md#get-audio-analysis)
* [Get-Recommendations](../../doc/controllers/tracks.md#get-recommendations)


# Get-Track

Get Spotify catalog information for a single track identified by its
unique Spotify ID.

```java
CompletableFuture<ApiResponse<TrackObject>> getTrackAsync(
    final String id,
    final String market)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | - |
| `market` | `String` | Query, Optional | - |

## Response Type

[`TrackObject`](../../doc/models/track-object.md)

## Example Usage

```java
String id = "11dFghVXANMlKmJXsNCbNl";
String market = "ES";

tracksController.getTrackAsync(id, market).thenAccept(result -> {
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


# Get-Several-Tracks

Get Spotify catalog information for multiple tracks based on their Spotify IDs.

```java
CompletableFuture<ApiResponse<ManyTracks>> getSeveralTracksAsync(
    final String ids,
    final String market)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `ids` | `String` | Query, Required | - |
| `market` | `String` | Query, Optional | - |

## Response Type

[`ManyTracks`](../../doc/models/many-tracks.md)

## Example Usage

```java
String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B";
String market = "ES";

tracksController.getSeveralTracksAsync(ids, market).thenAccept(result -> {
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


# Get-Users-Saved-Tracks

Get a list of the songs saved in the current Spotify user's 'Your Music' library.

```java
CompletableFuture<ApiResponse<PagingSavedTrackObject>> getUsersSavedTracksAsync(
    final String market,
    final Integer limit,
    final Integer offset)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `market` | `String` | Query, Optional | - |
| `limit` | `Integer` | Query, Optional | - |
| `offset` | `Integer` | Query, Optional | - |

## Requires scope

### oauth_2_0

`user-library-read`

## Response Type

[`PagingSavedTrackObject`](../../doc/models/paging-saved-track-object.md)

## Example Usage

```java
String market = "ES";
Integer limit = 10;
Integer offset = 5;

tracksController.getUsersSavedTracksAsync(market, limit, offset).thenAccept(result -> {
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


# Save-Tracks-User

Save one or more tracks to the current user's 'Your Music' library.

```java
CompletableFuture<ApiResponse<Void>> saveTracksUserAsync(
    final String ids,
    final MeTracksRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `ids` | `String` | Query, Required | - |
| `body` | [`MeTracksRequest`](../../doc/models/me-tracks-request.md) | Body, Optional | - |

## Requires scope

### oauth_2_0

`user-library-modify`

## Response Type

`void`

## Example Usage

```java
String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B";
tracksController.saveTracksUserAsync(ids, null).thenAccept(result -> {
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


# Remove-Tracks-User

Remove one or more tracks from the current user's 'Your Music' library.

```java
CompletableFuture<ApiResponse<Void>> removeTracksUserAsync(
    final String ids,
    final MeTracksRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `ids` | `String` | Query, Required | - |
| `body` | [`MeTracksRequest1`](../../doc/models/me-tracks-request-1.md) | Body, Optional | - |

## Requires scope

### oauth_2_0

`user-library-modify`

## Response Type

`void`

## Example Usage

```java
String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B";
tracksController.removeTracksUserAsync(ids, null).thenAccept(result -> {
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


# Check-Users-Saved-Tracks

Check if one or more tracks is already saved in the current Spotify user's 'Your Music' library.

```java
CompletableFuture<ApiResponse<List<Boolean>>> checkUsersSavedTracksAsync(
    final String ids)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `ids` | `String` | Query, Required | - |

## Requires scope

### oauth_2_0

`user-library-read`

## Response Type

`List<Boolean>`

## Example Usage

```java
String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B";

tracksController.checkUsersSavedTracksAsync(ids).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response

```
[
  false,
  true
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Bad or expired token. This can happen if the user revoked a token or<br>the access token has expired. You should re-authenticate the user. | [`UnauthorizedException`](../../doc/models/unauthorized-exception.md) |
| 403 | Bad OAuth request (wrong consumer key, bad nonce, expired<br>timestamp...). Unfortunately, re-authenticating the user won't help here. | [`ForbiddenException`](../../doc/models/forbidden-exception.md) |
| 429 | The app has exceeded its rate limits. | [`TooManyRequestsException`](../../doc/models/too-many-requests-exception.md) |


# Get-Several-Audio-Features

Get audio features for multiple tracks based on their Spotify IDs.

```java
CompletableFuture<ApiResponse<ManyAudioFeatures>> getSeveralAudioFeaturesAsync(
    final String ids)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `ids` | `String` | Query, Required | - |

## Response Type

[`ManyAudioFeatures`](../../doc/models/many-audio-features.md)

## Example Usage

```java
String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B";

tracksController.getSeveralAudioFeaturesAsync(ids).thenAccept(result -> {
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


# Get-Audio-Features

Get audio feature information for a single track identified by its unique
Spotify ID.

```java
CompletableFuture<ApiResponse<AudioFeaturesObject>> getAudioFeaturesAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | - |

## Response Type

[`AudioFeaturesObject`](../../doc/models/audio-features-object.md)

## Example Usage

```java
String id = "11dFghVXANMlKmJXsNCbNl";

tracksController.getAudioFeaturesAsync(id).thenAccept(result -> {
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


# Get-Audio-Analysis

Get a low-level audio analysis for a track in the Spotify catalog. The audio analysis describes the track’s structure and musical content, including rhythm, pitch, and timbre.

```java
CompletableFuture<ApiResponse<AudioAnalysisObject>> getAudioAnalysisAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | - |

## Response Type

[`AudioAnalysisObject`](../../doc/models/audio-analysis-object.md)

## Example Usage

```java
String id = "11dFghVXANMlKmJXsNCbNl";

tracksController.getAudioAnalysisAsync(id).thenAccept(result -> {
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


# Get-Recommendations

Recommendations are generated based on the available information for a given seed entity and matched against similar artists and tracks. If there is sufficient information about the provided seeds, a list of tracks will be returned together with pool size details.

For artists and tracks that are very new or obscure there might not be enough data to generate a list of tracks.

```java
CompletableFuture<ApiResponse<RecommendationsObject>> getRecommendationsAsync(
    final Integer limit,
    final String market,
    final String seedArtists,
    final String seedGenres,
    final String seedTracks,
    final Double minAcousticness,
    final Double maxAcousticness,
    final Double targetAcousticness,
    final Double minDanceability,
    final Double maxDanceability,
    final Double targetDanceability,
    final Integer minDurationMs,
    final Integer maxDurationMs,
    final Integer targetDurationMs,
    final Double minEnergy,
    final Double maxEnergy,
    final Double targetEnergy,
    final Double minInstrumentalness,
    final Double maxInstrumentalness,
    final Double targetInstrumentalness,
    final Integer minKey,
    final Integer maxKey,
    final Integer targetKey,
    final Double minLiveness,
    final Double maxLiveness,
    final Double targetLiveness,
    final Double minLoudness,
    final Double maxLoudness,
    final Double targetLoudness,
    final Integer minMode,
    final Integer maxMode,
    final Integer targetMode,
    final Integer minPopularity,
    final Integer maxPopularity,
    final Integer targetPopularity,
    final Double minSpeechiness,
    final Double maxSpeechiness,
    final Double targetSpeechiness,
    final Double minTempo,
    final Double maxTempo,
    final Double targetTempo,
    final Integer minTimeSignature,
    final Integer maxTimeSignature,
    final Integer targetTimeSignature,
    final Double minValence,
    final Double maxValence,
    final Double targetValence)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | - |
| `market` | `String` | Query, Optional | - |
| `seedArtists` | `String` | Query, Optional | - |
| `seedGenres` | `String` | Query, Optional | - |
| `seedTracks` | `String` | Query, Optional | - |
| `minAcousticness` | `Double` | Query, Optional | - |
| `maxAcousticness` | `Double` | Query, Optional | - |
| `targetAcousticness` | `Double` | Query, Optional | - |
| `minDanceability` | `Double` | Query, Optional | - |
| `maxDanceability` | `Double` | Query, Optional | - |
| `targetDanceability` | `Double` | Query, Optional | - |
| `minDurationMs` | `Integer` | Query, Optional | - |
| `maxDurationMs` | `Integer` | Query, Optional | - |
| `targetDurationMs` | `Integer` | Query, Optional | - |
| `minEnergy` | `Double` | Query, Optional | - |
| `maxEnergy` | `Double` | Query, Optional | - |
| `targetEnergy` | `Double` | Query, Optional | - |
| `minInstrumentalness` | `Double` | Query, Optional | - |
| `maxInstrumentalness` | `Double` | Query, Optional | - |
| `targetInstrumentalness` | `Double` | Query, Optional | - |
| `minKey` | `Integer` | Query, Optional | - |
| `maxKey` | `Integer` | Query, Optional | - |
| `targetKey` | `Integer` | Query, Optional | - |
| `minLiveness` | `Double` | Query, Optional | - |
| `maxLiveness` | `Double` | Query, Optional | - |
| `targetLiveness` | `Double` | Query, Optional | - |
| `minLoudness` | `Double` | Query, Optional | - |
| `maxLoudness` | `Double` | Query, Optional | - |
| `targetLoudness` | `Double` | Query, Optional | - |
| `minMode` | `Integer` | Query, Optional | - |
| `maxMode` | `Integer` | Query, Optional | - |
| `targetMode` | `Integer` | Query, Optional | - |
| `minPopularity` | `Integer` | Query, Optional | - |
| `maxPopularity` | `Integer` | Query, Optional | - |
| `targetPopularity` | `Integer` | Query, Optional | - |
| `minSpeechiness` | `Double` | Query, Optional | - |
| `maxSpeechiness` | `Double` | Query, Optional | - |
| `targetSpeechiness` | `Double` | Query, Optional | - |
| `minTempo` | `Double` | Query, Optional | - |
| `maxTempo` | `Double` | Query, Optional | - |
| `targetTempo` | `Double` | Query, Optional | - |
| `minTimeSignature` | `Integer` | Query, Optional | - |
| `maxTimeSignature` | `Integer` | Query, Optional | - |
| `targetTimeSignature` | `Integer` | Query, Optional | - |
| `minValence` | `Double` | Query, Optional | - |
| `maxValence` | `Double` | Query, Optional | - |
| `targetValence` | `Double` | Query, Optional | - |

## Response Type

[`RecommendationsObject`](../../doc/models/recommendations-object.md)

## Example Usage

```java
Integer limit = 10;
String market = "ES";
String seedArtists = "4NHQUGzhtTLFvgF5SZesLK";
String seedGenres = "classical,country";
String seedTracks = "0c6xIDDpzE81m2q797ordA";

tracksController.getRecommendationsAsync(limit, market, seedArtists, seedGenres, seedTracks, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null).thenAccept(result -> {
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

