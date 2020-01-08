<%@ page import="com.jikaigg.servlet.domain.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: jikaigg
  Date: 20-1-8
  Time: 下午8:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el2</title>
</head>
<body>
<%--
获取值：
    1.el表达式只能从域对象中获取值
    2.语法：
        ${域名称.键名}：从指定域中获取制定键的值
        域名称：
            1.pageScope         --> pageContext
            2.requestScope      --> request
            3.sessionScope      --> session
            4.applicationScope  --> application(ServletContext)

        ${键名}：表示依次从最小的域中查找是否有该键对应的值，直到找到为止
--%>
<%-- 获取request中的name --%>
<%
request.setAttribute("name","yaojikai");
session.setAttribute("age","18");
%>
${requestScope.name}
${sessionScope.age}
${sessionScope.id}
<%
    User user = new User();
    user.setId(1);
    user.setName("yaojikai");
    user.setBirthday(new Date());
    request.setAttribute("u",user);
    List l  = new ArrayList();
    l.add(111);
    l.add(1121);
    l.add(11321);
    request.setAttribute("l",l);
    Map m = new HashMap();
    m.put("yao","jikai");
    m.put("yao1","jikai1");
    m.put("yao2","jikai2");
    request.setAttribute("m",m);
%>
<%--
获取对象中的值
需要将对象的get方法的名字除去get，然后字母变小写
比如getName() --> Name --> name --> ${requestScope.u.name}
--%>
${requestScope.u.name}
${requestScope.u.birthday.month}
<hr>
<%--
获取List集合中的值
${list[x]}
--%>
${requestScope.l} <br>
${requestScope.l[1]}
<hr>
<%--
获取map集合中的值
${域名称.键名.key名称}
${域名称.键名["key名称"]}
--%>
${requestScope.m.yao} <br>
${m["yao2"]}
<hr>
<%--
空运算符
${empty List}  //判断List是否为空
${not empty List}  //判断List是否不为空
--%>
${empty l}
</body>
</html>
