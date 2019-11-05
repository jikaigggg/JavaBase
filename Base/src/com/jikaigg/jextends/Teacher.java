package com.jikaigg.jextends;

// 定义了一个员工的子类，老师
public class Teacher extends Employee {
    // 检测下面的方法是不是覆盖重写，不写@override也可以覆盖重写，就是不能检测时定义了一个新的方法还是覆盖重写
    @Override
    public void method() {
        super.method();
    }
}
