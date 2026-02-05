package com.vlzov.social.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    
    @GetMapping
    public String greet(@RequestParam("name") String name) {
        return "Hello, " + name;
    }

    @GetMapping("/full")
    public String fullGreeting(@RequestParam("name") String name,
                                    @RequestParam("surname") String surname) {
        return "Hello, " + name + " " + surname;
    }

    @GetMapping("/{name}")
    public String greetWithPathVariable(@PathVariable("name") String name) {
        return "Hello, " + name;
    }

}
