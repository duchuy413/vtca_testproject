package com.company.battap1000.mang1chieu;

import com.company.util.ConsoleUtil;

public class M_132 {
    public static void main(String[] args) {
        int[] a = ConsoleUtil.inputArrayInt("a");
        ConsoleUtil.print(a, "a");
        System.out.println("Cac gia tri chan trong mang la: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] %2 == 0){
                System.out.println(a[i]);
            }
        }
    }
}
