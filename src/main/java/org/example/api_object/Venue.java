package org.example.api_object;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Venue implements ApiObject {
    @JsonProperty("location")
    private Location location;

    @JsonProperty("title")
    private String title;

    @JsonProperty("address")
    private String address;

    @JsonProperty("foursquare_id")
    private String foursquareId;

    @JsonProperty("foursquare_type")
    private String foursquareType;

    @JsonProperty("google_place_id")
    private String googlePlaceId;

    @JsonProperty("google_place_type")
    private String googlePlaceType;

    private Venue() {
    }
}
