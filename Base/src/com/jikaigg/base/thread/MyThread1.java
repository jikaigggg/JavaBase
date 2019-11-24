package com.jikaigg.base.thread;

/*
线程的名称：
    主线程：main
    新线程：Thread-0、Thread-1、、、
*/
public class MyThread1 extends Thread {
    public MyThread1(){}
    public MyThread1(String name){super(name);}
    String name = getName();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "..." + i);
        }
        // 获取线程的名称
        System.out.println(Thread.currentThread().getName());
    }
}
