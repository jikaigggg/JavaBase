package com.jikaigg.servlet.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response3")
public class ResponseDemo4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置字符编码
        //resp.setCharacterEncoding("GBK");

        // 告知浏览器，服务器发送的消息体数据的编码。建议浏览器使用该编码解码
        //resp.setHeader("content-type","text/html;charset=utf-8");

        // 简单形式，设置编码
        resp.setContentType("text/html;charset=utf-8");
        // 1.获取字符输出流
        PrintWriter pw = resp.getWriter();
        // 2.输出数据
        // pw.write("<h1>hello response</h1>");
        pw.write("<h1>你好 response</h1>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
