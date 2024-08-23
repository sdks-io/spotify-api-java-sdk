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
 * This is a model class for SearchItems type.
 */
public class SearchItems {
    private PagingTrackObject tracks;
    private PagingArtistObject artists;
    private PagingSimplifiedAlbumObject albums;
    private PagingPlaylistObject playlists;
    private PagingSimplifiedShowObject shows;
    private PagingSimplifiedEpisodeObject episodes;
    private PagingSimplifiedAudiobookObject audiobooks;

    /**
     * Default constructor.
     */
    public SearchItems() {
    }

    /**
     * Initialization constructor.
     * @param  tracks  PagingTrackObject value for tracks.
     * @param  artists  PagingArtistObject value for artists.
     * @param  albums  PagingSimplifiedAlbumObject value for albums.
     * @param  playlists  PagingPlaylistObject value for playlists.
     * @param  shows  PagingSimplifiedShowObject value for shows.
     * @param  episodes  PagingSimplifiedEpisodeObject value for episodes.
     * @param  audiobooks  PagingSimplifiedAudiobookObject value for audiobooks.
     */
    public SearchItems(
            PagingTrackObject tracks,
            PagingArtistObject artists,
            PagingSimplifiedAlbumObject albums,
            PagingPlaylistObject playlists,
            PagingSimplifiedShowObject shows,
            PagingSimplifiedEpisodeObject episodes,
            PagingSimplifiedAudiobookObject audiobooks) {
        this.tracks = tracks;
        this.artists = artists;
        this.albums = albums;
        this.playlists = playlists;
        this.shows = shows;
        this.episodes = episodes;
        this.audiobooks = audiobooks;
    }

    /**
     * Getter for Tracks.
     * @return Returns the PagingTrackObject
     */
    @JsonGetter("tracks")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PagingTrackObject getTracks() {
        return tracks;
    }

    /**
     * Setter for Tracks.
     * @param tracks Value for PagingTrackObject
     */
    @JsonSetter("tracks")
    public void setTracks(PagingTrackObject tracks) {
        this.tracks = tracks;
    }

    /**
     * Getter for Artists.
     * @return Returns the PagingArtistObject
     */
    @JsonGetter("artists")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PagingArtistObject getArtists() {
        return artists;
    }

    /**
     * Setter for Artists.
     * @param artists Value for PagingArtistObject
     */
    @JsonSetter("artists")
    public void setArtists(PagingArtistObject artists) {
        this.artists = artists;
    }

    /**
     * Getter for Albums.
     * @return Returns the PagingSimplifiedAlbumObject
     */
    @JsonGetter("albums")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PagingSimplifiedAlbumObject getAlbums() {
        return albums;
    }

    /**
     * Setter for Albums.
     * @param albums Value for PagingSimplifiedAlbumObject
     */
    @JsonSetter("albums")
    public void setAlbums(PagingSimplifiedAlbumObject albums) {
        this.albums = albums;
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
     * Getter for Shows.
     * @return Returns the PagingSimplifiedShowObject
     */
    @JsonGetter("shows")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PagingSimplifiedShowObject getShows() {
        return shows;
    }

    /**
     * Setter for Shows.
     * @param shows Value for PagingSimplifiedShowObject
     */
    @JsonSetter("shows")
    public void setShows(PagingSimplifiedShowObject shows) {
        this.shows = shows;
    }

    /**
     * Getter for Episodes.
     * @return Returns the PagingSimplifiedEpisodeObject
     */
    @JsonGetter("episodes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PagingSimplifiedEpisodeObject getEpisodes() {
        return episodes;
    }

    /**
     * Setter for Episodes.
     * @param episodes Value for PagingSimplifiedEpisodeObject
     */
    @JsonSetter("episodes")
    public void setEpisodes(PagingSimplifiedEpisodeObject episodes) {
        this.episodes = episodes;
    }

    /**
     * Getter for Audiobooks.
     * @return Returns the PagingSimplifiedAudiobookObject
     */
    @JsonGetter("audiobooks")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PagingSimplifiedAudiobookObject getAudiobooks() {
        return audiobooks;
    }

    /**
     * Setter for Audiobooks.
     * @param audiobooks Value for PagingSimplifiedAudiobookObject
     */
    @JsonSetter("audiobooks")
    public void setAudiobooks(PagingSimplifiedAudiobookObject audiobooks) {
        this.audiobooks = audiobooks;
    }

    /**
     * Converts this SearchItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SearchItems [" + "tracks=" + tracks + ", artists=" + artists + ", albums=" + albums
                + ", playlists=" + playlists + ", shows=" + shows + ", episodes=" + episodes
                + ", audiobooks=" + audiobooks + "]";
    }

    /**
     * Builds a new {@link SearchItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SearchItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .tracks(getTracks())
                .artists(getArtists())
                .albums(getAlbums())
                .playlists(getPlaylists())
                .shows(getShows())
                .episodes(getEpisodes())
                .audiobooks(getAudiobooks());
        return builder;
    }

    /**
     * Class to build instances of {@link SearchItems}.
     */
    public static class Builder {
        private PagingTrackObject tracks;
        private PagingArtistObject artists;
        private PagingSimplifiedAlbumObject albums;
        private PagingPlaylistObject playlists;
        private PagingSimplifiedShowObject shows;
        private PagingSimplifiedEpisodeObject episodes;
        private PagingSimplifiedAudiobookObject audiobooks;



        /**
         * Setter for tracks.
         * @param  tracks  PagingTrackObject value for tracks.
         * @return Builder
         */
        public Builder tracks(PagingTrackObject tracks) {
            this.tracks = tracks;
            return this;
        }

        /**
         * Setter for artists.
         * @param  artists  PagingArtistObject value for artists.
         * @return Builder
         */
        public Builder artists(PagingArtistObject artists) {
            this.artists = artists;
            return this;
        }

        /**
         * Setter for albums.
         * @param  albums  PagingSimplifiedAlbumObject value for albums.
         * @return Builder
         */
        public Builder albums(PagingSimplifiedAlbumObject albums) {
            this.albums = albums;
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
         * Setter for shows.
         * @param  shows  PagingSimplifiedShowObject value for shows.
         * @return Builder
         */
        public Builder shows(PagingSimplifiedShowObject shows) {
            this.shows = shows;
            return this;
        }

        /**
         * Setter for episodes.
         * @param  episodes  PagingSimplifiedEpisodeObject value for episodes.
         * @return Builder
         */
        public Builder episodes(PagingSimplifiedEpisodeObject episodes) {
            this.episodes = episodes;
            return this;
        }

        /**
         * Setter for audiobooks.
         * @param  audiobooks  PagingSimplifiedAudiobookObject value for audiobooks.
         * @return Builder
         */
        public Builder audiobooks(PagingSimplifiedAudiobookObject audiobooks) {
            this.audiobooks = audiobooks;
            return this;
        }

        /**
         * Builds a new {@link SearchItems} object using the set fields.
         * @return {@link SearchItems}
         */
        public SearchItems build() {
            return new SearchItems(tracks, artists, albums, playlists, shows, episodes, audiobooks);
        }
    }
}
