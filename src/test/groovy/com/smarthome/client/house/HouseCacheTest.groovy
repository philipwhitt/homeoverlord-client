package com.smarthome.client.house;

import org.junit.Before;
import org.junit.Test;

class HouseCacheTest {

    String testApiKey = "c24a03360f29a0df22cd4c18cb184f0f";

    @Before
    public void setup() {
        HouseCache.init(testApiKey);

        HouseCache.get().svc = new HouseServiceStub();
    }

    @Test
    def void "Cache should return same object if called before 5 seconds"() {
        HouseCache.get().getHouse();

        Thread.sleep(2000); // wait 2 sec

        HouseCache.get().getHouse();

        assert HouseCache.get().svc.numGets == 1
    }

    @Test
    def void "Cache should return different object if called after 5 seconds"() {
        HouseCache.get().getHouse();

        Thread.sleep(6000); // wait 6 sec

        HouseCache.get().getHouse();

        assert HouseCache.get().svc.numGets == 2
    }


}