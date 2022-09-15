package com.dameng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hellocontrooer {
    @GetMapping
    public String hello(){
        System.out.println("hello,Springboot");
        return "Hello Springboot 2";
    }
}
