package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String sendGreetings() {
        return "Hello, world! Here is the site deployed with Spring Boot by Elmoutaouakkil and Zorqany.";
    }
}
