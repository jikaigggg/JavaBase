package com.jikaigg.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
* request功能2：
*       2.获取请求头数据
*           方法：
*         (重要)String getHeader(String name):通过请求头的名称获取请求头的值
*               Enumeration<E> getHeaderNames():获取所有的请求头名称
* */
@WebServlet("/request2")
public class ServletDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求头数据（user-agent）
        String agent = request.getHeader("user-agent");
        // System.out.println(agent);
        // 判断agent浏览器版本
        if(agent.contains("Chrome")){
            System.out.println("谷歌");
        }else if(agent.contains("Firefox")){
            System.out.println("火狐");
        }

        // 防盗链
        String referer = request.getHeader("referer");
        System.out.println(referer);
        if(referer.contains("/crayon")){
            System.out.println("正确");
        }else {
            System.out.println("错误");
        }


        // 获取所有请求头数据，可以理解为返回的是一个"迭代器"
        Enumeration<String> headerNames = request.getHeaderNames();
        // 遍历
        while(headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            String value = request.getHeader(name);
            // System.out.println(name+"-----"+value);
        }
    }
}
