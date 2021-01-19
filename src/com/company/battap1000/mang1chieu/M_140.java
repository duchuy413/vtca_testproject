package com.company.battap1000.mang1chieu;

import com.company.util.ConsoleUtil;

public class M_140 {
    public static void main(String[] args) {
        int[] a = ConsoleUtil.inputArrayInt("a");
        ConsoleUtil.print(a, "a");
        System.out.println("Gia tri duong nho nhat la: ");

        int min = 0;
        boolean found = false;

        for (int i = a.length -1; i>=0; i--) {
            if (a[i] > 0 && a[i] <= a[min]){
                min = i;
                found = true;
            }
        }

        if (found){
            System.out.println("Gia tri duong nho nhat la " + a[min]+ " tai vi tri " + min);
        } else {
            System.out.println("Khong tim thay so duong nao");
        }
    }
}

