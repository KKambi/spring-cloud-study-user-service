package com.example.userservice.service;

import com.example.userservice.api.dto.UserDto;
import com.example.userservice.domain.user.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    void createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<User> getUserByAll();
}
