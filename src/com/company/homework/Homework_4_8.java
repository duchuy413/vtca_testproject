package com.company.homework;

import com.company.util.ConsoleUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework_4_8 {
    public static void main(String[] args) {
        int n = ConsoleUtil.inputInt("n");
        int remain = n;
        int endNumber = 0;

        List<Integer> result = new ArrayList<Integer>();
        while (remain > 0){
            endNumber = remain % 2;
            remain = remain / 2;
            result.add(endNumber);
        }

        System.out.println("Ket qua: ");
        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i));
        }
    }
}
