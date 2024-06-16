package com.example.time_set.controller;

import com.example.time_set.dto.UserDto;
import com.example.time_set.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user-service/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;



    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable long id) {
        return userService.getUser(id);
    }

}
