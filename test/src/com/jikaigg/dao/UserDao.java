package com.jikaigg.dao;

import com.jikaigg.domain.User;
import com.jikaigg.utils.JDBCU;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCU.getDataSource());
    public User login(User loginUser){
        try{
            String sql = "select * from user_demo where username = ? and password = ?";
            User user = template.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),loginUser.getUsername(),loginUser.getPassword());
            return user;
        }catch(Exception e ){
            return null;
        }
    }
}
