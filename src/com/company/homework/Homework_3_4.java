package com.company.homework;

import com.company.util.ConsoleUtil;

public class Homework_3_4 {
    public static void main(String[] args) {
        float a,b,c;

        a = ConsoleUtil.inputFloat("a");
        b = ConsoleUtil.inputFloat("b");
        c = ConsoleUtil.inputFloat("c");

        if (a+b>c && b+c>a && c+a>b){
            System.out.println("La 3 canh cua 1 tam giac");
        } else {
            System.out.println("Khong phai 3 canh cua 1 tam giac");
        }
    }
}
