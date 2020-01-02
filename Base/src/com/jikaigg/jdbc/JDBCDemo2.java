package com.jikaigg.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        final String driver;
        final String url;
        final String username;
        final String password;
        Properties p = new Properties();
        p.load(new FileInputStream("D:\\githuby\\JavaBase\\Base\\src\\com\\jikaigg\\jdbc\\druid.properties"));
        driver = p.getProperty("driverClassName");
        url = p.getProperty("url");
        username = p.getProperty("name");
        password = p.getProperty("password");
        Class.forName(driver);
        Connection conn  = DriverManager.getConnection(url,username,password);
        System.out.println(conn);

        conn.close();

    }
}
