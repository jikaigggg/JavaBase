package com.jikaigg.base.reflect;

public class Person {
    public String name;
    protected String sex;
    String color;
    private int age;

    public Person() {
    }

    public Person(String name, String sex, String color, int age) {
        this.name = name;
        this.sex = sex;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHello() {
        return age;
    }

    public void setHello(int age) {
        this.age = age;
    }
}
