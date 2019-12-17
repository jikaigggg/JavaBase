package com.jikaigg.jdbc.test;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUt {
    private static String url;
    private static String user;
    private static String pwd;
    private static String driver;

    static{
        try {
            Properties p = new Properties();
            p.load(new FileReader(JDBCUt.class.getClassLoader().getResource("jdbc.properties").getPath()));
            url = p.getProperty("url");
            user = p.getProperty("user");
            pwd = p.getProperty("password");
            driver = p.getProperty("driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static Connection getCon() throws SQLException {
        return DriverManager.getConnection(url,user,pwd);
    }

    public static void close(Statement ss,Connection cc){
        if(ss != null){
            try {
                ss.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(cc != null){
            try {
                cc.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(ResultSet rr,Statement ss, Connection cc){
        if(rr != null){
            try {
                rr.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(ss != null){
            try {
                ss.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(cc != null){
            try {
                cc.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
