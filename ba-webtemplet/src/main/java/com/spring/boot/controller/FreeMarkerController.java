package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/freeMarker")
public class FreeMarkerController {
    @RequestMapping("/hello")
    public String helloWorld(Map<String,Object> map){
        map.put("msn","hello FreeMarker");
        return "index";
    }

}
