package com.smarthome.client.house;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import lombok.Data;

@Data
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
public class House {

    private String id;
    private String name;
    private String apiKey;
    private Boolean isAlarmActivated;

}
