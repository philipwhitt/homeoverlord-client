package com.smarthome.client.house;

import org.junit.Before;
import org.junit.Test;

class HouseTest {

    private House house;

    @Before
    public void setup() {
        house = House.builder()
            .id("1")
            .isAlarmActivated(true)
            .apiKey("c24a03360f29a0df22cd4c18cb184f0f")
            .name("Test")
            .build();
    }

    @Test
    def void "Get should return house"() {
        assert true;
    }

}