package com.jikaigg.base.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
一些写入多个字节
*/
public class StreamDemo2 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos1 = new FileOutputStream("D:\\JAVA\\a.txt");
        byte[] b = {48,49,50,51,52,53,54,55};
        //public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
        fos1.write(b);
        fos1.close();

        //public void write(byte[] b, int off, int len) ：从指定的字节数组写入len字节，从偏移量off开始输出到此输出流。
        FileOutputStream fos2 = new FileOutputStream("D:\\JAVA\\b.txt");
        fos2.write(b,2,3);
        fos2.close();
        /*
        写入子符
        */
        FileOutputStream fos3 = new FileOutputStream("D:\\JAVA\\c.txt");
        String s = "helloworld";
        fos3.write(s.getBytes());
        fos3.close();
    }
}
