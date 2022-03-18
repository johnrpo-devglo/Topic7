package com.challenge.topic7.web.service;

import com.challenge.topic7.web.dao.LocationDao;
import com.challenge.topic7.web.entities.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    private LocationDao locationDao;

    @Override
    @Transactional(readOnly = true)
    public List<Location> showLocation() {
        return (List<Location>) locationDao.findAll();
    }

    @Override
    @Transactional
    public void save(Location location) {
        locationDao.save(location);
    }

    @Override
    @Transactional
    public void delete(Location location) {
        locationDao.delete(location);
    }

    @Override
    @Transactional(readOnly = true)
    public Location findLocation(Location location) {
        return locationDao.findById(location.getId()).orElse(null);
    }
}
