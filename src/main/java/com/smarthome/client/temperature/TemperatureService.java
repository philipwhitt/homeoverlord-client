package com.smarthome.client.temperature;

import com.smarthome.client.Service;
import com.smarthome.client.location.Location;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import javax.ws.rs.core.MultivaluedMap;
import java.util.List;

public class TemperatureService extends Service {

    private static final String RESOURCE = "/api/temperature";

    public TemperatureService(String apiKey) {
        super(apiKey);
    }

    public List<Temperature> get() {
        return resource.path(RESOURCE).header("X-Authorization", apiKey).get(TemperatureContainer.class).getContent();
    }

    public void put(String farenhit) {
        MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
        queryParams.add("fahrenheit", farenhit);

        doPut(queryParams);
    }

    public void put(String farenhit, Location location) {
        MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
        queryParams.add("fahrenheit", farenhit);
        queryParams.add("locationId", location.getId());

        doPut(queryParams);
    }

    private void doPut(MultivaluedMap<String, String> queryParams) {
        resource.path(RESOURCE).queryParams(queryParams).header("X-Authorization", apiKey).put();
    }

}