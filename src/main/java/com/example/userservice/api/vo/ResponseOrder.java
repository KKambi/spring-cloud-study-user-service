package com.example.userservice.api.vo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ResponseOrder {

    private String productIdx;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;
    private LocalDate createdAt;

    private String orderId;
}
