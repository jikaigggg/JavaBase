package com.jikaigg.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// 注解中的urlpartten可以定义多个，是一个数组，一般定义一个
// @WebServlet({"/demo4","/dddd","/d4"})
/*
* 可以写多层路径,访问时在url后面接多层路径【@WebServlet("/demo/demo4")  ---->  http://127.0.0.1:8080/demo/demo1】
* 可以写通配符,访问时在url后面任意写【@WebServlet("/demo/*")  ---->  http://127.0.0.1:8080/demo/demo1 | http://127.0.0.1:8080/demo/hehe | http://127.0.0.1:8080/demo/haha】
* （/*的优先级比较低，如果其他servlet里定义了路径，优先访问其他的）
* "*.do" 【@WebServlet("*.do")  ---->  http://127.0.0.1:8080/demo1.do | http://127.0.0.1:8080/xxx.do】
*/
@WebServlet("*.do")
public class ServletDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo4.....");
    }
}
