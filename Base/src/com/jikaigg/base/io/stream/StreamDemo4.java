package com.jikaigg.base.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
java.io.InputStream 抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。它定义了字节输入流的基本共性功能方法。
    public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
    public abstract int read() ： 从输入流读取数据的下一个字节。
    public int read(byte[] b) ： 从输入流中读取一些字节数，并将它们存储到字节数组b中。
*/
public class StreamDemo4 {
    public static void main(String[] args) throws IOException {
        // 创建文件输入流对象
        FileInputStream fis = new FileInputStream("D:\\JAVA\\a.txt");
        /*
        循环读取
            1.定义一个变量len用来接收read读取出来的字节
            2.判断变量len是否等于-1
        注意：如果写成while（fis.read()!=-1）{sout(fis.read());}时，判断完指针向后移一位，sout是指针向后移一位，这样读取到的数据是不连续的不全的！！！！
        */
        int len = 0;
        // 读取一个字节并返回，读取到文件末尾，返回-1
        while ((len = fis.read()) != -1){
            System.out.println(len);
        }
        fis.close();
    }
}
