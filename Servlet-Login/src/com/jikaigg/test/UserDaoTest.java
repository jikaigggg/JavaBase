package com.jikaigg.test;

import com.jikaigg.dao.UserDao;
import com.jikaigg.domain.User;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testLogin(){
        User loginuser = new User();
        loginuser.setUsername("yaojikai");
        loginuser.setPassword("jikai");
        UserDao dao = new UserDao();
        User user = dao.login(loginuser);
        System.out.println(user);
    }
}
