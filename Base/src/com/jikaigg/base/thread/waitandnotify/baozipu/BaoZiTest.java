package com.jikaigg.base.thread.waitandnotify.baozipu;



/*
    测试类：
        包含main方法的类：程序执行的入口，启动程序
        创建包子对象；创建包子铺线程，开启；创建吃货线程，开启；
*/
public class BaoZiTest {
    public static void main(String[] args) {
        // 创建包子对象
        BaoZi bz = new BaoZi();
        // 创建包子铺线程
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
