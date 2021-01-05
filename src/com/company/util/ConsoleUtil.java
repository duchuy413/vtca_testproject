package com.company.util;

import java.util.Scanner;

public class ConsoleUtil {
    static Scanner input = new Scanner(System.in);

    public static int inputInt(String varName) {
        System.out.println("Nhap vao "+varName+": ");
        int result = input.nextInt();
        return result;
    }

    public static float inputFloat(String varName) {
        System.out.println("Nhap vao "+varName+": ");
        float result = input.nextFloat();
        return result;
    }
}
