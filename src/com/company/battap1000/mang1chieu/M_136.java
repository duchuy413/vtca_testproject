package com.company.battap1000.mang1chieu;

import com.company.util.ConsoleUtil;

public class M_136 {
    public static void main(String[] args) {
        float[] a = ConsoleUtil.inputArrayFloat("a");
        ConsoleUtil.print(a, "a");
        System.out.println("So chan cuoi cung trong mang la: ");

        for (int i = a.length -1; i>=0; i--) {
            if (a[i] % 2== 0){
                System.out.println("Ket qua: " + a[i]);
                return;
            }
        }

        System.out.println("Ket qua: -1");
    }
}
