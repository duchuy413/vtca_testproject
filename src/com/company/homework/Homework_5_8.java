package com.company.homework;

import com.company.util.ConsoleUtil;
import java.util.Locale;

public class Homework_5_8 {
    public static void main(String[] args) {
        char[] a = new char[10];

        int index = 0;

        while (index < a.length){
            a[index] = ConsoleUtil.inputChar("a["+index+"] = ");
            if (a[index] >= 65 && a[index] <= 122){
                index++;
            } else {
                System.out.println("Phai nhap mot ky tu");
            }
        }

        String result = new String(a);
        System.out.println(result.toUpperCase(Locale.ROOT));
    }
}
