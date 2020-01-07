package com.jikaigg.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
 *   2.请求转发：一种在服务器内部的资源跳转方式
 *       步骤：
 *           1.通过request对象获取请求转发器对象：RequestDispatcher getRequestDispatcher(String path)
 *           2.使用RequestDispatcher对象来进行转发：forward(ServletRequest request,ServletResponse response)
 *       特点：
 *           1.浏览器地址栏路径不发生变化
 *           2.只能转发到当前服务器内部资源中
 *           3.转发是一次请求
 *   3.共享数据
 *       域对象：一个有作用范围的对象，可以在范围内共享数据
 *       request域：代表一次请求的范围，一般用于请求转发的多个资源中共享数据
 *       方法：
 *           void setAttribute(String name, Object obj)：存储数据
 *           Object getAttribute(String name)：通过键获取值
 *           void removeAttribute(String name)：通过键移除键值对
 * */
@WebServlet("/request5")
public class ServletDemo9 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("request5被访问了");
        // 存储数据到request域中
        request.setAttribute("hello","world");
        // 转发到requset6资源
        request.getRequestDispatcher("/request6").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
