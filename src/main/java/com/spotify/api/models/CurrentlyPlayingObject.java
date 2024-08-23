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
 * This is a model class for CurrentlyPlayingObject type.
 */
public class CurrentlyPlayingObject {
    private ContextObject context;
    private Long timestamp;
    private Integer progressMs;
    private Boolean isPlaying;
    private Object item;
    private String currentlyPlayingType;
    private DisallowsObject actions;

    /**
     * Default constructor.
     */
    public CurrentlyPlayingObject() {
    }

    /**
     * Initialization constructor.
     * @param  context  ContextObject value for context.
     * @param  timestamp  Long value for timestamp.
     * @param  progressMs  Integer value for progressMs.
     * @param  isPlaying  Boolean value for isPlaying.
     * @param  item  Object value for item.
     * @param  currentlyPlayingType  String value for currentlyPlayingType.
     * @param  actions  DisallowsObject value for actions.
     */
    public CurrentlyPlayingObject(
            ContextObject context,
            Long timestamp,
            Integer progressMs,
            Boolean isPlaying,
            Object item,
            String currentlyPlayingType,
            DisallowsObject actions) {
        this.context = context;
        this.timestamp = timestamp;
        this.progressMs = progressMs;
        this.isPlaying = isPlaying;
        this.item = item;
        this.currentlyPlayingType = currentlyPlayingType;
        this.actions = actions;
    }

    /**
     * Getter for Context.
     * A Context Object. Can be `null`.
     * @return Returns the ContextObject
     */
    @JsonGetter("context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ContextObject getContext() {
        return context;
    }

    /**
     * Setter for Context.
     * A Context Object. Can be `null`.
     * @param context Value for ContextObject
     */
    @JsonSetter("context")
    public void setContext(ContextObject context) {
        this.context = context;
    }

    /**
     * Getter for Timestamp.
     * Unix Millisecond Timestamp when data was fetched
     * @return Returns the Long
     */
    @JsonGetter("timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Setter for Timestamp.
     * Unix Millisecond Timestamp when data was fetched
     * @param timestamp Value for Long
     */
    @JsonSetter("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for ProgressMs.
     * Progress into the currently playing track or episode. Can be `null`.
     * @return Returns the Integer
     */
    @JsonGetter("progress_ms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProgressMs() {
        return progressMs;
    }

    /**
     * Setter for ProgressMs.
     * Progress into the currently playing track or episode. Can be `null`.
     * @param progressMs Value for Integer
     */
    @JsonSetter("progress_ms")
    public void setProgressMs(Integer progressMs) {
        this.progressMs = progressMs;
    }

    /**
     * Getter for IsPlaying.
     * If something is currently playing, return `true`.
     * @return Returns the Boolean
     */
    @JsonGetter("is_playing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsPlaying() {
        return isPlaying;
    }

    /**
     * Setter for IsPlaying.
     * If something is currently playing, return `true`.
     * @param isPlaying Value for Boolean
     */
    @JsonSetter("is_playing")
    public void setIsPlaying(Boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    /**
     * Getter for Item.
     * The currently playing track or episode. Can be `null`.
     * @return Returns the Object
     */
    @JsonGetter("item")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getItem() {
        return item;
    }

    /**
     * Setter for Item.
     * The currently playing track or episode. Can be `null`.
     * @param item Value for Object
     */
    @JsonSetter("item")
    public void setItem(Object item) {
        this.item = item;
    }

    /**
     * Getter for CurrentlyPlayingType.
     * The object type of the currently playing item. Can be one of `track`, `episode`, `ad` or
     * `unknown`.
     * @return Returns the String
     */
    @JsonGetter("currently_playing_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrentlyPlayingType() {
        return currentlyPlayingType;
    }

    /**
     * Setter for CurrentlyPlayingType.
     * The object type of the currently playing item. Can be one of `track`, `episode`, `ad` or
     * `unknown`.
     * @param currentlyPlayingType Value for String
     */
    @JsonSetter("currently_playing_type")
    public void setCurrentlyPlayingType(String currentlyPlayingType) {
        this.currentlyPlayingType = currentlyPlayingType;
    }

    /**
     * Getter for Actions.
     * Allows to update the user interface based on which playback actions are available within the
     * current context.
     * @return Returns the DisallowsObject
     */
    @JsonGetter("actions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DisallowsObject getActions() {
        return actions;
    }

    /**
     * Setter for Actions.
     * Allows to update the user interface based on which playback actions are available within the
     * current context.
     * @param actions Value for DisallowsObject
     */
    @JsonSetter("actions")
    public void setActions(DisallowsObject actions) {
        this.actions = actions;
    }

    /**
     * Converts this CurrentlyPlayingObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CurrentlyPlayingObject [" + "context=" + context + ", timestamp=" + timestamp
                + ", progressMs=" + progressMs + ", isPlaying=" + isPlaying + ", item=" + item
                + ", currentlyPlayingType=" + currentlyPlayingType + ", actions=" + actions + "]";
    }

    /**
     * Builds a new {@link CurrentlyPlayingObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CurrentlyPlayingObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .context(getContext())
                .timestamp(getTimestamp())
                .progressMs(getProgressMs())
                .isPlaying(getIsPlaying())
                .item(getItem())
                .currentlyPlayingType(getCurrentlyPlayingType())
                .actions(getActions());
        return builder;
    }

    /**
     * Class to build instances of {@link CurrentlyPlayingObject}.
     */
    public static class Builder {
        private ContextObject context;
        private Long timestamp;
        private Integer progressMs;
        private Boolean isPlaying;
        private Object item;
        private String currentlyPlayingType;
        private DisallowsObject actions;



        /**
         * Setter for context.
         * @param  context  ContextObject value for context.
         * @return Builder
         */
        public Builder context(ContextObject context) {
            this.context = context;
            return this;
        }

        /**
         * Setter for timestamp.
         * @param  timestamp  Long value for timestamp.
         * @return Builder
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Setter for progressMs.
         * @param  progressMs  Integer value for progressMs.
         * @return Builder
         */
        public Builder progressMs(Integer progressMs) {
            this.progressMs = progressMs;
            return this;
        }

        /**
         * Setter for isPlaying.
         * @param  isPlaying  Boolean value for isPlaying.
         * @return Builder
         */
        public Builder isPlaying(Boolean isPlaying) {
            this.isPlaying = isPlaying;
            return this;
        }

        /**
         * Setter for item.
         * @param  item  Object value for item.
         * @return Builder
         */
        public Builder item(Object item) {
            this.item = item;
            return this;
        }

        /**
         * Setter for currentlyPlayingType.
         * @param  currentlyPlayingType  String value for currentlyPlayingType.
         * @return Builder
         */
        public Builder currentlyPlayingType(String currentlyPlayingType) {
            this.currentlyPlayingType = currentlyPlayingType;
            return this;
        }

        /**
         * Setter for actions.
         * @param  actions  DisallowsObject value for actions.
         * @return Builder
         */
        public Builder actions(DisallowsObject actions) {
            this.actions = actions;
            return this;
        }

        /**
         * Builds a new {@link CurrentlyPlayingObject} object using the set fields.
         * @return {@link CurrentlyPlayingObject}
         */
        public CurrentlyPlayingObject build() {
            return new CurrentlyPlayingObject(context, timestamp, progressMs, isPlaying, item,
                    currentlyPlayingType, actions);
        }
    }
}