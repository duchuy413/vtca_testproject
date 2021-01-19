package com.company.battap1000.mang1chieu;

import com.company.util.ConsoleUtil;

public class M_134 {
    public static void main(String[] args) {
        int[] a = ConsoleUtil.inputArrayInt("a");
        ConsoleUtil.print(a, "a");

        float max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
            }
        }

        System.out.println("Gia tri lon nhat la: " + max);
    }
}
