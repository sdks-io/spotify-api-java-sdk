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
 * This is a model class for SimplifiedPlaylistObject type.
 */
public class SimplifiedPlaylistObject {
    private Boolean collaborative;
    private String description;
    private ExternalUrlObject externalUrls;
    private String href;
    private String id;
    private List<ImageObject> images;
    private String name;
    private PlaylistOwnerObject owner;
    private Boolean mPublic;
    private String snapshotId;
    private PlaylistTracksRefObject tracks;
    private String type;
    private String uri;

    /**
     * Default constructor.
     */
    public SimplifiedPlaylistObject() {
    }

    /**
     * Initialization constructor.
     * @param  collaborative  Boolean value for collaborative.
     * @param  description  String value for description.
     * @param  externalUrls  ExternalUrlObject value for externalUrls.
     * @param  href  String value for href.
     * @param  id  String value for id.
     * @param  images  List of ImageObject value for images.
     * @param  name  String value for name.
     * @param  owner  PlaylistOwnerObject value for owner.
     * @param  mPublic  Boolean value for mPublic.
     * @param  snapshotId  String value for snapshotId.
     * @param  tracks  PlaylistTracksRefObject value for tracks.
     * @param  type  String value for type.
     * @param  uri  String value for uri.
     */
    public SimplifiedPlaylistObject(
            Boolean collaborative,
            String description,
            ExternalUrlObject externalUrls,
            String href,
            String id,
            List<ImageObject> images,
            String name,
            PlaylistOwnerObject owner,
            Boolean mPublic,
            String snapshotId,
            PlaylistTracksRefObject tracks,
            String type,
            String uri) {
        this.collaborative = collaborative;
        this.description = description;
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.owner = owner;
        this.mPublic = mPublic;
        this.snapshotId = snapshotId;
        this.tracks = tracks;
        this.type = type;
        this.uri = uri;
    }

    /**
     * Getter for Collaborative.
     * `true` if the owner allows other users to modify the playlist.
     * @return Returns the Boolean
     */
    @JsonGetter("collaborative")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCollaborative() {
        return collaborative;
    }

    /**
     * Setter for Collaborative.
     * `true` if the owner allows other users to modify the playlist.
     * @param collaborative Value for Boolean
     */
    @JsonSetter("collaborative")
    public void setCollaborative(Boolean collaborative) {
        this.collaborative = collaborative;
    }

    /**
     * Getter for Description.
     * The playlist description. _Only returned for modified, verified playlists, otherwise_ `null`.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The playlist description. _Only returned for modified, verified playlists, otherwise_ `null`.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for ExternalUrls.
     * Known external URLs for this playlist.
     * @return Returns the ExternalUrlObject
     */
    @JsonGetter("external_urls")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExternalUrlObject getExternalUrls() {
        return externalUrls;
    }

    /**
     * Setter for ExternalUrls.
     * Known external URLs for this playlist.
     * @param externalUrls Value for ExternalUrlObject
     */
    @JsonSetter("external_urls")
    public void setExternalUrls(ExternalUrlObject externalUrls) {
        this.externalUrls = externalUrls;
    }

    /**
     * Getter for Href.
     * A link to the Web API endpoint providing full details of the playlist.
     * @return Returns the String
     */
    @JsonGetter("href")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHref() {
        return href;
    }

    /**
     * Setter for Href.
     * A link to the Web API endpoint providing full details of the playlist.
     * @param href Value for String
     */
    @JsonSetter("href")
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Getter for Id.
     * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the playlist.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the playlist.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Images.
     * Images for the playlist. The array may be empty or contain up to three images. The images are
     * returned by size in descending order. See [Working with
     * Playlists](/documentation/web-api/concepts/playlists). _**Note**: If returned, the source URL
     * for the image (`url`) is temporary and will expire in less than a day._
     * @return Returns the List of ImageObject
     */
    @JsonGetter("images")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ImageObject> getImages() {
        return images;
    }

    /**
     * Setter for Images.
     * Images for the playlist. The array may be empty or contain up to three images. The images are
     * returned by size in descending order. See [Working with
     * Playlists](/documentation/web-api/concepts/playlists). _**Note**: If returned, the source URL
     * for the image (`url`) is temporary and will expire in less than a day._
     * @param images Value for List of ImageObject
     */
    @JsonSetter("images")
    public void setImages(List<ImageObject> images) {
        this.images = images;
    }

    /**
     * Getter for Name.
     * The name of the playlist.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the playlist.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Owner.
     * The user who owns the playlist
     * @return Returns the PlaylistOwnerObject
     */
    @JsonGetter("owner")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PlaylistOwnerObject getOwner() {
        return owner;
    }

    /**
     * Setter for Owner.
     * The user who owns the playlist
     * @param owner Value for PlaylistOwnerObject
     */
    @JsonSetter("owner")
    public void setOwner(PlaylistOwnerObject owner) {
        this.owner = owner;
    }

    /**
     * Getter for Public.
     * The playlist's public/private status: `true` the playlist is public, `false` the playlist is
     * private, `null` the playlist status is not relevant. For more about public/private status,
     * see [Working with Playlists](/documentation/web-api/concepts/playlists)
     * @return Returns the Boolean
     */
    @JsonGetter("public")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPublic() {
        return mPublic;
    }

