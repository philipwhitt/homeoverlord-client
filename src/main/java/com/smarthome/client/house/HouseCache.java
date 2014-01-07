package com.smarthome.client.house;

public class HouseCache {

    private static HouseCache instance = null;
    private static final int REFRESH_INT = 5000; // refresh every 5 seconds

    private long lastFind = 0;
    private House house = null;
    private HouseServiceInterface svc;

    public static void init(String apiKey) {
        instance = new HouseCache(apiKey);
    }

    public static HouseCache get() throws Exception {
        if (instance == null) {
            throw new Exception("HouseCache.init() must be called before used");
        }
        return instance;
    }

    private HouseCache(String apiKey) {
        svc = new HouseService(apiKey);
    }

    public House getHouse() {
        long currentTime = System.currentTimeMillis();

        if (house == null) {
            house = svc.get();
            lastFind = currentTime;

        } else {
            if ((currentTime - lastFind) > REFRESH_INT) {
                house = svc.get();
                lastFind = currentTime;
            }
        }

        return house;
    }

}
