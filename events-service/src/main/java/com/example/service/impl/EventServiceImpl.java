package com.example.service.impl;

import com.example.converter.EventConverter;
import com.example.dto.EventDto;
import com.example.repository.EventRepository;
import com.example.service.EventService;
import com.example.util.exception.DataNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private final EventConverter eventConverter;

    @Override
    public EventDto findEventById(Long id) {
        return eventConverter.eventToEventDto(eventRepository.findById(id).orElseThrow(DataNotFoundException::new));
    }
}
