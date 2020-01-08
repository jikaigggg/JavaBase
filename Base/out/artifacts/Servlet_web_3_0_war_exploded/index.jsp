<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: yaojikai
  Date: 2019/12/31
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>

<%--
概念：
  Java Server Pages：java服务器页面
    可以理解为：一个特殊的页面，其中既可以指定定义html标签，又可以定义java代码
    用于简化书写
原理：jsp本质上就是一个Servlet
JSP的脚本：JSP定义java代码的方式
  1.<%  代码 %>：定义的java代码在service方法中。service可以定义什么，该脚本中就可以定义什么
  2.<%! 代码 %>：定义的java代码定义的是类的成员（可以定义成员变量，也可以定义成员方法）
  3.<%= 代码 %>：定义的java代码，会输出到页面上。输出语句中可以定义什么，该脚本中就可以定义什么

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%
    //    System.out.println("helloworld");
%>
<%
    // 1.获取所有的cookie
    Cookie[] cookies = request.getCookies();
    System.out.println("111");
    // 2.遍历cookie数组
    if (cookies != null) {
        // 3.获取cookie名称
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            System.out.println(222);
            // 4.判断名称是否是lastTime
            if ("lastTime".equals(name)) {
                //有该cookie，不是第一次访问
                System.out.println("333");
                // 设置cookie的value
                // 获取当前时间的字符串，重新设置cookie的值，重新发送cookie
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日--HH:mm:ss");
                String time = sdf.format(date);
                cookie.setValue(time);
                //设置cookie的存活时间
                cookie.setMaxAge(60 * 60 * 24);
                response.addCookie(cookie);
                // 相应数据
                // 获取cooklie的value
                String value = cookie.getValue();
                out.write("<h1>欢迎回来，上次访问的时间是</h1>" + value);
            }
        }
    } else {
      System.out.println("444");
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日--HH:mm:ss");
        String time = sdf.format(date);
        Cookie cookie = new Cookie("lastTime", "'" + time + "'");
        cookie.setMaxAge(60 * 60 * 24);
        response.addCookie(cookie);
        out.write("<h1>欢迎</h1>");
    }
%>

</body>
</html>
