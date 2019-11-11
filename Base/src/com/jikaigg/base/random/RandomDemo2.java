package com.jikaigg.base.random;

public class RandomDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int a = new OneToTen().getRandom(10);
            System.out.println(a);
        }
    }
}
