package com.jikaigg.base.jabstract.redEnvelopes;

import java.util.ArrayList;

// 群主类
public class Master extends User {
    public Master() {
    }

    public Master(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        // 首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> envelopes = new ArrayList<>();

        // 首先看一下群主有多少钱
        int leftMoney = getMoney();  // 群主当前余额

        if (totalMoney > leftMoney) {
            System.out.println("余额不足！！！");
            return envelopes;
        }

        // 扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);

        // 发红包需要平均拆分count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;  // 余数

        // 剩下的除不开的零头，包在一个红包中
        // 下面把红包，一个一个放在集合中
        for (int i = 0; i < count - 1; i++) {
            envelopes.add(avg);
        }

        // 最后一个红包
        int last = avg + mod;
        envelopes.add(last);

        return envelopes;
    }
}
