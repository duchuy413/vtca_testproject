package com.company.homework;

import com.company.util.ConsoleUtil;

public class Homework_3_6 {
    public static void main(String[] args) {
        while(true) {
            char a = ConsoleUtil.inputChar("mot ky tu");
            System.out.println((int) a);
            if ((a >= 65 && a <= 122)) {
                System.out.println("La mot ky tu");
                if (a == 'a' || a == 'e' || a == 'o' || a == 'u' || a == 'i') {
                    System.out.println("La mot nguyen am");
                } else {
                    System.out.println("La mot phu am");
                }
            } else {
                System.out.println("Khong phai la ky tu");
            }

            if (a == '0') {
                break;
            }
        }
    }
}
