package com.smarthome.api;

import com.smarthome.Config;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class Service {

    protected WebResource resource;
    protected String apiKey;

    public Service() {
        apiKey = Config.apiKey;

        ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

        resource = Client.create(clientConfig).resource("http://"+Config.host);
    }

}
