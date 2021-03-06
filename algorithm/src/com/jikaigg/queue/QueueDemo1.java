package com.jikaigg.queue;

import java.util.Scanner;

public class QueueDemo1 {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        char key = ' ';//接受用户输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        //输出一个菜单
        while (loop){
            System.out.println("s(show)：显示队列");
            System.out.println("e(exit)：退出程序");
            System.out.println("a(add)：添加数据到队列");
            System.out.println("g(get)：从队列取出数据");
            System.out.println("h(head)：查看队列头的数据");
            key = scanner.next().charAt(0);//接受一个字符
            switch (key){
                case 's':
                    queue.show();
                    break;
                case 'a':
                    System.out.println("输出一个数");
                    int value = scanner.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = queue.getQueue();
                        System.out.println("取出的数据是"+res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = queue.headQueue();
                        System.out.println("队列头的数据是"+res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");
    }
}

// 使用数组模拟队列-编写一个ArrayQueue类
class ArrayQueue{
    private int maxSize; //表示数组的最大容量
    private int front; //队列头
    private int rear; //队列尾
    private int[] arr; //该数据用于存放数据，模拟队列

    // 创建队列的构造器
    public ArrayQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;  //指向队列头部，指向队列头的前一个位置
        rear = -1;   //指向队列尾，指向队列为的数据（就是队列最后一个数据）
    }

    // 判断队列是否满
    public boolean isFull(){
        return rear == maxSize-1;
    }

    // 判断队列是否为空
    public boolean isEmpty(){
        return rear == front;
    }

    //添加数据到队列
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列已满，不能加入数据!");
            return;
        }
        rear++;  //rear后移
        arr[rear] = n;
    }

    //获取队列的数据，数据出队列
    public int getQueue(){
        //判断是否为空
        if (isEmpty()){
            //抛异常
            throw new RuntimeException("队列为空，不能取数据");
        }
        front++;
        return arr[front];
    }

    //显示队列的所有数据
    public void show(){
        //遍历
        if (isEmpty()){
            System.out.println("队列为空");
            return;
        }
        for (int i = 0;i<arr.length;i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }

    }
    public int headQueue(){
        //判断
        if (isEmpty()){
            throw new RuntimeException("队列为空，没数据");
        }
        return arr[front+1];
    }
}