<%--
  Created by IntelliJ IDEA.
  User: jikaigg
  Date: 20-1-9
  Time: 下午9:18
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
    <script>
        //切换验证码
        function refreshCode(){
            //1.获取验证码图片对象
            var vcode = document.getElementById("vcode");

            //2.设置其src属性，加时间戳
            vcode.src = "${pageContext.request.contextPath}/checkcodeservlet?time="+new Date().getTime();
        }
    </script>
</head>
<body>
<div class="container" style="width: 400px">
    <h3 style="text-align: center">管理员登录</h3>
    <form action="${pageContext.request.contextPath}/loginservlet" method="post">
        <div class="form-group">
            <label for="user">用户名：</label>
            <input type="text" name="username" class="form-control" id="user" placeholder="请输入用户名"/>
        </div>

        <div class="form-group">
            <label for="password">密码：</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="请输入密码"/>
        </div>
        <div class="form-inline">
            <label for="vcode">验证码：</label>
            <input type="text" name="verifycode" class="form-control" id="verifycode" placeholder="请输入验证码" style="width: 120px;"/>
            <a href="javascript:refreshCode();">
                <img src="${pageContext.request.contextPath}/checkcodeservlet" title="看不清点击刷新" id="vcode"/>
            </a>
        </div>
        <hr/>
        <div class="form-group" style="text-align: center;">
            <input class="btn btn btn-primary" type="submit" value="登录">
        </div>
        <!-- 出错显示的信息框 -->
        <div class="alert alert-warning alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" >
                <span>&times;</span>
            </button>
            <strong>${login_msg}</strong>
        </div>

    </form>


</div>
</body>
</html>
