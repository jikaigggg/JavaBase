<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: jikaigg
  Date: 20-1-8
  Time: 下午10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl1</title>
</head>
<body>
<%--
if
    <c:if test=""></c:if>
    test为必须的属性，接受boolean表达式，如果表达式为true则显示if标签体内容，如果为false则不显示标签体内容
    一般情况下，test属性值会结合el表达式使用
    c:if标签没有else情况，如果需要else则在写一个else
--%>
<c:if test="true"> test为true </c:if>
<hr>
<%

    //判断一个request中的List集合是否为空，如果不为空则遍历
    List ll = new ArrayList<>();
    ll.add("yaojikai");
    ll.add("yaojikai2");
    ll.add("yaojikai3");
    request.setAttribute("ll",ll);
    request.setAttribute("number",9);
%>
<c:if test="${not empty ll}">遍历集合</c:if>
<c:if test="${number % 2 == 0}">${number}为偶数</c:if>
<hr>

<%


%>
<%--
choose
    when
    otherwise
--%>
<c:choose>
    <c:when test="${number == 1}">星期一</c:when>
    <c:when test="${number == 2}">星期二</c:when>
    <c:when test="${number == 3}">星期三</c:when>
    <c:when test="${number == 4}">星期四</c:when>
    <c:when test="${number == 5}">星期五</c:when>
    <c:when test="${number == 6}">星期六</c:when>
    <c:when test="${number == 7}">星期日</c:when>
    <c:otherwise>不对</c:otherwise>
</c:choose>
<hr>
<%--
foreach:相当于java的for循环
    完成重复的操作
        属性：begin开始值，end结束值，var临时变量，step步长,varStatus循环状态对象（index容器中元素的索引从0开始 count循环次数从1开始）
    遍历容器
        属性：items容器对象，var容器中元素的临时变量，varStatus循环状态对象（index容器中元素的索引从0开始 count循环次数从1开始）
--%>
<c:forEach begin="1" end="10" var="i" step="1">${i}<br></c:forEach>
<hr>
<c:forEach items="${ll}" var="l" varStatus="s">${s.index} ${s.count} ${l}<br></c:forEach>
</body>
</html>
