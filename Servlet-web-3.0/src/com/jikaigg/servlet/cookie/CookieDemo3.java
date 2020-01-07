package com.jikaigg.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
概念：
    将数据保存在客户端会话技术

默认情况下，浏览器关闭，cookie数据被销毁

设置cookie的声明周期，持久化存储 setMaxAge(int seconds)
    正数：持久化将cookie数据写到硬盘的文件中，cookie的存活时间（seconds秒之后，cookie文件会被自动删除）
    负数：默认值
    0：删除cookie信息
*/
@WebServlet("/CookieDemo3")
public class CookieDemo3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 创建cookie
        Cookie c1 = new Cookie("msg1","yaojikai");
        Cookie c2 = new Cookie("msg2","shimengyu");
        // 设置cookie的存活时间，将cookie持久化到硬盘30秒，30秒后自动删除cookie文件
        c1.setMaxAge(30);
        // 发送cookie对象
        response.addCookie(c1);
        response.addCookie(c2);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
