package com.crayon.servlet;

import com.crayon.domain.User;
import com.crayon.service.UserService;
import com.crayon.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userlistservlet")
public class UserListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 调用userService完成查询，查询表中所有用户信息
        UserService service = new UserServiceImpl();
        List<User> users = service.findAll();
        // 将查询结果存入request域
        request.setAttribute("users",users);
        // 转发到list.jsp中
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
