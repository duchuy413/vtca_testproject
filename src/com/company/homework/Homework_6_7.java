package com.company.homework;

import com.company.util.ConsoleUtil;

public class Homework_6_7 {
    public static void main(String[] args) {
        int choose;
        while(true){
            choose = inputMenu();
            if (choose != -1){
                break;
            }
        }
        System.out.println("Ban vua chon menu " + choose);
    }

    public static int inputMenu(){
        System.out.println("-----------------------");
        System.out.println("|      MENU            |");
        System.out.println("------------------------");
        System.out.println("| 1. Menu 1            |");
        System.out.println("| 2. Menu 2            |");
        System.out.println("| 3. Menu 3            |");
        System.out.println("| 4. Menu 4            |");
        System.out.println("| 5. Menu 5            |");
        System.out.println("------------------------");
        String s = ConsoleUtil.inputString("lua chon");
        if (!s.equals("1") && !s.equals("2") && !s.equals("3") && !s.equals("4")){
            return -1;
        }else {
            return Integer.parseInt(s);
        }
    }
}
