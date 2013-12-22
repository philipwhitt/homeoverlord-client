package com.smarthome;

import com.smarthome.api.door.DoorService;
import com.smarthome.api.house.HouseService;
import com.smarthome.api.house.House;
import com.smarthome.api.location.Location;
import com.smarthome.api.location.LocationFactory;
import com.smarthome.api.temperature.Temperature;
import com.smarthome.api.temperature.TemperatureService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {

    public static Integer temp = 35;

    // Known Locations
    private static final String SECOND_FLOOR_LOFT = "6";
    private static final String FIRST_FLOOR_LIVING_ROOM = "10";
    private static final String GARAGE = "9";

	public static void main(String[] args) throws Exception {
//		System.out.println("Hello " + args[0] + "!");

        Config.host   = "smarthome.corn";
        Config.apiKey = "c24a03360f29a0df22cd4c18cb184f0f";

//        HouseService service = new HouseService();
//		House house = service.get();

        JFrame frame = new JFrame("SmartHome Tool Kit");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Temp

        JButton tempButton = new JButton("Update Temp");
        tempButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HelloWorld.temp+=5;
                String temp = HelloWorld.temp.toString();
                TemperatureService temperatureService = new TemperatureService();
                temperatureService.put(temp, LocationFactory.get().find(FIRST_FLOOR_LIVING_ROOM));
            }
        });
        frame.add(tempButton);


        // Open Action

        JButton openButton = new JButton("Open Door");
        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DoorService doorService = new DoorService();
                doorService.open("Opened front door", LocationFactory.get().find(FIRST_FLOOR_LIVING_ROOM));
            }
        });
        frame.add(openButton);


        // Close Action

        JButton closeButton = new JButton("Close Door");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DoorService doorService = new DoorService();
                doorService.close("Closed front door", LocationFactory.get().find(FIRST_FLOOR_LIVING_ROOM));
            }
        });
        frame.add(closeButton);

        frame.setSize(250,250);
        frame.setVisible(true);


//        TemperatureService temperatureService = new TemperatureService();
//        for (Temperature temp : temperatureService.get()) {
//            System.out.println("Temp " + temp.getId() + " is " + temp.getTemperature());
//        }
//
//        Location secondFloorLoft = LocationFactory.get().find(SECOND_FLOOR_LOFT);
//        if (secondFloorLoft != null) {
//            temperatureService.put("65.4", secondFloorLoft);
//        }
//
//        Location livingRoom = LocationFactory.get().find(FIRST_FLOOR_LIVING_ROOM);
//        Location garage     = LocationFactory.get().find(GARAGE);
//
//        DoorService doorService = new DoorService();
//        doorService.open("Opened front door", livingRoom);
//
//        Thread.sleep(4000);
//        doorService.close("Closed front door", livingRoom);
//
//        Thread.sleep(4000);
//        doorService.open("Garage Opened", garage);
    }
}