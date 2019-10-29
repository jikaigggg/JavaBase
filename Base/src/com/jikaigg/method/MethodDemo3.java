package com.jikaigg.method;

import java.sql.Struct;

/*
 * 间接访问private成员变量，就是定义一对Getter Setter方法；
 *
 *
 * */
public class MethodDemo3 {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("yaojikai",18);
    }
}
