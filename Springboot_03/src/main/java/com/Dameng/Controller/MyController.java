package com.Dameng.Controller;

import com.Dameng.pojo.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyController {

//Value注入属性
    @Value("${name}")
    private String name;

    @Autowired
    private Environment env;

    @Autowired
    private MyDataSource dataSource;


    @GetMapping
    public String controllerhello(){
        System.out.println("Springboot 运行中...");
        System.out.println(name);
        System.out.println(env.getProperty("user.age"));
        System.out.println("---------------");
        System.out.println(dataSource);
        return "Hello Springboot";
    }
}
