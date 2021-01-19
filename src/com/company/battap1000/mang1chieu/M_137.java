package com.company.battap1000.mang1chieu;

import com.company.util.ConsoleUtil;

public class M_137 {
    public static void main(String[] args) {
        float[] a = ConsoleUtil.inputArrayFloat("a");
        ConsoleUtil.print(a, "a");
        System.out.println("Vi tri ma tai do gia tri nho nhat: ");
        int minIndex = 0;
        for (int i = a.length -1; i>=0; i--) {
            if (a[i] < a[minIndex]){
                minIndex = i;
            }
        }

        System.out.println("Ket qua: index = " + minIndex);
    }
}
