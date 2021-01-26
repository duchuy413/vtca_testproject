package com.company.homework;

import com.company.util.ConsoleUtil;

public class Homework_6_1 {
    public static void main(String[] args) {
        float a,b,c;
        a = ConsoleUtil.inputFloat("a");
        b = ConsoleUtil.inputFloat("b");
        c = ConsoleUtil.inputFloat("c");

        solve(a,b,c);
    }

    public static void solve(float a, float b, float c){
        float delta = (b*b - 4*a*c);

        if (delta<0){
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0){
            float x = (-b)/(2*a);
            System.out.println("Phuong trinh co nghiem kep x = " + x);
        } else {
            float x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
            float x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
            System.out.println("Phuong trinh co 2 nghiem: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
