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

/**
 * This is a model class for FollowersObject type.
 */
public class FollowersObject {
    private OptionalNullable<String> href;
    private Integer total;

    /**
     * Default constructor.
     */
    public FollowersObject() {
    }

    /**
     * Initialization constructor.
     * @param  href  String value for href.
     * @param  total  Integer value for total.
     */
    public FollowersObject(
            String href,
            Integer total) {
        this.href = OptionalNullable.of(href);
        this.total = total;
    }

    /**
     * Initialization constructor.
     * @param  href  String value for href.
     * @param  total  Integer value for total.
     */

    protected FollowersObject(OptionalNullable<String> href, Integer total) {
        this.href = href;
        this.total = total;
    }

    /**
     * Internal Getter for Href.
     * This will always be set to null, as the Web API does not support it at the moment.
     * @return Returns the Internal String
     */
    @JsonGetter("href")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetHref() {
        return this.href;
    }

    /**
     * Getter for Href.
     * This will always be set to null, as the Web API does not support it at the moment.
     * @return Returns the String
     */
    public String getHref() {
        return OptionalNullable.getFrom(href);
    }

    /**
     * Setter for Href.
     * This will always be set to null, as the Web API does not support it at the moment.
     * @param href Value for String
     */
    @JsonSetter("href")
    public void setHref(String href) {
        this.href = OptionalNullable.of(href);
    }

    /**
     * UnSetter for Href.
     * This will always be set to null, as the Web API does not support it at the moment.
     */
    public void unsetHref() {
        href = null;
    }

    /**
     * Getter for Total.
     * The total number of followers.
     * @return Returns the Integer
     */
    @JsonGetter("total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotal() {
        return total;
    }

    /**
     * Setter for Total.
     * The total number of followers.
     * @param total Value for Integer
     */
    @JsonSetter("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * Converts this FollowersObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FollowersObject [" + "href=" + href + ", total=" + total + "]";
    }

    /**
     * Builds a new {@link FollowersObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FollowersObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .total(getTotal());
        builder.href = internalGetHref();
        return builder;
    }

    /**
     * Class to build instances of {@link FollowersObject}.
     */
    public static class Builder {
        private OptionalNullable<String> href;
        private Integer total;



        /**
         * Setter for href.
         * @param  href  String value for href.
         * @return Builder
         */
        public Builder href(String href) {
            this.href = OptionalNullable.of(href);
            return this;
        }

        /**
         * UnSetter for href.
         * @return Builder
         */
        public Builder unsetHref() {
            href = null;
            return this;
        }

        /**
         * Setter for total.
         * @param  total  Integer value for total.
         * @return Builder
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * Builds a new {@link FollowersObject} object using the set fields.
         * @return {@link FollowersObject}
         */
        public FollowersObject build() {
            return new FollowersObject(href, total);
        }
    }
}
