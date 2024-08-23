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
 * This is a model class for PlaylistsFollowersRequest type.
 */
public class PlaylistsFollowersRequest {
    private Boolean mPublic;

    /**
     * Default constructor.
     */
    public PlaylistsFollowersRequest() {
    }

    /**
     * Initialization constructor.
     * @param  mPublic  Boolean value for mPublic.
     */
    public PlaylistsFollowersRequest(
            Boolean mPublic) {
        this.mPublic = mPublic;
    }

    /**
     * Getter for Public.
     * Defaults to `true`. If `true` the playlist will be included in user's public playlists, if
     * `false` it will remain private.
     * @return Returns the Boolean
     */
    @JsonGetter("public")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPublic() {
        return mPublic;
    }

    /**
     * Setter for Public.
     * Defaults to `true`. If `true` the playlist will be included in user's public playlists, if
     * `false` it will remain private.
     * @param mPublic Value for Boolean
     */
    @JsonSetter("public")
    public void setPublic(Boolean mPublic) {
        this.mPublic = mPublic;
    }

    /**
     * Converts this PlaylistsFollowersRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PlaylistsFollowersRequest [" + "mPublic=" + mPublic + "]";
    }

    /**
     * Builds a new {@link PlaylistsFollowersRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PlaylistsFollowersRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .mPublic(getPublic());
        return builder;
    }

    /**
     * Class to build instances of {@link PlaylistsFollowersRequest}.
     */
    public static class Builder {
        private Boolean mPublic;



        /**
         * Setter for mPublic.
         * @param  mPublic  Boolean value for mPublic.
         * @return Builder
         */
        public Builder mPublic(Boolean mPublic) {
            this.mPublic = mPublic;
            return this;
        }

        /**
         * Builds a new {@link PlaylistsFollowersRequest} object using the set fields.
         * @return {@link PlaylistsFollowersRequest}
         */
        public PlaylistsFollowersRequest build() {
            return new PlaylistsFollowersRequest(mPublic);
        }
    }
}