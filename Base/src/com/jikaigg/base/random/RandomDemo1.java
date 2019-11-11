package com.jikaigg.base.random;

import java.util.Random;

/*
  nextInt(3);
  带参数的是随机数范围，左闭右开，比如上一行中代表[0,3)。
*/
public class RandomDemo1 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt();
        System.out.println("随机数是：" + a);
        for (int i = 0; i < 100; i++) {
            int b = r.nextInt(10);
            System.out.println(b);
        }
    }
}
