package com.jikaigg.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
/*
* 拦截路径：
*   1.具体资源路径：/index.jsp 只有访问index.jsp资源时，过滤器才会被执行
*   2.目录拦截：  /web3/*  访问/web3下的所有资源时，过滤器会被执行
*   3.后缀名拦截： *.jsp  访问所有后缀名为jsp资源时，过滤器会被执行
*   4.拦截所有资源：  /*  访问所有资源时，过滤器会被执行
 */

@WebFilter("/*")  //访问所有资源之前都会执行该过滤器
public class FilterDemo1 implements Filter {
    /*
     * 在服务器启动后，会创建filter对象，然后调用init方法，只执行一次
     * 一般用于加载资源
     * */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 初始化
        System.out.println("init...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // 对request对象的请求消息做增强
        System.out.println("filterdemo1被执行了");

        //放行
        filterChain.doFilter(servletRequest, servletResponse);
        servletRequest.getRequestDispatcher("/index.jsp").forward(servletRequest, servletResponse);

        // 对response对象的响应消息做增强
        System.out.println("filterdemoe1回来了");
    }
    /*
    * 在服务器关闭后，filter对象被销毁，如果服务器正常关闭，调用destory方法，只执行一次。
    * 一般用来释放资源
    * */
    @Override
    public void destroy() {
        System.out.println("destery...");
    }
}
