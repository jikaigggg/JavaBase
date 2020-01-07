package com.jikaigg.servlet.request;
/*
 * 获取请求体数据：
 *   请求体：只有POST请求方式才有请求体，在请求体中封装了POST请求的请求参数
 *   步骤：
 *       1.获取流对象
 *           BufferReader getReader()：获取字符输入流，只能操作字符数据
 *           ServletInputStream getInputStream()：获取字节输入流，可以操作所有数据类型
 *       2.再从流对象中拿数据
 * */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/request3")
public class ServletDemo7 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求消息体--请求参数
        //1.获取字符流
        BufferedReader reader = request.getReader();
        // 2.读取数据
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
