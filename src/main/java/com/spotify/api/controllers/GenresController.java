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
import com.spotify.api.models.ManyGenres;
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
public final class GenresController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public GenresController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieve a list of available genres seed parameter values for
     * [recommendations](/documentation/web-api/reference/get-recommendations).
     * @return    Returns the ManyGenres wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ManyGenres> getRecommendationGenres() throws ApiException, IOException {
        return prepareGetRecommendationGenresRequest().execute();
    }

    /**
     * Retrieve a list of available genres seed parameter values for
     * [recommendations](/documentation/web-api/reference/get-recommendations).
     * @return    Returns the ManyGenres wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ManyGenres>> getRecommendationGenresAsync() {
        try { 
            return prepareGetRecommendationGenresRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getRecommendationGenres.
     */
    private ApiCall<ApiResponse<ManyGenres>, ApiException> prepareGetRecommendationGenresRequest() throws IOException {
        return new ApiCall.Builder<ApiResponse<ManyGenres>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/recommendations/available-genre-seeds")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oauth_2_0"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ManyGenres.class))
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