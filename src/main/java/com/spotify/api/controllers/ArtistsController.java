/*
 * SpotifyWebAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.spotify.api.controllers;

import com.spotify.api.ApiHelper;
import com.spotify.api.Server;
import com.spotify.api.exceptions.ApiException;
import com.spotify.api.exceptions.ForbiddenException;
import com.spotify.api.exceptions.TooManyRequestsException;
import com.spotify.api.exceptions.UnauthorizedException;
import com.spotify.api.http.request.HttpMethod;
import com.spotify.api.http.response.ApiResponse;
import com.spotify.api.models.ArtistObject;
import com.spotify.api.models.ManyArtists;
import com.spotify.api.models.ManyTracks;
import com.spotify.api.models.PagingArtistDiscographyAlbumObject;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ArtistsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ArtistsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Get Spotify catalog information for a single artist identified by their unique Spotify ID.
     * @param  id  Required parameter: Example:
     * @return    Returns the ArtistObject wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ArtistObject> getAnArtist(
            final String id) throws ApiException, IOException {
        return prepareGetAnArtistRequest(id).execute();
    }

    /**
     * Get Spotify catalog information for a single artist identified by their unique Spotify ID.
     * @param  id  Required parameter: Example:
     * @return    Returns the ArtistObject wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ArtistObject>> getAnArtistAsync(
            final String id) {
        try { 
            return prepareGetAnArtistRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAnArtist.
     */
    private ApiCall<ApiResponse<ArtistObject>, ApiException> prepareGetAnArtistRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<ApiResponse<ArtistObject>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/artists/{id}")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oauth_2_0"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ArtistObject.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Bad or expired token. This can happen if the user revoked a token or\nthe access token has expired. You should re-authenticate the user.\n",
                                (reason, context) -> new UnauthorizedException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Bad OAuth request (wrong consumer key, bad nonce, expired\ntimestamp...). Unfortunately, re-authenticating the user won't help here.\n",
                                (reason, context) -> new ForbiddenException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("The app has exceeded its rate limits.\n",
                                (reason, context) -> new TooManyRequestsException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Spotify catalog information for several artists based on their Spotify IDs.
     * @param  ids  Required parameter: Example:
     * @return    Returns the ManyArtists wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ManyArtists> getMultipleArtists(
            final String ids) throws ApiException, IOException {
        return prepareGetMultipleArtistsRequest(ids).execute();
    }

    /**
     * Get Spotify catalog information for several artists based on their Spotify IDs.
     * @param  ids  Required parameter: Example:
     * @return    Returns the ManyArtists wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ManyArtists>> getMultipleArtistsAsync(
            final String ids) {
        try { 
            return prepareGetMultipleArtistsRequest(ids).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getMultipleArtists.
     */
    private ApiCall<ApiResponse<ManyArtists>, ApiException> prepareGetMultipleArtistsRequest(
            final String ids) throws IOException {
        return new ApiCall.Builder<ApiResponse<ManyArtists>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/artists")
                        .queryParam(param -> param.key("ids")
                                .value(ids))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oauth_2_0"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ManyArtists.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Bad or expired token. This can happen if the user revoked a token or\nthe access token has expired. You should re-authenticate the user.\n",
                                (reason, context) -> new UnauthorizedException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Bad OAuth request (wrong consumer key, bad nonce, expired\ntimestamp...). Unfortunately, re-authenticating the user won't help here.\n",
                                (reason, context) -> new ForbiddenException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("The app has exceeded its rate limits.\n",
                                (reason, context) -> new TooManyRequestsException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Spotify catalog information about an artist's albums.
     * @param  id  Required parameter: Example:
     * @param  includeGroups  Optional parameter: Example:
     * @param  market  Optional parameter: Example:
     * @param  limit  Optional parameter: Example: 20
     * @param  offset  Optional parameter: Example: 0
     * @return    Returns the PagingArtistDiscographyAlbumObject wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<PagingArtistDiscographyAlbumObject> getAnArtistsAlbums(
            final String id,
            final String includeGroups,
            final String market,
            final Integer limit,
            final Integer offset) throws ApiException, IOException {
        return prepareGetAnArtistsAlbumsRequest(id, includeGroups, market, limit, offset).execute();
    }

    /**
     * Get Spotify catalog information about an artist's albums.
     * @param  id  Required parameter: Example:
     * @param  includeGroups  Optional parameter: Example:
     * @param  market  Optional parameter: Example:
     * @param  limit  Optional parameter: Example: 20
     * @param  offset  Optional parameter: Example: 0
     * @return    Returns the PagingArtistDiscographyAlbumObject wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<PagingArtistDiscographyAlbumObject>> getAnArtistsAlbumsAsync(
            final String id,
            final String includeGroups,
            final String market,
            final Integer limit,
            final Integer offset) {
        try { 
            return prepareGetAnArtistsAlbumsRequest(id, includeGroups, market, limit,
            offset).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAnArtistsAlbums.
     */
    private ApiCall<ApiResponse<PagingArtistDiscographyAlbumObject>, ApiException> prepareGetAnArtistsAlbumsRequest(
            final String id,
            final String includeGroups,
            final String market,
            final Integer limit,
            final Integer offset) throws IOException {
        return new ApiCall.Builder<ApiResponse<PagingArtistDiscographyAlbumObject>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/artists/{id}/albums")
                        .queryParam(param -> param.key("include_groups")
                                .value(includeGroups).isRequired(false))
                        .queryParam(param -> param.key("market")
                                .value(market).isRequired(false))
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 20).isRequired(false))
                        .queryParam(param -> param.key("offset")
                                .value((offset != null) ? offset : 0).isRequired(false))
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oauth_2_0"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, PagingArtistDiscographyAlbumObject.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Bad or expired token. This can happen if the user revoked a token or\nthe access token has expired. You should re-authenticate the user.\n",
                                (reason, context) -> new UnauthorizedException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Bad OAuth request (wrong consumer key, bad nonce, expired\ntimestamp...). Unfortunately, re-authenticating the user won't help here.\n",
                                (reason, context) -> new ForbiddenException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("The app has exceeded its rate limits.\n",
                                (reason, context) -> new TooManyRequestsException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Spotify catalog information about an artist's top tracks by country.
     * @param  id  Required parameter: Example:
     * @param  market  Optional parameter: Example:
     * @return    Returns the ManyTracks wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ManyTracks> getAnArtistsTopTracks(
            final String id,
            final String market) throws ApiException, IOException {
        return prepareGetAnArtistsTopTracksRequest(id, market).execute();
    }

    /**
     * Get Spotify catalog information about an artist's top tracks by country.
     * @param  id  Required parameter: Example:
     * @param  market  Optional parameter: Example:
     * @return    Returns the ManyTracks wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ManyTracks>> getAnArtistsTopTracksAsync(
            final String id,
            final String market) {
        try { 
            return prepareGetAnArtistsTopTracksRequest(id, market).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAnArtistsTopTracks.
     */
    private ApiCall<ApiResponse<ManyTracks>, ApiException> prepareGetAnArtistsTopTracksRequest(
            final String id,
            final String market) throws IOException {
        return new ApiCall.Builder<ApiResponse<ManyTracks>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/artists/{id}/top-tracks")
                        .queryParam(param -> param.key("market")
                                .value(market).isRequired(false))
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oauth_2_0"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ManyTracks.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Bad or expired token. This can happen if the user revoked a token or\nthe access token has expired. You should re-authenticate the user.\n",
                                (reason, context) -> new UnauthorizedException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Bad OAuth request (wrong consumer key, bad nonce, expired\ntimestamp...). Unfortunately, re-authenticating the user won't help here.\n",
                                (reason, context) -> new ForbiddenException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("The app has exceeded its rate limits.\n",
                                (reason, context) -> new TooManyRequestsException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Spotify catalog information about artists similar to a given artist. Similarity is based
     * on analysis of the Spotify community's listening history.
     * @param  id  Required parameter: Example:
     * @return    Returns the ManyArtists wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ManyArtists> getAnArtistsRelatedArtists(
            final String id) throws ApiException, IOException {
        return prepareGetAnArtistsRelatedArtistsRequest(id).execute();
    }

    /**
     * Get Spotify catalog information about artists similar to a given artist. Similarity is based
     * on analysis of the Spotify community's listening history.
     * @param  id  Required parameter: Example:
     * @return    Returns the ManyArtists wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ManyArtists>> getAnArtistsRelatedArtistsAsync(
            final String id) {
        try { 
            return prepareGetAnArtistsRelatedArtistsRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAnArtistsRelatedArtists.
     */
    private ApiCall<ApiResponse<ManyArtists>, ApiException> prepareGetAnArtistsRelatedArtistsRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<ApiResponse<ManyArtists>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/artists/{id}/related-artists")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oauth_2_0"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ManyArtists.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Bad or expired token. This can happen if the user revoked a token or\nthe access token has expired. You should re-authenticate the user.\n",
                                (reason, context) -> new UnauthorizedException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Bad OAuth request (wrong consumer key, bad nonce, expired\ntimestamp...). Unfortunately, re-authenticating the user won't help here.\n",
                                (reason, context) -> new ForbiddenException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("The app has exceeded its rate limits.\n",
                                (reason, context) -> new TooManyRequestsException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}