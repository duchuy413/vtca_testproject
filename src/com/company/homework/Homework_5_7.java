package com.company.homework;

import com.company.util.ConsoleUtil;
import com.company.util.NumberUtil;

import java.util.Set;

public class Homework_5_7 {
    public static void main(String[] args) {
        int[] a = new int[5];

        Set<Integer> primes = NumberUtil.getPrimeNumberSet();
        int count = 0;
        int n = 0;
        while (count<5){
            n = ConsoleUtil.inputInt("n");
            if (!primes.contains(n)){
                System.out.println(n + " khong phai la so nguyen to");
                continue;
            }
            a[count] = n;
            System.out.println("Da nhap so nguyen to " + n);
            count++;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
