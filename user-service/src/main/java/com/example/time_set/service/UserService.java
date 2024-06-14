package com.example.time_set.service;

import com.example.time_set.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUser(long id);
}
