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
 * This is a model class for AudioAnalysisObject type.
 */
public class AudioAnalysisObject {
    private Meta meta;
    private Track track;
    private List<TimeIntervalObject> bars;
    private List<TimeIntervalObject> beats;
    private List<SectionObject> sections;
    private List<SegmentObject> segments;
    private List<TimeIntervalObject> tatums;

    /**
     * Default constructor.
     */
    public AudioAnalysisObject() {
    }

    /**
     * Initialization constructor.
     * @param  meta  Meta value for meta.
     * @param  track  Track value for track.
     * @param  bars  List of TimeIntervalObject value for bars.
     * @param  beats  List of TimeIntervalObject value for beats.
     * @param  sections  List of SectionObject value for sections.
     * @param  segments  List of SegmentObject value for segments.
     * @param  tatums  List of TimeIntervalObject value for tatums.
     */
    public AudioAnalysisObject(
            Meta meta,
            Track track,
            List<TimeIntervalObject> bars,
            List<TimeIntervalObject> beats,
            List<SectionObject> sections,
            List<SegmentObject> segments,
            List<TimeIntervalObject> tatums) {
        this.meta = meta;
        this.track = track;
        this.bars = bars;
        this.beats = beats;
        this.sections = sections;
        this.segments = segments;
        this.tatums = tatums;
    }

    /**
     * Getter for Meta.
     * @return Returns the Meta
     */
    @JsonGetter("meta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Meta getMeta() {
        return meta;
    }

