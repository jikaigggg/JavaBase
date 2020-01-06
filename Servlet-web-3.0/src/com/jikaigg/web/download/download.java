package com.jikaigg.web.download;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/*
* 文件下载需求：
*   页面显示超链接
*   点击超链接后弹出下载提示框
*   完成图片文件下载
*
* 分析：
*   超链接指向的资源如果能够被浏览器解析，则在浏览器中展示，如果不能解析，则弹出下载提示框。不满足需求
*   任何资源都必须弹出下载提示框
*   要使用响应头设置资源的打开方式
*       1.content-dispositon:attachghment;filename=xxx
*
* 步骤：
*   1.定义页面，编辑超链接href属性，指向servlet，传递资源名称filename
*   2.定义Servlet
*       1.获取文件名称
*       2.使用字节流加载文件进内存
*       3.指定response响应头：content-dispositon:sttachment;filename=xxx
*       4.将数据写出到response输出流
* */
@WebServlet("/downloadServlet")
public class download extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.获取文件名称
        String filename = req.getParameter("filename");
        // 2.使用字节流加载文件进内存
        // 2.1找到文件服务器路径
        ServletContext context = this.getServletContext();
        String path = context.getRealPath("/img/"+filename);
        // 2.2用字节流关联
        FileInputStream fis = new FileInputStream(path);
        // 设置response响应头
        // 3.1设置响应头类型：content-type
        String mimeType = context.getMimeType(filename);
        resp.setHeader("content-type",mimeType);
        // 3.2设置响应头打开方式content-disposition
        resp.setHeader("content-disposition","sttachment;filename="+filename);

        // 将输入流；就的数据写出到输出流中
        ServletOutputStream out = resp.getOutputStream();
        byte[] buff = new byte[1024 * 8];
        int len = 0;
        while ((len = fis.read(buff))!=-1){
            out.write(buff,0,len);
        }
        fis.close();
        // 3.指定response响应头：content-dispositon:sttachment;filename?xxx
        // 4.将数据写出到response输出流
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
