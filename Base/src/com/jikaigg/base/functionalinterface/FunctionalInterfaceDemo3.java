package com.jikaigg.base.functionalinterface;

public class FunctionalInterfaceDemo3 {
    public static void log(int level, String msg) {
        if (level == 1) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        String msg1 = "yaojikai";
        String msg2 = "ai";
        String msg3 = "shimengyu";
        log(1, msg1 + msg2 + msg3);
    }
}
