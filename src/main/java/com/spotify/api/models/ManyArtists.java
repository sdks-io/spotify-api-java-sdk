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
 * This is a model class for ManyArtists type.
 */
public class ManyArtists {
    private List<ArtistObject> artists;

    /**
     * Default constructor.
     */
    public ManyArtists() {
    }

    /**
     * Initialization constructor.
     * @param  artists  List of ArtistObject value for artists.
     */
    public ManyArtists(
            List<ArtistObject> artists) {
        this.artists = artists;
    }

    /**
     * Getter for Artists.
     * @return Returns the List of ArtistObject
     */
    @JsonGetter("artists")
    public List<ArtistObject> getArtists() {
        return artists;
    }

    /**
     * Setter for Artists.
     * @param artists Value for List of ArtistObject
     */
    @JsonSetter("artists")
    public void setArtists(List<ArtistObject> artists) {
        this.artists = artists;
    }

    /**
     * Converts this ManyArtists into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ManyArtists [" + "artists=" + artists + "]";
    }

    /**
     * Builds a new {@link ManyArtists.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ManyArtists.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(artists);
        return builder;
    }

    /**
     * Class to build instances of {@link ManyArtists}.
     */
    public static class Builder {
        private List<ArtistObject> artists;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  artists  List of ArtistObject value for artists.
         */
        public Builder(List<ArtistObject> artists) {
            this.artists = artists;
        }

        /**
         * Setter for artists.
         * @param  artists  List of ArtistObject value for artists.
         * @return Builder
         */
        public Builder artists(List<ArtistObject> artists) {
            this.artists = artists;
            return this;
        }

        /**
         * Builds a new {@link ManyArtists} object using the set fields.
         * @return {@link ManyArtists}
         */
        public ManyArtists build() {
            return new ManyArtists(artists);
        }
    }
}
