/*
 * SpotifyWebAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.spotify.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CursorPagedArtists type.
 */
public class CursorPagedArtists {
    private CursorPagingSimplifiedArtistObject artists;

    /**
     * Default constructor.
     */
    public CursorPagedArtists() {
    }

    /**
     * Initialization constructor.
     * @param  artists  CursorPagingSimplifiedArtistObject value for artists.
     */
    public CursorPagedArtists(
            CursorPagingSimplifiedArtistObject artists) {
        this.artists = artists;
    }

    /**
     * Getter for Artists.
     * @return Returns the CursorPagingSimplifiedArtistObject
     */
    @JsonGetter("artists")
    public CursorPagingSimplifiedArtistObject getArtists() {
        return artists;
    }

    /**
     * Setter for Artists.
     * @param artists Value for CursorPagingSimplifiedArtistObject
     */
    @JsonSetter("artists")
    public void setArtists(CursorPagingSimplifiedArtistObject artists) {
        this.artists = artists;
    }

    /**
     * Converts this CursorPagedArtists into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CursorPagedArtists [" + "artists=" + artists + "]";
    }

    /**
     * Builds a new {@link CursorPagedArtists.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CursorPagedArtists.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(artists);
        return builder;
    }

    /**
     * Class to build instances of {@link CursorPagedArtists}.
     */
    public static class Builder {
        private CursorPagingSimplifiedArtistObject artists;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  artists  CursorPagingSimplifiedArtistObject value for artists.
         */
        public Builder(CursorPagingSimplifiedArtistObject artists) {
            this.artists = artists;
        }

        /**
         * Setter for artists.
         * @param  artists  CursorPagingSimplifiedArtistObject value for artists.
         * @return Builder
         */
        public Builder artists(CursorPagingSimplifiedArtistObject artists) {
            this.artists = artists;
            return this;
        }

        /**
         * Builds a new {@link CursorPagedArtists} object using the set fields.
         * @return {@link CursorPagedArtists}
         */
        public CursorPagedArtists build() {
            return new CursorPagedArtists(artists);
        }
    }
}
