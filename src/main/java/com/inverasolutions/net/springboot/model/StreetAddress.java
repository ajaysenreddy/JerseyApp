package com.inverasolutions.net.springboot.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by InveraSolutionsInc on 3/6/16.
 */
@XmlRootElement
public class StreetAddress {


    private String formatted_address;

    private List<AddressComponents> address_components;

    private String place_id;

    private Geometry geometry;

    public StreetAddress() {}


    public List<AddressComponents> getAddress_components() {
        return address_components;
    }

    public void setAddress_components(List<AddressComponents> address_components) {
        this.address_components = address_components;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }


}
