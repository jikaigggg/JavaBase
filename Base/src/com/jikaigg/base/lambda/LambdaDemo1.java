package com.jikaigg.base.lambda;

/*
Lambda表达式
*/
public class LambdaDemo1 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("helloword!")).start();

    }
}
