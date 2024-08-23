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
 * This is a model class for MeEpisodesRequest type.
 */
public class MeEpisodesRequest {
    private List<String> ids;

    /**
     * Default constructor.
     */
    public MeEpisodesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  ids  List of String value for ids.
     */
    public MeEpisodesRequest(
            List<String> ids) {
        this.ids = ids;
    }

    /**
     * Getter for Ids.
     * A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). &lt;br/&gt;A
     * maximum of 50 items can be specified in one request. _**Note**: if the `ids` parameter is
     * present in the query string, any IDs listed here in the body will be ignored._
     * @return Returns the List of String
     */
    @JsonGetter("ids")
    public List<String> getIds() {
        return ids;
    }

    /**
     * Setter for Ids.
     * A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). &lt;br/&gt;A
     * maximum of 50 items can be specified in one request. _**Note**: if the `ids` parameter is
     * present in the query string, any IDs listed here in the body will be ignored._
     * @param ids Value for List of String
     */
    @JsonSetter("ids")
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    /**
     * Converts this MeEpisodesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MeEpisodesRequest [" + "ids=" + ids + "]";
    }

    /**
     * Builds a new {@link MeEpisodesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MeEpisodesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(ids);
        return builder;
    }

    /**
     * Class to build instances of {@link MeEpisodesRequest}.
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
         * Builds a new {@link MeEpisodesRequest} object using the set fields.
         * @return {@link MeEpisodesRequest}
         */
        public MeEpisodesRequest build() {
            return new MeEpisodesRequest(ids);
        }
    }
}
