package com.smarthome.client.house;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.Builder;

@Data
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
@Builder
public class House {

    private String id;
    private String name;
    private String apiKey;
    private Boolean isAlarmActivated;

}
