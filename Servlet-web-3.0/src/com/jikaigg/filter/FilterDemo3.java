package com.jikaigg.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
/*
* 过滤器链（配置多个过滤器）
* 执行顺序：如果有两个过滤器：过滤器1和过滤器2
*   1.过滤器1
*   2.过滤器2
*   3.资源执行
*   4.过滤器2
*   5.过滤器1
* 过滤器先后顺序
*   1.注解配置：按照类名的字符串比较规则比较，值小的限制性
*       如：AFilter和BFilter，AFilter先执行
*   2.web.xml配置，谁配置在上面，谁先执行
*
* */
@WebFilter(filterName = "FilterDemo3")
public class FilterDemo3 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
