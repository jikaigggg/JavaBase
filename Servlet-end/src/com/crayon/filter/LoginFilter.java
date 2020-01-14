package com.crayon.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
/*
* 登录验证的过滤器
* */
@WebFilter("/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 强制转换
        HttpServletRequest request = (HttpServletRequest) req;
        // 1.获取资源请求路径
        String uri = request.getRequestURI();
        // 判断是否包含登录相关资源路径,要排除掉css/js/图片/验证码等资源
        if (uri.contains("/login.jsp") || uri.contains("/loginservlet") || uri.contains("/css/") || uri.contains("/js/") || uri.contains("/fonts")|| uri.contains("checkcodeservlet")){
            // 包含，用户就是想登陆，放行
            chain.doFilter(req, resp);
        }else {
            //不包含，需要验证用户登录
            // 3.从获取session中获取user
            Object user = request.getSession().getAttribute("user");
            if (user != null){
                // 已经登录，放行
                chain.doFilter(req, resp);
            }else {
                //没有登录，跳转到登录页面
                request.setAttribute("login_msg","没登录呢，请登录");
                request.getRequestDispatcher("/login.jsp").forward(request,resp);
            }
        }


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
