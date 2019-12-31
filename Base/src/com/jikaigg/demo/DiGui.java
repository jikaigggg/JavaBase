package com.jikaigg.demo;

import java.io.File;

/*
递归的分类：
    递归分为两种，直接递归和简介递归
    直接递归称为方法自身调用自己
    间接递归可以A方法调用B方法，B方法调用C方法，C方法调用A方法
注意事项：
    递归一定要有条件限定，保证递归能够停止下来，否则也会发生栈内存溢出StackOverflowError
    在递归中虽然有限定条件，但是递归次数不能太多，否则也会发生栈内存溢出StackOverflowError
    构造方法，禁止递归
递归的使用前提：
    当调用方法的时候，方法的主题不变，每次调用方法的参数不同，可以使用递归
*/
public class DiGui {
    public static void main(String[] args) {
        // System.out.println(sum(10));
        // method1();
        // System.out.println(method2(5));
        File f = new File("/home/jikaigg/git/JavaBase");
        method3(f);
    }

    private static int sum(int i) {
        if (i == 1) {
            return 1;
        }
        return i + sum(i - 1);

    }

    private static void method1() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static int method2(int n) {
        if (n == 2) {
            return 2;
        }
        return n * method2(n - 1);
    }

    /*
    递归打印多级目录
    */
    private static void method3(File dir) {
        File[] f = dir.listFiles();
        for (File file : f) {
            if (file.isDirectory()) {
                method3(file);
            }
            System.out.println(file);
        }
    }
}
