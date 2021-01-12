package com.company.util;

import java.util.Scanner;

public class ConsoleUtil {
    static Scanner input = new Scanner(System.in);

    public static int inputInt(String varName) {
        System.out.println("Nhap vao "+varName+": ");
        return input.nextInt();
    }

    public static float inputFloat(String varName) {
        System.out.println("Nhap vao "+varName+": ");
        return input.nextFloat();
    }

    public static char inputChar(String varName) {
        System.out.println("Nhap vao "+varName+": ");
        return input.next().charAt(0);
    }

    public static String inputString(String varName) {
        System.out.println("Nhap vao "+varName+": ");
        return input.nextLine();
    }
}
