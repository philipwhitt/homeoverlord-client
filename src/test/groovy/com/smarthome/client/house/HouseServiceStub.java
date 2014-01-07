package com.smarthome.client.house;

public class HouseServiceStub implements HouseServiceInterface{

    public int numGets = 0;

    @Override
    public House get() {
        numGets++;
        return new House();
    }
}
