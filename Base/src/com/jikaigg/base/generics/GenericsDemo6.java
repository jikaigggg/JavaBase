package com.jikaigg.base.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/*
泛型的通配符：
    ？：代表任意的数据类型
使用方式：
    不能创建对象使用
    只能作为方法的参数使用

通配符的高级使用：
    泛型的上限限定：? extends E     代表使用的泛型只能是E类型的子类/本身
    泛型的下限限定：? super E       代表使用的泛型只能是E类型的父类/本身
*/
public class GenericsDemo6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(5);

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("yao");
        arr2.add("jikai");
        printArray(arr1);
        printArray(arr2);
    }
    /*
        定义一个方法，能遍历所有类型的ArrayList集合
        这时候我们不知道ArrayList集合使用什么数据类型，可以泛型的通配符？来接收数据类型
        */
    public static void printArray(ArrayList<?> arr){
        Iterator<?> it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
