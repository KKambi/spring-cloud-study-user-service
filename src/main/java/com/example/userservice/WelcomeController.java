package com.example.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-service")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(@RequestHeader("user-request") String header) {
        return "welcome-user-service (header: " + header + ")";
    }
}
