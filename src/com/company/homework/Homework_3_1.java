package com.company.homework;

import com.company.util.ConsoleUtil;

public class Homework_3_1 {

    public static void main(String[] args) {
        float a,b;
        a = ConsoleUtil.inputFloat("a");
        b = ConsoleUtil.inputFloat("b");
        if (b == 0){
            System.out.println("Error: divide by zero");
        } else {
            System.out.println("Gia tri a/b la: " + (a/b));
        }
    }
}
