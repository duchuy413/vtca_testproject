package com.company.battap1000.canban;

import com.company.util.ConsoleUtil;

import java.lang.reflect.Array;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Canban_01 {

    public static void main(String[] args) {
        int input = ConsoleUtil.inputInt("n");
        final int n = input;

        System.out.println("s1 = " + calculateSum(n, i -> i));
        System.out.println("s2 = " + calculateSum(n, i -> i*i));
        System.out.println("s3 = " + calculateSum(n, i -> 1/i));
        System.out.println("s4 = " + calculateSum(n, i -> 1/(2*i)));
        System.out.println("s5 = " + calculateSum(n, i -> 1/(2*i+1)));
        System.out.println("s6 = " + calculateSum(n, i -> 1/(i*(i+1))));
        System.out.println("s7 = " + calculateSum(n, i -> i/(i+1)));
        System.out.println("s8 = " + 1/2 + calculateSum(n, i -> (2*i + 1)/(2*i + 2)));

        System.out.println("s9 = " + calculateMultiplication(n, i -> i));
        System.out.println("s10 = " + calculateMultiplication(n, i -> n));

        System.out.println("s11 = " + (int)calculateSum(n, i->{
            float item = 1;
            for (int j = 1; j <= i; j++) {
                item *= j;
            }
            return item;
        }));
    }

    public static float calculateSum(int n, Function<Float,Float> formula){
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s += formula.apply((float)i);
        }
        return s;
    }

    public static int calculateMultiplication(int n, Function<Integer,Integer> formula){
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s *= formula.apply(i);
//            System.out.println("s *=" + formula.apply(i));
        }
        return s;
    }
}
