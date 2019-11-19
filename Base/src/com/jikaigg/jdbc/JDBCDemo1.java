package com.jikaigg.jdbc;


import java.sql.*;

public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        注意：
            jar包要用mysql-connection-java-8.*；用老版本的会连接失败并报错
            Class.forName里的String要用com.mysql.cj.jdbc.Driver;之前老版本的是用com.mysql.jdbc.Driver;
        */
        // 1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2.获取数据库连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jikaigg?urlSSL=false", "root", "123456");
        Statement stmt = conn.createStatement();
//        System.out.println(stmt);
        ResultSet rs = stmt.executeQuery("select * from test;");
        System.out.println(rs);
        while (rs.next()){
            System.out.println(rs.getInt("Id")+rs.getString("Name")+rs.getInt("Age"));
        }
        stmt.close();
        conn.close();
    }
}
