package com.jikaigg.jdbc;

import java.sql.*;

/*
步骤：
    1.导入驱动jar包
    2.注册驱动
    3.获取数据库的连接对象Connection
    4.定义sql
    5.获取执行sql语句的对象statement
    6.执行sql，接收返回结果
    7.处理结果
    8.释放资源

*/
public class JDBCDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 在mysql5之后可以不注册驱动
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myemployees", "root", "123456");
        //System.out.println(conn);
        String sql = "select * from employees where employee_id";
        Statement stat = conn.createStatement();
        ResultSet res = stat.executeQuery(sql);
        System.out.println(res);

        stat.close();
        conn.close();
    }

}
