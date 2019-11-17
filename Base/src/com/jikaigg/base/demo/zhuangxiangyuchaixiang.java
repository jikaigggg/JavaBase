package com.jikaigg.base.demo;

public class zhuangxiangyuchaixiang {
    public static void main(String[] args) {
        // 装箱：把基本类型的数据，包装到包装类中（基本类型的数据->爆炸UN各类）
        // 构造方法
        Integer i1 = new Integer(1);
        System.out.println("i1:" + i1);
        Integer i2 = new Integer("2");
        System.out.println("i2:" + i2);

        // 静态方法
        Integer i3 = Integer.valueOf(3);
        System.out.println("i3:" + i3);
        Integer i4 = Integer.valueOf("4");
        System.out.println("i4:" + i4);

        // Integer i4 = Integer.valueOf("a");  // NumberFormatException数字格式化异常

        // 拆箱：在包装类中取出基本类型的数据（包装类->基本类型的数据）
        int i = i1.intValue();
        System.out.println("i:" + i);

        // 自动装箱与自动拆箱：基本类型的数据和包装类之间可以自动的相互转换
        // 直接把int类型的整数赋值给包装类
        Integer i5= 1;

        //自动拆箱：i5是包装类，无法直接参与运算，可以自动转换为基本数据类型，在进行计算
        i5= i5+3;
        System.out.println("i5:"+i5);

        /*
        基本类型与字符串之间的相互转换
        基本类型->字符串（String）
            1.基本类型的值+""最简单的方法（工作中常用）
            2.包装类的静态方法toString(参数)，不是Object类中的toString重载
            3.String类的静态方法valueOf(参数);
        字符串（String）->基本数据类型：
            使用包装类的静态方法：parseXXX("数值类型的字符串");

         */

    }


}
