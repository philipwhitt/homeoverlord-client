package com.smarthome.api.location;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
public class Location {

    private String id;
    private String description;
    private String created;

}
