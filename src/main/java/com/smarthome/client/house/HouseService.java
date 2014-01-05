package com.smarthome.client.house;

import com.smarthome.client.Service;

public class HouseService extends Service {

    private static final String RESOURCE = "/api/house";

    public HouseService(String apiKey) {
        super(apiKey);
    }

    public House get() {
        return resource.path(RESOURCE).header("Authorization", apiKey).get(HouseContainer.class).getContent();
	}

}