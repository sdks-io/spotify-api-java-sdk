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
 * This is a model class for AlbumBase type.
 */
public class AlbumBase {
    private AlbumTypeEnum albumType;
    private int totalTracks;
    private List<String> availableMarkets;
    private ExternalUrlObject externalUrls;
    private String href;
    private String id;
    private List<ImageObject> images;
    private String name;
    private String releaseDate;
    private ReleaseDatePrecisionEnum releaseDatePrecision;
    private AlbumRestrictionObject restrictions;
    private Type2Enum type;
    private String uri;

    /**
     * Default constructor.
     */
    public AlbumBase() {
    }

    /**
     * Initialization constructor.
     * @param  albumType  AlbumTypeEnum value for albumType.
     * @param  totalTracks  int value for totalTracks.
     * @param  availableMarkets  List of String value for availableMarkets.
     * @param  externalUrls  ExternalUrlObject value for externalUrls.
     * @param  href  String value for href.
     * @param  id  String value for id.
     * @param  images  List of ImageObject value for images.
     * @param  name  String value for name.
     * @param  releaseDate  String value for releaseDate.
     * @param  releaseDatePrecision  ReleaseDatePrecisionEnum value for releaseDatePrecision.
     * @param  type  Type2Enum value for type.
     * @param  uri  String value for uri.
     * @param  restrictions  AlbumRestrictionObject value for restrictions.
     */
    public AlbumBase(
            AlbumTypeEnum albumType,
            int totalTracks,
            List<String> availableMarkets,
            ExternalUrlObject externalUrls,
            String href,
            String id,
            List<ImageObject> images,
            String name,
            String releaseDate,
            ReleaseDatePrecisionEnum releaseDatePrecision,
            Type2Enum type,
            String uri,
            AlbumRestrictionObject restrictions) {
        this.albumType = albumType;
        this.totalTracks = totalTracks;
        this.availableMarkets = availableMarkets;
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.releaseDate = releaseDate;
        this.releaseDatePrecision = releaseDatePrecision;
        this.restrictions = restrictions;
        this.type = type;
        this.uri = uri;
    }

    /**
     * Getter for AlbumType.
     * The type of the album.
     * @return Returns the AlbumTypeEnum
     */
    @JsonGetter("album_type")
    public AlbumTypeEnum getAlbumType() {
        return albumType;
    }

    /**
     * Setter for AlbumType.
     * The type of the album.
     * @param albumType Value for AlbumTypeEnum
     */
    @JsonSetter("album_type")
    public void setAlbumType(AlbumTypeEnum albumType) {
        this.albumType = albumType;
    }

    /**
     * Getter for TotalTracks.
     * The number of tracks in the album.
     * @return Returns the int
     */
    @JsonGetter("total_tracks")
    public int getTotalTracks() {
        return totalTracks;
    }

    /**
     * Setter for TotalTracks.
     * The number of tracks in the album.
     * @param totalTracks Value for int
     */
    @JsonSetter("total_tracks")
    public void setTotalTracks(int totalTracks) {
        this.totalTracks = totalTracks;
    }

    /**
     * Getter for AvailableMarkets.
     * The markets in which the album is available: [ISO 3166-1 alpha-2 country
     * codes](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _**NOTE**: an album is considered
     * available in a market when at least 1 of its tracks is available in that market._
     * @return Returns the List of String
     */
    @JsonGetter("available_markets")
    public List<String> getAvailableMarkets() {
        return availableMarkets;
    }

