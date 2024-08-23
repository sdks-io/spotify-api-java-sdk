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
 * This is a model class for PlaylistsRequest type.
 */
public class PlaylistsRequest {
    private String name;
    private Boolean mPublic;
    private Boolean collaborative;
    private String description;

    /**
     * Default constructor.
     */
    public PlaylistsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  mPublic  Boolean value for mPublic.
     * @param  collaborative  Boolean value for collaborative.
     * @param  description  String value for description.
     */
    public PlaylistsRequest(
            String name,
            Boolean mPublic,
            Boolean collaborative,
            String description) {
        this.name = name;
        this.mPublic = mPublic;
        this.collaborative = collaborative;
        this.description = description;
    }

    /**
     * Getter for Name.
     * The new name for the playlist, for example `"My New Playlist Title"`
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The new name for the playlist, for example `"My New Playlist Title"`
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Public.
     * If `true` the playlist will be public, if `false` it will be private.
     * @return Returns the Boolean
     */
    @JsonGetter("public")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPublic() {
        return mPublic;
    }

    /**
     * Setter for Public.
     * If `true` the playlist will be public, if `false` it will be private.
     * @param mPublic Value for Boolean
     */
    @JsonSetter("public")
    public void setPublic(Boolean mPublic) {
        this.mPublic = mPublic;
    }

    /**
     * Getter for Collaborative.
     * If `true`, the playlist will become collaborative and other users will be able to modify the
     * playlist in their Spotify client. &lt;br/&gt; _**Note**: You can only set `collaborative` to `true`
     * on non-public playlists._
     * @return Returns the Boolean
     */
    @JsonGetter("collaborative")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCollaborative() {
        return collaborative;
    }

    /**
     * Setter for Collaborative.
     * If `true`, the playlist will become collaborative and other users will be able to modify the
     * playlist in their Spotify client. &lt;br/&gt; _**Note**: You can only set `collaborative` to `true`
     * on non-public playlists._
     * @param collaborative Value for Boolean
     */
    @JsonSetter("collaborative")
    public void setCollaborative(Boolean collaborative) {
        this.collaborative = collaborative;
    }

    /**
     * Getter for Description.
     * Value for playlist description as displayed in Spotify Clients and in the Web API.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Value for playlist description as displayed in Spotify Clients and in the Web API.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Converts this PlaylistsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PlaylistsRequest [" + "name=" + name + ", mPublic=" + mPublic + ", collaborative="
                + collaborative + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link PlaylistsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PlaylistsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .mPublic(getPublic())
                .collaborative(getCollaborative())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PlaylistsRequest}.
     */
    public static class Builder {
        private String name;
        private Boolean mPublic;
        private Boolean collaborative;
        private String description;



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
         * Setter for mPublic.
         * @param  mPublic  Boolean value for mPublic.
         * @return Builder
         */
        public Builder mPublic(Boolean mPublic) {
            this.mPublic = mPublic;
            return this;
        }

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
         * Builds a new {@link PlaylistsRequest} object using the set fields.
         * @return {@link PlaylistsRequest}
         */
        public PlaylistsRequest build() {
            return new PlaylistsRequest(name, mPublic, collaborative, description);
        }
    }
}
