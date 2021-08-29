package com.example.userservice.api.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestLogin {

    @NotNull(message = "Email cannot be null")
    @Size(min = 2)
    @Email
    private String email;

    @NotNull(message = "Pwd cannot be null")
    @Size(min = 8)
    private String password;
}
