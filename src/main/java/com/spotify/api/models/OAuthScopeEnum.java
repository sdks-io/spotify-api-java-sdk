/*
 * SpotifyWebAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.spotify.api.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * OAuthScopeEnum to be used.
 */
public enum OAuthScopeEnum {
    /**
     * Communicate with the Spotify app on your device.
     */
    APP_REMOTE_CONTROL,

    /**
     * Access your private playlists.
     */
    PLAYLIST_READ_PRIVATE,

    /**
     * Access your collaborative playlists.
     */
    PLAYLIST_READ_COLLABORATIVE,

    /**
     * Manage your public playlists.
     */
    PLAYLIST_MODIFY_PUBLIC,

    /**
     * Manage your private playlists.
     */
    PLAYLIST_MODIFY_PRIVATE,

    /**
     * Access your saved content.
     */
    USER_LIBRARY_READ,

    /**
     * Manage your saved content.
     */
    USER_LIBRARY_MODIFY,

    /**
     * Access your subscription details.
     */
    USER_READ_PRIVATE,

    /**
     * Get your real email address.
     */
    USER_READ_EMAIL,

    /**
     * Access your followers and who you are following.
     */
    USER_FOLLOW_READ,

    /**
     * Manage your saved content.
     */
    USER_FOLLOW_MODIFY,

    /**
     * Read your top artists and content.
     */
    USER_TOP_READ,

    /**
     * Read your position in content you have played.
     */
    USER_READ_PLAYBACK_POSITION,

    /**
     * Read your currently playing content and Spotify Connect devices information.
     */
    USER_READ_PLAYBACK_STATE,

    /**
     * Access your recently played items.
     */
    USER_READ_RECENTLY_PLAYED,

    /**
     * Read your currently playing content.
     */
    USER_READ_CURRENTLY_PLAYING,

    /**
     * Control playback on your Spotify clients and Spotify Connect devices.
     */
    USER_MODIFY_PLAYBACK_STATE,

    /**
     * Upload images to Spotify on your behalf.
     */
    UGC_IMAGE_UPLOAD,

    /**
     * Play content and control playback on your other devices.
     */
    STREAMING;


    private static TreeMap<String, OAuthScopeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        APP_REMOTE_CONTROL.value = "app-remote-control";
        PLAYLIST_READ_PRIVATE.value = "playlist-read-private";
        PLAYLIST_READ_COLLABORATIVE.value = "playlist-read-collaborative";
        PLAYLIST_MODIFY_PUBLIC.value = "playlist-modify-public";
        PLAYLIST_MODIFY_PRIVATE.value = "playlist-modify-private";
        USER_LIBRARY_READ.value = "user-library-read";
        USER_LIBRARY_MODIFY.value = "user-library-modify";
        USER_READ_PRIVATE.value = "user-read-private";
        USER_READ_EMAIL.value = "user-read-email";
        USER_FOLLOW_READ.value = "user-follow-read";
        USER_FOLLOW_MODIFY.value = "user-follow-modify";
        USER_TOP_READ.value = "user-top-read";
        USER_READ_PLAYBACK_POSITION.value = "user-read-playback-position";
        USER_READ_PLAYBACK_STATE.value = "user-read-playback-state";
        USER_READ_RECENTLY_PLAYED.value = "user-read-recently-played";
        USER_READ_CURRENTLY_PLAYING.value = "user-read-currently-playing";
        USER_MODIFY_PLAYBACK_STATE.value = "user-modify-playback-state";
        UGC_IMAGE_UPLOAD.value = "ugc-image-upload";
        STREAMING.value = "streaming";

        valueMap.put("app-remote-control", APP_REMOTE_CONTROL);
        valueMap.put("playlist-read-private", PLAYLIST_READ_PRIVATE);
        valueMap.put("playlist-read-collaborative", PLAYLIST_READ_COLLABORATIVE);
        valueMap.put("playlist-modify-public", PLAYLIST_MODIFY_PUBLIC);
        valueMap.put("playlist-modify-private", PLAYLIST_MODIFY_PRIVATE);
        valueMap.put("user-library-read", USER_LIBRARY_READ);
        valueMap.put("user-library-modify", USER_LIBRARY_MODIFY);
        valueMap.put("user-read-private", USER_READ_PRIVATE);
        valueMap.put("user-read-email", USER_READ_EMAIL);
        valueMap.put("user-follow-read", USER_FOLLOW_READ);
        valueMap.put("user-follow-modify", USER_FOLLOW_MODIFY);
        valueMap.put("user-top-read", USER_TOP_READ);
        valueMap.put("user-read-playback-position", USER_READ_PLAYBACK_POSITION);
        valueMap.put("user-read-playback-state", USER_READ_PLAYBACK_STATE);
        valueMap.put("user-read-recently-played", USER_READ_RECENTLY_PLAYED);
        valueMap.put("user-read-currently-playing", USER_READ_CURRENTLY_PLAYING);
        valueMap.put("user-modify-playback-state", USER_MODIFY_PLAYBACK_STATE);
        valueMap.put("ugc-image-upload", UGC_IMAGE_UPLOAD);
        valueMap.put("streaming", STREAMING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OAuthScopeEnum constructFromString(String toConvert) throws IOException {
        OAuthScopeEnum enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static OAuthScopeEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of OAuthScopeEnum values to list of string values.
     * @param toConvert The list of OAuthScopeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OAuthScopeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OAuthScopeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 