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
 * AlbumGroupEnum to be used.
 */
public enum AlbumGroupEnum {
    ALBUM,

    SINGLE,

    COMPILATION,

    APPEARS_ON;


    private static TreeMap<String, AlbumGroupEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ALBUM.value = "album";
        SINGLE.value = "single";
        COMPILATION.value = "compilation";
        APPEARS_ON.value = "appears_on";

        valueMap.put("album", ALBUM);
        valueMap.put("single", SINGLE);
        valueMap.put("compilation", COMPILATION);
        valueMap.put("appears_on", APPEARS_ON);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AlbumGroupEnum constructFromString(String toConvert) throws IOException {
        AlbumGroupEnum enumValue = fromString(toConvert);
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
    public static AlbumGroupEnum fromString(String toConvert) {
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
     * Convert list of AlbumGroupEnum values to list of string values.
     * @param toConvert The list of AlbumGroupEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AlbumGroupEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AlbumGroupEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 