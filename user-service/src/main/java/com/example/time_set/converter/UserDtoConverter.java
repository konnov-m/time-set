package com.example.time_set.converter;

import com.example.time_set.dto.CreateUserDto;
import com.example.time_set.dto.UserDto;
import com.example.time_set.model.User;
import org.mapstruct.Mapper;

/**
 * Конвертер для {@link User}
 */
@Mapper(componentModel = "spring")
public interface UserDtoConverter {

    UserDto userToUserDto(User user);

    User createUserDtoToUser(CreateUserDto userDto);
}