    /**
     * Setter for Meta.
     * @param meta Value for Meta
     */
    @JsonSetter("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * Getter for Track.
     * @return Returns the Track
     */
    @JsonGetter("track")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Track getTrack() {
        return track;
    }

    /**
     * Setter for Track.
     * @param track Value for Track
     */
    @JsonSetter("track")
    public void setTrack(Track track) {
        this.track = track;
    }

    /**
     * Getter for Bars.
     * The time intervals of the bars throughout the track. A bar (or measure) is a segment of time
     * defined as a given number of beats.
     * @return Returns the List of TimeIntervalObject
     */
    @JsonGetter("bars")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TimeIntervalObject> getBars() {
        return bars;
    }

    /**
     * Setter for Bars.
     * The time intervals of the bars throughout the track. A bar (or measure) is a segment of time
     * defined as a given number of beats.
     * @param bars Value for List of TimeIntervalObject
     */
    @JsonSetter("bars")
    public void setBars(List<TimeIntervalObject> bars) {
        this.bars = bars;
    }

    /**
     * Getter for Beats.
     * The time intervals of beats throughout the track. A beat is the basic time unit of a piece of
     * music; for example, each tick of a metronome. Beats are typically multiples of tatums.
     * @return Returns the List of TimeIntervalObject
     */
    @JsonGetter("beats")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TimeIntervalObject> getBeats() {
        return beats;
    }

    /**
     * Setter for Beats.
     * The time intervals of beats throughout the track. A beat is the basic time unit of a piece of
     * music; for example, each tick of a metronome. Beats are typically multiples of tatums.
     * @param beats Value for List of TimeIntervalObject
     */
    @JsonSetter("beats")
    public void setBeats(List<TimeIntervalObject> beats) {
        this.beats = beats;
    }

    /**
     * Getter for Sections.
     * Sections are defined by large variations in rhythm or timbre, e.g. chorus, verse, bridge,
     * guitar solo, etc. Each section contains its own descriptions of tempo, key, mode,
     * time_signature, and loudness.
     * @return Returns the List of SectionObject
     */
    @JsonGetter("sections")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SectionObject> getSections() {
        return sections;
    }

    /**
     * Setter for Sections.
     * Sections are defined by large variations in rhythm or timbre, e.g. chorus, verse, bridge,
     * guitar solo, etc. Each section contains its own descriptions of tempo, key, mode,
     * time_signature, and loudness.
     * @param sections Value for List of SectionObject
     */
    @JsonSetter("sections")
    public void setSections(List<SectionObject> sections) {
        this.sections = sections;
    }

    /**
     * Getter for Segments.
     * Each segment contains a roughly conisistent sound throughout its duration.
     * @return Returns the List of SegmentObject
     */
    @JsonGetter("segments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SegmentObject> getSegments() {
        return segments;
    }

    /**
     * Setter for Segments.
     * Each segment contains a roughly conisistent sound throughout its duration.
     * @param segments Value for List of SegmentObject
     */
    @JsonSetter("segments")
    public void setSegments(List<SegmentObject> segments) {
        this.segments = segments;
    }

    /**
     * Getter for Tatums.
     * A tatum represents the lowest regular pulse train that a listener intuitively infers from the
     * timing of perceived musical events (segments).
     * @return Returns the List of TimeIntervalObject
     */
    @JsonGetter("tatums")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TimeIntervalObject> getTatums() {
        return tatums;
    }

    /**
     * Setter for Tatums.
     * A tatum represents the lowest regular pulse train that a listener intuitively infers from the
     * timing of perceived musical events (segments).
     * @param tatums Value for List of TimeIntervalObject
     */
    @JsonSetter("tatums")
    public void setTatums(List<TimeIntervalObject> tatums) {
        this.tatums = tatums;
    }

    /**
     * Converts this AudioAnalysisObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AudioAnalysisObject [" + "meta=" + meta + ", track=" + track + ", bars=" + bars
                + ", beats=" + beats + ", sections=" + sections + ", segments=" + segments
                + ", tatums=" + tatums + "]";
    }

    /**
     * Builds a new {@link AudioAnalysisObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AudioAnalysisObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .meta(getMeta())
                .track(getTrack())
                .bars(getBars())
                .beats(getBeats())
                .sections(getSections())
                .segments(getSegments())
                .tatums(getTatums());
        return builder;
    }

    /**
     * Class to build instances of {@link AudioAnalysisObject}.
     */
    public static class Builder {
        private Meta meta;
        private Track track;
        private List<TimeIntervalObject> bars;
        private List<TimeIntervalObject> beats;
        private List<SectionObject> sections;
        private List<SegmentObject> segments;
        private List<TimeIntervalObject> tatums;



        /**
         * Setter for meta.
         * @param  meta  Meta value for meta.
         * @return Builder
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Setter for track.
         * @param  track  Track value for track.
         * @return Builder
         */
        public Builder track(Track track) {
            this.track = track;
            return this;
        }

        /**
         * Setter for bars.
         * @param  bars  List of TimeIntervalObject value for bars.
         * @return Builder
         */
        public Builder bars(List<TimeIntervalObject> bars) {
            this.bars = bars;
            return this;
        }

        /**
         * Setter for beats.
         * @param  beats  List of TimeIntervalObject value for beats.
         * @return Builder
         */
        public Builder beats(List<TimeIntervalObject> beats) {
            this.beats = beats;
            return this;
        }

        /**
         * Setter for sections.
         * @param  sections  List of SectionObject value for sections.
         * @return Builder
         */
        public Builder sections(List<SectionObject> sections) {
            this.sections = sections;
            return this;
        }

        /**
         * Setter for segments.
         * @param  segments  List of SegmentObject value for segments.
         * @return Builder
         */
        public Builder segments(List<SegmentObject> segments) {
            this.segments = segments;
            return this;
        }

        /**
         * Setter for tatums.
         * @param  tatums  List of TimeIntervalObject value for tatums.
         * @return Builder
         */
        public Builder tatums(List<TimeIntervalObject> tatums) {
            this.tatums = tatums;
            return this;
        }

        /**
         * Builds a new {@link AudioAnalysisObject} object using the set fields.
         * @return {@link AudioAnalysisObject}
         */
        public AudioAnalysisObject build() {
            return new AudioAnalysisObject(meta, track, bars, beats, sections, segments, tatums);
        }
    }
}