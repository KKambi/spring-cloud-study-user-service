package com.example.userservice.service;

import com.example.userservice.api.dto.UserDto;
import com.example.userservice.domain.user.User;

public interface UserService {

    void createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<User> getUserByAll();
}
