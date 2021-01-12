package com.company.homework;

import com.company.util.ConsoleUtil;

public class Homework_3_8 {

    public static void main(String[] args) {
        String[] menu = new String[]{"+","-", "x", "/"};
        float a = ConsoleUtil.inputFloat("so thu nhat");
        float b = ConsoleUtil.inputFloat("so thu hai");


        System.out.println("--------MENU----------");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + "." + menu[i]);
        }

        int i = ConsoleUtil.inputInt("phep toan");

        if (i==1){
            System.out.println("Ket qua la: " + (a+b));
        }
        else if (i==2){
            System.out.println("Ket qua la: " + (a-b));
        }
        else if (i==3){
            System.out.println("Ket qua la: " + (a*b));
        }
        else if (i==4){
            if (b==0){
                System.out.println("Khong duoc chia cho 0");
            } else {
                System.out.println("Ket qua la: " + (a/b));
            }
        }
    }
}
