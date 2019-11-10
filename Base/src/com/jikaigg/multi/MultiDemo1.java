package com.jikaigg.multi;

/*
 * 代码当中体现多态性，其实就是一句话：父类引用只想子类对象
 * 格式：
 * 父类名称 对象名 = new 子类名称();
 * 或者：
 * 接口名称 对象名 = new 实现类名称();
 * 左父右子就是多态
 *
 * 在多态的代码中，成员方法的访问规则是：看new的是谁，就有限用水，没有则向上找
 * 编译看左边，运行看右边
 *
 * 对比一下：
 * 成员变量，编译看左边，运行还看左边
 * 成员方法，编译看左边，运行还看右边
 * */
public class MultiDemo1 {
    public static void main(String[] args) {

        Fu ff = new Zi();
        ff.method();
        ff.methodFu();
        // 编译看左边，左边是Fu，Fu当中没有methodZi方法，所以编译报错。
        // ff.methodZi();  // 错误写法


        /*Zi zz = new (Zi)Fu();
        zz.method();*/
    }
}
