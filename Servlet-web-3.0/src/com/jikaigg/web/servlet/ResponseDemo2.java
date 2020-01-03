package com.jikaigg.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* 完成重定向
* */
@WebServlet("/response1")
public class ResponseDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("response1");

        /*// 访问/response1的资源会自动跳转到/response2
        // 1.设置状态码为302
        resp.setStatus(302);
        // 设置响应头location
        resp.setHeader("location","/web3/response2");*/


        // 简单重定向方式
        resp.sendRedirect("/web3/response2");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
