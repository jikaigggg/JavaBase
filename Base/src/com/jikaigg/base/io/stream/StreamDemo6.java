package com.jikaigg.base.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件复制
*/
public class StreamDemo6 {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\JAVA\\1.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\githuby\\2.jpg",true);
        int len = 0;
        // 使用字节数组读多个字节，写多个字节
        byte[] b = new byte[1024];
        while((len = fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        long e = System.currentTimeMillis();
        System.out.println("本次程序执行共耗时"+(e-s)+"毫秒");
        // 释放资源，先关写的，再管读的；如果写完了肯定就读取完了，读完了不一定写完了
        fos.close();
        fis.close();
        System.out.println("本次程序执行共耗时"+(e-s)+"毫秒");
    }
}
