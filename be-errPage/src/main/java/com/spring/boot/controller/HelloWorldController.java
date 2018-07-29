package com.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String helloWorld(){
        return "Hello World";
    }

    @RequestMapping("/error")
    public String error(){
        int i = 1/0;
        return "error";
    }

}
