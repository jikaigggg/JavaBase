<%--
  Created by IntelliJ IDEA.
  User: jikaigg
  Date: 20-1-8
  Time: 下午7:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el1</title>
</head>
<body>
${3 > 4}
<%-- 设置jsp指令中的isELIgnored = "true"  表示忽略当前jsp中所有的el表达式
     忽略当前el表达式，加转移字符\
--%>
\${3 > 4}
<hr>
<%--
使用：
    1.运算：
        1.算术运算符：+ 、 - 、 * 、 /
        2.比较运算符：> 、 < 、 <= 、 >=  、 == 、 !=
        3.逻辑运算符:&&(and) 、 ||(or) 、 !(not)
        4.空运算符：empty判断字符串、集合、数组对象是否为null，并且长度是否为0
--%>
<h3>算数运算符</h3>
加：${3 + 4} <br>
减：${3 - 4} <br>
乘：${3 * 4} <br>
除：${3 / 4} <br>
取余：${3 % 4} <br>
<hr>
<h3>比较运算符</h3>
${3 == 4} <br>
${3 > 4} <br>
${3 < 4} <br>
${3 != 4} <br>
<hr>
<h3>逻辑运算符</h3>
${true && false} <br>
${true || false} <br>
<h3>空运算符</h3>
<%-- ${} --%>

</body>
</html>
