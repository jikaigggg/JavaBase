package com.jikaigg.method;
/*
* 一个标准的类通常拥有下面四个组成部分
*   1、所有的成员变量都要使用private关键字修饰
*   2、为每一个成员变量写一对儿get、set方法
*   3、编写一个无参数的构造方法
*   4、编写一个有参数的的构造方法
*
* 这样标准的累也叫作Java Bean
* */
public class Student1 {
    private String name;
    private int age;


    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
