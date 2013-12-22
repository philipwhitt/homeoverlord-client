package com.smarthome.api.location;

import com.smarthome.api.Service;

import java.util.List;

public class LocationService extends Service {

    private static final String RESOURCE = "/api/location";

    public List<Location> get() {
        return resource.path(RESOURCE).header("Authorization", apiKey).get(LocationContainer.class).getContent();
    }

}
