package com.example.userservice.infra.property;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Slf4j
@Getter
@Setter
@ConfigurationProperties("greeting")
@Component
public class Greeting {

    private String message;
}
