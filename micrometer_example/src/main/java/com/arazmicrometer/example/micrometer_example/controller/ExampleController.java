package com.arazmicrometer.example.micrometer_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("/message")
    public String getMessage() {
        return "Working...!!";
    }
}
