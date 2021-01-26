package com.company.homework;

import com.company.util.ConsoleUtil;

import java.util.ArrayList;
import java.util.List;

public class Homework_5_1 {
    public static void main(String[] args) {
        int n = 10;
        int[] a = ConsoleUtil.inputArrayInt("a");

        for (int i = 0; i < n; i+=2) {
            System.out.println(a[i]);
        }
    }
}
