package com.example.time_set.dto;


import com.example.time_set.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * Дто для {@link User}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "User dto")
public class UserDto {
    Long id;
    String userName;
    String password;
}
