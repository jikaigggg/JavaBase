package com.jikaigg.base.io.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/*
字节输入流一次读取多个字节
    方法的参数，byte
        起到缓冲作用，存储每次读取到的多个字节
        数组的长度一般定义为1024（1kb）或者1024的整数倍
    方法的返回值，int
        每次读取的有效字节个数
*/
public class StreamDemo5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\JAVA\\a.txt");
        // public int read(byte[] b) ： 从输入流中读取一些字节数，并将它们存储到字节数组b中。
        byte[] b = new byte[10];
        int i = fis.read(b);
        System.out.println(i);
        System.out.println(Arrays.toString(b));
        fis.close();
    }
}
