/*
 * SpotifyWebAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.spotify.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PagingFeaturedPlaylistObject type.
 */
public class PagingFeaturedPlaylistObject {
    private String message;
    private PagingPlaylistObject playlists;

    /**
     * Default constructor.
     */
    public PagingFeaturedPlaylistObject() {
    }

    /**
     * Initialization constructor.
     * @param  message  String value for message.
     * @param  playlists  PagingPlaylistObject value for playlists.
     */
    public PagingFeaturedPlaylistObject(
            String message,
            PagingPlaylistObject playlists) {
        this.message = message;
        this.playlists = playlists;
    }

    /**
     * Getter for Message.
     * The localized message of a playlist.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * The localized message of a playlist.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for Playlists.
     * @return Returns the PagingPlaylistObject
     */
    @JsonGetter("playlists")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PagingPlaylistObject getPlaylists() {
        return playlists;
    }

    /**
     * Setter for Playlists.
     * @param playlists Value for PagingPlaylistObject
     */
    @JsonSetter("playlists")
    public void setPlaylists(PagingPlaylistObject playlists) {
        this.playlists = playlists;
    }

    /**
     * Converts this PagingFeaturedPlaylistObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PagingFeaturedPlaylistObject [" + "message=" + message + ", playlists=" + playlists
                + "]";
    }

    /**
     * Builds a new {@link PagingFeaturedPlaylistObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PagingFeaturedPlaylistObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .message(getMessage())
                .playlists(getPlaylists());
        return builder;
    }

    /**
     * Class to build instances of {@link PagingFeaturedPlaylistObject}.
     */
    public static class Builder {
        private String message;
        private PagingPlaylistObject playlists;



        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for playlists.
         * @param  playlists  PagingPlaylistObject value for playlists.
         * @return Builder
         */
        public Builder playlists(PagingPlaylistObject playlists) {
            this.playlists = playlists;
            return this;
        }

        /**
         * Builds a new {@link PagingFeaturedPlaylistObject} object using the set fields.
         * @return {@link PagingFeaturedPlaylistObject}
         */
        public PagingFeaturedPlaylistObject build() {
            return new PagingFeaturedPlaylistObject(message, playlists);
        }
    }
}