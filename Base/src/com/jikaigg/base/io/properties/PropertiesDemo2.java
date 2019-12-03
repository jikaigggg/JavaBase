package com.jikaigg.base.io.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
public void load(InputStream inStream):从字节输入流中读取键值对
参数中使用了字节输入流，通过流对象，可以关联到某文件上，这样就能够加载文本中的数据了。文本数据格式：
    location = D:\JAVA\a.txt
    filename = a.txt
    length = 2019983
*/
public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        Properties pr = new Properties();
        pr.load(new FileInputStream("a.txt"));
        Set<String> s = pr.stringPropertyNames();
        for (String aa : s) {
            System.out.println(aa+" -- "+pr.getProperty(aa));
        }
    }
}
