package com.jikaigg.base.innerclass;

/*
如果是接口的实现类（或者是父类的子类）只需要使用唯一的一次
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】

匿名内部类的定义格式：
    接口名称 对象名 = new 接口名称(){
        // 覆盖重写所有的抽象方法
    };

对格式“new 接口名称（）{...}”进行解析：
    1.new 代表创建对象的动作
    2.接口名称就是匿名内部类需要实现那个接口
    3.{...} 这才是匿名内部类的内容

另外还要注意几点问题：
    1.匿名内部类，在创建对象的时候，只能使用唯一一次；如果希望多次创建对象，而且类的内容一样的话，那么就必须单独使用实现类了
    2.匿名对象，在调用方法的时候，只能调用唯一一次，如果希望同一个对象，调用多次方法，那么必须给对象取个名字
    3.匿名内部类是省略了【实现类/子类】，匿名对象是省略了【对象名称】
强调：匿名内部类和匿名对象不是一回事
 */
public class InnerClassDemo2 {
    public static void main(String[] args) {
        // MyInterfaceImpl impl = new MyInterfaceImpl();
        MyInterface impl = new MyInterfaceImpl();
        impl.method();
        /*MyInterface in = new MyInterface(){
            @Override
            public void method() {
                System.out.println("jikaigg!!!");
            }
        };
        in.method();*/

    }
}
