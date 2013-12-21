package com.smarthome.api.temperature;

import com.smarthome.api.Service;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import javax.ws.rs.core.MultivaluedMap;
import java.util.List;

public class TemperatureService extends Service {

    private static final String RESOURCE = "/api/temperature";

    public List<Temperature> get() {
        return resource.path(RESOURCE).get(TemperatureContainer.class).getContent();
    }

    public void put(String farenhit) {
        MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
        queryParams.add("fahrenheit", farenhit);

        String resp = resource.path(RESOURCE).queryParams(queryParams).put(String.class);
        System.out.println(resp);
    }

}