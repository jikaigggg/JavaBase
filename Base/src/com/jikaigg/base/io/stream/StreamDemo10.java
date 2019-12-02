package com.jikaigg.base.io.stream;

import java.io.FileWriter;
import java.io.IOException;

public class StreamDemo10 {
    public static void main(String[] args) {
        // 提高变量fw的作用域，让finally可以使用
        FileWriter fw = null;
        try{
            fw = new FileWriter("/home/jikaigg/git/b.txt");
            char[] b = {97,98,99};
            fw.write(b);
        }catch(Exception e){
            System.out.println(e);
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
