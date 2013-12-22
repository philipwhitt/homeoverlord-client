package com.smarthome.api.location;

import java.util.HashMap;

public class LocationFactory {

    private static LocationFactory instance = null;

    private HashMap<String, Location> map = new HashMap<>();

    public static LocationFactory get() {
        if (instance == null) {
            instance = new LocationFactory();
        }
        return instance;
    }

    private LocationFactory() {
        LocationService locationService = new LocationService();
        for (Location location : locationService.get()) {
            map.put(location.getId(), location);
        }
    }

    public Location find(String id) {
        return map.get(id);
    }

}
