/*
 * SpotifyWebAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.spotify.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for MeFollowingRequest type.
 */
public class MeFollowingRequest {
    private List<String> ids;

    /**
     * Default constructor.
     */
    public MeFollowingRequest() {
    }

    /**
     * Initialization constructor.
     * @param  ids  List of String value for ids.
     */
    public MeFollowingRequest(
            List<String> ids) {
        this.ids = ids;
    }

    /**
     * Getter for Ids.
     * A JSON array of the artist or user [Spotify
     * IDs](/documentation/web-api/concepts/spotify-uris-ids). For example:
     * `{ids:["74ASZWbe4lXaubB36ztrGX", "08td7MxkoHQkXnWAYD8d6Q"]}`. A maximum of 50 IDs can be sent
     * in one request. _**Note**: if the `ids` parameter is present in the query string, any IDs
     * listed here in the body will be ignored._
     * @return Returns the List of String
     */
    @JsonGetter("ids")
    public List<String> getIds() {
        return ids;
    }

    /**
     * Setter for Ids.
     * A JSON array of the artist or user [Spotify
     * IDs](/documentation/web-api/concepts/spotify-uris-ids). For example:
     * `{ids:["74ASZWbe4lXaubB36ztrGX", "08td7MxkoHQkXnWAYD8d6Q"]}`. A maximum of 50 IDs can be sent
     * in one request. _**Note**: if the `ids` parameter is present in the query string, any IDs
     * listed here in the body will be ignored._
     * @param ids Value for List of String
     */
    @JsonSetter("ids")
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    /**
     * Converts this MeFollowingRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MeFollowingRequest [" + "ids=" + ids + "]";
    }

    /**
     * Builds a new {@link MeFollowingRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MeFollowingRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(ids);
        return builder;
    }

    /**
     * Class to build instances of {@link MeFollowingRequest}.
     */
    public static class Builder {
        private List<String> ids;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  ids  List of String value for ids.
         */
        public Builder(List<String> ids) {
            this.ids = ids;
        }

        /**
         * Setter for ids.
         * @param  ids  List of String value for ids.
         * @return Builder
         */
        public Builder ids(List<String> ids) {
            this.ids = ids;
            return this;
        }

        /**
         * Builds a new {@link MeFollowingRequest} object using the set fields.
         * @return {@link MeFollowingRequest}
         */
        public MeFollowingRequest build() {
            return new MeFollowingRequest(ids);
        }
    }
}