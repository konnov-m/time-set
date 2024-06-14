package com.example.time_set.service.impl;

import com.example.time_set.model.User;
import com.example.time_set.repository.UserRepository;
import com.example.time_set.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;

import static com.example.time_set.util.Message.USER_NOT_FOUND;

@Slf4j
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Override
    public User getUser(long id) {
        log.info("Try to get user with id = {}", id);
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(USER_NOT_FOUND + id));
    }
}
