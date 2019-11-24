package com.jikaigg.base.thread.waitandnotify;

/*
进入到TimeWaiting(计时等待)有两种方式：
    1.使用sleep(long m)方法，在毫秒值结束之后，线程睡醒进入到Runnable/Block状态
    2.使用wait(long m）方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，线程睡醒进入到Runnable/Block状态
唤醒的方法：
    notify()
    notifyAll()

wait和notify方法需要注意的细节：
    1.wait方法与notify方法必须要由同一个锁对象调用。因为：对应的锁对象可以通过notify唤醒使用同一个锁对象调用的wait方法后的线程
    2.wait方法与notify方法是属于Object类的方法的。因为：锁对象可以是任意对象，为任意对象的所属类都是继承了Object类的
    3.wait方法与notify方法必须要在同步代码块或者是同步函数中使用。因为：必须要通过锁对象调用这两个方法。
*/
public class WaitAndNotifyDemo2 {
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
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒notify之后的代码！
                        System.out.println("拿到了包子！");
                    }
                }
            }
        }.start();
    }
}
