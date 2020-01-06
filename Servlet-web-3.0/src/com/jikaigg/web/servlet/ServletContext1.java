package com.jikaigg.web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* 概念：代表整个web应用，可以和程序的容器（服务器）来通信
* 获取：
*   通过request对象获取
*   request.getServletContext();
*   通过HttpServlet获取
*   this.getServletContext();
* 功能：
*   1.获取MIME类型：在互联网通信过程中定义的一种文件类型
*       格式：大类型/小类型  例：text/html  image/jpeg
*       获取：String getMimeType(String s)
*   2.域对象：共享数据
*   3.获取文件的真实（服务器）路径
* */

@WebServlet("/servletcontext")
public class ServletContext1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
         * 获取：
         *   通过request对象获取
         *   request.getServletContext();
         *   通过HttpServlet获取
         *   this.getServletContext();
         */
        // 第一种
        ServletContext context1 = req.getServletContext();
        ServletContext context2 = this.getServletContext();
        /*System.out.println(context1);
        System.out.println(context2);
        System.out.println(context1 == context2);*/

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
