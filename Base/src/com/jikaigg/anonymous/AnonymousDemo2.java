package com.jikaigg.anonymous;

import java.util.Scanner;

/*
 * 只需要输入一个数字，可以用Scanner的匿名对象
 * */
public class AnonymousDemo2 {
    public static void main(String[] args) {
        System.out.println("输入的是" + new Scanner(System.in).nextInt());
    }
}
