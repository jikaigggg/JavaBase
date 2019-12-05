package com.jikaigg.base.io.buffer;
/*
java.io.BufferedInpitStream extends InputSrteam
bufferedInputStream:字节缓冲输出流

继承自父类的成员方法：
    int read():从输入流中读取数据的下一个字节
    int read(byte[] b):从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
    void close():关闭此输入流并释放于该留关联的所有系统资源

构造方法：
    BufferedInputStream(InputStream in)：创建一个BufferedInputStream冰保存七参数，即输入流in，以便将来使用
    BufferedInputStream(InputStream in， int size)：创建具有指定缓冲区大小的BufferedInputStream并保存其参数，即输入流
    参数：
        InputStream in ： 字节输入流，可以传递FileInputStream，缓冲流会给FileInputStream增加一个缓冲区，提高FileInputStream的读取效率
使用步骤：
    1.创建FileInputStream对象，构造方法中要绑定读取的数据源
    2.创建BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream的读取效率
    3.使用BufferedInputStream对象中的方法read，读取文件
    4.释放资源

*/
public class BufferDemo2 {
    public static void main(String[] args) {

    }
}
