package com.example.time_set.service;

import com.example.time_set.dto.CreateUserDto;
import com.example.time_set.dto.UserDto;
import com.example.time_set.model.User;


/**
 * Сервис для {@link User}
 */
public interface UserService {

    /**
     * Получить полтьзователя по id
     * @param id идентификатор пользователя
     * @return Дто пользователя
     */
    UserDto getUser(long id);

    /**
     * Сохранить пользователя
     * @param user пользователя для сохранения
     */
    void saveUser(CreateUserDto user);
}
