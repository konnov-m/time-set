package com.example.converter;

import com.example.dto.EventDto;
import com.example.entity.Event;
import org.mapstruct.Mapper;

/**
 * Конвертер для @{@link Event}
 */
@Mapper(componentModel = "spring")
public interface EventConverter {

    EventDto eventToEventDto(Event event);
}
