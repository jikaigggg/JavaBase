package com.jikaigg.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* Request功能1：
*   1.获取请求消息数据
*       1.获取请求行数据
*           GET /demo/demo1?name=yaojikai HTTP/1.1
*           方法：
*               1.获取请求方式：GET
*                   String getMethod()
*          (重要)2.获取虚拟目录:/demo
*                   String  getCotextPath()
*               3.获取Servlet路径:/demo1
*                   String getServletPath()
*               4.获取get方式的请求参数:name=yaojikai
*                   String getQueryString()
*          (重要)5.获取请求的URI：/demo/demo1
*                   String getRequestURI()    //获取到"/demo/demo1"
*                   StringBuffer getRequestURL()    //获取到"http://localhost/demo/demo1"
*               6.获取协议及版本： HTTP:1.1
*                   String getProtocol()
*               7.获取客户机的IP地址：
*                   String getRemoteAddr()
* */
@WebServlet("/request1")
public class ServletDemo5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取请求方式：GET
        String method = request.getMethod();
        System.out.println("请求方式为："+method);

        // (重要)2.获取虚拟目录:/demo
        String contextPath = request.getContextPath();
        System.out.println("虚拟目录为："+contextPath);

        // 3.获取Servlet路径:/demo1
        String servletPath = request.getServletPath();
        System.out.println("Servlet路径为："+servletPath);

        // 4.获取get方式的请求参数:name=yaojikai
        String queryString = request.getQueryString();
        System.out.println("get方式的请求参数为："+queryString);

        // (重要)5.获取请求的URI：/demo/demo1
        String requestURI = request.getRequestURI();
        System.out.println("URI为："+requestURI);
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("URL为："+requestURL);

        // 6.获取协议及版本： HTTP:1.1
        String protocol = request.getProtocol();
        System.out.println("协议及版本为："+protocol);

        // 7.获取客户机的IP地址：
        String remoteAddr = request.getRemoteAddr();
        System.out.println("客户机IP地址为："+remoteAddr);
    }
}
