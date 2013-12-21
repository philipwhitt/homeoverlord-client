package com.smarthome.api.house;

import com.smarthome.api.Service;

public class HouseService extends Service {

    public House get() {
        return resource.path("/api/house").get(HouseContainer.class).getContent();
	}

}