package com.spring.boot.servlet;

import org.springframework.core.annotation.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello/*")
public class SpringBootServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("请求的方法为get");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("请求方法为post");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("servlet被销毁");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("servlet初始化方法完成");
    }
}
