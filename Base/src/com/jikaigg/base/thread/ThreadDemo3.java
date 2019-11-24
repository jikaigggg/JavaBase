package com.jikaigg.base.thread;
/*
获取线程名称：
    1.使用Thread类中的方法getName()
        String getName()  返回该线程的名称
    2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称

设置线程名称：
    1.使用Thread类中的方法setName()
    2.创建一个带参数的构造方法，参数传递线程的名称，调用父类的带参构造方法，把线程名称传递给父类，让父类（Thread）给子线程取一个名字
sleep方法：
    毫秒数结束之后，线程继续执行
*/

public class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 my3 = new MyThread1();
        my3.setName("jikai");
        my3.start();

        /*new MyThread1("jikai1").start();
        new MyThread1("jikai2").start();*/

        for (int i = 0; i < 60; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }

}
