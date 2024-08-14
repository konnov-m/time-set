package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class EventDto {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
}
