package com.crayon.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * jdbc工具类，使用Druid连接池
 * */
public class JDBCUtils {
    private static DataSource ds;
    static {
        try {
            Properties p = new Properties();
            p.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(p);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 获取连接池对象
     * */
    public static DataSource getDataSource(){
        return ds;
    }
    /**
     * 获取数据库连接对象
     * */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }


}
