package com.spring.boot.config;

import com.spring.boot.servlet.SpringBootServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ServletFilterListenerConfig {

    @Bean
    public ServletRegistrationBean reistServler(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
        registrationBean.setServlet(new SpringBootServlet());
        List<String> urlString = new ArrayList<String>();
        urlString.add("/hello/hello");
        registrationBean.setUrlMappings(urlString);
        registrationBean.setLoadOnStartup(1);
        return registrationBean;
    }
}
