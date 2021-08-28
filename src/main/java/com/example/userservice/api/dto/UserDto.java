package com.example.userservice.api.dto;

import com.example.userservice.api.vo.ResponseOrder;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class UserDto {

    private String email;
    private String name;
    private String pwd;
    private String userId;
    private LocalDate createdAt;

    private String encryptedPwd;

    private List<ResponseOrder> orders;
}
