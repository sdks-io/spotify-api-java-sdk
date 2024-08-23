/*
 * SpotifyWebAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.spotify.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for MeTracksRequest1 type.
 */
public class MeTracksRequest1 {
    private List<String> ids;

    /**
     * Default constructor.
     */
    public MeTracksRequest1() {
    }

    /**
     * Initialization constructor.
     * @param  ids  List of String value for ids.
     */
    public MeTracksRequest1(
            List<String> ids) {
        this.ids = ids;
    }

    /**
     * Getter for Ids.
     * A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For
     * example: `["4iV5W9uYEdYUVa79Axb7Rh", "1301WleyT98MSxVHPZCA6M"]`&lt;br/&gt;A maximum of 50 items can
     * be specified in one request. _**Note**: if the `ids` parameter is present in the query
     * string, any IDs listed here in the body will be ignored._
     * @return Returns the List of String
     */
    @JsonGetter("ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getIds() {
        return ids;
    }

    /**
     * Setter for Ids.
     * A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For
     * example: `["4iV5W9uYEdYUVa79Axb7Rh", "1301WleyT98MSxVHPZCA6M"]`&lt;br/&gt;A maximum of 50 items can
     * be specified in one request. _**Note**: if the `ids` parameter is present in the query
     * string, any IDs listed here in the body will be ignored._
     * @param ids Value for List of String
     */
    @JsonSetter("ids")
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    /**
     * Converts this MeTracksRequest1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MeTracksRequest1 [" + "ids=" + ids + "]";
    }

    /**
     * Builds a new {@link MeTracksRequest1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MeTracksRequest1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ids(getIds());
        return builder;
    }

    /**
     * Class to build instances of {@link MeTracksRequest1}.
     */
    public static class Builder {
        private List<String> ids;



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
         * Builds a new {@link MeTracksRequest1} object using the set fields.
         * @return {@link MeTracksRequest1}
         */
        public MeTracksRequest1 build() {
            return new MeTracksRequest1(ids);
        }
    }
}
