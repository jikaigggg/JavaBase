package com.jikaigg.servlet.servletcontent;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
*   2.域对象：共享数据
*       1.setAttribute(String name,Object value)
*       2.getAttribute(String name)
*       3.removeAttribute(String name)
*       ServletContext对象范围：所有用户所有请求数据
* */

@WebServlet("/servletcontext2")
public class ServletContext2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        // 设置数据
        servletContext.setAttribute("msg","haha");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
