package com.company.homework;

import com.company.util.ConsoleUtil;

import javax.swing.*;

public class Homework_4_6 {

    public static void main(String[] args) {
        int n = ConsoleUtil.inputInt("n");
        int previous = 0;
        int current = 1;
        int count = 0;

        while (count != n){
            int sum = previous + current;
            previous = current;
            current = sum;
            System.out.println(previous);
            count++;
        }
    }
}
