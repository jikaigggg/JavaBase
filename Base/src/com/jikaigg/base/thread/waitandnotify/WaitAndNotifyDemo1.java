package com.jikaigg.base.thread.waitandnotify;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.Objects;

/*
等待唤醒案例：线程之间通信
    创建一个顾客线程（消费者）：告知老板要的包子的种类和数量，调用wait方法，放弃cpu执行权，进入到waiting状态（无限等待）
    创建一个老板线程（生产者）：花了5秒做包子，做好了包子之后，调用notify方法，唤醒顾客吃包子

注意：
    顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个执行
    同步执行的锁对象必须保证唯一
    只有锁对象才能调用wait和notify方法
*/
public class WaitAndNotifyDemo1 {
    public static void main(String[] args) {
        // 创建一个锁对象，保证唯一
        Object obj = new Object();

        // 创建一个顾客线程（消费者）
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    // 保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj) {
                        System.out.println("告知老板包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒notify之后的代码！
                        System.out.println("拿到了包子！");
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    // 保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("包子做好了！");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
