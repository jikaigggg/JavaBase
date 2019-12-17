package com.jikaigg.jdbc;


import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*

*/
public class JDBCDemo5 {
    public static void main(String[] args) {
        Connection c = null;
        Statement s = null;
        ResultSet r = null;
        String name;
        int pwd;
        Scanner ss1 = new Scanner(System.in);
        Scanner ss2 = new Scanner(System.in);

        String n = ss1.next();
        int i = ss2.nextInt();


        try {
            c= JDBCUtils.getConnection();
            String sql = "select * from test";
            s = c.createStatement();
            r = s.executeQuery(sql);
            while (r.next()){

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(r,s,c);
        }
    }
}
