package com.company.battap1000.mang1chieu;

import com.company.util.ConsoleUtil;

public class M_133 {
    public static void main(String[] args) {
        float[] a = ConsoleUtil.inputArrayFloat("a");
        ConsoleUtil.print(a, "a");
        System.out.println("Cac gia tri am trong mang la: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0){
                System.out.println(a[i]);
            }
        }
    }
}
