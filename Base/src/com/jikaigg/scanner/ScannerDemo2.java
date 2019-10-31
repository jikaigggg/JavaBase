package com.jikaigg.scanner;

import java.util.Scanner;

/*
 * 需求1：键盘输入两个int数字，并且求出和
 * 思路：用键盘输入，就要用到Scanner
 *
 * 需求2：输入三个数字，返回最大值
 * */
public class ScannerDemo2 {
    public static void main(String[] args) {
        /*Scanner s2 = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = s2.nextInt();
        System.out.println("请输入第二个数字：");
        int b = s2.nextInt();
        System.out.println(a + "+" + b + "等于" + (a + b));*/
        Scanner s3 = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = s3.nextInt();
        System.out.println("请输入第一个数字");
        int b = s3.nextInt();
        int temp = a > b ? a : b;
        System.out.println("请输入第一个数字");
        int c = s3.nextInt();
        System.out.println("最大的数是：" + (temp > c ? temp : c));
    }
}
