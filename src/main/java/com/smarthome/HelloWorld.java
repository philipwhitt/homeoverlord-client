package com.smarthome;

import com.smarthome.api.house.HouseService;
import com.smarthome.api.house.House;
import com.smarthome.api.location.Location;
import com.smarthome.api.location.LocationService;
import com.smarthome.api.temperature.Temperature;
import com.smarthome.api.temperature.TemperatureService;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
//		System.out.println("Hello " + args[0] + "!");

        Config.host   = "smarthome.corn";
        Config.apiKey = "c24a03360f29a0df22cd4c18cb184f0f";

        HouseService service = new HouseService();
		House house = service.get();

        System.out.println();

        System.out.println("House");
        System.out.println("Name: " + house.getName());
        System.out.println("API Key: " + house.getApiKey());

        System.out.println();
        System.out.println();

        System.out.println("Temperatures");

        TemperatureService temperatureService = new TemperatureService();
        for (Temperature temp : temperatureService.get()) {
            System.out.println("Temp " + temp.getId() + " is " + temp.getTemperature());
        }

//        temperatureService.put("92.4");

        System.out.println();
        System.out.println();

        System.out.println("Locations");

        LocationService locationService = new LocationService();
        for (Location location : locationService.get()) {
            System.out.println(location.getDescription());
        }


	}

}