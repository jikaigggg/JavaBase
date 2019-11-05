package com.jikaigg.array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 动态初始化一个长度为3的数组
        int[] arrayA = new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("========");

        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("========");

        // 将arrayA数组赋给arrayB数组实际上是将arrayA数组引用的的地址值赋给arrayB数组，结果就是两个数组变量引用同一个地址值的数组
        int[] arrayB = arrayA;
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("========");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("========");

        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
    }
}
