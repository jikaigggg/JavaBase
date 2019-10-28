package com.jikaigg.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        crayon1();
        crayon2(1314);
        System.out.println(crayon3());
        System.out.println(crayon4(false));
        int x = crayon5(666);
        System.out.println(x);
    }

    //直接调用
    public static void crayon1() {
        System.out.println("yaojikai1");
    }

    public static void crayon2(int a) {
        System.out.println("参数为：" + a);
    }

    //打印调用
    public static int crayon3() {
        return 5;
    }

    public static boolean crayon4(boolean b) {
        return b;
    }

    public static String crayon5(String c) {
        return c;
    }

    //赋值调用
    public static int crayon5(int d) {
        return d;
    }
}
