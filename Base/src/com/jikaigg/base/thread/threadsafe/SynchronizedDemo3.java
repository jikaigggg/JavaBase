package com.jikaigg.base.thread.threadsafe;

/*
解决线程安全问题的第三种方案：
    LOCK锁
    java.util.concurrent.locks接口
    lock实现提供了比使用synchronized方法和语句可获得更加广泛的锁定操作
    LOCK接口中的方法：
        void lock()获取锁
        void unlock()释放锁
    使用步骤：
        1.在成员位置传建一个ReentrantLock对象
        2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
        3.在可能会出现安全问题的代码后调用unLock接口中的方法unlock释放锁
*/
public class SynchronizedDemo3 {
}
