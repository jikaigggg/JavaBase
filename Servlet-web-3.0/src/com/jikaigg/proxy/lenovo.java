package com.jikaigg.proxy;

public class lenovo implements  SaleComputer{
    @Override
    public String sale(double money) {
        System.out.println("money。。。"+money);
        return "money...";
    }

    @Override
    public void show() {
        System.out.println("show...");
    }
}
