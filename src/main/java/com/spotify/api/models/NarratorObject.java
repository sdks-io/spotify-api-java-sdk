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
 * This is a model class for NarratorObject type.
 */
public class NarratorObject {
    private String name;

    /**
     * Default constructor.
     */
    public NarratorObject() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     */
    public NarratorObject(
            String name) {
        this.name = name;
    }

    /**
     * Getter for Name.
     * The name of the Narrator.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the Narrator.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Converts this NarratorObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NarratorObject [" + "name=" + name + "]";
    }

    /**
     * Builds a new {@link NarratorObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NarratorObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link NarratorObject}.
     */
    public static class Builder {
        private String name;



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
         * Builds a new {@link NarratorObject} object using the set fields.
         * @return {@link NarratorObject}
         */
        public NarratorObject build() {
            return new NarratorObject(name);
        }
    }
}