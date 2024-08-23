/*
 * SpotifyWebAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.spotify.api;

import com.spotify.api.exceptions.ApiException;
import com.spotify.api.models.OAuthScopeEnum;
import com.spotify.api.models.OAuthToken;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Interface for Authorization Code OAuth 2.
 */
public interface AuthorizationCodeAuth {

    /**
     * String value for oAuthClientId.
     * @return oAuthClientId
     */
    String getOAuthClientId();

    /**
     * String value for oAuthClientSecret.
     * @return oAuthClientSecret
     */
    String getOAuthClientSecret();

    /**
     * String value for oAuthRedirectUri.
     * @return oAuthRedirectUri
     */
    String getOAuthRedirectUri();

    /**
     * OAuthToken value for oAuthToken.
     * @return oAuthToken
     */
    OAuthToken getOAuthToken();

    /**
     * List of OAuthScopeEnum value for oAuthScopes.
     * @return oAuthScopes
     */
    List<OAuthScopeEnum> getOAuthScopes();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param oAuthClientId String value for credentials.
     * @param oAuthClientSecret String value for credentials.
     * @param oAuthRedirectUri String value for credentials.
     * @param oAuthToken OAuthToken value for credentials.
     * @param oAuthScopes List of OAuthScopeEnum value for credentials.
     * @return true if credentials matched.
     */
    boolean equals(String oAuthClientId, String oAuthClientSecret, String oAuthRedirectUri,
            OAuthToken oAuthToken, List<OAuthScopeEnum> oAuthScopes);

    /**
     * Build an authorization URL for taking the user's consent to access data.
     * @param state An opaque state string.
     * @param additionalParameters Additional parameters to add the the authorization URL.
     * @return Authorization URL
     */
    String buildAuthorizationUrl(final String state,
            final Map<String, String> additionalParameters);
    
    /**
     * Build an authorization URL for taking the user's consent to access data.
     * @return Authorization URL
     */
    String buildAuthorizationUrl();

    /**
     * Build an authorization URL for taking the user's consent to access data.
     * @param state An opaque state string.
     * @return Authorization URL
     */
    String buildAuthorizationUrl(final String state);

    /**
     * Fetch the OAuth token asynchronously.
     * @param authorizationCode Authorization code returned by the OAuth provider.
     * @param additionalParameters Additional parameters to send during authorization.
     */
    CompletableFuture<OAuthToken> fetchTokenAsync(final String authorizationCode,
            final Map<String, Object> additionalParameters);

    /**
     * Fetch the OAuth token asynchronously.
     * @param authorizationCode Authorization code returned by the OAuth provider.
     */
    CompletableFuture<OAuthToken> fetchTokenAsync(final String authorizationCode);

    /**
     * Fetch the OAuth token.
     * @param authorizationCode Authorization code returned by the OAuth provider.
     * @param additionalParameters Additional parameters to send during authorization.
     */
    OAuthToken fetchToken(String authorizationCode,
            Map<String, Object> additionalParameters) throws ApiException, IOException;

    /**
     * Fetch the OAuth token.
     * @param authorizationCode Authorization code returned by the OAuth provider
     */
    OAuthToken fetchToken(String authorizationCode) throws ApiException, IOException;

    /**
     * Refresh the OAuth token.
     * @param additionalParameters Additional parameters to send during token refresh.
     */
    CompletableFuture<OAuthToken> refreshTokenAsync(final Map<String, Object> additionalParameters);

    /**
     * Refresh the OAuth token.
     */
    CompletableFuture<OAuthToken> refreshTokenAsync();

    /**
     * Refresh the OAuth token.
     * @param additionalParameters Additional parameters to send during token refresh.
     */
    OAuthToken refreshToken(final Map<String, Object> additionalParameters) 
            throws ApiException, IOException;

    /**
     * Refresh the OAuth token.
     */
    OAuthToken refreshToken() throws ApiException, IOException;

    /**
     * Has the OAuth token expired?.
     * @return True if expired
     */
    boolean isTokenExpired();

}