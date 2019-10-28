package com.jikaigg.overLoad;

public class OverLoadDemo1 {

    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));
        short c = 1;
        short d = 1;
        System.out.println(isSame(c, d));
        System.out.println(isSame(3, 6));
        long e = 10L;
        long f = 10L;
        System.out.println(isSame(e, f));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("两个byte方法执行！");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSame(short a, short b) {
        System.out.println("两个short方法执行！");
        return a == b ? true : false;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("两个int方法执行！");

        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSame(long a, long b) {
        System.out.println("两个long方法执行！");

        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

}
