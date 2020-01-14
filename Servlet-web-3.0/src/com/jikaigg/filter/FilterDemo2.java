package com.jikaigg.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
/*
* 拦截方式配置：资源被访问的方式
*   注解配置：
*       设置dispatcherTypes属性
*           REQUEST:    默认值。浏览器直接请求资源
*           FORWARD:    转发访问资源
*           INCLUDE:    包含访问资源
*           ERROR:      错误跳转
*           ASYNC:      异步访问资源
*
* */

// 浏览器直接请求资源
@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.FORWARD)
public class FilterDemo2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterdemo2...");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
