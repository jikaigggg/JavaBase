package com.jikaigg.arraylist;

import java.util.ArrayList;
import java.util.Random;

/*
  练习一：
    生成6个1~33的随机数，并添加到集合，遍历集合
*/
public class ArrayListDemo2 {
    public static void main(String[] args) {
        // 创建一个集合存放这6个数字
        ArrayList<Integer> l1 = new ArrayList<>();
        // 创建随机数
        Random r = new Random();
        // 生成6个随机数并且存放在集合中
        for (int i = 0; i < 6; i++) {
            l1.add(r.nextInt(33) + 1);
        }
        // 遍历集合
        for (int i = 0; i < 6; i++) {
            System.out.println("第" + (i + 1) + "个元素是" + l1.get(i));
        }
    }
}
