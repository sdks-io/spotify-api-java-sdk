/*
 * SpotifyWebAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.spotify.api.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spotify.api.ApiHelper;
import com.spotify.api.Server;
import com.spotify.api.exceptions.ApiException;
import com.spotify.api.exceptions.ForbiddenException;
import com.spotify.api.exceptions.TooManyRequestsException;
import com.spotify.api.exceptions.UnauthorizedException;
import com.spotify.api.http.request.HttpMethod;
import com.spotify.api.http.response.ApiResponse;
import com.spotify.api.models.ManySimplifiedShows;
import com.spotify.api.models.MeShowsRequest;
import com.spotify.api.models.PagingSavedShowObject;
import com.spotify.api.models.PagingSimplifiedEpisodeObject;
import com.spotify.api.models.ShowObject;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ShowsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ShowsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Get Spotify catalog information for a single show identified by its unique Spotify ID.
     * @param  id  Required parameter: Example:
     * @param  market  Optional parameter: Example:
     * @return    Returns the ShowObject wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ShowObject> getAShow(
            final String id,
            final String market) throws ApiException, IOException {
        return prepareGetAShowRequest(id, market).execute();
    }

    /**
     * Get Spotify catalog information for a single show identified by its unique Spotify ID.
     * @param  id  Required parameter: Example:
     * @param  market  Optional parameter: Example:
     * @return    Returns the ShowObject wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ShowObject>> getAShowAsync(
            final String id,
            final String market) {
        try { 
            return prepareGetAShowRequest(id, market).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAShow.
     */
    private ApiCall<ApiResponse<ShowObject>, ApiException> prepareGetAShowRequest(
            final String id,
            final String market) throws IOException {
        return new ApiCall.Builder<ApiResponse<ShowObject>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/shows/{id}")
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
                                response -> ApiHelper.deserialize(response, ShowObject.class))
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
     * Get Spotify catalog information for several shows based on their Spotify IDs.
     * @param  ids  Required parameter: Example:
     * @param  market  Optional parameter: Example:
     * @return    Returns the ManySimplifiedShows wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ManySimplifiedShows> getMultipleShows(
            final String ids,
            final String market) throws ApiException, IOException {
        return prepareGetMultipleShowsRequest(ids, market).execute();
    }

    /**
     * Get Spotify catalog information for several shows based on their Spotify IDs.
     * @param  ids  Required parameter: Example:
     * @param  market  Optional parameter: Example:
     * @return    Returns the ManySimplifiedShows wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ManySimplifiedShows>> getMultipleShowsAsync(
            final String ids,
            final String market) {
        try { 
            return prepareGetMultipleShowsRequest(ids, market).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getMultipleShows.
     */
    private ApiCall<ApiResponse<ManySimplifiedShows>, ApiException> prepareGetMultipleShowsRequest(
            final String ids,
            final String market) throws IOException {
        return new ApiCall.Builder<ApiResponse<ManySimplifiedShows>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/shows")
                        .queryParam(param -> param.key("ids")
                                .value(ids))
                        .queryParam(param -> param.key("market")
                                .value(market).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oauth_2_0"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ManySimplifiedShows.class))
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
     * Get Spotify catalog information about an show’s episodes. Optional parameters can be used to
     * limit the number of episodes returned.
     * @param  id  Required parameter: Example:
     * @param  market  Optional parameter: Example:
     * @param  limit  Optional parameter: Example: 20
     * @param  offset  Optional parameter: Example: 0
     * @return    Returns the PagingSimplifiedEpisodeObject wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<PagingSimplifiedEpisodeObject> getAShowsEpisodes(
            final String id,
            final String market,
            final Integer limit,
            final Integer offset) throws ApiException, IOException {
        return prepareGetAShowsEpisodesRequest(id, market, limit, offset).execute();
    }

    /**
     * Get Spotify catalog information about an show’s episodes. Optional parameters can be used to
     * limit the number of episodes returned.
     * @param  id  Required parameter: Example:
     * @param  market  Optional parameter: Example:
     * @param  limit  Optional parameter: Example: 20
     * @param  offset  Optional parameter: Example: 0
     * @return    Returns the PagingSimplifiedEpisodeObject wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<PagingSimplifiedEpisodeObject>> getAShowsEpisodesAsync(
            final String id,
            final String market,
            final Integer limit,
            final Integer offset) {
        try { 
            return prepareGetAShowsEpisodesRequest(id, market, limit, offset).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAShowsEpisodes.
     */
    private ApiCall<ApiResponse<PagingSimplifiedEpisodeObject>, ApiException> prepareGetAShowsEpisodesRequest(
            final String id,
            final String market,
            final Integer limit,
            final Integer offset) throws IOException {
        return new ApiCall.Builder<ApiResponse<PagingSimplifiedEpisodeObject>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/shows/{id}/episodes")
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
                                response -> ApiHelper.deserialize(response, PagingSimplifiedEpisodeObject.class))
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
     * Get a list of shows saved in the current Spotify user's library. Optional parameters can be
     * used to limit the number of shows returned.
     * @param  limit  Optional parameter: Example: 20
     * @param  offset  Optional parameter: Example: 0
     * @return    Returns the PagingSavedShowObject wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<PagingSavedShowObject> getUsersSavedShows(
            final Integer limit,
            final Integer offset) throws ApiException, IOException {
        return prepareGetUsersSavedShowsRequest(limit, offset).execute();
    }

    /**
     * Get a list of shows saved in the current Spotify user's library. Optional parameters can be
     * used to limit the number of shows returned.
     * @param  limit  Optional parameter: Example: 20
     * @param  offset  Optional parameter: Example: 0
     * @return    Returns the PagingSavedShowObject wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<PagingSavedShowObject>> getUsersSavedShowsAsync(
            final Integer limit,
            final Integer offset) {
        try { 
            return prepareGetUsersSavedShowsRequest(limit, offset).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getUsersSavedShows.
     */
    private ApiCall<ApiResponse<PagingSavedShowObject>, ApiException> prepareGetUsersSavedShowsRequest(
            final Integer limit,
            final Integer offset) throws IOException {
        return new ApiCall.Builder<ApiResponse<PagingSavedShowObject>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/me/shows")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 20).isRequired(false))
                        .queryParam(param -> param.key("offset")
                                .value((offset != null) ? offset : 0).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oauth_2_0"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, PagingSavedShowObject.class))
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
     * Save one or more shows to current Spotify user's library.
     * @param  ids  Required parameter: Example:
     * @param  body  Optional parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Void> saveShowsUser(
            final String ids,
            final MeShowsRequest body) throws ApiException, IOException {
        return prepareSaveShowsUserRequest(ids, body).execute();
    }

    /**
     * Save one or more shows to current Spotify user's library.
     * @param  ids  Required parameter: Example:
     * @param  body  Optional parameter: Example:
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Void>> saveShowsUserAsync(
            final String ids,
            final MeShowsRequest body) {
        try { 
            return prepareSaveShowsUserRequest(ids, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for saveShowsUser.
     */
    private ApiCall<ApiResponse<Void>, ApiException> prepareSaveShowsUserRequest(
            final String ids,
            final MeShowsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<Void>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/me/shows")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .queryParam(param -> param.key("ids")
                                .value(ids))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .withAuth(auth -> auth
                                .add("oauth_2_0"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
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
     * Delete one or more shows from current Spotify user's library.
     * @param  ids  Required parameter: Example:
     * @param  market  Optional parameter: Example:
     * @param  body  Optional parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Void> removeShowsUser(
            final String ids,
            final String market,
            final MeShowsRequest body) throws ApiException, IOException {
        return prepareRemoveShowsUserRequest(ids, market, body).execute();
    }

    /**
     * Delete one or more shows from current Spotify user's library.
     * @param  ids  Required parameter: Example:
     * @param  market  Optional parameter: Example:
     * @param  body  Optional parameter: Example:
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Void>> removeShowsUserAsync(
            final String ids,
            final String market,
            final MeShowsRequest body) {
        try { 
            return prepareRemoveShowsUserRequest(ids, market, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for removeShowsUser.
     */
    private ApiCall<ApiResponse<Void>, ApiException> prepareRemoveShowsUserRequest(
            final String ids,
            final String market,
            final MeShowsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<Void>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/me/shows")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .queryParam(param -> param.key("ids")
                                .value(ids))
                        .queryParam(param -> param.key("market")
                                .value(market).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .withAuth(auth -> auth
                                .add("oauth_2_0"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
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
     * Check if one or more shows is already saved in the current Spotify user's library.
     * @param  ids  Required parameter: Example:
     * @return    Returns the List of Boolean wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<List<Boolean>> checkUsersSavedShows(
            final String ids) throws ApiException, IOException {
        return prepareCheckUsersSavedShowsRequest(ids).execute();
    }

    /**
     * Check if one or more shows is already saved in the current Spotify user's library.
     * @param  ids  Required parameter: Example:
     * @return    Returns the List of Boolean wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<List<Boolean>>> checkUsersSavedShowsAsync(
            final String ids) {
        try { 
            return prepareCheckUsersSavedShowsRequest(ids).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for checkUsersSavedShows.
     */
    private ApiCall<ApiResponse<List<Boolean>>, ApiException> prepareCheckUsersSavedShowsRequest(
            final String ids) throws IOException {
        return new ApiCall.Builder<ApiResponse<List<Boolean>>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/me/shows/contains")
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
                                response -> ApiHelper.deserializeArray(response,
                                        Boolean[].class))
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