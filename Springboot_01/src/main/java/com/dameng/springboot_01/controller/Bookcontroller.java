package com.dameng.springboot_01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class Bookcontroller {
    @GetMapping
    public String book(){
        System.out.println("springboot is running..");
        return "Hello Spring Boot ";
    }
}
