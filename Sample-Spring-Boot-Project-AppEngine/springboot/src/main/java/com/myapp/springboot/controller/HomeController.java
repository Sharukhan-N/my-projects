package com.myapp.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    @GetMapping
    public String home() {
        return "Home Page";
    }

    @RequestMapping("/welcome")
    @GetMapping
    public String welcome() {
        return "Welcome to my app";
    }

}
