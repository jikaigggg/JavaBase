package com.crayon.dao;

import com.crayon.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户操作的DAO
 * */
public interface UserDao {
    public List<User> findAll();

    User findUserByUsernameAndPassword(String username,String password);

    void add(User user);

    void delete(int id);

    User findById(int i);

    void update(User user);

    /**
     * 查询总记录数
     * @return
     * */
    int findTotalCount();

    /**
     * 分页查询每页记录
     * @param start
     * @param rows
     * */
    List<User> findByPage(int start,int rows);
}
