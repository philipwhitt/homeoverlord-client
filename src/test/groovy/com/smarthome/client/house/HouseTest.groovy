package com.smarthome.client.house;

import org.junit.Before;
import org.junit.Test;

class HouseTest {

    private House house;

    @Before
    public void setup() {
        house = new House();
        house.setId("1");
        house.setIsAlarmActivated(false);
        house.setApiKey("c24a03360f29a0df22cd4c18cb184f0f");
        house.setName("14401 Weldon");
    }

    @Test
    def void "Get should return house"() {
        HouseService houseService = new HouseService(house.getApiKey());

        House houseB = houseService.get();

        assert houseB == house;
    }

}