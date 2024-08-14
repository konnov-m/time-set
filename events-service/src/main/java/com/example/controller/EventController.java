package com.example.controller;

import com.example.dto.EventDto;
import com.example.entity.Event;
import com.example.service.EventService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер для {@link Event}
 */
@RestController
@RequestMapping("${api-url}/event")
@RequiredArgsConstructor
@Tag(name = "Event API")
public class EventController {

    private final EventService eventService;

    @GetMapping("{id}")
    public EventDto getById(@PathVariable Long id) {
        return eventService.findEventById(id);
    }
}
