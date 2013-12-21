package com.smarthome;

// import com.smarthome.api.Service;
import com.smarthome.api.House;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello " + args[0] + "!");

		// Service service = new Service();
		// service.sendGet();
		
		House service = new House();
		service.get();
	}

}