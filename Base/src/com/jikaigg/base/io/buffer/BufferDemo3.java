package com.jikaigg.base.io.buffer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
文本排序:
    有一个文本内容为：
        3、举头望明月
        1、床前明月光
        4、低头思故乡
        2、疑是地上霜
     期望文本内容：
        1、床前明月光
        2、疑是地上霜
        3、举头望明月
        4、低头思故乡

步骤：
    1.创建一个HashMap集合，可以：存储 每行文本的序号（1,2,3。。。）；value：存储每行的文本
    2.创建字符缓冲输入流对象， 构造方法中绑定子父输入流
    3.创建字符缓冲输出流对象，构造方法中绑定字符输出流
    4.使用字符缓冲输入流中的方法readline，逐行读取文本
    5.对读取到的文本进行切割，获取行中的序号和文本内容
    6.把切割好的序号和文本的内容存储到HashMap集合中（Key序号是有序的，会自动排序1,2,3。。。）
    7.遍历HashMap集合，获取每一个键值对
    8.把每一个键值对，拼接为一个文本行
    9.把拼接好的文本，使用字符缓冲输出流中的方法write，写入到文件中
    10.释放资源


*/
public class BufferDemo3 {
    public static void main(String[] args) throws IOException {
        // 1.创建一个HashMap集合，可以：存储 每行文本的序号（1,2,3。。。）；value：存储每行的文本
        Map<String, String> hm = new HashMap<>();

        // 2.创建字符缓冲输入流对象， 构造方法中绑定字符输入流
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        // 3.创建字符缓冲输出流对象，构造方法中绑定字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

        // 4.使用字符缓冲输入流中的方法readline，逐行读取文本
        String s = null;
        while ((s = br.readLine()) != null) {
            // 5.对读取到的文本进行切割，获取行中的序号和文本内容
            String[] sl = s.split("、");

            // 6.把切割好的序号和文本的内容存储到HashMap集合中（Key序号是有序的，会自动排序1,2,3。。。）
            hm.put(sl[0], sl[1]);
        }
        // System.out.println(hm);

        // 7.遍历HashMap集合，获取每一个键值对
        for (String i : hm.keySet()) {
            // 8.把每一个键值对，拼接为一个文本行
            s = i + "、" + hm.get(i)+"\r\n";

            // System.out.println(s);

            // 9.把拼接好的文本，使用字符缓冲输出流中的方法write，写入到文件中
            bw.write(s);
            bw.flush();
        }

        // 10.释放资源
        bw.close();
        br.close();
    }
}
