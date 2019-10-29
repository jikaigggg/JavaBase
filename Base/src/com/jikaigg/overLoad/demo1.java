package com.jikaigg.overLoad;

public class demo1 {
    public static void main(String[] args) {
        System.out.println(isSame(2, 2));
        System.out.println(sum());
        print(5);
    }

    //比较两个数是否相同
    public static boolean isSame(int a, int b) {
        /*if (a == b) {
            return true;
        } else {
            return false;
        }*/
        return a == b;
    }

    //求1~100的和
    public static int sum() {
        int s = 0;
        for (int i = 0; i < 101; i++) {
            s += i;
        }
        return s;
    }

    //打印制定次数的helloworld
    public static void print(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("HelloWorld");
        }
    }
}
