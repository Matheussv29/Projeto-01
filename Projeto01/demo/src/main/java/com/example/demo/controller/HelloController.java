package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController public class HelloController  {
    @GetMapping("/test")
    public String helloWorld() {
        return "Hello, World! Matheus Santos Vieira RA 1210911";
    }
}