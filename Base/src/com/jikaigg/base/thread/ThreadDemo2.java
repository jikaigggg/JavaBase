package com.jikaigg.base.thread;

/*
创建多线程程序的第一种方式：创建Thread类的子类

实现步骤：
    1.创建一个Thread类的子类
    2.在Thread类的子类中重写Thread类中的run方法，设置县城任务（开启线程要做什么）
    3.创建Thread类的子类对象
    4.调用Thread类中的方法start方法，开启新的线程，执行run方法

java程序属于抢占式调度，那个线程优先级高，哪个线程就优先执行，同一个优先级，随机选择一个执行
*/
public class ThreadDemo2 extends Thread {
    public static void main(String[] args) {

        MyThread1 m1 = new MyThread1();
        m1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main" + i);
        }
    }
}
