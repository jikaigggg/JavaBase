package com.jikaigg.algorithm;

/*
    判断是否为水仙花数
*/
public class Demo02 {
    public static void main(String[] args) {
        // 方法2
        int a, b, c;
        for (int i = 0; i < 1000; i++) {
            a = i % 10;
            b = i / 10 % 10;
            c = i / 100;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }

        // 方法1调用
        /*for (int i = 100; i < 1000; i++) {
            double[] c = {i / 100, i % 100 / 10, i % 100 % 10};
            shuixian(c);
        }*/
    }

    // 方法1： 用Math函数做判断
    public static void shuixian(double[] i) {
        if ((Math.pow(i[0], 3) + Math.pow(i[1], 3) + Math.pow(i[2], 3)) == i[0] * 100 + i[1] * 10 + i[2]) {
            System.out.println((i[0] * 100 + i[1] * 10 + i[2]));
        }
    }
}

