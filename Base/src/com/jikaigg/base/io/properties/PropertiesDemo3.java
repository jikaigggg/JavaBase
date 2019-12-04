package com.jikaigg.base.io.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
Properties类表示一个持久的属性集
*/
public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        // 用字符流写一个properties文件
        /*FileWriter fw = new FileWriter("a.properties");
        fw.write("yao:jikai\r\n");
        fw.write("shi:mengyu\r\n");
        fw.write("huang:jiaju\r\n");
        fw.flush();
        fw.close();*/
        // 用字符流读取并load文件
        Properties p = new Properties();
        p.load(new FileReader("a.properties"));
        Set<String> s = p.stringPropertyNames();
        for (String ss : s) {
            System.out.println("key: " + ss + "   value: " + p.getProperty(ss));
        }
    }
}
