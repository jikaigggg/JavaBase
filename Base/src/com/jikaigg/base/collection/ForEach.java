package com.jikaigg.base.collection;

import java.util.ArrayList;
import java.util.Collection;
/*
增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
所有的单列集合都能使用增强for循环

增强for循环用来遍历集合和数组

格式：
    for(集合/数组的数据类型 变量名:集合名/数组名){
        sout(变量名)
    }
*/
public class ForEach {
    public static void main(String[] args) {
        Collection col3 = new ArrayList();
        method();
    }
    // 使用增强for循环遍历数组
    public static void method(){
        int[] array1 = {1,2,5,4,3,6};
        for(int i:array1){
            System.out.println(i);
        }
    }
}
