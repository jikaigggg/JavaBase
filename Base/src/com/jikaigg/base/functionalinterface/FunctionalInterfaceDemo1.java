package com.jikaigg.base.functionalinterface;
/*
函数式接口：有且只有一个抽象方法的接口
当然及口中可以包含其他的方法(默认方法，静态方法，私有方法)
*/

/*
注解解释：
    @FunctionalInterface
    作用：
        可以检测接口是否是一个函数式接口
        如果是，编译成功
        如果否，编译失败（接口中没有抽象方法；抽象方法的个数大于1个）
*/
@FunctionalInterface
public interface FunctionalInterfaceDemo1 {
    // 定义一个抽象方法
    public abstract void method();
}
