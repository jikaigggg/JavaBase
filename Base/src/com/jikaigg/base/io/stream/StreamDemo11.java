package com.jikaigg.base.io.stream;

import java.io.FileWriter;

public class StreamDemo11 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("/home/jikaigg/git/a.txt")){
            fw.write(99);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
