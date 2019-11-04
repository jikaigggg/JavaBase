package com.jikaigg.math;
/*
* 计算在-10.8到5.9，绝对值大于6或者小于2.1的整数有多少个
* */
public class MathDemo2 {
    public static void main(String[] args) {
        System.out.println(Math.ceil(-10.1));
        System.out.println(Math.ceil(10.1));
        for (int i = (int)Math.ceil(-10.8); i < (int)Math.ceil(5.9); i++) {
            if(Math.abs(i)>6 || Math.abs(i)<2.1){
                System.out.println(i);
            }
        }
    }
}
