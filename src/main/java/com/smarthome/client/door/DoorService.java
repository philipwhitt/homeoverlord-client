package com.smarthome.client.door;

import com.smarthome.client.Service;
import com.smarthome.client.location.Location;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import javax.ws.rs.core.MultivaluedMap;

public class DoorService extends Service {

    private static final String RESOURCE = "/api/door";

    public DoorService(String apiKey) {
        super(apiKey);
    }

    public void open(String description) {
        MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
        queryParams.add("description", description);

        resource.path(RESOURCE).queryParams(queryParams).header("X-Authorization", apiKey).put(String.class);
    }

    public void close(String description) {
        MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
        queryParams.add("description", description);

        resource.path(RESOURCE).queryParams(queryParams).header("X-Authorization", apiKey).delete(String.class);
    }

    public void open(String description, Location location) {
        MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
        queryParams.add("locationId", location.getId());
        queryParams.add("description", description);

        resource.path(RESOURCE).queryParams(queryParams).header("X-Authorization", apiKey).put(String.class);
    }

    public void close(String description, Location location) {
        MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
        queryParams.add("locationId", location.getId());
        queryParams.add("description", description);

        resource.path(RESOURCE).queryParams(queryParams).header("X-Authorization", apiKey).delete(String.class);
    }

}
