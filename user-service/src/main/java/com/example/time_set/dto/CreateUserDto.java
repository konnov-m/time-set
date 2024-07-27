package com.example.time_set.dto;

import com.example.time_set.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * Дто для создания {@link User}
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "dto for create user")
public class CreateUserDto {
    @NotNull
    String userName;

    @NotNull
    String password;
}
