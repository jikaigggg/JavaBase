package com.jikaigg.base.innerclass;

/*
如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类。
分类：
    1.成员内部类
    2.局部内部类（包含匿名内部类）

成员内部类的定义格式：
    修饰符 class 外部类名称{
        修饰符 class 内部类名称{

        }
    }

注意：
    内用外，可以随意访问；外用内，需要内部类对象。
-------------------------------------------
如何使用成员内部类，两种方式
    1.间接方式：在外部类的方法当中，使用内部类，然后main只是调用外部类的方法
    2.直接方式：公式：
    类名称 对象名 = new 类名称();
    【外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();】
如果一个类是定义在一个方法内部的，那么这就是一个局部内部类
“局部”：只有当前所属的方法才能使用它，出现这个方法外面就不能用了
定义格式：
    修饰符 class 外部类名称{
        修饰符 返回值类型 外部类方法名称（参数列表）{
            class 局部内部类名称{
                //...
            }
        }
    }
小结一下类的权限修饰符：
定义一个类的时候，权限修饰符规则：
1.内部类：public / （default）
2.成员内部类：public / protected / （default） / private
3.局部内部类：什么都不能写
*/
public class InnerClassDemo1 {  // 外部类

    public class Heart {  // 成员内部类
        // 内部类的方法
        public void beat() {
            System.out.println("内部类的方法！！！");
            System.out.println("我叫" + name);
        }
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 外部类的方法
    public void methodBody() {
        System.out.println("外部类的方法！！");
    }
}
