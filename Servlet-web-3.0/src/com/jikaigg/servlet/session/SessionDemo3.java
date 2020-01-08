package com.jikaigg.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
/*
细节：
    1. 当客户端关闭后，服务器不关闭，两次获取session默认情况下，不是同一个。如果需要相同，则可以创建Cookie，键为JSESSIONID，设置最大存活时间，让cookie持久化保存。
            Cookie cookie = new Cookie("JSEESIONID",session.getId());
            cookie.setMaxAge(60 * 60);
            response.addCookie(cookie)
    2. 客户端不关闭，服务端关闭后，两次获取到的seesion
        不是同一个，但要确保数据不丢失
            session的钝化：
                在服务器正常关闭之前，将session对象序列化到磁盘中
            session的活化：
                在服务器启动后，将session文件转化为内存中的session对象
    3. session的失效时间（session什么时候被销毁）
        服务器关闭
        session对象调用invalidate()
        默认失效时间30分钟
session的特点
    用于存储一次会话的多次请求的数据，存在服务器端
    session可以存储任意类型任意大小的数据

session与cookie的区别
*/
@WebServlet("/sessiondemo3")
public class SessionDemo3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
