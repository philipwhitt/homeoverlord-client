package com.smarthome.client.location;

import java.util.HashMap;

public class LocationFactory {

    private static LocationFactory instance = null;

    private HashMap<String, Location> map = new HashMap<>();

    public static LocationFactory get(String apiKey) {
        if (instance == null) {
            instance = new LocationFactory(apiKey);
        }
        return instance;
    }

    private LocationFactory(String apiKey) {
        LocationService locationService = new LocationService(apiKey);
        for (Location location : locationService.get()) {
            map.put(location.getId(), location);
        }
    }

    public Location find(String id) {
        return map.get(id);
    }

}
