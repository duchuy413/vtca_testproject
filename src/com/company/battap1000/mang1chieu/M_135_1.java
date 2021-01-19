package com.company.battap1000.mang1chieu;

import com.company.util.ConsoleUtil;

public class M_135_1 {
    public static void main(String[] args) {
        float[] a = ConsoleUtil.inputArrayFloat("a");
        ConsoleUtil.print(a, "a");
        System.out.println("Gia tri duong dau tien trong mang la: ");
        float positive = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0){
                positive = a[i];
                break;
            }
        }

        if (positive == -1){
            System.out.println("Khong co gia tri duong nao");
        } else {
            System.out.println("Gia tri duong dau tien la: " + positive);
        }
    }
}
