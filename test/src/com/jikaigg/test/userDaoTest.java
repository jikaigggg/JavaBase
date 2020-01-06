package com.jikaigg.test;

import com.jikaigg.dao.UserDao;
import com.jikaigg.domain.User;
import org.junit.Test;

public class userDaoTest {
    @Test
    public void testLogin(){
        User loginuser = new User();
        loginuser.setUsername("yaojikai");
        loginuser.setPassword("jikai");
        UserDao dao = new UserDao();
        User login = dao.login(loginuser);
        System.out.println(login);
    }

}
