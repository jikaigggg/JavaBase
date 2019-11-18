package com.jikaigg.base.autobox;

public class AutoBoxDemo1 {
    public static void main(String[] args) {
        /*
        包装类  ->  基本数据类型
        Character  char
        Byte       byte
        Short      short
        Integer    int
        Long       long
        Boolean    bool
        Float      float
        Double     double
        */
        char ch1 = 'y';
        System.out.println(ch1);
        Character ch2 = 'j';
        System.out.println(ch2);
        System.out.println(ch2.getClass().toString());
        System.out.println(ch2.getClass().getTypeName());
        short a = 1;
        a += 1;
        float f = Float.NaN;
        System.out.println(f);
    }
}
