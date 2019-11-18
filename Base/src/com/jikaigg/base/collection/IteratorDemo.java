package com.jikaigg.base.collection;

import java.util.*;

/*
Iterator接口（对集合进行遍历）：
    boolean hasNext()   判断集合中还有没有下一个元素，如果有返回true，没有则返回false
    E next()            取出集合中的下一个元素

Iterator迭代器是一个接口，无法直接使用，需要Iterator接口的实现类对象，获取实现类的方式比较特殊
Collection接口中有一个方法，叫做iterator()，这个方法返回的就是迭代器的实现类对象

迭代器的使用步骤：
    1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
    2.使用Iterator接口中的方法hasNext()判断还有没有下一个元素
    3.使用Iterator接口中的方法next()取出集合中的下一个元素

*/
public class IteratorDemo {
    public static void main(String[] args) {
        // 创建一个集合对象
        Collection<String> col2 = new ArrayList<>();

        // 往集合中添加元素
        col2.add("yao");
        col2.add("ji");
        col2.add("kai");
        col2.add("ai");
        col2.add("shi");
        col2.add("meng");
        col2.add("yu");

        // 获取迭代器，也有泛型，跟着集合走，集合是什么泛型，迭代器就是什么泛型
        Iterator<String> it = col2.iterator();

        // 判断集合中是否还有下一个元素
        System.out.println(it.hasNext());
        while (it.hasNext()) {
            // 取出元素
            System.out.println(it.next());
        }
        Collection<String> hash = new HashSet<>();
        hash.add("yao");
        hash.add("ji");
        hash.add("kai");
        System.out.println(hash.toString());

        HashMap<String,String> ha = new HashMap<>();
        ha.put("yao","jikai");
        ha.put("shi","mengyu");
        String s1 = ha.get("yao");
        System.out.println(s1);
        int i1 = ha.size();
        System.out.println(i1);
        System.out.println(ha.keySet());
    }
}
