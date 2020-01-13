<%--
  Created by IntelliJ IDEA.
  User: jikaigg
  Date: 20-1-9
  Time: 下午8:37
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

    <title>用户信息管理系统</title>
    <%-- 1.导入CSS的全局样式 --%>
    <link rel="stylesheet" href="css/bootstrap.min.css" rel="stylesheet">
    <%-- 2.jQuery导入，建议使用1.9以上的版本 --%>
    <script src="js/jquery-3.4.1.min.js"></script>
    <%-- 3.导入bootstrap的js文件 --%>
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
    <script>
        function deleteUser(id) {
            // 用户安全提示
            if (confirm("你确定要删除吗？")) {
                // 访问路径
                location.href = "${pageContext.request.contextPath}/deluserservlet?id=" + id;
            }
        }

        window.onload = function () {
            //给删除选中按钮添加单机事件
            document.getElementById("delSelect").onclick = function () {
                if (confirm("您确定要删除吗？")) {
                    var flag = false;
                    // 判断是否有选中条目
                    var cbs = document.getElementsByName("uid");
                    for (var i = 0; i < cbs.length; i++) {
                        if (cbs[i].checked) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag = true) {
                        //表单提交
                        document.getElementById("form").submit();
                    }
                }
            };

            // 获取第一个复选框
            document.getElementById("firstcb").onclick = function () {
                var cbs = document.getElementsByName("uid");
                for (var i = 0; i < cbs.length; i++) {
                    // 设置这些cbs[i] 的checjed状态= firstcb.checked
                    cbs[i].checked = this.checked;
                }
            }
        }

    </script>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">用户信息列表</h3>
    <div style="float: left;">
        <form class="form-inline" action="${pageContext.request.contextPath}/finduserbypageservlet" method="post">
            <div class="form-group">
                <label for="exampleInputName2">姓名</label>
                <input type="text" name="name" value="${condition.name[0]}" class="form-control" id="exampleInputName2">
            </div>
            <div class="form-group">
                <label for="exampleInputName12">籍贯</label>
                <input type="text" name="address" value="${condition.address[0]}" class="form-control" id="exampleInputName12">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail2">邮箱</label>
                <input type="email" name="email" value="${condition.email[0]}" class="form-control" id="exampleInputEmail2">
            </div>
            <button type="submit" class="btn btn-default">查询</button>
        </form>
    </div>

    <div style="float: right;margin: 5px">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/add.jsp">添加联系人</a>
        <a class="btn btn-primary" href="javascript:void(0);" id="delSelect">删除选中</a>
    </div>
    <form id="form" action="${pageContext.request.contextPath}/delselectuserservlet" method="post">
        <table border="1" class="table table-bordered table-hover">
            <tr class="success">
                <th><input type="checkbox" id="firstcb"></th>
                <th>编号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年龄</th>
                <th>籍贯</th>
                <th>QQ</th>
                <th>邮箱</th>
                <th>操作</th>
            </tr>

            <c:forEach items="${pb.list}" var="user" varStatus="s">
                <tr>
                    <td><input type="checkbox" name="uid" value="${user.id}"></td>
                    <td>${s.count}</td>
                    <td>${user.name}</td>
                    <td>${user.gender}</td>
                    <td>${user.age}</td>
                    <td>${user.address}</td>
                    <td>${user.qq}</td>
                    <td>${user.email}</td>
                    <td><a class="btn btn-default btn-sm"
                           href="${pageContext.request.contextPath}/finduserservlet?id=${user.id}">修改</a>&nbsp
                        <a class="btn btn-default btn-sm" href="javascript:deleteUser(${user.id});">删除</a></td>
                </tr>
            </c:forEach>

        </table>
    </form>
    <div>
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <c:if test="${pb.currentPage == 1}">
                <li class="disabled">
                    </c:if>
                    <c:if test="${pb.currentPage != 1}">
                <li>
                    </c:if>
                    <a href="${pageContext.request.contextPath}/finduserbypageservlet?currentPage=${pb.currentPage - 1}&rows=${pb.rows}&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <c:forEach begin="1" end="${pb.totalPage}" var="i">
                    <c:if test="${pb.currentPage == i}">
                        <li class="active"><a
                                href="${pageContext.request.contextPath}/finduserbypageservlet?currentPage=${i}&rows=${pb.rows}&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}">${i}</a>
                        </li>
                    </c:if>
                    <c:if test="${pb.currentPage != i}">
                        <li>
                            <a href="${pageContext.request.contextPath}/finduserbypageservlet?currentPage=${i}&rows=${pb.rows}&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}">${i}</a>
                        </li>
                    </c:if>
                </c:forEach>

                <c:if test="${pb.currentPage == pb.totalPage}">
                <li class="disabled">
                    </c:if>
                    <c:if test="${pb.currentPage != pb.totalPage}">
                <li>
                    </c:if>
                    <a href="${pageContext.request.contextPath}/finduserbypageservlet?currentPage=${pb.currentPage + 1}&rows=${pb.rows}&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
                <span style="font-size: 25px;margin-left: 5px">共${pb.totalCount}条记录，共${pb.totalPage}页</span>
            </ul>
        </nav>
    </div>

</div>
</body>
</html>
