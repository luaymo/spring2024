package com.coffeeplace.coffeeshopapp.infrastructure.controller;

import com.coffeeplace.coffeeshopapp.domain.Event;
import com.coffeeplace.coffeeshopapp.infrastructure.model.EventDTO;
import com.coffeeplace.coffeeshopapp.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("/create")
    public EventDTO createEvent(@RequestBody EventDTO eventDTO) {
        Event event = eventService.createEvent(eventDTO.getName(), eventDTO.getDescription(), eventDTO.getDate());
        return convertToDTO(event);
    }

    @GetMapping
    public List<EventDTO> getAllEvents() {
        return eventService.getAllEvents().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private EventDTO convertToDTO(Event event) {
        EventDTO eventDTO = new EventDTO();
        eventDTO.setId(event.getId());
        eventDTO.setName(event.getName());
        eventDTO.setDescription(event.getDescription());
        eventDTO.setDate(event.getDate());
        return eventDTO;
    }
}
