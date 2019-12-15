package com.jikaigg.jdbc;

import java.sql.*;

/*
1.DriverManager:驱动管理对象
    功能：
        注册驱动：告诉程序该使用哪一个数据库驱动jar包
            static void registerDriver(Driver driver):注册与给定的驱动程序 DriverManeger
            写代码使用：Class.forName("com.mysql.cj.jdbc.Driver");
            通过查看源码发现com.mysql.cj.jdbc.Driver中存在静态代码块
        获取数据库连接：
            方法：static Connection getConnection(String url,String user,String password)
            参数：
                url:指定连接的路径：语法：jdbc:mysql://ip地址(域名):端口号/数据库名称
                user:用户名
                password:密码
2.Connection:数据库了连接对象
    功能：
        获取执行sql的对象：
            statement createStatement()
            prepareStatement prepareStatement(String sql)
        管理事务：
            开启事务：setAutoCommit(boolean autoCommit)：调用该方法设置参数为false，即开启事务
            提交事务：commit()
            回滚事务：rollBack()
3.Statement:执行sql的对象
    boolean excute(String sql)：可以执行任意的sql，了解，一般不用
    int excuteUpdate(String sql)：执行DML(增删改)语句、DDL(对表和库进行操作)语句
        返回值：影响的行数，可以通过影响的行数判断DML语句是否执行成功 返回值>0则执行成功，反之则执行失败
    Result excuteQuery(String sql)：执行DQL(查)语句
4.ResultSet:结果集对象
5.PreparedStatement:执行sql的对象

*/
public class JDBCDemo4 {
    /* 添加一条记录
       修改记录
       删除记录
     */
    public static void main(String[] args) throws SQLException {
//        Method1();
        Method2();
    }

    // 处理DQL
    public static void Method2() {
        Connection con2 = null;
        Statement st2 = null;
        ResultSet res = null;
        int count = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con2 = DriverManager.getConnection("jdbc:mysql:///myemployees", "root", "123456");
            st2 = con2.createStatement();
            String sql = "SELECT * FROM myemployees.employees";
            res = st2.executeQuery(sql);
//            System.out.println();
            while (res.next()) {
                System.out.println("lastname:" + res.getString("last_name") + "    job_id:" + res.getString("job_id") + "    department_id" + "department_id");
                count++;
            }
            System.out.println(count);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (st2 != null) {
                try {
                    st2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con2 != null) {
                try {
                    con2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }


    // 处理DML、DDL
    public static void Method1() {
        Connection con = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:///jikaigg", "root", "123456");
            st = con.createStatement();
            String sql = "INSERT INTO test(name,age) VALUE('yaojikai',20)";
            int cc = st.executeUpdate(sql);
            System.out.println(cc);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
