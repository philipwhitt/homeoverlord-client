package com.smarthome.client.house;

import com.smarthome.client.Service;

public class HouseService extends Service implements HouseServiceInterface {

    private static final String RESOURCE = "/api/house";

    public HouseService(String apiKey) {
        super(apiKey);
    }

    @Override
    public House get() {
        return resource.path(RESOURCE).header("X-Authorization", apiKey).get(HouseContainer.class).getContent();
	}

}