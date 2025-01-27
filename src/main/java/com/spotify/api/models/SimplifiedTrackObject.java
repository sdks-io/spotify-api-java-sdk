/*
 * SpotifyWebAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.spotify.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for SimplifiedTrackObject type.
 */
public class SimplifiedTrackObject {
    private List<SimplifiedArtistObject> artists;
    private List<String> availableMarkets;
    private Integer discNumber;
    private Integer durationMs;
    private Boolean explicit;
    private ExternalUrlObject externalUrls;
    private String href;
    private String id;
    private Boolean isPlayable;
    private LinkedTrackObject linkedFrom;
    private TrackRestrictionObject restrictions;
    private String name;
    private OptionalNullable<String> previewUrl;
    private Integer trackNumber;
    private String type;
    private String uri;
    private Boolean isLocal;

    /**
     * Default constructor.
     */
    public SimplifiedTrackObject() {
    }

    /**
     * Initialization constructor.
     * @param  artists  List of SimplifiedArtistObject value for artists.
     * @param  availableMarkets  List of String value for availableMarkets.
     * @param  discNumber  Integer value for discNumber.
     * @param  durationMs  Integer value for durationMs.
     * @param  explicit  Boolean value for explicit.
     * @param  externalUrls  ExternalUrlObject value for externalUrls.
     * @param  href  String value for href.
     * @param  id  String value for id.
     * @param  isPlayable  Boolean value for isPlayable.
     * @param  linkedFrom  LinkedTrackObject value for linkedFrom.
     * @param  restrictions  TrackRestrictionObject value for restrictions.
     * @param  name  String value for name.
     * @param  previewUrl  String value for previewUrl.
     * @param  trackNumber  Integer value for trackNumber.
     * @param  type  String value for type.
     * @param  uri  String value for uri.
     * @param  isLocal  Boolean value for isLocal.
     */
    public SimplifiedTrackObject(
            List<SimplifiedArtistObject> artists,
            List<String> availableMarkets,
            Integer discNumber,
            Integer durationMs,
            Boolean explicit,
            ExternalUrlObject externalUrls,
            String href,
            String id,
            Boolean isPlayable,
            LinkedTrackObject linkedFrom,
            TrackRestrictionObject restrictions,
            String name,
            String previewUrl,
            Integer trackNumber,
            String type,
            String uri,
            Boolean isLocal) {
        this.artists = artists;
        this.availableMarkets = availableMarkets;
        this.discNumber = discNumber;
        this.durationMs = durationMs;
        this.explicit = explicit;
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.isPlayable = isPlayable;
        this.linkedFrom = linkedFrom;
        this.restrictions = restrictions;
        this.name = name;
        this.previewUrl = OptionalNullable.of(previewUrl);
        this.trackNumber = trackNumber;
        this.type = type;
        this.uri = uri;
        this.isLocal = isLocal;
    }

    /**
     * Initialization constructor.
     * @param  artists  List of SimplifiedArtistObject value for artists.
     * @param  availableMarkets  List of String value for availableMarkets.
     * @param  discNumber  Integer value for discNumber.
     * @param  durationMs  Integer value for durationMs.
     * @param  explicit  Boolean value for explicit.
     * @param  externalUrls  ExternalUrlObject value for externalUrls.
     * @param  href  String value for href.
     * @param  id  String value for id.
     * @param  isPlayable  Boolean value for isPlayable.
     * @param  linkedFrom  LinkedTrackObject value for linkedFrom.
     * @param  restrictions  TrackRestrictionObject value for restrictions.
     * @param  name  String value for name.
     * @param  previewUrl  String value for previewUrl.
     * @param  trackNumber  Integer value for trackNumber.
     * @param  type  String value for type.
     * @param  uri  String value for uri.
     * @param  isLocal  Boolean value for isLocal.
     */

    protected SimplifiedTrackObject(List<SimplifiedArtistObject> artists,
            List<String> availableMarkets, Integer discNumber, Integer durationMs, Boolean explicit,
            ExternalUrlObject externalUrls, String href, String id, Boolean isPlayable,
            LinkedTrackObject linkedFrom, TrackRestrictionObject restrictions, String name,
            OptionalNullable<String> previewUrl, Integer trackNumber, String type, String uri,
            Boolean isLocal) {
        this.artists = artists;
        this.availableMarkets = availableMarkets;
        this.discNumber = discNumber;
        this.durationMs = durationMs;
        this.explicit = explicit;
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.isPlayable = isPlayable;
        this.linkedFrom = linkedFrom;
        this.restrictions = restrictions;
        this.name = name;
        this.previewUrl = previewUrl;
        this.trackNumber = trackNumber;
        this.type = type;
        this.uri = uri;
        this.isLocal = isLocal;
    }

