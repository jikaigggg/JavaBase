package com.jikaigg.anonymous;

/*
 * 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
 * new 类名称();
 * */
public class AnonymousDemo1 {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "yaojikai";
        one.showName();
        System.out.println("============");
        // 匿名对象
        new Person().name = "shimengyu";
        new Person().showName();
    }
}
