package com.jikaigg.algorithm;

import java.util.ArrayList;

/*
    判断101-200之间有多少个素数，并输出所有素数。
*/
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for (int i = 101; i < 201; i++) {
            for (int j = 3; j < i; j++) {
                if(i%j==0){
                    break;
                }else {
                    arr.add(i);
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        System.out.println(arr);


    }
}
