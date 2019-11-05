package com.jikaigg.overLoad;

public class OverLoadDemo1 {
    public static void main(String[] args) {
        // 打印输出同一个方法名，传不同参数
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));

    }

    // 定义一个方法，方法名叫做sum，计算两个数的和
    public static int sum(int a, int b) {
        System.out.println("有两个参数的方法执行");
        return a + b;
    }

    // 定义一个方法，方法名也叫做sum，计算三个数的和
    public static int sum(int a, int b, int c) {
        System.out.println("有三个参数的方法执行");
        return a + b + c;
    }

    // 定义一个方法，方法名也叫做sum，计算四个数的和
    public static int sum(int a, int b, int c, int d) {
        System.out.println("有四个参数的方法执行");
        return a + b + c + d;
    }
}
