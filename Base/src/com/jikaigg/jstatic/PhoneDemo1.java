package com.jikaigg.jstatic;

public class PhoneDemo1 {
    public static void main(String[] args) {
        /*Phone p = new Phone("red",3,true);
        System.out.println("颜色："+p.getColor()+"    机龄："+p.getAge()+"    是否为智能机："+p.isSmart());*/
        Phone p = new Phone();
        System.out.println(getMax(3, 1));

    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
