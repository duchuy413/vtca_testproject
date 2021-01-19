package com.company.battap1000.mang1chieu;

import com.company.util.ConsoleUtil;

public class M_139
{
    public static boolean isPerfectNumber(int n){
        int sum = 0;
        for (int i = 0; i < n/2; i++) {
            if(n%i==0){
                sum+=i;
            }
        }

        if (sum == n){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = ConsoleUtil.inputInt("n");

        if (isPerfectNumber(n)){
            System.out.println("n la so hoan hao");
        } else{
            System.out.println("n khong phai so hoan hao");
        }
    }
}
