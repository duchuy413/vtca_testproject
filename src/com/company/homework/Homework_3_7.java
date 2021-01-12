package com.company.homework;

import com.company.util.ConsoleUtil;
import org.w3c.dom.ls.LSOutput;

public class Homework_3_7 {
    public static void main(String[] args) {
        String[] menu = new String[]{"con ga","con heo", "con chuot", " con trau"};
        System.out.println("--------MENU----------");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + "." + menu[i]);
        }
        int i = ConsoleUtil.inputInt("so thu tu");
        if (i <= menu.length && i > 0){
            System.out.println("Ban da chon " + menu[i - 1]);
        }
    }
}
