package com.jikaigg.jdbc.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {

    public boolean login(String username, String password) {
        Connection c = null;
        Statement st = null;
        ResultSet re = null;
        if (username == null || password == null) {
            return false;
        }
        try {
            c = JDBCUt.getCon();
            st = c.createStatement();
            String sql = "select * from test3 where name = '" + username + "' and age = '" + password + "'";
            re = st.executeQuery(sql);
            return re.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUt.close(re, st, c);
        }
        return false;
    }
}
