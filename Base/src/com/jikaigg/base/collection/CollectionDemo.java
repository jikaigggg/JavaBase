package com.jikaigg.base.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
Collection接口中的共性方法：
    public boolean add(E e)         把给定的对象添加到当前集合中
    public void clear()             清空集合中所有的元素
    public boolean remove(E e)      把给定的对象在当前集合中删除
    public boolean contains(E e)    判断当前集合中是否包含给定的对象
    public boolean isEmpty()        判断当前集合是否为空
    public int size()               返回集合中元素的个数
    public Object[] toArray()       把集合中的元素，存储到数组中

*/
public class CollectionDemo {
    public static void main(String[] args) {
        // 创建一个集合对象,可以使用多态
        Collection<String> col1 = new ArrayList<>();
        System.out.println("当前集合：" + col1);   // []   重写了toString()方法

        //isEmpty 方法返回boolean
        boolean a = col1.isEmpty();
        System.out.println("集合是否为空：" + a);
        // add 方法返回boolean类型
        System.out.println("添加是否成功：" + col1.add("yao"));
        System.out.println("当前集合：" + col1);
        col1.add("ji");
        col1.add("kai");
        col1.add("ai");
        col1.add("shi");
        col1.add("meng");
        col1.add("yu");
        System.out.println("当前集合：" + col1);

        // remove 方法返回boolean
        col1.remove("shi");
        System.out.println("当前集合：" + col1);
        System.out.println("删除是否成功:" + col1.remove("shi"));
        System.out.println("当前集合：" + col1);

        // contains 方法返回boolean
        boolean b = col1.contains("meng");
        System.out.println("当前集合是否包含元素：" + b);

        // 清空集合中所有元素，但是不删除集合，集合仍然存在
        col1.clear();
        System.out.println("当前集合：" + col1);
    }
}
