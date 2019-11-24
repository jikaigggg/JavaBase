package com.jikaigg.base.thread.threadsafe;

/*
模拟卖票案例：
    创建三个线程，同时开启，对共享的票进行出售

出现了线程安全问题，卖票出现了重复的票和不存在的票

*/
public class ThreadTest {
    public static void main(String[] args) {
        // 创建卖票接口的实现类对象
        ThreadTicketImpl thim = new ThreadTicketImpl();

        // 创建Thread类对象，构造方法中传递卖票接口实现类对象
        Thread t1 = new Thread(thim);
        Thread t2 = new Thread(thim);
        Thread t3 = new Thread(thim);

        // 调用start方法开启多线程
        t1.start();
        t2.start();
        t3.start();
    }
}