    /**
     * Setter for AvailableMarkets.
     * The markets in which the album is available: [ISO 3166-1 alpha-2 country
     * codes](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _**NOTE**: an album is considered
     * available in a market when at least 1 of its tracks is available in that market._
     * @param availableMarkets Value for List of String
     */
    @JsonSetter("available_markets")
    public void setAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
    }

    /**
     * Getter for ExternalUrls.
     * Known external URLs for this album.
     * @return Returns the ExternalUrlObject
     */
    @JsonGetter("external_urls")
    public ExternalUrlObject getExternalUrls() {
        return externalUrls;
    }

    /**
     * Setter for ExternalUrls.
     * Known external URLs for this album.
     * @param externalUrls Value for ExternalUrlObject
     */
    @JsonSetter("external_urls")
    public void setExternalUrls(ExternalUrlObject externalUrls) {
        this.externalUrls = externalUrls;
    }

    /**
     * Getter for Href.
     * A link to the Web API endpoint providing full details of the album.
     * @return Returns the String
     */
    @JsonGetter("href")
    public String getHref() {
        return href;
    }

    /**
     * Setter for Href.
     * A link to the Web API endpoint providing full details of the album.
     * @param href Value for String
     */
    @JsonSetter("href")
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Getter for Id.
     * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the album.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the album.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Images.
     * The cover art for the album in various sizes, widest first.
     * @return Returns the List of ImageObject
     */
    @JsonGetter("images")
    public List<ImageObject> getImages() {
        return images;
    }

    /**
     * Setter for Images.
     * The cover art for the album in various sizes, widest first.
     * @param images Value for List of ImageObject
     */
    @JsonSetter("images")
    public void setImages(List<ImageObject> images) {
        this.images = images;
    }

    /**
     * Getter for Name.
     * The name of the album. In case of an album takedown, the value may be an empty string.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the album. In case of an album takedown, the value may be an empty string.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for ReleaseDate.
     * The date the album was first released.
     * @return Returns the String
     */
    @JsonGetter("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Setter for ReleaseDate.
     * The date the album was first released.
     * @param releaseDate Value for String
     */
    @JsonSetter("release_date")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Getter for ReleaseDatePrecision.
     * The precision with which `release_date` value is known.
     * @return Returns the ReleaseDatePrecisionEnum
     */
    @JsonGetter("release_date_precision")
    public ReleaseDatePrecisionEnum getReleaseDatePrecision() {
        return releaseDatePrecision;
    }

    /**
     * Setter for ReleaseDatePrecision.
     * The precision with which `release_date` value is known.
     * @param releaseDatePrecision Value for ReleaseDatePrecisionEnum
     */
    @JsonSetter("release_date_precision")
    public void setReleaseDatePrecision(ReleaseDatePrecisionEnum releaseDatePrecision) {
        this.releaseDatePrecision = releaseDatePrecision;
    }

    /**
     * Getter for Restrictions.
     * Included in the response when a content restriction is applied.
     * @return Returns the AlbumRestrictionObject
     */
    @JsonGetter("restrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AlbumRestrictionObject getRestrictions() {
        return restrictions;
    }

    /**
     * Setter for Restrictions.
     * Included in the response when a content restriction is applied.
     * @param restrictions Value for AlbumRestrictionObject
     */
    @JsonSetter("restrictions")
    public void setRestrictions(AlbumRestrictionObject restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * Getter for Type.
     * The object type.
     * @return Returns the Type2Enum
     */
    @JsonGetter("type")
    public Type2Enum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The object type.
     * @param type Value for Type2Enum
     */
    @JsonSetter("type")
    public void setType(Type2Enum type) {
        this.type = type;
    }

    /**
     * Getter for Uri.
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the album.
     * @return Returns the String
     */
    @JsonGetter("uri")
    public String getUri() {
        return uri;
    }

    /**
     * Setter for Uri.
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the album.
     * @param uri Value for String
     */
    @JsonSetter("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Converts this AlbumBase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AlbumBase [" + "albumType=" + albumType + ", totalTracks=" + totalTracks
                + ", availableMarkets=" + availableMarkets + ", externalUrls=" + externalUrls
                + ", href=" + href + ", id=" + id + ", images=" + images + ", name=" + name
                + ", releaseDate=" + releaseDate + ", releaseDatePrecision=" + releaseDatePrecision
                + ", type=" + type + ", uri=" + uri + ", restrictions=" + restrictions + "]";
    }

    /**
     * Builds a new {@link AlbumBase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AlbumBase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(albumType, totalTracks, availableMarkets, externalUrls, href,
                id, images, name, releaseDate, releaseDatePrecision, type, uri)
                .restrictions(getRestrictions());
        return builder;
    }

    /**
     * Class to build instances of {@link AlbumBase}.
     */
    public static class Builder {
        private AlbumTypeEnum albumType;
        private int totalTracks;
        private List<String> availableMarkets;
        private ExternalUrlObject externalUrls;
        private String href;
        private String id;
        private List<ImageObject> images;
        private String name;
        private String releaseDate;
        private ReleaseDatePrecisionEnum releaseDatePrecision;
        private Type2Enum type;
        private String uri;
        private AlbumRestrictionObject restrictions;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  albumType  AlbumTypeEnum value for albumType.
         * @param  totalTracks  int value for totalTracks.
         * @param  availableMarkets  List of String value for availableMarkets.
         * @param  externalUrls  ExternalUrlObject value for externalUrls.
         * @param  href  String value for href.
         * @param  id  String value for id.
         * @param  images  List of ImageObject value for images.
         * @param  name  String value for name.
         * @param  releaseDate  String value for releaseDate.
         * @param  releaseDatePrecision  ReleaseDatePrecisionEnum value for releaseDatePrecision.
         * @param  type  Type2Enum value for type.
         * @param  uri  String value for uri.
         */
        public Builder(AlbumTypeEnum albumType, int totalTracks, List<String> availableMarkets,
                ExternalUrlObject externalUrls, String href, String id, List<ImageObject> images,
                String name, String releaseDate, ReleaseDatePrecisionEnum releaseDatePrecision,
                Type2Enum type, String uri) {
            this.albumType = albumType;
            this.totalTracks = totalTracks;
            this.availableMarkets = availableMarkets;
            this.externalUrls = externalUrls;
            this.href = href;
            this.id = id;
            this.images = images;
            this.name = name;
            this.releaseDate = releaseDate;
            this.releaseDatePrecision = releaseDatePrecision;
            this.type = type;
            this.uri = uri;
        }

        /**
         * Setter for albumType.
         * @param  albumType  AlbumTypeEnum value for albumType.
         * @return Builder
         */
        public Builder albumType(AlbumTypeEnum albumType) {
            this.albumType = albumType;
            return this;
        }

        /**
         * Setter for totalTracks.
         * @param  totalTracks  int value for totalTracks.
         * @return Builder
         */
        public Builder totalTracks(int totalTracks) {
            this.totalTracks = totalTracks;
            return this;
        }

        /**
         * Setter for availableMarkets.
         * @param  availableMarkets  List of String value for availableMarkets.
         * @return Builder
         */
        public Builder availableMarkets(List<String> availableMarkets) {
            this.availableMarkets = availableMarkets;
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
         * Setter for releaseDate.
         * @param  releaseDate  String value for releaseDate.
         * @return Builder
         */
        public Builder releaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        /**
         * Setter for releaseDatePrecision.
         * @param  releaseDatePrecision  ReleaseDatePrecisionEnum value for releaseDatePrecision.
         * @return Builder
         */
        public Builder releaseDatePrecision(ReleaseDatePrecisionEnum releaseDatePrecision) {
            this.releaseDatePrecision = releaseDatePrecision;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  Type2Enum value for type.
         * @return Builder
         */
        public Builder type(Type2Enum type) {
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
         * Setter for restrictions.
         * @param  restrictions  AlbumRestrictionObject value for restrictions.
         * @return Builder
         */
        public Builder restrictions(AlbumRestrictionObject restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        /**
         * Builds a new {@link AlbumBase} object using the set fields.
         * @return {@link AlbumBase}
         */
        public AlbumBase build() {
            return new AlbumBase(albumType, totalTracks, availableMarkets, externalUrls, href, id,
                    images, name, releaseDate, releaseDatePrecision, type, uri, restrictions);
        }
    }
}
