/*
 * SpotifyWebAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.spotify.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ErrorObject type.
 */
public class ErrorObject {
    private int status;
    private String message;

    /**
     * Default constructor.
     */
    public ErrorObject() {
    }

    /**
     * Initialization constructor.
     * @param  status  int value for status.
     * @param  message  String value for message.
     */
    public ErrorObject(
            int status,
            String message) {
        this.status = status;
        this.message = message;
    }

    /**
     * Getter for Status.
     * The HTTP status code (also returned in the response header; see [Response Status
     * Codes](/documentation/web-api/concepts/api-calls#response-status-codes) for more
     * information).
     * @return Returns the int
     */
    @JsonGetter("status")
    public int getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The HTTP status code (also returned in the response header; see [Response Status
     * Codes](/documentation/web-api/concepts/api-calls#response-status-codes) for more
     * information).
     * @param status Value for int
     */
    @JsonSetter("status")
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Getter for Message.
     * A short description of the cause of the error.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * A short description of the cause of the error.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this ErrorObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ErrorObject [" + "status=" + status + ", message=" + message + "]";
    }

    /**
     * Builds a new {@link ErrorObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ErrorObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(status, message);
        return builder;
    }

    /**
     * Class to build instances of {@link ErrorObject}.
     */
    public static class Builder {
        private int status;
        private String message;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  status  int value for status.
         * @param  message  String value for message.
         */
        public Builder(int status, String message) {
            this.status = status;
            this.message = message;
        }

        /**
         * Setter for status.
         * @param  status  int value for status.
         * @return Builder
         */
        public Builder status(int status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link ErrorObject} object using the set fields.
         * @return {@link ErrorObject}
         */
        public ErrorObject build() {
            return new ErrorObject(status, message);
        }
    }
}
