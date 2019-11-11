package com.jikaigg.base.method;

public class MethodDemo4 {
    public static void main(String[] args) {
        Student1 ss = new Student1();
        ss.setName("黄家驹");
        ss.setAge(55);
        System.out.println("姓名：" + ss.getName() + "   年龄：" + ss.getAge());
        Student1 ss1 = new Student1("黄家驹", 50);
        System.out.println("姓名：" + ss1.getName() + "   年龄：" + ss1.getAge());
    }


}
