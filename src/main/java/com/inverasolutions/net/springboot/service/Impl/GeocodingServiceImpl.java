package com.inverasolutions.net.springboot.service.Impl;

import com.inverasolutions.net.springboot.dao.GeocodingDao;
import com.inverasolutions.net.springboot.model.GeocodeResponse;
import com.inverasolutions.net.springboot.service.GeocodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by InveraSolutionsInc on 3/6/16.
 */
@Component
public class GeocodingServiceImpl implements GeocodingService {

    @Autowired
    private GeocodingDao geocodingDao;

    @Override
    public GeocodeResponse findGeocodingResponse(String address) {

        return geocodingDao.findGeocodingResponse(address);
    }
}
