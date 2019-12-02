package com.jikaigg.base.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
java.io.OutputStream 抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。它定义了字节输出流的基本共性功能方法。
    public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
    public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出。
    public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
    public void write(byte[] b, int off, int len) ：从指定的字节数组写入len字节，从偏移量off开始输出到此输出流。
    public abstract void write(int b) ：将指定的字节输出流。

FileOutputStream  作用：吧内存中的数据写入到硬盘文件中
构造方法
    public FileOutputStream(File file) ：创建文件输出流以写入由指定的 File对象表示的文件。
    public FileOutputStream(String name) ： 创建文件输出流以指定的名称写入文件。

由内存写入因胖，写入数据的原理：
    java程序-->JVM -->OS-->OS调用写数据的方法-->把数据写入到文件中

字节输出流的使用步骤（重点）：
    1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
    2.调用FileOutputStream对象中的方法write，吧数据写入到文件中
    3.释放资源（流的使用会占用一定的内存，使用完毕要把内存清空，提高程序的效率）
*/

public class StreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\a.txt");

        // public abstract void write(int b) ：将指定的字节输出流。
        fos.write(52);

        fos.close();

    }
}
