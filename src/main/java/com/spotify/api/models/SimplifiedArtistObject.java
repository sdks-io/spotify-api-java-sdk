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
 * This is a model class for SimplifiedArtistObject type.
 */
public class SimplifiedArtistObject {
    private ExternalUrlObject externalUrls;
    private String href;
    private String id;
    private String name;
    private TypeEnum type;
    private String uri;

    /**
     * Default constructor.
     */
    public SimplifiedArtistObject() {
    }

    /**
     * Initialization constructor.
     * @param  externalUrls  ExternalUrlObject value for externalUrls.
     * @param  href  String value for href.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  type  TypeEnum value for type.
     * @param  uri  String value for uri.
     */
    public SimplifiedArtistObject(
            ExternalUrlObject externalUrls,
            String href,
            String id,
            String name,
            TypeEnum type,
            String uri) {
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.name = name;
        this.type = type;
        this.uri = uri;
    }

    /**
     * Getter for ExternalUrls.
     * Known external URLs for this artist.
     * @return Returns the ExternalUrlObject
     */
    @JsonGetter("external_urls")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExternalUrlObject getExternalUrls() {
        return externalUrls;
    }

    /**
     * Setter for ExternalUrls.
     * Known external URLs for this artist.
     * @param externalUrls Value for ExternalUrlObject
     */
    @JsonSetter("external_urls")
    public void setExternalUrls(ExternalUrlObject externalUrls) {
        this.externalUrls = externalUrls;
    }

    /**
     * Getter for Href.
     * A link to the Web API endpoint providing full details of the artist.
     * @return Returns the String
     */
    @JsonGetter("href")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHref() {
        return href;
    }

    /**
     * Setter for Href.
     * A link to the Web API endpoint providing full details of the artist.
     * @param href Value for String
     */
    @JsonSetter("href")
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Getter for Id.
     * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the artist.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the artist.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * The name of the artist.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the artist.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Type.
     * The object type.
     * @return Returns the TypeEnum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The object type.
     * @param type Value for TypeEnum
     */
    @JsonSetter("type")
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for Uri.
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the artist.
     * @return Returns the String
     */
    @JsonGetter("uri")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUri() {
        return uri;
    }

    /**
     * Setter for Uri.
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the artist.
     * @param uri Value for String
     */
    @JsonSetter("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Converts this SimplifiedArtistObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SimplifiedArtistObject [" + "externalUrls=" + externalUrls + ", href=" + href
                + ", id=" + id + ", name=" + name + ", type=" + type + ", uri=" + uri + "]";
    }

    /**
     * Builds a new {@link SimplifiedArtistObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SimplifiedArtistObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .externalUrls(getExternalUrls())
                .href(getHref())
                .id(getId())
                .name(getName())
                .type(getType())
                .uri(getUri());
        return builder;
    }

    /**
     * Class to build instances of {@link SimplifiedArtistObject}.
     */
    public static class Builder {
        private ExternalUrlObject externalUrls;
        private String href;
        private String id;
        private String name;
        private TypeEnum type;
        private String uri;



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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  TypeEnum value for type.
         * @return Builder
         */
        public Builder type(TypeEnum type) {
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
         * Builds a new {@link SimplifiedArtistObject} object using the set fields.
         * @return {@link SimplifiedArtistObject}
         */
        public SimplifiedArtistObject build() {
            return new SimplifiedArtistObject(externalUrls, href, id, name, type, uri);
        }
    }
}