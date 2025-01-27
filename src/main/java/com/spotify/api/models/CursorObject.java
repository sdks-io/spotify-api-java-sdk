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
 * This is a model class for CursorObject type.
 */
public class CursorObject {
    private String after;
    private String before;

    /**
     * Default constructor.
     */
    public CursorObject() {
    }

    /**
     * Initialization constructor.
     * @param  after  String value for after.
     * @param  before  String value for before.
     */
    public CursorObject(
            String after,
            String before) {
        this.after = after;
        this.before = before;
    }

    /**
     * Getter for After.
     * The cursor to use as key to find the next page of items.
     * @return Returns the String
     */
    @JsonGetter("after")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAfter() {
        return after;
    }

    /**
     * Setter for After.
     * The cursor to use as key to find the next page of items.
     * @param after Value for String
     */
    @JsonSetter("after")
    public void setAfter(String after) {
        this.after = after;
    }

    /**
     * Getter for Before.
     * The cursor to use as key to find the previous page of items.
     * @return Returns the String
     */
    @JsonGetter("before")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBefore() {
        return before;
    }

    /**
     * Setter for Before.
     * The cursor to use as key to find the previous page of items.
     * @param before Value for String
     */
    @JsonSetter("before")
    public void setBefore(String before) {
        this.before = before;
    }

    /**
     * Converts this CursorObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CursorObject [" + "after=" + after + ", before=" + before + "]";
    }

    /**
     * Builds a new {@link CursorObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CursorObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .after(getAfter())
                .before(getBefore());
        return builder;
    }

    /**
     * Class to build instances of {@link CursorObject}.
     */
    public static class Builder {
        private String after;
        private String before;



        /**
         * Setter for after.
         * @param  after  String value for after.
         * @return Builder
         */
        public Builder after(String after) {
            this.after = after;
            return this;
        }

        /**
         * Setter for before.
         * @param  before  String value for before.
         * @return Builder
         */
        public Builder before(String before) {
            this.before = before;
            return this;
        }

        /**
         * Builds a new {@link CursorObject} object using the set fields.
         * @return {@link CursorObject}
         */
        public CursorObject build() {
            return new CursorObject(after, before);
        }
    }
}
