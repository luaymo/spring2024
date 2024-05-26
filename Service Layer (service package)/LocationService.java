package com.coffeeplace.coffeeshopapp.service;

import com.coffeeplace.coffeeshopapp.domain.Location;

import java.util.List;

public interface LocationService {
    Location addLocation(String name, double latitude, double longitude);
    List<Location> getAllLocations();
    Location getLocationById(Long id);
}
