package com.jikaigg.method;

public class Person {
    String name;
    //将年龄私有化
    private int age;

    //这个成员方法，专门用于向age设置数据
    public void setAge(int num) {
        if (0 < num && 100 > num) {
            age = num;
        } else {
            System.out.println("数据不合法！");
        }
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println("姓名是：" + name + "  年龄是：" + age);
    }
}

