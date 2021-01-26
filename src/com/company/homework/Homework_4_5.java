package com.company.homework;

import com.company.util.ConsoleUtil;

public class Homework_4_5 {

    public static void main(String[] args) {
        int n = ConsoleUtil.inputInt("n");
        int remain = n;
        int endNumber = 0;
        int sum = 0;

        while (remain > 0){
            endNumber = remain % 10;
            remain = remain / 10;
            System.out.println("Add end number: " + endNumber);
            sum += endNumber;
        }

        System.out.println("SUM IS: " + sum);
    }
}
