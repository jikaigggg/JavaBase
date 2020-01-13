package com.crayon.dao.impl;

import com.alibaba.druid.util.JdbcUtils;
import com.crayon.dao.UserDao;
import com.crayon.domain.User;
import com.crayon.utils.JDBCUtils;
import jdk.nashorn.internal.ir.CallNode;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        // 使用JDBC操作数据库
        String sql = "select * from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        try {
            String sql = "select * from `user` where username = ? and password = ?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);
            return user;
        } catch (DataAccessException e) {
            return null;
        }
    }

    @Override
    public void add(User user) {
        String sql = "insert into `user` values(null,?,?,?,?,?,?,null,null)";
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from `user` where id = ?";
        template.update(sql, id);
    }

    @Override
    public User findById(int i) {
        String sql = "select * from `user` where id = ?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), i);
    }

    @Override
    public void update(User user) {
        String sql = "update `user` set name = ?, gender = ?, age = ?, address = ?, qq = ?, email = ? where id = ?";
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail(), user.getId());
    }

    @Override
    public int findTotalCount() {
        // 定义模板初始化sql
        String sql = "select count(*) from `user`";
        return template.queryForObject(sql, Integer.class);
    }

    @Override
    public List<User> findByPage(int start, int rows) {
        String sql = "select * from `user` limit ? , ?";
        return template.query(sql,new BeanPropertyRowMapper<User>(User.class),start,rows);
    }

}
