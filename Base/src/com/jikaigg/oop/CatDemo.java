package com.jikaigg.oop;

public class CatDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name = "crayon";
        c.age = 18;
        c.sex = true;

        System.out.println(c.name + c.age + c.sex);

        c.jump();
        c.walk();
        c.eat();
    }

    public static class Cat {
        String name;
        int age;
        boolean sex;

        void walk() {
            System.out.println("walk!!!");
        }

        void jump() {
            System.out.println("jump!!!");
        }

        void eat() {
            System.out.println("eat!!!");
        }
    }
}
