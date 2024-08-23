
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `authorizationCodeAuth` | [`AuthorizationCodeAuth`](auth/oauth-2-authorization-code-grant.md) | The Credentials Setter for OAuth 2 Authorization Code Grant |

The API client can be initialized as follows:

```java
SpotifyWebAPIClient client = new SpotifyWebAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .authorizationCodeAuth(new AuthorizationCodeAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret",
            "OAuthRedirectUri"
        )
        .oAuthScopes(Arrays.asList(
                OAuthScopeEnum.APP_REMOTE_CONTROL,
                OAuthScopeEnum.PLAYLIST_READ_PRIVATE
            ))
        .build())
    .environment(Environment.PRODUCTION)
    .build();
```

API calls return an `ApiResponse` object that includes the following fields:

| Field | Description |
|  --- | --- |
| `getStatusCode` | Status code of the HTTP response |
| `getHeaders` | Headers of the HTTP response as a Hash |
| `getResult` | The deserialized body of the HTTP response as a String |

## Spotify Web APIClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getAlbumsController()` | Provides access to Albums controller. | `AlbumsController` |
| `getArtistsController()` | Provides access to Artists controller. | `ArtistsController` |
| `getAudiobooksController()` | Provides access to Audiobooks controller. | `AudiobooksController` |
| `getCategoriesController()` | Provides access to Categories controller. | `CategoriesController` |
| `getChaptersController()` | Provides access to Chapters controller. | `ChaptersController` |
| `getEpisodesController()` | Provides access to Episodes controller. | `EpisodesController` |
| `getGenresController()` | Provides access to Genres controller. | `GenresController` |
| `getMarketsController()` | Provides access to Markets controller. | `MarketsController` |
| `getPlayerController()` | Provides access to Player controller. | `PlayerController` |
| `getPlaylistsController()` | Provides access to Playlists controller. | `PlaylistsController` |
| `getSearchController()` | Provides access to Search controller. | `SearchController` |
| `getShowsController()` | Provides access to Shows controller. | `ShowsController` |
| `getTracksController()` | Provides access to Tracks controller. | `TracksController` |
| `getUsersController()` | Provides access to Users controller. | `UsersController` |
| `getOAuthAuthorizationController()` | Provides access to OAuthAuthorization controller. | `OAuthAuthorizationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getAuthorizationCodeAuth()` | The credentials to use with AuthorizationCodeAuth. | [`AuthorizationCodeAuth`](auth/oauth-2-authorization-code-grant.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

