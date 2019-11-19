package com.jikaigg.base.collection.set;
/*
可变參數：
使用前提：
    当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
使用格式：
    修饰符 返回值类型 方法名(数据类型...变量名){}
可变参数的原理：
    可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
    传递的参数个数，可以是0个(不传递)
注意事项：
    一个方法的参数列表，只能有一个可变参数
    如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
可变参数的特殊写法：
    Object...obj
*/
public class VarArgsDemo1 {
    public static void main(String[] args) {
        addTwo();
    }
    // 定义一个方法，计算两个int类型整数的和
    public static int addTwo(int...arr){
        System.out.println(arr);
        return 0;
    }
}
