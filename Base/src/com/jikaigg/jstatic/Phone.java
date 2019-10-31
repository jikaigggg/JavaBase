package com.jikaigg.jstatic;

public class Phone {
    private String color;// 颜色
    private int age;// 机龄
    private boolean smart;// 是否为智能机

    static {
        System.out.println("=!=!=!=!=!=!=");
    }

    public Phone() {
    }

    public Phone(String color, int age, boolean smart) {
        this.color = color;
        this.age = age;
        this.smart = smart;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
