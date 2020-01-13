<%--
  Created by IntelliJ IDEA.
  User: jikaigg
  Date: 20-1-9
  Time: 下午8:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <%-- 指定字符集 --%>
    <meta charset="utf-8">
    <%-- 使用Edge最新的浏览器的渲染方式 --%>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <%-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同
    默认宽度与设备的宽度相同
    initial-scale：初始化的缩放比为1:1--%>
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <%-- 上述3个meta标签*必须*挡在最前面，任何其他内容都必须跟随其后 --%>

    <title>管理员登录</title>
    <%-- 1.导入CSS的全局样式 --%>
    <link rel="stylesheet" href="css/bootstrap.min.css" rel="stylesheet">
    <%-- 2.jQuery导入，建议使用1.9以上的版本 --%>
    <script src="js/jquery-3.4.1.min.js"></script>
    <%-- 3.导入bootstrap的js文件 --%>
    <script src="js/bootstrap.min.js"></script>
  </head>
  <body>
  <div>${user.name},欢迎您！</div>
  <div align="center">
    <a href="${pageContext.request.contextPath}/finduserbypageservlet" style="text-decoration:none;font-size:33px">查询所有用户信息</a>
  </div>
  </body>
</html>
