package com.jikaigg.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
概念：
    将数据保存在客户端会话技术

默认情况下，cookie不能共享
setPath(String path)  设置cookie的共享范围，默认情况下，为当前的虚拟目录
*/
@WebServlet("/CookieDemo5")
public class CookieDemo5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置相应的消息体的数据格式以及编码
        response.setContentType("text/html;charset=utf-8");
        // 1.获取所有的cookie
        Cookie[] cookies = request.getCookies();
        // 2.遍历cookie数组
        if(cookies != null){
            // 3.获取cookie名称
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                // 4.判断名称是否是lastTime
                if ("lastTime".equals(name)){
                    //有该cookie，不是第一次访问

                    // 设置cookie的value
                    // 获取当前时间的字符串，重新设置cookie的值，重新发送cookie
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日--HH:mm:ss");
                    String time = sdf.format(date);
                    cookie.setValue(time);
                    //设置cookie的存活时间
                    cookie.setMaxAge(60*60*24);
                    response.addCookie(cookie);
                    // 相应数据
                    // 获取cooklie的value
                    String value = cookie.getValue();
                    response.getWriter().write("<h1>欢迎回来，上次访问的时间是</h1>"+value);
                }
            }
        }else {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日--HH:mm:ss");
            String time = sdf.format(date);
            Cookie cookie = new Cookie("lastTime","'"+time+"'");
            cookie.setMaxAge(60*60*24);
            response.addCookie(cookie);
            response.getWriter().write("<h1>欢迎</h1>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
