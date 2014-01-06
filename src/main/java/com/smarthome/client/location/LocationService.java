package com.smarthome.client.location;

import com.smarthome.client.Service;

import java.util.List;

public class LocationService extends Service {

    private static final String RESOURCE = "/api/location";

    public LocationService(String apiKey) {
        super(apiKey);
    }

    public List<Location> get() {
        return resource.path(RESOURCE).header("X-Authorization", apiKey).get(LocationContainer.class).getContent();
    }

}
