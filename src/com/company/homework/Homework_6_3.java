package com.company.homework;

import com.company.util.ConsoleUtil;
import com.company.util.NumberUtil;

import java.util.List;

public class Homework_6_3 {
    public static void main(String[] args) {
        int n = ConsoleUtil.inputInt("n");
        List<Integer> fibo = NumberUtil.getFibonaciList(n);
        System.out.println("So Fibonaci thu n la: " + fibo.get(n-1));
    }
}
