<%--
  Created by IntelliJ IDEA.
  User: jikaigg
  Date: 20-1-12
  Time: 下午4:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>修改用户信息</title>
    <%-- 1.导入CSS的全局样式 --%>
    <link rel="stylesheet" href="css/bootstrap.min.css" rel="stylesheet">
    <%-- 2.jQuery导入，建议使用1.9以上的版本 --%>
    <script src="js/jquery-3.4.1.min.js"></script>
    <%-- 3.导入bootstrap的js文件 --%>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container" style="width: 400px;">
    <h3 style="text-align: center;">修改联系人</h3>
    <form action="${pageContext.request.contextPath}/updateuserservlet" method="post">
        <!--  隐藏域 提交id-->
        <input type="hidden" name="id" value="${user.id}">

        <div class="form-group">
            <label for="name">姓名：</label>
            <input type="text" class="form-control" id="name" name="name"  value="${user.name}" readonly="readonly" placeholder="请输入姓名" />
        </div>

        <div class="form-group">
            <label>性别：</label>
            <c:if test="${user.gender == '男'}">
                <input type="radio" name="gender" value="男" checked />男
                <input type="radio" name="gender" value="女"  />女
            </c:if>

            <c:if test="${user.gender == '女'}">
                <input type="radio" name="gender" value="男"  />男
                <input type="radio" name="gender" value="女" checked  />女
            </c:if>


        </div>

        <div class="form-group">
            <label for="age">年龄：</label>
            <input type="text" class="form-control" value="${user.age}" id="age"  name="age" placeholder="请输入年龄" />
        </div>

        <div class="form-group">
            <label for="address">籍贯：</label>
            <select name="address" id="address" class="form-control" >
                <c:if test="${user.address == '陕西'}">
                    <option value="陕西" selected>陕西</option>
                    <option value="北京">北京</option>
                    <option value="上海">上海</option>
                </c:if>

                <c:if test="${user.address == '北京'}">
                    <option value="陕西" >陕西</option>
                    <option value="北京" selected>北京</option>
                    <option value="上海">上海</option>
                </c:if>

                <c:if test="${user.address == '上海'}">
                    <option value="陕西" >陕西</option>
                    <option value="北京">北京</option>
                    <option value="上海" selected>上海</option>
                </c:if>
            </select>
        </div>

        <div class="form-group">
            <label for="qq">QQ：</label>
            <input type="text" id="qq" class="form-control" value="${user.qq}" name="qq" placeholder="请输入QQ号码"/>
        </div>

        <div class="form-group">
            <label for="email">Email：</label>
            <input type="text" id="email" class="form-control" value="${user.email}" name="email" placeholder="请输入邮箱地址"/>
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <input class="btn btn-default" type="reset" value="重置" />
            <input class="btn btn-default" type="button" value="返回"/>
        </div>
    </form>
</div>
</body>
</html>