    /**
     * Setter for Public.
     * The playlist's public/private status: `true` the playlist is public, `false` the playlist is
     * private, `null` the playlist status is not relevant. For more about public/private status,
     * see [Working with Playlists](/documentation/web-api/concepts/playlists)
     * @param mPublic Value for Boolean
     */
    @JsonSetter("public")
    public void setPublic(Boolean mPublic) {
        this.mPublic = mPublic;
    }

    /**
     * Getter for SnapshotId.
     * The version identifier for the current playlist. Can be supplied in other requests to target
     * a specific playlist version
     * @return Returns the String
     */
    @JsonGetter("snapshot_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * Setter for SnapshotId.
     * The version identifier for the current playlist. Can be supplied in other requests to target
     * a specific playlist version
     * @param snapshotId Value for String
     */
    @JsonSetter("snapshot_id")
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * Getter for Tracks.
     * A collection containing a link ( `href` ) to the Web API endpoint where full details of the
     * playlist's tracks can be retrieved, along with the `total` number of tracks in the playlist.
     * Note, a track object may be `null`. This can happen if a track is no longer available.
     * @return Returns the PlaylistTracksRefObject
     */
    @JsonGetter("tracks")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PlaylistTracksRefObject getTracks() {
        return tracks;
    }

    /**
     * Setter for Tracks.
     * A collection containing a link ( `href` ) to the Web API endpoint where full details of the
     * playlist's tracks can be retrieved, along with the `total` number of tracks in the playlist.
     * Note, a track object may be `null`. This can happen if a track is no longer available.
     * @param tracks Value for PlaylistTracksRefObject
     */
    @JsonSetter("tracks")
    public void setTracks(PlaylistTracksRefObject tracks) {
        this.tracks = tracks;
    }

    /**
     * Getter for Type.
     * The object type: "playlist"
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The object type: "playlist"
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Uri.
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the playlist.
     * @return Returns the String
     */
    @JsonGetter("uri")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUri() {
        return uri;
    }

    /**
     * Setter for Uri.
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the playlist.
     * @param uri Value for String
     */
    @JsonSetter("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Converts this SimplifiedPlaylistObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SimplifiedPlaylistObject [" + "collaborative=" + collaborative + ", description="
                + description + ", externalUrls=" + externalUrls + ", href=" + href + ", id=" + id
                + ", images=" + images + ", name=" + name + ", owner=" + owner + ", mPublic="
                + mPublic + ", snapshotId=" + snapshotId + ", tracks=" + tracks + ", type=" + type
                + ", uri=" + uri + "]";
    }

    /**
     * Builds a new {@link SimplifiedPlaylistObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SimplifiedPlaylistObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .collaborative(getCollaborative())
                .description(getDescription())
                .externalUrls(getExternalUrls())
                .href(getHref())
                .id(getId())
                .images(getImages())
                .name(getName())
                .owner(getOwner())
                .mPublic(getPublic())
                .snapshotId(getSnapshotId())
                .tracks(getTracks())
                .type(getType())
                .uri(getUri());
        return builder;
    }

    /**
     * Class to build instances of {@link SimplifiedPlaylistObject}.
     */
    public static class Builder {
        private Boolean collaborative;
        private String description;
        private ExternalUrlObject externalUrls;
        private String href;
        private String id;
        private List<ImageObject> images;
        private String name;
        private PlaylistOwnerObject owner;
        private Boolean mPublic;
        private String snapshotId;
        private PlaylistTracksRefObject tracks;
        private String type;
        private String uri;



        /**
         * Setter for collaborative.
         * @param  collaborative  Boolean value for collaborative.
         * @return Builder
         */
        public Builder collaborative(Boolean collaborative) {
            this.collaborative = collaborative;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for externalUrls.
         * @param  externalUrls  ExternalUrlObject value for externalUrls.
         * @return Builder
         */
        public Builder externalUrls(ExternalUrlObject externalUrls) {
            this.externalUrls = externalUrls;
            return this;
        }

        /**
         * Setter for href.
         * @param  href  String value for href.
         * @return Builder
         */
        public Builder href(String href) {
            this.href = href;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for images.
         * @param  images  List of ImageObject value for images.
         * @return Builder
         */
        public Builder images(List<ImageObject> images) {
            this.images = images;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for owner.
         * @param  owner  PlaylistOwnerObject value for owner.
         * @return Builder
         */
        public Builder owner(PlaylistOwnerObject owner) {
            this.owner = owner;
            return this;
        }

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
         * Setter for snapshotId.
         * @param  snapshotId  String value for snapshotId.
         * @return Builder
         */
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * Setter for tracks.
         * @param  tracks  PlaylistTracksRefObject value for tracks.
         * @return Builder
         */
        public Builder tracks(PlaylistTracksRefObject tracks) {
            this.tracks = tracks;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for uri.
         * @param  uri  String value for uri.
         * @return Builder
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * Builds a new {@link SimplifiedPlaylistObject} object using the set fields.
         * @return {@link SimplifiedPlaylistObject}
         */
        public SimplifiedPlaylistObject build() {
            return new SimplifiedPlaylistObject(collaborative, description, externalUrls, href, id,
                    images, name, owner, mPublic, snapshotId, tracks, type, uri);
        }
    }
}
