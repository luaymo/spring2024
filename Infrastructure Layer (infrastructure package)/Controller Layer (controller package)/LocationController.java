package com.coffeeplace.coffeeshopapp.infrastructure.controller;

import com.coffeeplace.coffeeshopapp.domain.Location;
import com.coffeeplace.coffeeshopapp.infrastructure.model.LocationDTO;
import com.coffeeplace.coffeeshopapp.service.LocationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping("/add")
    public LocationDTO addLocation(@RequestBody LocationDTO locationDTO) {
        Location location = locationService.addLocation(locationDTO.getName(), locationDTO.getLatitude(), locationDTO.getLongitude());
        return convertToDTO(location);
    }

    @GetMapping
    public List<LocationDTO> getAllLocations() {
        return locationService.getAllLocations().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private LocationDTO convertToDTO(Location location) {
        LocationDTO locationDTO = new LocationDTO();
        locationDTO.setId(location.getId());
        locationDTO.setName(location.getName());
        locationDTO.setLatitude(location.getLatitude());
        locationDTO.setLongitude(location.getLongitude());
        return locationDTO;
    }
}
