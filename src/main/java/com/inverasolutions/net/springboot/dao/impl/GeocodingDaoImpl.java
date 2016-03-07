package com.inverasolutions.net.springboot.dao.impl;

import com.inverasolutions.net.springboot.dao.GeocodingDao;
import com.inverasolutions.net.springboot.model.GeocodeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by InveraSolutionsInc on 3/6/16.
 */
@Component
public class GeocodingDaoImpl implements GeocodingDao {

    private String uri = "http://maps.googleapis.com/maps/api/geocode/json?";

    @Override
    public GeocodeResponse findGeocodingResponse(String address) {

        uri = uri + "address=" + address;

        System.out.println("uri : " + uri);

        RestTemplate restTemplate = new RestTemplate();

        GeocodeResponse  geocodeResponse = restTemplate.getForObject(uri, GeocodeResponse.class);

        return geocodeResponse;
    }
}
