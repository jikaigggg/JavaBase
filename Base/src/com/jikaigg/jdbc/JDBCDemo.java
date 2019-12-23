package com.jikaigg.jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/*
数据库连接池：
    概念：其实就是一个容器（集合），存放数据库链接的容器，
         当系统初始化好后容器被创建，容器中会申请一些连接对象，
         当用户来访问数据库时，从容器中获取链接对象，用户访问完之后会将链接对象归还给容器
    好处：节约资源，高效。
    实现：DataSource javax.sql包下的
        方法：获取连接:getConnection()归还链接close()
        一般我们不去实现它，有驱动（数据库厂商）实现

c3p0链接步骤：
    1.导入jar包（两个）：c3p0-0.9.5.2.jar mchange-commons-java-0.2.12.jar
    2.定义配置文件：
        名称:c3p0.properties或者c3p0-config.xml
        路径:直接将文件放在src目录下即可
    3.创建核心对象 数据库连接池对象 ComboPooledDataSource
    4.获取链接：getConnection

Druid：数据库连接池实现技术，由阿里巴巴提供的
    步骤：
        1.导入jar包（两个）：Druid-1.0.9.jar
        2.定义配置文件：
            名称:Druid.properties
        3.创建核心对象 数据库连接池对象 ComboPooledDataSource
        4.获取链接：getConnection

*/
public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        // 加载配置文件
        Properties p = new Properties();
        InputStream in = JDBCDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        p.load(in);
        //获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(p);
        System.out.println(ds);

        // 获取链接
        Connection c12 = ds.getConnection();
        System.out.println(c12);
    }
}
