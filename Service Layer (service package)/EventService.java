package com.coffeeplace.coffeeshopapp.service;

import com.coffeeplace.coffeeshopapp.domain.Event;

import java.util.List;

public interface EventService {
    Event createEvent(String name, String description, LocalDate date);
    List<Event> getAllEvents();
    Event getEventById(Long id);
}
