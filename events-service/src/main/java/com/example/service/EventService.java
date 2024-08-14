package com.example.service;


import com.example.dto.EventDto;

public interface EventService {

    /**
     * Поиск события по идентификатору
     * @param id идентификатор события
     * @return дто события
     */
    EventDto findEventById(Long id);
}
