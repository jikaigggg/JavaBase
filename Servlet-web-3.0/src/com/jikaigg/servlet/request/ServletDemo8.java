package com.jikaigg.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/*
* 其他功能：
*   1.获取请求参数通用方式(不区分get、post方式)
*       1.String getParameter(String name)：根据参数名称获取参数值    username=zhangsan&password=123456
*       2.String[] getParameterValues(String name)：根据参数名称获取参数值的数组    hobby=xx&hobby=abc
*       3.Enumeration<String> getParameterNames()：获取所有请求的参数名称
*       4.Map<String,String[]> getParamterMap()：获取所有参数的map集合
*       **中文乱码问题
*           get方式：tomcat已经将get方式乱码给解决了
*           post方式：会乱码；解决：设置流的编码 request.setCharacterEncoding("utf-8");
*   2.请求转发：一种在服务器内部的资源跳转方式
*       步骤：
*           1.通过request对象获取请求转发器对象：RequestDispatcher getRequestDispatcher(String path)
*           2.使用RequestDispatcher对象来进行转发：forward(ServletRequest request,ServletResponse response)
*   3.共享数据
*       域对象：一个有作用范围的对象，可以在范围内共享数据
*       request域：代表一次请求的范围，一般用于请求转发的多个资源中共享数据
*       方法：
*           void setAttribute(String name, Object obj)：存储数据
*           Object getAttribute(String name)：通过键获取值
*           void removeAttribute(String name)：通过键移除键值对
*   4.获取ServletContext
*
* */
@WebServlet("/request4")
public class ServletDemo8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求参数
        /*String username = request.getParameter("username");
        System.out.println("post  "+username);*/
        // 获取所有请求参数
        /*String[] crayons = request.getParameterValues("crayon");
        for (String crayon : crayons) {
            System.out.println(crayon);
        }*/
        // 获取所有请求的参数名称
        /*Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            System.out.println(name);
            String value = request.getParameter(name);
            System.out.println(value);
            System.out.println("----------");
        }*/
        // 获取ServletContext
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> keyset = parameterMap.keySet();
        for (String name : keyset) {
            String[] sss = parameterMap.get(name);
            System.out.println(name);
            for (String value : sss) {
                System.out.println(value);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求参数
        String username = request.getParameter("username");
        System.out.println("get  "+username);
    }
}
