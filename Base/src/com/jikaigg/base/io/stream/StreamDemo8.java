package com.jikaigg.base.io.stream;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileReader;
import java.io.IOException;

/*
Reader：字符输入流，是字符输入流的最顶层的父类，定义了一些共性的成员方法，是一个抽象类
共性的成员方法：
    int read():读取单个字符并返回
    int read(char[] cbuf):将字符读入数组
    void close():关闭该流并释放与之相关的资源

FileReader：文件字符输入流
作用：把硬盘中的数据以字符的方式读取到内存中
构造方法：
    FileReader(String fileName):
    FileReader(File file):
构造方法的作用：
    1.创建一个FileReader对象
    2.会把FileReader对象只想要读取的文件

*/
public class StreamDemo8 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/home/jikaigg/git/JavaBase/README.md");
        int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char)len);
        }
        /*char[] cs = new char[1024];
        int len = 0;
        while ((len = fr.read(cs)) != -1) {
            System.out.println(new String(cs,0,len));
        }*/
        fr.close();
    }
}
