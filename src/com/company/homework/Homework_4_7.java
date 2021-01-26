package com.company.homework;

import com.company.util.ConsoleUtil;

import java.util.HashSet;
import java.util.Set;

public class Homework_4_7 {
    public static void main(String[] args) {
        int MAX_SEARCH_RANGE = 10000;
        int n = ConsoleUtil.inputInt("n");

        Set<Integer> composites = new HashSet<Integer>();
        Set<Integer> primes = new HashSet<Integer>();

        for (int i = 2; i < MAX_SEARCH_RANGE; i++) {
            if (composites.contains(i)) {
                continue;
            }else{
                primes.add(i);
                int factor = 2;
                int composite = 0;
                while(true) {
                    composite = factor * i;
                    if (composite > MAX_SEARCH_RANGE) {
                        break;
                    }
                    composites.add(composite);
                    factor++;
                }
            }
        }

        int count = 0;
        int checkNumber = 2;
        while (count != n){
            if (primes.contains(checkNumber)){
                System.out.println(checkNumber);
                count++;
            }
            checkNumber++;
        }
    }
}
