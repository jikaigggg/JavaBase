package com.jikaigg.base.functionalinterface;

/*
函数式接口的使用：一般可以作为方法的参数和返回值类型
*/
public class FunctionalInterfaceDemo2 {
    public static void show(FunctionalInterfaceDemo1 in) {
        in.method();
    }

    public static void main(String[] args) {
        // 调用show方法，方法的参数是一个接口，所以可以传递接口的匿名内部类
        show(new FunctionalInterfaceDemo1() {

            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        });
        // 调用show方法，方法的参数是一个函数式接口，所以可以使用lambda表达式
        show(() -> {
            System.out.println("lambda");
        });
    }
}
