<%@ page import="java.util.ArrayList" %>
<%@ page import="com.jikaigg.servlet.domain.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: yaojikai
  Date: 2020/1/9
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl2</title>
</head>
<body>
<%--
在request域中存有User对象的List集合。使用jstl+el将List集合数据展示到jsp页面表格中
--%>
<%
List list = new ArrayList<User>();
list.add(new User(1,"yaojikai1",new Date()));
list.add(new User(2,"yaojikai2",new Date()));
list.add(new User(3,"yaojikai3",new Date()));

request.setAttribute("list",list);
%>

<table border="1px">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>出生日期</td>
    </tr>
    <c:forEach items="${list}" var="user" varStatus="s">
        <c:if test="${s.count % 2 == 0}">
            <tr bgcolor="#ffe4c4">
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.birthday}</td>
            </tr>
        </c:if>
        <c:if test="${s.count % 2 == 1}">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.birthday}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>
</body>
</html>
