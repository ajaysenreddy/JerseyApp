package com.inverasolutions.net.springboot.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by InveraSolutionsInc on 3/6/16.
 */
@XmlRootElement(name = "address_components")
public class AddressComponents {

    private String long_name;
    private String short_name;
    private List<String> types;

    public AddressComponents() {}

    public String getLong_name() {
        return long_name;
    }

    public void setLong_name(String long_name) {
        this.long_name = long_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }
}
