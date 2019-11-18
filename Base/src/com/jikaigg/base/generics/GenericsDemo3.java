package com.jikaigg.base.generics;

public class GenericsDemo3 {
    public static void main(String[] args) {
        // GenericsDemo02的测试
        GenericsDemo2 gc = new GenericsDemo2();
        gc.setName(123);
        Object name = gc.getName();
        System.out.println(name);

        // GenericsDemo02的测试
        GenericsDemo4 gc4 = new GenericsDemo4();
        gc4.method("yaojikai");

        // 静态方法，不建议创建对象使用
        gc4.method1(2);
        // 静态方法，通过类名.方法名（参数）直接调用
        GenericsDemo4.method1("lala");
    }
}
