package com.jikaigg.jinterface;

public class InterfaceDemo1 implements MyInterface1{
    // 访问接口当中的常量
    public static void main(String[] args) {
        System.out.println(MyInterface1.NUM);
    }
}
