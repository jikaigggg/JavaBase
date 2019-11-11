package com.jikaigg.array;

/*
  使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值，规则如下
  如果是整数类型，那么默认为0
  如果是浮点类型，那么默认为0.0
  如果是字符类型，那么默认为'\u0000'
  如果是布尔类型，那么默认为false
  如果是引用类型，那么默认为null

  注意事项：
    静态初始化其实也有默认值的过程，只不过系统自动马上将默认值替换成为了大括号当中的具体数值
*/
public class ArrayDemo3 {
    public static void main(String[] args) {
        // 动态初始化一个数组
        int[] arrayA = new int[3];

        System.out.println(arrayA);  //内存地址值
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

        // 将整数333赋值给数组索引值为0的元素
        arrayA[0] = 333;
        System.out.println(arrayA[0]);
    }
}
