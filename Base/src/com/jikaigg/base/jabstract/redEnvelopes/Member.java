package com.jikaigg.base.jabstract.redEnvelopes;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> l) {
        // 从多个红包当中随便抽取一个
        // 随机获取一个集合当中的索引编号
        int index = new Random().nextInt(l.size());
        // 根据所以呢，从集合当中删除，并且得到被删除的红包给自己
        int delta = l.remove(index);

        //当前成员本来余额
        int money = super.getMoney();
        super.setMoney(money += delta);
    }
}
