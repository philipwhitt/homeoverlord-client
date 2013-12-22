package com.smarthome.api.house;

import com.smarthome.api.Service;

public class HouseService extends Service {

    private static final String RESOURCE = "/api/house";

    public House get() {
        return resource.path(RESOURCE).header("Authorization", apiKey).get(HouseContainer.class).getContent();
	}

}