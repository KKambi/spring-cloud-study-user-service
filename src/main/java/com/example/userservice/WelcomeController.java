package com.example.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-service")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome-user-service";
    }
}
