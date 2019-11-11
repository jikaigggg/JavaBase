package com.jikaigg.base.jabstract.redEnvelopes;

public class User {
    private String name;  // 姓名
    private int money;  // 余额，就是用户当前拥有的钱数

    public User() {
    }


    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show(){
        System.out.println("我叫："+this.name+"    我有："+this.money+"元");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
