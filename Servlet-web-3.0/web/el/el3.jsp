<%--
  Created by IntelliJ IDEA.
  User: jikaigg
  Date: 20-1-8
  Time: 下午8:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el3</title>
</head>
<body>

${pageContext.request} <br>
<%--在JSP页面，动态获取虚拟目录--%>
${pageContext.request.contextPath}
</body>
</html>
