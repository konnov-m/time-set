package com.example.time_set.service;


import com.example.time_set.converter.UserDtoConverter;
import com.example.time_set.dto.CreateUserDto;
import com.example.time_set.dto.UserDto;
import com.example.time_set.model.User;
import com.example.time_set.repository.UserRepository;
import com.example.time_set.service.impl.UserServiceImpl;
import com.example.time_set.util.exception.DataNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static com.example.time_set.util.GenerateUtil.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {
    @InjectMocks
    UserServiceImpl userService;

    @Mock
    UserRepository userRepository;

    @Mock
    UserDtoConverter userConverter;

    @Test
    void testGetUserThrowDataNotFoundException() {
        User user = generateUser();


        when(userRepository.findById(user.getId())).thenReturn(Optional.empty());


        assertThrows(DataNotFoundException.class, () -> userService.getUser(user.getId()));
    }

    @Test
    void testGetUserReturnUserDto() {
        User user = generateUser();
        UserDto userDto = generateUserDto();


        when(userRepository.findById(user.getId())).thenReturn(Optional.of(user));
        when(userConverter.userToUserDto(user)).thenReturn(userDto);


        assertEquals(userDto, userService.getUser(user.getId()));
    }

    @Test
    void testSaveUser() {
        User user = generateUser();
        CreateUserDto userDto = generateCreateUserDto();


        when(userRepository.saveAndFlush(user)).thenReturn(user);
        when(userConverter.createUserDtoToUser(userDto)).thenReturn(user);


        userService.saveUser(userDto);

        verify(userRepository, times(1)).saveAndFlush(user);
        verify(userConverter, times(1)).createUserDtoToUser(userDto);

    }

}
