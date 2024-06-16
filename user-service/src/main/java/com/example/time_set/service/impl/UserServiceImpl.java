package com.example.time_set.service.impl;

import com.example.time_set.converter.UserDtoConverter;
import com.example.time_set.dto.UserDto;
import com.example.time_set.model.User;
import com.example.time_set.repository.UserRepository;
import com.example.time_set.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.example.time_set.util.Message.USER_NOT_FOUND;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserDtoConverter userConverter;

    @Override
    public UserDto getUser(long id) {
        log.info("Try to get user with id = {}", id);
        User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(USER_NOT_FOUND + id));
        return userConverter.userToUserDto(user);
    }
}
