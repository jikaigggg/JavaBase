package com.jikaigg.base.generics;

public class GenericsDemo5Impl implements GenericsDemo5<String>{

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
