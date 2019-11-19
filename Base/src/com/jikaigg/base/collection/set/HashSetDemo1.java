package com.jikaigg.base.collection.set;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
HashSet特点：
    是一个无序的集合，存储元素和取出元素的顺序有可能不一致
    底层是一个哈希表结构（查询速度快）
*/
public class HashSetDemo1 {
    public static void main(String[] args) {
        Set<Integer> se = new HashSet<>();
        // 向集合中添加元素
        se.add(1);
        se.add(6);
        se.add(3);
        se.add(4);
        se.add(5);
        // 使用迭代器遍历
        Iterator it = se.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("==================");
        for (Integer i : se) {
            System.out.println(i);
        }
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
