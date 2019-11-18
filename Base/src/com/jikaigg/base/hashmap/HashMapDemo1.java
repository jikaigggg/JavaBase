package com.jikaigg.base.hashmap;

import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        // 向HashMap中添加键为“yao”，值为“jikai”的数据
        hm.put("yao", "jikai");
        // 向HashMap中添加键为“shi”，值为“mengyu”的数据
        hm.put("shi", "mengyu");
        // 向HashMap中添加键为“wang”，值为“yan”的数据
        hm.put("wang", "yan");
        // 打印输出键为“yao”的值
        System.out.println(hm.get("yao"));
        // 打印输出键为“shi”的值
        System.out.println(hm.get("shi"));
        // 打印输出键为“wang”的值
        System.out.println(hm.get("wang"));
        // 遍历HashMap
        for (String i : hm.keySet()) {
            // String 是mp中的键的对应类型 i 是对应的KeySet中的每一个键值
            System.out.println(i);
            // 反着取，先put进去的后get出来
            System.out.println(hm.get(i));
        }
        // 移除key所对应的value，并返回value
        String s = hm.remove("yao");
        System.out.println(s);
        for (String j : hm.keySet()) {
            System.out.println(j);
            System.out.println(hm.get(j));
        }
    }
}
