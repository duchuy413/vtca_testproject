package com.company.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {
    static Scanner input = new Scanner(System.in);
    private static String varName;

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

    public static int[] inputArrayInt(String varName){
        ConsoleUtil.varName = varName;
        System.out.println("Nhap vao so phan tu cua "+varName+": ");
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + (i+1));
           a[i] = input.nextInt();
        }
        return a;
    }

    public static List<Integer> inputListInt(String varName){
        System.out.println("Nhap vao so phan tu cua "+varName+": ");
        int n = input.nextInt();
        var a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + (i+1));
            a.add(input.nextInt());
        }
        return a;
    }

    public static float[] inputArrayFloat(String varName){
        System.out.println("Nhap vao so phan tu cua "+varName+": ");
        int n = input.nextInt();
        float[] a = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + (i+1));
            a[i] = input.nextFloat();
        }
        return a;
    }

    public static List<Float> inputListFloat(String varName){
        System.out.println("Nhap vao so phan tu cua "+varName+": ");
        int n = input.nextInt();
        var a = new ArrayList<Float>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + (i+1));
            a.add(input.nextFloat());
        }
        return a;
    }

    public static void print(int[] a, String varName){
        System.out.println("Thong tin ve mang "+varName+" da nhap: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void print(float[] a, String varName){
        System.out.println("Thong tin ve mang "+varName+" da nhap: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
