package com.jikaigg.base.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class DoudizhuDemo1 {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] num = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        poker.add("大王");
        poker.add("小王");
        for (String color : colors) {
            for (String s : num) {
                poker.add(color + s);
            }
        }
//        System.out.println(poker);
        Collections.shuffle(poker);
        System.out.println(poker);

        ArrayList<String> user1 = new ArrayList<>();
        ArrayList<String> user2 = new ArrayList<>();
        ArrayList<String> user3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();


        for (int i = 0; i < poker.size(); i++) {
            if (i > 50) {
                dipai.add(poker.get(i));
            } else if (i % 3 == 0) {
                user1.add(poker.get(i));
            } else if (i % 3 == 1) {
                user2.add(poker.get(i));
            } else if (i % 3 == 2) {
                user3.add(poker.get(i));
            }
        }
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(dipai);
    }
}
