package com.smarthome.client.temperature;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
public class Temperature {

    private String id;
    private String temperature;
    private String created;

}
