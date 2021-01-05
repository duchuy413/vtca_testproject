package com.company.homework;

import com.company.util.ConsoleUtil;

public class Homework_3_3 {
    public static void main(String[] args) {
        int AMOUNT = 4;

        int[] a = new int[AMOUNT];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            a[i] = ConsoleUtil.inputInt("a" + i);

            if (a[i] > max){
                max = a[i];
            }
            if (a[i]< min){
                min = a[i];
            }
        }

        System.out.println("So nho nhat la: " + min);
        System.out.println("So lon nhat la: " + max);
    }
}
