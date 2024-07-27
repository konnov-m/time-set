package com.example.time_set.controller;

import com.example.time_set.dto.CreateUserDto;
import com.example.time_set.dto.UserDto;
import com.example.time_set.model.User;
import com.example.time_set.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Контроллер для {@link User}
 */
@RestController
@RequestMapping("${api-url}/user")
@RequiredArgsConstructor
@Tag(name = "User API")
public class UserController {

    private final UserService userService;


    @Operation(summary = "Get a user by id", description = "Returns a userDto")
    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable long id) {
        return userService.getUser(id);
    }

    @Operation(summary = "Save user", description = "Save user with CreateUserDto")
    @PostMapping
    public void createUser(@RequestBody @Valid CreateUserDto userDto) {
        userService.saveUser(userDto);
    }

}
