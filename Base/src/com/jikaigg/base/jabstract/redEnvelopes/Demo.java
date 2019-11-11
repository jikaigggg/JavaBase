package com.jikaigg.base.jabstract.redEnvelopes;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // 创建一个群主
        Master mm = new Master("群主",100);
        // 创建三个成员
        Member m1 = new Member("A",0);
        Member m2 = new Member("B",0);
        Member m3 = new Member("C",0);
        // 打印所有人信息
        mm.show();
        m1.show();
        m2.show();
        m3.show();
        // 群主总共发20块钱，总共发3个
        ArrayList<Integer> ar = mm.send(20,3);
        // 三个普通成员收红包
        m1.receive(ar);
        m2.receive(ar);
        m3.receive(ar);
        // 打印所有人信息
        mm.show();
        m1.show();
        m2.show();
        m3.show();
    }
}
