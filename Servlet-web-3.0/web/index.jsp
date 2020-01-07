<%--
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
    System.out.println("helloworld");
  %>

  <%!
    String Title = "lalala";

  %>
  hello
  </body>
</html>
