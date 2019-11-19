package com.jikaigg.base.collection.list;

import java.util.LinkedList;

/*
特有特点：
    底层是一个链表结构：查询慢，增删快
    里面包含了大量操作首尾元素的方法
注意：
    使用LinkedList集合特有方法，不能使用多态
public void addFirst(E e)   将制定元素插入此列表的开头
public void addLast(E e)    将指定元素添加到此列表的结尾
public void push(E e)       将元素推入此列表所表示的堆栈
*/
public class LinkedListDemo1 {
    public static void main(String[] args) {
        // 创建LinkedList集合对象
        LinkedList<String> ll = new LinkedList<>();
        // 使用add方法往集合中添加元素
        ll.add("a");
        ll.add("b");
        ll.add("c");
        System.out.println(ll);

        // 从开头添加元素
        ll.addFirst("x");
        System.out.println(ll);

        // 从结尾添加元素
        ll.addLast("y");
        System.out.println(ll);
        ll.push("w");
        System.out.println(ll);

        // 获取第一个元素
        String lf = ll.getFirst();
        System.out.println(lf);

        // 获取最后一个元素
        String ls = ll.getLast();
        System.out.println(ls);

        // 清空集合中的元素
        ll.clear();
        System.out.println(ll);

    }
}
