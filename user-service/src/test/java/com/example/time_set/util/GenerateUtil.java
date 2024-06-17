package com.example.time_set.util;

import com.example.time_set.dto.CreateUserDto;
import com.example.time_set.dto.UserDto;
import com.example.time_set.model.User;

import static com.example.time_set.util.ConstantsUtil.*;

public class GenerateUtil {

    public static UserDto generateUserDto() {
        return new UserDto(
                USER_ID,
                USER_NAME,
                USER_PASSWORD
        );
    }

    public static User generateUser() {
        return new User(
                USER_ID,
                USER_NAME,
                USER_PASSWORD
        );
    }

    public static CreateUserDto generateCreateUserDto() {
        return new CreateUserDto(
                USER_NAME,
                USER_PASSWORD
        );
    }
}
