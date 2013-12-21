package com.smarthome.api;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class House {

	private Client client;

	public House() {
		client = Client.create();
	}

	public void get() {
		System.out.println("About to get");

		String resp = client.resource("http://smarthome.corn/api/house").get(String.class);

		System.out.println("Response:");
		System.out.println(resp);
	}

}