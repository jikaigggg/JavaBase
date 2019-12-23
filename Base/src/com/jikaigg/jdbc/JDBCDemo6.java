package com.jikaigg.jdbc;
/*
开启事务：setAutoCommit(boolean autoCommit)调用该方法设置参数为false，即开启事务
    在执行sql之前开启事务
提交事务：Commit()
    当所有sql都执行完提交事务
回滚事务：rollback()
    在catch中回滚事务
*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo6 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement p1 = null;
        PreparedStatement p2 = null;

        try {
            conn = JDBCUtils.getConnection();

            //开启事务
            conn.setAutoCommit(false);

            // 定义 sql
            // shimengyu+5
            String sql1 = "update test set age = age + ? where name = ?";
            // yaojikai-5
            String sql2 = "update test set age = age - ? where name = ?";
            //获取执行sql对象
            p1 = conn.prepareStatement(sql1);
            p2 = conn.prepareStatement(sql2);
            // 设置参数
            p1.setInt(1, 2);
            p1.setString(2, "yaojikai");
            p2.setInt(1, 2);
            p2.setString(2, "shimengyu");
            p1.executeUpdate();
            int a = 3/0;
            p2.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            // 事务回滚
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(p1, conn);
            JDBCUtils.close(p2, null);
        }
    }

}
