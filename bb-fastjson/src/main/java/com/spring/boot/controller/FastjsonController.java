package com.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/fastjson")
public class FastjsonController {

    @RequestMapping("/hello")
    public Map helloWorld(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("a","Hello Fastjson");
        return map;
    }

}
