package com.jikaigg.web.servlet;
/*
* response对象：
*   功能：设置相应消息
*       1.设置响应行
*           1.格式：HTTP/1.1 200 ok
*           2.设置状态码：setStatus(int sc)
*       2.设置响应头:setHeader(String name,String value)
*       3.设置响应体：
*           使用步骤：
*               1.获取输出流
*                   字符输出流：PrintWriter getWriter()
*                   字节输出流：ServletOutputStream getOutputStream()
*               2.使用输出流，将数据输出到客户端浏览器
* */
public class ResponseDemo1 {
}
