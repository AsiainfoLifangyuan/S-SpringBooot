package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.logging.Logger;

@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {
    private Logger logger = Logger.getLogger("ThymeleafController");

    @RequestMapping("hello")
    public String hello(Map<String,Object> map) {
        map.put("msg", "Hello Thymeleaf");
        logger.info("你好！！");
        return "hello";
    }
}
