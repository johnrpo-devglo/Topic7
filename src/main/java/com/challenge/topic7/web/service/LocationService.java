package com.challenge.topic7.web.service;

import com.challenge.topic7.web.entities.Location;

import java.util.List;

public interface LocationService {

    public List<Location> showLocation();

    public void save (Location location);

    public void delete (Location location);

    public Location findLocation (Location location);
}
