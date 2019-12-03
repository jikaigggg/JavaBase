package com.jikaigg.base.io.properties;

import java.util.Properties;
import java.util.Set;

/*
Properties类表示一个持久的属性集
构造方法：
    public properties():创建一个空的属性列表
基本的存储方法：
    public Object setProperty(String key, String value):保存一对属性
    public String getProperty(String key):使用此属性列表中指定的键搜索属性值
    public Set<String> stringPropertyNames():所有键的名称的集合
*/
public class PropertiesDemo1 {
    public static void main(String[] args) {
        // 创建属性集对象
        Properties p = new Properties();

        //添加键值对元素
        p.setProperty("filename", "a.txt");
        p.setProperty("length", "2019983");
        p.setProperty("location", "D:\\JAVA\\a.txt");

        // 打印属性集对象
        System.out.println(p);

        // 通过键，获取属性值
        System.out.println(p.getProperty("filename"));
        System.out.println(p.getProperty("length"));
        System.out.println(p.getProperty("location"));

        // 遍历属性集，获取所有键的集合
        Set<String> strings = p.stringPropertyNames();

        // 打印键值对
        for (String s : strings) {
            System.out.println(s + " -- " + p.getProperty(s));
        }
    }
}
