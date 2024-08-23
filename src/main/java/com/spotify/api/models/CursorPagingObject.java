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
 * This is a model class for CursorPagingObject type.
 */
public class CursorPagingObject {
    private String href;
    private Integer limit;
    private String next;
    private CursorObject cursors;
    private Integer total;

    /**
     * Default constructor.
     */
    public CursorPagingObject() {
    }

    /**
     * Initialization constructor.
     * @param  href  String value for href.
     * @param  limit  Integer value for limit.
     * @param  next  String value for next.
     * @param  cursors  CursorObject value for cursors.
     * @param  total  Integer value for total.
     */
    public CursorPagingObject(
            String href,
            Integer limit,
            String next,
            CursorObject cursors,
            Integer total) {
        this.href = href;
        this.limit = limit;
        this.next = next;
        this.cursors = cursors;
        this.total = total;
    }

    /**
     * Getter for Href.
     * A link to the Web API endpoint returning the full result of the request.
     * @return Returns the String
     */
    @JsonGetter("href")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHref() {
        return href;
    }

    /**
     * Setter for Href.
     * A link to the Web API endpoint returning the full result of the request.
     * @param href Value for String
     */
    @JsonSetter("href")
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Getter for Limit.
     * The maximum number of items in the response (as set in the query or by default).
     * @return Returns the Integer
     */
    @JsonGetter("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLimit() {
        return limit;
    }

    /**
     * Setter for Limit.
     * The maximum number of items in the response (as set in the query or by default).
     * @param limit Value for Integer
     */
    @JsonSetter("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Getter for Next.
     * URL to the next page of items. ( `null` if none)
     * @return Returns the String
     */
    @JsonGetter("next")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNext() {
        return next;
    }

    /**
     * Setter for Next.
     * URL to the next page of items. ( `null` if none)
     * @param next Value for String
     */
    @JsonSetter("next")
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * Getter for Cursors.
     * The cursors used to find the next set of items.
     * @return Returns the CursorObject
     */
    @JsonGetter("cursors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CursorObject getCursors() {
        return cursors;
    }

    /**
     * Setter for Cursors.
     * The cursors used to find the next set of items.
     * @param cursors Value for CursorObject
     */
    @JsonSetter("cursors")
    public void setCursors(CursorObject cursors) {
        this.cursors = cursors;
    }

    /**
     * Getter for Total.
     * The total number of items available to return.
     * @return Returns the Integer
     */
    @JsonGetter("total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotal() {
        return total;
    }

    /**
     * Setter for Total.
     * The total number of items available to return.
     * @param total Value for Integer
     */
    @JsonSetter("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * Converts this CursorPagingObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CursorPagingObject [" + "href=" + href + ", limit=" + limit + ", next=" + next
                + ", cursors=" + cursors + ", total=" + total + "]";
    }

    /**
     * Builds a new {@link CursorPagingObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CursorPagingObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .href(getHref())
                .limit(getLimit())
                .next(getNext())
                .cursors(getCursors())
                .total(getTotal());
        return builder;
    }

    /**
     * Class to build instances of {@link CursorPagingObject}.
     */
    public static class Builder {
        private String href;
        private Integer limit;
        private String next;
        private CursorObject cursors;
        private Integer total;



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
         * Setter for limit.
         * @param  limit  Integer value for limit.
         * @return Builder
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Setter for next.
         * @param  next  String value for next.
         * @return Builder
         */
        public Builder next(String next) {
            this.next = next;
            return this;
        }

        /**
         * Setter for cursors.
         * @param  cursors  CursorObject value for cursors.
         * @return Builder
         */
        public Builder cursors(CursorObject cursors) {
            this.cursors = cursors;
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
         * Builds a new {@link CursorPagingObject} object using the set fields.
         * @return {@link CursorPagingObject}
         */
        public CursorPagingObject build() {
            return new CursorPagingObject(href, limit, next, cursors, total);
        }
    }
}
