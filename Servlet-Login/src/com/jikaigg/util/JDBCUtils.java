package com.jikaigg.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/*
 * JDBC的工具类，使用的是Druid连接池
 * */
public class JDBCUtils {
    private static DataSource ds;

    static {
        try {
            // 1.加载配置文件
            Properties p = new Properties();
            InputStream r = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            p.load(r);
            // 2.初始化连接池对象
            ds = DruidDataSourceFactory.createDataSource(p);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*
     * 获取连接池对象
     * */
    public static DataSource getDataSource() {
        return ds;
    }

    /*
     * 获取Connection连接对象
     * */
    public static Connection getConn() throws SQLException {
        return ds.getConnection();
    }
}
