package com.jikaigg.base.arraylist;

import java.util.ArrayList;

/*
  定义指定格式的打印集合的方法（ArrayList类型作为参数），使用{}括起来，使用@分隔每个元素
*/
public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("yao");
        array.add("ji");
        array.add("kai");
        array.add("shi");
        array.add("hao");
        array.add("ren");
        array.add("!!!");
        specialArray(array);
    }

    public static void specialArray(ArrayList<String> array) {
        System.out.print("{");
        for (int i = 0; i < array.size(); i++) {
            if (i == array.size() - 1) {
                System.out.print(array.get(i));
            } else {
                System.out.print(array.get(i) + "@");
            }
        }
        System.out.println("}");
    }
}
