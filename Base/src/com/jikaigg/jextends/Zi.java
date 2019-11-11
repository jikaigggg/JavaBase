package com.jikaigg.jextends;

/*
super关键字的用法有三种
  1. 在子类的成员方法中，访问父类的成员变量
  2. 在子类的成员方法中，访问父类的成员方法
  3. 在子类的构造方法中，访问父类的构造方法
*/
public class Zi extends Fu {
    int num = 20;

    @Override
    public void method() {
        super.method();
        System.out.println("子类方法");
    }
    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
