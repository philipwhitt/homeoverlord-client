package com.smarthome.client.house;

import com.smarthome.client.Container;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
@EqualsAndHashCode(callSuper=true)
public class HouseContainer extends Container {

    protected House content;

}
