package com.jikaigg.web.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

@WebServlet("/checkcode")
public class CheckCodeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建一个对象，在内存中（代表一个图片）
        int weith = 100;
        int hight = 50;
        BufferedImage bi = new BufferedImage(weith,hight,BufferedImage.TYPE_INT_RGB);

        // 美化图片

        // 将图片输出到页面展示
        ImageIO.write(bi,"jpg",resp.getOutputStream());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
