package com.jikaigg.servlet;

import com.jikaigg.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/successServlet")
public class successServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取request域中共享的数据
        User user = (User) request.getAttribute("user");
        if (user != null) {
            // 给页面谢一句话
            // 设置编码
            response.setContentType("text/html;charset=utf-8");
            // 输出
            response.getWriter().write("登陆成功！"+user.getUsername()+"欢迎您！");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
