package com.smarthome.api.location;

import com.smarthome.api.Service;

import java.util.List;

public class LocationService extends Service {

    public List<Location> get() {
        return resource.path("/api/location").get(LocationContainer.class).getContent();
    }

}
