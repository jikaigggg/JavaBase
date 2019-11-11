package com.jikaigg.base.jinterface;

public interface MyInterface {
    public abstract void add();

    public default void methodDefault1() {
        System.out.println("默认方法1");
    }
}
