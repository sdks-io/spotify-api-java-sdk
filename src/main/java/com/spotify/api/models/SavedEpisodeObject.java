/*
 * SpotifyWebAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.spotify.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.api.DateTimeHelper;
import java.time.LocalDateTime;

/**
 * This is a model class for SavedEpisodeObject type.
 */
public class SavedEpisodeObject {
    private LocalDateTime addedAt;
    private EpisodeObject episode;

    /**
     * Default constructor.
     */
    public SavedEpisodeObject() {
    }

    /**
     * Initialization constructor.
     * @param  addedAt  LocalDateTime value for addedAt.
     * @param  episode  EpisodeObject value for episode.
     */
    public SavedEpisodeObject(
            LocalDateTime addedAt,
            EpisodeObject episode) {
        this.addedAt = addedAt;
        this.episode = episode;
    }

    /**
     * Getter for AddedAt.
     * The date and time the episode was saved. Timestamps are returned in ISO 8601 format as
     * Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("added_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getAddedAt() {
        return addedAt;
    }

    /**
     * Setter for AddedAt.
     * The date and time the episode was saved. Timestamps are returned in ISO 8601 format as
     * Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ.
     * @param addedAt Value for LocalDateTime
     */
    @JsonSetter("added_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setAddedAt(LocalDateTime addedAt) {
        this.addedAt = addedAt;
    }

    /**
     * Getter for Episode.
     * Information about the episode.
     * @return Returns the EpisodeObject
     */
    @JsonGetter("episode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EpisodeObject getEpisode() {
        return episode;
    }

    /**
     * Setter for Episode.
     * Information about the episode.
     * @param episode Value for EpisodeObject
     */
    @JsonSetter("episode")
    public void setEpisode(EpisodeObject episode) {
        this.episode = episode;
    }

    /**
     * Converts this SavedEpisodeObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SavedEpisodeObject [" + "addedAt=" + addedAt + ", episode=" + episode + "]";
    }

    /**
     * Builds a new {@link SavedEpisodeObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SavedEpisodeObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .addedAt(getAddedAt())
                .episode(getEpisode());
        return builder;
    }

    /**
     * Class to build instances of {@link SavedEpisodeObject}.
     */
    public static class Builder {
        private LocalDateTime addedAt;
        private EpisodeObject episode;



        /**
         * Setter for addedAt.
         * @param  addedAt  LocalDateTime value for addedAt.
         * @return Builder
         */
        public Builder addedAt(LocalDateTime addedAt) {
            this.addedAt = addedAt;
            return this;
        }

        /**
         * Setter for episode.
         * @param  episode  EpisodeObject value for episode.
         * @return Builder
         */
        public Builder episode(EpisodeObject episode) {
            this.episode = episode;
            return this;
        }

        /**
         * Builds a new {@link SavedEpisodeObject} object using the set fields.
         * @return {@link SavedEpisodeObject}
         */
        public SavedEpisodeObject build() {
            return new SavedEpisodeObject(addedAt, episode);
        }
    }
}