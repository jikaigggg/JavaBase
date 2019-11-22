package com.jikaigg.base.hashmap;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("yao", "jikai");
        hm.put("shi", "mengyu");
        hm.put("li", "jikai");
        String s1 = hm.put("aa", "bb");
        // put方法的返回值是该键put前的映射，如果没有返回null
        System.out.println(s1);  // null
        String s2 = hm.put("aa", "cc");
        System.out.println(s2);  // bb
        System.out.println(hm);
        String s3 = hm.remove("aa");
        System.out.println(s3);
        System.out.println(hm);
        int i1 = hm.size();
        // size()方法，返回hashmap的键的数量
        System.out.println("此时hashmap的长度为："+i1);
        // 如果hashmap中包含指定的键值，返回true
        boolean b1 = hm.containsKey("yao");
        System.out.println(b1);
        boolean b2 = hm.containsKey("y");
        System.out.println(b2);
        HashMap<String,String> hmclone = (HashMap<String, String>) hm.clone();
        // hm 与 gmclone的值一样，但是地址值不一样
        System.out.println(hm.equals(hmclone));  // true
        System.out.println(hm == hmclone);  // false
    }
}
