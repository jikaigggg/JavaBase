package com.jikaigg.base.multi.multidemo1;
/*
 1.对象的向上转型，其实就是多态写法：
   格式：
       父类名称 对象名 = new 子类名称();
   含义：右侧创建一个子类对象，把它当做父类来看待使用
   注意事项：向上转型一定是安全的，从小范围转向了大范围。

 弊端：
   对象一旦向上转型为父类，那么就无法调用子类原本的特有的内容。
 解决方案：
   用对象的向下转型【还原】

 2.对象的向下转型，其实就是一个【还原】的动作
   格式：
       子类名称 对象名 = （子类名称）父类对象；
   含义：将父类对象，【还原】成为本来的子类对象

 如何才能知道一个父类对象引用的对象，本来是什么子类？
 格式：
 对象 instanceof 类名称
 这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。
*/
public class demo1 {
    public static void main(String[] args) {
        // 对象的向上转型，就是：父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();

        // 如果希望调用子类特有方法，需要向下转型
        // 判断一下父类引用本来是不是某个子类
        Animal aa = new Cat();
        if (animal instanceof Dog){
            Dog d = (Dog)animal;
            d.watchHouse();
        }
        if (animal instanceof Cat){
            Cat c = (Cat)animal;
            c.catchMouse();
        }
    }
}
