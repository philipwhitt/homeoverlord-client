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

        String resp = resource.path(RESOURCE).queryParams(queryParams).header("Authorization", apiKey).put(String.class);
        System.out.println(resp);
    }

    public void close(String description) {
        MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
        queryParams.add("description", description);

        String resp = resource.path(RESOURCE).queryParams(queryParams).header("Authorization", apiKey).delete(String.class);
        System.out.println(resp);
    }

    public void open(String description, Location location) {
        MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
        queryParams.add("locationId", location.getId());
        queryParams.add("description", description);

        String resp = resource.path(RESOURCE).queryParams(queryParams).header("Authorization", apiKey).put(String.class);
        System.out.println(resp);
    }

    public void close(String description, Location location) {
        MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
        queryParams.add("locationId", location.getId());
        queryParams.add("description", description);

        String resp = resource.path(RESOURCE).queryParams(queryParams).header("Authorization", apiKey).delete(String.class);
        System.out.println(resp);
    }

}