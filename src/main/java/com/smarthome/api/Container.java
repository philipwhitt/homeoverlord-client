package com.smarthome.api;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
public class Container {

    private int status;
    protected Object content;
}
