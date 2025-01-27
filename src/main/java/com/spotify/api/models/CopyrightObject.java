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
 * This is a model class for CopyrightObject type.
 */
public class CopyrightObject {
    private String text;
    private String type;

    /**
     * Default constructor.
     */
    public CopyrightObject() {
    }

    /**
     * Initialization constructor.
     * @param  text  String value for text.
     * @param  type  String value for type.
     */
    public CopyrightObject(
            String text,
            String type) {
        this.text = text;
        this.type = type;
    }

    /**
     * Getter for Text.
     * The copyright text for this content.
     * @return Returns the String
     */
    @JsonGetter("text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getText() {
        return text;
    }

    /**
     * Setter for Text.
     * The copyright text for this content.
     * @param text Value for String
     */
    @JsonSetter("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter for Type.
     * The type of copyright: `C` = the copyright, `P` = the sound recording (performance)
     * copyright.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The type of copyright: `C` = the copyright, `P` = the sound recording (performance)
     * copyright.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Converts this CopyrightObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CopyrightObject [" + "text=" + text + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link CopyrightObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CopyrightObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .text(getText())
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link CopyrightObject}.
     */
    public static class Builder {
        private String text;
        private String type;



        /**
         * Setter for text.
         * @param  text  String value for text.
         * @return Builder
         */
        public Builder text(String text) {
            this.text = text;
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
         * Builds a new {@link CopyrightObject} object using the set fields.
         * @return {@link CopyrightObject}
         */
        public CopyrightObject build() {
            return new CopyrightObject(text, type);
        }
    }
}
