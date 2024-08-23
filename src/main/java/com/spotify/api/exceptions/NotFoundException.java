/*
 * SpotifyWebAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.spotify.api.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.spotify.api.models.ErrorObject;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for NotFoundException type.
 */
public class NotFoundException extends ApiException {
    private static final long serialVersionUID = -50696204312869992L;
    private ErrorObject error;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public NotFoundException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Error.
     * @return Returns the ErrorObject
     */
    @JsonGetter("error")
    public ErrorObject getError() {
        return this.error;
    }

    /**
     * Setter for Error.
     * @param error Value for ErrorObject
     */
    @JsonSetter("error")
    private void setError(ErrorObject error) {
        this.error = error;
    }
}
