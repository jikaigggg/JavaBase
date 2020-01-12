package com.crayon.servlet;

import com.crayon.service.UserService;
import com.crayon.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delselectuserservlet")
public class DelSelectUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码
        request.setCharacterEncoding("utf-8");
        // 获取id参数列表
        String[] ids = request.getParameterValues("uid");
        // 调用service删除
        UserService service = new UserServiceImpl();
        service.delSelectUser(ids);
        // 跳转到查询所有Servlet
        response.sendRedirect(request.getContextPath()+"/userlistservlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
