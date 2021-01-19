package com.company.battap1000.mang1chieu;

import com.company.util.ConsoleUtil;

public class M_138 {
    public static void main(String[] args) {
        int[] a = ConsoleUtil.inputArrayInt("a");
        ConsoleUtil.print(a, "a");
        System.out.println("Gia tri chan dau tien trong mang la: ");

        for (int i = a.length -1; i>=0; i--) {
            if (a[i] % 2 == 0){
                System.out.println(a[i]);
                return;
            }
        }

        System.out.println("Khong tim thay");
    }


}
