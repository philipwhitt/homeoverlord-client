package com.smarthome.client.house;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
public class House {

    private String id;
    private String name;
    private String apiKey;
    private Boolean isAlarmActivated;

    public Boolean isAlarmActivated() {
        return isAlarmActivated;
    }

}
