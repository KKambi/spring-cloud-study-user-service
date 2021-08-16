package com.example.userservice.api.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class ResponseUser {

    private String email;
    private String name;
    private String pwd;
}
