package com.jikaigg.jdbc.test;

import java.sql.*;

public class Login {

    public boolean login(String username, String password) {
        Connection c = null;
        PreparedStatement st = null;
        ResultSet re = null;
        if (username == null || password == null) {
            return false;
        }
        try {
            c = JDBCUt.getCon();
            String sql = "select * from test3 where name = ? and age = ?";
            // 创建一个prepareStatement对象用来防止sql注入
            st = c.prepareStatement(sql);
            // 给？赋值
            st.setString(1,username);
            st.setString(2,password);
            re = st.executeQuery();
            return re.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUt.close(re, st, c);
        }
        return false;
    }
}
