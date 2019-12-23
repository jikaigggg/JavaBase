package com.jikaigg.jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCDemo8 {
    public static void main(String[] args){
        String confile = "druid.properties";//配置文件名称
        Properties pp = new Properties();
        InputStream inputStream = null;
        JDBCDemo8 druidTest = new JDBCDemo8();
        confile = druidTest.getClass().getResource("/").getPath()+ confile;//获取配置文件路径
        System.out.println(confile);

        File file = new File(confile);
        try {
            inputStream = new BufferedInputStream(new FileInputStream(file));
            pp.load(inputStream);//加载配置文件

            System.out.println(pp);
            System.out.println("url:" + pp.getProperty("url"));
            System.out.println("username:" + pp.getProperty("username"));
            System.out.println("password:" + pp.getProperty("password"));

            //通过DruidDataSourceFactory获取javax.sql.DataSource
            DataSource ds = DruidDataSourceFactory.createDataSource(pp);

            //以下为一个查询的例子，和正常的jdbc操作一样
            String sql = "select * from sys_user";
            PreparedStatement pstmt;
            try {
                pstmt = ds.getConnection().prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
                int col = rs.getMetaData().getColumnCount();
                System.out.println("============================");
                while (rs.next()) {
                    for (int i = 1; i <= col; i++) {
                        System.out.print(rs.getString(i) + "\t");
                    }
                    System.out.println("");
                }
                System.out.println("============================");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
