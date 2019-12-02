package com.jikaigg.base.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
追加写，续写
换行
*/
public class StreamDemo3 {
    public static void main(String[] args) throws IOException {
        // append = true不会覆盖源文件，会在文件后面追加写，续写；append = false会覆盖源文件
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\a.txt",true);
        // 换行，windows的\r\n,Linux的\n,mac的\r
        String s1 = "yaojikai\r\n";
        fos.write(s1.getBytes());
        String s2 = "yaojikai";
        fos.write(s2.getBytes());
        fos.close();
    }
}