    /**
     * Getter for Artists.
     * The artists who performed the track. Each artist object includes a link in `href` to more
     * detailed information about the artist.
     * @return Returns the List of SimplifiedArtistObject
     */
    @JsonGetter("artists")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SimplifiedArtistObject> getArtists() {
        return artists;
    }

    /**
     * Setter for Artists.
     * The artists who performed the track. Each artist object includes a link in `href` to more
     * detailed information about the artist.
     * @param artists Value for List of SimplifiedArtistObject
     */
    @JsonSetter("artists")
    public void setArtists(List<SimplifiedArtistObject> artists) {
        this.artists = artists;
    }

    /**
     * Getter for AvailableMarkets.
     * A list of the countries in which the track can be played, identified by their [ISO 3166-1
     * alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.
     * @return Returns the List of String
     */
    @JsonGetter("available_markets")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getAvailableMarkets() {
        return availableMarkets;
    }

    /**
     * Setter for AvailableMarkets.
     * A list of the countries in which the track can be played, identified by their [ISO 3166-1
     * alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.
     * @param availableMarkets Value for List of String
     */
    @JsonSetter("available_markets")
    public void setAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
    }

    /**
     * Getter for DiscNumber.
     * The disc number (usually `1` unless the album consists of more than one disc).
     * @return Returns the Integer
     */
    @JsonGetter("disc_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDiscNumber() {
        return discNumber;
    }

    /**
     * Setter for DiscNumber.
     * The disc number (usually `1` unless the album consists of more than one disc).
     * @param discNumber Value for Integer
     */
    @JsonSetter("disc_number")
    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    /**
     * Getter for DurationMs.
     * The track length in milliseconds.
     * @return Returns the Integer
     */
    @JsonGetter("duration_ms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDurationMs() {
        return durationMs;
    }

    /**
     * Setter for DurationMs.
     * The track length in milliseconds.
     * @param durationMs Value for Integer
     */
    @JsonSetter("duration_ms")
    public void setDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
    }

    /**
     * Getter for Explicit.
     * Whether or not the track has explicit lyrics ( `true` = yes it does; `false` = no it does not
     * OR unknown).
     * @return Returns the Boolean
     */
    @JsonGetter("explicit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getExplicit() {
        return explicit;
    }

    /**
     * Setter for Explicit.
     * Whether or not the track has explicit lyrics ( `true` = yes it does; `false` = no it does not
     * OR unknown).
     * @param explicit Value for Boolean
     */
    @JsonSetter("explicit")
    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
    }

    /**
     * Getter for ExternalUrls.
     * External URLs for this track.
     * @return Returns the ExternalUrlObject
     */
    @JsonGetter("external_urls")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExternalUrlObject getExternalUrls() {
        return externalUrls;
    }

    /**
     * Setter for ExternalUrls.
     * External URLs for this track.
     * @param externalUrls Value for ExternalUrlObject
     */
    @JsonSetter("external_urls")
    public void setExternalUrls(ExternalUrlObject externalUrls) {
        this.externalUrls = externalUrls;
    }

    /**
     * Getter for Href.
     * A link to the Web API endpoint providing full details of the track.
     * @return Returns the String
     */
    @JsonGetter("href")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHref() {
        return href;
    }

    /**
     * Setter for Href.
     * A link to the Web API endpoint providing full details of the track.
     * @param href Value for String
     */
    @JsonSetter("href")
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Getter for Id.
     * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the track.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the track.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for IsPlayable.
     * Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking/)
     * is applied. If `true`, the track is playable in the given market. Otherwise `false`.
     * @return Returns the Boolean
     */
    @JsonGetter("is_playable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsPlayable() {
        return isPlayable;
    }

    /**
     * Setter for IsPlayable.
     * Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking/)
     * is applied. If `true`, the track is playable in the given market. Otherwise `false`.
     * @param isPlayable Value for Boolean
     */
    @JsonSetter("is_playable")
    public void setIsPlayable(Boolean isPlayable) {
        this.isPlayable = isPlayable;
    }

    /**
     * Getter for LinkedFrom.
     * Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking/)
     * is applied and is only part of the response if the track linking, in fact, exists. The
     * requested track has been replaced with a different track. The track in the `linked_from`
     * object contains information about the originally requested track.
     * @return Returns the LinkedTrackObject
     */
    @JsonGetter("linked_from")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LinkedTrackObject getLinkedFrom() {
        return linkedFrom;
    }

    /**
     * Setter for LinkedFrom.
     * Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking/)
     * is applied and is only part of the response if the track linking, in fact, exists. The
     * requested track has been replaced with a different track. The track in the `linked_from`
     * object contains information about the originally requested track.
     * @param linkedFrom Value for LinkedTrackObject
     */
    @JsonSetter("linked_from")
    public void setLinkedFrom(LinkedTrackObject linkedFrom) {
        this.linkedFrom = linkedFrom;
    }

    /**
     * Getter for Restrictions.
     * Included in the response when a content restriction is applied.
     * @return Returns the TrackRestrictionObject
     */
    @JsonGetter("restrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TrackRestrictionObject getRestrictions() {
        return restrictions;
    }

    /**
     * Setter for Restrictions.
     * Included in the response when a content restriction is applied.
     * @param restrictions Value for TrackRestrictionObject
     */
    @JsonSetter("restrictions")
    public void setRestrictions(TrackRestrictionObject restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * Getter for Name.
     * The name of the track.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the track.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Internal Getter for PreviewUrl.
     * A URL to a 30 second preview (MP3 format) of the track.
     * @return Returns the Internal String
     */
    @JsonGetter("preview_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPreviewUrl() {
        return this.previewUrl;
    }

    /**
     * Getter for PreviewUrl.
     * A URL to a 30 second preview (MP3 format) of the track.
     * @return Returns the String
     */
    public String getPreviewUrl() {
        return OptionalNullable.getFrom(previewUrl);
    }

    /**
     * Setter for PreviewUrl.
     * A URL to a 30 second preview (MP3 format) of the track.
     * @param previewUrl Value for String
     */
    @JsonSetter("preview_url")
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = OptionalNullable.of(previewUrl);
    }

    /**
     * UnSetter for PreviewUrl.
     * A URL to a 30 second preview (MP3 format) of the track.
     */
    public void unsetPreviewUrl() {
        previewUrl = null;
    }

    /**
     * Getter for TrackNumber.
     * The number of the track. If an album has several discs, the track number is the number on the
     * specified disc.
     * @return Returns the Integer
     */
    @JsonGetter("track_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTrackNumber() {
        return trackNumber;
    }

    /**
     * Setter for TrackNumber.
     * The number of the track. If an album has several discs, the track number is the number on the
     * specified disc.
     * @param trackNumber Value for Integer
     */
    @JsonSetter("track_number")
    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    /**
     * Getter for Type.
     * The object type: "track".
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The object type: "track".
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Uri.
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the track.
     * @return Returns the String
     */
    @JsonGetter("uri")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUri() {
        return uri;
    }

    /**
     * Setter for Uri.
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the track.
     * @param uri Value for String
     */
    @JsonSetter("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Getter for IsLocal.
     * Whether or not the track is from a local file.
     * @return Returns the Boolean
     */
    @JsonGetter("is_local")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsLocal() {
        return isLocal;
    }

    /**
     * Setter for IsLocal.
     * Whether or not the track is from a local file.
     * @param isLocal Value for Boolean
     */
    @JsonSetter("is_local")
    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    /**
     * Converts this SimplifiedTrackObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SimplifiedTrackObject [" + "artists=" + artists + ", availableMarkets="
                + availableMarkets + ", discNumber=" + discNumber + ", durationMs=" + durationMs
                + ", explicit=" + explicit + ", externalUrls=" + externalUrls + ", href=" + href
                + ", id=" + id + ", isPlayable=" + isPlayable + ", linkedFrom=" + linkedFrom
                + ", restrictions=" + restrictions + ", name=" + name + ", previewUrl=" + previewUrl
                + ", trackNumber=" + trackNumber + ", type=" + type + ", uri=" + uri + ", isLocal="
                + isLocal + "]";
    }

    /**
     * Builds a new {@link SimplifiedTrackObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SimplifiedTrackObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .artists(getArtists())
                .availableMarkets(getAvailableMarkets())
                .discNumber(getDiscNumber())
                .durationMs(getDurationMs())
                .explicit(getExplicit())
                .externalUrls(getExternalUrls())
                .href(getHref())
                .id(getId())
                .isPlayable(getIsPlayable())
                .linkedFrom(getLinkedFrom())
                .restrictions(getRestrictions())
                .name(getName())
                .trackNumber(getTrackNumber())
                .type(getType())
                .uri(getUri())
                .isLocal(getIsLocal());
        builder.previewUrl = internalGetPreviewUrl();
        return builder;
    }

    /**
     * Class to build instances of {@link SimplifiedTrackObject}.
     */
    public static class Builder {
        private List<SimplifiedArtistObject> artists;
        private List<String> availableMarkets;
        private Integer discNumber;
        private Integer durationMs;
        private Boolean explicit;
        private ExternalUrlObject externalUrls;
        private String href;
        private String id;
        private Boolean isPlayable;
        private LinkedTrackObject linkedFrom;
        private TrackRestrictionObject restrictions;
        private String name;
        private OptionalNullable<String> previewUrl;
        private Integer trackNumber;
        private String type;
        private String uri;
        private Boolean isLocal;



        /**
         * Setter for artists.
         * @param  artists  List of SimplifiedArtistObject value for artists.
         * @return Builder
         */
        public Builder artists(List<SimplifiedArtistObject> artists) {
            this.artists = artists;
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
         * Setter for discNumber.
         * @param  discNumber  Integer value for discNumber.
         * @return Builder
         */
        public Builder discNumber(Integer discNumber) {
            this.discNumber = discNumber;
            return this;
        }

        /**
         * Setter for durationMs.
         * @param  durationMs  Integer value for durationMs.
         * @return Builder
         */
        public Builder durationMs(Integer durationMs) {
            this.durationMs = durationMs;
            return this;
        }

        /**
         * Setter for explicit.
         * @param  explicit  Boolean value for explicit.
         * @return Builder
         */
        public Builder explicit(Boolean explicit) {
            this.explicit = explicit;
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
         * Setter for isPlayable.
         * @param  isPlayable  Boolean value for isPlayable.
         * @return Builder
         */
        public Builder isPlayable(Boolean isPlayable) {
            this.isPlayable = isPlayable;
            return this;
        }

        /**
         * Setter for linkedFrom.
         * @param  linkedFrom  LinkedTrackObject value for linkedFrom.
         * @return Builder
         */
        public Builder linkedFrom(LinkedTrackObject linkedFrom) {
            this.linkedFrom = linkedFrom;
            return this;
        }

        /**
         * Setter for restrictions.
         * @param  restrictions  TrackRestrictionObject value for restrictions.
         * @return Builder
         */
        public Builder restrictions(TrackRestrictionObject restrictions) {
            this.restrictions = restrictions;
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
         * Setter for previewUrl.
         * @param  previewUrl  String value for previewUrl.
         * @return Builder
         */
        public Builder previewUrl(String previewUrl) {
            this.previewUrl = OptionalNullable.of(previewUrl);
            return this;
        }

        /**
         * UnSetter for previewUrl.
         * @return Builder
         */
        public Builder unsetPreviewUrl() {
            previewUrl = null;
            return this;
        }

        /**
         * Setter for trackNumber.
         * @param  trackNumber  Integer value for trackNumber.
         * @return Builder
         */
        public Builder trackNumber(Integer trackNumber) {
            this.trackNumber = trackNumber;
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
         * Setter for isLocal.
         * @param  isLocal  Boolean value for isLocal.
         * @return Builder
         */
        public Builder isLocal(Boolean isLocal) {
            this.isLocal = isLocal;
            return this;
        }

        /**
         * Builds a new {@link SimplifiedTrackObject} object using the set fields.
         * @return {@link SimplifiedTrackObject}
         */
        public SimplifiedTrackObject build() {
            return new SimplifiedTrackObject(artists, availableMarkets, discNumber, durationMs,
                    explicit, externalUrls, href, id, isPlayable, linkedFrom, restrictions, name,
                    previewUrl, trackNumber, type, uri, isLocal);
        }
    }
}
