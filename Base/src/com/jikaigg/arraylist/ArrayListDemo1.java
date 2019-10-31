package com.jikaigg.arraylist;

import java.util.ArrayList;

/*
 * 题目：定义一个数组，用来存储三个Person对象
 *
 * 数组有一个缺点，一旦创建，程序运行期间长度不可以发生改变
 *
 * 但是ArrayList集合的长度可以随意变化
 * 泛型：也就是装在集合当中的所有元素，全部是统一的什么类型
 * 注意：泛型只能是引用类型，不能是基本类型
 *
 * 注意事项：
 * 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
 * 如果内容时空，得到的是空的中括号[]
 * */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 创建了一个ArrayList集合，集合的名称是l，里面装的全都是String字符串类型的数据
        // 备注：从JDK1.7+KAISHI，右侧的尖括号内部可以不写内容，但是<>本身还是要写的
        ArrayList<String> l = new ArrayList<>();
        System.out.println(l);
        // 向集合中添加一些数据，需要用到add方法
        l.add("yaojikai");
        l.add("shimemgyu");
        // 错误写法，泛型规定了数组中必须全部都是String类型的数据
        // l.add(100);
        System.out.println(l);


    }

}
