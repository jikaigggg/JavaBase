package com.jikaigg.base.arraylist;

/*
  用一个大集合存入20个随机数组，然后筛选其中的偶数元素，放到小集合当中
*/

import java.util.ArrayList;

public class ArrayLIstDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> aa22 = new ArrayList<>();
        aa22.add(45);
        aa22.add(54);
        aa22.add(55);
        aa22.add(22);
        aa22.add(0);
        System.out.println(twoNum(aa22).toString());
    }

    public static ArrayList<Integer> twoNum(ArrayList<Integer> arr) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                ar.add(arr.get(i));
            }
        }
        return ar;
    }


}
