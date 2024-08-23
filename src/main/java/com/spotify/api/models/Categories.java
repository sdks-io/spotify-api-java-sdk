/*
 * SpotifyWebAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.spotify.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for Categories type.
 */
public class Categories {
    private String href;
    private int limit;
    private String next;
    private int offset;
    private String previous;
    private int total;
    private List<CategoryObject> items;

    /**
     * Default constructor.
     */
    public Categories() {
    }

    /**
     * Initialization constructor.
     * @param  href  String value for href.
     * @param  limit  int value for limit.
     * @param  next  String value for next.
     * @param  offset  int value for offset.
     * @param  previous  String value for previous.
     * @param  total  int value for total.
     * @param  items  List of CategoryObject value for items.
     */
    public Categories(
            String href,
            int limit,
            String next,
            int offset,
            String previous,
            int total,
            List<CategoryObject> items) {
        this.href = href;
        this.limit = limit;
        this.next = next;
        this.offset = offset;
        this.previous = previous;
        this.total = total;
        this.items = items;
    }

    /**
     * Getter for Href.
     * A link to the Web API endpoint returning the full result of the request
     * @return Returns the String
     */
    @JsonGetter("href")
    public String getHref() {
        return href;
    }

    /**
     * Setter for Href.
     * A link to the Web API endpoint returning the full result of the request
     * @param href Value for String
     */
    @JsonSetter("href")
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Getter for Limit.
     * The maximum number of items in the response (as set in the query or by default).
     * @return Returns the int
     */
    @JsonGetter("limit")
    public int getLimit() {
        return limit;
    }

    /**
     * Setter for Limit.
     * The maximum number of items in the response (as set in the query or by default).
     * @param limit Value for int
     */
    @JsonSetter("limit")
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * Getter for Next.
     * URL to the next page of items. ( `null` if none)
     * @return Returns the String
     */
    @JsonGetter("next")
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
     * Getter for Offset.
     * The offset of the items returned (as set in the query or by default)
     * @return Returns the int
     */
    @JsonGetter("offset")
    public int getOffset() {
        return offset;
    }

    /**
     * Setter for Offset.
     * The offset of the items returned (as set in the query or by default)
     * @param offset Value for int
     */
    @JsonSetter("offset")
    public void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     * Getter for Previous.
     * URL to the previous page of items. ( `null` if none)
     * @return Returns the String
     */
    @JsonGetter("previous")
    public String getPrevious() {
        return previous;
    }

    /**
     * Setter for Previous.
     * URL to the previous page of items. ( `null` if none)
     * @param previous Value for String
     */
    @JsonSetter("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    /**
     * Getter for Total.
     * The total number of items available to return.
     * @return Returns the int
     */
    @JsonGetter("total")
    public int getTotal() {
        return total;
    }

    /**
     * Setter for Total.
     * The total number of items available to return.
     * @param total Value for int
     */
    @JsonSetter("total")
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Getter for Items.
     * @return Returns the List of CategoryObject
     */
    @JsonGetter("items")
    public List<CategoryObject> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * @param items Value for List of CategoryObject
     */
    @JsonSetter("items")
    public void setItems(List<CategoryObject> items) {
        this.items = items;
    }

    /**
     * Converts this Categories into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Categories [" + "href=" + href + ", limit=" + limit + ", next=" + next + ", offset="
                + offset + ", previous=" + previous + ", total=" + total + ", items=" + items + "]";
    }

    /**
     * Builds a new {@link Categories.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Categories.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(href, limit, next, offset, previous, total, items);
        return builder;
    }

    /**
     * Class to build instances of {@link Categories}.
     */
    public static class Builder {
        private String href;
        private int limit;
        private String next;
        private int offset;
        private String previous;
        private int total;
        private List<CategoryObject> items;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  href  String value for href.
         * @param  limit  int value for limit.
         * @param  next  String value for next.
         * @param  offset  int value for offset.
         * @param  previous  String value for previous.
         * @param  total  int value for total.
         * @param  items  List of CategoryObject value for items.
         */
        public Builder(String href, int limit, String next, int offset, String previous, int total,
                List<CategoryObject> items) {
            this.href = href;
            this.limit = limit;
            this.next = next;
            this.offset = offset;
            this.previous = previous;
            this.total = total;
            this.items = items;
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
         * Setter for limit.
         * @param  limit  int value for limit.
         * @return Builder
         */
        public Builder limit(int limit) {
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
         * Setter for offset.
         * @param  offset  int value for offset.
         * @return Builder
         */
        public Builder offset(int offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Setter for previous.
         * @param  previous  String value for previous.
         * @return Builder
         */
        public Builder previous(String previous) {
            this.previous = previous;
            return this;
        }

        /**
         * Setter for total.
         * @param  total  int value for total.
         * @return Builder
         */
        public Builder total(int total) {
            this.total = total;
            return this;
        }

        /**
         * Setter for items.
         * @param  items  List of CategoryObject value for items.
         * @return Builder
         */
        public Builder items(List<CategoryObject> items) {
            this.items = items;
            return this;
        }

        /**
         * Builds a new {@link Categories} object using the set fields.
         * @return {@link Categories}
         */
        public Categories build() {
            return new Categories(href, limit, next, offset, previous, total, items);
        }
    }
}
