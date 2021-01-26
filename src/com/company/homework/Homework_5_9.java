package com.company.homework;

import com.company.util.ConsoleUtil;

import java.util.Locale;

public class Homework_5_9 {

    class HocVien{
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;

        void input(){
            f1 = ConsoleUtil.inputFloat("diem mon CF");
            f2 = ConsoleUtil.inputFloat("diem mon C");
            f3 = ConsoleUtil.inputFloat("diem mon HDJ");
            f4 = ConsoleUtil.inputFloat("diem mon DW");
            f5 = ConsoleUtil.inputFloat("diem mon RDBMS");
            f6 = ConsoleUtil.inputFloat("diem mon Java");
        }

        float averagePoint(){
            return (f1 + f2 + f3 + f4 + f5 + f6)/6;
        }

        public String toString(){
            return f1 + " | " + f2 + " | " +f3 + " | " +f4 + " | " +f5 + " | " +f6 + " | " + averagePoint();
        }
    }

    public static void main(String[] args) {
        Homework_5_9 instance = new Homework_5_9();
        instance.runProgram();
    }

    public void runProgram(){
        int STUDENT_NUMBER = 5;
        HocVien[] a = new HocVien[STUDENT_NUMBER];

        for (int i = 0; i < STUDENT_NUMBER; i++) {
            System.out.println("Nhap vao thong tin hoc vien thu " + (i+1));
            a[i] = new HocVien();
            a[i].input();
        }

        System.out.println("Hoc vien  |  CF  |   C  |  HDJ |  DW  | RDBMS | Java | TB  ");
        for (int i = 0; i < STUDENT_NUMBER; i++) {
            System.out.println("HV " + (i + 1) + "      | " + a[i]);
        }
    }
}
