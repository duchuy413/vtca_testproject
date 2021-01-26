package com.company.homework;

import com.company.util.ConsoleUtil;

public class Homework_6_2 {
    public static void main(String[] args) {
        int a = ConsoleUtil.inputInt("a");
        int n = ConsoleUtil.inputInt("n");
        System.out.println("Ket qua: " + power(a,n));
    }

    public static int power(int a, int n){
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }
}
