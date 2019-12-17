package com.jikaigg.jdbc.test;

import java.util.Scanner;


public class LoginTest {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = ss.next();
        System.out.println("请输入密码：");
        String pwd = ss.next();
        boolean f = new Login().login(name,pwd);
        if (f){
            System.out.println("登陆成功了！");
        }else{
            System.out.println("登录失败了！");
        }
    }
}
