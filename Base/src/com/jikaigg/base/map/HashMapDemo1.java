package com.jikaigg.base.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
集合的遍历:

*/
public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<String, String> hp = new HashMap<>();
        hp.put("yao", "jikai");
        hp.put("shi", "mengyu");
        hp.put("zhao", "benshan");
        hp.put("huang", "jiaju");
        hp.put("liang", "liang");
        hp.put("he", "jiaju");
        System.out.println(hp);
        Set<String> se = hp.keySet();
        for (String s : se) {
            System.out.println(s + hp.get(s));

        }
        System.out.println(hp.entrySet());
    }
}
