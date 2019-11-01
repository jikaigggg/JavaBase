package com.jikaigg.array;

import java.util.ArrayList;

/*
 * 需求：
 *   定义一个类，求出数组中最大的两个数
 * */
public class ArrayDemo7 {
    public static void main(String[] args) {
        ArrayList<Integer> aaa = new ArrayList<>();
        aaa.add(6);
        aaa.add(7);
        aaa.add(8);
        aaa.add(4);
        aaa.add(9);
        aaa.add(1);
        System.out.println("原始数组为："+aaa);
        //System.out.println(aaa.size());
        System.out.println("最大的两个数为:"+getTwoMax(aaa));
    }

    public static ArrayList<Integer> getTwoMax(ArrayList<Integer> array) {
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < array.size(); i++) {
            temp1 = temp1 > array.get(i) ? temp1 : array.get(i);
        }
        System.out.println("第一大的数是：" + temp1);
        for (int i = 0; i < array.size(); i++) {
            if (temp1 == array.get(i)) {
                array.remove(i);
            }
        }

        for (int i = 0; i < array.size(); i++) {
            temp2 = temp2 > array.get(i) ? temp2 : array.get(i);
        }
        System.out.println("第二大的数是：" + temp2);
        ArrayList<Integer> bbb = new ArrayList<>();
        bbb.add(temp1);
        bbb.add(temp2);
        return bbb;
    }
}




